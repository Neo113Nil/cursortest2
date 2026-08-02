package xsna;

import androidx.compose.ui.window.SecureFlagPolicy;

/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes11.dex */
public final class xim {
    public final boolean a;
    public final boolean b;
    public final SecureFlagPolicy c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public xim() {
        this(false, false, null, false, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xim)) {
            return false;
        }
        xim ximVar = (xim) obj;
        return this.a == ximVar.a && this.b == ximVar.b && this.c == ximVar.c && this.d == ximVar.d && this.e == ximVar.e && this.g == ximVar.g;
    }

    public final int hashCode() {
        return (qoy.b(qoy.b((this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public xim(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        secureFlagPolicy = (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy;
        z3 = (i & 8) != 0 ? true : z3;
        z4 = (i & 16) != 0 ? true : z4;
        this.a = z;
        this.b = z2;
        this.c = secureFlagPolicy;
        this.d = z3;
        this.e = z4;
        this.f = "";
        this.g = 2;
    }

    public xim(boolean z, int i) {
        this((i & 1) != 0, (i & 2) != 0 ? true : z, SecureFlagPolicy.Inherit, (i & 4) != 0, true, 224);
    }
}
