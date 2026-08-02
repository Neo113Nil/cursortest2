package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lijs0;", "Lj530;", "Lmjs0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ijs0 extends j530 {
    public final float a;
    public final float b;
    public final float c;
    public final float w;
    public final boolean x;
    public final tls y;

    public /* synthetic */ ijs0(float f, float f2, float f3, float f4, boolean z, tls tlsVar, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z, tlsVar);
    }

    @Override // defpackage.j530
    public final e530 a() {
        mjs0 mjs0Var = new mjs0();
        mjs0Var.a = this.a;
        mjs0Var.b = this.b;
        mjs0Var.c = this.c;
        mjs0Var.w = this.w;
        mjs0Var.x = this.x;
        return mjs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijs0)) {
            return false;
        }
        ijs0 ijs0Var = (ijs0) obj;
        return y7m.b(this.a, ijs0Var.a) && y7m.b(this.b, ijs0Var.b) && y7m.b(this.c, ijs0Var.c) && y7m.b(this.w, ijs0Var.w) && this.x == ijs0Var.x;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        mjs0 mjs0Var = (mjs0) e530Var;
        mjs0Var.a = this.a;
        mjs0Var.b = this.b;
        mjs0Var.c = this.c;
        mjs0Var.w = this.w;
        mjs0Var.x = this.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + g8e.c(this.w, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public ijs0(float f, float f2, float f3, float f4, boolean z, tls tlsVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.w = f4;
        this.x = z;
        this.y = tlsVar;
    }
}
