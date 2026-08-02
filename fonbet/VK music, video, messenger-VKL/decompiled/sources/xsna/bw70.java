package xsna;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;
import xsna.bpm0;
import xsna.rnr;

/* compiled from: OggExtractor.java */
/* loaded from: classes12.dex */
public final class bw70 implements pgq {
    public rgq a;
    public bpm0 b;
    public boolean c;

    /* JADX WARN: Removed duplicated region for block: B:60:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        int i;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!f(qgqVar)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            qgqVar.resetPeekPosition();
        }
        if (!this.c) {
            rgp0 track = this.a.track(0, 1);
            this.a.endTracks();
            bpm0 bpm0Var = this.b;
            bpm0Var.c = this.a;
            bpm0Var.b = track;
            bpm0Var.d(true);
            this.c = true;
        }
        bpm0 bpm0Var2 = this.b;
        ew70 ew70Var = bpm0Var2.a;
        bpm0Var2.b.getClass();
        String str = y2r0.a;
        int i2 = bpm0Var2.h;
        int i3 = -1;
        int i4 = 3;
        if (i2 != 0) {
            if (i2 == 1) {
                qgqVar.skipFully((int) bpm0Var2.f);
                bpm0Var2.h = 2;
                return 0;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long a = bpm0Var2.d.a(qgqVar);
            if (a >= 0) {
                pzb0Var.a = a;
                return 1;
            }
            if (a < -1) {
                bpm0Var2.a(-(a + 2));
            }
            if (!bpm0Var2.l) {
                n3i0 createSeekMap = bpm0Var2.d.createSeekMap();
                createSeekMap.getClass();
                bpm0Var2.c.f(createSeekMap);
                bpm0Var2.b.e(createSeekMap.getDurationUs());
                bpm0Var2.l = true;
            }
            if (bpm0Var2.k <= 0 && !ew70Var.b(qgqVar)) {
                bpm0Var2.h = 3;
                return -1;
            }
            bpm0Var2.k = 0L;
            xi90 xi90Var = ew70Var.b;
            long b = bpm0Var2.b(xi90Var);
            if (b >= 0) {
                long j = bpm0Var2.g;
                if (j + b >= bpm0Var2.e) {
                    bpm0Var2.b.d(xi90Var.c, xi90Var);
                    bpm0Var2.b.a((j * 1000000) / bpm0Var2.i, 1, xi90Var.c, 0, null);
                    bpm0Var2.e = -1L;
                }
            }
            bpm0Var2.g += b;
            return 0;
        }
        while (true) {
            boolean b2 = ew70Var.b(qgqVar);
            xi90 xi90Var2 = ew70Var.b;
            if (!b2) {
                bpm0Var2.h = i4;
                return i3;
            }
            long position = qgqVar.getPosition();
            long j2 = bpm0Var2.f;
            bpm0Var2.k = position - j2;
            if (bpm0Var2.c(xi90Var2, j2, bpm0Var2.j)) {
                bpm0Var2.f = qgqVar.getPosition();
                i3 = -1;
                i4 = 3;
            } else {
                androidx.media3.common.a aVar = bpm0Var2.j.a;
                bpm0Var2.i = aVar.G;
                if (!bpm0Var2.m) {
                    bpm0Var2.b.c(aVar);
                    bpm0Var2.m = true;
                }
                rnr.a aVar2 = bpm0Var2.j.b;
                if (aVar2 != null) {
                    bpm0Var2.d = aVar2;
                } else {
                    if (qgqVar.getLength() != -1) {
                        fw70 fw70Var = ew70Var.a;
                        i = 2;
                        bpm0Var2.d = new rjl(bpm0Var2, bpm0Var2.f, qgqVar.getLength(), fw70Var.d + fw70Var.e, fw70Var.b, (fw70Var.a & 4) != 0);
                        bpm0Var2.h = i;
                        bArr = xi90Var2.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        xi90Var2.N(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, xi90Var2.c)), xi90Var2.c);
                        return 0;
                    }
                    bpm0Var2.d = new bpm0.b();
                }
                i = 2;
                bpm0Var2.h = i;
                bArr = xi90Var2.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        try {
            return f(qgqVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.a = rgqVar;
    }

    public final boolean f(qgq qgqVar) throws IOException {
        boolean z;
        fw70 fw70Var = new fw70();
        if (fw70Var.a(qgqVar, true) && (fw70Var.a & 2) == 2) {
            int min = Math.min(fw70Var.e, 8);
            xi90 xi90Var = new xi90(min);
            qgqVar.peekFully(xi90Var.a, 0, min);
            xi90Var.P(0);
            if (xi90Var.a() >= 5 && xi90Var.C() == 127 && xi90Var.E() == 1179402563) {
                this.b = new rnr();
                return true;
            }
            xi90Var.P(0);
            try {
                z = j7x0.c(1, xi90Var, true);
            } catch (ParserException unused) {
                z = false;
            }
            if (z) {
                this.b = new i7x0();
            } else {
                xi90Var.P(0);
                if (eu80.e(xi90Var, eu80.o)) {
                    this.b = new eu80();
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        bpm0 bpm0Var = this.b;
        if (bpm0Var != null) {
            ew70 ew70Var = bpm0Var.a;
            fw70 fw70Var = ew70Var.a;
            fw70Var.a = 0;
            fw70Var.b = 0L;
            fw70Var.c = 0;
            fw70Var.d = 0;
            fw70Var.e = 0;
            ew70Var.b.M(0);
            ew70Var.c = -1;
            ew70Var.e = false;
            if (j == 0) {
                bpm0Var.d(!bpm0Var.l);
                return;
            }
            if (bpm0Var.h != 0) {
                long j3 = (bpm0Var.i * j2) / 1000000;
                bpm0Var.e = j3;
                gw70 gw70Var = bpm0Var.d;
                String str = y2r0.a;
                gw70Var.startSeek(j3);
                bpm0Var.h = 2;
            }
        }
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
