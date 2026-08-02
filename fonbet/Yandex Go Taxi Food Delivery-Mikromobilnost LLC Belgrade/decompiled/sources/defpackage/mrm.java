package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yx360.design.compose.atoms.DsDivider$VerticalPadding;
import com.yx360.design.compose.atoms.DsListItem$Divider;
import com.yx360.design.compose.atoms.c;
import java.util.ArrayList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class mrm {
    public static final a7u0 a = new a7u0(new jbm(23));
    public static final a7u0 b = new a7u0(new jbm(24));

    public static final void a(drm drmVar, crm crmVar, crm crmVar2, wls wlsVar, f530 f530Var, fid fidVar, int i) {
        boolean z;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-394030736);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(drmVar) ? 32 : 16) | (btsVar.k(crmVar) ? 256 : 128) | (btsVar.k(crmVar2) ? 2048 : 1024) | (btsVar.e(wlsVar) ? 16384 : 8192) | ImageMetadata.EDGE_MODE;
        if ((74899 & i2) == 74898 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 k = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(x4c.E));
            qnm.d.getClass();
            f530 m = an91.m(k, 0.0f, 8.0f, 1);
            a7u0 a7u0Var = a;
            f530 b2 = tra1.b(m, ((Boolean) btsVar.m(a7u0Var)).booleanValue() ? 1.0f : 0.48f);
            sic a2 = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a2);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar4);
            }
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d);
            l(drmVar, crmVar, crmVar2, null, btsVar, (i2 >> 3) & 1022);
            btsVar.e0(-968095990);
            c530 c530Var = c530.a;
            if (wlsVar != null) {
                f530 a3 = ((Boolean) btsVar.m(a7u0Var)).booleanValue() ? c530Var : exw0.a(c530Var, zy11.a, com.yx360.design.compose.atoms.utils.b.a);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, a3);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar2, d2);
                qje.W(btsVar, wlsVar3, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
                }
                qje.W(btsVar, wlsVar5, d3);
                z = true;
                xvz.u((i2 >> 12) & 14, wlsVar, btsVar, true);
            } else {
                z = true;
            }
            btsVar.t(false);
            btsVar.t(z);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(drmVar, crmVar, crmVar2, wlsVar, f530Var2, i);
        }
    }

    public static final void b(kk2 kk2Var, long j, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1973117734);
        int i3 = i2 | (btsVar.k(kk2Var) ? 4 : 2) | (btsVar.d(j) ? 32 : 16) | (btsVar.c(i) ? 256 : 128) | (btsVar.k(null) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 c = ljs0.c(c530.a, 1.0f);
            qnm qnmVar = qnm.a;
            ety0 g = ltm.b(btsVar).g(btsVar);
            int i4 = (i3 & 14) | ImageMetadata.EDGE_MODE;
            int i5 = i3 << 3;
            i(kk2Var, g, j, i, c, null, btsVar, i4 | (i5 & 896) | (i5 & 7168) | (i5 & HProv.ALG_CLASS_ALL), 64);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new frm(kk2Var, j, i, i2, 0);
        }
    }

    public static final void c(DsListItem$Divider dsListItem$Divider, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(929196787);
        if ((((btsVar.c(dsListItem$Divider.ordinal()) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            int i2 = lrm.a[dsListItem$Divider.ordinal()];
            if (i2 == 1) {
                btsVar.e0(637384380);
                uo91.a(false, DsDivider$VerticalPadding.NONE, null, btsVar, 54, 4);
                btsVar.t(false);
            } else {
                if (i2 != 2) {
                    throw unr0.y(-395082724, btsVar, false);
                }
                btsVar.e0(637568861);
                uo91.a(true, DsDivider$VerticalPadding.NONE, null, btsVar, 54, 4);
                btsVar.t(false);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new loj(dsListItem$Divider, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(crm crmVar, xqm xqmVar, f530 f530Var, rqm rqmVar, boolean z, crm crmVar2, drm drmVar, wls wlsVar, y7m y7mVar, sls slsVar, fid fidVar, int i, int i2, int i3) {
        int i4;
        xqm xqmVar2;
        f530 f530Var2;
        int i5;
        rqm rqmVar2;
        int i6;
        boolean z2;
        int i7;
        crm crmVar3;
        int i8;
        drm drmVar2;
        int i9;
        wls wlsVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        crm crmVar4;
        drm drmVar3;
        wls wlsVar3;
        rqm rqmVar3;
        f530 f530Var3;
        boolean z3;
        y7m y7mVar2;
        sls slsVar2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(947724062);
        if ((i & 6) == 0) {
            i4 = (btsVar.k(crmVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            xqmVar2 = xqmVar;
            i4 |= btsVar.k(xqmVar2) ? 32 : 16;
        } else {
            xqmVar2 = xqmVar;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar.k(f530Var2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                rqmVar2 = rqmVar;
                i4 |= btsVar.k(rqmVar2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    z2 = z;
                    i4 |= btsVar.a(z2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ImageMetadata.EDGE_MODE;
                        crmVar3 = crmVar2;
                    } else {
                        crmVar3 = crmVar2;
                        if ((i & ImageMetadata.EDGE_MODE) == 0) {
                            i4 |= btsVar.k(crmVar3) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        drmVar2 = drmVar;
                    } else {
                        drmVar2 = drmVar;
                        if ((i & 1572864) == 0) {
                            i4 |= btsVar.k(drmVar2) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        wlsVar2 = wlsVar;
                    } else {
                        wlsVar2 = wlsVar;
                        if ((i & 12582912) == 0) {
                            i4 |= btsVar.e(wlsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                    }
                    i10 = i4;
                    if ((i3 & 256) == 0) {
                        i10 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 |= btsVar.e(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    }
                    if ((i3 & 512) == 0) {
                        i10 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i10 |= btsVar.c(-1) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (btsVar.k(y7mVar) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i15 = i14;
                        i13 |= btsVar.e(slsVar) ? 32 : 16;
                        if ((i10 & 306783379) != 306783378 && (i13 & 19) == 18 && btsVar.E()) {
                            btsVar.Y();
                            y7mVar2 = y7mVar;
                            drmVar3 = drmVar2;
                            f530Var3 = f530Var2;
                            rqmVar3 = rqmVar2;
                            z3 = z2;
                            slsVar2 = slsVar;
                            wlsVar3 = wlsVar2;
                            crmVar4 = crmVar3;
                        } else {
                            if (i16 != 0) {
                                f530Var2 = c530.a;
                            }
                            rqm rqmVar4 = i5 != 0 ? oqm.a : rqmVar2;
                            if (i6 != 0) {
                                z2 = true;
                            }
                            if (i7 != 0) {
                                crmVar3 = null;
                            }
                            drm drmVar4 = i8 != 0 ? null : drmVar2;
                            if (i9 != 0) {
                                wlsVar2 = null;
                            }
                            y7m y7mVar3 = i12 != 0 ? null : y7mVar;
                            sls slsVar3 = i15 != 0 ? null : slsVar;
                            int i17 = i10 >> 12;
                            int i18 = (i10 & 14) | 805306368 | (i17 & 112) | (i17 & 896);
                            int i19 = i10 << 6;
                            int i20 = i18 | (i19 & 7168) | ((i10 >> 9) & HProv.ALG_CLASS_ALL) | (i19 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i10 >> 6)) | ((i10 << 15) & 29360128) | (234881024 & (i10 << 12));
                            int i21 = (i13 & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i10 >> 24) & 112) | ((i13 << 3) & 896);
                            wls wlsVar4 = wlsVar2;
                            f530 f530Var4 = f530Var2;
                            boolean z4 = z2;
                            crm crmVar5 = crmVar3;
                            e(crmVar, crmVar5, drmVar4, xqmVar2, wlsVar4, rqmVar4, null, f530Var4, z4, false, y7mVar3, null, slsVar3, btsVar, i20, i21);
                            crmVar4 = crmVar5;
                            drmVar3 = drmVar4;
                            wlsVar3 = wlsVar4;
                            rqmVar3 = rqmVar4;
                            f530Var3 = f530Var4;
                            z3 = z4;
                            y7mVar2 = y7mVar3;
                            slsVar2 = slsVar3;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new hj9(crmVar, xqmVar, f530Var3, rqmVar3, z3, crmVar4, drmVar3, wlsVar3, y7mVar2, slsVar2, i, i2, i3);
                            return;
                        }
                        return;
                    }
                    i15 = i14;
                    if ((i10 & 306783379) != 306783378) {
                    }
                    if (i16 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    int i172 = i10 >> 12;
                    int i182 = (i10 & 14) | 805306368 | (i172 & 112) | (i172 & 896);
                    int i192 = i10 << 6;
                    int i202 = i182 | (i192 & 7168) | ((i10 >> 9) & HProv.ALG_CLASS_ALL) | (i192 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i10 >> 6)) | ((i10 << 15) & 29360128) | (234881024 & (i10 << 12));
                    int i212 = (i13 & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i10 >> 24) & 112) | ((i13 << 3) & 896);
                    wls wlsVar42 = wlsVar2;
                    f530 f530Var42 = f530Var2;
                    boolean z42 = z2;
                    crm crmVar52 = crmVar3;
                    e(crmVar, crmVar52, drmVar4, xqmVar2, wlsVar42, rqmVar4, null, f530Var42, z42, false, y7mVar3, null, slsVar3, btsVar, i202, i212);
                    crmVar4 = crmVar52;
                    drmVar3 = drmVar4;
                    wlsVar3 = wlsVar42;
                    rqmVar3 = rqmVar4;
                    f530Var3 = f530Var42;
                    z3 = z42;
                    y7mVar2 = y7mVar3;
                    slsVar2 = slsVar3;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z2 = z;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i4;
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                i15 = i14;
                if ((i10 & 306783379) != 306783378) {
                }
                if (i16 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i12 != 0) {
                }
                if (i15 != 0) {
                }
                int i1722 = i10 >> 12;
                int i1822 = (i10 & 14) | 805306368 | (i1722 & 112) | (i1722 & 896);
                int i1922 = i10 << 6;
                int i2022 = i1822 | (i1922 & 7168) | ((i10 >> 9) & HProv.ALG_CLASS_ALL) | (i1922 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i10 >> 6)) | ((i10 << 15) & 29360128) | (234881024 & (i10 << 12));
                int i2122 = (i13 & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i10 >> 24) & 112) | ((i13 << 3) & 896);
                wls wlsVar422 = wlsVar2;
                f530 f530Var422 = f530Var2;
                boolean z422 = z2;
                crm crmVar522 = crmVar3;
                e(crmVar, crmVar522, drmVar4, xqmVar2, wlsVar422, rqmVar4, null, f530Var422, z422, false, y7mVar3, null, slsVar3, btsVar, i2022, i2122);
                crmVar4 = crmVar522;
                drmVar3 = drmVar4;
                wlsVar3 = wlsVar422;
                rqmVar3 = rqmVar4;
                f530Var3 = f530Var422;
                z3 = z422;
                y7mVar2 = y7mVar3;
                slsVar2 = slsVar3;
                v = btsVar.v();
                if (v != null) {
                }
            }
            rqmVar2 = rqmVar;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z2 = z;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i4;
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            i15 = i14;
            if ((i10 & 306783379) != 306783378) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i12 != 0) {
            }
            if (i15 != 0) {
            }
            int i17222 = i10 >> 12;
            int i18222 = (i10 & 14) | 805306368 | (i17222 & 112) | (i17222 & 896);
            int i19222 = i10 << 6;
            int i20222 = i18222 | (i19222 & 7168) | ((i10 >> 9) & HProv.ALG_CLASS_ALL) | (i19222 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i10 >> 6)) | ((i10 << 15) & 29360128) | (234881024 & (i10 << 12));
            int i21222 = (i13 & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i10 >> 24) & 112) | ((i13 << 3) & 896);
            wls wlsVar4222 = wlsVar2;
            f530 f530Var4222 = f530Var2;
            boolean z4222 = z2;
            crm crmVar5222 = crmVar3;
            e(crmVar, crmVar5222, drmVar4, xqmVar2, wlsVar4222, rqmVar4, null, f530Var4222, z4222, false, y7mVar3, null, slsVar3, btsVar, i20222, i21222);
            crmVar4 = crmVar5222;
            drmVar3 = drmVar4;
            wlsVar3 = wlsVar4222;
            rqmVar3 = rqmVar4;
            f530Var3 = f530Var4222;
            z3 = z4222;
            y7mVar2 = y7mVar3;
            slsVar2 = slsVar3;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        rqmVar2 = rqmVar;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i4;
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        i15 = i14;
        if ((i10 & 306783379) != 306783378) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i12 != 0) {
        }
        if (i15 != 0) {
        }
        int i172222 = i10 >> 12;
        int i182222 = (i10 & 14) | 805306368 | (i172222 & 112) | (i172222 & 896);
        int i192222 = i10 << 6;
        int i202222 = i182222 | (i192222 & 7168) | ((i10 >> 9) & HProv.ALG_CLASS_ALL) | (i192222 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & (i10 >> 6)) | ((i10 << 15) & 29360128) | (234881024 & (i10 << 12));
        int i212222 = (i13 & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i10 >> 24) & 112) | ((i13 << 3) & 896);
        wls wlsVar42222 = wlsVar2;
        f530 f530Var42222 = f530Var2;
        boolean z42222 = z2;
        crm crmVar52222 = crmVar3;
        e(crmVar, crmVar52222, drmVar4, xqmVar2, wlsVar42222, rqmVar4, null, f530Var42222, z42222, false, y7mVar3, null, slsVar3, btsVar, i202222, i212222);
        crmVar4 = crmVar52222;
        drmVar3 = drmVar4;
        wlsVar3 = wlsVar42222;
        rqmVar3 = rqmVar4;
        f530Var3 = f530Var42222;
        z3 = z42222;
        y7mVar2 = y7mVar3;
        slsVar2 = slsVar3;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void e(final crm crmVar, final crm crmVar2, final drm drmVar, final xqm xqmVar, final wls wlsVar, final rqm rqmVar, final wls wlsVar2, final f530 f530Var, final boolean z, final boolean z2, final y7m y7mVar, final DsListItem$Divider dsListItem$Divider, final sls slsVar, fid fidVar, final int i, final int i2) {
        drm drmVar2;
        xqm xqmVar2;
        sls slsVar2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(229313561);
        int i3 = (i & 6) == 0 ? (btsVar2.k(crmVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(crmVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            drmVar2 = drmVar;
            i3 |= btsVar2.k(drmVar2) ? 256 : 128;
        } else {
            drmVar2 = drmVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            xqmVar2 = xqmVar;
            i3 |= btsVar2.k(xqmVar2) ? 2048 : 1024;
        } else {
            xqmVar2 = xqmVar;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(wlsVar) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i3 |= btsVar2.k(rqmVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= btsVar2.e(wlsVar2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar2.k(f530Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i3 |= btsVar2.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar2.a(z2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i4 = (i2 & 6) == 0 ? i2 | (btsVar2.k(y7mVar) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= btsVar2.c(dsListItem$Divider == null ? -1 : dsListItem$Divider.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            slsVar2 = slsVar;
            i4 |= btsVar2.e(slsVar2) ? 256 : 128;
        } else {
            slsVar2 = slsVar;
        }
        int i5 = i3;
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.e(null) ? 2048 : 1024;
        }
        int i6 = i4;
        if ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            String[] strArr = {crmVar != null ? ((kk2) crmVar.b).b : null, null, crmVar2 != null ? ((kk2) crmVar2.b).b : null};
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < 3; i7++) {
                String str = strArr[i7];
                if (str != null && !evu0.J(str)) {
                    arrayList.add(str);
                }
            }
            String X = a.X(arrayList, ". ", null, null, new c0m(27), 30);
            btsVar = btsVar2;
            sb2.b(a.a(Boolean.valueOf(z)), wwg.S(1598726361, true, new irm(f530Var, rqmVar, slsVar2, X.length() > 0 ? X.concat(Extension.DOT_CHAR) : "", z2, dsListItem$Divider, y7mVar, xqmVar2, drmVar2, crmVar, crmVar2, wlsVar2, wlsVar), btsVar), btsVar, 56);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(crmVar2, drmVar, xqmVar, wlsVar, rqmVar, wlsVar2, f530Var, z, z2, y7mVar, dsListItem$Divider, slsVar, i, i2) { // from class: hrm
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ y7m C;
                public final /* synthetic */ DsListItem$Divider D;
                public final /* synthetic */ sls E;
                public final /* synthetic */ int F;
                public final /* synthetic */ int G;
                public final /* synthetic */ crm b;
                public final /* synthetic */ xqm c;
                public final /* synthetic */ wls w;
                public final /* synthetic */ rqm x;
                public final /* synthetic */ wls y;
                public final /* synthetic */ f530 z;

                {
                    this.c = xqmVar;
                    this.w = wlsVar;
                    this.x = rqmVar;
                    this.y = wlsVar2;
                    this.z = f530Var;
                    this.A = z;
                    this.B = z2;
                    this.C = y7mVar;
                    this.D = dsListItem$Divider;
                    this.E = slsVar;
                    this.F = i;
                    this.G = i2;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(this.F | 1);
                    int O2 = vng.O(this.G);
                    mrm.e(crm.this, this.b, null, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(crm crmVar, brm brmVar, f530 f530Var, rqm rqmVar, boolean z, wls wlsVar, DsListItem$Divider dsListItem$Divider, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        brm brmVar2;
        f530 f530Var2;
        rqm rqmVar2;
        int i4;
        boolean z2;
        int i5;
        wls wlsVar2;
        int i6;
        int i7;
        sls slsVar2;
        wls wlsVar3;
        f530 f530Var3;
        boolean z3;
        DsListItem$Divider dsListItem$Divider2;
        sls slsVar3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1055520469);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(crmVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            brmVar2 = brmVar;
            i3 |= btsVar.k(brmVar2) ? 32 : 16;
        } else {
            brmVar2 = brmVar;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                rqmVar2 = rqmVar;
                i3 |= btsVar.k(rqmVar2) ? 2048 : 1024;
            } else {
                rqmVar2 = rqmVar;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z2 = z;
                i3 |= btsVar.a(z2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    wlsVar2 = wlsVar;
                    i3 |= btsVar.e(wlsVar2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    int i9 = 1572864;
                    if (i6 == 0) {
                        if ((1572864 & i) == 0) {
                            i9 = btsVar.c(dsListItem$Divider == null ? -1 : dsListItem$Divider.ordinal()) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= btsVar.k(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                            slsVar2 = slsVar;
                        } else {
                            slsVar2 = slsVar;
                            if ((i & 100663296) == 0) {
                                i3 |= btsVar.e(slsVar2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                            }
                        }
                        int i10 = i3;
                        if ((i3 & 38347923) == 38347922 || !btsVar.E()) {
                            f530 f530Var4 = i8 != 0 ? c530.a : f530Var2;
                            boolean z4 = i4 != 0 ? true : z2;
                            if (i5 != 0) {
                                wlsVar2 = null;
                            }
                            DsListItem$Divider dsListItem$Divider3 = i6 != 0 ? null : dsListItem$Divider;
                            sls slsVar4 = i7 != 0 ? null : slsVar2;
                            wls wlsVar4 = wlsVar2;
                            e(crmVar, null, null, brmVar2.a(), wlsVar4, rqmVar2, null, f530Var4, z4, true, null, dsListItem$Divider3, slsVar4, btsVar, (i10 & 14) | 806879664 | ((i10 >> 3) & HProv.ALG_CLASS_ALL) | (458752 & (i10 << 6)) | ((i10 << 15) & 29360128) | ((i10 << 12) & 234881024), ((i10 >> 21) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i10 >> 15) & 112) | ((i10 >> 18) & 896));
                            wlsVar3 = wlsVar4;
                            f530Var3 = f530Var4;
                            z3 = z4;
                            dsListItem$Divider2 = dsListItem$Divider3;
                            slsVar3 = slsVar4;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            z3 = z2;
                            wlsVar3 = wlsVar2;
                            slsVar3 = slsVar2;
                            dsListItem$Divider2 = dsListItem$Divider;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new s07(crmVar, brmVar2, f530Var3, rqmVar, z3, wlsVar3, dsListItem$Divider2, slsVar3, i, i2);
                            return;
                        }
                        return;
                    }
                    i3 |= i9;
                    if ((i2 & 128) != 0) {
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    int i102 = i3;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    wls wlsVar42 = wlsVar2;
                    e(crmVar, null, null, brmVar2.a(), wlsVar42, rqmVar2, null, f530Var4, z4, true, null, dsListItem$Divider3, slsVar4, btsVar, (i102 & 14) | 806879664 | ((i102 >> 3) & HProv.ALG_CLASS_ALL) | (458752 & (i102 << 6)) | ((i102 << 15) & 29360128) | ((i102 << 12) & 234881024), ((i102 >> 21) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i102 >> 15) & 112) | ((i102 >> 18) & 896));
                    wlsVar3 = wlsVar42;
                    f530Var3 = f530Var4;
                    z3 = z4;
                    dsListItem$Divider2 = dsListItem$Divider3;
                    slsVar3 = slsVar4;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                wlsVar2 = wlsVar;
                i6 = i2 & 64;
                int i92 = 1572864;
                if (i6 == 0) {
                }
                i3 |= i92;
                if ((i2 & 128) != 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                int i1022 = i3;
                if ((i3 & 38347923) == 38347922) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                wls wlsVar422 = wlsVar2;
                e(crmVar, null, null, brmVar2.a(), wlsVar422, rqmVar2, null, f530Var4, z4, true, null, dsListItem$Divider3, slsVar4, btsVar, (i1022 & 14) | 806879664 | ((i1022 >> 3) & HProv.ALG_CLASS_ALL) | (458752 & (i1022 << 6)) | ((i1022 << 15) & 29360128) | ((i1022 << 12) & 234881024), ((i1022 >> 21) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i1022 >> 15) & 112) | ((i1022 >> 18) & 896));
                wlsVar3 = wlsVar422;
                f530Var3 = f530Var4;
                z3 = z4;
                dsListItem$Divider2 = dsListItem$Divider3;
                slsVar3 = slsVar4;
                v = btsVar.v();
                if (v != null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            wlsVar2 = wlsVar;
            i6 = i2 & 64;
            int i922 = 1572864;
            if (i6 == 0) {
            }
            i3 |= i922;
            if ((i2 & 128) != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            int i10222 = i3;
            if ((i3 & 38347923) == 38347922) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            wls wlsVar4222 = wlsVar2;
            e(crmVar, null, null, brmVar2.a(), wlsVar4222, rqmVar2, null, f530Var4, z4, true, null, dsListItem$Divider3, slsVar4, btsVar, (i10222 & 14) | 806879664 | ((i10222 >> 3) & HProv.ALG_CLASS_ALL) | (458752 & (i10222 << 6)) | ((i10222 << 15) & 29360128) | ((i10222 << 12) & 234881024), ((i10222 >> 21) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i10222 >> 15) & 112) | ((i10222 >> 18) & 896));
            wlsVar3 = wlsVar4222;
            f530Var3 = f530Var4;
            z3 = z4;
            dsListItem$Divider2 = dsListItem$Divider3;
            slsVar3 = slsVar4;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        wlsVar2 = wlsVar;
        i6 = i2 & 64;
        int i9222 = 1572864;
        if (i6 == 0) {
        }
        i3 |= i9222;
        if ((i2 & 128) != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        int i102222 = i3;
        if ((i3 & 38347923) == 38347922) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        wls wlsVar42222 = wlsVar2;
        e(crmVar, null, null, brmVar2.a(), wlsVar42222, rqmVar2, null, f530Var4, z4, true, null, dsListItem$Divider3, slsVar4, btsVar, (i102222 & 14) | 806879664 | ((i102222 >> 3) & HProv.ALG_CLASS_ALL) | (458752 & (i102222 << 6)) | ((i102222 << 15) & 29360128) | ((i102222 << 12) & 234881024), ((i102222 >> 21) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i102222 >> 15) & 112) | ((i102222 >> 18) & 896));
        wlsVar3 = wlsVar42222;
        f530Var3 = f530Var4;
        z3 = z4;
        dsListItem$Divider2 = dsListItem$Divider3;
        slsVar3 = slsVar4;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(rqm rqmVar, String str, fid fidVar, int i) {
        String str2;
        String str3;
        aii0 v;
        to5 to5Var = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-311220906);
        int i2 = (btsVar.k(rqmVar) ? 32 : 16) | i | (btsVar.k(str) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            boolean z = rqmVar instanceof nqm;
            a7u0 a7u0Var = a;
            if (z) {
                btsVar.e0(1252569187);
                pa31 pa31Var = new pa31(to5Var);
                qnm qnmVar = qnm.a;
                qnm.c.getClass();
                f530 d = u3a1.d(tra1.b(ljs0.m(pa31Var, 16.0f), ((Boolean) btsVar.m(a7u0Var)).booleanValue() ? 1.0f : 0.48f), "END_SLOT_CHEVRON");
                androidx.compose.ui.graphics.vector.b c = ba91.c(null, btsVar);
                btsVar.e0(1564439323);
                long k0 = qnm.c(btsVar).k0();
                btsVar.t(false);
                p4v.b(c, null, d, k0, btsVar, 56, 0);
                btsVar.t(false);
            } else {
                if (rqmVar instanceof mqm) {
                    btsVar.e0(1253096125);
                    mqm mqmVar = (mqm) rqmVar;
                    c.a(mqmVar.a, ((Boolean) btsVar.m(a7u0Var)).booleanValue(), mqmVar.b, u3a1.d(new pa31(to5Var), "END_SLOT_CHECKBOX"), null, str, btsVar, (i2 << 9) & ImageMetadata.JPEG_GPS_COORDINATES, 16);
                    str2 = str;
                    btsVar = btsVar;
                    btsVar.t(false);
                } else {
                    str2 = str;
                    if (!(rqmVar instanceof pqm)) {
                        if (rqmVar instanceof qqm) {
                            btsVar.e0(1254019863);
                            qqm qqmVar = (qqm) rqmVar;
                            fx91.a(qqmVar.a, qqmVar.c, u3a1.d(new pa31(to5Var), "END_SLOT_TOGGLE"), ((Boolean) btsVar.m(a7u0Var)).booleanValue() && qqmVar.b, str2, btsVar, (i2 << 6) & HProv.ALG_CLASS_ALL);
                            str3 = str2;
                            btsVar.t(false);
                        } else {
                            str3 = str2;
                            if (rqmVar instanceof lqm) {
                                btsVar.e0(1254510314);
                                btsVar.e0(1254978972);
                                mo91.g(null, null, null, null, null, false, false, btsVar, 0, 40);
                                btsVar = btsVar;
                                btsVar.t(false);
                                btsVar.t(false);
                            } else {
                                if (!jl40.l(rqmVar, oqm.a)) {
                                    throw unr0.y(1564427878, btsVar, false);
                                }
                                btsVar.e0(1256550424);
                                btsVar.t(false);
                            }
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new mjf(rqmVar, str3, i, 24);
                            return;
                        }
                        return;
                    }
                    btsVar.e0(1253563915);
                    ((Boolean) btsVar.m(a7u0Var)).booleanValue();
                    psm.a(false, null, u3a1.d(new pa31(to5Var), "END_SLOT_RADIO"), false, str2, btsVar, (i2 << 6) & HProv.ALG_CLASS_ALL);
                    btsVar.t(false);
                }
                str3 = str2;
                v = btsVar.v();
                if (v != null) {
                }
            }
        }
        str3 = str;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void h(kk2 kk2Var, long j, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1479469154);
        int i3 = i2 | (btsVar.k(kk2Var) ? 4 : 2) | (btsVar.d(j) ? 32 : 16) | (btsVar.c(i) ? 256 : 128) | (btsVar.k(null) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 c = ljs0.c(c530.a, 1.0f);
            qnm qnmVar = qnm.a;
            ety0 e = ltm.b(btsVar).e(btsVar);
            int i4 = (i3 & 14) | ImageMetadata.EDGE_MODE;
            int i5 = i3 << 3;
            i(kk2Var, e, j, i, c, null, btsVar, i4 | (i5 & 896) | (i5 & 7168) | (i5 & HProv.ALG_CLASS_ALL), 64);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new frm(kk2Var, j, i, i2, 1);
        }
    }

    public static final void i(final kk2 kk2Var, final ety0 ety0Var, final long j, final int i, final f530 f530Var, y7m y7mVar, fid fidVar, final int i2, final int i3) {
        long j2;
        f530 f530Var2;
        y7m y7mVar2;
        int i4;
        final y7m y7mVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1924958183);
        int i5 = (btsVar.k(kk2Var) ? 4 : 2) | i2 | (btsVar.k(ety0Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            j2 = j;
            i5 |= btsVar.d(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar.c(i) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar.k(null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            f530Var2 = f530Var;
            i5 |= btsVar.k(f530Var2) ? 131072 : 65536;
        } else {
            f530Var2 = f530Var;
        }
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 = i5 | 1572864;
            y7mVar2 = y7mVar;
        } else {
            y7mVar2 = y7mVar;
            i4 = i5 | (btsVar.k(y7mVar2) ? 1048576 : 524288);
        }
        if ((i4 & 599187) == 599186 && btsVar.E()) {
            btsVar.Y();
            y7mVar3 = y7mVar2;
        } else {
            y7m y7mVar4 = i6 == 0 ? y7mVar2 : null;
            lry0 b2 = pnb1.b(btsVar);
            y7m y7mVar5 = y7mVar4;
            xab1.a(null, null, wwg.S(-1780226223, true, new jrm(lry0.b(b2, kk2Var, ety0Var, 0, 0L, null, null, null, 2044), y7mVar5, f530Var2, kk2Var, j2, i, ety0Var, b2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
            y7mVar3 = y7mVar5;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: grm
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mrm.i(kk2.this, ety0Var, j, i, f530Var, y7mVar3, (fid) obj, vng.O(i2 | 1), i3);
                    return zy11.a;
                }
            };
        }
    }

    public static final void j(xqm xqmVar, boolean z, fid fidVar, int i) {
        float f;
        boolean z2;
        long j;
        to5 to5Var = x4c.D;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1510668063);
        dmw0 dmw0Var = btsVar.a;
        if ((((btsVar.k(xqmVar) ? 32 : 16) | i | (btsVar.a(z) ? 256 : 128)) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (!((Boolean) btsVar.m(b)).booleanValue() && z) {
                to5Var = x4c.E;
            }
            pa31 pa31Var = new pa31(to5Var);
            if (z) {
                qnm.d.getClass();
                f = 4.0f;
            } else {
                qnm.d.getClass();
                f = 8.0f;
            }
            f530 b2 = tra1.b(an91.m(pa31Var, 0.0f, f, 1), ((Boolean) btsVar.m(a)).booleanValue() ? 1.0f : 0.48f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            boolean z3 = xqmVar instanceof sqm;
            c530 c530Var = c530.a;
            if (z3) {
                btsVar.e0(-1426265764);
                sqm sqmVar = (sqm) xqmVar;
                iom.b(u3a1.d(c530Var, "START_SLOT_AVATAR"), sqmVar.a, sqmVar.b, sqmVar.c, null, null, null, null, null, btsVar, 6, 464);
                btsVar.t(false);
            } else if (xqmVar instanceof tqm) {
                btsVar.e0(-1425867135);
                f530 d3 = u3a1.d(c530Var, "START_SLOT_ICON");
                if (!z) {
                    qnm.d.getClass();
                    d3 = an91.o(d3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                }
                f530 f530Var = d3;
                tqm tqmVar = (tqm) xqmVar;
                pa90 pa90Var = tqmVar.a;
                ldc ldcVar = tqmVar.b;
                btsVar.e0(-1015814899);
                if (ldcVar == null) {
                    qnm qnmVar = qnm.a;
                    j = qnm.c(btsVar).g0();
                } else {
                    j = ldcVar.a;
                }
                btsVar.t(false);
                p4v.b(pa90Var, null, f530Var, j, btsVar, 0, 0);
                btsVar.t(false);
            } else {
                if (xqmVar instanceof uqm) {
                    btsVar.e0(-1425317939);
                    btsVar.e0(-1015806287);
                    throw null;
                }
                if (xqmVar instanceof vqm) {
                    btsVar.e0(-1424845282);
                    vqm vqmVar = (vqm) xqmVar;
                    f530 d4 = u3a1.d(m4m0.b(ymb1.l(c530Var, cyk0.c(vqmVar.a)), ldc.m, qke.q), "START_SLOT_IMAGE");
                    z910 d5 = pi6.d(x4c.y, false);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d6 = b.d(btsVar, d4);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, d5);
                    qje.W(btsVar, wlsVar2, o2);
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                    }
                    qje.W(btsVar, wlsVar4, d6);
                    vqmVar.b.invoke(btsVar, 0);
                    z2 = true;
                    btsVar.t(true);
                    btsVar.t(false);
                } else {
                    z2 = true;
                    if (!jl40.l(xqmVar, wqm.a)) {
                        throw unr0.y(-1015839592, btsVar, false);
                    }
                    btsVar.e0(-1423655161);
                    btsVar.t(false);
                }
                btsVar.t(z2);
            }
            z2 = true;
            btsVar.t(z2);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uge(i, 3, xqmVar, z);
        }
    }

    public static final void k(kk2 kk2Var, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(558021914);
        int i3 = 16;
        if ((((btsVar.k(kk2Var) ? 4 : 2) | i2 | (btsVar.k(null) ? 32 : 16) | (btsVar.c(i) ? 256 : 128) | (btsVar.k(null) ? 2048 : 1024)) & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            xab1.a(null, null, wwg.S(1020344964, true, new krm(kk2Var, i), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(kk2Var, i, i2, i3);
        }
    }

    public static final void l(drm drmVar, crm crmVar, crm crmVar2, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-811250400);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(drmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(crmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(crmVar2) ? 256 : 128;
        }
        if (((i2 | HProv.ALG_TYPE_SECURECHANNEL) & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            qnm qnmVar = qnm.a;
            qnm.d.getClass();
            sic a2 = qic.a(new i43(2.0f, true, new quz(11)), x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            crm crmVar3 = null;
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1853321461);
            btsVar.t(false);
            crm crmVar4 = (crmVar == null || ((kk2) crmVar.b).b.length() <= 0) ? null : crmVar;
            btsVar.e0(-1853313025);
            if (crmVar4 != null) {
                kk2 kk2Var = (kk2) crmVar4.b;
                ldc ldcVar = crmVar4.c;
                btsVar.e0(-1853310602);
                long g0 = ldcVar == null ? qnm.c(btsVar).g0() : ldcVar.a;
                btsVar.t(false);
                h(kk2Var, g0, crmVar4.a, btsVar, 0);
            }
            btsVar.t(false);
            if (crmVar2 != null && ((kk2) crmVar2.b).b.length() > 0) {
                crmVar3 = crmVar2;
            }
            btsVar.e0(-1853303769);
            if (crmVar3 != null) {
                kk2 kk2Var2 = (kk2) crmVar3.b;
                ldc ldcVar2 = crmVar3.c;
                btsVar.e0(-1853301160);
                long h0 = ldcVar2 == null ? qnm.c(btsVar).h0() : ldcVar2.a;
                btsVar.t(false);
                b(kk2Var2, h0, crmVar3.a, btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(drmVar, crmVar, crmVar2, f530Var2, i);
        }
    }
}
