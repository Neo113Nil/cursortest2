package defpackage;

import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchActionType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class axv0 {
    public final SuperMapAnalytics$SuperMapSearchActionType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;

    public axv0(SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        list = (i & 128) != 0 ? null : list;
        str7 = (i & 256) != 0 ? null : str7;
        this.a = superMapAnalytics$SuperMapSearchActionType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axv0)) {
            return false;
        }
        axv0 axv0Var = (axv0) obj;
        return this.a == axv0Var.a && jl40.l(this.b, axv0Var.b) && jl40.l(this.c, axv0Var.c) && jl40.l(this.d, axv0Var.d) && jl40.l(this.e, axv0Var.e) && jl40.l(this.f, axv0Var.f) && jl40.l(this.g, axv0Var.g) && jl40.l(this.h, axv0Var.h) && jl40.l(this.i, axv0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.i;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppDiscoveryMapSearchItem(type=");
        sb.append(this.a);
        sb.append(", deeplink=");
        sb.append(this.b);
        sb.append(", oid=");
        g8e.D(sb, this.c, ", uri=", this.d, ", query=");
        g8e.D(sb, this.e, ", stopId=", this.f, ", stopName=");
        tse0.x(this.g, ", position=", ", lineId=", sb, this.h);
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
