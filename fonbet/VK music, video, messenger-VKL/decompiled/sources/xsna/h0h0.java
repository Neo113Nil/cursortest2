package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;

/* compiled from: SampleFlags.java */
/* loaded from: classes12.dex */
public final class h0h0 {
    public final byte a;
    public final byte b;
    public final byte c;
    public final byte d;
    public final byte e;
    public final byte f;
    public final boolean g;
    public final int h;

    public h0h0() {
    }

    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) ((this.a << 28) | (this.b << 26) | (this.c << 24) | (this.d << 22) | (this.e << 20) | (this.f << 17) | ((this.g ? 1 : 0) << 16) | this.h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0h0.class != obj.getClass()) {
            return false;
        }
        h0h0 h0h0Var = (h0h0) obj;
        return this.b == h0h0Var.b && this.a == h0h0Var.a && this.h == h0h0Var.h && this.c == h0h0Var.c && this.e == h0h0Var.e && this.d == h0h0Var.d && this.g == h0h0Var.g && this.f == h0h0Var.f;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31) + this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SampleFlags{reserved=");
        sb.append((int) this.a);
        sb.append(", isLeading=");
        sb.append((int) this.b);
        sb.append(", depOn=");
        sb.append((int) this.c);
        sb.append(", isDepOn=");
        sb.append((int) this.d);
        sb.append(", hasRedundancy=");
        sb.append((int) this.e);
        sb.append(", padValue=");
        sb.append((int) this.f);
        sb.append(", isDiffSample=");
        sb.append(this.g);
        sb.append(", degradPrio=");
        return vu5.b(sb, this.h, '}');
    }

    public h0h0(ByteBuffer byteBuffer) {
        long w = crx0.w(byteBuffer);
        this.a = (byte) (((-268435456) & w) >> 28);
        this.b = (byte) ((201326592 & w) >> 26);
        this.c = (byte) ((50331648 & w) >> 24);
        this.d = (byte) ((12582912 & w) >> 22);
        this.e = (byte) ((3145728 & w) >> 20);
        this.f = (byte) ((917504 & w) >> 17);
        this.g = ((PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH & w) >> 16) > 0;
        this.h = (int) (w & 65535);
    }
}
