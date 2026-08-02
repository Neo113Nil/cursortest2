package ru.mail.libverify.n;

import ru.mail.verify.core.utils.Gsonable;
import xsna.epx;
import xsna.urd0;

/* loaded from: classes9.dex */
public final class k implements Gsonable {
    private final String extracted;
    private final String from;
    private final long timestamp;

    public k(long j, String str, String str2) {
        this.timestamp = j;
        this.from = str;
        this.extracted = str2;
    }

    public final String a() {
        return this.extracted;
    }

    public final String b() {
        return this.from;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.timestamp == kVar.timestamp && epx.f(this.from, kVar.from) && epx.f(this.extracted, kVar.extracted);
    }

    public final int hashCode() {
        return this.extracted.hashCode() + urd0.a(Long.hashCode(this.timestamp) * 31, 31, this.from);
    }

    public final String toString() {
        return "";
    }

    public k() {
        this(0L, "", "");
    }
}
