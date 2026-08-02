package xsna;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Locale;

/* compiled from: VkStepsTimeUtils.kt */
/* loaded from: classes6.dex */
public final class dnv0 {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static Object a(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, pmv0 pmv0Var) {
        return myc0.k(dgn0.f().getDefault(), new cnv0(zonedDateTime, zonedDateTime2, null), pmv0Var);
    }
}
