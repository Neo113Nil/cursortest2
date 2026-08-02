package xsna;

import android.content.Context;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.vk.core.dynamic_loader.b;
import com.vk.core.utils.newtork.d;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ipo implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ipo(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (((com.vk.core.utils.newtork.d) obj) instanceof d.b) {
                    Iterator<T> it = com.vk.core.dynamic_loader.a.c.values().iterator();
                    while (it.hasNext()) {
                        ((io.reactivex.rxjava3.subjects.d) it.next()).onNext(b.AbstractC0762b.a.a);
                    }
                }
                return s3q0.a;
            case 1:
                Context context = (Context) obj;
                synchronized (vhr.k) {
                    try {
                        if (vhr.l.containsKey("[DEFAULT]")) {
                            vhr.d();
                        } else {
                            ejr a = ejr.a(context);
                            if (a != null) {
                                vhr.h(context, "[DEFAULT]", a);
                            }
                        }
                    } finally {
                    }
                }
                new FirebasePerfProvider().onCreate();
                return s3q0.a;
            case 2:
                dx90 dx90Var = ow90.e;
                dx90Var.getClass();
                dx90Var.p = System.currentTimeMillis();
                dx90Var.u();
                return s3q0.a;
            case 3:
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder("NetworkManager handled exception. Current network status = ");
                com.vk.core.utils.newtork.d P0 = com.vk.core.utils.newtork.b.d.P0();
                sb.append(P0 != null ? P0.getClass().getSimpleName() : null);
                L.j(th, sb.toString());
                return s3q0.a;
            default:
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    g5g.y(((e980) it2.next()).e, arrayList);
                }
                return arrayList;
        }
    }
}
