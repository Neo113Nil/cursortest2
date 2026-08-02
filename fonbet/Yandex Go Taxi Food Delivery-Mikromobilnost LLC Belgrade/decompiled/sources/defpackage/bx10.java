package defpackage;

import android.net.Uri;

/* loaded from: classes15.dex */
public final class bx10 extends eoc {
    public final String e;

    public bx10(Uri uri, String str, String str2, boolean z) {
        super(uri, str, str2, z);
        this.e = str2;
    }

    @Override // defpackage.g2r
    public final Object c(jdj jdjVar) {
        return jdjVar.d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bx10.class.equals(obj.getClass())) {
            bx10 bx10Var = (bx10) obj;
            if (jl40.l(this.a, bx10Var.a) && jl40.l(this.e, bx10Var.e) && jl40.l(this.b, bx10Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.e);
    }
}
