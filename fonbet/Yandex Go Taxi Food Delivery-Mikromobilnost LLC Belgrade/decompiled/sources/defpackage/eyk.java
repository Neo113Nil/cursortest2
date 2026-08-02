package defpackage;

import flex.section.divkit.DivkitSnippet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class eyk {
    public static final dyk Companion = new dyk();
    public static final i3y[] j;
    public final String a;
    public final boolean b;
    public final List c;
    public final DivkitSnippet d;
    public final x1q0 e;
    public final syp0 f;
    public final DivkitSnippet g;
    public final mw5 h;
    public final String i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new xyi(19)), a.b(lazyThreadSafetyMode, new xyi(20)), null, null, a.b(lazyThreadSafetyMode, new xyi(21)), a.b(lazyThreadSafetyMode, new xyi(22)), null};
    }

    public /* synthetic */ eyk(int i, String str, boolean z, List list, DivkitSnippet divkitSnippet, x1q0 x1q0Var, syp0 syp0Var, DivkitSnippet divkitSnippet2, mw5 mw5Var, String str2) {
        if (79 != (i & 79)) {
            qje.Z(i, 79, cyk.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = divkitSnippet;
        if ((i & 16) == 0) {
            this.e = gvl.a;
        } else {
            this.e = x1q0Var;
        }
        if ((i & 32) == 0) {
            this.f = gvl.b;
        } else {
            this.f = syp0Var;
        }
        this.g = divkitSnippet2;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = mw5Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eyk.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        eyk eykVar = (eyk) obj;
        return jl40.l(this.a, eykVar.a) && this.b == eykVar.b && jl40.l(this.c, eykVar.c) && jl40.l(this.d, eykVar.d) && jl40.l(this.e, eykVar.e) && jl40.l(this.f, eykVar.f) && jl40.l(this.g, eykVar.g) && jl40.l(this.h, eykVar.h) && jl40.l(this.i, eykVar.i);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        DivkitSnippet divkitSnippet = this.d;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((c + (divkitSnippet != null ? divkitSnippet.hashCode() : 0)) * 31)) * 31)) * 31;
        DivkitSnippet divkitSnippet2 = this.g;
        int hashCode2 = (hashCode + (divkitSnippet2 != null ? divkitSnippet2.hashCode() : 0)) * 31;
        mw5 mw5Var = this.h;
        int hashCode3 = (hashCode2 + (mw5Var != null ? mw5Var.hashCode() : 0)) * 31;
        String str = this.i;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("DivKitSectionSurrogate(id='", this.a, "', reloadable=", ", content=", this.b);
        l.append(this.c);
        l.append(", loadingSnippet=");
        l.append(this.d);
        l.append(", layout=");
        l.append(this.e);
        l.append(", appearance=");
        l.append(this.f);
        l.append(", errorSnippet=");
        l.append(this.g);
        l.append(", bindingMethod=");
        l.append(this.h);
        l.append(", origType=");
        return oyr.t(l, this.i, Extension.C_BRAKE);
    }
}
