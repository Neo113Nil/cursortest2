package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: ReviewsRatingFormatter.kt */
/* loaded from: classes18.dex */
public interface vig0 {
    public static final a a = a.a;

    /* compiled from: ReviewsRatingFormatter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final vig0 STUB = new C3894a();

        /* compiled from: ReviewsRatingFormatter.kt */
        /* renamed from: xsna.vig0$a$a, reason: collision with other inner class name */
        public static final class C3894a implements vig0 {
        }

        public final vig0 getSTUB() {
            return STUB;
        }
    }

    default String a(float f) {
        return brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), ".", StringUtils.COMMA);
    }
}
