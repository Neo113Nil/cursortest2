package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldz6;", "", "Companion", "bz6", "cz6", "order_popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class dz6 {
    public static final cz6 Companion = new cz6();
    public final String a;
    public final Integer b;
    public final Long c;
    public final String d;

    public /* synthetic */ dz6(int i, String str, Integer num, Long l, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz6)) {
            return false;
        }
        dz6 dz6Var = (dz6) obj;
        return jl40.l(this.a, dz6Var.a) && jl40.l(this.b, dz6Var.b) && jl40.l(this.c, dz6Var.c) && jl40.l(this.d, dz6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.c;
        return this.d.hashCode() + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder q = n.q("ButtonActionParams(action=", this.b, this.a, ", sliderPercent=", ", sliderTimeMs=");
        q.append(this.c);
        q.append(", result=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public dz6(Integer num, Long l, String str, String str2) {
        this.a = str;
        this.b = num;
        this.c = l;
        this.d = str2;
    }

    public dz6() {
        this(null, null, "", "");
    }
}
