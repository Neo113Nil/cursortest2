package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb580;", "", "Companion", "z480", "a580", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class b580 {
    public static final a580 Companion = new a580();
    public static final i3y[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(26)), null};
    public final String a;
    public final String b;
    public final String c;
    public final rf70 d;
    public final List e;
    public final String f;

    public /* synthetic */ b580(int i, String str, String str2, String str3, rf70 rf70Var, List list, String str4) {
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
            this.d = null;
        } else {
            this.d = rf70Var;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public static b580 a(b580 b580Var, rf70 rf70Var, ArrayList arrayList, String str, int i) {
        String str2 = b580Var.a;
        String str3 = b580Var.b;
        String str4 = b580Var.c;
        if ((i & 8) != 0) {
            rf70Var = b580Var.d;
        }
        rf70 rf70Var2 = rf70Var;
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = b580Var.e;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 32) != 0) {
            str = b580Var.f;
        }
        b580Var.getClass();
        return new b580(str2, str3, str4, rf70Var2, arrayList3, str);
    }

    public final rf70 b() {
        rf70 rf70Var = this.d;
        return rf70Var == null ? new mf70(false) : rf70Var;
    }

    public final boolean c() {
        return "select".equals(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b580)) {
            return false;
        }
        b580 b580Var = (b580) obj;
        return jl40.l(this.a, b580Var.a) && jl40.l(this.b, b580Var.b) && jl40.l(this.c, b580Var.c) && jl40.l(this.d, b580Var.d) && jl40.l(this.e, b580Var.e) && jl40.l(this.f, b580Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        rf70 rf70Var = this.d;
        int c = unr0.c((b + (rf70Var == null ? 0 : rf70Var.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderRequirement(name=", this.a, ", type=", this.b, ", label=");
        v.append(this.c);
        v.append(", _value=");
        v.append(this.d);
        v.append(", pickedOptionsNames=");
        return n.l(", comment=", this.f, Extension.C_BRAKE, v, this.e);
    }

    public b580() {
        this((String) null, (String) null, (String) null, (rf70) null, (List) null, 63);
    }

    public b580(String str, String str2, String str3, rf70 rf70Var, List list, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rf70Var;
        this.e = list;
        this.f = str4;
    }

    public /* synthetic */ b580(String str, String str2, String str3, rf70 rf70Var, List list, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : rf70Var, (i & 16) != 0 ? EmptyList.a : list, (String) null);
    }
}
