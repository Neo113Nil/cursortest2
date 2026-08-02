package xsna;

import android.net.NetworkRequest;

/* compiled from: NetworkRequestCompat.kt */
/* loaded from: classes.dex */
public final class b560 {
    public static final /* synthetic */ int b = 0;
    public final Object a;

    static {
        m100.d("NetworkRequestCompat");
    }

    public b560() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b560) && epx.f(this.a, ((b560) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("NetworkRequestCompat(wrapped="), this.a, ')');
    }

    public b560(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }
}
