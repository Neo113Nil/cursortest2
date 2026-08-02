package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import xsna.eg30;
import xsna.fi20;
import xsna.i4i0;
import xsna.qf30;

/* compiled from: Mp3Extractor.java */
/* loaded from: classes12.dex */
public final class pf30 implements pgq {
    public static final of30 v = new of30();
    public final long a;
    public final xi90 b;
    public final eg30.a c;
    public final aht d;
    public final bsv e;
    public final k0n f;
    public rgq g;
    public rgp0 h;
    public rgp0 i;
    public int j;

    @Nullable
    public fi20 k;

    @Nullable
    public fi20 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public i4i0 r;
    public boolean s;
    public boolean t;
    public long u;

    public pf30() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r3 != 1231971951) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0352, code lost:
    
        if (r5.apply(r10) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x038b, code lost:
    
        if (((xsna.lio0) r9).a.equals("TLEN") != false) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032e  */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        eg30.a aVar;
        Throwable th;
        int i;
        long j;
        xi90 xi90Var;
        long j2;
        long j3;
        ?? r4;
        int i2;
        aht ahtVar;
        eg30.a aVar2;
        int i3;
        int p;
        long[] jArr;
        qf30 qf30Var;
        int i4;
        int i5;
        long j4;
        long j5;
        long j6;
        i4i0 i5jVar;
        fi20 fi20Var;
        fi20.a aVar3;
        fi20.a aVar4;
        char c;
        long S;
        tt20 tt20Var;
        aht ahtVar2;
        boolean z;
        i4i0 i4i0Var;
        boolean z2;
        fi20 fi20Var2;
        long j7;
        long j8;
        int C;
        this.h.getClass();
        String str = y2r0.a;
        int i6 = this.j;
        int i7 = 0;
        eg30.a aVar5 = this.c;
        if (i6 == 0) {
            try {
                h(qgqVar, false);
            } catch (EOFException unused) {
                aVar = aVar5;
                th = null;
                i = -1;
                i7 = -1;
                j = 1000000;
            }
        }
        i4i0 i4i0Var2 = this.r;
        xi90 xi90Var2 = this.b;
        if (i4i0Var2 == null) {
            xi90 xi90Var3 = new xi90(aVar5.c);
            th = null;
            qgqVar.peekFully(xi90Var3.a, 0, aVar5.c);
            int i8 = 21;
            j = 1000000;
            if ((aVar5.a & 1) != 0) {
                if (aVar5.e != 1) {
                    i8 = 36;
                }
            } else if (aVar5.e == 1) {
                i8 = 13;
            }
            int i9 = xi90Var3.c;
            int i10 = i8 + 4;
            j2 = C.TIME_UNSET;
            if (i9 >= i10) {
                xi90Var3.P(i8);
                i2 = xi90Var3.p();
                if (i2 != 1483304551) {
                }
                ahtVar = this.d;
                if (i2 != 1231971951) {
                    if (i2 == 1447187017) {
                        long length = qgqVar.getLength();
                        long position = qgqVar.getPosition();
                        xi90Var3.Q(6);
                        i3 = 0;
                        long j9 = position + aVar5.c;
                        long p2 = j9 + xi90Var3.p();
                        int p3 = xi90Var3.p();
                        if (p3 <= 0) {
                            i5jVar = null;
                            aVar2 = aVar5;
                        } else {
                            long b0 = y2r0.b0(aVar5.d, (p3 * aVar5.g) - 1);
                            int J = xi90Var3.J();
                            int J2 = xi90Var3.J();
                            int J3 = xi90Var3.J();
                            xi90Var3.Q(2);
                            long[] jArr2 = new long[J];
                            long[] jArr3 = new long[J];
                            eg30.a aVar6 = aVar5;
                            long j10 = position + aVar5.c;
                            int i11 = 0;
                            while (true) {
                                if (i11 < J) {
                                    long[] jArr4 = jArr3;
                                    eg30.a aVar7 = aVar6;
                                    int i12 = i11;
                                    long[] jArr5 = jArr2;
                                    jArr5[i12] = (i11 * b0) / J;
                                    jArr4[i12] = j10;
                                    if (J3 == 1) {
                                        C = xi90Var3.C();
                                    } else if (J3 == 2) {
                                        C = xi90Var3.J();
                                    } else if (J3 == 3) {
                                        C = xi90Var3.F();
                                    } else {
                                        if (J3 != 4) {
                                            i5jVar = null;
                                            aVar2 = aVar7;
                                            break;
                                        }
                                        C = xi90Var3.G();
                                    }
                                    j10 += C * J2;
                                    i11 = i12 + 1;
                                    jArr3 = jArr4;
                                    aVar6 = aVar7;
                                    jArr2 = jArr5;
                                } else {
                                    long[] jArr6 = jArr2;
                                    long[] jArr7 = jArr3;
                                    eg30.a aVar8 = aVar6;
                                    if (length == -1 || length == p2) {
                                        j7 = p2;
                                    } else {
                                        StringBuilder b = fp.b(length, "VBRI data size mismatch: ", ", ");
                                        j7 = p2;
                                        b.append(j7);
                                        ahn.F(b.toString());
                                    }
                                    if (j7 != j10) {
                                        StringBuilder b2 = fp.b(j7, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        b2.append(j10);
                                        b2.append("\nSeeking will be inaccurate.");
                                        ahn.F(b2.toString());
                                        j8 = Math.max(j7, j10);
                                    } else {
                                        j8 = j7;
                                    }
                                    aVar2 = aVar8;
                                    i5jVar = new kkr0(jArr6, jArr7, b0, j9, j8, aVar2.f);
                                }
                            }
                        }
                        qgqVar.skipFully(aVar2.c);
                    } else if (i2 != 1483304551) {
                        qgqVar.resetPeekPosition();
                        i5jVar = null;
                        aVar2 = aVar5;
                        i3 = 0;
                    }
                    fi20Var = this.k;
                    long position2 = qgqVar.getPosition();
                    if (fi20Var != null) {
                        mxc0 mxc0Var = mxc0.ALWAYS_TRUE;
                        mxc0Var.getClass();
                        fi20.a[] aVarArr = fi20Var.a;
                        int length2 = aVarArr.length;
                        int i13 = i3;
                        while (true) {
                            if (i13 >= length2) {
                                aVar3 = null;
                                break;
                            }
                            fi20.a aVar9 = aVarArr[i13];
                            if (st20.class.isAssignableFrom(aVar9.getClass())) {
                                aVar3 = (fi20.a) st20.class.cast(aVar9);
                            }
                            aVar3 = null;
                            if (aVar3 != null) {
                                break;
                            }
                            i13++;
                        }
                        st20 st20Var = (st20) aVar3;
                        if (st20Var != null) {
                            int[] iArr = st20Var.e;
                            fi20.a[] aVarArr2 = fi20Var.a;
                            int length3 = aVarArr2.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    aVar4 = null;
                                    break;
                                }
                                fi20.a aVar10 = aVarArr2[i14];
                                if (lio0.class.isAssignableFrom(aVar10.getClass())) {
                                    aVar4 = (fi20.a) lio0.class.cast(aVar10);
                                }
                                aVar4 = null;
                                if (aVar4 != null) {
                                    break;
                                }
                                i14++;
                            }
                            lio0 lio0Var = (lio0) aVar4;
                            if (lio0Var == null) {
                                S = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                S = y2r0.S(Long.parseLong(lio0Var.c.get(0)));
                            }
                            int length4 = iArr.length;
                            int i15 = length4 + 1;
                            long[] jArr8 = new long[i15];
                            long[] jArr9 = new long[i15];
                            jArr8[c] = position2;
                            jArr9[c] = 0;
                            long j11 = 0;
                            int i16 = 1;
                            while (i16 <= length4) {
                                int i17 = i16 - 1;
                                long j12 = position2 + st20Var.c + iArr[i17];
                                j11 += st20Var.d + st20Var.f[i17];
                                jArr8[i16] = j12;
                                jArr9[i16] = j11;
                                i16++;
                                length4 = length4;
                                position2 = j12;
                            }
                            tt20Var = new tt20(jArr8, jArr9, S);
                            if (this.s) {
                                if (tt20Var != null) {
                                    i5jVar = tt20Var;
                                } else if (i5jVar == null) {
                                    i5jVar = null;
                                }
                                if (i5jVar == null) {
                                    int i18 = i3;
                                    qgqVar.peekFully(xi90Var2.a, i18, 4);
                                    xi90Var2.P(i18);
                                    aVar2.a(xi90Var2.p());
                                    xi90Var = xi90Var2;
                                    ahtVar2 = ahtVar;
                                    j2 = -9223372036854775807L;
                                    aVar = aVar2;
                                    z = true;
                                    i7 = 0;
                                    i5jVar = new i5j(qgqVar.getLength(), qgqVar.getPosition(), aVar2.f, aVar2.c, false, true);
                                } else {
                                    j2 = -9223372036854775807L;
                                    xi90Var = xi90Var2;
                                    ahtVar2 = ahtVar;
                                    aVar = aVar2;
                                    z = true;
                                    i7 = 0;
                                }
                                i5jVar.isSeekable();
                                i5jVar.isSeekable();
                                this.h.e(i5jVar.getDurationUs());
                                i4i0Var = i5jVar;
                                z2 = z;
                            } else {
                                i4i0Var = new i4i0.a(C.TIME_UNSET);
                                xi90Var = xi90Var2;
                                ahtVar2 = ahtVar;
                                aVar = aVar2;
                                z2 = true;
                                i7 = 0;
                            }
                            this.r = i4i0Var;
                            this.g.f(i4i0Var);
                            fi20Var2 = this.k;
                            if (fi20Var2 == null) {
                                fi20 fi20Var3 = this.l;
                                if (fi20Var3 != null) {
                                    fi20Var2 = fi20Var2.b(fi20Var3);
                                }
                            } else {
                                fi20Var2 = this.l;
                            }
                            a.C0043a c0043a = new a.C0043a();
                            c0043a.l = io20.q(MimeTypes.AUDIO_MPEG);
                            c0043a.m = io20.q(aVar.b);
                            c0043a.n = 4096;
                            c0043a.E = aVar.e;
                            c0043a.F = aVar.d;
                            c0043a.H = ahtVar2.a;
                            c0043a.I = ahtVar2.b;
                            c0043a.k = fi20Var2;
                            if (this.r.getAverageBitrate() != -2147483647) {
                                c0043a.h = this.r.getAverageBitrate();
                            }
                            this.i.c(new androidx.media3.common.a(c0043a));
                            this.o = qgqVar.getPosition();
                            j3 = 0;
                            r4 = z2;
                        }
                    }
                    tt20Var = null;
                    if (this.s) {
                    }
                    this.r = i4i0Var;
                    this.g.f(i4i0Var);
                    fi20Var2 = this.k;
                    if (fi20Var2 == null) {
                    }
                    a.C0043a c0043a2 = new a.C0043a();
                    c0043a2.l = io20.q(MimeTypes.AUDIO_MPEG);
                    c0043a2.m = io20.q(aVar.b);
                    c0043a2.n = 4096;
                    c0043a2.E = aVar.e;
                    c0043a2.F = aVar.d;
                    c0043a2.H = ahtVar2.a;
                    c0043a2.I = ahtVar2.b;
                    c0043a2.k = fi20Var2;
                    if (this.r.getAverageBitrate() != -2147483647) {
                    }
                    this.i.c(new androidx.media3.common.a(c0043a2));
                    this.o = qgqVar.getPosition();
                    j3 = 0;
                    r4 = z2;
                }
                aVar2 = aVar5;
                i3 = 0;
                p = xi90Var3.p();
                int G = (p & 1) != 0 ? xi90Var3.G() : -1;
                long E = (p & 2) != 0 ? xi90Var3.E() : -1L;
                if ((p & 4) == 4) {
                    long[] jArr10 = new long[100];
                    for (int i19 = 0; i19 < 100; i19++) {
                        jArr10[i19] = xi90Var3.C();
                    }
                    jArr = jArr10;
                } else {
                    jArr = null;
                }
                if ((p & 8) != 0) {
                    xi90Var3.Q(4);
                }
                if (xi90Var3.a() >= 24) {
                    xi90Var3.Q(11);
                    float intBitsToFloat = Float.intBitsToFloat(xi90Var3.p());
                    int J4 = xi90Var3.J();
                    int J5 = xi90Var3.J();
                    qf30.a a = qf30.a.a(J4);
                    qf30.a a2 = qf30.a.a(J5);
                    qf30Var = (intBitsToFloat <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a == null && a2 == null) ? null : new qf30(intBitsToFloat, a, a2);
                    xi90Var3.Q(2);
                    int F = xi90Var3.F();
                    i5 = (16773120 & F) >> 12;
                    i4 = F & 4095;
                } else {
                    qf30Var = null;
                    i4 = -1;
                    i5 = -1;
                }
                j4 = G;
                int i20 = aVar2.c;
                int i21 = aVar2.d;
                int i22 = aVar2.f;
                int i23 = aVar2.g;
                if ((ahtVar.a != -1 || ahtVar.b == -1) && i5 != -1 && i4 != -1) {
                    ahtVar.a = i5;
                    ahtVar.b = i4;
                }
                this.l = qf30Var != null ? new fi20(qf30Var) : null;
                long position3 = qgqVar.getPosition();
                if (qgqVar.getLength() != -1 || E == -1) {
                    j5 = j4;
                } else {
                    j5 = j4;
                    long j13 = position3 + E;
                    if (qgqVar.getLength() != j13) {
                        ahn.u("Data size mismatch between stream (" + qgqVar.getLength() + ") and Xing frame (" + j13 + "), using Xing value.");
                    }
                }
                qgqVar.skipFully(aVar2.c);
                if (i2 == 1483304551) {
                    long b02 = (j5 == -1 || j5 == 0) ? -9223372036854775807L : y2r0.b0(i21, (j5 * i23) - 1);
                    if (b02 != C.TIME_UNSET) {
                        i5jVar = new h4y0(position3, i20, b02, i22, E, jArr);
                        fi20Var = this.k;
                        long position22 = qgqVar.getPosition();
                        if (fi20Var != null) {
                        }
                        tt20Var = null;
                        if (this.s) {
                        }
                        this.r = i4i0Var;
                        this.g.f(i4i0Var);
                        fi20Var2 = this.k;
                        if (fi20Var2 == null) {
                        }
                        a.C0043a c0043a22 = new a.C0043a();
                        c0043a22.l = io20.q(MimeTypes.AUDIO_MPEG);
                        c0043a22.m = io20.q(aVar.b);
                        c0043a22.n = 4096;
                        c0043a22.E = aVar.e;
                        c0043a22.F = aVar.d;
                        c0043a22.H = ahtVar2.a;
                        c0043a22.I = ahtVar2.b;
                        c0043a22.k = fi20Var2;
                        if (this.r.getAverageBitrate() != -2147483647) {
                        }
                        this.i.c(new androidx.media3.common.a(c0043a22));
                        this.o = qgqVar.getPosition();
                        j3 = 0;
                        r4 = z2;
                    }
                    i5jVar = null;
                    fi20Var = this.k;
                    long position222 = qgqVar.getPosition();
                    if (fi20Var != null) {
                    }
                    tt20Var = null;
                    if (this.s) {
                    }
                    this.r = i4i0Var;
                    this.g.f(i4i0Var);
                    fi20Var2 = this.k;
                    if (fi20Var2 == null) {
                    }
                    a.C0043a c0043a222 = new a.C0043a();
                    c0043a222.l = io20.q(MimeTypes.AUDIO_MPEG);
                    c0043a222.m = io20.q(aVar.b);
                    c0043a222.n = 4096;
                    c0043a222.E = aVar.e;
                    c0043a222.F = aVar.d;
                    c0043a222.H = ahtVar2.a;
                    c0043a222.I = ahtVar2.b;
                    c0043a222.k = fi20Var2;
                    if (this.r.getAverageBitrate() != -2147483647) {
                    }
                    this.i.c(new androidx.media3.common.a(c0043a222));
                    this.o = qgqVar.getPosition();
                    j3 = 0;
                    r4 = z2;
                } else {
                    long length5 = qgqVar.getLength();
                    long b03 = (j5 == -1 || j5 == 0) ? -9223372036854775807L : y2r0.b0(i21, (i23 * j5) - 1);
                    if (b03 != C.TIME_UNSET) {
                        if (E != -1) {
                            length5 = position3 + E;
                            j6 = E - i20;
                        } else if (length5 != -1) {
                            j6 = (length5 - position3) - i20;
                        }
                        long j14 = length5;
                        long j15 = j6;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        i5jVar = new i5j(j14, position3 + i20, ipx.s(y2r0.d0(j15, 8000000L, b03, roundingMode)), ipx.s(r300.b(j15, j5, roundingMode)), false, true);
                        fi20Var = this.k;
                        long position2222 = qgqVar.getPosition();
                        if (fi20Var != null) {
                        }
                        tt20Var = null;
                        if (this.s) {
                        }
                        this.r = i4i0Var;
                        this.g.f(i4i0Var);
                        fi20Var2 = this.k;
                        if (fi20Var2 == null) {
                        }
                        a.C0043a c0043a2222 = new a.C0043a();
                        c0043a2222.l = io20.q(MimeTypes.AUDIO_MPEG);
                        c0043a2222.m = io20.q(aVar.b);
                        c0043a2222.n = 4096;
                        c0043a2222.E = aVar.e;
                        c0043a2222.F = aVar.d;
                        c0043a2222.H = ahtVar2.a;
                        c0043a2222.I = ahtVar2.b;
                        c0043a2222.k = fi20Var2;
                        if (this.r.getAverageBitrate() != -2147483647) {
                        }
                        this.i.c(new androidx.media3.common.a(c0043a2222));
                        this.o = qgqVar.getPosition();
                        j3 = 0;
                        r4 = z2;
                    }
                    i5jVar = null;
                    fi20Var = this.k;
                    long position22222 = qgqVar.getPosition();
                    if (fi20Var != null) {
                    }
                    tt20Var = null;
                    if (this.s) {
                    }
                    this.r = i4i0Var;
                    this.g.f(i4i0Var);
                    fi20Var2 = this.k;
                    if (fi20Var2 == null) {
                    }
                    a.C0043a c0043a22222 = new a.C0043a();
                    c0043a22222.l = io20.q(MimeTypes.AUDIO_MPEG);
                    c0043a22222.m = io20.q(aVar.b);
                    c0043a22222.n = 4096;
                    c0043a22222.E = aVar.e;
                    c0043a22222.F = aVar.d;
                    c0043a22222.H = ahtVar2.a;
                    c0043a22222.I = ahtVar2.b;
                    c0043a22222.k = fi20Var2;
                    if (this.r.getAverageBitrate() != -2147483647) {
                    }
                    this.i.c(new androidx.media3.common.a(c0043a22222));
                    this.o = qgqVar.getPosition();
                    j3 = 0;
                    r4 = z2;
                }
            }
            if (xi90Var3.c >= 40) {
                xi90Var3.P(36);
                if (xi90Var3.p() == 1447187017) {
                    i2 = 1447187017;
                    ahtVar = this.d;
                    if (i2 != 1231971951) {
                    }
                    aVar2 = aVar5;
                    i3 = 0;
                    p = xi90Var3.p();
                    if ((p & 1) != 0) {
                    }
                    if ((p & 2) != 0) {
                    }
                    if ((p & 4) == 4) {
                    }
                    if ((p & 8) != 0) {
                    }
                    if (xi90Var3.a() >= 24) {
                    }
                    j4 = G;
                    int i202 = aVar2.c;
                    int i212 = aVar2.d;
                    int i222 = aVar2.f;
                    int i232 = aVar2.g;
                    if (ahtVar.a != -1) {
                    }
                    ahtVar.a = i5;
                    ahtVar.b = i4;
                    this.l = qf30Var != null ? new fi20(qf30Var) : null;
                    long position32 = qgqVar.getPosition();
                    if (qgqVar.getLength() != -1) {
                    }
                    j5 = j4;
                    qgqVar.skipFully(aVar2.c);
                    if (i2 == 1483304551) {
                    }
                }
            }
            i2 = 0;
            ahtVar = this.d;
            if (i2 != 1231971951) {
            }
            aVar2 = aVar5;
            i3 = 0;
            p = xi90Var3.p();
            if ((p & 1) != 0) {
            }
            if ((p & 2) != 0) {
            }
            if ((p & 4) == 4) {
            }
            if ((p & 8) != 0) {
            }
            if (xi90Var3.a() >= 24) {
            }
            j4 = G;
            int i2022 = aVar2.c;
            int i2122 = aVar2.d;
            int i2222 = aVar2.f;
            int i2322 = aVar2.g;
            if (ahtVar.a != -1) {
            }
            ahtVar.a = i5;
            ahtVar.b = i4;
            this.l = qf30Var != null ? new fi20(qf30Var) : null;
            long position322 = qgqVar.getPosition();
            if (qgqVar.getLength() != -1) {
            }
            j5 = j4;
            qgqVar.skipFully(aVar2.c);
            if (i2 == 1483304551) {
            }
        } else {
            aVar = aVar5;
            xi90Var = xi90Var2;
            boolean z3 = true;
            th = null;
            j = 1000000;
            j2 = C.TIME_UNSET;
            j3 = 0;
            r4 = z3;
            if (this.o != 0) {
                long position4 = qgqVar.getPosition();
                long j16 = this.o;
                r4 = z3;
                if (position4 < j16) {
                    qgqVar.skipFully((int) (j16 - position4));
                    r4 = z3;
                }
            }
        }
        if (this.q == 0) {
            qgqVar.resetPeekPosition();
            if (!g(qgqVar)) {
                xi90Var.P(i7);
                int p4 = xi90Var.p();
                if (((-128000) & p4) != (this.j & (-128000)) || eg30.a(p4) == -1) {
                    qgqVar.skipFully(r4);
                    this.j = i7;
                    i = -1;
                    if (i7 == i) {
                        i4i0 i4i0Var3 = this.r;
                        if (i4i0Var3 instanceof vtw) {
                            if (i4i0Var3.getDurationUs() != ((this.n * j) / aVar.d) + this.m) {
                                ((vtw) this.r).getClass();
                                throw th;
                            }
                        }
                    }
                    return i7;
                }
                aVar.a(p4);
                if (this.m == j2) {
                    this.m = this.r.getTimeUs(qgqVar.getPosition());
                    long j17 = this.a;
                    if (j17 != j2) {
                        this.m = (j17 - this.r.getTimeUs(j3)) + this.m;
                    }
                }
                this.q = aVar.c;
                this.p = qgqVar.getPosition() + aVar.c;
                i4i0 i4i0Var4 = this.r;
                if (i4i0Var4 instanceof vtw) {
                    long j18 = ((this.n + aVar.g) * j) / aVar.d;
                    ((vtw) i4i0Var4).getClass();
                    throw th;
                }
            }
            i = -1;
            i7 = -1;
            if (i7 == i) {
            }
            return i7;
        }
        int g = this.i.g(qgqVar, this.q, r4);
        if (g != -1) {
            int i24 = this.q - g;
            this.q = i24;
            if (i24 <= 0) {
                this.i.a(this.m + ((this.n * j) / aVar.d), 1, aVar.c, 0, null);
                this.n += aVar.g;
                this.q = i7;
            }
            i = -1;
            if (i7 == i) {
            }
            return i7;
        }
        i = -1;
        i7 = -1;
        if (i7 == i) {
        }
        return i7;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        return h(qgqVar, true);
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.g = rgqVar;
        rgp0 track = rgqVar.track(0, 1);
        this.h = track;
        this.i = track;
        this.g.endTracks();
    }

    public final void f() {
        n3i0 n3i0Var = this.r;
        if ((n3i0Var instanceof i5j) && ((h5j) n3i0Var).isSeekable()) {
            long j = this.p;
            if (j == -1 || j == this.r.b()) {
                return;
            }
            i5j i5jVar = (i5j) this.r;
            this.r = new i5j(this.p, i5jVar.i, i5jVar.j, i5jVar.k, i5jVar.l, false);
            rgq rgqVar = this.g;
            rgqVar.getClass();
            rgqVar.f(this.r);
            rgp0 rgp0Var = this.h;
            rgp0Var.getClass();
            rgp0Var.e(this.r.getDurationUs());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.getPeekPosition() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(qgq qgqVar) throws IOException {
        i4i0 i4i0Var = this.r;
        if (i4i0Var != null) {
            long b = i4i0Var.b();
            if (b != -1) {
            }
        }
        try {
            return !qgqVar.peekFully(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean h(qgq qgqVar, boolean z) throws IOException {
        int i;
        int i2;
        int a;
        qgqVar.resetPeekPosition();
        if (qgqVar.getPosition() == 0) {
            fi20 a2 = this.e.a(qgqVar, null, 131072);
            this.k = a2;
            if (a2 != null) {
                this.d.b(a2);
            }
            i = (int) qgqVar.getPeekPosition();
            if (!z) {
                qgqVar.skipFully(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!g(qgqVar)) {
                xi90 xi90Var = this.b;
                xi90Var.P(0);
                int p = xi90Var.p();
                if ((i2 == 0 || ((-128000) & p) == (i2 & (-128000))) && (a = eg30.a(p)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(p);
                        i2 = p;
                    }
                    qgqVar.advancePeekPosition(a - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        f();
                        throw new EOFException();
                    }
                    if (z) {
                        qgqVar.resetPeekPosition();
                        qgqVar.advancePeekPosition(i + i5);
                    } else {
                        qgqVar.skipFully(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                f();
                throw new EOFException();
            }
        }
        if (z) {
            qgqVar.skipFully(i + i4);
        } else {
            qgqVar.resetPeekPosition();
        }
        this.j = i2;
        return true;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.j = 0;
        this.m = C.TIME_UNSET;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        i4i0 i4i0Var = this.r;
        if (i4i0Var instanceof vtw) {
            ((vtw) i4i0Var).getClass();
            throw null;
        }
    }

    public pf30(int i) {
        this(C.TIME_UNSET);
    }

    public pf30(long j) {
        this.a = j;
        this.b = new xi90(10);
        this.c = new eg30.a();
        this.d = new aht();
        this.m = C.TIME_UNSET;
        this.e = new bsv();
        k0n k0nVar = new k0n();
        this.f = k0nVar;
        this.i = k0nVar;
        this.p = -1L;
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
