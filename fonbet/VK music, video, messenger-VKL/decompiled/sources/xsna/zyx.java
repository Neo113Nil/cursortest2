package xsna;

import android.content.Context;

/* compiled from: JobsPayload.kt */
/* loaded from: classes11.dex */
public final class zyx {
    public final Context a;

    public zyx(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyx) && epx.f(this.a, ((zyx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JobsPayload(context=" + this.a + ')';
    }
}
