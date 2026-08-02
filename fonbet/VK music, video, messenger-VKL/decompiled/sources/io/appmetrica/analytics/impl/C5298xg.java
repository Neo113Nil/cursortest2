package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5298xg {
    public final String a;
    public final long b;
    public final long c;
    public final EnumC5273wg d;

    public C5298xg(byte[] bArr) {
        C5323yg a = C5323yg.a(bArr);
        this.a = a.a;
        this.b = a.c;
        this.c = a.b;
        this.d = a(a.d);
    }

    public final byte[] a() {
        C5323yg c5323yg = new C5323yg();
        c5323yg.a = this.a;
        c5323yg.c = this.b;
        c5323yg.b = this.c;
        int ordinal = this.d.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 0;
            }
        }
        c5323yg.d = i;
        return MessageNano.toByteArray(c5323yg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5298xg.class == obj.getClass()) {
            C5298xg c5298xg = (C5298xg) obj;
            if (this.b == c5298xg.b && this.c == c5298xg.c && this.a.equals(c5298xg.a) && this.d == c5298xg.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + this.d + '}';
    }

    public C5298xg(String str, long j, long j2, EnumC5273wg enumC5273wg) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = enumC5273wg;
    }

    public static EnumC5273wg a(int i) {
        if (i == 1) {
            return EnumC5273wg.c;
        }
        if (i != 2) {
            return EnumC5273wg.b;
        }
        return EnumC5273wg.d;
    }
}
