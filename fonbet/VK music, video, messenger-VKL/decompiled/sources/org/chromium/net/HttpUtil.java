package org.chromium.net;

/* loaded from: classes8.dex */
public final class HttpUtil {

    public interface Natives {
        boolean isAllowedHeader(String str, String str2);
    }

    public static boolean isAllowedHeader(String str, String str2) {
        return HttpUtilJni.get().isAllowedHeader(str, str2);
    }
}
