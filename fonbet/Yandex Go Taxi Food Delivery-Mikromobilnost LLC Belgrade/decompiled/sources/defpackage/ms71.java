package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.cb0;

/* loaded from: classes7.dex */
public final class ms71 {
    public final String a;
    public final String b;
    public final Map c;
    public final Integer d;
    public final cb0 e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    public ms71(String str, String str2, MapBuilder mapBuilder, Integer num, cb0 cb0Var, ListBuilder listBuilder, ListBuilder listBuilder2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = mapBuilder;
        this.d = num;
        this.e = cb0Var;
        this.f = listBuilder;
        this.g = listBuilder2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms71)) {
            return false;
        }
        ms71 ms71Var = (ms71) obj;
        return this.a.equals(ms71Var.a) && jl40.l(this.b, ms71Var.b) && jl40.l(this.c, ms71Var.c) && jl40.l(this.d, ms71Var.d) && this.e == ms71Var.e && jl40.l(this.f, ms71Var.f) && jl40.l(this.g, ms71Var.g) && jl40.l(this.h, ms71Var.h) && jl40.l(this.i, ms71Var.i);
    }

    public final int hashCode() {
        int a = z2a1.a(this.a.hashCode() * 31, this.b);
        Map map = this.c;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        cb0 cb0Var = this.e;
        int hashCode3 = (hashCode2 + (cb0Var == null ? 0 : cb0Var.hashCode())) * 31;
        List list = this.f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.h;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PreferredPackage(packageName=", this.a, ", url=", this.b, ", extras=");
        v.append(this.c);
        v.append(", flags=");
        v.append(this.d);
        v.append(", launchMode=");
        v.append(this.e);
        v.append(", trackingUrls=");
        v.append(this.f);
        v.append(", fallbackTrackingUrls=");
        oyr.D(", deeplinkType=", this.h, ", className=", v, this.g);
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }
}
