package defpackage;

import android.net.NetworkRequest;

/* loaded from: classes.dex */
public final class jz50 {
    public static final /* synthetic */ int b = 0;
    public final Object a;

    static {
        hgz.o("NetworkRequestCompat");
    }

    public jz50(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz50) && jl40.l(this.a, ((jz50) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("NetworkRequestCompat(wrapped="), this.a, ')');
    }

    public jz50() {
        this(null);
    }
}
