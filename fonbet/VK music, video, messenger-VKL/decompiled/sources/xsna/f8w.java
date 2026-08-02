package xsna;

import xsna.bfz;

/* compiled from: ImItemsHeader.kt */
/* loaded from: classes2.dex */
public final class f8w {
    public static final bpn0 b = new bpn0(new la0(13));
    public final bfz.a a;

    public f8w(bfz.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8w) && epx.f(this.a, ((f8w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImItemsHeader(header=" + this.a + ')';
    }
}
