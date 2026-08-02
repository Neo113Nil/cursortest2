package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import java.util.Objects;
import xsna.vr10;

/* compiled from: ApicFrame.java */
/* loaded from: classes12.dex */
public final class x03 extends asv {
    public final String b;

    @Nullable
    public final String c;
    public final int d;
    public final byte[] e;

    public x03(String str, @Nullable String str2, int i, byte[] bArr) {
        super(ApicFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // xsna.fi20.a
    public final void c(vr10.a aVar) {
        aVar.a(this.d, this.e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x03.class == obj.getClass()) {
            x03 x03Var = (x03) obj;
            if (this.d == x03Var.d && Objects.equals(this.b, x03Var.b) && Objects.equals(this.c, x03Var.c) && Arrays.equals(this.e, x03Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // xsna.asv
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
