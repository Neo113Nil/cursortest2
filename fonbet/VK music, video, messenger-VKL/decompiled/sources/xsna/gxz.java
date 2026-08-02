package xsna;

import android.content.Context;

/* compiled from: LocalizedText.kt */
/* loaded from: classes5.dex */
public final class gxz implements wwz {
    public final wwz a;
    public final hxz b;

    public gxz(wwz wwzVar, hxz hxzVar) {
        this.a = wwzVar;
        this.b = hxzVar;
    }

    @Override // xsna.wwz
    public final String a(Context context) {
        return this.b.a(this.a.a(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxz)) {
            return false;
        }
        gxz gxzVar = (gxz) obj;
        return epx.f(this.a, gxzVar.a) && epx.f(this.b, gxzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + '}';
    }
}
