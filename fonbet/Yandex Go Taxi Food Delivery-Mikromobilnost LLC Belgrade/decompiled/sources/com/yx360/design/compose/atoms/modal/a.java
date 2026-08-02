package com.yx360.design.compose.atoms.modal;

import android.content.res.Configuration;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.gestures.e;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import defpackage.ah6;
import defpackage.aii0;
import defpackage.at5;
import defpackage.b64;
import defpackage.bam;
import defpackage.bts;
import defpackage.c530;
import defpackage.c73;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.did;
import defpackage.dsm;
import defpackage.esm;
import defpackage.f22;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.g8e;
import defpackage.gn;
import defpackage.gsm;
import defpackage.gxg;
import defpackage.i62;
import defpackage.idb1;
import defpackage.ist0;
import defpackage.jbm;
import defpackage.jl40;
import defpackage.lah;
import defpackage.ljs0;
import defpackage.lu91;
import defpackage.nep0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qnm;
import defpackage.qrm;
import defpackage.r1b0;
import defpackage.rrm;
import defpackage.sb2;
import defpackage.sls;
import defpackage.srm;
import defpackage.tig0;
import defpackage.tls;
import defpackage.trm;
import defpackage.txk;
import defpackage.vom;
import defpackage.w4f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xjg;
import defpackage.xrm;
import defpackage.y7m;
import defpackage.yo1;
import defpackage.yrm;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, f530 f530Var, trm trmVar, String str, wls wlsVar, lu91 lu91Var, xjg xjgVar, qrm qrmVar, androidx.compose.runtime.internal.a aVar, fid fidVar, int i, int i2) {
        sls slsVar2;
        int i3;
        f530 f530Var2;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        wls wlsVar2;
        int i8;
        lu91 lu91Var2;
        int i9;
        int i10;
        srm srmVar;
        xjg xjgVar2;
        qrm qrmVar2;
        trm trmVar2;
        f530 f530Var3;
        Object Q;
        lu91 lu91Var3;
        wls wlsVar3;
        xjg xjgVar3;
        String str3;
        trm trmVar3;
        f530 f530Var4;
        qrm qrmVar3;
        int i11;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1949416160);
        if ((i & 6) == 0) {
            slsVar2 = slsVar;
            i3 = (btsVar.e(slsVar2) ? 4 : 2) | i;
        } else {
            slsVar2 = slsVar;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? btsVar.k(trmVar) : btsVar.e(trmVar) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                str2 = str;
                i3 |= btsVar.k(str2) ? 2048 : 1024;
                i6 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
                i7 = i2 & 32;
                if (i7 != 0) {
                    i6 = 221184 | i3;
                } else if ((196608 & i) == 0) {
                    wlsVar2 = wlsVar;
                    i6 |= btsVar.e(wlsVar2) ? 131072 : 65536;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i6 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        lu91Var2 = lu91Var;
                        i6 |= btsVar.k(lu91Var2) ? 1048576 : 524288;
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i6 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i6 |= btsVar.k(xjgVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i2 & 256) == 0 && btsVar.k(qrmVar)) {
                                i11 = SelfTester_JCP.DECRYPT_CBC;
                                i6 |= i11;
                            }
                            i11 = SelfTester_JCP.DECRYPT_CFB;
                            i6 |= i11;
                        }
                        if ((i & 805306368) == 0) {
                            i6 |= btsVar.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
                        }
                        if ((i6 & 306783379) == 306783378 || !btsVar.E()) {
                            btsVar.a0();
                            i10 = i & 1;
                            srmVar = srm.a;
                            if (i10 != 0 || btsVar.C()) {
                                if (i12 != 0) {
                                    f530Var2 = c530.a;
                                }
                                trm trmVar4 = i4 != 0 ? srmVar : trmVar;
                                if (i5 != 0) {
                                    str2 = null;
                                }
                                if (i7 != 0) {
                                    wlsVar2 = null;
                                }
                                if (i8 != 0) {
                                    lu91Var2 = null;
                                }
                                xjgVar2 = i9 == 0 ? xjgVar : null;
                                if ((i2 & 256) != 0) {
                                    trmVar2 = trmVar4;
                                    f530Var3 = f530Var2;
                                    qrmVar2 = yrm.f(btsVar);
                                    lu91 lu91Var4 = lu91Var2;
                                    btsVar.u();
                                    fwi fwiVar = (fwi) btsVar.m(j.h);
                                    qnm.d.getClass();
                                    btsVar.e0(1849434622);
                                    Q = btsVar.Q();
                                    if (Q == did.a) {
                                        Q = f.j(new y7m(0.0f));
                                        btsVar.o0(Q);
                                    }
                                    btsVar.t(false);
                                    btsVar.e0(150154529);
                                    Configuration configuration = (Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a);
                                    nep0 nep0Var = new nep0(configuration.screenWidthDp, configuration.screenHeightDp);
                                    btsVar.t(false);
                                    sb2.b(yrm.a.a(Boolean.valueOf(jl40.l(trmVar2, srmVar))), wwg.S(-1341551072, true, new gsm(trmVar2, fwiVar, wwg.S(316628136, true, new w4f(3, str2, wlsVar2, xjgVar2), btsVar), wwg.S(1094967920, true, new vom(27, lu91Var4), btsVar), f530Var3, qrmVar2, slsVar2, (oz40) Q, aVar, nep0Var.b), btsVar), btsVar, 56);
                                    lu91Var3 = lu91Var4;
                                    wlsVar3 = wlsVar2;
                                    xjgVar3 = xjgVar2;
                                    str3 = str2;
                                    trmVar3 = trmVar2;
                                    f530Var4 = f530Var3;
                                    qrmVar3 = qrmVar2;
                                } else {
                                    qrmVar2 = qrmVar;
                                    trmVar2 = trmVar4;
                                }
                            } else {
                                btsVar.Y();
                                trmVar2 = trmVar;
                                xjgVar2 = xjgVar;
                                qrmVar2 = qrmVar;
                            }
                            f530Var3 = f530Var2;
                            lu91 lu91Var42 = lu91Var2;
                            btsVar.u();
                            fwi fwiVar2 = (fwi) btsVar.m(j.h);
                            qnm.d.getClass();
                            btsVar.e0(1849434622);
                            Q = btsVar.Q();
                            if (Q == did.a) {
                            }
                            btsVar.t(false);
                            btsVar.e0(150154529);
                            Configuration configuration2 = (Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a);
                            nep0 nep0Var2 = new nep0(configuration2.screenWidthDp, configuration2.screenHeightDp);
                            btsVar.t(false);
                            sb2.b(yrm.a.a(Boolean.valueOf(jl40.l(trmVar2, srmVar))), wwg.S(-1341551072, true, new gsm(trmVar2, fwiVar2, wwg.S(316628136, true, new w4f(3, str2, wlsVar2, xjgVar2), btsVar), wwg.S(1094967920, true, new vom(27, lu91Var42), btsVar), f530Var3, qrmVar2, slsVar2, (oz40) Q, aVar, nep0Var2.b), btsVar), btsVar, 56);
                            lu91Var3 = lu91Var42;
                            wlsVar3 = wlsVar2;
                            xjgVar3 = xjgVar2;
                            str3 = str2;
                            trmVar3 = trmVar2;
                            f530Var4 = f530Var3;
                            qrmVar3 = qrmVar2;
                        } else {
                            btsVar.Y();
                            xjgVar3 = xjgVar;
                            f530Var4 = f530Var2;
                            str3 = str2;
                            lu91Var3 = lu91Var2;
                            qrmVar3 = qrmVar;
                            wlsVar3 = wlsVar2;
                            trmVar3 = trmVar;
                        }
                        aii0 v = btsVar.v();
                        if (v != null) {
                            v.d = new ah6(slsVar, f530Var4, trmVar3, str3, wlsVar3, lu91Var3, xjgVar3, qrmVar3, aVar, i, i2);
                            return;
                        }
                        return;
                    }
                    lu91Var2 = lu91Var;
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    btsVar.a0();
                    i10 = i & 1;
                    srmVar = srm.a;
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                }
                wlsVar2 = wlsVar;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                lu91Var2 = lu91Var;
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                btsVar.a0();
                i10 = i & 1;
                srmVar = srm.a;
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
            }
            str2 = str;
            i6 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            wlsVar2 = wlsVar;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            lu91Var2 = lu91Var;
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            btsVar.a0();
            i10 = i & 1;
            srmVar = srm.a;
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        wlsVar2 = wlsVar;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        lu91Var2 = lu91Var;
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        btsVar.a0();
        i10 = i & 1;
        srmVar = srm.a;
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
    }

    public static final void b(trm trmVar, float f, float f2, androidx.compose.runtime.internal.a aVar, androidx.compose.runtime.internal.a aVar2, androidx.compose.runtime.internal.a aVar3, qrm qrmVar, sls slsVar, fid fidVar, int i) {
        boolean z;
        Object at5Var;
        o430 o430Var;
        lah lahVar;
        ck11 ck11Var;
        gxg gxgVar;
        tls tlsVar;
        float f3;
        e eVar;
        f530 e;
        androidx.compose.runtime.internal.a aVar4;
        androidx.compose.runtime.internal.a aVar5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-348806758);
        int i2 = i | (btsVar.k(trmVar) ? 4 : 2) | (btsVar.b(f) ? 32 : 16) | (btsVar.b(f2) ? 256 : 128) | (btsVar.b(20.0f) ? 2048 : 1024) | (btsVar.e(aVar3) ? 1048576 : 524288) | (btsVar.k(qrmVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.e(slsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if ((38347923 & i2) == 38347922 && btsVar.E()) {
            btsVar.Y();
            aVar4 = aVar;
            aVar5 = aVar2;
        } else {
            float a = idb1.a(f, btsVar);
            float a2 = a - idb1.a(0.0f, btsVar);
            gxg a3 = ist0.a(btsVar);
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                bam bamVar = new bam();
                bamVar.a(SheetValue.Hidden, a);
                bamVar.a(SheetValue.PartiallyExpanded, a2);
                bamVar.a(SheetValue.Expanded, 0.0f);
                float[] fArr = bamVar.b;
                ArrayList arrayList = bamVar.a;
                int size = arrayList.size();
                c73.a(size, fArr.length);
                z = false;
                lah lahVar2 = new lah(arrayList, Arrays.copyOfRange(fArr, 0, size));
                btsVar.o0(lahVar2);
                Q = lahVar2;
            } else {
                z = false;
            }
            lah lahVar3 = (lah) Q;
            btsVar.t(z);
            qnm.d.getClass();
            float a4 = idb1.a(56.0f, btsVar);
            SheetValue sheetValue = SheetValue.PartiallyExpanded;
            btsVar.e0(5004770);
            boolean b = btsVar.b(a4);
            Object Q2 = btsVar.Q();
            if (b || Q2 == o430Var2) {
                Q2 = new yo1(a4, 2);
                btsVar.o0(Q2);
            }
            tls tlsVar2 = (tls) Q2;
            Object k = g8e.k(1849434622, btsVar, false);
            if (k == o430Var2) {
                k = new jbm(26);
                btsVar.o0(k);
            }
            sls slsVar2 = (sls) k;
            btsVar.t(false);
            ck11 K = sb2.K(0, 0, null, 7);
            btsVar.e0(1229789312);
            btsVar.e0(1849434622);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var2) {
                Q3 = new f22(5);
                btsVar.o0(Q3);
            }
            tls tlsVar3 = (tls) Q3;
            Object k2 = g8e.k(1849434622, btsVar, false);
            if (k2 == o430Var2) {
                k2 = new txk(9);
                btsVar.o0(k2);
            }
            wls wlsVar = (wls) k2;
            btsVar.t(false);
            btsVar.e0(-1224400529);
            boolean e2 = btsVar.e(lahVar3) | btsVar.k(tlsVar2) | btsVar.e(K) | btsVar.e(a3) | btsVar.k(tlsVar3);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == o430Var2) {
                o430Var = o430Var2;
                lahVar = lahVar3;
                at5Var = new at5(lahVar, tlsVar2, slsVar2, K, a3, tlsVar3, 3);
                ck11Var = K;
                gxgVar = a3;
                tlsVar = tlsVar3;
                btsVar.o0(at5Var);
            } else {
                tlsVar = tlsVar3;
                o430Var = o430Var2;
                lahVar = lahVar3;
                at5Var = Q4;
                gxgVar = a3;
                ck11Var = K;
            }
            btsVar.t(false);
            tig0 tig0Var = new tig0(wlsVar, (tls) at5Var);
            Object[] objArr = new Object[0];
            btsVar.e0(-1224400529);
            boolean e3 = btsVar.e(lahVar) | btsVar.k(tlsVar2) | btsVar.e(ck11Var) | btsVar.e(gxgVar) | btsVar.k(tlsVar);
            Object Q5 = btsVar.Q();
            if (e3 || Q5 == o430Var) {
                Q5 = new gn(sheetValue, lahVar, tlsVar2, slsVar2, ck11Var, gxgVar, tlsVar, 3);
                btsVar.o0(Q5);
            }
            btsVar.t(false);
            e eVar2 = (e) cvw.W(objArr, tig0Var, (sls) Q5, btsVar, 0);
            btsVar.t(false);
            Object value = eVar2.i.getValue();
            btsVar.e0(-1224400529);
            int i3 = 1;
            boolean k3 = btsVar.k(eVar2) | btsVar.b(a) | ((i2 & 29360128) == 8388608) | ((i2 & 234881024) == 67108864);
            Object Q6 = btsVar.Q();
            if (k3 || Q6 == o430Var) {
                f3 = a;
                eVar = eVar2;
                Q6 = new DsModalPhoneKt$ExpandableModalContent$1$1(eVar, f3, qrmVar, slsVar, null);
                btsVar.o0(Q6);
            } else {
                f3 = a;
                eVar = eVar2;
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q6, value);
            boolean z2 = f3 > a2;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            btsVar.e0(-195775738);
            if (z2) {
                f530 e4 = ljs0.e(c.e(c530Var, eVar, Orientation.Vertical, false, null, 60), f - idb1.e(eVar.j.getFloatValue(), btsVar));
                btsVar.e0(1849434622);
                Object Q7 = btsVar.Q();
                if (Q7 == o430Var) {
                    Q7 = new b(eVar);
                    btsVar.o0(Q7);
                }
                btsVar.t(false);
                e = androidx.compose.ui.input.nestedscroll.b.a(e4, (b) Q7, null);
            } else {
                e = ljs0.e(c530Var, f);
            }
            btsVar.t(false);
            f530 k4 = c.k(e);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k4);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d2);
            aVar4 = aVar;
            aVar5 = aVar2;
            yrm.c(aVar4, aVar5, wwg.S(-476235298, true, new xrm(aVar3, i3), btsVar), btsVar, 438);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dsm(trmVar, f, f2, aVar4, aVar5, aVar3, qrmVar, slsVar, i, 1);
        }
    }

    public static final void c(trm trmVar, float f, float f2, androidx.compose.runtime.internal.a aVar, androidx.compose.runtime.internal.a aVar2, androidx.compose.runtime.internal.a aVar3, qrm qrmVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2118518098);
        int i2 = 2;
        int i3 = i | (btsVar.k(trmVar) ? 4 : 2) | (btsVar.b(f) ? 32 : 16) | (btsVar.b(f2) ? 256 : 128) | (btsVar.b(20.0f) ? 2048 : 1024) | (btsVar.e(aVar3) ? 1048576 : 524288) | (btsVar.k(qrmVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.e(slsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if ((38347923 & i3) == 38347922 && btsVar.E()) {
            btsVar.Y();
        } else {
            int i4 = 1;
            if (jl40.l(trmVar, rrm.a)) {
                btsVar.e0(1772165350);
                yrm.b(null, aVar, aVar2, wwg.S(1115749560, true, new esm(aVar3, i4), btsVar), btsVar, 3504);
                btsVar = btsVar;
                btsVar.t(false);
            } else if (jl40.l(trmVar, srm.a)) {
                btsVar.e0(1772377080);
                f530 c = ljs0.c(ljs0.u(c530.a, null, 3), 1.0f);
                z910 d = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, c);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
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
                yrm.c(aVar, aVar2, wwg.S(-771583021, true, new xrm(aVar3, i2), btsVar), btsVar, 438);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(1772742570);
                b(trmVar, f, f2, aVar, aVar2, aVar3, qrmVar, slsVar, btsVar, i3 & 268435454);
                btsVar.t(false);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dsm(trmVar, f, f2, aVar, aVar2, aVar3, qrmVar, slsVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, float f, ContinuationImpl continuationImpl) {
        DsModalPhoneKt$handleTargetExpanded$1 dsModalPhoneKt$handleTargetExpanded$1;
        int i;
        if (continuationImpl instanceof DsModalPhoneKt$handleTargetExpanded$1) {
            dsModalPhoneKt$handleTargetExpanded$1 = (DsModalPhoneKt$handleTargetExpanded$1) continuationImpl;
            int i2 = dsModalPhoneKt$handleTargetExpanded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsModalPhoneKt$handleTargetExpanded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dsModalPhoneKt$handleTargetExpanded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dsModalPhoneKt$handleTargetExpanded$1.label;
                ck11 ck11Var = null;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object value = eVar.g.getValue();
                    SheetValue sheetValue = SheetValue.Hidden;
                    if (value == sheetValue) {
                        bam bamVar = new bam();
                        bamVar.a(sheetValue, f);
                        float[] fArr = bamVar.b;
                        ArrayList arrayList = bamVar.a;
                        int size = arrayList.size();
                        c73.a(size, fArr.length);
                        e.l(eVar, new lah(arrayList, Arrays.copyOfRange(fArr, 0, size)));
                        return zy11Var;
                    }
                    SheetValue sheetValue2 = SheetValue.Expanded;
                    dsModalPhoneKt$handleTargetExpanded$1.L$0 = eVar;
                    dsModalPhoneKt$handleTargetExpanded$1.F$0 = f;
                    dsModalPhoneKt$handleTargetExpanded$1.label = 1;
                    if (eVar.e()) {
                        ck11 ck11Var2 = eVar.d;
                        if (ck11Var2 != null) {
                            ck11Var = ck11Var2;
                        }
                    } else {
                        ck11Var = i62.a;
                    }
                    if (c.h(eVar, sheetValue2, ck11Var, dsModalPhoneKt$handleTargetExpanded$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = dsModalPhoneKt$handleTargetExpanded$1.F$0;
                    eVar = (e) dsModalPhoneKt$handleTargetExpanded$1.L$0;
                    kotlin.b.b(obj);
                }
                bam bamVar2 = new bam();
                SheetValue sheetValue3 = SheetValue.Expanded;
                bamVar2.a(sheetValue3, 0.0f);
                bamVar2.a(SheetValue.Hidden, f);
                float[] fArr2 = bamVar2.b;
                ArrayList arrayList2 = bamVar2.a;
                int size2 = arrayList2.size();
                c73.a(size2, fArr2.length);
                eVar.k(new lah(arrayList2, Arrays.copyOfRange(fArr2, 0, size2)), sheetValue3);
                return zy11Var;
            }
        }
        dsModalPhoneKt$handleTargetExpanded$1 = new DsModalPhoneKt$handleTargetExpanded$1(continuationImpl);
        Object obj2 = dsModalPhoneKt$handleTargetExpanded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dsModalPhoneKt$handleTargetExpanded$1.label;
        ck11 ck11Var3 = null;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        bam bamVar22 = new bam();
        SheetValue sheetValue32 = SheetValue.Expanded;
        bamVar22.a(sheetValue32, 0.0f);
        bamVar22.a(SheetValue.Hidden, f);
        float[] fArr22 = bamVar22.b;
        ArrayList arrayList22 = bamVar22.a;
        int size22 = arrayList22.size();
        c73.a(size22, fArr22.length);
        eVar.k(new lah(arrayList22, Arrays.copyOfRange(fArr22, 0, size22)), sheetValue32);
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(e eVar, float f, ContinuationImpl continuationImpl) {
        DsModalPhoneKt$handleTargetHidden$1 dsModalPhoneKt$handleTargetHidden$1;
        int i;
        if (continuationImpl instanceof DsModalPhoneKt$handleTargetHidden$1) {
            dsModalPhoneKt$handleTargetHidden$1 = (DsModalPhoneKt$handleTargetHidden$1) continuationImpl;
            int i2 = dsModalPhoneKt$handleTargetHidden$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsModalPhoneKt$handleTargetHidden$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dsModalPhoneKt$handleTargetHidden$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dsModalPhoneKt$handleTargetHidden$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dsModalPhoneKt$handleTargetHidden$1.L$0 = eVar;
                    dsModalPhoneKt$handleTargetHidden$1.F$0 = f;
                    dsModalPhoneKt$handleTargetHidden$1.label = 1;
                    if (eVar.i(0.0f, dsModalPhoneKt$handleTargetHidden$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = dsModalPhoneKt$handleTargetHidden$1.F$0;
                    eVar = (e) dsModalPhoneKt$handleTargetHidden$1.L$0;
                    kotlin.b.b(obj);
                }
                bam bamVar = new bam();
                bamVar.a(SheetValue.Hidden, f);
                float[] fArr = bamVar.b;
                ArrayList arrayList = bamVar.a;
                int size = arrayList.size();
                c73.a(size, fArr.length);
                e.l(eVar, new lah(arrayList, Arrays.copyOfRange(fArr, 0, size)));
                return zy11.a;
            }
        }
        dsModalPhoneKt$handleTargetHidden$1 = new DsModalPhoneKt$handleTargetHidden$1(continuationImpl);
        Object obj2 = dsModalPhoneKt$handleTargetHidden$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dsModalPhoneKt$handleTargetHidden$1.label;
        if (i != 0) {
        }
        bam bamVar2 = new bam();
        bamVar2.a(SheetValue.Hidden, f);
        float[] fArr2 = bamVar2.b;
        ArrayList arrayList2 = bamVar2.a;
        int size2 = arrayList2.size();
        c73.a(size2, fArr2.length);
        e.l(eVar, new lah(arrayList2, Arrays.copyOfRange(fArr2, 0, size2)));
        return zy11.a;
    }
}
