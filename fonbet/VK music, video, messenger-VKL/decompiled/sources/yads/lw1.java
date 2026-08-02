package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.az60;

/* loaded from: classes10.dex */
public final class lw1 implements nq0, zx2 {
    public int i;
    public long j;
    public int k;
    public kc2 l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final fy2 f = new fy2();
    public final ArrayList g = new ArrayList();
    public final kc2 d = new kc2(16);
    public final ArrayDeque e = new ArrayDeque();
    public final kc2 a = new kc2(ez1.a);
    public final kc2 b = new kc2(4);
    public final kc2 c = new kc2();
    public int m = -1;
    public qq0 q = qq0.a;
    public kw1[] r = new kw1[0];

    public static /* synthetic */ i83 a(i83 i83Var) {
        return i83Var;
    }

    public static nq0[] d() {
        return new nq0[]{new lw1()};
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.u;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                fy2 fy2Var = this.f;
                fy2Var.a.clear();
                fy2Var.b = 0;
                this.g.clear();
                return;
            }
        }
        for (kw1 kw1Var : this.r) {
            r83 r83Var = kw1Var.b;
            int b = mc3.b(r83Var.f, j2, false);
            while (true) {
                if (b < 0) {
                    b = -1;
                    break;
                } else if ((r83Var.g[b] & 1) != 0) {
                    break;
                } else {
                    b--;
                }
            }
            if (b == -1) {
                b = r83Var.a(j2);
            }
            kw1Var.e = b;
            da3 da3Var = kw1Var.d;
            if (da3Var != null) {
                da3Var.b = false;
                da3Var.c = 0;
            }
        }
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.q = qq0Var;
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int a;
        long j7 = j;
        kw1[] kw1VarArr = this.r;
        if (kw1VarArr.length == 0) {
            by2 by2Var = by2.c;
            return new xx2(by2Var, by2Var);
        }
        int i = this.t;
        if (i != -1) {
            r83 r83Var = kw1VarArr[i].b;
            int b = mc3.b(r83Var.f, j7, false);
            while (true) {
                if (b < 0) {
                    b = -1;
                    break;
                }
                if ((r83Var.g[b] & 1) != 0) {
                    break;
                }
                b--;
            }
            if (b == -1) {
                b = r83Var.a(j7);
            }
            if (b == -1) {
                by2 by2Var2 = by2.c;
                return new xx2(by2Var2, by2Var2);
            }
            long j8 = r83Var.f[b];
            j2 = r83Var.c[b];
            if (j8 >= j7 || b >= r83Var.b - 1 || (a = r83Var.a(j7)) == -1 || a == b) {
                j6 = -1;
                j4 = C.TIME_UNSET;
            } else {
                j4 = r83Var.f[a];
                j6 = r83Var.c[a];
            }
            j3 = j6;
            j7 = j8;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = C.TIME_UNSET;
        }
        int i2 = 0;
        while (true) {
            kw1[] kw1VarArr2 = this.r;
            if (i2 >= kw1VarArr2.length) {
                break;
            }
            if (i2 != this.t) {
                r83 r83Var2 = kw1VarArr2[i2].b;
                int b2 = mc3.b(r83Var2.f, j7, false);
                while (true) {
                    if (b2 < 0) {
                        j5 = C.TIME_UNSET;
                        b2 = -1;
                        break;
                    }
                    j5 = C.TIME_UNSET;
                    if ((r83Var2.g[b2] & 1) != 0) {
                        break;
                    }
                    b2--;
                }
                if (b2 == -1) {
                    b2 = r83Var2.a(j7);
                }
                if (b2 != -1) {
                    j2 = Math.min(r83Var2.c[b2], j2);
                }
                if (j4 != j5) {
                    int b3 = mc3.b(r83Var2.f, j4, false);
                    while (true) {
                        if (b3 < 0) {
                            b3 = -1;
                            break;
                        }
                        if ((r83Var2.g[b3] & 1) != 0) {
                            break;
                        }
                        b3--;
                    }
                    if (b3 == -1) {
                        b3 = r83Var2.a(j4);
                    }
                    if (b3 != -1) {
                        j3 = Math.min(r83Var2.c[b3], j3);
                    }
                }
            }
            i2++;
        }
        by2 by2Var3 = new by2(j7, j2);
        return j4 == C.TIME_UNSET ? new xx2(by2Var3, by2Var3) : new xx2(by2Var3, new by2(j4, j3));
    }

    public final void c(long j) {
        while (!this.e.isEmpty() && ((vj) this.e.peek()).b == j) {
            vj vjVar = (vj) this.e.pop();
            if (vjVar.a == 1836019574) {
                a(vjVar);
                this.e.clear();
                this.h = 2;
            } else if (!this.e.isEmpty()) {
                ((vj) this.e.peek()).d.add(vjVar);
            }
        }
        if (this.h != 2) {
            this.h = 0;
            this.k = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0279, code lost:
    
        r4.e(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c8, code lost:
    
        r9 = 16777215 & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cf, code lost:
    
        if (r9 != 6516084) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d1, code lost:
    
        r5 = yads.au1.a(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01da, code lost:
    
        if (r9 == 7233901) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01df, code lost:
    
        if (r9 != 7631467) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e6, code lost:
    
        if (r9 == 6516589) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01eb, code lost:
    
        if (r9 != 7828084) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f2, code lost:
    
        if (r9 != 6578553) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f4, code lost:
    
        r5 = yads.au1.b(r7, r4, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ff, code lost:
    
        if (r9 != 4280916) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0201, code lost:
    
        r5 = yads.au1.b(r7, r4, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x020b, code lost:
    
        if (r9 != 7630703) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x020d, code lost:
    
        r5 = yads.au1.b(r7, r4, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0217, code lost:
    
        if (r9 != 6384738) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0219, code lost:
    
        r5 = yads.au1.b(r7, r4, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0223, code lost:
    
        if (r9 != 7108978) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0225, code lost:
    
        r5 = yads.au1.b(r7, r4, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x022f, code lost:
    
        if (r9 != 6776174) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0231, code lost:
    
        r5 = yads.au1.b(r7, r4, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0239, code lost:
    
        if (r9 != 6779504) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x023b, code lost:
    
        r5 = yads.au1.b(r7, r4, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025a, code lost:
    
        r5 = yads.au1.b(r7, r4, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0261, code lost:
    
        r5 = yads.au1.b(r7, r4, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027d, code lost:
    
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0283, code lost:
    
        if (r11.isEmpty() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0286, code lost:
    
        r18 = new yads.ut1(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        r4.e(r10);
        r10 = r10 + r11;
        r4.e(r4.b + 8);
        r11 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        r12 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r12 >= r10) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r12 = r4.b() + r12;
        r7 = r4.b();
        r9 = (r7 >> 24) & 255;
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r9 == 169) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r9 != 253) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (r7 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
    
        if (r7 != 1684632427) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fb, code lost:
    
        r5 = yads.au1.a(r7, r4, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0267, code lost:
    
        r4.e(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x026a, code lost:
    
        if (r5 == null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x026c, code lost:
    
        r11.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x026f, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        if (r7 != 1953655662) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        r5 = yads.au1.a(r7, r4, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0113, code lost:
    
        if (r7 != 1953329263) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        r5 = yads.au1.a(r7, "TBPM", r4, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
    
        if (r7 != 1668311404) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0125, code lost:
    
        r5 = yads.au1.a(r7, "TCMP", r4, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        if (r7 != 1668249202) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        r5 = yads.au1.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        if (r7 != 1631670868) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        r5 = yads.au1.b(r7, r4, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        if (r7 != 1936682605) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        r5 = yads.au1.b(r7, r4, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0155, code lost:
    
        if (r7 != 1936679276) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
    
        r5 = yads.au1.b(r7, r4, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        if (r7 != 1936679282) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
    
        r5 = yads.au1.b(r7, r4, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
    
        if (r7 != 1936679265) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        r5 = yads.au1.b(r7, r4, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017c, code lost:
    
        if (r7 != 1936679791) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
    
        r5 = yads.au1.b(r7, r4, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0189, code lost:
    
        if (r7 != 1920233063) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
    
        r5 = yads.au1.a(r7, "ITUNESADVISORY", r4, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
    
        if (r7 != 1885823344) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
    
        r5 = yads.au1.a(r7, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
    
        if (r7 != 1936683886) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a8, code lost:
    
        r5 = yads.au1.b(r7, r4, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b3, code lost:
    
        if (r7 != 1953919848) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b5, code lost:
    
        r5 = yads.au1.b(r7, r4, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        if (r7 != 757935405) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c2, code lost:
    
        r5 = yads.au1.b(r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0242, code lost:
    
        yads.ji1.a("MetadataUtil", "Skipped unknown metadata entry: " + yads.xj.a(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0255, code lost:
    
        r4.e(r12);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00af, code lost:
    
        r4.e(r4.b + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bd, code lost:
    
        if (r4.b() != 1684108385) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bf, code lost:
    
        r4.e(r4.b + 8);
        r7 = r4.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d4, code lost:
    
        if (r7 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d6, code lost:
    
        r9 = yads.au1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00da, code lost:
    
        if (r7 > 192) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00dc, code lost:
    
        r7 = r9[r7 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e2, code lost:
    
        if (r7 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e4, code lost:
    
        r5 = new yads.c73("TCON", null, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ec, code lost:
    
        yads.ji1.d("MetadataUtil", "Failed to parse standard genre code");
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00ce, code lost:
    
        yads.ji1.d("MetadataUtil", "Failed to parse uint8 attribute value");
        r7 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05b9 A[LOOP:10: B:300:0x05b6->B:302:0x05b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(vj vjVar) {
        int i;
        int i2;
        ut1 ut1Var;
        ut1 ut1Var2;
        az0 az0Var;
        ut1 ut1Var3;
        int size;
        int i3;
        kw1[] kw1VarArr;
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        az0 az0Var2;
        int i9;
        int i10;
        int i11;
        az0 az0Var3;
        int i12;
        char c;
        hk1 hk1Var;
        int i13;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.v == 1;
        az0 az0Var4 = new az0();
        wj c2 = vjVar.c(1969517665);
        int i14 = 1768715124;
        int i15 = 1751411826;
        int i16 = 1835365473;
        int i17 = 8;
        if (c2 != null) {
            byte[] bArr = ek.a;
            kc2 kc2Var = c2.b;
            kc2Var.e(8);
            ut1 ut1Var4 = null;
            ut1 ut1Var5 = null;
            while (true) {
                int i18 = kc2Var.c;
                int i19 = 12;
                int i20 = kc2Var.b;
                if (i18 - i20 < i17) {
                    break;
                }
                int b = kc2Var.b();
                int i21 = i17;
                int b2 = kc2Var.b();
                if (b2 == i16) {
                    kc2Var.e(i20);
                    int i22 = i20 + b;
                    kc2Var.e(kc2Var.b + 8);
                    int i23 = kc2Var.b;
                    int i24 = i23 + 4;
                    kc2Var.e(i24);
                    if (kc2Var.b() != i15) {
                        i23 = i24;
                    }
                    kc2Var.e(i23);
                    while (true) {
                        int i25 = kc2Var.b;
                        if (i25 >= i22) {
                            i13 = b;
                            break;
                        }
                        int b3 = kc2Var.b();
                        if (kc2Var.b() == i14) {
                            break;
                        }
                        kc2Var.e(i25 + b3);
                        i14 = 1768715124;
                    }
                    ut1Var4 = null;
                } else {
                    i13 = b;
                    if (b2 == 1936553057) {
                        kc2Var.e(i20);
                        int i26 = i20 + i13;
                        kc2Var.e(kc2Var.b + 12);
                        while (true) {
                            int i27 = kc2Var.b;
                            if (i27 >= i26) {
                                break;
                            }
                            int b4 = kc2Var.b();
                            if (kc2Var.b() != 1935766900) {
                                kc2Var.e(i27 + b4);
                                i19 = 12;
                            } else if (b4 >= 14) {
                                kc2Var.e(kc2Var.b + 5);
                                int m = kc2Var.m();
                                int i28 = i19;
                                if (m == i28 || m == 13) {
                                    float f = m == i28 ? 240.0f : 120.0f;
                                    kc2Var.e(kc2Var.b + 1);
                                    ut1Var5 = new ut1(new v23(kc2Var.m(), f));
                                }
                            }
                        }
                        ut1Var5 = null;
                    }
                }
                kc2Var.e(i20 + i13);
                i17 = i21;
                i14 = 1768715124;
                i15 = 1751411826;
                i16 = 1835365473;
            }
            i = i17;
            Pair create = Pair.create(ut1Var4, ut1Var5);
            ut1 ut1Var6 = (ut1) create.first;
            ut1 ut1Var7 = (ut1) create.second;
            if (ut1Var6 != null) {
                az0Var4.a(ut1Var6);
            }
            ut1Var = ut1Var7;
            ut1Var2 = ut1Var6;
            i2 = 1835365473;
        } else {
            i = 8;
            i2 = 1835365473;
            ut1Var = null;
            ut1Var2 = null;
        }
        vj b5 = vjVar.b(i2);
        char c3 = 16;
        if (b5 != null) {
            byte[] bArr2 = ek.a;
            wj c4 = b5.c(1751411826);
            wj c5 = b5.c(1801812339);
            wj c6 = b5.c(1768715124);
            if (c4 != null && c5 != null && c6 != null) {
                kc2 kc2Var2 = c4.b;
                kc2Var2.e(16);
                if (kc2Var2.b() == 1835299937) {
                    kc2 kc2Var3 = c5.b;
                    kc2Var3.e(12);
                    int b6 = kc2Var3.b();
                    String[] strArr = new String[b6];
                    for (int i29 = 0; i29 < b6; i29++) {
                        int b7 = kc2Var3.b();
                        kc2Var3.e(kc2Var3.b + 4);
                        strArr[i29] = kc2Var3.a(b7 - 8, bu.c);
                    }
                    kc2 kc2Var4 = c6.b;
                    int i30 = i;
                    kc2Var4.e(i30);
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        int i31 = kc2Var4.c;
                        int i32 = kc2Var4.b;
                        if (i31 - i32 <= i30) {
                            break;
                        }
                        int b8 = kc2Var4.b();
                        int b9 = kc2Var4.b() - 1;
                        if (b9 >= 0 && b9 < b6) {
                            String str = strArr[b9];
                            int i33 = i32 + b8;
                            c = c3;
                            while (true) {
                                int i34 = kc2Var4.b;
                                if (i34 >= i33) {
                                    az0Var3 = az0Var4;
                                    i12 = b6;
                                    hk1Var = null;
                                    break;
                                }
                                int b10 = kc2Var4.b();
                                az0Var3 = az0Var4;
                                if (kc2Var4.b() == 1684108385) {
                                    int b11 = kc2Var4.b();
                                    int b12 = kc2Var4.b();
                                    int i35 = b10 - 16;
                                    byte[] bArr3 = new byte[i35];
                                    i12 = b6;
                                    kc2Var4.a(bArr3, 0, i35);
                                    hk1Var = new hk1(b12, b11, str, bArr3);
                                    break;
                                }
                                kc2Var4.e(i34 + b10);
                                az0Var4 = az0Var3;
                            }
                            if (hk1Var != null) {
                                arrayList3.add(hk1Var);
                            }
                        } else {
                            az0Var3 = az0Var4;
                            i12 = b6;
                            c = c3;
                            lg1.a("Skipped metadata with unknown key index: ", b9, "AtomParsers");
                        }
                        kc2Var4.e(i32 + b8);
                        c3 = c;
                        az0Var4 = az0Var3;
                        b6 = i12;
                        i30 = 8;
                    }
                    az0Var = az0Var4;
                    if (!arrayList3.isEmpty()) {
                        ut1Var3 = new ut1(arrayList3);
                        az0 az0Var5 = az0Var;
                        ArrayList a = ek.a(vjVar, az0Var5, C.TIME_UNSET, null, false, z, new az60(13));
                        size = a.size();
                        i3 = 0;
                        long j = C.TIME_UNSET;
                        int i36 = -1;
                        while (i3 < size) {
                            r83 r83Var = (r83) a.get(i3);
                            if (r83Var.b == 0) {
                                arrayList = a;
                                az0Var2 = az0Var5;
                                i6 = size;
                            } else {
                                i83 i83Var = r83Var.a;
                                long j2 = i83Var.e;
                                if (j2 == C.TIME_UNSET) {
                                    j2 = r83Var.h;
                                }
                                long max = Math.max(j, j2);
                                arrayList = a;
                                i6 = size;
                                kw1 kw1Var = new kw1(i83Var, r83Var, this.q.a(i3, i83Var.b));
                                if (MimeTypes.AUDIO_TRUEHD.equals(i83Var.f.m)) {
                                    i7 = r83Var.e * 16;
                                } else {
                                    i7 = r83Var.e + 30;
                                }
                                nx0 nx0Var = i83Var.f;
                                nx0Var.getClass();
                                mx0 mx0Var = new mx0(nx0Var);
                                mx0Var.l = i7;
                                int i37 = i83Var.b;
                                if (i37 != 2 || j2 <= 0) {
                                    i8 = 1;
                                } else {
                                    int i38 = r83Var.b;
                                    i8 = 1;
                                    if (i38 > 1) {
                                        mx0Var.r = i38 / (j2 / 1000000.0f);
                                    }
                                }
                                if (i37 == i8 && (i10 = az0Var5.a) != -1 && (i11 = az0Var5.b) != -1) {
                                    mx0Var.A = i10;
                                    mx0Var.B = i11;
                                }
                                ut1[] ut1VarArr = {ut1Var, this.g.isEmpty() ? null : new ut1(this.g)};
                                ut1 ut1Var8 = new ut1(new tt1[0]);
                                if (i37 == 1) {
                                    if (ut1Var2 != null) {
                                        az0Var2 = az0Var5;
                                        ut1Var8 = ut1Var2;
                                        for (i9 = 0; i9 < 2; i9++) {
                                            ut1 ut1Var9 = ut1VarArr[i9];
                                            if (ut1Var9 != null) {
                                                tt1[] tt1VarArr = ut1Var9.b;
                                                ut1Var8.getClass();
                                                if (tt1VarArr.length != 0) {
                                                    ut1Var8 = new ut1((tt1[]) mc3.a((Object[]) ut1Var8.b, (Object[]) tt1VarArr));
                                                }
                                            }
                                        }
                                        if (ut1Var8.b.length > 0) {
                                            mx0Var.i = ut1Var8;
                                        }
                                        kw1Var.c.a(new nx0(mx0Var));
                                        if (i83Var.b != 2 && i36 == -1) {
                                            i36 = arrayList2.size();
                                        }
                                        arrayList2.add(kw1Var);
                                        j = max;
                                    }
                                    az0Var2 = az0Var5;
                                    while (i9 < 2) {
                                    }
                                    if (ut1Var8.b.length > 0) {
                                    }
                                    kw1Var.c.a(new nx0(mx0Var));
                                    if (i83Var.b != 2) {
                                        i36 = arrayList2.size();
                                    }
                                    arrayList2.add(kw1Var);
                                    j = max;
                                } else {
                                    if (i37 == 2 && ut1Var3 != null) {
                                        int i39 = 0;
                                        while (true) {
                                            tt1[] tt1VarArr2 = ut1Var3.b;
                                            if (i39 >= tt1VarArr2.length) {
                                                break;
                                            }
                                            tt1 tt1Var = tt1VarArr2[i39];
                                            if (tt1Var instanceof hk1) {
                                                hk1 hk1Var2 = (hk1) tt1Var;
                                                az0Var2 = az0Var5;
                                                if ("com.android.capture.fps".equals(hk1Var2.b)) {
                                                    ut1Var8 = new ut1(hk1Var2);
                                                    break;
                                                }
                                            } else {
                                                az0Var2 = az0Var5;
                                            }
                                            i39++;
                                            az0Var5 = az0Var2;
                                        }
                                    }
                                    az0Var2 = az0Var5;
                                    while (i9 < 2) {
                                    }
                                    if (ut1Var8.b.length > 0) {
                                    }
                                    kw1Var.c.a(new nx0(mx0Var));
                                    if (i83Var.b != 2) {
                                    }
                                    arrayList2.add(kw1Var);
                                    j = max;
                                }
                            }
                            i3++;
                            a = arrayList;
                            size = i6;
                            az0Var5 = az0Var2;
                        }
                        this.t = i36;
                        this.u = j;
                        kw1VarArr = (kw1[]) arrayList2.toArray(new kw1[0]);
                        this.r = kw1VarArr;
                        long[][] jArr = new long[kw1VarArr.length][];
                        int[] iArr = new int[kw1VarArr.length];
                        long[] jArr2 = new long[kw1VarArr.length];
                        boolean[] zArr = new boolean[kw1VarArr.length];
                        for (i4 = 0; i4 < kw1VarArr.length; i4++) {
                            jArr[i4] = new long[kw1VarArr[i4].b.b];
                            jArr2[i4] = kw1VarArr[i4].b.f[0];
                        }
                        long j3 = 0;
                        i5 = 0;
                        while (i5 < kw1VarArr.length) {
                            long j4 = Long.MAX_VALUE;
                            int i40 = -1;
                            for (int i41 = 0; i41 < kw1VarArr.length; i41++) {
                                if (!zArr[i41]) {
                                    long j5 = jArr2[i41];
                                    if (j5 <= j4) {
                                        i40 = i41;
                                        j4 = j5;
                                    }
                                }
                            }
                            int i42 = iArr[i40];
                            long[] jArr3 = jArr[i40];
                            jArr3[i42] = j3;
                            r83 r83Var2 = kw1VarArr[i40].b;
                            j3 += r83Var2.d[i42];
                            int i43 = i42 + 1;
                            iArr[i40] = i43;
                            if (i43 < jArr3.length) {
                                jArr2[i40] = r83Var2.f[i43];
                            } else {
                                zArr[i40] = true;
                                i5++;
                            }
                        }
                        this.s = jArr;
                        this.q.a();
                        this.q.a(this);
                    }
                    ut1Var3 = null;
                    az0 az0Var52 = az0Var;
                    ArrayList a2 = ek.a(vjVar, az0Var52, C.TIME_UNSET, null, false, z, new az60(13));
                    size = a2.size();
                    i3 = 0;
                    long j6 = C.TIME_UNSET;
                    int i362 = -1;
                    while (i3 < size) {
                    }
                    this.t = i362;
                    this.u = j6;
                    kw1VarArr = (kw1[]) arrayList2.toArray(new kw1[0]);
                    this.r = kw1VarArr;
                    long[][] jArr4 = new long[kw1VarArr.length][];
                    int[] iArr2 = new int[kw1VarArr.length];
                    long[] jArr22 = new long[kw1VarArr.length];
                    boolean[] zArr2 = new boolean[kw1VarArr.length];
                    while (i4 < kw1VarArr.length) {
                    }
                    long j32 = 0;
                    i5 = 0;
                    while (i5 < kw1VarArr.length) {
                    }
                    this.s = jArr4;
                    this.q.a();
                    this.q.a(this);
                }
            }
        }
        az0Var = az0Var4;
        ut1Var3 = null;
        az0 az0Var522 = az0Var;
        ArrayList a22 = ek.a(vjVar, az0Var522, C.TIME_UNSET, null, false, z, new az60(13));
        size = a22.size();
        i3 = 0;
        long j62 = C.TIME_UNSET;
        int i3622 = -1;
        while (i3 < size) {
        }
        this.t = i3622;
        this.u = j62;
        kw1VarArr = (kw1[]) arrayList2.toArray(new kw1[0]);
        this.r = kw1VarArr;
        long[][] jArr42 = new long[kw1VarArr.length][];
        int[] iArr22 = new int[kw1VarArr.length];
        long[] jArr222 = new long[kw1VarArr.length];
        boolean[] zArr22 = new boolean[kw1VarArr.length];
        while (i4 < kw1VarArr.length) {
        }
        long j322 = 0;
        i5 = 0;
        while (i5 < kw1VarArr.length) {
        }
        this.s = jArr42;
        this.q.a();
        this.q.a(this);
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yads.nq0
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        long j;
        char c;
        char c2;
        ArrayList arrayList;
        boolean z;
        vj vjVar;
        while (true) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        long a = oq0Var.a();
                        if (this.m == -1) {
                            boolean z2 = true;
                            boolean z3 = true;
                            int i2 = -1;
                            int i3 = -1;
                            int i4 = 0;
                            long j2 = Long.MAX_VALUE;
                            long j3 = Long.MAX_VALUE;
                            long j4 = Long.MAX_VALUE;
                            while (true) {
                                kw1[] kw1VarArr = this.r;
                                if (i4 >= kw1VarArr.length) {
                                    break;
                                }
                                kw1 kw1Var = kw1VarArr[i4];
                                int i5 = kw1Var.e;
                                r83 r83Var = kw1Var.b;
                                if (i5 != r83Var.b) {
                                    long j5 = r83Var.c[i5];
                                    long[][] jArr = this.s;
                                    int i6 = mc3.a;
                                    long j6 = jArr[i4][i5];
                                    long j7 = j5 - a;
                                    boolean z4 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                    if ((!z4 && z3) || (z4 == z3 && j7 < j4)) {
                                        j3 = j6;
                                        z3 = z4;
                                        i3 = i4;
                                        j4 = j7;
                                    }
                                    if (j6 < j2) {
                                        j2 = j6;
                                        z2 = z4;
                                        i2 = i4;
                                    }
                                }
                                i4++;
                            }
                            j = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                            if (j2 == Long.MAX_VALUE || !z2 || j3 < j2 + 10485760) {
                                i2 = i3;
                            }
                            this.m = i2;
                            if (i2 == -1) {
                                return -1;
                            }
                        } else {
                            j = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        }
                        kw1 kw1Var2 = this.r[this.m];
                        q83 q83Var = kw1Var2.c;
                        int i7 = kw1Var2.e;
                        r83 r83Var2 = kw1Var2.b;
                        long j8 = r83Var2.c[i7];
                        int i8 = r83Var2.d[i7];
                        da3 da3Var = kw1Var2.d;
                        long j9 = (j8 - a) + this.n;
                        if (j9 >= 0 && j9 < j) {
                            if (kw1Var2.a.g == 1) {
                                j9 += 8;
                                i8 -= 8;
                            }
                            oq0Var.a((int) j9);
                            i83 i83Var = kw1Var2.a;
                            int i9 = i83Var.j;
                            if (i9 != 0) {
                                byte[] bArr = this.b.a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i10 = 4 - i9;
                                while (this.o < i8) {
                                    int i11 = this.p;
                                    if (i11 == 0) {
                                        oq0Var.readFully(bArr, i10, i9);
                                        this.n += i9;
                                        this.b.e(0);
                                        int b = this.b.b();
                                        if (b >= 0) {
                                            this.p = b;
                                            this.a.e(0);
                                            q83Var.a(4, this.a);
                                            this.o += 4;
                                            i8 += i10;
                                        } else {
                                            throw new pc2("Invalid NAL length", null, true, 1);
                                        }
                                    } else {
                                        int a2 = q83Var.a(oq0Var, i11, false);
                                        this.n += a2;
                                        this.o += a2;
                                        this.p -= a2;
                                    }
                                }
                            } else {
                                if ("audio/ac4".equals(i83Var.f.m)) {
                                    if (this.o == 0) {
                                        l0.a(i8, this.c);
                                        q83Var.a(7, this.c);
                                        this.o += 7;
                                    }
                                    i8 += 7;
                                } else if (da3Var != null) {
                                    da3Var.a(oq0Var);
                                }
                                while (true) {
                                    int i12 = this.o;
                                    if (i12 >= i8) {
                                        break;
                                    }
                                    int a3 = q83Var.a(oq0Var, i8 - i12, false);
                                    this.n += a3;
                                    this.o += a3;
                                    this.p -= a3;
                                }
                            }
                            int i13 = i8;
                            r83 r83Var3 = kw1Var2.b;
                            long j10 = r83Var3.f[i7];
                            int i14 = r83Var3.g[i7];
                            if (da3Var != null) {
                                da3Var.a(q83Var, j10, i14, i13, 0, null);
                                if (i7 + 1 == kw1Var2.b.b && da3Var.c > 0) {
                                    q83Var.a(da3Var.d, da3Var.e, da3Var.f, da3Var.g, null);
                                    da3Var.c = 0;
                                }
                            } else {
                                q83Var.a(j10, i14, i13, 0, null);
                            }
                            kw1Var2.e++;
                            this.m = -1;
                            this.n = 0;
                            this.o = 0;
                            this.p = 0;
                            return 0;
                        }
                        hh2Var.a = j8;
                        return 1;
                    }
                    if (i == 3) {
                        fy2 fy2Var = this.f;
                        ArrayList arrayList2 = this.g;
                        int i15 = fy2Var.b;
                        if (i15 == 0) {
                            long length = oq0Var.getLength();
                            hh2Var.a = (length == -1 || length < 8) ? 0L : length - 8;
                            fy2Var.b = 1;
                        } else if (i15 != 1) {
                            char c3 = 2192;
                            if (i15 == 2) {
                                long length2 = oq0Var.getLength();
                                int i16 = fy2Var.c - 20;
                                kc2 kc2Var = new kc2(i16);
                                oq0Var.readFully(kc2Var.a, 0, i16);
                                for (int i17 = 0; i17 < i16 / 12; i17++) {
                                    kc2Var.e(kc2Var.b + 2);
                                    short f = kc2Var.f();
                                    if (f != 2192 && f != 2816) {
                                        if (f != 2817) {
                                            if (f != 2819 && f != 2820) {
                                                kc2Var.e(kc2Var.b + 8);
                                            }
                                            fy2Var.a.add(new ey2(kc2Var.d(), (length2 - fy2Var.c) - kc2Var.d()));
                                        }
                                    }
                                    fy2Var.a.add(new ey2(kc2Var.d(), (length2 - fy2Var.c) - kc2Var.d()));
                                }
                                if (fy2Var.a.isEmpty()) {
                                    hh2Var.a = 0L;
                                } else {
                                    fy2Var.b = 3;
                                    hh2Var.a = ((ey2) fy2Var.a.get(0)).a;
                                }
                            } else if (i15 == 3) {
                                long a4 = oq0Var.a();
                                int length3 = (int) ((oq0Var.getLength() - oq0Var.a()) - fy2Var.c);
                                byte[] bArr2 = new byte[length3];
                                oq0Var.readFully(bArr2, 0, length3);
                                int i18 = 0;
                                while (i18 < fy2Var.a.size()) {
                                    ey2 ey2Var = (ey2) fy2Var.a.get(i18);
                                    ArrayList arrayList3 = arrayList2;
                                    int i19 = (int) (ey2Var.a - a4);
                                    if (i19 < 0 || i19 > length3) {
                                        throw new IllegalArgumentException();
                                    }
                                    int i20 = i19 + 4;
                                    if (i20 >= 0 && i20 <= length3) {
                                        int i21 = ((bArr2[i19 + 5] & 255) << 8) | (bArr2[i20] & 255);
                                        int i22 = i19 + 7;
                                        int i23 = i21 | ((bArr2[i19 + 6] & 255) << 16);
                                        int i24 = i19 + 8;
                                        int i25 = i23 | ((bArr2[i22] & 255) << 24);
                                        Charset charset = bu.c;
                                        String str = new String(bArr2, i24, i25, charset);
                                        int i26 = i24 + i25;
                                        switch (str.hashCode()) {
                                            case -1711564334:
                                                if (str.equals("SlowMotion_Data")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1332107749:
                                                if (str.equals("Super_SlowMotion_Edit_Data")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1251387154:
                                                if (str.equals("Super_SlowMotion_Data")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -830665521:
                                                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1760745220:
                                                if (str.equals("Super_SlowMotion_BGM")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        switch (c) {
                                            case 0:
                                                c2 = c3;
                                                break;
                                            case 1:
                                                c2 = 2819;
                                                break;
                                            case 2:
                                                c2 = 2816;
                                                break;
                                            case 3:
                                                c2 = 2820;
                                                break;
                                            case 4:
                                                c2 = 2817;
                                                break;
                                            default:
                                                throw new pc2("Invalid SEF name", null, true, 1);
                                        }
                                        int i27 = ey2Var.b - (i25 + 8);
                                        if (c2 == c3) {
                                            ArrayList arrayList4 = new ArrayList();
                                            String str2 = new String(bArr2, i26, i27, charset);
                                            a43 a43Var = fy2.e;
                                            a43Var.getClass();
                                            z33 z33Var = a43Var.b;
                                            z33Var.getClass();
                                            y33 y33Var = new y33(z33Var, a43Var, str2);
                                            ArrayList arrayList5 = new ArrayList();
                                            while (y33Var.hasNext()) {
                                                arrayList5.add((String) y33Var.next());
                                            }
                                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                                            for (int i28 = 0; i28 < unmodifiableList.size(); i28++) {
                                                a43 a43Var2 = fy2.d;
                                                CharSequence charSequence = (CharSequence) unmodifiableList.get(i28);
                                                a43Var2.getClass();
                                                charSequence.getClass();
                                                z33 z33Var2 = a43Var2.b;
                                                z33Var2.getClass();
                                                y33 y33Var2 = new y33(z33Var2, a43Var2, charSequence);
                                                ArrayList arrayList6 = new ArrayList();
                                                while (y33Var2.hasNext()) {
                                                    arrayList6.add((String) y33Var2.next());
                                                }
                                                List unmodifiableList2 = Collections.unmodifiableList(arrayList6);
                                                if (unmodifiableList2.size() == 3) {
                                                    try {
                                                        arrayList4.add(new i23(1 << (Integer.parseInt((String) unmodifiableList2.get(2)) - 1), Long.parseLong((String) unmodifiableList2.get(0)), Long.parseLong((String) unmodifiableList2.get(1))));
                                                    } catch (NumberFormatException e) {
                                                        throw new pc2(null, e, true, 1);
                                                    }
                                                } else {
                                                    throw new pc2(null, null, true, 1);
                                                }
                                            }
                                            j23 j23Var = new j23(arrayList4);
                                            arrayList = arrayList3;
                                            arrayList.add(j23Var);
                                        } else {
                                            if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            arrayList = arrayList3;
                                        }
                                        i18++;
                                        arrayList2 = arrayList;
                                        c3 = 2192;
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                }
                                hh2Var.a = 0L;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            kc2 kc2Var2 = new kc2(8);
                            oq0Var.readFully(kc2Var2.a, 0, 8);
                            fy2Var.c = kc2Var2.d() + 8;
                            if (kc2Var2.b() != 1397048916) {
                                hh2Var.a = 0L;
                            } else {
                                hh2Var.a = oq0Var.a() - (fy2Var.c - 12);
                                fy2Var.b = 2;
                            }
                        }
                        if (hh2Var.a == 0) {
                            this.h = 0;
                            this.k = 0;
                        }
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                long j11 = this.j - this.k;
                long a5 = oq0Var.a() + j11;
                kc2 kc2Var3 = this.l;
                if (kc2Var3 != null) {
                    oq0Var.readFully(kc2Var3.a, this.k, (int) j11);
                    if (this.i == 1718909296) {
                        kc2Var3.e(8);
                        int b2 = kc2Var3.b();
                        int i29 = b2 != 1751476579 ? b2 != 1903435808 ? 0 : 1 : 2;
                        if (i29 == 0) {
                            kc2Var3.e(kc2Var3.b + 4);
                            while (true) {
                                if (kc2Var3.c - kc2Var3.b <= 0) {
                                    i29 = 0;
                                    break;
                                }
                                int b3 = kc2Var3.b();
                                i29 = b3 != 1751476579 ? b3 != 1903435808 ? 0 : 1 : 2;
                                if (i29 != 0) {
                                    break;
                                }
                            }
                        }
                        this.v = i29;
                    } else if (!this.e.isEmpty()) {
                        ((vj) this.e.peek()).c.add(new wj(this.i, kc2Var3));
                    }
                } else if (j11 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    oq0Var.a((int) j11);
                } else {
                    hh2Var.a = oq0Var.a() + j11;
                    z = true;
                    c(a5);
                    if (z && this.h != 2) {
                        return 1;
                    }
                }
                z = false;
                c(a5);
                if (z) {
                    return 1;
                }
                continue;
            } else {
                if (this.k == 0) {
                    if (!oq0Var.a(this.d.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    this.d.e(0);
                    this.j = this.d.n();
                    this.i = this.d.b();
                }
                long j12 = this.j;
                if (j12 == 1) {
                    oq0Var.readFully(this.d.a, 8, 8);
                    this.k += 8;
                    this.j = this.d.q();
                } else if (j12 == 0) {
                    long length4 = oq0Var.getLength();
                    if (length4 == -1 && (vjVar = (vj) this.e.peek()) != null) {
                        length4 = vjVar.b;
                    }
                    if (length4 != -1) {
                        this.j = (length4 - oq0Var.a()) + this.k;
                    }
                }
                long j13 = this.j;
                int i30 = this.k;
                if (j13 >= i30) {
                    int i31 = this.i;
                    if (i31 == 1836019574 || i31 == 1953653099 || i31 == 1835297121 || i31 == 1835626086 || i31 == 1937007212 || i31 == 1701082227 || i31 == 1835365473) {
                        long a6 = oq0Var.a();
                        long j14 = this.j;
                        long j15 = this.k;
                        long j16 = (a6 + j14) - j15;
                        if (j14 != j15 && this.i == 1835365473) {
                            this.c.c(8);
                            oq0Var.a(this.c.a, 0, 8);
                            kc2 kc2Var4 = this.c;
                            byte[] bArr3 = ek.a;
                            int i32 = kc2Var4.b;
                            int i33 = i32 + 4;
                            kc2Var4.e(i33);
                            if (kc2Var4.b() != 1751411826) {
                                i32 = i33;
                            }
                            kc2Var4.e(i32);
                            oq0Var.a(this.c.b);
                            oq0Var.b();
                        }
                        this.e.push(new vj(this.i, j16));
                        if (this.j == this.k) {
                            c(j16);
                        } else {
                            this.h = 0;
                            this.k = 0;
                        }
                    } else if (i31 == 1835296868 || i31 == 1836476516 || i31 == 1751411826 || i31 == 1937011556 || i31 == 1937011827 || i31 == 1937011571 || i31 == 1668576371 || i31 == 1701606260 || i31 == 1937011555 || i31 == 1937011578 || i31 == 1937013298 || i31 == 1937007471 || i31 == 1668232756 || i31 == 1953196132 || i31 == 1718909296 || i31 == 1969517665 || i31 == 1801812339 || i31 == 1768715124) {
                        if (i30 != 8) {
                            throw new IllegalStateException();
                        }
                        if (j13 <= 2147483647L) {
                            kc2 kc2Var5 = new kc2((int) j13);
                            System.arraycopy(this.d.a, 0, kc2Var5.a, 0, 8);
                            this.l = kc2Var5;
                            this.h = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        oq0Var.a();
                        this.l = null;
                        this.h = 1;
                    }
                } else {
                    throw pc2.b("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return w23.a(oq0Var, false, false);
    }
}
