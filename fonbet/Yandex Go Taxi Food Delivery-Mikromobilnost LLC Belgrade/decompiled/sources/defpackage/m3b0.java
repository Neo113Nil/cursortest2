package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;

/* loaded from: classes6.dex */
public final class m3b0 implements pk60 {
    public static final m3b0 m = new m3b0("", null, "", null, 0, "", null, null, false, EmptyList.a, 0, 0);
    public final String a;
    public final String b;
    public final String c;
    public final DataType d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final List j;
    public final long k;
    public final int l;

    public m3b0(String str, String str2, String str3, DataType dataType, int i, String str4, String str5, String str6, boolean z, List list, long j, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dataType;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = list;
        this.k = j;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3b0)) {
            return false;
        }
        m3b0 m3b0Var = (m3b0) obj;
        return jl40.l(this.a, m3b0Var.a) && jl40.l(this.b, m3b0Var.b) && this.c.equals(m3b0Var.c) && this.d == m3b0Var.d && this.e == m3b0Var.e && jl40.l(this.f, m3b0Var.f) && jl40.l(this.g, m3b0Var.g) && jl40.l(this.h, m3b0Var.h) && this.i == m3b0Var.i && jl40.l(this.j, m3b0Var.j) && this.k == m3b0Var.k && this.l == m3b0Var.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        DataType dataType = this.d;
        int b2 = unr0.b(oyr.b(this.e, (b + (dataType == null ? 0 : dataType.hashCode())) * 31, 31), 31, this.f);
        String str2 = this.g;
        int hashCode2 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return Integer.hashCode(this.l) + qv10.c(unr0.c(unr0.e((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder v = b64.v("PersonalActionNotificationViewModel(title=", this.a, ", subtitle=", this.b, ", iconTag=");
        v.append(this.c);
        v.append(", actionType=");
        v.append(this.d);
        v.append(", trailMode=");
        smw0.t(this.e, ", eventType=", this.f, ", eventName=", v);
        g8e.D(v, this.g, ", eventTag=", this.h, ", isSelectPaymentThenRedirect=");
        v.append(this.i);
        v.append(", options=");
        v.append(this.j);
        v.append(", periodMillis=");
        vfc.y(v, this.k, ", limit=", this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
