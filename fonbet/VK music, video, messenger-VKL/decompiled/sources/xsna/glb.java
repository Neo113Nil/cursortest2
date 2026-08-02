package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ChapterFrame.java */
/* loaded from: classes12.dex */
public final class glb extends asv {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final asv[] g;

    public glb(String str, int i, int i2, long j, long j2, asv[] asvVarArr) {
        super(ChapterFrame.ID);
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = asvVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && glb.class == obj.getClass()) {
            glb glbVar = (glb) obj;
            if (this.c == glbVar.c && this.d == glbVar.d && this.e == glbVar.e && this.f == glbVar.f && Objects.equals(this.b, glbVar.b) && Arrays.equals(this.g, glbVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
