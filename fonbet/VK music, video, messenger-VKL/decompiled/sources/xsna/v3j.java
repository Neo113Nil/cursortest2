package xsna;

import com.vk.core.utils.newtork.d;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.f260;

/* compiled from: ConnectionAvailabilityAdapter.kt */
/* loaded from: classes6.dex */
public final class v3j implements f260 {
    public static final v3j a;
    public static final CopyOnWriteArraySet b;
    public static final boolean c;

    /* compiled from: ConnectionAvailabilityAdapter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<com.vk.core.utils.newtork.d, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.core.utils.newtork.d dVar) {
            boolean z;
            com.vk.core.utils.newtork.d dVar2 = dVar;
            v3j v3jVar = (v3j) this.receiver;
            v3j v3jVar2 = v3j.a;
            v3jVar.getClass();
            if (epx.f(dVar2, d.a.a)) {
                z = true;
            } else {
                if (!epx.f(dVar2, d.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            Iterator it = v3j.b.iterator();
            while (it.hasNext()) {
                ((f260.a) it.next()).a(z);
            }
            return s3q0.a;
        }
    }

    static {
        v3j v3jVar = new v3j();
        a = v3jVar;
        b = new CopyOnWriteArraySet();
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
        dVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        hv hvVar = new hv(new a(1, v3jVar, v3j.class, "notifyListener", "notifyListener(Lcom/vk/core/utils/newtork/NetworkStatus;)V", 0), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        yVar.E(hvVar, lVar, kVar, kVar);
        c = com.vk.core.utils.newtork.b.d();
    }

    @Override // xsna.f260
    public final boolean a() {
        return c;
    }

    @Override // xsna.f260
    public final void b(ndq0 ndq0Var) {
        b.add(ndq0Var);
    }
}
