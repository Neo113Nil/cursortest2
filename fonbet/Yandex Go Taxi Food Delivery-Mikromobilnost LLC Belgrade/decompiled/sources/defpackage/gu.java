package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgu;", "", "Companion", "eu", "fu", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class gu {
    public static final fu Companion = new fu();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final qfo e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new lq(29)), null, a.b(lazyThreadSafetyMode, new du(0))};
    }

    public /* synthetic */ gu(int i, String str, String str2, String str3, List list, qfo qfoVar, List list2) {
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
            this.c = null;
        } else {
            this.c = str3;
        }
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = qfoVar;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        return jl40.l(this.a, guVar.a) && jl40.l(this.b, guVar.b) && jl40.l(this.c, guVar.c) && jl40.l(this.d, guVar.d) && jl40.l(this.e, guVar.e) && jl40.l(this.f, guVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int c = unr0.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d);
        qfo qfoVar = this.e;
        return this.f.hashCode() + ((c + (qfoVar != null ? qfoVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionDataNotification(content=", this.a, ", details=", this.b, ", iconTag=");
        tse0.x(this.c, ", options=", ", eventInfo=", v, this.d);
        v.append(this.e);
        v.append(", displayLimits=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public gu() {
        this.a = null;
        this.b = null;
        this.c = null;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = null;
        this.f = emptyList;
    }
}
