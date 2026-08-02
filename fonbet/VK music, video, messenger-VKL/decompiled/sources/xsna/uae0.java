package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import xsna.n3i0;
import xsna.rae0;
import xsna.tsp0;
import xsna.u27;

/* compiled from: PsExtractor.java */
/* loaded from: classes12.dex */
public final class uae0 implements pgq {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;

    @Nullable
    public rae0 i;
    public rgq j;
    public boolean k;
    public final txo0 a = new txo0(0);
    public final xi90 c = new xi90(4096);
    public final SparseArray<a> b = new SparseArray<>();
    public final sae0 d = new sae0();

    /* compiled from: PsExtractor.java */
    public static final class a {
        public final zap a;
        public final txo0 b;
        public final wi90 c = new wi90(new byte[64], 64);
        public boolean d;
        public boolean e;
        public boolean f;
        public long g;

        public a(zap zapVar, txo0 txo0Var) {
            this.a = zapVar;
            this.b = txo0Var;
        }
    }

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        int i;
        int i2;
        long j;
        zap zapVar;
        long j2;
        this.j.getClass();
        long length = qgqVar.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = C.TIME_UNSET;
        sae0 sae0Var = this.d;
        if (i3 != 0 && !sae0Var.c) {
            txo0 txo0Var = sae0Var.a;
            xi90 xi90Var = sae0Var.b;
            if (!sae0Var.e) {
                long length2 = qgqVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j4 = length2 - min;
                if (qgqVar.getPosition() != j4) {
                    pzb0Var.a = j4;
                    return 1;
                }
                xi90Var.M(min);
                qgqVar.resetPeekPosition();
                qgqVar.peekFully(xi90Var.a, 0, min);
                int i4 = xi90Var.b;
                int i5 = xi90Var.c - 4;
                while (true) {
                    if (i5 < i4) {
                        break;
                    }
                    if (sae0.b(i5, xi90Var.a) == 442) {
                        xi90Var.P(i5 + 4);
                        long c = sae0.c(xi90Var);
                        if (c != C.TIME_UNSET) {
                            j3 = c;
                            break;
                        }
                    }
                    i5--;
                }
                sae0Var.g = j3;
                sae0Var.e = true;
                return 0;
            }
            if (sae0Var.g == C.TIME_UNSET) {
                sae0Var.a(qgqVar);
                return 0;
            }
            if (sae0Var.d) {
                long j5 = sae0Var.f;
                if (j5 == C.TIME_UNSET) {
                    sae0Var.a(qgqVar);
                    return 0;
                }
                sae0Var.h = txo0Var.c(sae0Var.g) - txo0Var.b(j5);
                sae0Var.a(qgqVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, qgqVar.getLength());
            long j6 = 0;
            if (qgqVar.getPosition() != j6) {
                pzb0Var.a = j6;
                return 1;
            }
            xi90Var.M(min2);
            qgqVar.resetPeekPosition();
            qgqVar.peekFully(xi90Var.a, 0, min2);
            int i6 = xi90Var.b;
            int i7 = xi90Var.c;
            while (true) {
                if (i6 >= i7 - 3) {
                    j2 = -9223372036854775807L;
                    break;
                }
                if (sae0.b(i6, xi90Var.a) == 442) {
                    xi90Var.P(i6 + 4);
                    long c2 = sae0.c(xi90Var);
                    if (c2 != C.TIME_UNSET) {
                        j2 = c2;
                        break;
                    }
                }
                i6++;
            }
            sae0Var.f = j2;
            sae0Var.d = true;
            return 0;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j7 = sae0Var.h;
            if (j7 != C.TIME_UNSET) {
                i = i3;
                i2 = 4;
                rae0 rae0Var = new rae0(new u27.b(), new rae0.a(sae0Var.a), j7, j7 + 1, 0L, length, 188L, 1000);
                this.i = rae0Var;
                this.j.f(rae0Var.a);
            } else {
                i = i3;
                i2 = 4;
                this.j.f(new n3i0.b(j7));
            }
        }
        rae0 rae0Var2 = this.i;
        if (rae0Var2 != null && rae0Var2.c != null) {
            return rae0Var2.a(qgqVar, pzb0Var);
        }
        qgqVar.resetPeekPosition();
        long peekPosition = i != 0 ? length - qgqVar.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        xi90 xi90Var2 = this.c;
        if (!qgqVar.peekFully(xi90Var2.a, 0, i2, true)) {
            return -1;
        }
        xi90Var2.P(0);
        int p = xi90Var2.p();
        if (p == 441) {
            return -1;
        }
        if (p == 442) {
            qgqVar.peekFully(xi90Var2.a, 0, 10);
            xi90Var2.P(9);
            qgqVar.skipFully((xi90Var2.C() & 7) + 14);
            return 0;
        }
        if (p == 443) {
            qgqVar.peekFully(xi90Var2.a, 0, 2);
            xi90Var2.P(0);
            qgqVar.skipFully(xi90Var2.J() + 6);
            return 0;
        }
        if (((p & (-256)) >> 8) != 1) {
            qgqVar.skipFully(1);
            return 0;
        }
        int i8 = p & 255;
        SparseArray<a> sparseArray = this.b;
        a aVar = sparseArray.get(i8);
        if (!this.e) {
            if (aVar == null) {
                if (i8 == 189) {
                    zapVar = new mi("video/mp2p");
                    this.f = true;
                    this.h = qgqVar.getPosition();
                } else if ((p & 224) == 192) {
                    zapVar = new dg30(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = qgqVar.getPosition();
                } else if ((p & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    zapVar = new fsu(null, "video/mp2p");
                    this.g = true;
                    this.h = qgqVar.getPosition();
                } else {
                    zapVar = null;
                }
                if (zapVar != null) {
                    zapVar.b(this.j, new tsp0.c(i8, 256));
                    aVar = new a(zapVar, this.a);
                    sparseArray.put(i8, aVar);
                }
            }
            if (qgqVar.getPosition() > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.endTracks();
            }
        }
        qgqVar.peekFully(xi90Var2.a, 0, 2);
        xi90Var2.P(0);
        int J = xi90Var2.J() + 6;
        if (aVar == null) {
            qgqVar.skipFully(J);
            return 0;
        }
        xi90Var2.M(J);
        qgqVar.readFully(xi90Var2.a, 0, J);
        xi90Var2.P(6);
        zap zapVar2 = aVar.a;
        wi90 wi90Var = aVar.c;
        xi90Var2.n(wi90Var.b, 0, 3);
        wi90Var.m(0);
        wi90Var.o(8);
        aVar.d = wi90Var.f();
        aVar.e = wi90Var.f();
        wi90Var.o(6);
        xi90Var2.n(wi90Var.b, 0, wi90Var.g(8));
        wi90Var.m(0);
        txo0 txo0Var2 = aVar.b;
        aVar.g = 0L;
        if (aVar.d) {
            wi90Var.o(4);
            wi90Var.o(1);
            wi90Var.o(1);
            long g = (wi90Var.g(3) << 30) | (wi90Var.g(15) << 15) | wi90Var.g(15);
            wi90Var.o(1);
            if (aVar.f || !aVar.e) {
                j = g;
            } else {
                wi90Var.o(4);
                wi90Var.o(1);
                wi90Var.o(1);
                wi90Var.o(1);
                txo0Var2.b((wi90Var.g(15) << 15) | (wi90Var.g(3) << 30) | wi90Var.g(15));
                aVar.f = true;
                j = g;
            }
            aVar.g = txo0Var2.b(j);
        }
        zapVar2.c(4, aVar.g);
        zapVar2.a(xi90Var2);
        zapVar2.d(false);
        xi90Var2.O(xi90Var2.a.length);
        return 0;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        byte[] bArr = new byte[14];
        tel telVar = (tel) qgqVar;
        telVar.peekFully(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            telVar.b(bArr[13] & 7, false);
            telVar.peekFully(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.j = rgqVar;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        long j3;
        SparseArray<a> sparseArray = this.b;
        txo0 txo0Var = this.a;
        synchronized (txo0Var) {
            j3 = txo0Var.b;
        }
        boolean z = j3 == C.TIME_UNSET;
        if (!z) {
            long d = txo0Var.d();
            z = (d == C.TIME_UNSET || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            txo0Var.f(j2);
        }
        rae0 rae0Var = this.i;
        if (rae0Var != null) {
            rae0Var.c(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            a valueAt = sparseArray.valueAt(i);
            valueAt.f = false;
            valueAt.a.seek();
        }
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
