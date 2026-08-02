package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import defpackage.an91;
import defpackage.i6z0;
import defpackage.j2w;
import defpackage.l690;
import defpackage.n8e;
import defpackage.p651;
import defpackage.p8e;
import defpackage.tls;
import defpackage.tyu0;
import defpackage.x910;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class dkm0 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, wls wlsVar, wls wlsVar2, wls wlsVar3, wls wlsVar4, int i, long j, long j2, p651 p651Var, final a aVar, fid fidVar, final int i2, final int i3) {
        int i4;
        wls wlsVar5;
        int i5;
        wls wlsVar6;
        int i6;
        wls wlsVar7;
        int i7;
        wls wlsVar8;
        int i8;
        p651 p651Var2;
        int i9;
        final f530 f530Var2;
        final int i10;
        final wls wlsVar9;
        final wls wlsVar10;
        bts btsVar;
        final wls wlsVar11;
        final wls wlsVar12;
        final long j3;
        final long j4;
        aii0 v;
        wls wlsVar13;
        wls wlsVar14;
        wls wlsVar15;
        wls wlsVar16;
        long j5;
        long b;
        f530 f530Var3;
        int i11;
        int i12;
        int i13;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1211482744);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (btsVar2.k(f530Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            wlsVar5 = wlsVar;
            i4 |= btsVar2.e(wlsVar5) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                wlsVar6 = wlsVar2;
                i4 |= btsVar2.e(wlsVar6) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    wlsVar7 = wlsVar3;
                    i4 |= btsVar2.e(wlsVar7) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        wlsVar8 = wlsVar4;
                        i4 |= btsVar2.e(wlsVar8) ? 16384 : 8192;
                        i8 = i4 | ImageMetadata.EDGE_MODE;
                        if ((1572864 & i2) == 0) {
                            i8 |= ((i3 & 64) == 0 && btsVar2.d(j)) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i8 |= SelfTester_JCP.ENCRYPT_CBC;
                        }
                        if ((i2 & 100663296) == 0) {
                            if ((i3 & 256) == 0) {
                                p651Var2 = p651Var;
                                if (btsVar2.k(p651Var2)) {
                                    i13 = SelfTester_JCP.DECRYPT_CBC;
                                    i8 |= i13;
                                }
                            } else {
                                p651Var2 = p651Var;
                            }
                            i13 = SelfTester_JCP.DECRYPT_CFB;
                            i8 |= i13;
                        } else {
                            p651Var2 = p651Var;
                        }
                        if ((i2 & 805306368) == 0) {
                            i9 = i14;
                            i8 |= btsVar2.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
                        } else {
                            i9 = i14;
                        }
                        if (btsVar2.V(i8 & 1, (i8 & 306783379) != 306783378)) {
                            btsVar2.a0();
                            if ((i2 & 1) == 0 || btsVar2.C()) {
                                f530 f530Var4 = i9 != 0 ? c530.a : f530Var;
                                if (i15 != 0) {
                                    jbd.a.getClass();
                                    wlsVar13 = jbd.b;
                                } else {
                                    wlsVar13 = wlsVar5;
                                }
                                if (i5 != 0) {
                                    jbd.a.getClass();
                                    wlsVar14 = jbd.c;
                                } else {
                                    wlsVar14 = wlsVar6;
                                }
                                if (i6 != 0) {
                                    jbd.a.getClass();
                                    wlsVar15 = jbd.d;
                                } else {
                                    wlsVar15 = wlsVar7;
                                }
                                if (i7 != 0) {
                                    jbd.a.getClass();
                                    wlsVar16 = jbd.e;
                                } else {
                                    wlsVar16 = wlsVar8;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((agc) btsVar2.m(dgc.a)).n;
                                    i8 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                b = dgc.b(j5, btsVar2);
                                int i16 = i8 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                                    p651Var2 = new sy11(vuz.o(btsVar2).g, vuz.o(btsVar2).b);
                                    i11 = (-264241153) & i8;
                                    f530Var3 = f530Var4;
                                } else {
                                    f530Var3 = f530Var4;
                                    i11 = i16;
                                }
                                i12 = 2;
                            } else {
                                btsVar2.Y();
                                if ((i3 & 64) != 0) {
                                    i8 &= -3670017;
                                }
                                int i17 = i8 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    i17 = i8 & (-264241153);
                                }
                                b = j2;
                                i11 = i17;
                                wlsVar13 = wlsVar5;
                                wlsVar14 = wlsVar6;
                                wlsVar15 = wlsVar7;
                                wlsVar16 = wlsVar8;
                                f530Var3 = f530Var;
                                i12 = i;
                                j5 = j;
                            }
                            btsVar2.u();
                            int i18 = (234881024 & i11) ^ 100663296;
                            boolean z = (i18 > 67108864 && btsVar2.k(p651Var2)) || (i11 & 100663296) == 67108864;
                            Object Q = btsVar2.Q();
                            int i19 = i12;
                            o430 o430Var = did.a;
                            if (z || Q == o430Var) {
                                Q = new zz40(p651Var2);
                                btsVar2.o0(Q);
                            }
                            zz40 zz40Var = (zz40) Q;
                            int i20 = i11;
                            boolean k = btsVar2.k(zz40Var) | ((i18 > 67108864 && btsVar2.k(p651Var2)) || (i20 & 100663296) == 67108864);
                            Object Q2 = btsVar2.Q();
                            if (k || Q2 == o430Var) {
                                Q2 = new vam0(9, zz40Var, p651Var2);
                                btsVar2.o0(Q2);
                            }
                            wls wlsVar17 = wlsVar13;
                            wls wlsVar18 = wlsVar14;
                            wls wlsVar19 = wlsVar15;
                            wls wlsVar20 = wlsVar16;
                            long j6 = j5;
                            long j7 = b;
                            mnw0.a(b9a1.c(f530Var3, (tls) Q2), null, j6, j7, 0.0f, 0.0f, wwg.S(848889571, true, new ew0(i19, wlsVar17, aVar, wlsVar19, wlsVar20, zz40Var, wlsVar18), btsVar2), btsVar2, ((i20 >> 12) & 896) | 12582912, 114);
                            j3 = j6;
                            btsVar = btsVar2;
                            f530Var2 = f530Var3;
                            wlsVar9 = wlsVar17;
                            wlsVar10 = wlsVar18;
                            i10 = i19;
                            j4 = j7;
                            wlsVar11 = wlsVar19;
                            wlsVar12 = wlsVar20;
                        } else {
                            btsVar2.Y();
                            f530Var2 = f530Var;
                            i10 = i;
                            wlsVar9 = wlsVar5;
                            wlsVar10 = wlsVar6;
                            btsVar = btsVar2;
                            wlsVar11 = wlsVar7;
                            wlsVar12 = wlsVar8;
                            j3 = j;
                            j4 = j2;
                        }
                        final p651 p651Var3 = p651Var2;
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: bkm0
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i2 | 1);
                                    dkm0.a(f530.this, wlsVar9, wlsVar10, wlsVar11, wlsVar12, i10, j3, j4, p651Var3, aVar, (fid) obj, O, i3);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    wlsVar8 = wlsVar4;
                    i8 = i4 | ImageMetadata.EDGE_MODE;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i2 & 805306368) == 0) {
                    }
                    if (btsVar2.V(i8 & 1, (i8 & 306783379) != 306783378)) {
                    }
                    final p651 p651Var32 = p651Var2;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                wlsVar7 = wlsVar3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                wlsVar8 = wlsVar4;
                i8 = i4 | ImageMetadata.EDGE_MODE;
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if (btsVar2.V(i8 & 1, (i8 & 306783379) != 306783378)) {
                }
                final p651 p651Var322 = p651Var2;
                v = btsVar.v();
                if (v != null) {
                }
            }
            wlsVar6 = wlsVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            wlsVar7 = wlsVar3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            wlsVar8 = wlsVar4;
            i8 = i4 | ImageMetadata.EDGE_MODE;
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if (btsVar2.V(i8 & 1, (i8 & 306783379) != 306783378)) {
            }
            final p651 p651Var3222 = p651Var2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        wlsVar5 = wlsVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        wlsVar6 = wlsVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        wlsVar7 = wlsVar3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        wlsVar8 = wlsVar4;
        i8 = i4 | ImageMetadata.EDGE_MODE;
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if (btsVar2.V(i8 & 1, (i8 & 306783379) != 306783378)) {
        }
        final p651 p651Var32222 = p651Var2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(final int i, wls wlsVar, a aVar, wls wlsVar2, wls wlsVar3, final p651 p651Var, wls wlsVar4, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-280287501);
        int i4 = i2 | (btsVar.c(i) ? 4 : 2) | (btsVar.e(wlsVar) ? 32 : 16) | (btsVar.e(aVar) ? 256 : 128) | (btsVar.e(wlsVar2) ? 2048 : 1024) | (btsVar.e(wlsVar3) ? 16384 : 8192) | (btsVar.k(p651Var) ? 131072 : 65536) | (btsVar.e(wlsVar4) ? 1048576 : 524288);
        if (btsVar.V(i4 & 1, (599187 & i4) != 599186)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ckm0();
                btsVar.o0(Q);
            }
            final ckm0 ckm0Var = (ckm0) Q;
            boolean z = (i4 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new a(605195056, new cp1(wlsVar, 8), true);
                btsVar.o0(Q2);
            }
            final wls wlsVar5 = (wls) Q2;
            boolean z2 = (i4 & 7168) == 2048;
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new a(418899191, new cp1(wlsVar2, 9), true);
                btsVar.o0(Q3);
            }
            final wls wlsVar6 = (wls) Q3;
            boolean z3 = (57344 & i4) == 16384;
            Object Q4 = btsVar.Q();
            if (z3 || Q4 == o430Var) {
                Q4 = new a(338600263, new cp1(wlsVar3, 10), true);
                btsVar.o0(Q4);
            }
            final wls wlsVar7 = (wls) Q4;
            boolean z4 = (i4 & 896) == 256;
            Object Q5 = btsVar.Q();
            int i5 = 14;
            if (z4 || Q5 == o430Var) {
                i3 = i4;
                Q5 = new a(-1776388365, new t7l0(i5, aVar, ckm0Var), true);
                btsVar.o0(Q5);
            } else {
                i3 = i4;
            }
            final wls wlsVar8 = (wls) Q5;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object Q6 = btsVar.Q();
            if (z5 || Q6 == o430Var) {
                Q6 = new a(-1731662488, new cp1(wlsVar4, 11), true);
                btsVar.o0(Q6);
            }
            final wls wlsVar9 = (wls) Q6;
            boolean k = ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | btsVar.k(wlsVar5) | btsVar.k(wlsVar6) | btsVar.k(wlsVar7) | ((i3 & 14) == 4) | btsVar.k(wlsVar9) | btsVar.k(wlsVar8);
            Object Q7 = btsVar.Q();
            if (k || Q7 == o430Var) {
                wls wlsVar10 = new wls() { // from class: androidx.compose.material3.u
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i6;
                        int f0;
                        int f02;
                        i6z0 i6z0Var;
                        Integer num;
                        int i7;
                        int intValue;
                        int f03;
                        int a;
                        final tyu0 tyu0Var = (tyu0) obj;
                        n8e n8eVar = (n8e) obj2;
                        final int i8 = n8e.i(n8eVar.a);
                        final int h = n8e.h(n8eVar.a);
                        long b = n8e.b(0, n8eVar.a, 0, 0, 0, 10);
                        LayoutDirection layoutDirection = tyu0Var.getLayoutDirection();
                        final p651 p651Var2 = p651.this;
                        int d = p651Var2.d(tyu0Var, layoutDirection);
                        int b2 = p651Var2.b(tyu0Var, tyu0Var.getLayoutDirection());
                        int a2 = p651Var2.a(tyu0Var);
                        final androidx.compose.ui.layout.o l0 = ((x910) kotlin.collections.a.P(tyu0Var.h0(ScaffoldLayoutContent.TopBar, wlsVar5))).l0(b);
                        int i9 = (-d) - b2;
                        int i10 = -a2;
                        final androidx.compose.ui.layout.o l02 = ((x910) kotlin.collections.a.P(tyu0Var.h0(ScaffoldLayoutContent.Snackbar, wlsVar6))).l0(p8e.i(i9, i10, b));
                        final androidx.compose.ui.layout.o l03 = ((x910) kotlin.collections.a.P(tyu0Var.h0(ScaffoldLayoutContent.Fab, wlsVar7))).l0(p8e.i(i9, i10, b));
                        int i11 = l03.a;
                        int i12 = i;
                        if (i11 == 0 && l03.b == 0) {
                            i6z0Var = null;
                        } else {
                            int i13 = l03.b;
                            if (i12 == 0) {
                                i6 = d;
                                if (tyu0Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                    f0 = tyu0Var.f0(16.0f);
                                    f02 = f0 + i6;
                                    i6z0Var = new i6z0(f02, i13, 4);
                                } else {
                                    f02 = ((i8 - tyu0Var.f0(16.0f)) - i11) - b2;
                                    i6z0Var = new i6z0(f02, i13, 4);
                                }
                            } else {
                                i6 = d;
                                if (i12 != 2 && i12 != 3) {
                                    f02 = (((i8 - i11) + i6) - b2) / 2;
                                } else if (tyu0Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                    f02 = ((i8 - tyu0Var.f0(16.0f)) - i11) - b2;
                                } else {
                                    f0 = tyu0Var.f0(16.0f);
                                    f02 = f0 + i6;
                                }
                                i6z0Var = new i6z0(f02, i13, 4);
                            }
                        }
                        final androidx.compose.ui.layout.o l04 = ((x910) kotlin.collections.a.P(tyu0Var.h0(ScaffoldLayoutContent.BottomBar, wlsVar9))).l0(b);
                        boolean z6 = l04.a == 0 && l04.b == 0;
                        if (i6z0Var != null) {
                            int i14 = i6z0Var.c;
                            if (z6 || i12 == 3) {
                                f03 = tyu0Var.f0(16.0f) + i14;
                                a = p651Var2.a(tyu0Var);
                            } else {
                                f03 = l04.b + i14;
                                a = tyu0Var.f0(16.0f);
                            }
                            num = Integer.valueOf(a + f03);
                        } else {
                            num = null;
                        }
                        int i15 = l02.b;
                        if (i15 != 0) {
                            if (num != null) {
                                intValue = num.intValue();
                            } else {
                                Integer valueOf = Integer.valueOf(l04.b);
                                if (z6) {
                                    valueOf = null;
                                }
                                intValue = valueOf != null ? valueOf.intValue() : p651Var2.a(tyu0Var);
                            }
                            i7 = i15 + intValue;
                        } else {
                            i7 = 0;
                        }
                        j2w j2wVar = new j2w(p651Var2, tyu0Var);
                        final i6z0 i6z0Var2 = i6z0Var;
                        ckm0Var.b.setValue(new l690(an91.f(j2wVar, tyu0Var.getLayoutDirection()), (l0.a == 0 && l0.b == 0) ? j2wVar.d() : tyu0Var.H(l0.b), an91.e(j2wVar, tyu0Var.getLayoutDirection()), z6 ? j2wVar.a() : tyu0Var.H(l04.b)));
                        final androidx.compose.ui.layout.o l05 = ((x910) kotlin.collections.a.P(tyu0Var.h0(ScaffoldLayoutContent.MainContent, wlsVar8))).l0(b);
                        final Integer num2 = num;
                        final int i16 = i7;
                        return tyu0Var.w(i8, h, kotlin.collections.b.f(), new tls() { // from class: akm0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj3) {
                                o.a aVar2 = (o.a) obj3;
                                aVar2.g(o.this, 0, 0, 0.0f);
                                aVar2.g(l0, 0, 0, 0.0f);
                                o oVar = l02;
                                int i17 = i8 - oVar.a;
                                tyu0 tyu0Var2 = tyu0Var;
                                LayoutDirection layoutDirection2 = tyu0Var2.getLayoutDirection();
                                p651 p651Var3 = p651Var2;
                                int d2 = ((p651Var3.d(tyu0Var2, layoutDirection2) + i17) - p651Var3.b(tyu0Var2, tyu0Var2.getLayoutDirection())) / 2;
                                int i18 = h;
                                aVar2.g(oVar, d2, i18 - i16, 0.0f);
                                o oVar2 = l04;
                                aVar2.g(oVar2, 0, i18 - oVar2.b, 0.0f);
                                i6z0 i6z0Var3 = i6z0Var2;
                                if (i6z0Var3 != null) {
                                    aVar2.g(l03, i6z0Var3.b, i18 - num2.intValue(), 0.0f);
                                }
                                return zy11.a;
                            }
                        });
                    }
                };
                btsVar.o0(wlsVar10);
                Q7 = wlsVar10;
            }
            e.a(null, (wls) Q7, btsVar, 0, 1);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(i, wlsVar, aVar, wlsVar2, wlsVar3, p651Var, wlsVar4, i2);
        }
    }
}
