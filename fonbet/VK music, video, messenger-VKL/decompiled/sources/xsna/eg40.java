package xsna;

/* compiled from: MusicDeviceRestrictionsConfig.kt */
/* loaded from: classes3.dex */
public final class eg40 {
    public final boolean a;

    public eg40() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg40)) {
            return false;
        }
        eg40 eg40Var = (eg40) obj;
        eg40Var.getClass();
        return this.a == eg40Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + qoy.b(Boolean.hashCode(false) * 31, 31, false);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("MusicDeviceRestrictionsConfig(isNormalizationAllowed=false, isReusePlayerAllowed=false, isEqualizerAllowed="), this.a, ')');
    }

    public eg40(int i) {
        this.a = true;
    }
}
