package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class epd implements fpd {
    public static final dpd Companion = new dpd();
    public final long a;

    public /* synthetic */ epd(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            qje.Z(i, 1, cpd.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epd) && this.a == ((epd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("TrialUntil(until="), this.a, ')');
    }
}
