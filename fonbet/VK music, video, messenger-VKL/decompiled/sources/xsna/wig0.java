package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: ReviewsRatingFormatterImpl.kt */
/* loaded from: classes18.dex */
public final class wig0 implements vig0 {
    @Override // xsna.vig0
    public final String a(float f) {
        return brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), ".", StringUtils.COMMA);
    }
}
