package xsna;

import android.app.ProgressDialog;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vkontakte.android.R;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$IntRef;
import org.webrtc.MediaStream;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.l7v;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class x6q implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x6q(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        dj60 dj60Var;
        fhq0 c;
        FragmentActivity activity;
        RecyclerView recyclerView;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b7q.h((b7q) obj2, (defpackage.e0) obj);
                break;
            case 1:
                fwx fwxVar = (fwx) obj2;
                sq60 sq60Var = (sq60) obj;
                dj60 dj60Var2 = fwxVar.c;
                if (dj60Var2 != null) {
                    ct60 ct60Var = (ct60) dj60Var2.invoke();
                    if (!ct60Var.a().A0(sq60Var.a) && (dj60Var = fwxVar.c) != null) {
                        fwxVar.i.d(sq60Var, (tc60) ((ct60) dj60Var.invoke()).c.U.getValue(), fwxVar.h.get());
                    }
                    ct60Var.e().l();
                    break;
                }
                break;
            case 2:
                uxi0 uxi0Var = (uxi0) obj;
                com.vk.superapp.multiaccount.api.a aVar = ((i340) obj2).b;
                List<usi0> list = uxi0Var.b;
                List<usi0> list2 = uxi0Var.a;
                Object a0 = j5g.a0(list2);
                usi0.a aVar2 = a0 instanceof usi0.a ? (usi0.a) a0 : null;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof usi0.a) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof usi0.a) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((usi0.a) it.next()).c().a);
                }
                Set S0 = j5g.S0(arrayList3);
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((usi0.a) it2.next()).c().a);
                }
                Set set = S0;
                Set S02 = j5g.S0(arrayList4);
                LinkedHashSet E0 = j5g.E0(set, S02);
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (E0.contains(((usi0.a) next).c().a)) {
                        arrayList5.add(next);
                    }
                }
                LinkedHashSet E02 = j5g.E0(S02, set);
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (E02.contains(((usi0.a) next2).c().a)) {
                        arrayList6.add(next2);
                    }
                }
                if (aVar.d().getValue().c) {
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        aVar.a((usi0.a) it5.next());
                    }
                }
                if (aVar.d().getValue().c || list.size() > 1) {
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        aVar.b((usi0.a) it6.next(), (aVar2 == null || (c = aVar2.c()) == null) ? null : c.a);
                    }
                }
                if (!list2.isEmpty() && list.isEmpty()) {
                    aVar.clear();
                    break;
                }
                break;
            case 3:
                mj80 mj80Var = (mj80) obj2;
                if (mj80Var.h.containsKey(obj)) {
                    Iterator it7 = ((Iterable) mj80Var.i).iterator();
                    while (it7.hasNext()) {
                        ((com.vk.movika.sdk.player.base.listener.a) it7.next()).a(obj);
                    }
                    break;
                }
                break;
            case 4:
                ((PeerConnectionClient) obj2).b((MediaStream[]) obj);
                break;
            case 5:
                PostViewFragment postViewFragment = (PostViewFragment) obj2;
                String str = (String) obj;
                String[] strArr = PostViewFragment.T0;
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                RecyclerPaginatedView recyclerPaginatedView = postViewFragment.W;
                RecyclerView.o layoutManager = (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
                b2c0 b2c0Var = postViewFragment.s0;
                if (b2c0Var == null) {
                    b2c0Var = null;
                }
                AbstractList abstractList = ((ListDataSet) b2c0Var.c).d;
                for (int i2 = 0; i2 < abstractList.size(); i2++) {
                    u1c0 u1c0Var = (u1c0) abstractList.get(i2);
                    String[] strArr2 = PostViewFragment.T0;
                    if (u1c0Var.c == 73) {
                        ref$IntRef.element = i2;
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                View childAt = layoutManager != null ? layoutManager.getChildAt(ref$IntRef.element) : null;
                View findViewById = childAt != null ? childAt.findViewById(R.id.badges_send_text_view) : null;
                if (findViewById != null && f4m.h(findViewById) && (activity = postViewFragment.getActivity()) != null) {
                    Rect C = bwt0.C(findViewById);
                    l7v b = pla.e().b();
                    b.getClass();
                    l7v.b bVar = new l7v.b(str, b, C);
                    bVar.m = 48;
                    bVar.j(activity);
                    break;
                }
                break;
            case 6:
                b2e0 b2e0Var = (b2e0) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                ProgressDialog progressDialog = b2e0Var.c;
                if (progressDialog != null) {
                    progressDialog.setOnCancelListener(new z1e0(b2e0Var, cVar));
                    break;
                }
                break;
            default:
                com.vungle.ads.internal.util.p.a((String) obj2, (izs) obj);
                break;
        }
    }

    public /* synthetic */ x6q(mj80 mj80Var, Object obj, long j) {
        this.b = 3;
        this.c = mj80Var;
        this.d = obj;
    }
}
