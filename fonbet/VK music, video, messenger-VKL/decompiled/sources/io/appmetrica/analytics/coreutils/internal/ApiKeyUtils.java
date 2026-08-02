package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes8.dex */
public final class ApiKeyUtils {
    public static final ApiKeyUtils INSTANCE = new ApiKeyUtils();

    private ApiKeyUtils() {
    }

    public static final String createPartialApiKey(String str) {
        if (str == null || str.length() != 36) {
            return StringUtils.UNDEFINED;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }
}
