package xsna;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: SubtitleParser.java */
/* loaded from: classes12.dex */
public interface a1n0 {

    /* compiled from: SubtitleParser.java */
    public interface a {
        public static final C2516a a = new C2516a();

        /* compiled from: SubtitleParser.java */
        /* renamed from: xsna.a1n0$a$a, reason: collision with other inner class name */
        public class C2516a implements a {
            @Override // xsna.a1n0.a
            public final boolean a(androidx.media3.common.a aVar) {
                return false;
            }

            @Override // xsna.a1n0.a
            public final int b(androidx.media3.common.a aVar) {
                return 1;
            }

            @Override // xsna.a1n0.a
            public final a1n0 c(androidx.media3.common.a aVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(androidx.media3.common.a aVar);

        int b(androidx.media3.common.a aVar);

        a1n0 c(androidx.media3.common.a aVar);
    }

    /* compiled from: SubtitleParser.java */
    public static class b {
        public static final b c = new b(C.TIME_UNSET, false);
        public final long a;
        public final boolean b;

        public b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }
    }

    void a(byte[] bArr, int i, int i2, b bVar, j7j<wkk> j7jVar);

    int b();

    default m0n0 c(int i, int i2, byte[] bArr) {
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        a(bArr, 0, i2, b.c, new x310(aVar, 10));
        return new xkk(aVar.g());
    }

    default void reset() {
    }
}
