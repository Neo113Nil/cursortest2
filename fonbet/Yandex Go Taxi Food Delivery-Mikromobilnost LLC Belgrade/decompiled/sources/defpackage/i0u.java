package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i0u {
    public final Integer a;
    public final Integer b;
    public final Double c;
    public final Double d;
    public final Integer e;

    public i0u(Integer num, Integer num2, Double d, Double d2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = d;
        this.d = d2;
        this.e = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0u)) {
            return false;
        }
        i0u i0uVar = (i0u) obj;
        return jl40.l(this.a, i0uVar.a) && jl40.l(this.b, i0uVar.b) && jl40.l(this.c, i0uVar.c) && jl40.l(this.d, i0uVar.d) && this.e.equals(i0uVar.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.c;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        return this.e.hashCode() + ((hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleGeometry(originX=");
        sb.append(this.a);
        sb.append(", originY=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", cornerRadius=");
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
