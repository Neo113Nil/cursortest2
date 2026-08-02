package defpackage;

import kotlin.time.DurationUnit;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public abstract class f8z0 implements Comparable {
    public static long a(long j) {
        return (1 | (j - 1)) == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? e3n.q(cvw.M(j)) : cvw.Z(s630.a(), j, DurationUnit.NANOSECONDS);
    }
}
