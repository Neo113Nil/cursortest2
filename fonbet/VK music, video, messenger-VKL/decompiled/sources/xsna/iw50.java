package xsna;

import android.os.Bundle;

/* compiled from: NavOptions.kt */
/* loaded from: classes3.dex */
public final class iw50 {
    public final Bundle a;

    public iw50() {
        this(0);
    }

    public final Bundle a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iw50) && epx.f(this.a, ((iw50) obj).a);
    }

    public final int hashCode() {
        return shy.a(0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "NavOptions(args=" + this.a + ", reqCode=0, fragmentListener=null)";
    }

    public iw50(int i) {
        this.a = new Bundle();
    }
}
