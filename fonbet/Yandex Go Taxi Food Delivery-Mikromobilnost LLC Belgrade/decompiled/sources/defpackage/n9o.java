package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class n9o extends nev {
    public final Drawable a;
    public final hev b;
    public final Throwable c;

    public n9o(Drawable drawable, hev hevVar, Throwable th) {
        this.a = drawable;
        this.b = hevVar;
        this.c = th;
    }

    @Override // defpackage.nev
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.nev
    public final hev b() {
        return this.b;
    }

    public final Throwable c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9o)) {
            return false;
        }
        n9o n9oVar = (n9o) obj;
        return jl40.l(this.a, n9oVar.a) && jl40.l(this.b, n9oVar.b) && this.c.equals(n9oVar.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = drawable != null ? drawable.hashCode() : 0;
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }
}
