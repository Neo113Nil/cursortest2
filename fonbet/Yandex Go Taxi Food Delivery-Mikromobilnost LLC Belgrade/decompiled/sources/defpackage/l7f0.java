package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l7f0 {
    public final rr51 a;
    public final List b;

    public l7f0(rr51 rr51Var, ListBuilder listBuilder) {
        this.a = rr51Var;
        this.b = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7f0)) {
            return false;
        }
        l7f0 l7f0Var = (l7f0) obj;
        return jl40.l(this.a, l7f0Var.a) && jl40.l(this.b, l7f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitleDivBlock(divBlock=" + this.a + ", localVariables=" + this.b + Extension.C_BRAKE;
    }
}
