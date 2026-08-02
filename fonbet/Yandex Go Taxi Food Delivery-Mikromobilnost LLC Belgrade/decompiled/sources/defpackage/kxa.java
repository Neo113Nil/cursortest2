package defpackage;

import android.content.Context;

/* loaded from: classes12.dex */
public final class kxa extends pgd implements m950 {
    public final Context F;
    public final w030 G;
    public final mu5 H;

    public kxa(nxa nxaVar, Context context, w030 w030Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = new mu5(new cs8(23, this, nxaVar));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.H;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
