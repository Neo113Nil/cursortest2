package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class gw81 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gw81(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw81)) {
            return false;
        }
        gw81 gw81Var = (gw81) obj;
        return this.a == gw81Var.a && this.b == gw81Var.b && this.c == gw81Var.c && this.d == gw81Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fia1.b(this.c, fia1.b(this.b, Integer.hashCode(this.a) * 31));
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", unmutedContentDescriptionId=", Extension.C_BRAKE, b64.s(this.a, this.b, "MuteControlResources(mutedResourceId=", ", unmutedResourceId=", ", mutedContentDescriptionId="));
    }
}
