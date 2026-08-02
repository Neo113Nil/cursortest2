package xsna;

import xsna.psf;

/* compiled from: ClipsHostOnboardingDisplayAdapter.kt */
/* loaded from: classes17.dex */
public final class xfe implements wfe {
    public final String b;
    public final urf c;

    public xfe(String str, urf urfVar) {
        this.b = str;
        this.c = urfVar;
    }

    @Override // xsna.wfe
    public final void a() {
        this.c.e(this.b, psf.b.a);
    }

    @Override // xsna.wfe
    public final void j(hjj0 hjj0Var) {
        this.c.e(this.b, new psf.a(hjj0Var));
    }
}
