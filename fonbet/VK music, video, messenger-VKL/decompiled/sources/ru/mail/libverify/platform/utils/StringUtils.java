package ru.mail.libverify.platform.utils;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* compiled from: StringUtils.kt */
/* loaded from: classes9.dex */
public final class StringUtils {
    public static final StringUtils INSTANCE = new StringUtils();

    private StringUtils() {
    }

    public final String decodeBase64(String str) {
        return new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
    }

    public final String limitString(String str, int i) {
        return str.length() <= i ? str : str.substring(0, i);
    }
}
