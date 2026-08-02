package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import io.jsonwebtoken.JwtParser;
import xsna.brm0;
import xsna.ho8;
import xsna.v1v;

/* loaded from: classes8.dex */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(str3);
        sb.append(" (");
        INSTANCE.getClass();
        String str4 = Build.MODEL;
        String str5 = Build.MANUFACTURER;
        if (!brm0.B(str4, str5, false)) {
            str4 = v1v.a(' ', str5, str4);
        }
        sb.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb.append("; Android ");
        return ho8.a(sb, Build.VERSION.RELEASE, ')');
    }
}
