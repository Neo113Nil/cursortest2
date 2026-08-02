package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class a84 extends kgg0 {
    public final int j;
    public final int k;
    public final String l;
    public final List m;

    public a84(int i, int i2, String str, List list) {
        this.j = i;
        this.k = i2;
        this.l = str;
        if (list != null) {
            this.m = list;
        } else {
            ny61.t("Null typicalSizes");
            throw null;
        }
    }

    @Override // defpackage.kgg0
    public final int a() {
        return this.k;
    }

    @Override // defpackage.kgg0
    public final String b() {
        return this.l;
    }

    @Override // defpackage.kgg0
    public final List d() {
        return this.m;
    }

    @Override // defpackage.kgg0
    public final int e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgg0)) {
            return false;
        }
        kgg0 kgg0Var = (kgg0) obj;
        return this.j == kgg0Var.e() && this.k == kgg0Var.a() && this.l.equals(kgg0Var.b()) && this.m.equals(kgg0Var.d());
    }

    public final int hashCode() {
        return this.m.hashCode() ^ ((((((this.j ^ 1000003) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.j);
        sb.append(", highSpeedValue=");
        sb.append(this.k);
        sb.append(", name=");
        sb.append(this.l);
        sb.append(", typicalSizes=");
        return ly3.s(sb, this.m, "}");
    }
}
