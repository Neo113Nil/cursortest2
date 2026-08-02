package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: TimelineCropper.kt */
@vby
/* loaded from: classes2.dex */
public final class fwo0 implements dt1 {
    public final long b;

    @Override // xsna.dt1
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        int i = -((int) (j2 >> 32));
        long j3 = this.b;
        return ((i * ((int) (j3 >> 32))) << 32) | (((-((int) (j2 & 4294967295L))) * ((int) (j3 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fwo0) {
            return this.b == ((fwo0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return q9k.d("TimelineAlignment(packed=", this.b, ')');
    }
}
