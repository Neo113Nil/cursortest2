package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: HttpCacheConfig.kt */
/* loaded from: classes6.dex */
public final class zw8 {
    public final String a;
    public final String b;
    public final Regex c;

    public zw8(String str, List<String> list) {
        this.a = str;
        Regex regex = null;
        this.b = brm0.v(str, "*", false) ? qoy.c(1, 0, str) : null;
        if (!list.isEmpty()) {
            regex = new Regex("(?:^|&)(" + p4g.k(list, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null) + ")=[^&]+");
        }
        this.c = regex;
    }

    public final boolean a(String str) {
        String str2 = this.b;
        return str2 != null ? drm0.e0(str, str2) : str.equals(this.a);
    }
}
