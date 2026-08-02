package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.ProductDto$Details$Type;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class h8f0 {
    public static final z7f0 Companion = new z7f0();
    public static final i3y[] i = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(11)), null, null, null, null, null, null};
    public final String a;
    public final ProductDto$Details$Type b;
    public final String c;
    public final String d;
    public final c8f0 e;
    public final c8f0 f;
    public final c8f0 g;
    public final boolean h;

    public /* synthetic */ h8f0(int i2, String str, ProductDto$Details$Type productDto$Details$Type, String str2, String str3, c8f0 c8f0Var, c8f0 c8f0Var2, c8f0 c8f0Var3, boolean z) {
        if (255 != (i2 & 255)) {
            qje.Z(i2, 255, y7f0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = productDto$Details$Type;
        this.c = str2;
        this.d = str3;
        this.e = c8f0Var;
        this.f = c8f0Var2;
        this.g = c8f0Var3;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8f0)) {
            return false;
        }
        h8f0 h8f0Var = (h8f0) obj;
        return jl40.l(this.a, h8f0Var.a) && this.b == h8f0Var.b && jl40.l(this.c, h8f0Var.c) && jl40.l(this.d, h8f0Var.d) && jl40.l(this.e, h8f0Var.e) && jl40.l(this.f, h8f0Var.f) && jl40.l(this.g, h8f0Var.g) && this.h == h8f0Var.h;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        c8f0 c8f0Var = this.f;
        int hashCode4 = (hashCode3 + (c8f0Var == null ? 0 : c8f0Var.hashCode())) * 31;
        c8f0 c8f0Var2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode4 + (c8f0Var2 != null ? c8f0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Details(id=");
        sb.append(this.a);
        sb.append(", productType=");
        sb.append(this.b);
        sb.append(", offerText=");
        sb.append(this.c);
        sb.append(", offerSubText=");
        sb.append(this.d);
        sb.append(", commonPeriod=");
        sb.append(this.e);
        sb.append(", trialPeriod=");
        sb.append(this.f);
        sb.append(", introPeriod=");
        sb.append(this.g);
        sb.append(", family=");
        return unr0.u(sb, this.h, ')');
    }
}
