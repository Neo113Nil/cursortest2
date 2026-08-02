package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class f8d0 {
    public static final e8d0 Companion = new e8d0();
    public static final i3y[] j;
    public final String a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Map f;
    public final String g;
    public final Boolean h;
    public final String i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, a.b(lazyThreadSafetyMode, new q2d0(9)), a.b(lazyThreadSafetyMode, new q2d0(10)), a.b(lazyThreadSafetyMode, new q2d0(11)), a.b(lazyThreadSafetyMode, new q2d0(12)), a.b(lazyThreadSafetyMode, new q2d0(13)), null, null, null};
    }

    public /* synthetic */ f8d0(int i, String str, Set set, Set set2, Set set3, Set set4, Map map, String str2, Boolean bool, String str3) {
        if (511 != (i & 511)) {
            qje.Z(i, 511, d8d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        this.f = map;
        this.g = str2;
        this.h = bool;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8d0)) {
            return false;
        }
        f8d0 f8d0Var = (f8d0) obj;
        return jl40.l(this.a, f8d0Var.a) && jl40.l(this.b, f8d0Var.b) && jl40.l(this.c, f8d0Var.c) && jl40.l(this.d, f8d0Var.d) && jl40.l(this.e, f8d0Var.e) && jl40.l(this.f, f8d0Var.f) && jl40.l(this.g, f8d0Var.g) && jl40.l(this.h, f8d0Var.h) && jl40.l(this.i, f8d0Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.c;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.d;
        int hashCode4 = (hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set set4 = this.e;
        int hashCode5 = (hashCode4 + (set4 == null ? 0 : set4.hashCode())) * 31;
        Map map = this.f;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.i;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Context(page=");
        sb.append(this.a);
        sb.append(", places=");
        sb.append(this.b);
        sb.append(", targetsAndFeatures=");
        sb.append(this.c);
        sb.append(", testIds=");
        sb.append(this.d);
        sb.append(", flags=");
        sb.append(this.e);
        sb.append(", restrictions=");
        sb.append(this.f);
        sb.append(", countryCode=");
        sb.append(this.g);
        sb.append(", isNativePaymentEnabled=");
        sb.append(this.h);
        sb.append(", storeId=");
        return b64.p(sb, this.i, ')');
    }

    public f8d0(String str, Set set, Set set2, Set set3, Set set4, Map map, String str2, Boolean bool, String str3) {
        this.a = str;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        this.f = map;
        this.g = str2;
        this.h = bool;
        this.i = str3;
    }
}
