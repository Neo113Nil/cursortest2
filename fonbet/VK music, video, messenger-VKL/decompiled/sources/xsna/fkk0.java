package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: SpeedProvider.java */
/* loaded from: classes12.dex */
public interface fkk0 {
    public static final a a = new a();

    /* compiled from: SpeedProvider.java */
    public class a implements fkk0 {
        @Override // xsna.fkk0
        public final long a(long j) {
            return C.TIME_UNSET;
        }

        @Override // xsna.fkk0
        public final float b(long j) {
            return 1.0f;
        }
    }

    long a(long j);

    float b(long j);
}
