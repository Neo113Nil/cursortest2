package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: SubtitleExtractor.java */
/* loaded from: classes12.dex */
public final class q0n0 implements pgq {
    public final a1n0 a;

    @Nullable
    public final androidx.media3.common.a b;
    public final ArrayList c;
    public rgp0 f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = y2r0.b;
    public final xi90 d = new xi90();

    /* compiled from: SubtitleExtractor.java */
    public static class a implements Comparable<a> {
        public final long b;
        public final byte[] c;

        public a(long j, byte[] bArr) {
            this.b = j;
            this.c = bArr;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.b, aVar.b);
        }
    }

    public q0n0(a1n0 a1n0Var, @Nullable androidx.media3.common.a aVar) {
        androidx.media3.common.a aVar2;
        this.a = a1n0Var;
        if (aVar != null) {
            a.C0043a a2 = aVar.a();
            a2.m = io20.q("application/x-media3-cues");
            a2.j = aVar.n;
            a2.K = a1n0Var.b();
            aVar2 = new androidx.media3.common.a(a2);
        } else {
            aVar2 = null;
        }
        this.b = aVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = y2r0.c;
        this.j = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new xsna.a1n0.b(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.a.a(r20.e, 0, r20.g, r2, new xsna.oe40(r20, 12));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.i[r2] = ((xsna.q0n0.a) r11.get(r2)).b;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r20.e = xsna.y2r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = xsna.a1n0.b.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        throw androidx.media3.common.ParserException.a(r0, "SubtitleParser failed.");
     */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        int i;
        int i2 = this.h;
        fxc0.z((i2 == 0 || i2 == 5) ? false : true);
        if (this.h == 1) {
            int s = qgqVar.getLength() != -1 ? ipx.s(qgqVar.getLength()) : 1024;
            if (s > this.e.length) {
                this.e = new byte[s];
            }
            this.g = 0;
            this.h = 2;
        }
        int i3 = this.h;
        ArrayList arrayList = this.c;
        if (i3 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i4 = this.g;
            int read = qgqVar.read(bArr2, i4, bArr2.length - i4);
            if (read != -1) {
                this.g += read;
            }
            long length = qgqVar.getLength();
            if (length != -1) {
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (this.h == 3) {
            if (qgqVar.skip(qgqVar.getLength() != -1 ? ipx.s(qgqVar.getLength()) : 1024) == -1) {
                long j = this.j;
                for (int f = j == C.TIME_UNSET ? i : y2r0.f(this.i, j, true); f < arrayList.size(); f++) {
                    f((a) arrayList.get(f));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        return true;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        fxc0.z(this.h == 0);
        rgp0 track = rgqVar.track(0, 3);
        this.f = track;
        androidx.media3.common.a aVar = this.b;
        if (aVar != null) {
            track.c(aVar);
            rgqVar.endTracks();
            rgqVar.f(new utw(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        }
        this.h = 1;
    }

    public final void f(a aVar) {
        this.f.getClass();
        byte[] bArr = aVar.c;
        int length = bArr.length;
        xi90 xi90Var = this.d;
        xi90Var.getClass();
        xi90Var.N(bArr, bArr.length);
        this.f.d(length, xi90Var);
        this.f.a(aVar.b, 1, length, 0, null);
    }

    @Override // xsna.pgq
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        int i = this.h;
        fxc0.z((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }
}
