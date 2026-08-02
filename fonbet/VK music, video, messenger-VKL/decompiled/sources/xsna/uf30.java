package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import xsna.a1n0;
import xsna.a3k0;
import xsna.eg30;
import xsna.fi20;
import xsna.k4i0;
import xsna.n3i0;
import xsna.sf30;

/* compiled from: Mp4Extractor.java */
/* loaded from: classes12.dex */
public final class uf30 implements pgq {
    public long A;
    public rgq B;
    public b[] C;

    @Nullable
    public long[][] D;
    public int E;

    @Nullable
    public ib30 F;
    public final a1n0.a a;
    public final int b;
    public final boolean c;
    public final xi90 d;
    public final xi90 e;
    public final xi90 f;
    public final xi90 g;
    public final ArrayDeque<sf30.a> h;
    public final k4i0 i;
    public final ArrayList j;
    public com.google.common.collect.g k;
    public int l;
    public int m;
    public long n;
    public int o;

    @Nullable
    public xi90 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    /* compiled from: Mp4Extractor.java */
    public static final class a implements n3i0 {
        public final long a;
        public final b[] b;
        public final int c;

        public a(long j, b[] bVarArr, int i) {
            this.a = j;
            this.b = bVarArr;
            this.c = i;
        }

        @Override // xsna.n3i0
        public final long getDurationUs() {
            return this.a;
        }

        @Override // xsna.n3i0
        public final n3i0.a getSeekPoints(long j) {
            long j2;
            long j3;
            long j4;
            long[] jArr;
            long j5;
            int b;
            long j6 = j;
            b[] bVarArr = this.b;
            int length = bVarArr.length;
            p3i0 p3i0Var = p3i0.c;
            if (length == 0) {
                return new n3i0.a(p3i0Var, p3i0Var);
            }
            int i = this.c;
            int i2 = -1;
            if (i != -1) {
                vgp0 vgp0Var = bVarArr[i].b;
                int a = vgp0Var.a(j6);
                if (a == -1) {
                    a = vgp0Var.b(j6);
                }
                long[] jArr2 = vgp0Var.c;
                long[] jArr3 = vgp0Var.f;
                if (a == -1) {
                    return new n3i0.a(p3i0Var, p3i0Var);
                }
                long j7 = jArr3[a];
                j2 = jArr2[a];
                if (j7 >= j6 || a >= vgp0Var.b - 1 || (b = vgp0Var.b(j6)) == -1 || b == a) {
                    j5 = -1;
                    j4 = C.TIME_UNSET;
                } else {
                    j4 = jArr3[b];
                    j5 = jArr2[b];
                }
                j3 = j5;
                j6 = j7;
            } else {
                j2 = Long.MAX_VALUE;
                j3 = -1;
                j4 = C.TIME_UNSET;
            }
            int i3 = 0;
            long j8 = j2;
            while (i3 < bVarArr.length) {
                if (i3 != i) {
                    vgp0 vgp0Var2 = bVarArr[i3].b;
                    long[] jArr4 = vgp0Var2.c;
                    int a2 = vgp0Var2.a(j6);
                    if (a2 == i2) {
                        a2 = vgp0Var2.b(j6);
                    }
                    if (a2 == i2) {
                        jArr = jArr4;
                    } else {
                        jArr = jArr4;
                        j8 = Math.min(jArr[a2], j8);
                    }
                    if (j4 != C.TIME_UNSET) {
                        int a3 = vgp0Var2.a(j4);
                        if (a3 == -1) {
                            a3 = vgp0Var2.b(j4);
                        }
                        if (a3 != -1) {
                            j3 = Math.min(jArr[a3], j3);
                        }
                    }
                }
                i3++;
                i2 = -1;
            }
            p3i0 p3i0Var2 = new p3i0(j6, j8);
            return j4 == C.TIME_UNSET ? new n3i0.a(p3i0Var2, p3i0Var2) : new n3i0.a(p3i0Var2, new p3i0(j4, j3));
        }

        @Override // xsna.n3i0
        public final boolean isSeekable() {
            return true;
        }
    }

    /* compiled from: Mp4Extractor.java */
    public static final class b {
        public final vep0 a;
        public final vgp0 b;
        public final rgp0 c;

        @Nullable
        public final asp0 d;
        public int e;

        @Nullable
        public androidx.media3.common.a f;

        public b(vep0 vep0Var, vgp0 vgp0Var, rgp0 rgp0Var) {
            this.a = vep0Var;
            this.b = vgp0Var;
            this.c = rgp0Var;
            this.d = MimeTypes.AUDIO_TRUEHD.equals(vep0Var.g.n) ? new asp0() : null;
        }
    }

