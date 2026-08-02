package xsna;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: CuesWithTiming.java */
/* loaded from: classes12.dex */
public final class wkk {
    public final ImmutableList<rkk> a;
    public final long b;
    public final long c;
    public final long d;

    public wkk(List<rkk> list, long j, long j2) {
        this.a = ImmutableList.m(list);
        this.b = j;
        this.c = j2;
        long j3 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j2 != C.TIME_UNSET) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
