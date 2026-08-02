package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.ji8;

/* compiled from: BroadcastAdapter.kt */
/* loaded from: classes7.dex */
public final class jd8 extends androidx.recyclerview.widget.x<ji8.a, ik8> {
    public final LayoutInflater c;
    public final r6 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jd8(LayoutInflater layoutInflater, r6 r6Var) {
        super(new androidx.recyclerview.widget.c(null, r1, r0));
        we8 we8Var = new we8();
        asu0.a.getClass();
        Executor o = asu0.o();
        if (o == null) {
            synchronized (c.a.a) {
                try {
                    if (c.a.b == null) {
                        ExecutorService D = asu0.D();
                        c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            o = c.a.b;
        }
        this.c = layoutInflater;
        this.d = r6Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        eqw0 eqw0Var;
        Object next;
        Object next2;
        ik8 ik8Var = (ik8) e0Var;
        ji8.a item = getItem(i);
        ik8Var.s = item;
        ik8Var.t = this.d;
        SimpleDraweeView simpleDraweeView = ik8Var.l;
        Collection<eqw0> collection = item.c;
        int a = iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
        Collection<eqw0> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection2) {
            if (((eqw0) obj).a < a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection2) {
            if (((eqw0) obj2).a >= a) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    int i2 = ((eqw0) next2).a;
                    do {
                        Object next3 = it.next();
                        int i3 = ((eqw0) next3).a;
                        if (i2 > i3) {
                            next2 = next3;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            eqw0Var = (eqw0) next2;
        } else if (arrayList.isEmpty()) {
            eqw0Var = null;
        } else {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i4 = ((eqw0) next).a;
                    do {
                        Object next4 = it2.next();
                        int i5 = ((eqw0) next4).a;
                        if (i4 < i5) {
                            next = next4;
                            i4 = i5;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            eqw0Var = (eqw0) next;
        }
        simpleDraweeView.setImageURI(eqw0Var != null ? eqw0Var.c : null);
        bwt0.p0(ik8Var.m, item.f);
        ik8Var.n.setText(item.b);
        ik8Var.o.setText(item.d);
        ik8Var.p.setText(ik8Var.r.a(item.e));
        bwt0.p0(ik8Var.q, item.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = ik8.u;
        return new ik8(this.c.inflate(R.layout.voip_broadcast_scheduled_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        ik8 ik8Var = (ik8) e0Var;
        ik8Var.s = null;
        ik8Var.t = null;
    }
}
