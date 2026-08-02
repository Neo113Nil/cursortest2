package defpackage;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class exq0 implements gxq0 {
    public final String a;
    public final transient long b = SystemClock.uptimeMillis();

    public exq0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exq0) && jl40.l(this.a, ((exq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder l = x4e.l("Started(orderId='", this.a, "') created ", SystemClock.uptimeMillis() - this.b);
        l.append(" ms ago");
        return l.toString();
    }
}
