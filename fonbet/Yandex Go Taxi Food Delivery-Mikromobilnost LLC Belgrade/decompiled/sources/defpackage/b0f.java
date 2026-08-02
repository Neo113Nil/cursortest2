package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class b0f {
    public static final xze Companion = new xze();
    public static final i3y[] i = {null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(4)), null, null};
    public final String a;
    public final String b;
    public final String c;
    public final q3k0 d;
    public final q3k0 e;
    public final List f;
    public final q3k0 g;
    public final q3k0 h;

    public /* synthetic */ b0f(int i2, String str, String str2, String str3, q3k0 q3k0Var, q3k0 q3k0Var2, List list, q3k0 q3k0Var3, q3k0 q3k0Var4) {
        if (39 != (i2 & 39)) {
            qje.Z(i2, 39, wze.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = q3k0Var;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = q3k0Var2;
        }
        this.f = list;
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = q3k0Var3;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = q3k0Var4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0f)) {
            return false;
        }
        b0f b0fVar = (b0f) obj;
        return jl40.l(this.a, b0fVar.a) && jl40.l(this.b, b0fVar.b) && jl40.l(this.c, b0fVar.c) && jl40.l(this.d, b0fVar.d) && jl40.l(this.e, b0fVar.e) && jl40.l(this.f, b0fVar.f) && jl40.l(this.g, b0fVar.g) && jl40.l(this.h, b0fVar.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        q3k0 q3k0Var = this.d;
        int hashCode = (b + (q3k0Var == null ? 0 : q3k0Var.hashCode())) * 31;
        q3k0 q3k0Var2 = this.e;
        int c = unr0.c((hashCode + (q3k0Var2 == null ? 0 : q3k0Var2.hashCode())) * 31, 31, this.f);
        q3k0 q3k0Var3 = this.g;
        int hashCode2 = (c + (q3k0Var3 == null ? 0 : q3k0Var3.hashCode())) * 31;
        q3k0 q3k0Var4 = this.h;
        return hashCode2 + (q3k0Var4 != null ? q3k0Var4.hashCode() : 0);
    }

    public final String toString() {
        return "CounterOffersDto(eventSessionId=" + this.a + ", batchId=" + this.b + ", target=" + this.c + ", errorTitle=" + this.d + ", errorSubtitle=" + this.e + ", counterOffers=" + this.f + ", alternativeActionText=" + this.g + ", supportText=" + this.h + ')';
    }
}
