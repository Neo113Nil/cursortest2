package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fi20;

/* compiled from: ThumbnailMetadata.java */
/* loaded from: classes12.dex */
public final class tso0 implements fi20.a {
    public final long a;

    public tso0(long j) {
        this.a = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && tso0.class == obj.getClass() && this.a == ((tso0) obj).a;
    }

    public final int hashCode() {
        return e600.b(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
