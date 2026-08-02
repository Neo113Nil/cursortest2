package xsna;

import com.vk.api.internal.LongPollCall;

/* compiled from: OkHttpLongPollCall.kt */
/* loaded from: classes15.dex */
public final class fy70 {
    public final String a;
    public final String b;
    public final long c;
    public final l8g0 d;
    public final LongPollCall.Type e;

    public fy70(LongPollCall longPollCall) {
        String str = longPollCall.a;
        this.a = str;
        String str2 = longPollCall.b;
        this.b = str2;
        long j = longPollCall.c;
        this.c = j;
        this.d = longPollCall.d;
        this.e = longPollCall.e;
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Illegal serverUrl value: ".concat(str));
        }
        if (drm0.N(str2)) {
            throw new IllegalArgumentException("Illegal query value: ".concat(str2));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Illegal timeout value: "));
        }
    }

    public final String a() {
        return this.b;
    }

    public final LongPollCall.Type b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final l8g0 d() {
        return this.d;
    }

    public final long e() {
        return this.c;
    }
}
