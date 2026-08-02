package ru.mail.libverify.n;

import ru.mail.platform.libverify.sms.SmsRetrieverService;
import xsna.epx;
import xsna.shy;
import xsna.urd0;

/* loaded from: classes9.dex */
public final class n {
    private final SmsRetrieverService a;
    private final int b;
    private final String c;
    private final long d;

    public n(SmsRetrieverService smsRetrieverService, int i, String str, long j) {
        this.a = smsRetrieverService;
        this.b = i;
        this.c = str;
        this.d = j;
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final SmsRetrieverService c() {
        return this.a;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return epx.f(this.a, nVar.a) && this.b == nVar.b && epx.f(this.c, nVar.c) && this.d == nVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
