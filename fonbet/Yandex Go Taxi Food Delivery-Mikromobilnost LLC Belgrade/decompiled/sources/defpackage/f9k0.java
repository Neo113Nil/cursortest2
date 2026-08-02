package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f9k0 implements ibk0 {
    public final String a;
    public final b b;

    public f9k0(String str, b bVar) {
        this.a = str;
        this.b = bVar;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9k0)) {
            return false;
        }
        f9k0 f9k0Var = (f9k0) obj;
        return jl40.l(this.a, f9k0Var.a) && jl40.l(this.b, f9k0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "ChangeRequirements(analyticsName=" + this.a + ", requirementsPayload=" + this.b + Extension.C_BRAKE;
    }
}
