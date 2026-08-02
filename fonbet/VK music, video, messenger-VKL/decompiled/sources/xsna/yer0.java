package xsna;

import xsna.fi20;

/* compiled from: VKServerQuality.kt */
/* loaded from: classes8.dex */
public final class yer0 implements fi20.a {
    public final String a;

    public yer0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yer0) && epx.f(this.a, ((yer0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr.a("VKServerQuality(value=", this.a, ")");
    }
}
