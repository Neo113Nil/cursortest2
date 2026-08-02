package defpackage;

import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public final class lo61 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public lo61(long j) {
        d(j);
    }

    public final synchronized long a() {
        long j;
        j = this.a;
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.b == -9223372036854775807L) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                j += j4 * 8589934592L;
                if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                    j = j5;
                }
            }
            return b((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(long j) {
        this.a = j;
        this.b = j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }
}
