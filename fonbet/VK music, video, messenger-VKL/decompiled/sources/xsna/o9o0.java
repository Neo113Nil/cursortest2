package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* compiled from: TemporalLayerSampleGroup.java */
/* loaded from: classes14.dex */
public final class o9o0 extends vju {
    public int a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    @Override // xsna.vju
    public final ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        aqw.w(this.a, allocate);
        allocate.put((byte) (((this.b << 6) + (this.c ? 32 : 0) + this.d) & 255));
        allocate.putInt((int) this.e);
        long j = this.f;
        aqw.u((int) ((281474976710655L & j) >> 32), allocate);
        allocate.putInt((int) (j & 4294967295L));
        allocate.put((byte) (this.g & 255));
        aqw.u(this.h, allocate);
        aqw.u(this.i, allocate);
        allocate.put((byte) (this.j & 255));
        aqw.u(this.k, allocate);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // xsna.vju
    public final String b() {
        return "tscl";
    }

    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        this.a = crx0.y(byteBuffer);
        int e = crx0.e(byteBuffer.get());
        this.b = (e & PsExtractor.AUDIO_STREAM) >> 6;
        this.c = (e & 32) > 0;
        this.d = e & 31;
        this.e = crx0.w(byteBuffer);
        long u = crx0.u(byteBuffer) << 32;
        if (u < 0) {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        this.f = crx0.w(byteBuffer) + u;
        this.g = crx0.e(byteBuffer.get());
        this.h = crx0.u(byteBuffer);
        this.i = crx0.u(byteBuffer);
        this.j = crx0.e(byteBuffer.get());
        this.k = crx0.u(byteBuffer);
    }

    @Override // xsna.vju
    public final int d() {
        return 20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o9o0.class != obj.getClass()) {
            return false;
        }
        o9o0 o9o0Var = (o9o0) obj;
        return this.a == o9o0Var.a && this.i == o9o0Var.i && this.k == o9o0Var.k && this.j == o9o0Var.j && this.h == o9o0Var.h && this.f == o9o0Var.f && this.g == o9o0Var.g && this.e == o9o0Var.e && this.d == o9o0Var.d && this.b == o9o0Var.b && this.c == o9o0Var.c;
    }

    public final int hashCode() {
        int i = ((((((this.a * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31;
        long j = this.e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        return ((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemporalLayerSampleGroup{temporalLayerId=");
        sb.append(this.a);
        sb.append(", tlprofile_space=");
        sb.append(this.b);
        sb.append(", tltier_flag=");
        sb.append(this.c);
        sb.append(", tlprofile_idc=");
        sb.append(this.d);
        sb.append(", tlprofile_compatibility_flags=");
        sb.append(this.e);
        sb.append(", tlconstraint_indicator_flags=");
        sb.append(this.f);
        sb.append(", tllevel_idc=");
        sb.append(this.g);
        sb.append(", tlMaxBitRate=");
        sb.append(this.h);
        sb.append(", tlAvgBitRate=");
        sb.append(this.i);
        sb.append(", tlConstantFrameRate=");
        sb.append(this.j);
        sb.append(", tlAvgFrameRate=");
        return vu5.b(sb, this.k, '}');
    }
}
