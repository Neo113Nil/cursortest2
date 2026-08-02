package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes12.dex */
public final class tnr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;

    @Nullable
    public final a k;

    @Nullable
    public final fi20 l;

    /* compiled from: FlacStreamMetadata.java */
    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public tnr(byte[] bArr, int i) {
        wi90 wi90Var = new wi90(bArr, bArr.length);
        wi90Var.m(i * 8);
        this.a = wi90Var.g(16);
        this.b = wi90Var.g(16);
        this.c = wi90Var.g(24);
        this.d = wi90Var.g(24);
        int g = wi90Var.g(20);
        this.e = g;
        this.f = d(g);
        this.g = wi90Var.g(3) + 1;
        int g2 = wi90Var.g(5) + 1;
        this.h = g2;
        this.i = a(g2);
        this.j = wi90Var.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        return j == 0 ? C.TIME_UNSET : (j * 1000000) / this.e;
    }

    public final androidx.media3.common.a c(byte[] bArr, @Nullable fi20 fi20Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        fi20 fi20Var2 = this.l;
        if (fi20Var2 != null) {
            fi20Var = fi20Var2.b(fi20Var);
        }
        a.C0043a c0043a = new a.C0043a();
        c0043a.m = io20.q(MimeTypes.AUDIO_FLAC);
        c0043a.n = i;
        c0043a.E = this.g;
        c0043a.F = this.e;
        String str = y2r0.a;
        c0043a.G = y2r0.F(this.h, ByteOrder.LITTLE_ENDIAN);
        c0043a.p = Collections.singletonList(bArr);
        c0043a.k = fi20Var;
        return new androidx.media3.common.a(c0043a);
    }

    public tnr(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable a aVar, @Nullable fi20 fi20Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = fi20Var;
    }
}
