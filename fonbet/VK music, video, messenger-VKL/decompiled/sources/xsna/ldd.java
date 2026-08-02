package xsna;

import xsna.mwv;

/* compiled from: ClipToggleSubscriptionItem.kt */
/* loaded from: classes2.dex */
public final class ldd implements mwv.a {
    public final long a;
    public final long b;
    public final boolean c;

    public ldd(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldd)) {
            return false;
        }
        ldd lddVar = (ldd) obj;
        return this.a == lddVar.a && this.b == lddVar.b && this.c == lddVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipToggleSubscriptionItem(clipId=");
        sb.append(this.a);
        sb.append(", clipOwnerId=");
        sb.append(this.b);
        sb.append(", isSubscribe=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
