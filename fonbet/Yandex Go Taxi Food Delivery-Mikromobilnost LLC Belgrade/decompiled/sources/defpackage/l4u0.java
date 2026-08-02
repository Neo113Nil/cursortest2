package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ll4u0;", "", "Companion", "j4u0", "k4u0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class l4u0 {
    public static final k4u0 Companion = new k4u0();
    public static final i3y[] g;
    public final List a;
    public final o0v0 b;
    public final u7r0 c;
    public final wk60 d;
    public final pm4 e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{a.b(lazyThreadSafetyMode, new c3u0(2)), null, null, null, null, a.b(lazyThreadSafetyMode, new c3u0(3))};
    }

    public /* synthetic */ l4u0(int i, List list, o0v0 o0v0Var, u7r0 u7r0Var, wk60 wk60Var, pm4 pm4Var, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = o0v0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = u7r0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = wk60Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = pm4Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4u0)) {
            return false;
        }
        l4u0 l4u0Var = (l4u0) obj;
        return jl40.l(this.a, l4u0Var.a) && jl40.l(this.b, l4u0Var.b) && jl40.l(this.c, l4u0Var.c) && jl40.l(this.d, l4u0Var.d) && jl40.l(this.e, l4u0Var.e) && jl40.l(this.f, l4u0Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        o0v0 o0v0Var = this.b;
        int hashCode2 = (hashCode + (o0v0Var == null ? 0 : o0v0Var.hashCode())) * 31;
        u7r0 u7r0Var = this.c;
        int hashCode3 = (hashCode2 + (u7r0Var == null ? 0 : u7r0Var.hashCode())) * 31;
        wk60 wk60Var = this.d;
        int hashCode4 = (hashCode3 + (wk60Var == null ? 0 : wk60Var.hashCode())) * 31;
        pm4 pm4Var = this.e;
        int hashCode5 = (hashCode4 + (pm4Var == null ? 0 : pm4Var.hashCode())) * 31;
        List list2 = this.f;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "StateDto(wallets=" + this.a + ", subscription=" + this.b + ", settings=" + this.c + ", notifications=" + this.d + ", badgeStyle=" + this.e + ", templateDtos=" + this.f + Extension.C_BRAKE;
    }

    public l4u0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
