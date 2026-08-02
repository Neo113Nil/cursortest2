package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class evs0 implements jvs0 {
    public final k9q0 a;
    public final String b;

    public evs0(k9q0 k9q0Var, String str) {
        this.a = k9q0Var;
        this.b = str;
    }

    @Override // defpackage.jvs0
    public final float a() {
        return 8.0f;
    }

    @Override // defpackage.jvs0
    public final float c() {
        return 8.0f;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evs0)) {
            return false;
        }
        evs0 evs0Var = (evs0) obj;
        return jl40.l(this.a, evs0Var.a) && jl40.l(this.b, evs0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrailSegmentControl(state=" + this.a + ", presentationId=" + this.b + Extension.C_BRAKE;
    }
}
