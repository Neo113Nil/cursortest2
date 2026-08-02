package defpackage;

import android.os.WorkSource;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class jcz {
    public final int a;
    public final long b;
    public long c = -1;
    public long d = 0;
    public long e = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    public int f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public boolean h = true;
    public long i = -1;
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    public WorkSource m = null;
    public ClientIdentity n = null;

    public jcz(int i, long j) {
        this.a = 102;
        cvw.d("intervalMillis must be greater than or equal to 0", j >= 0);
        this.b = j;
        zoa1.e(i);
        this.a = i;
    }

    public final LocationRequest a() {
        long j = this.c;
        int i = this.a;
        long j2 = this.b;
        if (j == -1) {
            j = j2;
        } else if (i != 105) {
            j = Math.min(j, j2);
        }
        long max = Math.max(this.d, this.b);
        long j3 = this.e;
        int i2 = this.f;
        float f = this.g;
        boolean z = this.h;
        long j4 = this.i;
        if (j4 == -1) {
            j4 = this.b;
        }
        return new LocationRequest(i, j2, j, max, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, j3, i2, f, z, j4, this.j, this.k, this.l, new WorkSource(this.m), this.n);
    }

    public final void b(long j) {
        cvw.d("durationMillis must be greater than 0", j > 0);
        this.e = j;
    }

    public final void c(int i) {
        int i2;
        boolean z = true;
        if (i != 0 && i != 1) {
            i2 = 2;
            if (i != 2) {
                z = false;
            }
            cvw.f(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
            this.j = i;
        }
        i2 = i;
        cvw.f(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
        this.j = i;
    }

    public final void d(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        cvw.d("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z);
        this.i = j;
    }

    public final void e(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        cvw.d("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z);
        this.c = j;
    }

    public final void f(int i) {
        int i2;
        boolean z = true;
        if (i != 0 && i != 1) {
            i2 = 2;
            if (i != 2) {
                z = false;
            }
            cvw.f(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i2));
            this.k = i;
        }
        i2 = i;
        cvw.f(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i2));
        this.k = i;
    }
}
