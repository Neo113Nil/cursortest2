package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.g;

/* loaded from: classes9.dex */
public final class gw21 extends g {
    public final Padding e;

    public gw21(Padding padding) {
        super(kotlinx.datetime.format.g.b, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gw21) {
            return this.e == ((gw21) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
