package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class oir0 {
    public static final hir0 Companion = new hir0();
    public static final i3y[] e;
    public final nir0 a;
    public final nir0 b;
    public final nir0 c;
    public final nir0 d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new dwq0(10)), a.b(lazyThreadSafetyMode, new dwq0(11)), a.b(lazyThreadSafetyMode, new dwq0(12)), a.b(lazyThreadSafetyMode, new dwq0(13))};
    }

    public /* synthetic */ oir0(int i, nir0 nir0Var, nir0 nir0Var2, nir0 nir0Var3, nir0 nir0Var4) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, gir0.a.getDescriptor());
            throw null;
        }
        this.a = nir0Var;
        this.b = nir0Var2;
        this.c = nir0Var3;
        this.d = nir0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oir0)) {
            return false;
        }
        oir0 oir0Var = (oir0) obj;
        return jl40.l(this.a, oir0Var.a) && jl40.l(this.b, oir0Var.b) && jl40.l(this.c, oir0Var.c) && jl40.l(this.d, oir0Var.d);
    }

    public final int hashCode() {
        nir0 nir0Var = this.a;
        int hashCode = (nir0Var == null ? 0 : nir0Var.hashCode()) * 31;
        nir0 nir0Var2 = this.b;
        int hashCode2 = (hashCode + (nir0Var2 == null ? 0 : nir0Var2.hashCode())) * 31;
        nir0 nir0Var3 = this.c;
        int hashCode3 = (hashCode2 + (nir0Var3 == null ? 0 : nir0Var3.hashCode())) * 31;
        nir0 nir0Var4 = this.d;
        return hashCode3 + (nir0Var4 != null ? nir0Var4.hashCode() : 0);
    }

    public final String toString() {
        return "ShapeSettingsDto(leftTopCorner=" + this.a + ", rightTopCorner=" + this.b + ", leftBottomCorner=" + this.c + ", rightBottomCorner=" + this.d + ')';
    }

    public oir0(nir0 nir0Var, nir0 nir0Var2, nir0 nir0Var3, nir0 nir0Var4) {
        this.a = nir0Var;
        this.b = nir0Var2;
        this.c = nir0Var3;
        this.d = nir0Var4;
    }
}
