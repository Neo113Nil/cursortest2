package defpackage;

import com.yandex.go.shortcuts.dto.response.Shape;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ca5 {
    public static final cdc k = new cdc(-1);
    public final String a;
    public final int b;
    public final kdc c;
    public final long d;
    public final long e;
    public final Shape f;
    public final float g;
    public final float h;
    public final long i;
    public final int j;

    public ca5(String str, int i, kdc kdcVar, long j, long j2, Shape shape, float f, float f2, long j3, int i2) {
        this.a = str;
        this.b = i;
        this.c = kdcVar;
        this.d = j;
        this.e = j2;
        this.f = shape;
        this.g = f;
        this.h = f2;
        this.i = j3;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca5)) {
            return false;
        }
        ca5 ca5Var = (ca5) obj;
        return jl40.l(this.a, ca5Var.a) && this.b == ca5Var.b && jl40.l(this.c, ca5Var.c) && this.d == ca5Var.d && this.e == ca5Var.e && this.f == ca5Var.f && Float.compare(this.g, ca5Var.g) == 0 && Float.compare(this.h, ca5Var.h) == 0 && this.i == ca5Var.i && this.j == ca5Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + qv10.c(g8e.c(this.h, g8e.c(this.g, (this.f.hashCode() + qv10.c(qv10.c(smw0.d(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e)) * 31, 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "BackgroundAnimation(id=", this.a, ", showCount=", ", color=");
        u.append(this.c);
        u.append(", startDelay=");
        u.append(this.d);
        x4e.A(this.e, ", duration=", ", anchorShape=", u);
        u.append(this.f);
        u.append(", anchorX=");
        u.append(this.g);
        u.append(", anchorY=");
        u.append(this.h);
        u.append(", delayPerCircle=");
        u.append(this.i);
        return b64.q(u, ", circleCount=", this.j, Extension.C_BRAKE);
    }
}
