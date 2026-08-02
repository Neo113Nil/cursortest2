package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class bky0 extends vuj0 {
    public final /* synthetic */ eky0 a;
    public final /* synthetic */ dky0 b;

    public bky0(dky0 dky0Var, eky0 eky0Var) {
        this.b = dky0Var;
        this.a = eky0Var;
    }

    @Override // defpackage.vuj0
    public final void b(int i) {
        this.b.n = true;
        this.a.a(i);
    }

    @Override // defpackage.vuj0
    public final void c(Typeface typeface) {
        dky0 dky0Var = this.b;
        Typeface create = Typeface.create(typeface, dky0Var.d);
        dky0Var.p = create;
        dky0Var.n = true;
        this.a.b(create, false);
    }
}
