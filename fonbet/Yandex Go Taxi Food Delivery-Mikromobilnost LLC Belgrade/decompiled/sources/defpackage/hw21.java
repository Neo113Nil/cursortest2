package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.g;

/* loaded from: classes4.dex */
public final class hw21 extends g {
    public final Padding e;

    public hw21(Padding padding) {
        super(kotlinx.datetime.format.g.c, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hw21) {
            return this.e == ((hw21) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
