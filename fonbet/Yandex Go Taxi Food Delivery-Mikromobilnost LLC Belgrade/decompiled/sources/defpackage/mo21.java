package defpackage;

import android.location.Location;
import android.os.SystemClock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class mo21 {
    public static final lo21 k = new lo21();
    public final double a;
    public final double b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final float g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public mo21(double d, double d2, float f, float f2, long j, long j2, float f3, String str, boolean z, boolean z2) {
        this.a = d;
        this.b = d2;
        this.c = f;
        this.d = f2;
        this.e = j;
        this.f = j2;
        this.g = f3;
        this.h = str;
        this.i = z;
        this.j = z2;
    }

    public final zzs a() {
        long currentTimeMillis = System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - this.e) / 1000000);
        return new zzs(this.a, this.b, (int) this.c, this.h, Long.valueOf(currentTimeMillis));
    }

    public final Location b() {
        String str = this.h;
        if (evu0.J(str)) {
            str = "none";
        }
        Location location = new Location(str);
        location.setElapsedRealtimeNanos(this.e);
        location.setLongitude(this.b);
        location.setLatitude(this.a);
        location.setAccuracy(this.c);
        location.setTime(this.f);
        location.setSpeed(this.g);
        return location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !mo21.class.equals(obj.getClass())) {
            return false;
        }
        mo21 mo21Var = (mo21) obj;
        if (Double.compare(mo21Var.a, this.a) == 0 && Double.compare(mo21Var.b, this.b) == 0 && Float.compare(mo21Var.c, this.c) == 0 && Float.compare(mo21Var.d, this.d) == 0 && this.e == mo21Var.e && this.f == mo21Var.f && Float.compare(mo21Var.g, this.g) == 0) {
            return this.h.equals(mo21Var.h);
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        float f = this.c;
        int floatToIntBits = (i + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.d;
        int floatToIntBits2 = f2 == 0.0f ? 0 : Float.floatToIntBits(f2);
        long j = this.e;
        int i2 = (((floatToIntBits + floatToIntBits2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i3 = (i2 + ((int) ((j2 >>> 32) ^ j2))) * 31;
        float f3 = this.g;
        return this.h.hashCode() + ((i3 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "UserLocation(lat=", ", lon=");
        u.append(this.b);
        u.append(", accuracy=");
        u.append(this.c);
        u.append(", zoom=");
        u.append(this.d);
        u.append(", elapsedRealtimeNanos=");
        u.append(this.e);
        x4e.A(this.f, ", time=", ", speed=", u);
        u.append(this.g);
        u.append(", provider='");
        u.append(this.h);
        u.append("', isZeroKm=");
        return x4e.i(u, this.i, Extension.C_BRAKE);
    }
}
