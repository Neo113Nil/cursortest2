package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class awx {
    public static final zvx Companion = new zvx();
    public final double a;
    public final double b;
    public final int c;

    public /* synthetic */ awx(int i, double d, double d2, int i2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, yvx.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
        this.c = i2;
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "Position(lat=", ", lon=");
        u.append(this.b);
        u.append(", dx=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public awx(double d, double d2, int i) {
        this.a = d;
        this.b = d2;
        this.c = i;
    }
}
