package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.net.OptionViewStyleDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lje70;", "", "Companion", "ie70", "he70", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class je70 {
    public static final ie70 Companion = new ie70();
    public static final i3y[] p;
    public final String a;
    public final String b;
    public final String c;
    public final Number d;
    public final int e;
    public final Map f;
    public final OptionViewStyleDto g;
    public final n7v h;
    public final n7v i;
    public final n7v j;
    public final String k;
    public final String l;
    public final rf70 m;
    public final ge70 n;
    public final String o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new i3y[]{null, null, null, null, null, a.b(lazyThreadSafetyMode, new kz60(9)), a.b(lazyThreadSafetyMode, new kz60(10)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ je70(int i, String str, String str2, String str3, Number number, int i2, Map map, OptionViewStyleDto optionViewStyleDto, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, String str4, String str5, rf70 rf70Var, ge70 ge70Var, String str6) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = 1;
        } else {
            this.d = number;
        }
        if ((i & 16) == 0) {
            this.e = 1;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = b.f();
        } else {
            this.f = map;
        }
        if ((i & 64) == 0) {
            this.g = OptionViewStyleDto.UNKNOWN;
        } else {
            this.g = optionViewStyleDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = n7vVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = n7vVar2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = n7vVar3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = rf70Var;
        }
        this.n = (i & 8192) == 0 ? new ge70(0) : ge70Var;
        if ((i & 16384) == 0) {
            this.o = "";
        } else {
            this.o = str6;
        }
    }

    public final int a() {
        return Math.max(this.e, 1);
    }

    public final int b() {
        return Math.max(this.d.intValue(), 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je70)) {
            return false;
        }
        je70 je70Var = (je70) obj;
        return jl40.l(this.a, je70Var.a) && jl40.l(this.b, je70Var.b) && jl40.l(this.c, je70Var.c) && jl40.l(this.d, je70Var.d) && this.e == je70Var.e && jl40.l(this.f, je70Var.f) && this.g == je70Var.g && jl40.l(this.h, je70Var.h) && jl40.l(this.i, je70Var.i) && jl40.l(this.j, je70Var.j) && jl40.l(this.k, je70Var.k) && jl40.l(this.l, je70Var.l) && jl40.l(this.m, je70Var.m) && jl40.l(this.n, je70Var.n) && jl40.l(this.o, je70Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + unr0.d(oyr.b(this.e, (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31, this.f)) * 31;
        n7v n7vVar = this.h;
        int hashCode2 = (hashCode + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        n7v n7vVar2 = this.i;
        int hashCode3 = (hashCode2 + (n7vVar2 == null ? 0 : n7vVar2.hashCode())) * 31;
        n7v n7vVar3 = this.j;
        int hashCode4 = (hashCode3 + (n7vVar3 == null ? 0 : n7vVar3.hashCode())) * 31;
        String str = this.k;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        rf70 rf70Var = this.m;
        return this.o.hashCode() + ((this.n.hashCode() + ((hashCode6 + (rf70Var != null ? rf70Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OptionDto(title=", this.a, ", label=", this.b, ", name=");
        v.append(this.c);
        v.append(", originalWeight=");
        v.append(this.d);
        v.append(", originalMaxCount=");
        v.append(this.e);
        v.append(", titleForms=");
        v.append(this.f);
        v.append(", style=");
        v.append(this.g);
        v.append(", icon=");
        v.append(this.h);
        v.append(", iconDisabled=");
        v.append(this.i);
        v.append(", image=");
        v.append(this.j);
        v.append(", imageBigTag=");
        g8e.D(v, this.k, ", carouselImage=", this.l, ", value=");
        v.append(this.m);
        v.append(", disabledLabels=");
        v.append(this.n);
        v.append(", itemTrail=");
        return oyr.t(v, this.o, Extension.C_BRAKE);
    }

    public je70(String str, String str2, String str3, Number number, int i, Map map, OptionViewStyleDto optionViewStyleDto, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, String str4, String str5, rf70 rf70Var, ge70 ge70Var, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = number;
        this.e = i;
        this.f = map;
        this.g = optionViewStyleDto;
        this.h = n7vVar;
        this.i = n7vVar2;
        this.j = n7vVar3;
        this.k = str4;
        this.l = str5;
        this.m = rf70Var;
        this.n = ge70Var;
        this.o = str6;
    }

    public je70() {
        this("", "", "", 1, 1, b.f(), OptionViewStyleDto.UNKNOWN, null, null, null, null, null, null, new ge70(0), "");
    }
}
