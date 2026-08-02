package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp5p;", "Lig5;", "Companion", "n5p", "o5p", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class p5p implements ig5 {
    public static final o5p Companion = new o5p();
    public static final i3y[] c;
    public final vm50 a;
    public final vm50 b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new cao(28)), a.b(lazyThreadSafetyMode, new cao(29))};
    }

    public /* synthetic */ p5p(int i, vm50 vm50Var, vm50 vm50Var2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = vm50Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vm50Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5p)) {
            return false;
        }
        p5p p5pVar = (p5p) obj;
        return jl40.l(this.a, p5pVar.a) && jl40.l(this.b, p5pVar.b);
    }

    public final int hashCode() {
        vm50 vm50Var = this.a;
        int hashCode = (vm50Var == null ? 0 : vm50Var.hashCode()) * 31;
        vm50 vm50Var2 = this.b;
        return hashCode + (vm50Var2 != null ? vm50Var2.hashCode() : 0);
    }

    public final String toString() {
        return "FTAuthorizeAction(onFail=" + this.a + ", onSuccess=" + this.b + Extension.C_BRAKE;
    }

    public p5p() {
        this.a = null;
        this.b = null;
    }
}
