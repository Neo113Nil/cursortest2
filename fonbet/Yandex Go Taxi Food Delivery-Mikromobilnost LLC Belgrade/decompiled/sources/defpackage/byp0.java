package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.h;
import kotlinx.datetime.internal.format.g;

/* loaded from: classes9.dex */
public final class byp0 extends g {
    public final Padding e;

    public byp0(Padding padding) {
        super(h.c, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof byp0) {
            return this.e == ((byp0) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
