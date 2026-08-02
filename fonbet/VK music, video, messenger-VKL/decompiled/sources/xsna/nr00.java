package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qvq;

/* compiled from: MarketAdsUIEventExternalConsumerImpl.kt */
/* loaded from: classes17.dex */
public final class nr00 implements mr00 {
    public final e5 a;

    public nr00(e5 e5Var) {
        this.a = e5Var;
    }

    @Override // xsna.mr00
    public final void a(lr00 lr00Var) {
        boolean z = lr00Var instanceof jr00;
        e5 e5Var = this.a;
        if (!z) {
            if (!(lr00Var instanceof kr00)) {
                throw new NoWhenBranchMatchedException();
            }
            kr00 kr00Var = (kr00) lr00Var;
            e5Var.invoke(new qvq.k.b(kr00Var.b, kr00Var.a));
            return;
        }
        jr00 jr00Var = (jr00) lr00Var;
        String str = jr00Var.a;
        if (jr00Var.c) {
            e5Var.invoke(new qvq.k.a(jr00Var.b, str));
        } else {
            e5Var.invoke(new qvq.s.b(str));
        }
    }
}
