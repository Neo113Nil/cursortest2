package xsna;

import java.nio.ByteBuffer;

/* compiled from: Playback.kt */
/* loaded from: classes3.dex */
public interface qva0 {

    /* compiled from: Playback.kt */
    public static final class a {
        public final long a;
        public final int b;

        public a() {
            this(Long.MIN_VALUE, Integer.MIN_VALUE);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FrameInfo(timestampMcs=");
            sb.append(this.a);
            sb.append(", frameNumber=");
            return vu5.b(sb, this.b, ')');
        }

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    a a(long j);

    void b(long j);

    int c();

    int d();

    ByteBuffer e(int i, int i2);

    long getDurationUs();

    int getHeight();

    int getWidth();

    boolean init();

    void release();

    a v(int i);
}
