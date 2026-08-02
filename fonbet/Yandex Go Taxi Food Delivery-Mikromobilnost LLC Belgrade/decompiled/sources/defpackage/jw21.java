package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.g;

/* loaded from: classes9.dex */
public final class jw21 extends g {
    public final Padding e;

    public jw21(Padding padding) {
        super(kotlinx.datetime.format.g.a, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jw21) {
            return this.e == ((jw21) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
