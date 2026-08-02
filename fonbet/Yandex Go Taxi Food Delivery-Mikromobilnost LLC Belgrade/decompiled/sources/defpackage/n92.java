package defpackage;

import android.graphics.Typeface;

/* loaded from: classes10.dex */
public final class n92 extends vuj0 {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ buj0 b;

    public n92(j18 j18Var, buj0 buj0Var) {
        this.a = j18Var;
        this.b = buj0Var;
    }

    @Override // defpackage.vuj0
    public final void b(int i) {
        this.a.b(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    @Override // defpackage.vuj0
    public final void c(Typeface typeface) {
        this.a.resumeWith(typeface);
    }
}
