package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gij0 {
    public final int a;
    public final int b;

    public gij0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gij0)) {
            return false;
        }
        gij0 gij0Var = (gij0) obj;
        return this.a == gij0Var.a && this.b == gij0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "TrackColors(uncheckedTrackColor=", ", checkedTrackColor=", Extension.C_BRAKE);
    }
}
