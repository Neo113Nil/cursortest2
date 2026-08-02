package io.appmetrica.analytics.impl;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5123qj {
    public static byte[] a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        messageDigest.reset();
        messageDigest.update(str.getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
        return messageDigest.digest();
    }
}
