package xsna;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import xsna.a1n0;
import xsna.n3i0;
import xsna.sf30;
import xsna.xae0;

/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes12.dex */
public final class mes implements pgq {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.a P;
    public long A;
    public long B;

    @Nullable
    public b C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public rgq I;
    public rgp0[] J;
    public rgp0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final a1n0.a a;
    public final int b;
    public final List<androidx.media3.common.a> c;
    public final SparseArray<b> d;
    public final xi90 e;
    public final xi90 f;
    public final xi90 g;
    public final byte[] h;
    public final xi90 i;

    @Nullable
    public final txo0 j;
    public final y3j k;
    public final xi90 l;
    public final ArrayDeque<sf30.a> m;
    public final ArrayDeque<a> n;
    public final f0g0 o;

    @Nullable
    public final rgp0 p;
    public final mcc0 q;
    public com.google.common.collect.g r;
    public int s;
    public int t;
    public long u;
    public int v;

    @Nullable
    public xi90 w;
    public long x;
    public int y;
    public long z;

    /* compiled from: FragmentedMp4Extractor.java */
    public static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(int i, long j, boolean z) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    public static final class b {
        public final rgp0 a;
        public vgp0 d;
        public ull e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final androidx.media3.common.a j;
        public boolean m;
        public final ofp0 b = new ofp0();
        public final xi90 c = new xi90();
        public final xi90 k = new xi90(1);
        public final xi90 l = new xi90();

        public b(rgp0 rgp0Var, vgp0 vgp0Var, ull ullVar, androidx.media3.common.a aVar) {
            this.a = rgp0Var;
            this.d = vgp0Var;
            this.e = ullVar;
            this.j = aVar;
            this.d = vgp0Var;
            this.e = ullVar;
            rgp0Var.c(aVar);
            e();
        }

        public final int a() {
            int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
            return b() != null ? i | 1073741824 : i;
        }

        @Nullable
        public final lfp0 b() {
            if (!this.m) {
                return null;
            }
            ofp0 ofp0Var = this.b;
            ull ullVar = ofp0Var.a;
            String str = y2r0.a;
            int i = ullVar.a;
            lfp0 lfp0Var = ofp0Var.m;
            if (lfp0Var == null) {
                lfp0Var = this.d.a.l[i];
            }
            if (lfp0Var == null || !lfp0Var.a) {
                return null;
            }
            return lfp0Var;
        }

        public final boolean c() {
            this.f++;
            if (!this.m) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public final int d(int i, int i2) {
            xi90 xi90Var;
            lfp0 b = b();
            if (b == null) {
                return 0;
            }
            int i3 = b.d;
            ofp0 ofp0Var = this.b;
            if (i3 != 0) {
                xi90Var = ofp0Var.n;
            } else {
                byte[] bArr = b.e;
                String str = y2r0.a;
                int length = bArr.length;
                xi90 xi90Var2 = this.l;
                xi90Var2.N(bArr, length);
                i3 = bArr.length;
                xi90Var = xi90Var2;
            }
            boolean z = ofp0Var.k && ofp0Var.l[this.f];
            boolean z2 = z || i2 != 0;
            xi90 xi90Var3 = this.k;
            xi90Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
            xi90Var3.P(0);
            rgp0 rgp0Var = this.a;
            rgp0Var.b(xi90Var3, 1, 1);
            rgp0Var.b(xi90Var, i3, 1);
            if (!z2) {
                return i3 + 1;
            }
            xi90 xi90Var4 = this.c;
            if (!z) {
                xi90Var4.M(8);
                byte[] bArr2 = xi90Var4.a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                rgp0Var.b(xi90Var4, 8, 1);
                return i3 + 9;
            }
            xi90 xi90Var5 = ofp0Var.n;
            int J = xi90Var5.J();
            xi90Var5.Q(-2);
            int i4 = (J * 6) + 2;
            if (i2 != 0) {
                xi90Var4.M(i4);
                byte[] bArr3 = xi90Var4.a;
                xi90Var5.n(bArr3, 0, i4);
                int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
            } else {
                xi90Var4 = xi90Var5;
            }
            rgp0Var.b(xi90Var4, i4, 1);
            return i3 + 1 + i4;
        }

        public final void e() {
            ofp0 ofp0Var = this.b;
            ofp0Var.d = 0;
            ofp0Var.p = 0L;
            ofp0Var.q = false;
            ofp0Var.k = false;
            ofp0Var.o = false;
            ofp0Var.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.m = false;
        }
    }

    static {
        a.C0043a c0043a = new a.C0043a();
        c0043a.m = io20.q(MimeTypes.APPLICATION_EMSG);
        P = new androidx.media3.common.a(c0043a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mes(a1n0.a aVar, int i) {
        this(aVar, i, null, com.google.common.collect.g.f, null);
        ImmutableList.b bVar = ImmutableList.c;
    }

    @Nullable
    public static DrmInitData g(List<sf30.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            sf30.b bVar = list.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.b.a;
                xae0.a c = xae0.c(bArr);
                UUID uuid = c == null ? null : c.a;
                if (uuid == null) {
                    ahn.F("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static void h(xi90 xi90Var, int i, ofp0 ofp0Var) throws ParserException {
        xi90Var.P(i + 8);
        int p = xi90Var.p();
        byte[] bArr = oa8.a;
        if ((p & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (p & 2) != 0;
        int G = xi90Var.G();
        if (G == 0) {
            Arrays.fill(ofp0Var.l, 0, ofp0Var.e, false);
            return;
        }
        int i2 = ofp0Var.e;
        xi90 xi90Var2 = ofp0Var.n;
        if (G != i2) {
            StringBuilder b2 = ji.b(G, "Senc sample count ", " is different from fragment sample count");
            b2.append(ofp0Var.e);
            throw ParserException.a(null, b2.toString());
        }
        Arrays.fill(ofp0Var.l, 0, G, z);
        xi90Var2.M(xi90Var.a());
        ofp0Var.k = true;
        ofp0Var.o = true;
        xi90Var.n(xi90Var2.a, 0, xi90Var2.c);
        xi90Var2.P(0);
        ofp0Var.o = false;
    }

    public static Pair i(long j, xi90 xi90Var) throws ParserException {
        long I;
        long I2;
        xi90 xi90Var2 = xi90Var;
        xi90Var2.P(8);
        int e = oa8.e(xi90Var2.p());
        xi90Var2.Q(4);
        long E = xi90Var2.E();
        if (e == 0) {
            I = xi90Var2.E();
            I2 = xi90Var2.E();
        } else {
            I = xi90Var2.I();
            I2 = xi90Var2.I();
        }
        long j2 = I2 + j;
        String str = y2r0.a;
        long d0 = y2r0.d0(I, 1000000L, E, RoundingMode.DOWN);
        xi90Var2.Q(2);
        int J = xi90Var2.J();
        int[] iArr = new int[J];
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        long[] jArr3 = new long[J];
        long j3 = j2;
        long j4 = d0;
        int i = 0;
        while (i < J) {
            int p = xi90Var2.p();
            if ((Integer.MIN_VALUE & p) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long E2 = xi90Var2.E();
            iArr[i] = p & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            I += E2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long d02 = y2r0.d0(I, 1000000L, E, RoundingMode.DOWN);
            jArr4[i] = d02 - jArr5[i];
            xi90Var2.Q(4);
            j3 += iArr[i];
            i++;
            J = J;
            xi90Var2 = xi90Var;
            j4 = d02;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(d0), new fcc(iArr, jArr, jArr2, jArr3));
    }

    @Override // xsna.pgq
    public final List a() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x06e2, code lost:
    
        throw androidx.media3.common.ParserException.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00c8, code lost:
    
        r5 = r2.b;
        r12 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00d3, code lost:
    
        if (r32.s != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00d7, code lost:
    
        if (r2.m != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00d9, code lost:
    
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00e8, code lost:
    
        r32.D = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00f6, code lost:
    
        if (java.util.Objects.equals(r9.n, "video/avc") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x00fa, code lost:
    
        if ((r4 & 64) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x00fc, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x010f, code lost:
    
        r32.G = r4 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0117, code lost:
    
        if (r2.f >= r2.i) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0119, code lost:
    
        r33.skipFully(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0122, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0125, code lost:
    
        r3 = r5.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0129, code lost:
    
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x012b, code lost:
    
        r3.Q(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x012e, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0132, code lost:
    
        if (r5.k == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0138, code lost:
    
        if (r5.l[r1] == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x013a, code lost:
    
        r3.Q(r3.J() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0146, code lost:
    
        if (r2.c() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0148, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x014b, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x014e, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0157, code lost:
    
        if (r2.d.a.h != r22) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0159, code lost:
    
        r32.D -= 8;
        r33.skipFully(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0172, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.n) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0174, code lost:
    
        r32.E = r2.d(r32.D, 7);
        xsna.ri.a(r32.D, r8);
        r2.a.d(7, r8);
        r32.E += 7;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0199, code lost:
    
        r32.D += r32.E;
        r32.s = 4;
        r32.F = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x018f, code lost:
    
        r8 = r21;
        r32.E = r2.d(r32.D, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x00ff, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0108, code lost:
    
        if (java.util.Objects.equals(r9.n, "video/hevc") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x010c, code lost:
    
        if ((r4 & 128) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x00e2, code lost:
    
        r9 = r5.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01a4, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
        r9 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01ac, code lost:
    
        if (r2.m != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01ae, code lost:
    
        r4 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01bb, code lost:
    
        if (r6 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01bd, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01c1, code lost:
    
        r14 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01c5, code lost:
    
        if (r14 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01c7, code lost:
    
        r15 = r32.f;
        r10 = r15.a;
        r10[0] = 0;
        r10[1] = 0;
        r10[r19] = 0;
        r13 = 4 - r14;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x01d9, code lost:
    
        r20 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01df, code lost:
    
        if (r32.E >= r32.D) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x01e1, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01e3, code lost:
    
        if (r2 != 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01e8, code lost:
    
        if (r32.K.length > 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x01ec, code lost:
    
        if (r32.G != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0203, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0204, code lost:
    
        r33.readFully(r10, r13, r20 + r2);
        r15.P(0);
        r19 = r15.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0211, code lost:
    
        if (r19 < 0) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0213, code lost:
    
        r32.F = r19 - r2;
        r14 = r32.e;
        r19 = r13;
        r14.P(0);
        r9.d(4, r14);
        r32.E += 4;
        r32.D += r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0231, code lost:
    
        if (r32.K.length <= 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0233, code lost:
    
        if (r2 <= 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0235, code lost:
    
        r14 = r10[4];
        r13 = xsna.rt50.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x023f, code lost:
    
        if (java.util.Objects.equals(r13, r12) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0241, code lost:
    
        r25 = r12;
        r26 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0248, code lost:
    
        if ((r14 & 31) == 6) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0260, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0266, code lost:
    
        r32.H = r12;
        r9.d(r2, r15);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0270, code lost:
    
        if (r2 <= 0) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0274, code lost:
    
        if (r32.G != false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x027a, code lost:
    
        if (xsna.rt50.d(r10, r2, r8) == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x027c, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x027f, code lost:
    
        r13 = r19;
        r14 = r20;
        r12 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0254, code lost:
    
        if (java.util.Objects.equals(r13, "video/hevc") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x025e, code lost:
    
        if (((r26 & 126) >> 1) != 39) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0265, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x024b, code lost:
    
        r25 = r12;
        r26 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0262, code lost:
    
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x028e, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x01ee, code lost:
    
        r2 = xsna.rt50.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x01fe, code lost:
    
        if ((r20 + r2) > (r32.D - r32.E)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0200, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x028f, code lost:
    
        r25 = r12;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0296, code lost:
    
        if (r32.H == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0298, code lost:
    
        r12 = r32.g;
        r12.M(r2);
        r33.readFully(r12.a, 0, r32.F);
        r9.d(r32.F, r12);
        r2 = r32.F;
        r2 = xsna.rt50.m(r12.a, r12.c);
        r12.P(0);
        r12.O(r2);
        r2 = r8.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x02bf, code lost:
    
        if (r2 != (-1)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02c3, code lost:
    
        if (r7.e == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02c5, code lost:
    
        r7.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x02d0, code lost:
    
        r7.a(r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x02dc, code lost:
    
        if ((r17.a() & 4) == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x02de, code lost:
    
        r7.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02e1, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x02eb, code lost:
    
        r32.E += r2;
        r32.F -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02cb, code lost:
    
        if (r7.e == r2) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02cd, code lost:
    
        r7.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02e4, code lost:
    
        r2 = r9.g(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x030a, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0310, code lost:
    
        if (r32.G != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0312, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0315, code lost:
    
        r28 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x031b, code lost:
    
        if (r1 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x031d, code lost:
    
        r31 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0324, code lost:
    
        r26 = r4;
        r9.a(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0335, code lost:
    
        if (r3.isEmpty() != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0337, code lost:
    
        r1 = r3.removeFirst();
        r32.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0348, code lost:
    
        if (r1.b == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x034a, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x034c, code lost:
    
        if (r6 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x034e, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0352, code lost:
    
        r8 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0357, code lost:
    
        if (r5 >= r4) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0359, code lost:
    
        r2[r5].a(r8, 1, r1.c, r32.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x036b, code lost:
    
        if (r17.c() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x036d, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0370, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0375, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0322, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x02f6, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x02f8, code lost:
    
        r2 = r32.E;
        r7 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x02fc, code lost:
    
        if (r2 >= r7) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x02fe, code lost:
    
        r32.E += r9.g(r33, r7 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x01b5, code lost:
    
        r4 = r5.i[r2.f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        char c;
        int i;
        int i2;
        int i3;
        String x;
        String x2;
        long d0;
        long j;
        long d02;
        long E;
        while (true) {
            int i4 = this.s;
            ArrayDeque<sf30.a> arrayDeque = this.m;
            f0g0 f0g0Var = this.o;
            xi90 xi90Var = this.i;
            mcc0 mcc0Var = this.q;
            SparseArray<b> sparseArray = this.d;
            int i5 = 1;
            if (i4 != 0) {
                ArrayDeque<a> arrayDeque2 = this.n;
                int i6 = this.b;
                txo0 txo0Var = this.j;
                if (i4 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i4 != 2) {
                        b bVar = this.C;
                        if (bVar != null) {
                            c = 2;
                            i = 1;
                            i2 = 8;
                            i3 = 0;
                            break;
                        }
                        int size = sparseArray.size();
                        c = 2;
                        b bVar2 = null;
                        int i7 = 0;
                        while (i7 < size) {
                            b valueAt = sparseArray.valueAt(i7);
                            boolean z = valueAt.m;
                            int i8 = i5;
                            ofp0 ofp0Var = valueAt.b;
                            if ((z || valueAt.f != valueAt.d.b) && (!z || valueAt.h != ofp0Var.d)) {
                                long j3 = !z ? valueAt.d.c[valueAt.f] : ofp0Var.f[valueAt.h];
                                if (j3 < j2) {
                                    j2 = j3;
                                    bVar2 = valueAt;
                                }
                            }
                            i7++;
                            i5 = i8;
                        }
                        i = i5;
                        i2 = 8;
                        i3 = 0;
                        if (bVar2 == null) {
                            int position = (int) (this.x - qgqVar.getPosition());
                            if (position < 0) {
                                throw ParserException.a(null, "Offset to end of mdat was negative.");
                            }
                            qgqVar.skipFully(position);
                            f();
                        } else {
                            int position2 = (int) ((!bVar2.m ? bVar2.d.c[bVar2.f] : bVar2.b.f[bVar2.h]) - qgqVar.getPosition());
                            if (position2 < 0) {
                                ahn.F("Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            qgqVar.skipFully(position2);
                            this.C = bVar2;
                            bVar = bVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        b bVar3 = null;
                        for (int i9 = 0; i9 < size2; i9++) {
                            ofp0 ofp0Var2 = sparseArray.valueAt(i9).b;
                            if (ofp0Var2.o) {
                                long j4 = ofp0Var2.c;
                                if (j4 < j2) {
                                    bVar3 = sparseArray.valueAt(i9);
                                    j2 = j4;
                                }
                            }
                        }
                        if (bVar3 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j2 - qgqVar.getPosition());
                            if (position3 < 0) {
                                throw ParserException.a(null, "Offset to encryption data was negative.");
                            }
                            qgqVar.skipFully(position3);
                            ofp0 ofp0Var3 = bVar3.b;
                            xi90 xi90Var2 = ofp0Var3.n;
                            qgqVar.readFully(xi90Var2.a, 0, xi90Var2.c);
                            xi90Var2.P(0);
                            ofp0Var3.o = false;
                        }
                    }
                } else {
                    int i10 = (int) (this.u - this.v);
                    xi90 xi90Var3 = this.w;
                    if (xi90Var3 != null) {
                        qgqVar.readFully(xi90Var3.a, 8, i10);
                        int i11 = this.t;
                        sf30.b bVar4 = new sf30.b(i11, xi90Var3);
                        if (!arrayDeque.isEmpty()) {
                            arrayDeque.peek().c.add(bVar4);
                        } else if (i11 == 1936286840) {
                            Pair i12 = i(qgqVar.getPosition(), xi90Var3);
                            mcc0Var.i((fcc) i12.second);
                            if (!this.L) {
                                this.B = ((Long) i12.first).longValue();
                                this.I.f((n3i0) i12.second);
                                this.L = true;
                            } else if ((i6 & 256) != 0 && !this.M && ((LinkedHashMap) mcc0Var.b).size() > 1) {
                                this.N = qgqVar.getPosition();
                            }
                        } else if (i11 == 1701671783 && this.J.length != 0) {
                            xi90Var3.P(8);
                            int e = oa8.e(xi90Var3.p());
                            long j5 = C.TIME_UNSET;
                            if (e == 0) {
                                x = xi90Var3.x();
                                x.getClass();
                                x2 = xi90Var3.x();
                                x2.getClass();
                                long E2 = xi90Var3.E();
                                long E3 = xi90Var3.E();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                d0 = y2r0.d0(E3, 1000000L, E2, roundingMode);
                                long j6 = this.B;
                                j = j6 != C.TIME_UNSET ? j6 + d0 : -9223372036854775807L;
                                d02 = y2r0.d0(xi90Var3.E(), 1000L, E2, roundingMode);
                                E = xi90Var3.E();
                            } else if (e != 1) {
                                sn.d(e, "Skipping unsupported emsg version: ");
                            } else {
                                long E4 = xi90Var3.E();
                                long I = xi90Var3.I();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long d03 = y2r0.d0(I, 1000000L, E4, roundingMode2);
                                long d04 = y2r0.d0(xi90Var3.E(), 1000L, E4, roundingMode2);
                                long E5 = xi90Var3.E();
                                x = xi90Var3.x();
                                x.getClass();
                                x2 = xi90Var3.x();
                                x2.getClass();
                                d02 = d04;
                                E = E5;
                                j = d03;
                                d0 = -9223372036854775807L;
                            }
                            String str = x;
                            String str2 = x2;
                            byte[] bArr = new byte[xi90Var3.a()];
                            xi90Var3.n(bArr, 0, xi90Var3.a());
                            xi90 xi90Var4 = new xi90(this.k.a(new g0q(str, str2, d02, E, bArr)));
                            int a2 = xi90Var4.a();
                            rgp0[] rgp0VarArr = this.J;
                            int length = rgp0VarArr.length;
                            int i13 = 0;
                            while (i13 < length) {
                                rgp0 rgp0Var = rgp0VarArr[i13];
                                xi90Var4.P(0);
                                rgp0Var.d(a2, xi90Var4);
                                i13++;
                                j5 = j5;
                            }
                            if (j == j5) {
                                arrayDeque2.addLast(new a(a2, d0, true));
                                this.y += a2;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new a(a2, j, false));
                                this.y += a2;
                            } else if (txo0Var == null || txo0Var.e()) {
                                if (txo0Var != null) {
                                    j = txo0Var.a(j);
                                }
                                long j7 = j;
                                for (rgp0 rgp0Var2 : this.J) {
                                    rgp0Var2.a(j7, 1, a2, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new a(a2, j, false));
                                this.y += a2;
                            }
                        }
                    } else {
                        qgqVar.skipFully(i10);
                    }
                    j(qgqVar.getPosition());
                }
            } else {
                int i14 = this.v;
                long j8 = 0;
                xi90 xi90Var5 = this.l;
                if (i14 == 0) {
                    if (!qgqVar.readFully(xi90Var5.a, 0, 8, true)) {
                        long j9 = this.N;
                        if (j9 == -1) {
                            f0g0Var.b(0);
                            return -1;
                        }
                        pzb0Var.a = j9;
                        this.N = -1L;
                        rgq rgqVar = this.I;
                        mcc0Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (fcc fccVar : ((LinkedHashMap) mcc0Var.b).values()) {
                            arrayList.add(fccVar.b);
                            arrayList2.add(fccVar.c);
                            arrayList3.add(fccVar.d);
                            arrayList4.add(fccVar.e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            j8 += iArr2.length;
                        }
                        int i15 = (int) j8;
                        fxc0.n(j8, "the total number of elements (%s) in the arrays must fit in an int", j8 == ((long) i15));
                        int[] iArr3 = new int[i15];
                        int i16 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, i16, iArr4.length);
                            i16 += iArr4.length;
                        }
                        rgqVar.f(new fcc(iArr3, e600.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), e600.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), e600.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    xi90Var5.P(0);
                    this.u = xi90Var5.E();
                    this.t = xi90Var5.p();
                }
                long j10 = this.u;
                if (j10 == 1) {
                    qgqVar.readFully(xi90Var5.a, 8, 8);
                    this.v += 8;
                    this.u = xi90Var5.I();
                } else if (j10 == 0) {
                    long length2 = qgqVar.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = arrayDeque.peek().b;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - qgqVar.getPosition()) + this.v;
                    }
                }
                long j11 = this.u;
                int i17 = this.v;
                long j12 = i17;
                if (j11 < j12) {
                    if (this.t != 1718773093 || i17 != 8) {
                        break;
                    }
                    this.u = j12;
                }
                if (this.N != -1) {
                    if (this.t == 1936286840) {
                        xi90Var.M((int) this.u);
                        System.arraycopy(xi90Var5.a, 0, xi90Var.a, 0, 8);
                        qgqVar.readFully(xi90Var.a, 8, (int) (this.u - this.v));
                        mcc0Var.i((fcc) i(qgqVar.getPeekPosition(), xi90Var).second);
                    } else {
                        qgqVar.skipFully((int) (this.u - j12), true);
                    }
                    f();
                } else {
                    long position4 = qgqVar.getPosition() - this.v;
                    int i18 = this.t;
                    if ((i18 == 1836019558 || i18 == 1835295092) && !this.L) {
                        this.I.f(new n3i0.b(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            ofp0 ofp0Var4 = sparseArray.valueAt(i19).b;
                            ofp0Var4.getClass();
                            ofp0Var4.c = position4;
                            ofp0Var4.b = position4;
                        }
                    }
                    int i20 = this.t;
                    if (i20 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1836019558 || i20 == 1953653094 || i20 == 1836475768 || i20 == 1701082227 || i20 == 1835365473) {
                        long position5 = qgqVar.getPosition();
                        long j13 = this.u;
                        long j14 = (position5 + j13) - 8;
                        if (j13 != this.v && this.t == 1835365473) {
                            xi90Var.M(8);
                            qgqVar.peekFully(xi90Var.a, 0, 8);
                            oa8.a(xi90Var);
                            qgqVar.skipFully(xi90Var.b);
                            qgqVar.resetPeekPosition();
                        }
                        arrayDeque.push(new sf30.a(this.t, j14));
                        if (this.u == this.v) {
                            j(j14);
                        } else {
                            f();
                        }
                    } else if (i20 == 1751411826 || i20 == 1835296868 || i20 == 1836476516 || i20 == 1936286840 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1668576371 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1937011571 || i20 == 1952867444 || i20 == 1952868452 || i20 == 1953196132 || i20 == 1953654136 || i20 == 1953658222 || i20 == 1886614376 || i20 == 1935763834 || i20 == 1935763823 || i20 == 1936027235 || i20 == 1970628964 || i20 == 1935828848 || i20 == 1936158820 || i20 == 1701606260 || i20 == 1835362404 || i20 == 1701671783 || i20 == 1969517665 || i20 == 1801812339 || i20 == 1768715124) {
                        if (this.v != 8) {
                            throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        xi90 xi90Var6 = new xi90((int) this.u);
                        System.arraycopy(xi90Var5.a, 0, xi90Var6.a, 0, 8);
                        this.w = xi90Var6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.w = null;
                        this.s = 1;
                    }
                }
            }
        }
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        com.google.common.collect.g gVar;
        lbk0 B = xo9.B(qgqVar, true, false);
        if (B != null) {
            gVar = ImmutableList.p(B);
        } else {
            ImmutableList.b bVar = ImmutableList.c;
            gVar = com.google.common.collect.g.f;
        }
        this.r = gVar;
        return B == null;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            rgqVar = new e1n0(rgqVar, this.a);
        }
        this.I = rgqVar;
        f();
        rgp0[] rgp0VarArr = new rgp0[2];
        this.J = rgp0VarArr;
        int i3 = 0;
        rgp0 rgp0Var = this.p;
        if (rgp0Var != null) {
            rgp0VarArr[0] = rgp0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            rgp0VarArr[i] = this.I.track(100, 5);
            i4 = 101;
            i++;
        }
        rgp0[] rgp0VarArr2 = (rgp0[]) y2r0.U(this.J, i);
        this.J = rgp0VarArr2;
        for (rgp0 rgp0Var2 : rgp0VarArr2) {
            rgp0Var2.c(P);
        }
        List<androidx.media3.common.a> list = this.c;
        this.K = new rgp0[list.size()];
        while (i3 < this.K.length) {
            rgp0 track = this.I.track(i4, 3);
            track.c(list.get(i3));
            this.K[i3] = track;
            i3++;
            i4++;
        }
    }

    public final void f() {
        this.s = 0;
        this.v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0434, code lost:
    
        if ((xsna.y2r0.d0(r40, 1000000, r7, r46) + xsna.y2r0.d0(r7[0], 1000000, r2.c, r46)) >= r2.e) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0803, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0806, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0719  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j) throws ParserException {
        fi20 fi20Var;
        int i;
        long j2;
        ull ullVar;
        int i2;
        ull ullVar2;
        ArrayList arrayList;
        int i3;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5;
        int i6;
        int i7;
        int size;
        int i8;
        byte[] bArr;
        int i9;
        boolean z;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        int i13;
        int i14;
        int i15;
        while (true) {
            ArrayDeque<sf30.a> arrayDeque = this.m;
            if (arrayDeque.isEmpty() || arrayDeque.peek().b != j) {
                break;
            }
            sf30.a pop = arrayDeque.pop();
            int i16 = pop.a;
            ArrayList arrayList6 = pop.d;
            ArrayList arrayList7 = pop.c;
            int i17 = this.b;
            int i18 = 12;
            SparseArray<b> sparseArray = this.d;
            if (i16 == 1836019574) {
                DrmInitData g = g(arrayList7);
                sf30.a b2 = pop.b(1836475768);
                b2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList8 = b2.c;
                int size2 = arrayList8.size();
                int i19 = 0;
                long j3 = C.TIME_UNSET;
                while (i19 < size2) {
                    sf30.b bVar = (sf30.b) arrayList8.get(i19);
                    int i20 = bVar.a;
                    xi90 xi90Var = bVar.b;
                    if (i20 == 1953654136) {
                        xi90Var.P(i18);
                        arrayList = arrayList8;
                        Pair create = Pair.create(Integer.valueOf(xi90Var.p()), new ull(xi90Var.p() - 1, xi90Var.p(), xi90Var.p(), xi90Var.p()));
                        sparseArray2.put(((Integer) create.first).intValue(), (ull) create.second);
                    } else {
                        arrayList = arrayList8;
                        if (i20 == 1835362404) {
                            xi90Var.P(8);
                            j3 = oa8.e(xi90Var.p()) == 0 ? xi90Var.E() : xi90Var.I();
                        }
                    }
                    i19++;
                    arrayList8 = arrayList;
                    i18 = 12;
                }
                int i21 = 0;
                sf30.a b3 = pop.b(1835365473);
                fi20 f = b3 != null ? oa8.f(b3) : null;
                aht ahtVar = new aht();
                sf30.b c = pop.c(1969517665);
                if (c != null) {
                    fi20 k = oa8.k(c);
                    ahtVar.b(k);
                    fi20Var = k;
                } else {
                    fi20Var = null;
                }
                sf30.b c2 = pop.c(1836476516);
                c2.getClass();
                fi20 fi20Var2 = new fi20(oa8.g(c2.b));
                ArrayList j4 = oa8.j(pop, ahtVar, j3, g, (i17 & 16) != 0, false, new xl0(this, 21), false);
                int size3 = j4.size();
                if (sparseArray.size() == 0) {
                    String d = jcr.d(j4);
                    int i22 = 0;
                    while (i22 < size3) {
                        vgp0 vgp0Var = (vgp0) j4.get(i22);
                        vep0 vep0Var = vgp0Var.a;
                        rgq rgqVar = this.I;
                        int i23 = vep0Var.b;
                        int i24 = vep0Var.a;
                        ArrayList arrayList9 = j4;
                        androidx.media3.common.a aVar = vep0Var.g;
                        long j5 = vep0Var.e;
                        rgp0 track = rgqVar.track(i22, i23);
                        track.e(j5);
                        int i25 = i22;
                        a.C0043a a2 = aVar.a();
                        a2.f(d);
                        String str = d;
                        if (i23 == 1) {
                            int i26 = ahtVar.a;
                            i = size3;
                            j2 = j5;
                            if (i26 != -1 && (i2 = ahtVar.b) != -1) {
                                a2.H = i26;
                                a2.I = i2;
                            }
                        } else {
                            i = size3;
                            j2 = j5;
                        }
                        xi20.f(i23, f, a2, aVar.l, fi20Var, fi20Var2);
                        if (sparseArray2.size() == 1) {
                            ullVar = (ull) sparseArray2.valueAt(i21);
                        } else {
                            ullVar = (ull) sparseArray2.get(i24);
                            ullVar.getClass();
                        }
                        sparseArray.put(i24, new b(track, vgp0Var, ullVar, new androidx.media3.common.a(a2)));
                        this.A = Math.max(this.A, j2);
                        i22 = i25 + 1;
                        j4 = arrayList9;
                        d = str;
                        size3 = i;
                        i21 = 0;
                    }
                    this.I.endTracks();
                } else {
                    ArrayList arrayList10 = j4;
                    fxc0.z(sparseArray.size() == size3);
                    int i27 = 0;
                    while (i27 < size3) {
                        ArrayList arrayList11 = arrayList10;
                        vgp0 vgp0Var2 = (vgp0) arrayList11.get(i27);
                        vep0 vep0Var2 = vgp0Var2.a;
                        b bVar2 = sparseArray.get(vep0Var2.a);
                        int i28 = vep0Var2.a;
                        if (sparseArray2.size() == 1) {
                            ullVar2 = (ull) sparseArray2.valueAt(0);
                        } else {
                            ullVar2 = (ull) sparseArray2.get(i28);
                            ullVar2.getClass();
                        }
                        bVar2.d = vgp0Var2;
                        bVar2.e = ullVar2;
                        bVar2.a.c(bVar2.j);
                        bVar2.e();
                        i27++;
                        arrayList10 = arrayList11;
                    }
                }
            } else if (i16 == 1836019558) {
                int size4 = arrayList6.size();
                int i29 = 0;
                while (i29 < size4) {
                    sf30.a aVar2 = (sf30.a) arrayList6.get(i29);
                    if (aVar2.a == 1953653094) {
                        sf30.b c3 = aVar2.c(1952868452);
                        ArrayList arrayList12 = aVar2.c;
                        c3.getClass();
                        xi90 xi90Var2 = c3.b;
                        xi90Var2.P(8);
                        int p = xi90Var2.p();
                        byte[] bArr2 = oa8.a;
                        b bVar3 = sparseArray.get(xi90Var2.p());
                        if (bVar3 == null) {
                            i3 = size4;
                            bVar3 = null;
                        } else {
                            ofp0 ofp0Var = bVar3.b;
                            if ((p & 1) != 0) {
                                long I = xi90Var2.I();
                                ofp0Var.b = I;
                                ofp0Var.c = I;
                            }
                            ull ullVar3 = bVar3.e;
                            int p2 = (p & 2) != 0 ? xi90Var2.p() - 1 : ullVar3.a;
                            int p3 = (p & 8) != 0 ? xi90Var2.p() : ullVar3.b;
                            if ((p & 16) != 0) {
                                i3 = size4;
                                i6 = xi90Var2.p();
                            } else {
                                i3 = size4;
                                i6 = ullVar3.c;
                            }
                            ofp0Var.a = new ull(p2, p3, i6, (p & 32) != 0 ? xi90Var2.p() : ullVar3.d);
                        }
                        if (bVar3 == null) {
                            i4 = i29;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i5 = i17;
                        } else {
                            ofp0 ofp0Var2 = bVar3.b;
                            long j6 = ofp0Var2.p;
                            boolean z4 = ofp0Var2.q;
                            bVar3.e();
                            bVar3.m = true;
                            sf30.b c4 = aVar2.c(1952867444);
                            if (c4 == null || (i17 & 2) != 0) {
                                ofp0Var2.p = j6;
                                ofp0Var2.q = z4;
                            } else {
                                xi90 xi90Var3 = c4.b;
                                xi90Var3.P(8);
                                ofp0Var2.p = oa8.e(xi90Var3.p()) == 1 ? xi90Var3.I() : xi90Var3.E();
                                ofp0Var2.q = true;
                            }
                            int size5 = arrayList12.size();
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                i7 = 1953658222;
                                if (i30 >= size5) {
                                    break;
                                }
                                sf30.b bVar4 = (sf30.b) arrayList12.get(i30);
                                int i33 = i29;
                                if (bVar4.a == 1953658222) {
                                    xi90 xi90Var4 = bVar4.b;
                                    xi90Var4.P(12);
                                    int G = xi90Var4.G();
                                    if (G > 0) {
                                        i32 += G;
                                        i31++;
                                    }
                                }
                                i30++;
                                i29 = i33;
                            }
                            i4 = i29;
                            bVar3.h = 0;
                            bVar3.g = 0;
                            bVar3.f = 0;
                            ofp0Var2.d = i31;
                            ofp0Var2.e = i32;
                            if (ofp0Var2.g.length < i31) {
                                ofp0Var2.f = new long[i31];
                                ofp0Var2.g = new int[i31];
                            }
                            if (ofp0Var2.h.length < i32) {
                                int i34 = (i32 * 125) / 100;
                                ofp0Var2.h = new int[i34];
                                ofp0Var2.i = new long[i34];
                                ofp0Var2.j = new boolean[i34];
                                ofp0Var2.l = new boolean[i34];
                            }
                            int i35 = 0;
                            int i36 = 0;
                            int i37 = 0;
                            while (true) {
                                long j7 = 0;
                                if (i35 < size5) {
                                    sf30.b bVar5 = (sf30.b) arrayList12.get(i35);
                                    if (bVar5.a == i7) {
                                        int i38 = i36 + 1;
                                        xi90 xi90Var5 = bVar5.b;
                                        xi90Var5.P(8);
                                        int p4 = xi90Var5.p();
                                        byte[] bArr3 = oa8.a;
                                        i10 = i35;
                                        vep0 vep0Var3 = bVar3.d.a;
                                        arrayList4 = arrayList6;
                                        ull ullVar4 = ofp0Var2.a;
                                        String str2 = y2r0.a;
                                        arrayList5 = arrayList7;
                                        ofp0Var2.g[i36] = xi90Var5.G();
                                        long[] jArr = ofp0Var2.f;
                                        i11 = size5;
                                        i12 = i17;
                                        long j8 = ofp0Var2.b;
                                        jArr[i36] = j8;
                                        if ((p4 & 1) != 0) {
                                            jArr[i36] = j8 + xi90Var5.p();
                                        }
                                        boolean z5 = (p4 & 4) != 0;
                                        int i39 = ullVar4.d;
                                        if (z5) {
                                            i39 = xi90Var5.p();
                                        }
                                        boolean z6 = (p4 & 256) != 0;
                                        boolean z7 = z5;
                                        boolean z8 = (p4 & 512) != 0;
                                        boolean z9 = (p4 & 1024) != 0;
                                        boolean z10 = (p4 & 2048) != 0;
                                        boolean z11 = z9;
                                        long[] jArr2 = vep0Var3.i;
                                        int i40 = i39;
                                        long[] jArr3 = vep0Var3.j;
                                        if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                            z2 = z6;
                                        } else {
                                            long j9 = jArr2[0];
                                            if (j9 == 0) {
                                                z2 = z6;
                                            } else {
                                                z2 = z6;
                                                long j10 = vep0Var3.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j7 = jArr3[0];
                                        }
                                        int[] iArr = ofp0Var2.h;
                                        long[] jArr4 = ofp0Var2.i;
                                        boolean z12 = z2;
                                        boolean[] zArr = ofp0Var2.j;
                                        boolean z13 = vep0Var3.b == 2 && (i12 & 1) != 0;
                                        int i41 = ofp0Var2.g[i36] + i37;
                                        int i42 = i37;
                                        long j11 = vep0Var3.c;
                                        boolean z14 = z10;
                                        long j12 = ofp0Var2.p;
                                        int i43 = i42;
                                        while (i43 < i41) {
                                            int p5 = z12 ? xi90Var5.p() : ullVar4.b;
                                            boolean z15 = z14;
                                            if (p5 < 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + p5);
                                            }
                                            if (z8) {
                                                z3 = z13;
                                                i13 = xi90Var5.p();
                                            } else {
                                                z3 = z13;
                                                i13 = ullVar4.c;
                                            }
                                            if (i13 < 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + i13);
                                            }
                                            int p6 = z11 ? xi90Var5.p() : (i43 == 0 && z7) ? i40 : ullVar4.d;
                                            if (z15) {
                                                i14 = p6;
                                                i15 = xi90Var5.p();
                                            } else {
                                                i14 = p6;
                                                i15 = 0;
                                            }
                                            int i44 = i41;
                                            long[] jArr5 = jArr4;
                                            long d0 = y2r0.d0((i15 + j12) - j7, 1000000L, j11, RoundingMode.DOWN);
                                            jArr5[i43] = d0;
                                            if (!ofp0Var2.q) {
                                                jArr5[i43] = d0 + bVar3.d.i;
                                            }
                                            iArr[i43] = i13;
                                            zArr[i43] = ((i14 >> 16) & 1) == 0 && (!z3 || i43 == 0);
                                            j12 += p5;
                                            i43++;
                                            z14 = z15;
                                            z13 = z3;
                                            jArr4 = jArr5;
                                            i41 = i44;
                                        }
                                        ofp0Var2.p = j12;
                                        i36 = i38;
                                        i37 = i41;
                                    } else {
                                        i10 = i35;
                                        arrayList4 = arrayList6;
                                        arrayList5 = arrayList7;
                                        i11 = size5;
                                        i12 = i17;
                                    }
                                    i35 = i10 + 1;
                                    arrayList6 = arrayList4;
                                    arrayList7 = arrayList5;
                                    i17 = i12;
                                    size5 = i11;
                                    i7 = 1953658222;
                                } else {
                                    arrayList2 = arrayList6;
                                    arrayList3 = arrayList7;
                                    i5 = i17;
                                    vep0 vep0Var4 = bVar3.d.a;
                                    ull ullVar5 = ofp0Var2.a;
                                    ullVar5.getClass();
                                    lfp0 lfp0Var = vep0Var4.l[ullVar5.a];
                                    sf30.b c5 = aVar2.c(1935763834);
                                    if (c5 != null) {
                                        lfp0Var.getClass();
                                        xi90 xi90Var6 = c5.b;
                                        int i45 = lfp0Var.d;
                                        xi90Var6.P(8);
                                        int p7 = xi90Var6.p();
                                        byte[] bArr4 = oa8.a;
                                        if ((p7 & 1) == 1) {
                                            xi90Var6.Q(8);
                                        }
                                        int C = xi90Var6.C();
                                        int G2 = xi90Var6.G();
                                        if (G2 > ofp0Var2.e) {
                                            StringBuilder b4 = ji.b(G2, "Saiz sample count ", " is greater than fragment sample count");
                                            b4.append(ofp0Var2.e);
                                            throw ParserException.a(null, b4.toString());
                                        }
                                        if (C == 0) {
                                            boolean[] zArr2 = ofp0Var2.l;
                                            i9 = 0;
                                            for (int i46 = 0; i46 < G2; i46++) {
                                                int C2 = xi90Var6.C();
                                                i9 += C2;
                                                zArr2[i46] = C2 > i45;
                                            }
                                            z = false;
                                        } else {
                                            boolean z16 = C > i45;
                                            i9 = C * G2;
                                            z = false;
                                            Arrays.fill(ofp0Var2.l, 0, G2, z16);
                                        }
                                        Arrays.fill(ofp0Var2.l, G2, ofp0Var2.e, z);
                                        if (i9 > 0) {
                                            ofp0Var2.n.M(i9);
                                            ofp0Var2.k = true;
                                            ofp0Var2.o = true;
                                        }
                                    }
                                    sf30.b c6 = aVar2.c(1935763823);
                                    if (c6 != null) {
                                        xi90 xi90Var7 = c6.b;
                                        xi90Var7.P(8);
                                        int p8 = xi90Var7.p();
                                        byte[] bArr5 = oa8.a;
                                        if ((p8 & 1) == 1) {
                                            xi90Var7.Q(8);
                                        }
                                        int G3 = xi90Var7.G();
                                        if (G3 != 1) {
                                            throw ParserException.a(null, "Unexpected saio entry count: " + G3);
                                        }
                                        ofp0Var2.c += oa8.e(p8) == 0 ? xi90Var7.E() : xi90Var7.I();
                                    }
                                    sf30.b c7 = aVar2.c(1936027235);
                                    if (c7 != null) {
                                        h(c7.b, 0, ofp0Var2);
                                    }
                                    String str3 = lfp0Var != null ? lfp0Var.b : null;
                                    xi90 xi90Var8 = null;
                                    xi90 xi90Var9 = null;
                                    for (int i47 = 0; i47 < arrayList12.size(); i47++) {
                                        sf30.b bVar6 = (sf30.b) arrayList12.get(i47);
                                        xi90 xi90Var10 = bVar6.b;
                                        int i48 = bVar6.a;
                                        if (i48 == 1935828848) {
                                            xi90Var10.P(12);
                                            if (xi90Var10.p() == 1936025959) {
                                                xi90Var8 = xi90Var10;
                                            }
                                        } else if (i48 == 1936158820) {
                                            xi90Var10.P(12);
                                            if (xi90Var10.p() == 1936025959) {
                                                xi90Var9 = xi90Var10;
                                            }
                                        }
                                    }
                                    if (xi90Var8 != null && xi90Var9 != null) {
                                        xi90Var8.P(8);
                                        int e = oa8.e(xi90Var8.p());
                                        xi90Var8.Q(4);
                                        if (e == 1) {
                                            xi90Var8.Q(4);
                                        }
                                        if (xi90Var8.p() != 1) {
                                            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        xi90Var9.P(8);
                                        int e2 = oa8.e(xi90Var9.p());
                                        xi90Var9.Q(4);
                                        if (e2 == 1) {
                                            if (xi90Var9.E() == 0) {
                                                throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e2 >= 2) {
                                            xi90Var9.Q(4);
                                        }
                                        if (xi90Var9.E() != 1) {
                                            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        xi90Var9.Q(1);
                                        int C3 = xi90Var9.C();
                                        int i49 = (C3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                        int i50 = C3 & 15;
                                        boolean z17 = xi90Var9.C() == 1;
                                        if (z17) {
                                            int C4 = xi90Var9.C();
                                            byte[] bArr6 = new byte[16];
                                            xi90Var9.n(bArr6, 0, 16);
                                            if (C4 == 0) {
                                                int C5 = xi90Var9.C();
                                                byte[] bArr7 = new byte[C5];
                                                xi90Var9.n(bArr7, 0, C5);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            ofp0Var2.k = true;
                                            ofp0Var2.m = new lfp0(z17, str3, C4, bArr6, i49, i50, bArr);
                                            size = arrayList12.size();
                                            for (i8 = 0; i8 < size; i8++) {
                                                sf30.b bVar7 = (sf30.b) arrayList12.get(i8);
                                                if (bVar7.a == 1970628964) {
                                                    xi90 xi90Var11 = bVar7.b;
                                                    xi90Var11.P(8);
                                                    byte[] bArr8 = this.h;
                                                    xi90Var11.n(bArr8, 0, 16);
                                                    if (Arrays.equals(bArr8, O)) {
                                                        h(xi90Var11, 16, ofp0Var2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList12.size();
                                    while (i8 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i3 = size4;
                        i4 = i29;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = i17;
                    }
                    i29 = i4 + 1;
                    size4 = i3;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    i17 = i5;
                }
                DrmInitData g2 = g(arrayList7);
                if (g2 != null) {
                    int size6 = sparseArray.size();
                    for (int i51 = 0; i51 < size6; i51++) {
                        b valueAt = sparseArray.valueAt(i51);
                        vep0 vep0Var5 = valueAt.d.a;
                        ull ullVar6 = valueAt.b.a;
                        String str4 = y2r0.a;
                        lfp0 lfp0Var2 = vep0Var5.l[ullVar6.a];
                        DrmInitData a3 = g2.a(lfp0Var2 != null ? lfp0Var2.b : null);
                        a.C0043a a4 = valueAt.j.a();
                        a4.q = a3;
                        valueAt.a.c(new androidx.media3.common.a(a4));
                    }
                }
                if (this.z != C.TIME_UNSET) {
                    int size7 = sparseArray.size();
                    for (int i52 = 0; i52 < size7; i52++) {
                        b valueAt2 = sparseArray.valueAt(i52);
                        long j13 = this.z;
                        int i53 = valueAt2.f;
                        while (true) {
                            ofp0 ofp0Var3 = valueAt2.b;
                            if (i53 < ofp0Var3.e && ofp0Var3.i[i53] <= j13) {
                                if (ofp0Var3.j[i53]) {
                                    valueAt2.i = i53;
                                }
                                i53++;
                            }
                        }
                    }
                    this.z = C.TIME_UNSET;
                }
            } else if (!arrayDeque.isEmpty()) {
                arrayDeque.peek().d.add(pop);
            }
        }
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        SparseArray<b> sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).e();
        }
        this.n.clear();
        this.y = 0;
        this.o.d.clear();
        this.z = j2;
        this.m.clear();
        f();
    }

    public mes(a1n0.a aVar, int i, @Nullable txo0 txo0Var, List list, @Nullable rgp0 rgp0Var) {
        this.a = aVar;
        this.b = i;
        this.j = txo0Var;
        this.c = Collections.unmodifiableList(list);
        this.p = rgp0Var;
        this.k = new y3j();
        this.l = new xi90(16);
        this.e = new xi90(rt50.a);
        this.f = new xi90(6);
        this.g = new xi90();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new xi90(bArr);
        this.m = new ArrayDeque<>();
        this.n = new ArrayDeque<>();
        this.d = new SparseArray<>();
        ImmutableList.b bVar = ImmutableList.c;
        this.r = com.google.common.collect.g.f;
        this.A = C.TIME_UNSET;
        this.z = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.I = rgq.o7;
        this.J = new rgp0[0];
        this.K = new rgp0[0];
        this.o = new f0g0(new ft0(this, 24));
        this.q = new mcc0(3);
        this.N = -1L;
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
