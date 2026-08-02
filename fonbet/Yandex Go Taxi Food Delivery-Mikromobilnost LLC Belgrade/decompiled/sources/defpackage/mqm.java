package defpackage;

import com.yx360.design.compose.atoms.DsCheckbox$State;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mqm implements rqm {
    public final DsCheckbox$State a;
    public final tls b;

    public mqm(DsCheckbox$State dsCheckbox$State, tls tlsVar) {
        this.a = dsCheckbox$State;
        this.b = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqm)) {
            return false;
        }
        mqm mqmVar = (mqm) obj;
        return this.a == mqmVar.a && jl40.l(this.b, mqmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + unr0.e(this.a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "Checkbox(state=" + this.a + ", enabled=true, onStateChanged=" + this.b + Extension.C_BRAKE;
    }
}
