package defpackage;

import com.yandex.plus.core.strings.PlusSdkBrandType;

/* loaded from: classes2.dex */
public final class c9f0 implements e9f0 {
    public final String a;
    public final PlusSdkBrandType b;
    public final String c;
    public final String d;

    public c9f0(String str, PlusSdkBrandType plusSdkBrandType, String str2, String str3) {
        this.a = str;
        this.b = plusSdkBrandType;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.e9f0
    public final PlusSdkBrandType a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9f0)) {
            return false;
        }
        c9f0 c9f0Var = (c9f0) obj;
        return jl40.l(this.a, c9f0Var.a) && this.b == c9f0Var.b && jl40.l(this.c, c9f0Var.c) && jl40.l(this.d, c9f0Var.d);
    }

    @Override // defpackage.e9f0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Accent(title=");
        sb.append(this.a);
        sb.append(", brandType=");
        sb.append(this.b);
        sb.append(", accentPartOfSubtitle=");
        sb.append(this.c);
        sb.append(", standardPartOfSubtitle=");
        return b64.p(sb, this.d, ')');
    }
}
