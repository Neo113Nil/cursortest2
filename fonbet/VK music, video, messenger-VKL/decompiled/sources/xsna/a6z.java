package xsna;

import android.graphics.ColorFilter;

/* compiled from: ColorFilter.kt */
/* loaded from: classes11.dex */
public final class a6z extends d6g {
    public final long b;
    public final long c;

    public a6z(long j, long j2, ColorFilter colorFilter) {
        super(colorFilter);
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6z)) {
            return false;
        }
        a6z a6zVar = (a6z) obj;
        return l5g.d(this.b, a6zVar.b) && l5g.d(this.c, a6zVar.c);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        dn.h(this.b, ", add=", sb);
        return pm0.d(')', this.c, sb);
    }
}
