package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class akm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public akm(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akm)) {
            return false;
        }
        akm akmVar = (akm) obj;
        return this.a == akmVar.a && this.b == akmVar.b && this.c == akmVar.c && this.d == akmVar.d && this.e == akmVar.e && this.f == akmVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "DrivingModalContentSizes(topInsets=", ", bottomInsets=", ", floatingButtonSize=");
        vfc.u(this.c, this.d, ", drivingBubbleHeight=", ", notificationHeight=", s);
        return ly3.k(this.e, this.f, ", anchoredModalHeight=", Extension.C_BRAKE, s);
    }
}
