package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.p53;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes8.dex */
public final class o3 {
    public static final n3 Companion = new n3();
    public static final KSerializer[] h = {null, new p53(p3.a, 0), null, null, null, null, null};
    public final String a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public /* synthetic */ o3(int i, String str, List list, String str2, int i2, int i3, String str3, String str4) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, m3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return jl40.l(this.a, o3Var.a) && jl40.l(this.b, o3Var.b) && jl40.l(this.c, o3Var.c) && this.d == o3Var.d && this.e == o3Var.e && jl40.l(this.f, o3Var.f) && jl40.l(this.g, o3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(oyr.b(this.e, oyr.b(this.d, unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(action=");
        sb.append(this.a);
        sb.append(", tags=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", riskScore=");
        sb.append(this.d);
        sb.append(", ruleScore=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", txId=");
        return b64.p(sb, this.g, ')');
    }
}
