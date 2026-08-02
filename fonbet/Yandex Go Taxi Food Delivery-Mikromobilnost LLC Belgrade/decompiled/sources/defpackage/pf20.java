package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class pf20 {
    public final Drawable a;
    public final String b;

    public pf20(String str, Drawable drawable) {
        this.a = drawable;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pf20) {
            return jl40.l(this.b, ((pf20) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
