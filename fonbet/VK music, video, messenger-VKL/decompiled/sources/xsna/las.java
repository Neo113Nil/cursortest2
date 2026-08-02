package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: FragmentActionButton.kt */
/* loaded from: classes18.dex */
public final class las {
    public final int a;
    public final Drawable b;
    public final String c;

    public las(int i, Drawable drawable, String str) {
        this.a = i;
        this.b = drawable;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof las)) {
            return false;
        }
        las lasVar = (las) obj;
        return this.a == lasVar.a && epx.f(this.b, lasVar.b) && this.c.equals(lasVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + urd0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentActionButton(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", text=");
        return i5s.a(sb, this.c, ", isDisabled=false)");
    }
}
