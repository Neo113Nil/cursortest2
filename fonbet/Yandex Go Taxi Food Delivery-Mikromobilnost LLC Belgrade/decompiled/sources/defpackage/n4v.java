package defpackage;

import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes6.dex */
public final class n4v {
    public final BitmapDrawable a;
    public final String b;

    public n4v(BitmapDrawable bitmapDrawable, String str) {
        this.a = bitmapDrawable;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4v)) {
            return false;
        }
        n4v n4vVar = (n4v) obj;
        return this.a.equals(n4vVar.a) && jl40.l(this.b, n4vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
