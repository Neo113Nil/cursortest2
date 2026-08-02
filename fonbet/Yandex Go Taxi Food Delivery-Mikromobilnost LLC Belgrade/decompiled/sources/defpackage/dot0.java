package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldot0;", "Lxn11;", "Companion", "cot0", "bot0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class dot0 implements xn11 {
    public static final cot0 Companion = new cot0();
    public static final i3y[] j;
    public static final dot0 k;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new s7s0(15)), a.b(lazyThreadSafetyMode, new s7s0(16)), a.b(lazyThreadSafetyMode, new s7s0(17)), a.b(lazyThreadSafetyMode, new s7s0(18)), a.b(lazyThreadSafetyMode, new s7s0(19))};
        k = new dot0(0);
    }

    public /* synthetic */ dot0(int i, String str, String str2, String str3, Map map, Map map2, Map map3, Map map4, Map map5) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 8) == 0) {
            this.e = b.f();
        } else {
            this.e = map;
        }
        if ((i & 16) == 0) {
            this.f = b.f();
        } else {
            this.f = map2;
        }
        if ((i & 32) == 0) {
            this.g = b.f();
        } else {
            this.g = map3;
        }
        if ((i & 64) == 0) {
            this.h = b.f();
        } else {
            this.h = map4;
        }
        if ((i & 128) == 0) {
            this.i = b.f();
        } else {
            this.i = map5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dot0)) {
            return false;
        }
        dot0 dot0Var = (dot0) obj;
        return jl40.l(this.b, dot0Var.b) && jl40.l(this.c, dot0Var.c) && jl40.l(this.d, dot0Var.d) && jl40.l(this.e, dot0Var.e) && jl40.l(this.f, dot0Var.f) && jl40.l(this.g, dot0Var.g) && jl40.l(this.h, dot0Var.h) && jl40.l(this.i, dot0Var.i);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.i.hashCode() + unr0.d(unr0.d(unr0.d(unr0.d((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder v = b64.v("SpecialAppAppearanceExperiment(startingPointPinTag=", this.b, ", startingPointPinWithEtaTag=", this.c, ", startingPointLogoTag=");
        v.append(this.d);
        v.append(", startingPointLocalizedLogoTags=");
        v.append(this.e);
        v.append(", startingPointCarPoiTags=");
        v.append(this.f);
        v.append(", summaryCarPoiTags=");
        v.append(this.g);
        v.append(", orderCarPoiTags=");
        v.append(this.h);
        v.append(", colorizedOrderCarPoiTags=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public dot0() {
        this(0);
    }

    public dot0(int i) {
        Map f = b.f();
        Map f2 = b.f();
        Map f3 = b.f();
        Map f4 = b.f();
        Map f5 = b.f();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
    }
}
