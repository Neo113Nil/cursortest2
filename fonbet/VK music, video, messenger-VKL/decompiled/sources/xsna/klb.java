package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ChapterTocFrame.java */
/* loaded from: classes12.dex */
public final class klb extends asv {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final asv[] f;

    public klb(String str, boolean z, boolean z2, String[] strArr, asv[] asvVarArr) {
        super(ChapterTocFrame.ID);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = asvVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && klb.class == obj.getClass()) {
            klb klbVar = (klb) obj;
            if (this.c == klbVar.c && this.d == klbVar.d && Objects.equals(this.b, klbVar.b) && Arrays.equals(this.e, klbVar.e) && Arrays.equals(this.f, klbVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
