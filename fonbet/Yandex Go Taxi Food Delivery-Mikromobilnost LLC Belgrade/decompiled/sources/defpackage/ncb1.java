package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ncb1 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, f530 f530Var, boolean z, final int i2, final int i3, final tls tlsVar, String str, String str2, final ButtonSize buttonSize, fid fidVar, final int i4, final int i5) {
        int i6;
        f530 f530Var2;
        int i7;
        int i8;
        final String str3;
        int i9;
        dmw0 dmw0Var;
        int i10;
        bts btsVar;
        final f530 f530Var3;
        aii0 v;
        boolean z2;
        c530 c530Var;
        f530 f530Var4;
        au2 c;
        tls tlsVar2;
        String str4;
        float f;
        ety0 ety0Var;
        f530 f530Var5;
        au2 b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1275900412);
        dmw0 dmw0Var2 = btsVar2.a;
        if ((i4 & 6) == 0) {
            i6 = (btsVar2.c(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar2.k(f530Var2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                i6 |= btsVar2.a(z) ? 256 : 128;
                if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i6 |= btsVar2.c(i2) ? 2048 : 1024;
                }
                if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i6 |= btsVar2.c(i3) ? 16384 : 8192;
                }
                if ((196608 & i4) == 0) {
                    i6 |= btsVar2.e(tlsVar) ? 131072 : 65536;
                }
                i8 = i5 & 64;
                if (i8 != 0) {
                    i6 |= 1572864;
                    str3 = str;
                } else {
                    str3 = str;
                    if ((i4 & 1572864) == 0) {
                        i6 |= btsVar2.k(str3) ? 1048576 : 524288;
                    }
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    dmw0Var = dmw0Var2;
                    i6 |= btsVar2.k(str2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    if ((i4 & 100663296) == 0) {
                        i6 |= btsVar2.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    }
                    i10 = i6;
                    if (btsVar2.V(i10 & 1, (38347923 & i6) == 38347922)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        f530Var3 = f530Var2;
                    } else {
                        c530 c530Var2 = c530.a;
                        f530 f530Var6 = i11 != 0 ? c530Var2 : f530Var2;
                        boolean z3 = i7 != 0 ? true : z;
                        if (i8 != 0) {
                            str3 = null;
                        }
                        String str5 = i9 != 0 ? null : str2;
                        f530 c2 = bzk0.c(ymb1.l(q6a1.c(fj91.d(f530Var6, IntrinsicSize.Max), z3), cyk0.c(tcb1.c(buttonSize, btsVar2))), AppColor$Palette.ControlMinor, qke.q);
                        lhl0 a = khl0.a(lr20.a, x4c.E, btsVar2, 48);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d = b.d(btsVar2, c2);
                        ohd.G1.getClass();
                        f530 f530Var7 = f530Var6;
                        sls slsVar = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        z = z3;
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        wls wlsVar = d.f;
                        qje.W(btsVar2, wlsVar, a);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar2, wlsVar2, o);
                        Integer valueOf = Integer.valueOf(hashCode);
                        wls wlsVar3 = d.g;
                        qje.W(btsVar2, wlsVar3, valueOf);
                        tls tlsVar3 = d.h;
                        qje.M(btsVar2, tlsVar3);
                        String str6 = str3;
                        wls wlsVar4 = d.d;
                        qje.W(btsVar2, wlsVar4, d);
                        boolean z4 = i > i2;
                        o430 o430Var = did.a;
                        str2 = str5;
                        if (tlsVar == null) {
                            btsVar2.e0(1689296240);
                            btsVar2.t(false);
                            c530Var = c530Var2;
                            f530Var4 = null;
                        } else {
                            btsVar2.e0(1689296241);
                            boolean z5 = z && z4;
                            awk0 awk0Var = new awk0(0);
                            boolean z6 = ((i10 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | ((i10 & 14) == 4);
                            Object Q = btsVar2.Q();
                            if (z6 || Q == o430Var) {
                                z2 = false;
                                Q = new oz6(i, 0, tlsVar);
                                btsVar2.o0(Q);
                            } else {
                                z2 = false;
                            }
                            f530 d2 = q791.d(c530Var2, z5, null, awk0Var, (sls) Q, 10);
                            c530Var = c530Var2;
                            btsVar2.t(z2);
                            f530Var4 = d2;
                        }
                        f530 k = ljs0.i(c530Var, buttonSize.getSize()).k(f530Var4 == null ? c530Var : f530Var4);
                        uo5 uo5Var = x4c.y;
                        boolean z7 = z4;
                        z910 d3 = pi6.d(uo5Var, false);
                        int hashCode2 = Long.hashCode(btsVar2.T);
                        r1b0 o2 = btsVar2.o();
                        f530 d4 = b.d(btsVar2, k);
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, wlsVar, d3);
                        qje.W(btsVar2, wlsVar2, o2);
                        vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar3);
                        qje.W(btsVar2, wlsVar4, d4);
                        f530 b2 = tra1.b(c530Var, z7 ? 1.0f : 0.25f);
                        int[] iArr = qz6.a;
                        int i12 = iArr[buttonSize.ordinal()];
                        if (i12 == 1 || i12 == 2) {
                            c = amb1.c();
                        } else {
                            if (i12 != 3 && i12 != 4) {
                                w511.b();
                                return;
                            }
                            c = bmb1.b();
                        }
                        au2 au2Var = c;
                        if (str2 != null && z && z7) {
                            tlsVar2 = tlsVar3;
                            str4 = str2;
                        } else {
                            tlsVar2 = tlsVar3;
                            str4 = null;
                        }
                        tls tlsVar4 = tlsVar2;
                        sya1.a(au2Var, b2, str4, null, btsVar2, 0, 8);
                        btsVar2.t(true);
                        x2y x2yVar = new x2y(1.0f, true);
                        int i13 = iArr[buttonSize.ordinal()];
                        if (i13 == 1) {
                            f = 30.0f;
                        } else if (i13 == 2) {
                            f = 26.0f;
                        } else if (i13 == 3) {
                            f = 22.0f;
                        } else {
                            if (i13 != 4) {
                                w511.b();
                                return;
                            }
                            f = 18.0f;
                        }
                        f530 m = an91.m(ljs0.b(x2yVar, f, 0.0f, 2), 2.0f, 0.0f, 2);
                        String valueOf2 = String.valueOf(i);
                        int i14 = iArr[buttonSize.ordinal()];
                        if (i14 == 1) {
                            btsVar2.e0(2132740647);
                            ety0Var = xya1.e(btsVar2).e.a;
                            btsVar2.t(false);
                        } else if (i14 == 2) {
                            btsVar2.e0(2132742374);
                            ety0Var = xya1.e(btsVar2).f.c;
                            btsVar2.t(false);
                        } else if (i14 == 3) {
                            btsVar2.e0(2132744070);
                            ety0Var = xya1.e(btsVar2).g.b;
                            btsVar2.t(false);
                        } else {
                            if (i14 != 4) {
                                throw unr0.y(2132738925, btsVar2, false);
                            }
                            btsVar2.e0(2132745892);
                            ety0Var = xya1.e(btsVar2).h.c;
                            btsVar2.t(false);
                        }
                        ety0 ety0Var2 = ety0Var;
                        boolean z8 = false;
                        jeb1.f(valueOf2, m, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var2, btsVar2, 0, 0, 16252);
                        boolean z9 = i < i3;
                        if (tlsVar == null) {
                            btsVar2.e0(1690700819);
                            btsVar2.t(false);
                            f530Var5 = null;
                        } else {
                            btsVar2.e0(1690700820);
                            boolean z10 = z && z9;
                            awk0 awk0Var2 = new awk0(0);
                            boolean z11 = ((i10 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | ((i10 & 14) == 4);
                            Object Q2 = btsVar2.Q();
                            if (z11 || Q2 == o430Var) {
                                Q2 = new oz6(i, 1, tlsVar);
                                btsVar2.o0(Q2);
                            }
                            f530 d5 = q791.d(c530Var, z10, null, awk0Var2, (sls) Q2, 10);
                            z8 = false;
                            btsVar2.t(false);
                            f530Var5 = d5;
                        }
                        f530 k2 = ljs0.i(c530Var, buttonSize.getSize()).k(f530Var5 == null ? c530Var : f530Var5);
                        z910 d6 = pi6.d(uo5Var, z8);
                        int hashCode3 = Long.hashCode(btsVar2.T);
                        r1b0 o3 = btsVar2.o();
                        f530 d7 = b.d(btsVar2, k2);
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, wlsVar, d6);
                        qje.W(btsVar2, wlsVar2, o3);
                        vfc.v(hashCode3, btsVar2, wlsVar3, btsVar2, tlsVar4);
                        qje.W(btsVar2, wlsVar4, d7);
                        f530 b3 = tra1.b(c530Var, z9 ? 1.0f : 0.25f);
                        int i15 = iArr[buttonSize.ordinal()];
                        if (i15 == 1 || i15 == 2) {
                            b = cq91.b();
                        } else {
                            if (i15 != 3 && i15 != 4) {
                                w511.b();
                                return;
                            }
                            b = hq91.c();
                        }
                        sya1.a(b, b3, (str6 != null && z && z9) ? str6 : null, null, btsVar2, 0, 8);
                        btsVar = btsVar2;
                        btsVar.t(true);
                        btsVar.t(true);
                        f530Var3 = f530Var7;
                        str3 = str6;
                    }
                    final boolean z12 = z;
                    final String str7 = str2;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: pz6
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ncb1.a(i, f530Var3, z12, i2, i3, tlsVar, str3, str7, buttonSize, (fid) obj, vng.O(i4 | 1), i5);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                dmw0Var = dmw0Var2;
                if ((i4 & 100663296) == 0) {
                }
                i10 = i6;
                if (btsVar2.V(i10 & 1, (38347923 & i6) == 38347922)) {
                }
                final boolean z122 = z;
                final String str72 = str2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            }
            if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if ((196608 & i4) == 0) {
            }
            i8 = i5 & 64;
            if (i8 != 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            dmw0Var = dmw0Var2;
            if ((i4 & 100663296) == 0) {
            }
            i10 = i6;
            if (btsVar2.V(i10 & 1, (38347923 & i6) == 38347922)) {
            }
            final boolean z1222 = z;
            final String str722 = str2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((196608 & i4) == 0) {
        }
        i8 = i5 & 64;
        if (i8 != 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        dmw0Var = dmw0Var2;
        if ((i4 & 100663296) == 0) {
        }
        i10 = i6;
        if (btsVar2.V(i10 & 1, (38347923 & i6) == 38347922)) {
        }
        final boolean z12222 = z;
        final String str7222 = str2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final Set b(jz60 jz60Var) {
        ArrayList arrayList = jz60Var.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ycc.r(((az60) it.next()).a, arrayList2);
        }
        return a.N0(arrayList2);
    }

    public static final Set c(jz60 jz60Var) {
        ArrayList arrayList = jz60Var.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ycc.r(((cz60) it.next()).a, arrayList2);
        }
        return a.N0(arrayList2);
    }

    public static xkx d(int i, int i2) {
        tbn tbnVar = ubn.d;
        wkx wkxVar = new wkx();
        wkxVar.a(0, Float.valueOf(0.0f)).b = tbnVar;
        Float valueOf = Float.valueOf(1.0f);
        wkxVar.a(i, valueOf);
        if (i2 > 0) {
            wkxVar.a(i + i2, valueOf);
        }
        wkxVar.a = i + i2;
        return new xkx(wkxVar);
    }
}
