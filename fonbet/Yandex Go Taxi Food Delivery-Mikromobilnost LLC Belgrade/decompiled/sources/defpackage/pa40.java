package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpa40;", "", "Companion", "na40", "oa40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class pa40 {
    public static final oa40 Companion = new oa40();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new e540(7)), null, null, null};
    public final Map a;
    public final String b;
    public final db40 c;
    public final String d;

    public /* synthetic */ pa40(int i, Map map, String str, db40 db40Var, String str2) {
        this.a = (i & 1) == 0 ? b.f() : map;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = db40Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa40)) {
            return false;
        }
        pa40 pa40Var = (pa40) obj;
        return jl40.l(this.a, pa40Var.a) && jl40.l(this.b, pa40Var.b) && jl40.l(this.c, pa40Var.c) && jl40.l(this.d, pa40Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        db40 db40Var = this.c;
        int hashCode3 = (hashCode2 + (db40Var == null ? 0 : db40Var.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "MtTrainCheckoutInfoRequestDto(routePayload=" + this.a + ", token=" + this.b + ", mtTrainCheckoutOrderInfoDto=" + this.c + ", version=" + this.d + Extension.C_BRAKE;
    }

    public pa40(Map map, String str, db40 db40Var, String str2) {
        this.a = map;
        this.b = str;
        this.c = db40Var;
        this.d = str2;
    }

    public pa40() {
        this(b.f(), null, null, null);
    }
}
