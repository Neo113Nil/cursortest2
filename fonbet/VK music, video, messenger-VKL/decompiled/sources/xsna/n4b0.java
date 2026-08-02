package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: PlayerStateAdsMeta.kt */
/* loaded from: classes3.dex */
public final class n4b0 {
    public static final Object b = msy.a(LazyThreadSafetyMode.NONE, new kr6(18));
    public final String a;

    public n4b0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4b0) && epx.f(this.a, ((n4b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("PlayerStateAdsMeta(adsId="), this.a, ')');
    }
}
