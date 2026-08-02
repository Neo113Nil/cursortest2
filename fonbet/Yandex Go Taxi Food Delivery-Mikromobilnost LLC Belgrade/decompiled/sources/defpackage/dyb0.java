package defpackage;

import android.graphics.PointF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class dyb0 {
    public final cyb0 a;
    public final f2c0 b;
    public final PointF c;

    public dyb0(cyb0 cyb0Var, f2c0 f2c0Var, PointF pointF) {
        this.a = cyb0Var;
        this.b = f2c0Var;
        this.c = pointF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyb0)) {
            return false;
        }
        dyb0 dyb0Var = (dyb0) obj;
        return this.a.equals(dyb0Var.a) && this.b.equals(dyb0Var.b) && jl40.l(this.c, dyb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlacemarkResources(config=" + this.a + ", image=" + this.b + ", anchor=" + this.c + Extension.C_BRAKE;
    }
}
