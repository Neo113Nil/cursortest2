package xsna;

import android.annotation.SuppressLint;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: MusicMessageQueue.kt */
/* loaded from: classes.dex */
public final class pn40 {
    public io.reactivex.rxjava3.disposables.c a;
    public laq b;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    public final void a(gzs<s3q0> gzsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = gzsVar;
        io.reactivex.rxjava3.disposables.c cVar = this.a;
        if (cVar != null && !cVar.h()) {
            bn40.f("MusicMessageQueue", "queue already started");
            gzs gzsVar2 = (gzs) ref$ObjectRef.element;
            if (gzsVar2 != null) {
                gzsVar2.invoke();
                return;
            }
            return;
        }
        bn40.f("MusicMessageQueue", " subscribe()");
        iy4 iy4Var = new iy4();
        iy4Var.n = true;
        io.reactivex.rxjava3.internal.operators.observable.b0 a0 = rsg0.a0(iy4Var);
        asu0.a.getClass();
        int i = 27;
        this.a = a0.r0(asu0.r()).a0((io.reactivex.rxjava3.core.w) asu0.n0.getValue()).U(new lh3(new azt(11), i)).L(new ps2(new rop(this, 21), i), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qs2(new px30(ref$ObjectRef, 3), i), new wnt(new defpackage.c(23, this, ref$ObjectRef), 7));
    }
}
