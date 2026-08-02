package ru.ok.android.webrtc.log;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import xsna.j5g;
import xsna.lwp0;
import xsna.ujm0;
import xsna.zk10;
import xsna.zr;

/* loaded from: classes9.dex */
public final class UrlSecretEraser {
    public final Set a;
    public final String b;

    public UrlSecretEraser(Set<String> set, String str) {
        this.a = set;
        this.b = str;
    }

    public static final CharSequence a(UrlSecretEraser urlSecretEraser, zk10 zk10Var) {
        String str = zk10Var.b().get(1);
        return ((Object) str) + "=" + urlSecretEraser.b;
    }

    public final String eraseSecrets(String str) {
        return this.a.isEmpty() ? str : new Regex(zr.a("(?<=[?&])(", j5g.g0(this.a, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, new lwp0(1), 30), ")=[^&]*")).h(str, new ujm0(this, 5));
    }

    public static final CharSequence a(String str) {
        return Pattern.quote(str);
    }
}
