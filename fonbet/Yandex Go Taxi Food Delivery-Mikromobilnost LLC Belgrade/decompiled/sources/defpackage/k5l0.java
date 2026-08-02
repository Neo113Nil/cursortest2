package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k5l0 extends l5l0 {
    public final int a;
    public final int b;
    public final List c;

    public k5l0(int i, int i2, List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    @Override // defpackage.l5l0
    public final List a() {
        return this.c;
    }

    @Override // defpackage.l5l0
    public final int b() {
        return this.b;
    }

    @Override // defpackage.l5l0
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5l0)) {
            return false;
        }
        k5l0 k5l0Var = (k5l0) obj;
        return this.a == k5l0Var.a && this.b == k5l0Var.b && this.c.equals(k5l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ly3.s(b64.s(this.a, this.b, "Light(routeResId=", ", routeResActiveId=", ", carsPositions="), this.c, Extension.C_BRAKE);
    }
}
