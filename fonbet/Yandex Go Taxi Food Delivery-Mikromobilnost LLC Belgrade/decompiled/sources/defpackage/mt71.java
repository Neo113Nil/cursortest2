package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.care.camera.data.BackgroundVisibility;
import ru.yandex.logistics.care.camera.data.OverlayImage;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import yads.t31;
import yads.wk2;

/* loaded from: classes4.dex */
public abstract class mt71 {
    public static final void a(boolean z, boolean z2, boolean z3, String str, ozd ozdVar, pzd pzdVar, tls tlsVar, f530 f530Var, int i, BackgroundVisibility backgroundVisibility, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(885668102);
        int i3 = i2 | (btsVar.a(z) ? 4 : 2) | (btsVar.a(z2) ? 32 : 16) | (btsVar.a(z3) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.k(ozdVar) ? 16384 : 8192) | (btsVar.k(pzdVar) ? 131072 : 65536) | (btsVar.e(tlsVar) ? 1048576 : 524288) | (btsVar.c(i) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.c(backgroundVisibility.ordinal()) ? 536870912 : SelfTester_JCP.IMITA);
        if (!btsVar.V(i3 & 1, (306783379 & i3) != 306783378)) {
            btsVar.Y();
        } else if (i == 90 || i == 270) {
            btsVar.e0(954735781);
            b(z, z2, z3, str, ozdVar, pzdVar, tlsVar, f530Var, backgroundVisibility, btsVar, (i3 & 33554430) | ((i3 >> 3) & 234881024));
            btsVar.t(false);
        } else {
            btsVar.e0(955145446);
            c(z, z2, z3, str, ozdVar, pzdVar, tlsVar, f530Var, backgroundVisibility, btsVar, (i3 & 33554430) | ((i3 >> 3) & 234881024));
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq7(z, z2, z3, str, ozdVar, pzdVar, tlsVar, f530Var, i, backgroundVisibility, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final void b(boolean z, boolean z2, boolean z3, String str, ozd ozdVar, pzd pzdVar, tls tlsVar, f530 f530Var, BackgroundVisibility backgroundVisibility, fid fidVar, int i) {
        int i2;
        String str2;
        bts btsVar;
        uo5 uo5Var;
        cj6 cj6Var;
        wls wlsVar;
        uo5 uo5Var2;
        sls slsVar;
        ?? r4;
        ldc ldcVar;
        long j;
        bts btsVar2;
        int i3;
        bts btsVar3;
        bts btsVar4;
        boolean z4;
        bts btsVar5;
        uo5 uo5Var3 = x4c.y;
        bts btsVar6 = (bts) fidVar;
        btsVar6.g0(2066295244);
        dmw0 dmw0Var = btsVar6.a;
        if ((i & 6) == 0) {
            i2 = (btsVar6.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar6.a(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar6.a(z3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar6.k(str) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= (32768 & i) == 0 ? btsVar6.k(ozdVar) : btsVar6.e(ozdVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar6.k(pzdVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar6.e(tlsVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar6.k(f530Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar6.c(backgroundVisibility.ordinal()) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        int i4 = i2;
        if (btsVar6.V(i4 & 1, (i4 & 38347923) != 38347922)) {
            int i5 = i4 >> 21;
            uo5 uo5Var4 = x4c.b;
            z910 d = pi6.d(uo5Var4, false);
            int hashCode = Long.hashCode(btsVar6.T);
            r1b0 o = btsVar6.o();
            f530 d2 = b.d(btsVar6, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar6.i0();
            if (btsVar6.S) {
                btsVar6.n(slsVar2);
            } else {
                btsVar6.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar6, wlsVar2, d);
            wls wlsVar3 = d.e;
            qje.W(btsVar6, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar6, hashCode, wlsVar4);
            }
            wls wlsVar5 = d.d;
            qje.W(btsVar6, wlsVar5, d2);
            boolean z5 = ozdVar instanceof nzd;
            c530 c530Var = c530.a;
            cj6 cj6Var2 = cj6.a;
            if (z5) {
                btsVar6.e0(1443630617);
                OverlayImage overlayImage = ((nzd) ozdVar).b;
                Integer valueOf = overlayImage != null ? Integer.valueOf(overlayImage.getDrawableId()) : null;
                if (valueOf == null) {
                    btsVar6.e0(1443630616);
                    btsVar6.t(false);
                    uo5Var = uo5Var3;
                    z4 = false;
                    cj6Var = cj6Var2;
                    wlsVar = wlsVar3;
                    uo5Var2 = uo5Var4;
                    slsVar = slsVar2;
                    btsVar5 = btsVar6;
                } else {
                    btsVar6.e0(1443630617);
                    pa90 m = m(valueOf.intValue(), 0, btsVar6);
                    f530 n = an91.n(cj6Var2.a(c530Var, uo5Var3).k(ljs0.c), 144.0f, 112.0f, 144.0f, 48.0f);
                    wlsVar = wlsVar3;
                    uo5Var2 = uo5Var4;
                    z4 = false;
                    slsVar = slsVar2;
                    uo5Var = uo5Var3;
                    cj6Var = cj6Var2;
                    o4b1.b(m, null, n, null, null, 0.0f, null, btsVar6, 48, 120);
                    bts btsVar7 = btsVar6;
                    btsVar7.t(false);
                    btsVar5 = btsVar7;
                }
                btsVar5.t(z4);
                r4 = z4;
                btsVar2 = btsVar5;
            } else {
                uo5Var = uo5Var3;
                cj6Var = cj6Var2;
                wlsVar = wlsVar3;
                uo5Var2 = uo5Var4;
                slsVar = slsVar2;
                r4 = 0;
                r4 = 0;
                if (ozdVar instanceof mzd) {
                    btsVar6.e0(1444086689);
                    String str3 = ((mzd) ozdVar).b;
                    if (str3 != null) {
                        try {
                            ldcVar = new ldc(rzo.d(Color.parseColor(str3)));
                        } catch (Exception unused) {
                            ldcVar = null;
                        }
                        if (ldcVar != null) {
                            j = ldcVar.a;
                            i(j, backgroundVisibility, ljs0.c, btsVar6, (i5 & 112) | 384);
                            btsVar6.t(false);
                            btsVar2 = btsVar6;
                        }
                    }
                    j = ldc.f;
                    i(j, backgroundVisibility, ljs0.c, btsVar6, (i5 & 112) | 384);
                    btsVar6.t(false);
                    btsVar2 = btsVar6;
                } else {
                    if (ozdVar != null) {
                        throw unr0.y(-507623521, btsVar6, false);
                    }
                    btsVar6.e0(-507595786);
                    btsVar6.t(false);
                    btsVar2 = btsVar6;
                }
            }
            f530 a = cj6Var.a(an91.o(ljs0.b, 0.0f, 0.0f, 24.0f, 0.0f, 11), x4c.z);
            z910 d3 = pi6.d(uo5Var2, r4);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d4 = b.d(btsVar2, a);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, d3);
            qje.W(btsVar2, wlsVar, o2);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar4);
            }
            qje.W(btsVar2, wlsVar5, d4);
            o430 o430Var = did.a;
            if (z) {
                btsVar2.e0(-541125390);
                cuj0 cuj0Var = new cuj0(z3 ? jyg0.ic_flashlight_on : jyg0.ic_flashlight_off, null, null, new zez0(ldc.f), 22);
                f530 b = m4m0.b(ljs0.a(an91.o(cj6Var.a(c530Var, x4c.c), 0.0f, 16.0f, 0.0f, 0.0f, 13), 48.0f, 48.0f), ldc.b(ldc.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), cyk0.a);
                i3 = 1048576;
                boolean z6 = (i4 & 3670016) == 1048576 ? true : r4;
                Object Q = btsVar2.Q();
                Object obj = Q;
                if (z6 || Q == o430Var) {
                    zp5 zp5Var = new zp5(11, tlsVar);
                    btsVar2.o0(zp5Var);
                    obj = zp5Var;
                }
                fid fidVar2 = btsVar2;
                s3b1.c(cuj0Var, b, false, null, false, null, (sls) obj, fidVar2, 0, 60);
                bts btsVar8 = fidVar2;
                btsVar8.t(r4);
                btsVar3 = btsVar8;
            } else {
                i3 = 1048576;
                btsVar2.e0(-540473398);
                btsVar2.t(r4);
                btsVar3 = btsVar2;
            }
            if (pzdVar == null) {
                btsVar3.e0(-540423457);
                boolean z7 = (i4 & 3670016) == i3 ? true : r4;
                Object Q2 = btsVar3.Q();
                Object obj2 = Q2;
                if (z7 || Q2 == o430Var) {
                    zp5 zp5Var2 = new zp5(12, tlsVar);
                    btsVar3.o0(zp5Var2);
                    obj2 = zp5Var2;
                }
                d(r4, btsVar3, (sls) obj2, cj6Var.a(c530Var, uo5Var));
                btsVar3.t(r4);
            } else {
                btsVar3.e0(-540197622);
                btsVar3.t(r4);
            }
            if (z2) {
                btsVar3.e0(-540130104);
                long b2 = ldc.b(ldc.b, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                byk0 byk0Var = cyk0.a;
                f530 a2 = ljs0.a(an91.o(cj6Var.a(c530Var, x4c.B), 0.0f, 0.0f, 0.0f, 16.0f, 7), 48.0f, 48.0f);
                boolean z8 = (i4 & 3670016) == i3 ? true : r4;
                Object Q3 = btsVar3.Q();
                int i6 = 13;
                Object obj3 = Q3;
                if (z8 || Q3 == o430Var) {
                    zp5 zp5Var3 = new zp5(i6, tlsVar);
                    btsVar3.o0(zp5Var3);
                    obj3 = zp5Var3;
                }
                str2 = str;
                fid fidVar3 = btsVar3;
                a.b((sls) obj3, a2, byk0Var, b2, 0L, null, null, null, false, null, null, null, wwg.S(-258197300, true, new le(str2, i6), btsVar3), fidVar3, HProv.ALG_TYPE_SECURECHANNEL, 384, 4080);
                bts btsVar9 = fidVar3;
                btsVar9.t(r4);
                btsVar4 = btsVar9;
            } else {
                str2 = str;
                btsVar3.e0(-539499254);
                btsVar3.t(r4);
                btsVar4 = btsVar3;
            }
            btsVar4.t(true);
            btsVar4.t(true);
            btsVar = btsVar4;
        } else {
            str2 = str;
            btsVar6.Y();
            btsVar = btsVar6;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq7(z, z2, z3, str2, ozdVar, pzdVar, tlsVar, f530Var, backgroundVisibility, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final void c(boolean z, boolean z2, boolean z3, String str, ozd ozdVar, pzd pzdVar, tls tlsVar, f530 f530Var, BackgroundVisibility backgroundVisibility, fid fidVar, int i) {
        int i2;
        String str2;
        bts btsVar;
        uo5 uo5Var;
        cj6 cj6Var;
        wls wlsVar;
        uo5 uo5Var2;
        sls slsVar;
        ?? r4;
        ldc ldcVar;
        long j;
        bts btsVar2;
        int i3;
        bts btsVar3;
        bts btsVar4;
        boolean z4;
        bts btsVar5;
        uo5 uo5Var3 = x4c.y;
        bts btsVar6 = (bts) fidVar;
        btsVar6.g0(-646622178);
        dmw0 dmw0Var = btsVar6.a;
        if ((i & 6) == 0) {
            i2 = (btsVar6.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar6.a(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar6.a(z3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar6.k(str) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= (32768 & i) == 0 ? btsVar6.k(ozdVar) : btsVar6.e(ozdVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar6.k(pzdVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar6.e(tlsVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar6.k(f530Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar6.c(backgroundVisibility.ordinal()) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        int i4 = i2;
        if (btsVar6.V(i4 & 1, (i4 & 38347923) != 38347922)) {
            int i5 = i4 >> 21;
            uo5 uo5Var4 = x4c.b;
            z910 d = pi6.d(uo5Var4, false);
            int hashCode = Long.hashCode(btsVar6.T);
            r1b0 o = btsVar6.o();
            f530 d2 = b.d(btsVar6, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar6.i0();
            if (btsVar6.S) {
                btsVar6.n(slsVar2);
            } else {
                btsVar6.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar6, wlsVar2, d);
            wls wlsVar3 = d.e;
            qje.W(btsVar6, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar6, hashCode, wlsVar4);
            }
            wls wlsVar5 = d.d;
            qje.W(btsVar6, wlsVar5, d2);
            boolean z5 = ozdVar instanceof nzd;
            c530 c530Var = c530.a;
            cj6 cj6Var2 = cj6.a;
            if (z5) {
                btsVar6.e0(1759650228);
                OverlayImage overlayImage = ((nzd) ozdVar).b;
                Integer valueOf = overlayImage != null ? Integer.valueOf(overlayImage.getDrawableId()) : null;
                if (valueOf == null) {
                    btsVar6.e0(1759650227);
                    btsVar6.t(false);
                    uo5Var = uo5Var3;
                    z4 = false;
                    cj6Var = cj6Var2;
                    wlsVar = wlsVar3;
                    uo5Var2 = uo5Var4;
                    slsVar = slsVar2;
                    btsVar5 = btsVar6;
                } else {
                    btsVar6.e0(1759650228);
                    pa90 m = m(valueOf.intValue(), 0, btsVar6);
                    f530 n = an91.n(cj6Var2.a(c530Var, uo5Var3).k(ljs0.c), 48.0f, 144.0f, 48.0f, 144.0f);
                    uo5Var = uo5Var3;
                    cj6Var = cj6Var2;
                    uo5Var2 = uo5Var4;
                    slsVar = slsVar2;
                    wlsVar = wlsVar3;
                    z4 = false;
                    o4b1.b(m, null, n, null, null, 0.0f, null, btsVar6, 48, 120);
                    bts btsVar7 = btsVar6;
                    btsVar7.t(false);
                    btsVar5 = btsVar7;
                }
                btsVar5.t(z4);
                r4 = z4;
                btsVar2 = btsVar5;
            } else {
                uo5Var = uo5Var3;
                cj6Var = cj6Var2;
                wlsVar = wlsVar3;
                uo5Var2 = uo5Var4;
                slsVar = slsVar2;
                r4 = 0;
                r4 = 0;
                if (ozdVar instanceof mzd) {
                    btsVar6.e0(1760105339);
                    String str3 = ((mzd) ozdVar).b;
                    if (str3 != null) {
                        try {
                            ldcVar = new ldc(rzo.d(Color.parseColor(str3)));
                        } catch (Exception unused) {
                            ldcVar = null;
                        }
                        if (ldcVar != null) {
                            j = ldcVar.a;
                            i(j, backgroundVisibility, ljs0.c, btsVar6, (i5 & 112) | 384);
                            btsVar6.t(false);
                            btsVar2 = btsVar6;
                        }
                    }
                    j = ldc.f;
                    i(j, backgroundVisibility, ljs0.c, btsVar6, (i5 & 112) | 384);
                    btsVar6.t(false);
                    btsVar2 = btsVar6;
                } else {
                    if (ozdVar != null) {
                        throw unr0.y(-497429340, btsVar6, false);
                    }
                    btsVar6.e0(-497401636);
                    btsVar6.t(false);
                    btsVar2 = btsVar6;
                }
            }
            f530 a = cj6Var.a(an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7), x4c.B);
            z910 d3 = pi6.d(uo5Var2, r4);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d4 = b.d(btsVar2, a);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, d3);
            qje.W(btsVar2, wlsVar, o2);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar4);
            }
            qje.W(btsVar2, wlsVar5, d4);
            o430 o430Var = did.a;
            if (z) {
                btsVar2.e0(-105547016);
                cuj0 cuj0Var = new cuj0(z3 ? jyg0.ic_flashlight_on : jyg0.ic_flashlight_off, null, null, new zez0(ldc.f), 22);
                f530 b = m4m0.b(ljs0.a(an91.o(cj6Var.a(c530Var, x4c.z), 0.0f, 0.0f, 16.0f, 0.0f, 11), 48.0f, 48.0f), ldc.b(ldc.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), cyk0.a);
                i3 = 1048576;
                boolean z6 = (i4 & 3670016) == 1048576 ? true : r4;
                Object Q = btsVar2.Q();
                Object obj = Q;
                if (z6 || Q == o430Var) {
                    zp5 zp5Var = new zp5(8, tlsVar);
                    btsVar2.o0(zp5Var);
                    obj = zp5Var;
                }
                fid fidVar2 = btsVar2;
                s3b1.c(cuj0Var, b, false, null, false, null, (sls) obj, fidVar2, 0, 60);
                bts btsVar8 = fidVar2;
                btsVar8.t(r4);
                btsVar3 = btsVar8;
            } else {
                i3 = 1048576;
                btsVar2.e0(-104895024);
                btsVar2.t(r4);
                btsVar3 = btsVar2;
            }
            if (pzdVar == null) {
                btsVar3.e0(-104845083);
                boolean z7 = (i4 & 3670016) == i3 ? true : r4;
                Object Q2 = btsVar3.Q();
                Object obj2 = Q2;
                if (z7 || Q2 == o430Var) {
                    zp5 zp5Var2 = new zp5(9, tlsVar);
                    btsVar3.o0(zp5Var2);
                    obj2 = zp5Var2;
                }
                d(r4, btsVar3, (sls) obj2, cj6Var.a(c530Var, uo5Var));
                btsVar3.t(r4);
            } else {
                btsVar3.e0(-104619248);
                btsVar3.t(r4);
            }
            if (z2) {
                btsVar3.e0(-104551792);
                long b2 = ldc.b(ldc.b, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                byk0 byk0Var = cyk0.a;
                f530 a2 = ljs0.a(an91.o(cj6Var.a(c530Var, x4c.x), 16.0f, 0.0f, 0.0f, 0.0f, 14), 48.0f, 48.0f);
                boolean z8 = (i4 & 3670016) == i3 ? true : r4;
                Object Q3 = btsVar3.Q();
                Object obj3 = Q3;
                if (z8 || Q3 == o430Var) {
                    zp5 zp5Var3 = new zp5(10, tlsVar);
                    btsVar3.o0(zp5Var3);
                    obj3 = zp5Var3;
                }
                str2 = str;
                fid fidVar3 = btsVar3;
                a.b((sls) obj3, a2, byk0Var, b2, 0L, null, null, null, false, null, null, null, wwg.S(1910793502, true, new le(str2, 12), btsVar3), fidVar3, HProv.ALG_TYPE_SECURECHANNEL, 384, 4080);
                bts btsVar9 = fidVar3;
                btsVar9.t(r4);
                btsVar4 = btsVar9;
            } else {
                str2 = str;
                btsVar3.e0(-103922864);
                btsVar3.t(r4);
                btsVar4 = btsVar3;
            }
            btsVar4.t(true);
            btsVar4.t(true);
            btsVar = btsVar4;
        } else {
            str2 = str;
            btsVar6.Y();
            btsVar = btsVar6;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq7(z, z2, z3, str2, ozdVar, pzdVar, tlsVar, f530Var, backgroundVisibility, i, 2);
        }
    }

    public static final void d(int i, fid fidVar, sls slsVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1136312257);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        int i3 = 18;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            long b = ((Boolean) androidx.compose.foundation.interaction.a.c(zx40Var, btsVar).getValue()).booleanValue() ? ldc.b(ldc.f, 0.7f, 0.0f, 0.0f, 0.0f, 14) : ldc.f;
            f530 m = ljs0.m(f530Var, 72.0f);
            boolean z = (i2 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new jc0(10, slsVar);
                btsVar.o0(Q2);
            }
            sls slsVar2 = (sls) Q2;
            long j = b;
            f530 b2 = q791.b(m, zx40Var, null, false, null, null, slsVar2, 28);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            pi6.a(m4m0.b(ymb1.l(ljs0.m(c530.a, 60.0f), cyk0.a), j, qke.q), btsVar, 0);
            k3r k3rVar = ljs0.c;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new wk6(i3);
                btsVar.o0(Q3);
            }
            qeb1.a(54, btsVar, (tls) Q3, k3rVar);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar, f530Var, i, 2);
        }
    }

    public static final void e(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-620293058);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            pi6.a(m4m0.b(ymb1.l(ljs0.m(f530Var, 48.0f), cyk0.a), rzo.f(4294940948L), qke.q), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 10);
        }
    }

    public static final void f(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(150052700);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            long f = rzo.f(4294762496L);
            f530 m = ljs0.m(f530Var, 48.0f);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new cs0(f, 10);
                btsVar.o0(Q);
            }
            qeb1.a(48, btsVar, (tls) Q, m);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 9);
        }
    }

    public static final void g(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-344408821);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            pi6.a(m4m0.b(ljs0.m(f530Var, 48.0f), rzo.f(4294901900L), qke.q), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 7);
        }
    }

    public static final void h(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1121329334);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            long f = rzo.f(4294924576L);
            f530 m = ljs0.m(f530Var, 48.0f);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new cs0(f, 9);
                btsVar.o0(Q);
            }
            qeb1.a(48, btsVar, (tls) Q, m);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 8);
        }
    }

    public static final void i(long j, BackgroundVisibility backgroundVisibility, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(381187189);
        if ((i & 6) == 0) {
            i2 = (btsVar.d(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(backgroundVisibility.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = backgroundVisibility == BackgroundVisibility.Visible ? m4m0.b(f530Var, j, qke.q) : f530Var;
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            g(an91.k(cj6Var.a(c530Var, uo5Var), 30.0f), btsVar, 0);
            h(an91.k(cj6Var.a(c530Var, x4c.w), 30.0f), btsVar, 0);
            e(an91.k(cj6Var.a(c530Var, x4c.A), 30.0f), btsVar, 0);
            f(an91.k(cj6Var.a(c530Var, x4c.C), 30.0f), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lq7(j, backgroundVisibility, f530Var, i);
        }
    }

    public static wk2 j(pn71 pn71Var, ArrayList arrayList) {
        p481 p481Var = t31.b;
        ela1.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            kq71 a = pn71Var.a(bundle);
            a.getClass();
            int i3 = i2 + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, jr71.a(objArr.length, i3));
            }
            objArr[i2] = a;
            i++;
            i2 = i3;
        }
        return t31.p(i2, objArr);
    }

    public static final float k(gxg gxgVar, float f, float f2) {
        gor gorVar = ((hxg) gxgVar).a;
        gorVar.c();
        oj2 oj2Var = new oj2(0.0f);
        int b = oj2Var.b();
        int i = 0;
        while (i < b) {
            oj2Var.e(gorVar.j(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f), i);
            i++;
        }
        return oj2Var.a;
    }

    public static final String l(String str) {
        String host = Uri.parse(str).getHost();
        return host == null ? "" : host;
    }

    public static final pa90 m(int i, int i2, fid fidVar) {
        TypedValue typedValue;
        boolean z;
        bts btsVar = (bts) fidVar;
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) btsVar.m(AndroidCompositionLocals_androidKt.c);
        duj0 duj0Var = (duj0) btsVar.m(AndroidCompositionLocals_androidKt.e);
        synchronized (duj0Var) {
            typedValue = (TypedValue) duj0Var.a.b(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                wx40 wx40Var = duj0Var.a;
                int d = wx40Var.d(i);
                Object[] objArr = wx40Var.c;
                Object obj = objArr[d];
                wx40Var.b[d] = i;
                objArr[d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !evu0.A(charSequence, ".xml")) {
            btsVar.e0(-1771643000);
            Resources.Theme theme = context.getTheme();
            boolean k = btsVar.k(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !btsVar.c(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean k2 = k | z | btsVar.k(theme);
            Object Q = btsVar.Q();
            if (k2 || Q == did.a) {
                try {
                    Q = new u92(((BitmapDrawable) resources.getDrawable(i, null)).getBitmap());
                    btsVar.o0(Q);
                } catch (Exception e) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            a16 a16Var = new a16((l8v) Q);
            btsVar.t(false);
            return a16Var;
        }
        btsVar.e0(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i3 = typedValue.changingConfigurations;
        pgv pgvVar = (pgv) btsVar.m(AndroidCompositionLocals_androidKt.d);
        ogv ogvVar = new ogv(theme2, i);
        WeakReference weakReference = (WeakReference) pgvVar.a.get(ogvVar);
        ngv ngvVar = weakReference != null ? (ngv) weakReference.get() : null;
        if (ngvVar == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!jl40.l(xml.getName(), "vector")) {
                ny61.g("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            ngvVar = ea91.a(theme2, resources, xml, i3);
            pgvVar.a.put(ogvVar, new WeakReference(ngvVar));
        }
        androidx.compose.ui.graphics.vector.b c = ba91.c(ngvVar.a, btsVar);
        btsVar.t(false);
        return c;
    }
}
