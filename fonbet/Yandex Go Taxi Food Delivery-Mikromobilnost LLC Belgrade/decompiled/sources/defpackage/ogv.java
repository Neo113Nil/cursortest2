package defpackage;

import android.content.res.Resources;

/* loaded from: classes10.dex */
public final class ogv {
    public final Resources.Theme a;
    public final int b;

    public ogv(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogv)) {
            return false;
        }
        ogv ogvVar = (ogv) obj;
        return jl40.l(this.a, ogvVar.a) && this.b == ogvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return oyr.s(sb, this.b, ')');
    }
}
