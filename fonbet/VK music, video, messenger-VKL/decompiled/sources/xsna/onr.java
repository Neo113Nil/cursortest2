package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import xsna.mnr;
import xsna.n3i0;
import xsna.pnr;
import xsna.tnr;

/* compiled from: FlacExtractor.java */
/* loaded from: classes12.dex */
public final class onr implements pgq {
    public rgq e;
    public rgp0 f;

    @Nullable
    public fi20 h;
    public tnr i;
    public int j;
    public int k;
    public mnr l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final xi90 b = new xi90(new byte[32768], 0);
    public final boolean c = false;
    public final pnr.a d = new pnr.a();
    public int g = 0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        tnr tnrVar;
        int i;
        n3i0 bVar;
        long j;
        long j2;
        boolean z;
        long K;
        long j3;
        int i2 = this.g;
        fi20 fi20Var = null;
        if (i2 == 0) {
            qgqVar.resetPeekPosition();
            long peekPosition = qgqVar.getPeekPosition();
            fi20 a = new bsv().a(qgqVar, !this.c ? null : zrv.d, 0);
            if (a != null && a.a.length != 0) {
                fi20Var = a;
            }
            qgqVar.skipFully((int) (qgqVar.getPeekPosition() - peekPosition));
            this.h = fi20Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            qgqVar.peekFully(bArr, 0, bArr.length);
            qgqVar.resetPeekPosition();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i2 == 2) {
            xi90 xi90Var = new xi90(4);
            qgqVar.readFully(xi90Var.a, 0, 4);
            if (xi90Var.E() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 6;
        if (i2 == 3) {
            int i6 = 0;
            tnr tnrVar2 = this.i;
            boolean z2 = false;
            while (!z2) {
                qgqVar.resetPeekPosition();
                byte[] bArr2 = new byte[i3];
                wi90 wi90Var = new wi90(bArr2, i3);
                int i7 = i6;
                qgqVar.peekFully(bArr2, i7, i3);
                boolean f = wi90Var.f();
                int g = wi90Var.g(r10);
                int g2 = wi90Var.g(24) + i3;
                if (g == 0) {
                    byte[] bArr3 = new byte[38];
                    qgqVar.readFully(bArr3, i7, 38);
                    tnrVar2 = new tnr(bArr3, i3);
                } else {
                    if (tnrVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    fi20 fi20Var2 = tnrVar2.l;
                    if (g == i4) {
                        xi90 xi90Var2 = new xi90(g2);
                        qgqVar.readFully(xi90Var2.a, i7, g2);
                        tnrVar2 = new tnr(tnrVar2.a, tnrVar2.b, tnrVar2.c, tnrVar2.d, tnrVar2.e, tnrVar2.g, tnrVar2.h, tnrVar2.j, qnr.a(xi90Var2), tnrVar2.l);
                    } else {
                        if (g == i3) {
                            xi90 xi90Var3 = new xi90(g2);
                            qgqVar.readFully(xi90Var3.a, 0, g2);
                            xi90Var3.Q(i3);
                            fi20 a2 = j7x0.a(Arrays.asList(j7x0.b(xi90Var3, false, false).a));
                            if (fi20Var2 != null) {
                                a2 = fi20Var2.b(a2);
                            }
                            tnrVar = new tnr(tnrVar2.a, tnrVar2.b, tnrVar2.c, tnrVar2.d, tnrVar2.e, tnrVar2.g, tnrVar2.h, tnrVar2.j, tnrVar2.k, a2);
                        } else if (g == i5) {
                            xi90 xi90Var4 = new xi90(g2);
                            qgqVar.readFully(xi90Var4.a, 0, g2);
                            xi90Var4.Q(4);
                            fi20 fi20Var3 = new fi20(ImmutableList.p(rja0.d(xi90Var4)));
                            if (fi20Var2 != null) {
                                fi20Var3 = fi20Var2.b(fi20Var3);
                            }
                            tnrVar = new tnr(tnrVar2.a, tnrVar2.b, tnrVar2.c, tnrVar2.d, tnrVar2.e, tnrVar2.g, tnrVar2.h, tnrVar2.j, tnrVar2.k, fi20Var3);
                        } else {
                            qgqVar.skipFully(g2);
                        }
                        tnrVar2 = tnrVar;
                    }
                }
                String str = y2r0.a;
                this.i = tnrVar2;
                z2 = f;
                i3 = 4;
                i4 = 3;
                r10 = 7;
                i5 = 6;
                i6 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            androidx.media3.common.a c = this.i.c(bArr, this.h);
            rgp0 rgp0Var = this.f;
            a.C0043a a3 = c.a();
            a3.l = io20.q(MimeTypes.AUDIO_FLAC);
            zjh0.d(a3, rgp0Var);
            this.f.e(this.i.b());
            this.g = 4;
            return 0;
        }
        long j4 = 0;
        if (i2 == 4) {
            qgqVar.resetPeekPosition();
            xi90 xi90Var5 = new xi90(2);
            qgqVar.peekFully(xi90Var5.a, 0, 2);
            int J = xi90Var5.J();
            if ((J >> 2) != 16382) {
                qgqVar.resetPeekPosition();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            qgqVar.resetPeekPosition();
            this.k = J;
            rgq rgqVar = this.e;
            String str2 = y2r0.a;
            long position = qgqVar.getPosition();
            long length = qgqVar.getLength();
            this.i.getClass();
            tnr tnrVar3 = this.i;
            tnr.a aVar = tnrVar3.k;
            if (aVar != null && aVar.a.length > 0) {
                bVar = new snr(tnrVar3, position);
                i = 0;
            } else if (length == -1 || tnrVar3.j <= 0) {
                i = 0;
                bVar = new n3i0.b(tnrVar3.b());
            } else {
                int i8 = this.k;
                int i9 = tnrVar3.c;
                w7 w7Var = new w7(tnrVar3, 21);
                mnr.a aVar2 = new mnr.a(tnrVar3, i8);
                long b = tnrVar3.b();
                long j5 = tnrVar3.j;
                int i10 = tnrVar3.d;
                if (i10 > 0) {
                    i = 0;
                    j = ((i10 + i9) / 2) + 1;
                } else {
                    i = 0;
                    int i11 = tnrVar3.a;
                    j = 64 + (((((i11 != tnrVar3.b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * tnrVar3.g) * tnrVar3.h) / 8);
                }
                mnr mnrVar = new mnr(w7Var, aVar2, b, j5, position, length, j, Math.max(6, i9));
                this.l = mnrVar;
                bVar = mnrVar.a;
            }
            rgqVar.f(bVar);
            this.g = 5;
            return i;
        }
        if (i2 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        mnr mnrVar2 = this.l;
        if (mnrVar2 != null && mnrVar2.c != null) {
            return mnrVar2.a(qgqVar, pzb0Var);
        }
        if (this.n == -1) {
            tnr tnrVar4 = this.i;
            qgqVar.resetPeekPosition();
            qgqVar.advancePeekPosition(1);
            byte[] bArr4 = new byte[1];
            qgqVar.peekFully(bArr4, 0, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            qgqVar.advancePeekPosition(2);
            r10 = z3 ? 7 : 6;
            xi90 xi90Var6 = new xi90(r10);
            byte[] bArr5 = xi90Var6.a;
            int i12 = 0;
            while (i12 < r10) {
                int a4 = qgqVar.a(i12, r10 - i12, bArr5);
                if (a4 == -1) {
                    break;
                }
                i12 += a4;
            }
            xi90Var6.O(i12);
            qgqVar.resetPeekPosition();
            try {
                K = xi90Var6.K();
                if (!z3) {
                    K *= tnrVar4.b;
                }
                j3 = tnrVar4.j;
            } catch (NumberFormatException unused) {
            }
            if (j3 == 0 || K <= j3) {
                j4 = K;
                if (r4) {
                    throw ParserException.a(null, null);
                }
                this.n = j4;
            }
            r4 = false;
            if (r4) {
            }
        } else {
            xi90 xi90Var7 = this.b;
            int i13 = xi90Var7.c;
            if (i13 < 32768) {
                int read = qgqVar.read(xi90Var7.a, i13, 32768 - i13);
                r4 = read == -1;
                if (!r4) {
                    xi90Var7.O(i13 + read);
                } else if (xi90Var7.a() == 0) {
                    long j6 = this.n * 1000000;
                    tnr tnrVar5 = this.i;
                    String str3 = y2r0.a;
                    this.f.a(j6 / tnrVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int i14 = xi90Var7.b;
            int i15 = this.m;
            int i16 = this.j;
            if (i15 < i16) {
                xi90Var7.Q(Math.min(i16 - i15, xi90Var7.a()));
            }
            this.i.getClass();
            int i17 = xi90Var7.b;
            while (true) {
                int i18 = xi90Var7.c - 16;
                pnr.a aVar3 = this.d;
                if (i17 <= i18) {
                    xi90Var7.P(i17);
                    if (pnr.a(xi90Var7, this.i, this.k, aVar3)) {
                        xi90Var7.P(i17);
                        j2 = aVar3.a;
                        break;
                    }
                    i17++;
                } else {
                    if (r4) {
                        while (true) {
                            int i19 = xi90Var7.c;
                            if (i17 > i19 - this.j) {
                                xi90Var7.P(i19);
                                break;
                            }
                            xi90Var7.P(i17);
                            try {
                                z = pnr.a(xi90Var7, this.i, this.k, aVar3);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (xi90Var7.b > xi90Var7.c) {
                                z = false;
                            }
                            if (z) {
                                xi90Var7.P(i17);
                                j2 = aVar3.a;
                                break;
                            }
                            i17++;
                        }
                    } else {
                        xi90Var7.P(i17);
                    }
                    j2 = -1;
                }
            }
            int i20 = xi90Var7.b - i14;
            xi90Var7.P(i14);
            this.f.d(i20, xi90Var7);
            int i21 = this.m + i20;
            this.m = i21;
            if (j2 != -1) {
                long j7 = this.n * 1000000;
                tnr tnrVar6 = this.i;
                String str4 = y2r0.a;
                this.f.a(j7 / tnrVar6.e, 1, i21, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length2 = xi90Var7.a.length - xi90Var7.c;
            if (xi90Var7.a() < 16 && length2 < 16) {
                int a5 = xi90Var7.a();
                byte[] bArr6 = xi90Var7.a;
                System.arraycopy(bArr6, xi90Var7.b, bArr6, 0, a5);
                xi90Var7.P(0);
                xi90Var7.O(a5);
            }
        }
        return 0;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        fi20 a = new bsv().a(qgqVar, zrv.d, 0);
        if (a != null) {
            int length = a.a.length;
        }
        xi90 xi90Var = new xi90(4);
        ((tel) qgqVar).peekFully(xi90Var.a, 0, 4, false);
        return xi90Var.E() == 1716281667;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.e = rgqVar;
        this.f = rgqVar.track(0, 1);
        rgqVar.endTracks();
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            mnr mnrVar = this.l;
            if (mnrVar != null) {
                mnrVar.c(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.M(0);
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
