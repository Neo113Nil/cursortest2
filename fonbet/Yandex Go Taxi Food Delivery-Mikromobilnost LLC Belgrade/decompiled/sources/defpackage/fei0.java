package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fei0 {
    public final float a;
    public final long b;

    public fei0(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fei0)) {
            return false;
        }
        fei0 fei0Var = (fei0) obj;
        return Float.compare(this.a, fei0Var.a) == 0 && e3n.d(this.b, fei0Var.b);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        o430 o430Var = e3n.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "RealtimeAnalyticsViewConfiguration(viewVisibilityThreshold=" + this.a + ", viewVisibilityTimeout=" + e3n.p(this.b) + Extension.C_BRAKE;
    }
}
