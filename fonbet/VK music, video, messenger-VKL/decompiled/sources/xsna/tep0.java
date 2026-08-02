package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: Track.java */
/* loaded from: classes12.dex */
public final class tep0 {
    public final androidx.media3.common.a a;
    public boolean g;

    @Nullable
    public byte[] h;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public long i = C.TIME_UNSET;

    public tep0(int i, androidx.media3.common.a aVar) {
        this.a = aVar;
    }

    public final int a() {
        androidx.media3.common.a aVar = this.a;
        if (io20.l(aVar.n)) {
            return aVar.G;
        }
        return 90000;
    }
}
