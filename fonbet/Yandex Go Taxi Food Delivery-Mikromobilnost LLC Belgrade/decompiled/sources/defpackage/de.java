package defpackage;

import android.content.Context;

/* loaded from: classes13.dex */
public final class de extends pgd {
    public final je F;
    public final Context G;
    public final w030 H;
    public final p1b I;

    public de(ie ieVar, je jeVar, Context context, w030 w030Var) {
        super(0);
        this.F = jeVar;
        this.G = context;
        this.H = w030Var;
        this.I = new p1b(ieVar, new ce(this, 0));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.I;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }
}
