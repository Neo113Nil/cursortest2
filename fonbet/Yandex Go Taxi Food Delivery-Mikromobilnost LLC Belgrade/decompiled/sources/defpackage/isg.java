package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.a;
import kotlinx.datetime.internal.format.g;

/* loaded from: classes9.dex */
public final class isg extends g {
    public final Padding e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isg(Padding padding) {
        super(a.a, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        e421 e421Var = a.a;
        this.e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof isg) {
            return this.e == ((isg) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
