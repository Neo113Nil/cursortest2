package defpackage;

import com.yandex.plus.core.strings.PlusSdkBrandType;

/* loaded from: classes2.dex */
public final class d9f0 implements e9f0 {
    public final String a;
    public final PlusSdkBrandType b;
    public final String c;

    public d9f0(String str, PlusSdkBrandType plusSdkBrandType, String str2) {
        this.a = str;
        this.b = plusSdkBrandType;
        this.c = str2;
    }

    @Override // defpackage.e9f0
    public final PlusSdkBrandType a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9f0)) {
            return false;
        }
        d9f0 d9f0Var = (d9f0) obj;
        return jl40.l(this.a, d9f0Var.a) && this.b == d9f0Var.b && jl40.l(this.c, d9f0Var.c);
    }

    @Override // defpackage.e9f0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Standard(title=");
        sb.append(this.a);
        sb.append(", brandType=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return b64.p(sb, this.c, ')');
    }
}
