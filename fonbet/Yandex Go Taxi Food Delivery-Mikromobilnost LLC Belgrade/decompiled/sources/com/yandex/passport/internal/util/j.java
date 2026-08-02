package com.yandex.passport.internal.util;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes8.dex */
public final class j {
    public static String a(String str) {
        return Base64.encodeToString(MessageDigest.getInstance(JCP.DIGEST_SHA_256).digest(str.getBytes(Charset.forName("utf8"))), 11);
    }
}
