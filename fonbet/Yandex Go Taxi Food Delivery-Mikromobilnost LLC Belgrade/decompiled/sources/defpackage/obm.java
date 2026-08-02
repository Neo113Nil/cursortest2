package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class obm {
    public final String a;
    public final Drawable b;

    public obm(String str, Drawable drawable) {
        this.a = str;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        obm obmVar = obj instanceof obm ? (obm) obj : null;
        return jl40.l(obmVar != null ? obmVar.a : null, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
