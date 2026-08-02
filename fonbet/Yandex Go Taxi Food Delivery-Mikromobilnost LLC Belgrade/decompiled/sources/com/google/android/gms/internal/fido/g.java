package com.google.android.gms.internal.fido;

import defpackage.ny61;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class g {
    public final MessageDigest a;
    public final int b;
    public boolean c;

    public g(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.a = messageDigest;
        this.b = i;
    }

    public final e a() {
        if (this.c) {
            ny61.r("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        this.c = true;
        MessageDigest messageDigest = this.a;
        int digestLength = messageDigest.getDigestLength();
        int i = this.b;
        return i == digestLength ? new zzfs(messageDigest.digest()) : new zzfs(Arrays.copyOf(messageDigest.digest(), i));
    }
}
