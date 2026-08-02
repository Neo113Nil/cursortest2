package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b18 extends eky0 {
    public final Typeface a;
    public final a18 b;
    public boolean c;

    public b18(a18 a18Var, Typeface typeface) {
        this.a = typeface;
        this.b = a18Var;
    }

    @Override // defpackage.eky0
    public final void a(int i) {
        if (this.c) {
            return;
        }
        this.b.f(this.a);
    }

    @Override // defpackage.eky0
    public final void b(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        this.b.f(typeface);
    }
}
