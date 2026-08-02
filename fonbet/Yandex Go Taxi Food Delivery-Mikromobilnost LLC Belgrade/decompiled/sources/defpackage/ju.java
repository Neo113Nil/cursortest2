package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lju;", "", "Companion", "hu", "iu", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ju {
    public static final iu Companion = new iu();
    public static final i3y[] f = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new du(1)), null, null};
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final String e;

    public /* synthetic */ ju(int i, int i2, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        this.d = (i & 8) == 0 ? Integer.MAX_VALUE : i2;
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        return jl40.l(this.a, juVar.a) && jl40.l(this.b, juVar.b) && jl40.l(this.c, juVar.c) && this.d == juVar.d && jl40.l(this.e, juVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.e.hashCode() + oyr.b(this.d, unr0.c((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionDataPopup(title=", this.a, ", content=", this.b, ", options=");
        v.append(this.c);
        v.append(", maxShowCount=");
        v.append(this.d);
        v.append(", type=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public ju() {
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
        this.d = Integer.MAX_VALUE;
        this.e = "";
    }
}
