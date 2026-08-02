package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fi20;

/* compiled from: Mp4TimestampData.java */
/* loaded from: classes12.dex */
public final class yf30 implements fi20.a {
    public final long a;
    public final long b;
    public final long c;

    public yf30(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = -1L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf30)) {
            return false;
        }
        yf30 yf30Var = (yf30) obj;
        return this.a == yf30Var.a && this.b == yf30Var.b && this.c == yf30Var.c;
    }

    public final int hashCode() {
        return e600.b(this.c) + ((e600.b(this.b) + ((e600.b(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    public yf30(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
