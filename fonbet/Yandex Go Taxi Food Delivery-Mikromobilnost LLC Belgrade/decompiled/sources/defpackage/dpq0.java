package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class dpq0 implements ig5 {
    public static final cpq0 Companion = new cpq0();
    public final String a;
    public final b b;

    public /* synthetic */ dpq0(int i, String str, b bVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, bpq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpq0)) {
            return false;
        }
        dpq0 dpq0Var = (dpq0) obj;
        return jl40.l(this.a, dpq0Var.a) && jl40.l(this.b, dpq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "SendNativePayloadAction(name=" + this.a + ", payload=" + this.b + Extension.C_BRAKE;
    }
}
