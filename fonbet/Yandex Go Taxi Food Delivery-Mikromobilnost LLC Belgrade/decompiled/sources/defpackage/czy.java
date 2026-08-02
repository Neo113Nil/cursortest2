package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class czy {
    public static final bzy Companion = new bzy();
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;

    public /* synthetic */ czy(int i, String str, double d, double d2, double d3, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, azy.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czy)) {
            return false;
        }
        czy czyVar = (czy) obj;
        return jl40.l(this.a, czyVar.a) && Double.compare(this.b, czyVar.b) == 0 && Double.compare(this.c, czyVar.c) == 0 && Double.compare(this.d, czyVar.d) == 0 && jl40.l(this.e, czyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.a(unr0.a(unr0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoaderViewCustomProps(uniqueId=");
        sb.append(this.a);
        sb.append(", lineWidth=");
        sb.append(this.b);
        nzs.o(sb, ", strokeEnd=", this.c, ", duration=");
        sb.append(this.d);
        sb.append(", strokeColorExpression=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
