package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e1u {
    public final c3x a;
    public final y2x b;
    public final n351 c;

    public e1u(c3x c3xVar, y2x y2xVar, n351 n351Var) {
        this.a = c3xVar;
        this.b = y2xVar;
        this.c = n351Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1u)) {
            return false;
        }
        e1u e1uVar = (e1u) obj;
        return this.a.equals(e1uVar.a) && this.b.equals(e1uVar.b) && this.c.equals(e1uVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GridLayoutItemModel(size=" + this.a + ", position=" + this.b + ", widget=" + this.c + Extension.C_BRAKE;
    }
}
