package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: MlltFrame.java */
/* loaded from: classes12.dex */
public final class st20 extends asv {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public st20(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && st20.class == obj.getClass()) {
            st20 st20Var = (st20) obj;
            if (this.b == st20Var.b && this.c == st20Var.c && this.d == st20Var.d && Arrays.equals(this.e, st20Var.e) && Arrays.equals(this.f, st20Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + dq.d((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.b) * 31) + this.c) * 31) + this.d) * 31, 31, this.e);
    }
}
