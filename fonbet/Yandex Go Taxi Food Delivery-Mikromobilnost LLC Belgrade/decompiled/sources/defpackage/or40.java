package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class or40 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final u8i0 d;
    public final emc e;
    public final z3m f;
    public final List g;
    public final String h;

    public or40(String str, CharSequence charSequence, CharSequence charSequence2, u8i0 u8i0Var, emc emcVar, z3m z3mVar, List list, String str2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = u8i0Var;
        this.e = emcVar;
        this.f = z3mVar;
        this.g = list;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or40)) {
            return false;
        }
        or40 or40Var = (or40) obj;
        return jl40.l(this.a, or40Var.a) && jl40.l(this.b, or40Var.b) && jl40.l(this.c, or40Var.c) && jl40.l(this.d, or40Var.d) && jl40.l(this.e, or40Var.e) && jl40.l(this.f, or40Var.f) && jl40.l(this.g, or40Var.g) && jl40.l(this.h, or40Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "MultimodalFeedbackUiState(orderId=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", ratingSelector=");
        t.append(this.d);
        t.append(", commentField=");
        t.append(this.e);
        t.append(", doneButton=");
        t.append(this.f);
        t.append(", routeUris=");
        return n.l(", imageTag=", this.h, Extension.C_BRAKE, t, this.g);
    }
}
