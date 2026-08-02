package ru.ok.tracer.base.useragent;

import xsna.xe9;

/* compiled from: UserAgentUtils.kt */
/* loaded from: classes9.dex */
public final class UserAgentUtils {
    public static final String createTracerLiteUserAgentString(String str, String str2, String str3) {
        StringBuilder a = xe9.a("TracerSDK/", str3, " Lib/", str2, " App/");
        a.append(str);
        a.append(" ");
        a.append(getSystemUserAgentString());
        return a.toString();
    }

    public static final String createTracerUserAgentString(String str, String str2) {
        StringBuilder a = xe9.a("TracerSDK/", str2, " App/", str, " ");
        a.append(getSystemUserAgentString());
        return a.toString();
    }

    private static final String getSystemUserAgentString() {
        String property = System.getProperty("http.agent");
        return property != null ? property : "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
    }
}
