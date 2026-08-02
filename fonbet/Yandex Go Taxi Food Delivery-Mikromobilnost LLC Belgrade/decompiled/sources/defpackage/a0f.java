package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class a0f {
    public static final zze Companion = new zze();
    public static final i3y[] g = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(5)), null, null, null};
    public final spd a;
    public final q3k0 b;
    public final List c;
    public final String d;
    public final String e;
    public final q9v f;

    public /* synthetic */ a0f(int i, spd spdVar, q3k0 q3k0Var, List list, String str, String str2, q9v q9vVar) {
        if (47 != (i & 47)) {
            qje.Z(i, 47, yze.a.getDescriptor());
            throw null;
        }
        this.a = spdVar;
        this.b = q3k0Var;
        this.c = list;
        this.d = str;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        this.f = q9vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0f)) {
            return false;
        }
        a0f a0fVar = (a0f) obj;
        return jl40.l(this.a, a0fVar.a) && jl40.l(this.b, a0fVar.b) && jl40.l(this.c, a0fVar.c) && jl40.l(this.d, a0fVar.d) && jl40.l(this.e, a0fVar.e) && jl40.l(this.f, a0fVar.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CounterOffer(offer=" + this.a + ", title=" + this.b + ", benefits=" + this.c + ", buttonText=" + this.d + ", additionalButtonText=" + this.e + ", icon=" + this.f + ')';
    }
}
