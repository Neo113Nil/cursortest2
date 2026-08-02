package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class io41 {
    public static final go41 Companion = new go41();
    public static final i3y[] f;
    public final String a;
    public final hlk b;
    public final List c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new tn41(1)), a.b(lazyThreadSafetyMode, new tn41(3)), a.b(lazyThreadSafetyMode, new tn41(5)), a.b(lazyThreadSafetyMode, new tn41(7))};
    }

    public /* synthetic */ io41(int i, String str, hlk hlkVar, List list, List list2, List list3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, eo41.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = hlkVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io41)) {
            return false;
        }
        io41 io41Var = (io41) obj;
        return jl40.l(this.a, io41Var.a) && jl40.l(this.b, io41Var.b) && jl40.l(this.c, io41Var.c) && jl40.l(this.d, io41Var.d) && jl40.l(this.e, io41Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hlk hlkVar = this.b;
        int hashCode2 = (hashCode + (hlkVar == null ? 0 : hlkVar.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewCustomProps(url=");
        sb.append(this.a);
        sb.append(", onErrorAction=");
        sb.append(this.b);
        sb.append(", onLoadCompleteList=");
        nnm.w(sb, this.c, ", onLoadStartedList=", this.d, ", tags=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
