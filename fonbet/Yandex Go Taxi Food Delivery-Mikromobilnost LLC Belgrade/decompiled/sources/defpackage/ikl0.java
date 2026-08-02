package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ikl0 {
    public final CharSequence a;
    public final List b;

    public ikl0(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikl0)) {
            return false;
        }
        ikl0 ikl0Var = (ikl0) obj;
        return jl40.l(this.a, ikl0Var.a) && jl40.l(this.b, ikl0Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "RulesSectionUiState(title=" + ((Object) this.a) + ", rules=" + this.b + Extension.C_BRAKE;
    }
}
