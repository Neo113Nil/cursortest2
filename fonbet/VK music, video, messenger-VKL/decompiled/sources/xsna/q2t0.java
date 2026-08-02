package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wq10;

/* compiled from: VideoPickerMultiselectionDelegate.kt */
/* loaded from: classes4.dex */
public final class q2t0 implements w8i {
    public final xn50<l2t0, i3t0, x1t0> b;
    public final efc0 c;

    /* compiled from: VideoPickerMultiselectionDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public q2t0(xn50<l2t0, i3t0, x1t0> xn50Var, efc0 efc0Var) {
        this.b = xn50Var;
        this.c = efc0Var;
    }

    public final Set<String> a() {
        ArrayList arrayList;
        efc0 efc0Var = this.c;
        if (efc0Var != null && (arrayList = efc0Var.i.b) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof wq10.c) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((wq10.c) it.next()).a.a1());
            }
            Set<String> S0 = j5g.S0(arrayList3);
            if (S0 != null) {
                return S0;
            }
        }
        return EmptySet.b;
    }

    public final io.reactivex.rxjava3.disposables.c b() {
        io.reactivex.rxjava3.internal.operators.observable.j1 j1Var;
        io.reactivex.rxjava3.disposables.c subscribe;
        efc0 efc0Var = this.c;
        return (efc0Var == null || (j1Var = efc0Var.m) == null || (subscribe = j1Var.subscribe(new h4f0(new gqe0(this, 23), 15), new dpo0(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 4))) == null) ? new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b) : subscribe;
    }
}
