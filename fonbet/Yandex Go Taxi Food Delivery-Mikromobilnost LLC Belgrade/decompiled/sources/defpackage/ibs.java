package defpackage;

import java.util.List;
import kotlinx.datetime.format.h;
import kotlinx.datetime.internal.format.a;

/* loaded from: classes4.dex */
public final class ibs extends a {
    public static final List d = scc.g(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public final int b;
    public final int c;

    static {
        scc.g(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    public ibs() {
        super(h.d, d);
        this.b = 1;
        this.c = 9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ibs)) {
            return false;
        }
        ibs ibsVar = (ibs) obj;
        return this.b == ibsVar.b && this.c == ibsVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }
}
