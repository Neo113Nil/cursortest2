package xsna;

import android.net.Uri;

/* compiled from: TransformConfig.kt */
/* loaded from: classes3.dex */
public final class vjp0 {
    public final Uri a;

    public vjp0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjp0) && epx.f(this.a, ((vjp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return alb0.b(new StringBuilder("CopyConfig(sourceUri="), this.a, ')');
    }
}