    public uf30(a1n0.a aVar, int i) {
        this.a = aVar;
        this.b = i;
        this.c = (i & 256) != 0;
        ImmutableList.b bVar = ImmutableList.c;
        this.k = com.google.common.collect.g.f;
        this.l = (i & 4) != 0 ? 3 : 0;
        this.i = new k4i0();
        this.j = new ArrayList();
        this.g = new xi90(16);
        this.h = new ArrayDeque<>();
        this.d = new xi90(rt50.a);
        this.e = new xi90(6);
        this.f = new xi90();
        this.q = -1;
        this.B = rgq.o7;
        this.C = new b[0];
    }

    @Override // xsna.pgq
    public final List a() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0648, code lost:
    
        throw androidx.media3.common.ParserException.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e A[EDGE_INSN: B:29:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:8:0x0012->B:28:0x0012], SYNTHETIC] */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        char c2;
        char c3;
        boolean z;
        sf30.a peek;
        boolean z2;
        boolean z3;
        if (!this.c || !this.z) {
            while (true) {
                int i5 = this.l;
                ArrayDeque<sf30.a> arrayDeque = this.h;
                int i6 = this.b;
                xi90 xi90Var = this.f;
                int i7 = 4;
                int i8 = 2;
                if (i5 == 0) {
                    int i9 = this.o;
                    xi90 xi90Var2 = this.g;
                    if (i9 == 0) {
                        if (!qgqVar.readFully(xi90Var2.a, 0, 8, true)) {
                            if (this.E == 2 && (i6 & 2) != 0) {
                                rgp0 track = this.B.track(0, 4);
                                ib30 ib30Var = this.F;
                                fi20 fi20Var = ib30Var == null ? null : new fi20(ib30Var);
                                a.C0043a c0043a = new a.C0043a();
                                c0043a.k = fi20Var;
                                zjh0.d(c0043a, track);
                                this.B.endTracks();
                                this.B.f(new n3i0.b(C.TIME_UNSET));
                            }
                            z3 = false;
                            if (z3) {
                                break;
                            }
                        } else {
                            this.o = 8;
                            xi90Var2.P(0);
                            this.n = xi90Var2.E();
                            this.m = xi90Var2.p();
                        }
                    }
                    long j = this.n;
                    if (j == 1) {
                        qgqVar.readFully(xi90Var2.a, 8, 8);
                        this.o += 8;
                        this.n = xi90Var2.I();
                    } else if (j == 0) {
                        long length = qgqVar.getLength();
                        if (length == -1 && (peek = arrayDeque.peek()) != null) {
                            length = peek.b;
                        }
                        if (length != -1) {
                            this.n = (length - qgqVar.getPosition()) + this.o;
                        }
                    }
                    long j2 = this.n;
                    int i10 = this.o;
                    long j3 = i10;
                    if (j2 < j3) {
                        if (this.m != 1718773093 || i10 != 8) {
                            break;
                        }
                        this.n = j3;
                    }
                    int i11 = this.m;
                    if (i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1701082227 || i11 == 1835365473 || i11 == 1635284069) {
                        z2 = true;
                        long position = qgqVar.getPosition();
                        long j4 = this.n;
                        long j5 = this.o;
                        long j6 = (position + j4) - j5;
                        if (j4 != j5 && this.m == 1835365473) {
                            xi90Var.M(8);
                            qgqVar.peekFully(xi90Var.a, 0, 8);
                            oa8.a(xi90Var);
                            qgqVar.skipFully(xi90Var.b);
                            qgqVar.resetPeekPosition();
                        }
                        arrayDeque.push(new sf30.a(this.m, j6));
                        if (this.n == this.o) {
                            f(j6);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i11 == 1835296868 || i11 == 1836476516 || i11 == 1751411826 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1937011571 || i11 == 1668576371 || i11 == 1701606260 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1953196132 || i11 == 1718909296 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124) {
                        fxc0.z(i10 == 8);
                        fxc0.z(this.n <= 2147483647L);
                        xi90 xi90Var3 = new xi90((int) this.n);
                        System.arraycopy(xi90Var2.a, 0, xi90Var3.a, 0, 8);
                        this.p = xi90Var3;
                        z2 = true;
                        this.l = 1;
                    } else {
                        long position2 = qgqVar.getPosition();
                        long j7 = this.o;
                        long j8 = position2 - j7;
                        if (this.m == 1836086884) {
                            this.F = new ib30(0L, j8, C.TIME_UNSET, j8 + j7, this.n - j7);
                        }
                        this.p = null;
                        this.l = 1;
                        z2 = true;
                    }
                    z3 = z2;
                    if (z3) {
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException();
                            }
                            k4i0 k4i0Var = this.i;
                            ArrayList arrayList = k4i0Var.a;
                            int i12 = k4i0Var.b;
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    short s = 2817;
                                    int i13 = 8;
                                    short s2 = 2192;
                                    if (i12 == 2) {
                                        long length2 = qgqVar.getLength();
                                        int i14 = k4i0Var.c - 20;
                                        xi90 xi90Var4 = new xi90(i14);
                                        qgqVar.readFully(xi90Var4.a, 0, i14);
                                        int i15 = 0;
                                        while (i15 < i14 / 12) {
                                            xi90Var4.Q(i8);
                                            xi90Var4.i(i8);
                                            byte[] bArr = xi90Var4.a;
                                            int i16 = xi90Var4.b;
                                            int i17 = i8;
                                            int i18 = i16 + 1;
                                            xi90Var4.b = i18;
                                            int i19 = bArr[i16] & 255;
                                            xi90Var4.b = i16 + 2;
                                            short s3 = (short) (i19 | ((bArr[i18] & 255) << 8));
                                            if (s3 != s2 && s3 != 2816 && s3 != s) {
                                                if (s3 != 2819 && s3 != 2820) {
                                                    xi90Var4.Q(i13);
                                                    i4 = i14;
                                                    i15++;
                                                    i14 = i4;
                                                    i8 = i17;
                                                    s = 2817;
                                                    s2 = 2192;
                                                    i13 = 8;
                                                }
                                            }
                                            i4 = i14;
                                            arrayList.add(new k4i0.a((length2 - k4i0Var.c) - xi90Var4.r(), xi90Var4.r()));
                                            i15++;
                                            i14 = i4;
                                            i8 = i17;
                                            s = 2817;
                                            s2 = 2192;
                                            i13 = 8;
                                        }
                                        if (arrayList.isEmpty()) {
                                            pzb0Var.a = 0L;
                                        } else {
                                            k4i0Var.b = 3;
                                            pzb0Var.a = ((k4i0.a) arrayList.get(0)).a;
                                        }
                                    } else {
                                        if (i12 != 3) {
                                            throw new IllegalStateException();
                                        }
                                        long position3 = qgqVar.getPosition();
                                        int length3 = (int) ((qgqVar.getLength() - qgqVar.getPosition()) - k4i0Var.c);
                                        xi90 xi90Var5 = new xi90(length3);
                                        qgqVar.readFully(xi90Var5.a, 0, length3);
                                        int i20 = 0;
                                        while (i20 < arrayList.size()) {
                                            k4i0.a aVar = (k4i0.a) arrayList.get(i20);
                                            xi90Var5.P((int) (aVar.a - position3));
                                            xi90Var5.Q(i7);
                                            int r = xi90Var5.r();
                                            Charset charset = StandardCharsets.UTF_8;
                                            String A = xi90Var5.A(r, charset);
                                            switch (A.hashCode()) {
                                                case -1711564334:
                                                    if (A.equals("SlowMotion_Data")) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (A.equals("Super_SlowMotion_Edit_Data")) {
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (A.equals("Super_SlowMotion_Data")) {
                                                        c2 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (A.equals("Super_SlowMotion_Deflickering_On")) {
                                                        c2 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (A.equals("Super_SlowMotion_BGM")) {
                                                        c2 = 4;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            c2 = 65535;
                                            switch (c2) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case 3:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            int i21 = aVar.b - (r + 8);
                                            if (c3 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List<String> c4 = k4i0.e.c(xi90Var5.A(i21, charset));
                                                for (int i22 = 0; i22 < c4.size(); i22++) {
                                                    List<String> c5 = k4i0.d.c(c4.get(i22));
                                                    if (c5.size() != 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new a3k0.a(Long.parseLong(c5.get(0)), Long.parseLong(c5.get(1)), 1 << (Integer.parseInt(c5.get(2)) - 1)));
                                                    } catch (NumberFormatException e) {
                                                        throw ParserException.a(e, null);
                                                    }
                                                }
                                                this.j.add(new a3k0(arrayList2));
                                            } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i20++;
                                            i7 = 4;
                                        }
                                        pzb0Var.a = 0L;
                                    }
                                } else {
                                    xi90 xi90Var6 = new xi90(8);
                                    qgqVar.readFully(xi90Var6.a, 0, 8);
                                    k4i0Var.c = xi90Var6.r() + 8;
                                    if (xi90Var6.p() != 1397048916) {
                                        pzb0Var.a = 0L;
                                    } else {
                                        pzb0Var.a = qgqVar.getPosition() - (k4i0Var.c - 12);
                                        k4i0Var.b = 2;
                                    }
                                }
                                i3 = 1;
                            } else {
                                long length4 = qgqVar.getLength();
                                pzb0Var.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i3 = 1;
                                k4i0Var.b = 1;
                            }
                            if (pzb0Var.a != 0) {
                                return i3;
                            }
                            this.l = 0;
                            this.o = 0;
                            return i3;
                        }
                        long position4 = qgqVar.getPosition();
                        if (this.q == -1) {
                            int i23 = 0;
                            int i24 = -1;
                            int i25 = -1;
                            boolean z4 = true;
                            boolean z5 = true;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            while (true) {
                                b[] bVarArr = this.C;
                                if (i23 >= bVarArr.length) {
                                    break;
                                }
                                b bVar = bVarArr[i23];
                                int i26 = bVar.e;
                                vgp0 vgp0Var = bVar.b;
                                if (i26 != vgp0Var.b) {
                                    long j12 = vgp0Var.c[i26];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j13 = jArr[i23][i26];
                                    long j14 = j12 - position4;
                                    boolean z6 = j14 < 0 || j14 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                    if ((!z6 && z5) || (z6 == z5 && j14 < j11)) {
                                        j10 = j13;
                                        i25 = i23;
                                        z5 = z6;
                                        j11 = j14;
                                    }
                                    if (j13 < j9) {
                                        j9 = j13;
                                        i24 = i23;
                                        z4 = z6;
                                    }
                                }
                                i23++;
                            }
                            if (j9 == Long.MAX_VALUE || !z4 || j10 < j9 + 10485760) {
                                i24 = i25;
                            }
                            this.q = i24;
                            if (i24 == -1) {
                                return -1;
                            }
                        }
                        b bVar2 = this.C[this.q];
                        rgp0 rgp0Var = bVar2.c;
                        vgp0 vgp0Var2 = bVar2.b;
                        vep0 vep0Var = bVar2.a;
                        int i27 = bVar2.e;
                        long[] jArr2 = vgp0Var2.c;
                        int[] iArr = vgp0Var2.d;
                        long j15 = jArr2[i27] + this.A;
                        int i28 = iArr[i27];
                        asp0 asp0Var = bVar2.d;
                        long j16 = (j15 - position4) + this.r;
                        if (j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            pzb0Var.a = j15;
                            return 1;
                        }
                        int i29 = vep0Var.h;
                        int i30 = vep0Var.k;
                        androidx.media3.common.a aVar2 = vep0Var.g;
                        if (i29 == 1) {
                            j16 += 8;
                            i28 -= 8;
                        }
                        qgqVar.skipFully((int) j16);
                        String str = aVar2.n;
                        String str2 = aVar2.n;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i6 & 128) == 0 : (i6 & 32) == 0) {
                            c = 1;
                            this.u = true;
                        } else {
                            c = 1;
                        }
                        if (i30 == 0) {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    ri.a(i28, xi90Var);
                                    rgp0Var.d(7, xi90Var);
                                    this.s += 7;
                                }
                                i28 += 7;
                            } else if (bVar2.f != null && Objects.equals(str2, MimeTypes.AUDIO_MPEG)) {
                                androidx.media3.common.a aVar3 = bVar2.f;
                                xi90Var.M(4);
                                qgqVar.peekFully(xi90Var.a, 0, 4);
                                qgqVar.resetPeekPosition();
                                eg30.a aVar4 = new eg30.a();
                                rgp0 rgp0Var2 = bVar2.c;
                                if (aVar4.a(xi90Var.p()) && !Objects.equals(aVar3.n, aVar4.b)) {
                                    a.C0043a a2 = aVar3.a();
                                    String str3 = aVar4.b;
                                    str3.getClass();
                                    a2.m = io20.q(str3);
                                    aVar3 = new androidx.media3.common.a(a2);
                                }
                                rgp0Var2.c(aVar3);
                                bVar2.f = null;
                            } else if (asp0Var != null) {
                                asp0Var.c(qgqVar);
                            }
                            while (true) {
                                int i31 = this.s;
                                if (i31 >= i28) {
                                    break;
                                }
                                int g = rgp0Var.g(qgqVar, i28 - i31, false);
                                this.r += g;
                                this.s += g;
                                this.t -= g;
                            }
                        } else {
                            xi90 xi90Var7 = this.e;
                            byte[] bArr2 = xi90Var7.a;
                            bArr2[0] = 0;
                            bArr2[c] = 0;
                            bArr2[2] = 0;
                            int i32 = 4 - i30;
                            i28 += i32;
                            while (this.s < i28) {
                                int i33 = this.t;
                                if (i33 == 0) {
                                    if (this.u || rt50.e(aVar2) + i30 > iArr[i27] - this.r) {
                                        i = i30;
                                        i2 = 0;
                                    } else {
                                        int e2 = rt50.e(aVar2);
                                        i = i30 + e2;
                                        i2 = e2;
                                    }
                                    qgqVar.readFully(bArr2, i32, i);
                                    this.r += i;
                                    xi90Var7.P(0);
                                    int p = xi90Var7.p();
                                    if (p < 0) {
                                        throw ParserException.a(null, "Invalid NAL length");
                                    }
                                    this.t = p - i2;
                                    xi90 xi90Var8 = this.d;
                                    xi90Var8.P(0);
                                    rgp0Var.d(4, xi90Var8);
                                    this.s += 4;
                                    if (i2 > 0) {
                                        rgp0Var.d(i2, xi90Var7);
                                        this.s += i2;
                                        if (rt50.d(bArr2, i2, aVar2)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    int g2 = rgp0Var.g(qgqVar, i33, false);
                                    this.r += g2;
                                    this.s += g2;
                                    this.t -= g2;
                                }
                            }
                        }
                        int i34 = i28;
                        long j17 = vgp0Var2.f[i27];
                        int i35 = vgp0Var2.g[i27];
                        if (!this.u) {
                            i35 |= 67108864;
                        }
                        int i36 = i35;
                        if (asp0Var != null) {
                            asp0Var.b(rgp0Var, j17, i36, i34, 0, null);
                            if (i27 + 1 == vgp0Var2.b) {
                                asp0Var.a(rgp0Var, null);
                            }
                        } else {
                            rgp0Var.a(j17, i36, i34, 0, null);
                        }
                        bVar2.e++;
                        this.q = -1;
                        this.r = 0;
                        this.s = 0;
                        this.t = 0;
                        this.u = false;
                        return 0;
                    }
                    long j18 = this.n - this.o;
                    long position5 = qgqVar.getPosition() + j18;
                    xi90 xi90Var9 = this.p;
                    if (xi90Var9 != null) {
                        qgqVar.readFully(xi90Var9.a, this.o, (int) j18);
                        if (this.m == 1718909296) {
                            this.v = true;
                            xi90Var9.P(8);
                            int p2 = xi90Var9.p();
                            int i37 = p2 != 1751476579 ? p2 != 1903435808 ? 0 : 1 : 2;
                            if (i37 == 0) {
                                xi90Var9.Q(4);
                                while (true) {
                                    if (xi90Var9.a() <= 0) {
                                        i37 = 0;
                                        break;
                                    }
                                    int p3 = xi90Var9.p();
                                    i37 = p3 != 1751476579 ? p3 != 1903435808 ? 0 : 1 : 2;
                                    if (i37 != 0) {
                                        break;
                                    }
                                }
                            }
                            this.E = i37;
                        } else if (!arrayDeque.isEmpty()) {
                            arrayDeque.peek().c.add(new sf30.b(this.m, xi90Var9));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j18 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            qgqVar.skipFully((int) j18);
                        } else {
                            pzb0Var.a = qgqVar.getPosition() + j18;
                            z = true;
                            f(position5);
                            if (this.w) {
                                this.y = true;
                                pzb0Var.a = this.x;
                                this.w = false;
                                z = true;
                            }
                            if (!((z || this.l == 2) ? false : true)) {
                                return 1;
                            }
                        }
                    }
                    z = false;
                    f(position5);
                    if (this.w) {
                    }
                    if (!((z || this.l == 2) ? false : true)) {
                    }
                }
            }
        }
        return -1;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        com.google.common.collect.g gVar;
        lbk0 B = xo9.B(qgqVar, false, (this.b & 2) != 0);
        if (B != null) {
            gVar = ImmutableList.p(B);
        } else {
            ImmutableList.b bVar = ImmutableList.c;
            gVar = com.google.common.collect.g.f;
        }
        this.k = gVar;
        return B == null;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        if ((this.b & 16) == 0) {
            rgqVar = new e1n0(rgqVar, this.a);
        }
        this.B = rgqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x011e, code lost:
    
        if (((xsna.vo10) r13).a.equals("auxiliary.tracks.offset") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (((xsna.vo10) r12).a.equals("auxiliary.tracks.interleaved") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (((xsna.vo10) r12).a.equals("auxiliary.tracks.map") != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j) throws ParserException {
        int i;
        ArrayList arrayList;
        fi20 fi20Var;
        boolean z;
        ArrayDeque<sf30.a> arrayDeque;
        boolean z2;
        fi20 fi20Var2;
        fi20 fi20Var3;
        boolean z3;
        long[][] jArr;
        ArrayList arrayList2;
        int i2;
        boolean z4;
        ArrayList arrayList3;
        boolean z5;
        int length;
        int i3;
        fi20 fi20Var4;
        long j2;
        int i4;
        int i5;
        int i6;
        fi20 fi20Var5;
        fi20 fi20Var6;
        fi20 fi20Var7;
        fi20 fi20Var8;
        ArrayList arrayList4;
        int i7;
        int i8;
        int i9;
        fi20.a aVar;
        fi20.a aVar2;
        fi20.a aVar3;
        int i10;
        while (true) {
            ArrayDeque<sf30.a> arrayDeque2 = this.h;
            int i11 = 0;
            if (arrayDeque2.isEmpty() || arrayDeque2.peek().b != j) {
                break;
            }
            sf30.a pop = arrayDeque2.pop();
            if (pop.a == 1836019574) {
                sf30.a b2 = pop.b(1835365473);
                ArrayList arrayList5 = new ArrayList();
                boolean z6 = this.c;
                long j3 = 0;
                int i12 = this.b;
                if (b2 != null) {
                    fi20Var = oa8.f(b2);
                    if (this.y) {
                        fi20Var.getClass();
                        fi20.a[] aVarArr = fi20Var.a;
                        int length2 = aVarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length2) {
                                aVar2 = null;
                                break;
                            }
                            fi20.a aVar4 = aVarArr[i13];
                            if (vo10.class.isAssignableFrom(aVar4.getClass())) {
                                aVar2 = (fi20.a) vo10.class.cast(aVar4);
                            }
                            aVar2 = null;
                            if (aVar2 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        vo10 vo10Var = (vo10) aVar2;
                        if (vo10Var != null && vo10Var.b[0] == 0) {
                            this.A = this.x + 16;
                        }
                        int length3 = aVarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length3) {
                                aVar3 = null;
                                break;
                            }
                            fi20.a aVar5 = aVarArr[i14];
                            if (vo10.class.isAssignableFrom(aVar5.getClass())) {
                                aVar3 = (fi20.a) vo10.class.cast(aVar5);
                            }
                            aVar3 = null;
                            if (aVar3 != null) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        vo10 vo10Var2 = (vo10) aVar3;
                        vo10Var2.getClass();
                        ArrayList d = vo10Var2.d();
                        ArrayList arrayList6 = new ArrayList(d.size());
                        int i15 = 0;
                        while (i15 < d.size()) {
                            int intValue = ((Integer) d.get(i15)).intValue();
                            if (intValue == 0) {
                                i10 = 1;
                            } else if (intValue != 1) {
                                i10 = 3;
                                if (intValue != 2) {
                                    i10 = intValue != 3 ? 0 : 4;
                                }
                            } else {
                                i10 = 2;
                            }
                            i15 = tv4.a(arrayList6, i10, i15, 1);
                        }
                        i = 0;
                        arrayList = arrayList6;
                    } else {
                        if (fi20Var == null || (i12 & 64) == 0) {
                            i = 0;
                        } else {
                            fi20.a[] aVarArr2 = fi20Var.a;
                            int length4 = aVarArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length4) {
                                    i = i11;
                                    aVar = null;
                                    break;
                                }
                                fi20.a aVar6 = aVarArr2[i16];
                                if (vo10.class.isAssignableFrom(aVar6.getClass())) {
                                    aVar = (fi20.a) vo10.class.cast(aVar6);
                                    i = i11;
                                } else {
                                    i = i11;
                                }
                                aVar = null;
                                if (aVar != null) {
                                    break;
                                }
                                i16++;
                                i11 = i;
                            }
                            vo10 vo10Var3 = (vo10) aVar;
                            if (vo10Var3 != null) {
                                long I = new xi90(vo10Var3.b).I();
                                if (I > 0) {
                                    this.x = I;
                                    this.w = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = true;
                                    z = z6;
                                    arrayDeque.clear();
                                    this.z = z2;
                                    if (!this.w && !z) {
                                        this.l = 2;
                                    }
                                }
                            }
                        }
                        arrayList = arrayList5;
                    }
                } else {
                    i = 0;
                    arrayList = arrayList5;
                    fi20Var = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z7 = this.E == 1 ? 1 : i;
                aht ahtVar = new aht();
                sf30.b c = pop.c(1969517665);
                if (c != null) {
                    fi20Var2 = oa8.k(c);
                    ahtVar.b(fi20Var2);
                } else {
                    fi20Var2 = null;
                }
                sf30.b c2 = pop.c(1836476516);
                c2.getClass();
                fi20.a[] aVarArr3 = new fi20.a[1];
                aVarArr3[i] = oa8.g(c2.b);
                fi20 fi20Var9 = new fi20(aVarArr3);
                if ((i12 & 1) != 0) {
                    fi20Var3 = fi20Var9;
                    z3 = 1;
                } else {
                    fi20Var3 = fi20Var9;
                    z3 = i;
                }
                fi20 fi20Var10 = fi20Var3;
                fi20 fi20Var11 = fi20Var2;
                ArrayList j4 = oa8.j(pop, ahtVar, C.TIME_UNSET, null, z3, z7, new t11(24), this.c);
                if (this.y) {
                    boolean z8 = arrayList.size() == j4.size() ? 1 : i;
                    Locale locale = Locale.US;
                    fxc0.A(z8, sl9.c(arrayList.size(), j4.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"));
                }
                String d2 = jcr.d(j4);
                int i17 = i;
                int i18 = i17;
                long j5 = C.TIME_UNSET;
                int i19 = -1;
                while (i17 < j4.size()) {
                    vgp0 vgp0Var = (vgp0) j4.get(i17);
                    int i20 = vgp0Var.b;
                    ArrayDeque<sf30.a> arrayDeque3 = arrayDeque2;
                    int i21 = vgp0Var.e;
                    vep0 vep0Var = vgp0Var.a;
                    if (i20 == 0) {
                        arrayList3 = arrayList;
                        arrayList2 = j4;
                        i3 = i17;
                        i2 = i18;
                        arrayList4 = arrayList7;
                        z4 = z6;
                        fi20Var6 = fi20Var11;
                        fi20Var7 = fi20Var10;
                        fi20Var8 = fi20Var;
                    } else {
                        arrayList2 = j4;
                        rgq rgqVar = this.B;
                        i2 = i18 + 1;
                        z4 = z6;
                        int i22 = vep0Var.b;
                        ArrayList arrayList8 = arrayList7;
                        androidx.media3.common.a aVar7 = vep0Var.g;
                        rgp0 track = rgqVar.track(i18, i22);
                        b bVar = new b(vep0Var, vgp0Var, track);
                        fi20 fi20Var12 = fi20Var;
                        long j6 = vep0Var.e;
                        if (j6 == C.TIME_UNSET) {
                            j6 = vgp0Var.i;
                        }
                        track.e(j6);
                        long max = Math.max(j5, j6);
                        String str = aVar7.n;
                        String str2 = aVar7.n;
                        int i23 = MimeTypes.AUDIO_TRUEHD.equals(str) ? i21 * 16 : i21 + 30;
                        a.C0043a a2 = aVar7.a();
                        a2.n = i23;
                        if (i22 == 2) {
                            int i24 = aVar7.f;
                            if ((i12 & 8) != 0) {
                                i24 |= i19 == -1 ? 1 : 2;
                            }
                            int i25 = i24;
                            if (this.y) {
                                i9 = i25 | 32768;
                                arrayList3 = arrayList;
                                a2.g = ((Integer) arrayList.get(i17)).intValue();
                            } else {
                                arrayList3 = arrayList;
                                i9 = i25;
                            }
                            a2.f = i9;
                        } else {
                            arrayList3 = arrayList;
                        }
                        long[] jArr2 = vgp0Var.f;
                        int[] iArr = vgp0Var.h;
                        boolean z9 = vgp0Var.j;
                        if (io20.p(str2)) {
                            if (z9) {
                                z5 = z9;
                                length = vgp0Var.b;
                            } else {
                                z5 = z9;
                                length = iArr.length;
                            }
                            int min = Math.min(length, 20);
                            fxc0.z(j6 != C.TIME_UNSET ? 1 : i);
                            i3 = i17;
                            fi20Var4 = fi20Var12;
                            long min2 = Math.min(j6, 10000000L);
                            int i26 = i;
                            int i27 = i26;
                            int i28 = -1;
                            while (i26 < min) {
                                int i29 = z5 ? i26 : iArr[i26];
                                long j7 = jArr2[i29];
                                if (j7 > min2) {
                                    break;
                                }
                                if (j7 >= 0 && (i5 = vgp0Var.d[(i4 = i29)]) > i27) {
                                    i27 = i5;
                                    i28 = i4;
                                }
                                i26++;
                            }
                            if (i28 != -1) {
                                j2 = jArr2[i28];
                                if (j2 == C.TIME_UNSET) {
                                    tso0 tso0Var = new tso0(j2);
                                    i6 = 1;
                                    fi20.a[] aVarArr4 = new fi20.a[1];
                                    aVarArr4[i] = tso0Var;
                                    fi20Var5 = new fi20(aVarArr4);
                                } else {
                                    i6 = 1;
                                    fi20Var5 = null;
                                }
                                if (i22 == i6 && (i7 = ahtVar.a) != -1 && (i8 = ahtVar.b) != -1) {
                                    a2.H = i7;
                                    a2.I = i8;
                                }
                                fi20 fi20Var13 = aVar7.l;
                                ArrayList arrayList9 = this.j;
                                fi20 fi20Var14 = !arrayList9.isEmpty() ? null : new fi20(arrayList9);
                                fi20Var6 = fi20Var11;
                                fi20Var7 = fi20Var10;
                                fi20[] fi20VarArr = {fi20Var14, fi20Var6, fi20Var7, fi20Var5};
                                fi20Var8 = fi20Var4;
                                xi20.f(i22, fi20Var8, a2, fi20Var13, fi20VarArr);
                                a2.f(d2);
                                if (Objects.equals(str2, MimeTypes.AUDIO_MPEG)) {
                                    zjh0.d(a2, bVar.c);
                                } else {
                                    bVar.f = new androidx.media3.common.a(a2);
                                }
                                if (i22 == 2 && i19 == -1) {
                                    i19 = arrayList8.size();
                                }
                                arrayList4 = arrayList8;
                                arrayList4.add(bVar);
                                j5 = max;
                            }
                        } else {
                            i3 = i17;
                            fi20Var4 = fi20Var12;
                        }
                        j2 = -9223372036854775807L;
                        if (j2 == C.TIME_UNSET) {
                        }
                        if (i22 == i6) {
                            a2.H = i7;
                            a2.I = i8;
                        }
                        fi20 fi20Var132 = aVar7.l;
                        ArrayList arrayList92 = this.j;
                        if (!arrayList92.isEmpty()) {
                        }
                        fi20Var6 = fi20Var11;
                        fi20Var7 = fi20Var10;
                        fi20[] fi20VarArr2 = {fi20Var14, fi20Var6, fi20Var7, fi20Var5};
                        fi20Var8 = fi20Var4;
                        xi20.f(i22, fi20Var8, a2, fi20Var132, fi20VarArr2);
                        a2.f(d2);
                        if (Objects.equals(str2, MimeTypes.AUDIO_MPEG)) {
                        }
                        if (i22 == 2) {
                            i19 = arrayList8.size();
                        }
                        arrayList4 = arrayList8;
                        arrayList4.add(bVar);
                        j5 = max;
                    }
                    int i30 = i3 + 1;
                    arrayList7 = arrayList4;
                    fi20Var11 = fi20Var6;
                    fi20Var = fi20Var8;
                    fi20Var10 = fi20Var7;
                    arrayDeque2 = arrayDeque3;
                    j4 = arrayList2;
                    i18 = i2;
                    z6 = z4;
                    arrayList = arrayList3;
                    i17 = i30;
                }
                arrayDeque = arrayDeque2;
                z = z6;
                boolean z10 = true;
                int i31 = -1;
                b[] bVarArr = (b[]) arrayList7.toArray(new b[i]);
                this.C = bVarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[bVarArr.length][];
                    int[] iArr2 = new int[bVarArr.length];
                    long[] jArr3 = new long[bVarArr.length];
                    boolean[] zArr = new boolean[bVarArr.length];
                    for (int i32 = 0; i32 < bVarArr.length; i32++) {
                        jArr[i32] = new long[bVarArr[i32].b.b];
                        jArr3[i32] = bVarArr[i32].b.f[0];
                    }
                    int i33 = 0;
                    while (i33 < bVarArr.length) {
                        long j8 = Long.MAX_VALUE;
                        int i34 = i31;
                        for (int i35 = 0; i35 < bVarArr.length; i35++) {
                            if (!zArr[i35]) {
                                long j9 = jArr3[i35];
                                if (j9 <= j8) {
                                    i34 = i35;
                                    j8 = j9;
                                }
                            }
                        }
                        int i36 = iArr2[i34];
                        long[] jArr4 = jArr[i34];
                        jArr4[i36] = j3;
                        vgp0 vgp0Var2 = bVarArr[i34].b;
                        boolean z11 = z10;
                        j3 += vgp0Var2.d[i36];
                        int i37 = i36 + 1;
                        iArr2[i34] = i37;
                        if (i37 < jArr4.length) {
                            jArr3[i34] = vgp0Var2.f[i37];
                        } else {
                            zArr[i34] = z11;
                            i33++;
                        }
                        z10 = z11;
                        i31 = -1;
                    }
                }
                z2 = z10;
                this.D = jArr;
                this.B.endTracks();
                this.B.f(new a(j5, this.C, i19));
                arrayDeque.clear();
                this.z = z2;
                if (!this.w) {
                    this.l = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                arrayDeque2.peek().d.add(pop);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                k4i0 k4i0Var = this.i;
                k4i0Var.a.clear();
                k4i0Var.b = 0;
                this.j.clear();
                return;
            }
        }
        for (b bVar : this.C) {
            vgp0 vgp0Var = bVar.b;
            int a2 = vgp0Var.a(j2);
            if (a2 == -1) {
                a2 = vgp0Var.b(j2);
            }
            bVar.e = a2;
            asp0 asp0Var = bVar.d;
            if (asp0Var != null) {
                asp0Var.b = false;
                asp0Var.c = 0;
            }
        }
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
