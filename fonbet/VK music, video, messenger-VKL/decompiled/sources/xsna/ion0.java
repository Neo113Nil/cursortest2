package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* compiled from: SyncSampleEntry.java */
/* loaded from: classes14.dex */
public final class ion0 extends vju {
    public int a;
    public int b;

    @Override // xsna.vju
    public final ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        aqw.w(this.b + (this.a << 6), allocate);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // xsna.vju
    public final String b() {
        return "sync";
    }

    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        int y = crx0.y(byteBuffer);
        this.a = (y & PsExtractor.AUDIO_STREAM) >> 6;
        this.b = y & 63;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ion0.class != obj.getClass()) {
            return false;
        }
        ion0 ion0Var = (ion0) obj;
        return this.b == ion0Var.b && this.a == ion0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncSampleEntry{reserved=");
        sb.append(this.a);
        sb.append(", nalUnitType=");
        return vu5.b(sb, this.b, '}');
    }
}
