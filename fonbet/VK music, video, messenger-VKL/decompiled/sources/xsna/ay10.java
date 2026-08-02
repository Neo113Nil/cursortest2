package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class ay10 {
    public final long a;
    public final boolean b;

    public /* synthetic */ ay10(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay10)) {
            return false;
        }
        ay10 ay10Var = (ay10) obj;
        return this.a == ay10Var.a && this.b == ay10Var.b && dq70.b(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, Boolean.valueOf(this.b), null});
    }
}
