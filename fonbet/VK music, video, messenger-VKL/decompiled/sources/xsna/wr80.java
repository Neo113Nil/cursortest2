package xsna;

import android.content.Context;

/* compiled from: OpenRecordsEvent.kt */
/* loaded from: classes7.dex */
public final class wr80 implements gy50 {
    public final Context a;
    public final qvw0 b;

    public wr80(Context context, qvw0 qvw0Var) {
        this.a = context;
        this.b = qvw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr80)) {
            return false;
        }
        wr80 wr80Var = (wr80) obj;
        return epx.f(this.a, wr80Var.a) && epx.f(this.b, wr80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenRecordsEvent(context=" + this.a + ", broadcastOwner=" + this.b + ')';
    }
}
