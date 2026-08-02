package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kx70 {
    public final String a;
    public final hxq0 b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;

    public kx70(String str, hxq0 hxq0Var, ListBuilder listBuilder, String str2, String str3, String str4, Map map, int i) {
        List list = (i & 4) != 0 ? EmptyList.a : listBuilder;
        str2 = (i & 8) != 0 ? null : str2;
        map = (i & 64) != 0 ? null : map;
        this.a = str;
        this.b = hxq0Var;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = map;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        return this.g;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.getAlias());
        sb.append(':');
        sb.append(this.a);
        String str = this.d;
        if (str != null) {
            sb.append(':');
            sb.append(str);
        }
        return sb.toString();
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx70)) {
            return false;
        }
        kx70 kx70Var = (kx70) obj;
        return jl40.l(this.a, kx70Var.a) && jl40.l(this.b, kx70Var.b) && jl40.l(this.c, kx70Var.c) && jl40.l(this.d, kx70Var.d) && jl40.l(this.e, kx70Var.e) && jl40.l(this.f, kx70Var.f) && jl40.l(this.g, kx70Var.g);
    }

    public final hxq0 f() {
        return this.b;
    }

    public final int hashCode() {
        int c = unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.g;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderInfo(orderId=");
        sb.append(this.a);
        sb.append(", service=");
        sb.append(this.b);
        sb.append(", wayPoints=");
        oyr.D(", version=", this.d, ", rawStatus=", sb, this.c);
        g8e.D(sb, this.e, ", completionDatetime=", this.f, ", orderMeta=");
        return b64.r(sb, this.g, Extension.C_BRAKE);
    }
}
