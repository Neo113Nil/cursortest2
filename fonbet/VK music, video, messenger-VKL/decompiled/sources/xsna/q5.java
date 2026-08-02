package xsna;

import xsna.b4;
import xsna.r5;

/* compiled from: AboutVideoBottomSheet.kt */
/* loaded from: classes2.dex */
public final class q5 implements c4 {
    public final /* synthetic */ r5.a b;

    public q5(r5.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.c4
    public final void d(b4 b4Var) {
        r5.a aVar = this.b;
        r5 r5Var = aVar.h;
        if (b4Var instanceof b4.z) {
            aVar.p = new p5(0, aVar, b4Var);
            r5Var.b(false);
            return;
        }
        boolean z = b4Var instanceof b4.g0;
        if (z) {
            e9 e9Var = aVar.n;
            if (z) {
                e9Var.c.c.onNext(s3q0.a);
                return;
            } else {
                e9Var.getClass();
                return;
            }
        }
        if (!(b4Var instanceof b4.b0)) {
            aVar.e.d(b4Var);
        } else {
            aVar.p = new com.vk.movika.sdk.base.presenter.c(1, aVar, b4Var);
            r5Var.b(false);
        }
    }
}
