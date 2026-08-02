package xsna;

import java.util.Objects;

/* compiled from: PostDisplayItemHolderUiDto.kt */
@ozl
/* loaded from: classes4.dex */
public final class z1c0 extends ol60 {
    public final u1c0 h;
    public final int i;
    public final Object j;

    public z1c0(u1c0 u1c0Var, int i, int i2, Object obj) {
        super(u1c0Var.c, i2, i, u1c0Var.d, null);
        this.h = u1c0Var;
        this.i = i;
        this.j = obj;
    }

    public final boolean equals(Object obj) {
        ol60 ol60Var;
        if (this == obj) {
            return true;
        }
        if (!z1c0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        z1c0 z1c0Var = (z1c0) obj;
        u1c0 u1c0Var = this.h;
        if (u1c0Var instanceof lsi) {
            u1c0 u1c0Var2 = z1c0Var.h;
            if (u1c0Var2 instanceof lsi) {
                lsi lsiVar = (lsi) u1c0Var;
                lsi lsiVar2 = (lsi) u1c0Var2;
                r74 r74Var = lsiVar.r;
                u1c0 u1c0Var3 = lsiVar.s;
                ol60 ol60Var2 = r74Var.h;
                return ol60Var2 == null || u1c0Var3.h == null ? !(ol60Var2 == null || u1c0Var3.h != null ? ol60Var2 != null || (ol60Var = u1c0Var3.h) == null ? !(r74Var == lsiVar2.r && u1c0Var3 == lsiVar2.s) : !(r74Var == lsiVar2.r && ol60Var.equals(lsiVar2.s.h)) : !(ol60Var2.equals(lsiVar2.r.h) && u1c0Var3 == lsiVar2.s)) : ol60Var2.equals(lsiVar2.r.h) && Objects.equals(u1c0Var3.h, lsiVar2.s.h);
            }
        }
        ol60 ol60Var3 = u1c0Var.h;
        return ol60Var3 != null ? epx.f(ol60Var3, z1c0Var.h.h) : u1c0Var == z1c0Var.h;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.i;
    }

    public final int hashCode() {
        ol60 ol60Var;
        ol60 ol60Var2;
        u1c0 u1c0Var = this.h;
        if (!(u1c0Var instanceof lsi)) {
            ol60 ol60Var3 = u1c0Var.h;
            return ol60Var3 != null ? Objects.hash(ol60Var3) : Objects.hash(u1c0Var);
        }
        lsi lsiVar = (lsi) u1c0Var;
        r74 r74Var = lsiVar.r;
        u1c0 u1c0Var2 = lsiVar.s;
        ol60 ol60Var4 = r74Var.h;
        return (ol60Var4 == null || (ol60Var2 = u1c0Var2.h) == null) ? (ol60Var4 == null || u1c0Var2.h != null) ? (ol60Var4 != null || (ol60Var = u1c0Var2.h) == null) ? Objects.hash(r74Var, u1c0Var2) : Objects.hash(r74Var, ol60Var) : Objects.hash(ol60Var4, u1c0Var2) : Objects.hash(ol60Var4, ol60Var2);
    }
}
