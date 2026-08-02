package ru.ok.android.webrtc.hash;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class HashUtilKt {
    public static final String checksum(MessageDigest messageDigest) {
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return sb.toString();
    }
}
