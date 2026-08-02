package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: PrivFrame.java */
/* loaded from: classes12.dex */
public final class kcd0 extends asv {
    public final String b;
    public final byte[] c;

    public kcd0(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kcd0.class == obj.getClass()) {
            kcd0 kcd0Var = (kcd0) obj;
            if (Objects.equals(this.b, kcd0Var.b) && Arrays.equals(this.c, kcd0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // xsna.asv
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
