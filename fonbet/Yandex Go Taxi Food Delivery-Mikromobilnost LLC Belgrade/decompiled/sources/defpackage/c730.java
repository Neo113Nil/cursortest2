package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.i;
import kotlinx.datetime.internal.format.g;

/* loaded from: classes9.dex */
public final class c730 extends g {
    public final Padding e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c730(Padding padding) {
        super(i.b, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        nys nysVar = i.a;
        this.e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c730) {
            return this.e == ((c730) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
