package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bx81 {
    public final List a;
    public final int b;
    public final int c;

    public bx81(int i, int i2, List list) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx81)) {
            return false;
        }
        bx81 bx81Var = (bx81) obj;
        return this.a.equals(bx81Var.a) && this.b == bx81Var.b && this.c == bx81Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fia1.b(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPod(items=");
        sb.append(this.a);
        sb.append(", closableAdPosition=");
        sb.append(this.b);
        sb.append(", rewardAdPosition=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
