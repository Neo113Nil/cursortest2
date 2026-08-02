package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ai31 implements di31 {
    public final lww0 a;

    public ai31(lww0 lww0Var) {
        this.a = lww0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai31) && jl40.l(this.a, ((ai31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SurgeWidgetAction(surgeWidgetUiAction=" + this.a + Extension.C_BRAKE;
    }
}
