package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.i;
import kotlinx.datetime.internal.format.f;

/* loaded from: classes9.dex */
public final class hb61 extends f {
    public final Padding d;

    public hb61(Padding padding) {
        super(i.a, Integer.valueOf(padding != Padding.ZERO ? 1 : 4), padding != Padding.SPACE ? null : 4);
        this.d = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hb61) {
            return this.d == ((hb61) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.d.hashCode() * 31);
    }
}
