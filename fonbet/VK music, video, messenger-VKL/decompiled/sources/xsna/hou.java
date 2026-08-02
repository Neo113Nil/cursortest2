package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.notifications.NotificationItem;
import com.vk.lists.ListDataSet;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.notifications.NotificationClickHandlerImpl;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.ai70;
import xsna.awu;
import xsna.ikv0;

/* compiled from: GroupedNotificationsAdapter.kt */
/* loaded from: classes4.dex */
public final class hou extends iwu<NotificationItem> implements bj70 {
    public final io.reactivex.rxjava3.disposables.b j;
    public final WeakReference<Activity> k;
    public os8 l;
    public GroupedNotificationsFragment.c m;
    public final ArrayList<NotificationItem> n;
    public final cwm o;
    public NotificationClickHandlerImpl p;
    public int q;
    public int r;

    /* compiled from: GroupedNotificationsAdapter.kt */
    public final class a extends b {
        public a() {
        }

        @Override // xsna.awu.b
        public final void b(RecyclerView.e0 e0Var) {
            ((TextView) ((xwu) e0Var).itemView).setText(R.string.new_replies);
        }

        @Override // xsna.awu.b
        public final boolean e(NotificationItem notificationItem) {
            NotificationItem notificationItem2 = notificationItem;
            int i = hou.this.r;
            return (i == -1 || notificationItem2 == null || notificationItem2.c <= i) ? false : true;
        }

        @Override // xsna.awu.b
        public final /* bridge */ /* synthetic */ boolean f(int i, Object obj, Object obj2) {
            return false;
        }
    }

    /* compiled from: GroupedNotificationsAdapter.kt */
    public abstract class b extends awu.b<NotificationItem> {
        @Override // xsna.awu.b
        public final int a() {
            return 40621;
        }

        @Override // xsna.awu.b
        public final RecyclerView.e0 c(ViewGroup viewGroup) {
            return new xwu(tf3.b(viewGroup, R.layout.vk_holder_header, viewGroup, false));
        }

        @Override // xsna.awu.b
        public final /* bridge */ /* synthetic */ boolean d(NotificationItem notificationItem) {
            return false;
        }
    }

    /* compiled from: GroupedNotificationsAdapter.kt */
    public final class c extends b {
        public c() {
        }

        @Override // xsna.awu.b
        public final void b(RecyclerView.e0 e0Var) {
            ((TextView) ((xwu) e0Var).itemView).setText(R.string.not_viewed);
        }

        @Override // xsna.awu.b
        public final boolean e(NotificationItem notificationItem) {
            NotificationItem notificationItem2 = notificationItem;
            int i = hou.this.r;
            return (i == -1 || notificationItem2 == null || notificationItem2.c > i) ? false : true;
        }

        @Override // xsna.awu.b
        public final boolean f(int i, Object obj, Object obj2) {
            NotificationItem notificationItem = (NotificationItem) obj;
            NotificationItem notificationItem2 = (NotificationItem) obj2;
            int i2 = hou.this.r;
            return (i2 == -1 || notificationItem == null || notificationItem.c <= i2 || notificationItem2 == null || notificationItem2.c > i2) ? false : true;
        }
    }

    public hou(FragmentActivity fragmentActivity, io.reactivex.rxjava3.disposables.b bVar) {
        super(0);
        this.j = bVar;
        this.k = new WeakReference<>(fragmentActivity);
        this.n = new ArrayList<>();
        a aVar = new a();
        c cVar = new c();
        ai70.a aVar2 = new ai70.a(fragmentActivity);
        cwm cwmVar = new cwm();
        cwmVar.b = new ArrayList();
        cwmVar.c = aVar2;
        this.o = cwmVar;
        this.r = -1;
        K0(aVar);
        K0(cVar);
    }

    @Override // xsna.bj70
    public final void C(JSONObject jSONObject, NotificationItem notificationItem) {
        NotificationItem notificationItem2;
        String optString;
        Activity activity;
        ArrayList<NotificationItem> arrayList = this.n;
        Iterator<NotificationItem> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().zb(notificationItem)) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i;
        if (i2 < 0 || (notificationItem2 = (NotificationItem) j5g.b0(i2, arrayList)) == null) {
            return;
        }
        arrayList.remove(i2);
        if (jSONObject != null && (optString = jSONObject.optString("snackbar_text", null)) != null && (activity = this.k.get()) != null) {
            ikv0.a aVar = new ikv0.a(activity);
            aVar.u = new ikv0.d(optString, (String) null, (ikv0.d.a) null, 6);
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, activity.getString(R.string.cancel), new com.vk.im.engine.internal.storage.delegates.dialogs.a(i2, 1, this, jSONObject, notificationItem2));
            aVar.n();
        }
        W0();
    }

    @Override // xsna.awu
    public final int N0(int i) {
        return 0;
    }

    @Override // xsna.awu
    public final void O0(RecyclerView.e0 e0Var, int i) {
        ((ka70) e0Var).W5((NotificationItem) this.c.c(i));
    }

    @Override // xsna.awu
    public final RecyclerView.e0 P0(int i, ViewGroup viewGroup) {
        ka70 ka70Var = new ka70(viewGroup.getContext(), this, this.o, this.p, this.l);
        GroupedNotificationsFragment.c cVar = this.m;
        if (cVar != null) {
            GroupedNotificationsFragment.this.d0.add(new WeakReference<>(ka70Var));
        }
        return ka70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r5.zb(r8) == true) goto L10;
     */
    @Override // xsna.bj70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(NotificationItem notificationItem) {
        boolean z;
        ListDataSet listDataSet = (ListDataSet) this.c;
        ArrayList arrayList = listDataSet.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            NotificationItem notificationItem2 = (NotificationItem) arrayList.get(i);
            if (notificationItem2 != null) {
                z = true;
            }
            z = false;
            if (z) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            listDataSet.h(i);
            arrayList.set(i, notificationItem);
            listDataSet.d(i);
        }
    }

    @Override // xsna.iwu
    public final int U0() {
        return 40621;
    }

    public final void W0() {
        uuk uukVar = this.c;
        uukVar.clear();
        uukVar.n0(this.n);
        R0();
    }

    @Override // xsna.zoj0, xsna.uuk, xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.n.clear();
        W0();
    }

    @Override // xsna.iwu, xsna.mf7
    public final int e0(int i) {
        return 1;
    }

    @Override // xsna.zoj0, xsna.uuk
    public final void n0(List<NotificationItem> list) {
        if (list == null) {
            return;
        }
        this.n.addAll(list);
        W0();
    }
}
