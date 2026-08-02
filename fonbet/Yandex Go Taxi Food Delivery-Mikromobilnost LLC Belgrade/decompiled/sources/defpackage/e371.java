package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class e371 implements qf71 {
    public final boolean a;

    public e371(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e371) && this.a == ((e371) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("OnDebugErrorIndicatorSwitch(isChecked=", Extension.C_BRAKE, this.a);
    }
}
