package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: BinaryFrame.java */
/* loaded from: classes12.dex */
public final class s27 extends asv {
    public final byte[] b;

    public s27(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s27.class == obj.getClass()) {
            s27 s27Var = (s27) obj;
            if (this.a.equals(s27Var.a) && Arrays.equals(this.b, s27Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
    }
}
