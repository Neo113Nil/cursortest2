package xsna;

/* compiled from: TimelineCropper.kt */
@vby
/* loaded from: classes2.dex */
public final class uwo0 implements wkj {
    public final long a;

    @Override // xsna.wkj
    public final long a(long j, long j2) {
        long j3 = this.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        int i = m4h0.a;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uwo0) {
            return this.a == ((uwo0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return q9k.d("TimelineScale(packed=", this.a, ')');
    }
}
