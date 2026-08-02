package org.chromium.net.telemetry;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public final class Hash {
    private static final MessageDigest MD5_MESSAGE_DIGEST = getMd5MessageDigest();
    private static final String TAG = "CronetLoggerImpl";

    private static MessageDigest getMd5MessageDigest() {
        try {
            return MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static long hash(byte[] bArr) {
        MessageDigest messageDigest = MD5_MESSAGE_DIGEST;
        if (messageDigest == null || bArr == null || bArr.length == 0) {
            return 0L;
        }
        return ByteBuffer.wrap(messageDigest.digest(bArr)).getLong();
    }

    public static long hash(String str) {
        if (MD5_MESSAGE_DIGEST == null || str == null || str.isEmpty()) {
            return 0L;
        }
        return hash(str.getBytes(StandardCharsets.UTF_8));
    }
}
