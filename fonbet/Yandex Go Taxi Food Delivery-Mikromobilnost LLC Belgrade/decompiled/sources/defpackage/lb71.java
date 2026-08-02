package defpackage;

import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public final class lb71 {
    public static final lb71 c;
    public final long a;
    public final long b;

    static {
        lb71 lb71Var = new lb71(0L, 0L);
        new lb71(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        new lb71(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 0L);
        new lb71(0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        c = lb71Var;
    }

    public lb71(long j, long j2) {
        if (j < 0) {
            w511.q();
            throw null;
        }
        if (j2 < 0) {
            w511.q();
            throw null;
        }
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i = rf71.a;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j3 : j6;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lb71.class == obj.getClass()) {
            lb71 lb71Var = (lb71) obj;
            if (this.a == lb71Var.a && this.b == lb71Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
