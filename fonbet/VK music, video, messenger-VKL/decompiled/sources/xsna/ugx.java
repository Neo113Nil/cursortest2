package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import java.util.Objects;

/* compiled from: InternalFrame.java */
/* loaded from: classes12.dex */
public final class ugx extends asv {
    public final String b;
    public final String c;
    public final String d;

    public ugx(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ugx.class == obj.getClass()) {
            ugx ugxVar = (ugx) obj;
            if (Objects.equals(this.c, ugxVar.c) && Objects.equals(this.b, ugxVar.b) && Objects.equals(this.d, ugxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // xsna.asv
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
