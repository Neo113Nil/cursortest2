package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m1u implements pre {
    public final String a;
    public final o1u b;
    public final ArrayList c;
    public final int d;
    public final int e;
    public final o690 f;
    public final String g;

    public m1u(String str, o1u o1uVar, ArrayList arrayList, int i, int i2, o690 o690Var, String str2) {
        this.a = str;
        this.b = o1uVar;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
        this.f = o690Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1u)) {
            return false;
        }
        m1u m1uVar = (m1u) obj;
        return jl40.l(this.a, m1uVar.a) && this.b.equals(m1uVar.b) && this.c.equals(m1uVar.c) && this.d == m1uVar.d && this.e == m1uVar.e && this.f.equals(m1uVar.f) && jl40.l(this.g, m1uVar.g);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "grid-layout";
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + oyr.b(this.e, oyr.b(this.d, ly3.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31)) * 31;
        String str = this.g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridLayoutRemoteCoreWidget(id=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", lineSpacing=");
        sb.append(this.d);
        sb.append(", columnSpacing=");
        sb.append(this.e);
        sb.append(", paddings=");
        sb.append(this.f);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
