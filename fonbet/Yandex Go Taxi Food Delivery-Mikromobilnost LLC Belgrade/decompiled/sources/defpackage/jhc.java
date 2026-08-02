package defpackage;

import flex.theme.ThemedColor;

/* loaded from: classes.dex */
public final class jhc implements g18 {
    public final exy0 a;
    public final tls b;
    public final int c;
    public ThemedColor w;
    public dxy0 x;

    public jhc(exy0 exy0Var, tls tlsVar) {
        this.a = exy0Var;
        this.b = tlsVar;
        this.c = exy0Var.a(null);
    }

    public final void a(ThemedColor themedColor) {
        if (!jl40.l(this.w, themedColor) || themedColor == null) {
            cancel();
            this.w = themedColor;
            if (themedColor == null) {
                this.b.invoke(Integer.valueOf(this.c));
            } else {
                this.x = this.a.b(themedColor, new ihc(0, this));
            }
        }
    }

    @Override // defpackage.g18
    public final void cancel() {
        dxy0 dxy0Var = this.x;
        if (dxy0Var != null) {
            dxy0Var.x();
        }
        this.x = null;
        this.w = null;
    }
}
