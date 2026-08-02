package yads;

import com.yandex.mobile.ads.common.AdTheme;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class jq2 {
    public static hq2 a(AdTheme adTheme) {
        int i = iq2.a[adTheme.ordinal()];
        if (i == 1) {
            return hq2.d;
        }
        if (i == 2) {
            return hq2.c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
