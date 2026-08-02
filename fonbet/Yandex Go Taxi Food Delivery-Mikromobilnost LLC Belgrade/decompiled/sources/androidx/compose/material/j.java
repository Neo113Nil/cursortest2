package androidx.compose.material;

import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.ck11;
import defpackage.did;
import defpackage.fid;
import defpackage.gl11;
import defpackage.gtq0;
import defpackage.ldc;
import defpackage.o430;
import defpackage.oz40;
import defpackage.qar;
import defpackage.sb2;
import defpackage.tx01;
import defpackage.ugc;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.zx01;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class j {
    public static final j a = new j();

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0151, code lost:
    
        if (r29 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0127, code lost:
    
        if (r29 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final InputPhase inputPhase, final long j, final long j2, final f fVar, final boolean z, final androidx.compose.runtime.internal.a aVar, fid fidVar, final int i) {
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        boolean k;
        Object Q;
        InputPhase inputPhase2;
        oz40 oz40Var;
        long j3;
        boolean k2;
        Object Q2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(509439888);
        int i5 = i | (btsVar.c(inputPhase.ordinal()) ? 4 : 2) | (btsVar.d(j) ? 32 : 16) | (btsVar.d(j2) ? 256 : 128) | (btsVar.e(fVar) ? 2048 : 1024) | (btsVar.a(z) ? 16384 : 8192);
        if (btsVar.V(i5 & 1, (74899 & i5) != 74898)) {
            zx01 a0 = bvf0.a0(inputPhase, "TextFieldInputState", btsVar, (i5 & 14) | 48);
            oz40 oz40Var2 = a0.d;
            gl11 gl11Var = gtq0.f;
            InputPhase inputPhase3 = (InputPhase) a0.c();
            btsVar.e0(389927550);
            int[] iArr = i.a;
            int i6 = iArr[inputPhase3.ordinal()];
            float f4 = 0.0f;
            if (i6 != 1) {
                if (i6 == 2) {
                    f = 0.0f;
                    btsVar.t(false);
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase4 = (InputPhase) oz40Var2.getValue();
                    btsVar.e0(389927550);
                    i2 = iArr[inputPhase4.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            f2 = 0.0f;
                            btsVar.t(false);
                            Float valueOf2 = Float.valueOf(f2);
                            a0.f();
                            btsVar.e0(-883519390);
                            ck11 K = sb2.K(150, 0, null, 6);
                            btsVar.t(false);
                            tx01 s = bvf0.s(a0, valueOf, valueOf2, K, gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                            g gVar = new g();
                            InputPhase inputPhase5 = (InputPhase) a0.c();
                            btsVar.e0(1246942589);
                            i3 = iArr[inputPhase5.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 != 3) {
                                        w511.b();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                btsVar.t(false);
                                Float valueOf3 = Float.valueOf(f3);
                                InputPhase inputPhase6 = (InputPhase) oz40Var2.getValue();
                                btsVar.e0(1246942589);
                                i4 = iArr[inputPhase6.ordinal()];
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        if (i4 != 3) {
                                            w511.b();
                                            return;
                                        }
                                    }
                                    btsVar.t(false);
                                    tx01 s2 = bvf0.s(a0, valueOf3, Float.valueOf(f4), (qar) gVar.invoke(a0.f(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                                    InputPhase inputPhase7 = (InputPhase) oz40Var2.getValue();
                                    btsVar.e0(-2001931362);
                                    long j4 = iArr[inputPhase7.ordinal()] == 1 ? j : j2;
                                    btsVar.t(false);
                                    ugc f5 = ldc.f(j4);
                                    k = btsVar.k(f5);
                                    Q = btsVar.Q();
                                    o430 o430Var = did.a;
                                    if (!k || Q == o430Var) {
                                        int i7 = ldc.n;
                                        Q = (gl11) androidx.compose.animation.h.a().invoke(f5);
                                        btsVar.o0(Q);
                                    }
                                    gl11 gl11Var2 = (gl11) Q;
                                    inputPhase2 = (InputPhase) a0.c();
                                    btsVar.e0(-2001931362);
                                    if (iArr[inputPhase2.ordinal()] == 1) {
                                        oz40Var = oz40Var2;
                                        j3 = j;
                                    } else {
                                        oz40Var = oz40Var2;
                                        j3 = j2;
                                    }
                                    btsVar.t(false);
                                    ldc ldcVar = new ldc(j3);
                                    InputPhase inputPhase8 = (InputPhase) oz40Var.getValue();
                                    btsVar.e0(-2001931362);
                                    long j5 = iArr[inputPhase8.ordinal()] == 1 ? j : j2;
                                    btsVar.t(false);
                                    ldc ldcVar2 = new ldc(j5);
                                    a0.f();
                                    btsVar.e0(-2017811095);
                                    ck11 K2 = sb2.K(150, 0, null, 6);
                                    btsVar.t(false);
                                    tx01 s3 = bvf0.s(a0, ldcVar, ldcVar2, K2, gl11Var2, btsVar, ImageMetadata.EDGE_MODE);
                                    int i8 = (i5 & 7168) | 384;
                                    ugc f6 = ldc.f(((ldc) fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf((i8 >> 6) & 112))).a);
                                    k2 = btsVar.k(f6);
                                    Q2 = btsVar.Q();
                                    if (!k2 || Q2 == o430Var) {
                                        int i9 = ldc.n;
                                        Q2 = (gl11) androidx.compose.animation.h.a().invoke(f6);
                                        btsVar.o0(Q2);
                                    }
                                    gl11 gl11Var3 = (gl11) Q2;
                                    int i10 = ((((i8 << 3) & HProv.ALG_CLASS_ALL) | HProv.ALG_TYPE_SECURECHANNEL) >> 9) & 112;
                                    Object invoke = fVar.invoke(a0.c(), btsVar, Integer.valueOf(i10));
                                    Object invoke2 = fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf(i10));
                                    a0.f();
                                    btsVar.e0(-1176639650);
                                    ck11 K3 = sb2.K(150, 0, null, 6);
                                    btsVar.t(false);
                                    aVar.invoke(Float.valueOf(((Number) s.A.getValue()).floatValue()), new ldc(((ldc) s3.A.getValue()).a), new ldc(((ldc) bvf0.s(a0, invoke, invoke2, K3, gl11Var3, btsVar, ImageMetadata.EDGE_MODE).A.getValue()).a), Float.valueOf(((Number) s2.A.getValue()).floatValue()), btsVar, Integer.valueOf(HProv.ALG_CLASS_DATA_ENCRYPT));
                                }
                                f4 = 1.0f;
                                btsVar.t(false);
                                tx01 s22 = bvf0.s(a0, valueOf3, Float.valueOf(f4), (qar) gVar.invoke(a0.f(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                                InputPhase inputPhase72 = (InputPhase) oz40Var2.getValue();
                                btsVar.e0(-2001931362);
                                if (iArr[inputPhase72.ordinal()] == 1) {
                                }
                                btsVar.t(false);
                                ugc f52 = ldc.f(j4);
                                k = btsVar.k(f52);
                                Q = btsVar.Q();
                                o430 o430Var2 = did.a;
                                if (!k) {
                                }
                                int i72 = ldc.n;
                                Q = (gl11) androidx.compose.animation.h.a().invoke(f52);
                                btsVar.o0(Q);
                                gl11 gl11Var22 = (gl11) Q;
                                inputPhase2 = (InputPhase) a0.c();
                                btsVar.e0(-2001931362);
                                if (iArr[inputPhase2.ordinal()] == 1) {
                                }
                                btsVar.t(false);
                                ldc ldcVar3 = new ldc(j3);
                                InputPhase inputPhase82 = (InputPhase) oz40Var.getValue();
                                btsVar.e0(-2001931362);
                                if (iArr[inputPhase82.ordinal()] == 1) {
                                }
                                btsVar.t(false);
                                ldc ldcVar22 = new ldc(j5);
                                a0.f();
                                btsVar.e0(-2017811095);
                                ck11 K22 = sb2.K(150, 0, null, 6);
                                btsVar.t(false);
                                tx01 s32 = bvf0.s(a0, ldcVar3, ldcVar22, K22, gl11Var22, btsVar, ImageMetadata.EDGE_MODE);
                                int i82 = (i5 & 7168) | 384;
                                ugc f62 = ldc.f(((ldc) fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf((i82 >> 6) & 112))).a);
                                k2 = btsVar.k(f62);
                                Q2 = btsVar.Q();
                                if (!k2) {
                                }
                                int i92 = ldc.n;
                                Q2 = (gl11) androidx.compose.animation.h.a().invoke(f62);
                                btsVar.o0(Q2);
                                gl11 gl11Var32 = (gl11) Q2;
                                int i102 = ((((i82 << 3) & HProv.ALG_CLASS_ALL) | HProv.ALG_TYPE_SECURECHANNEL) >> 9) & 112;
                                Object invoke3 = fVar.invoke(a0.c(), btsVar, Integer.valueOf(i102));
                                Object invoke22 = fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf(i102));
                                a0.f();
                                btsVar.e0(-1176639650);
                                ck11 K32 = sb2.K(150, 0, null, 6);
                                btsVar.t(false);
                                aVar.invoke(Float.valueOf(((Number) s.A.getValue()).floatValue()), new ldc(((ldc) s32.A.getValue()).a), new ldc(((ldc) bvf0.s(a0, invoke3, invoke22, K32, gl11Var32, btsVar, ImageMetadata.EDGE_MODE).A.getValue()).a), Float.valueOf(((Number) s22.A.getValue()).floatValue()), btsVar, Integer.valueOf(HProv.ALG_CLASS_DATA_ENCRYPT));
                            }
                            f3 = 1.0f;
                            btsVar.t(false);
                            Float valueOf32 = Float.valueOf(f3);
                            InputPhase inputPhase62 = (InputPhase) oz40Var2.getValue();
                            btsVar.e0(1246942589);
                            i4 = iArr[inputPhase62.ordinal()];
                            if (i4 != 1) {
                            }
                            f4 = 1.0f;
                            btsVar.t(false);
                            tx01 s222 = bvf0.s(a0, valueOf32, Float.valueOf(f4), (qar) gVar.invoke(a0.f(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                            InputPhase inputPhase722 = (InputPhase) oz40Var2.getValue();
                            btsVar.e0(-2001931362);
                            if (iArr[inputPhase722.ordinal()] == 1) {
                            }
                            btsVar.t(false);
                            ugc f522 = ldc.f(j4);
                            k = btsVar.k(f522);
                            Q = btsVar.Q();
                            o430 o430Var22 = did.a;
                            if (!k) {
                            }
                            int i722 = ldc.n;
                            Q = (gl11) androidx.compose.animation.h.a().invoke(f522);
                            btsVar.o0(Q);
                            gl11 gl11Var222 = (gl11) Q;
                            inputPhase2 = (InputPhase) a0.c();
                            btsVar.e0(-2001931362);
                            if (iArr[inputPhase2.ordinal()] == 1) {
                            }
                            btsVar.t(false);
                            ldc ldcVar32 = new ldc(j3);
                            InputPhase inputPhase822 = (InputPhase) oz40Var.getValue();
                            btsVar.e0(-2001931362);
                            if (iArr[inputPhase822.ordinal()] == 1) {
                            }
                            btsVar.t(false);
                            ldc ldcVar222 = new ldc(j5);
                            a0.f();
                            btsVar.e0(-2017811095);
                            ck11 K222 = sb2.K(150, 0, null, 6);
                            btsVar.t(false);
                            tx01 s322 = bvf0.s(a0, ldcVar32, ldcVar222, K222, gl11Var222, btsVar, ImageMetadata.EDGE_MODE);
                            int i822 = (i5 & 7168) | 384;
                            ugc f622 = ldc.f(((ldc) fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf((i822 >> 6) & 112))).a);
                            k2 = btsVar.k(f622);
                            Q2 = btsVar.Q();
                            if (!k2) {
                            }
                            int i922 = ldc.n;
                            Q2 = (gl11) androidx.compose.animation.h.a().invoke(f622);
                            btsVar.o0(Q2);
                            gl11 gl11Var322 = (gl11) Q2;
                            int i1022 = ((((i822 << 3) & HProv.ALG_CLASS_ALL) | HProv.ALG_TYPE_SECURECHANNEL) >> 9) & 112;
                            Object invoke32 = fVar.invoke(a0.c(), btsVar, Integer.valueOf(i1022));
                            Object invoke222 = fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf(i1022));
                            a0.f();
                            btsVar.e0(-1176639650);
                            ck11 K322 = sb2.K(150, 0, null, 6);
                            btsVar.t(false);
                            aVar.invoke(Float.valueOf(((Number) s.A.getValue()).floatValue()), new ldc(((ldc) s322.A.getValue()).a), new ldc(((ldc) bvf0.s(a0, invoke32, invoke222, K322, gl11Var322, btsVar, ImageMetadata.EDGE_MODE).A.getValue()).a), Float.valueOf(((Number) s222.A.getValue()).floatValue()), btsVar, Integer.valueOf(HProv.ALG_CLASS_DATA_ENCRYPT));
                        } else if (i2 != 3) {
                            w511.b();
                            return;
                        }
                    }
                    f2 = 1.0f;
                    btsVar.t(false);
                    Float valueOf22 = Float.valueOf(f2);
                    a0.f();
                    btsVar.e0(-883519390);
                    ck11 K4 = sb2.K(150, 0, null, 6);
                    btsVar.t(false);
                    tx01 s4 = bvf0.s(a0, valueOf, valueOf22, K4, gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                    g gVar2 = new g();
                    InputPhase inputPhase52 = (InputPhase) a0.c();
                    btsVar.e0(1246942589);
                    i3 = iArr[inputPhase52.ordinal()];
                    if (i3 != 1) {
                    }
                    f3 = 1.0f;
                    btsVar.t(false);
                    Float valueOf322 = Float.valueOf(f3);
                    InputPhase inputPhase622 = (InputPhase) oz40Var2.getValue();
                    btsVar.e0(1246942589);
                    i4 = iArr[inputPhase622.ordinal()];
                    if (i4 != 1) {
                    }
                    f4 = 1.0f;
                    btsVar.t(false);
                    tx01 s2222 = bvf0.s(a0, valueOf322, Float.valueOf(f4), (qar) gVar2.invoke(a0.f(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                    InputPhase inputPhase7222 = (InputPhase) oz40Var2.getValue();
                    btsVar.e0(-2001931362);
                    if (iArr[inputPhase7222.ordinal()] == 1) {
                    }
                    btsVar.t(false);
                    ugc f5222 = ldc.f(j4);
                    k = btsVar.k(f5222);
                    Q = btsVar.Q();
                    o430 o430Var222 = did.a;
                    if (!k) {
                    }
                    int i7222 = ldc.n;
                    Q = (gl11) androidx.compose.animation.h.a().invoke(f5222);
                    btsVar.o0(Q);
                    gl11 gl11Var2222 = (gl11) Q;
                    inputPhase2 = (InputPhase) a0.c();
                    btsVar.e0(-2001931362);
                    if (iArr[inputPhase2.ordinal()] == 1) {
                    }
                    btsVar.t(false);
                    ldc ldcVar322 = new ldc(j3);
                    InputPhase inputPhase8222 = (InputPhase) oz40Var.getValue();
                    btsVar.e0(-2001931362);
                    if (iArr[inputPhase8222.ordinal()] == 1) {
                    }
                    btsVar.t(false);
                    ldc ldcVar2222 = new ldc(j5);
                    a0.f();
                    btsVar.e0(-2017811095);
                    ck11 K2222 = sb2.K(150, 0, null, 6);
                    btsVar.t(false);
                    tx01 s3222 = bvf0.s(a0, ldcVar322, ldcVar2222, K2222, gl11Var2222, btsVar, ImageMetadata.EDGE_MODE);
                    int i8222 = (i5 & 7168) | 384;
                    ugc f6222 = ldc.f(((ldc) fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf((i8222 >> 6) & 112))).a);
                    k2 = btsVar.k(f6222);
                    Q2 = btsVar.Q();
                    if (!k2) {
                    }
                    int i9222 = ldc.n;
                    Q2 = (gl11) androidx.compose.animation.h.a().invoke(f6222);
                    btsVar.o0(Q2);
                    gl11 gl11Var3222 = (gl11) Q2;
                    int i10222 = ((((i8222 << 3) & HProv.ALG_CLASS_ALL) | HProv.ALG_TYPE_SECURECHANNEL) >> 9) & 112;
                    Object invoke322 = fVar.invoke(a0.c(), btsVar, Integer.valueOf(i10222));
                    Object invoke2222 = fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf(i10222));
                    a0.f();
                    btsVar.e0(-1176639650);
                    ck11 K3222 = sb2.K(150, 0, null, 6);
                    btsVar.t(false);
                    aVar.invoke(Float.valueOf(((Number) s4.A.getValue()).floatValue()), new ldc(((ldc) s3222.A.getValue()).a), new ldc(((ldc) bvf0.s(a0, invoke322, invoke2222, K3222, gl11Var3222, btsVar, ImageMetadata.EDGE_MODE).A.getValue()).a), Float.valueOf(((Number) s2222.A.getValue()).floatValue()), btsVar, Integer.valueOf(HProv.ALG_CLASS_DATA_ENCRYPT));
                } else if (i6 != 3) {
                    w511.b();
                    return;
                }
            }
            f = 1.0f;
            btsVar.t(false);
            Float valueOf4 = Float.valueOf(f);
            InputPhase inputPhase42 = (InputPhase) oz40Var2.getValue();
            btsVar.e0(389927550);
            i2 = iArr[inputPhase42.ordinal()];
            if (i2 != 1) {
            }
            f2 = 1.0f;
            btsVar.t(false);
            Float valueOf222 = Float.valueOf(f2);
            a0.f();
            btsVar.e0(-883519390);
            ck11 K42 = sb2.K(150, 0, null, 6);
            btsVar.t(false);
            tx01 s42 = bvf0.s(a0, valueOf4, valueOf222, K42, gl11Var, btsVar, ImageMetadata.EDGE_MODE);
            g gVar22 = new g();
            InputPhase inputPhase522 = (InputPhase) a0.c();
            btsVar.e0(1246942589);
            i3 = iArr[inputPhase522.ordinal()];
            if (i3 != 1) {
            }
            f3 = 1.0f;
            btsVar.t(false);
            Float valueOf3222 = Float.valueOf(f3);
            InputPhase inputPhase6222 = (InputPhase) oz40Var2.getValue();
            btsVar.e0(1246942589);
            i4 = iArr[inputPhase6222.ordinal()];
            if (i4 != 1) {
            }
            f4 = 1.0f;
            btsVar.t(false);
            tx01 s22222 = bvf0.s(a0, valueOf3222, Float.valueOf(f4), (qar) gVar22.invoke(a0.f(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
            InputPhase inputPhase72222 = (InputPhase) oz40Var2.getValue();
            btsVar.e0(-2001931362);
            if (iArr[inputPhase72222.ordinal()] == 1) {
            }
            btsVar.t(false);
            ugc f52222 = ldc.f(j4);
            k = btsVar.k(f52222);
            Q = btsVar.Q();
            o430 o430Var2222 = did.a;
            if (!k) {
            }
            int i72222 = ldc.n;
            Q = (gl11) androidx.compose.animation.h.a().invoke(f52222);
            btsVar.o0(Q);
            gl11 gl11Var22222 = (gl11) Q;
            inputPhase2 = (InputPhase) a0.c();
            btsVar.e0(-2001931362);
            if (iArr[inputPhase2.ordinal()] == 1) {
            }
            btsVar.t(false);
            ldc ldcVar3222 = new ldc(j3);
            InputPhase inputPhase82222 = (InputPhase) oz40Var.getValue();
            btsVar.e0(-2001931362);
            if (iArr[inputPhase82222.ordinal()] == 1) {
            }
            btsVar.t(false);
            ldc ldcVar22222 = new ldc(j5);
            a0.f();
            btsVar.e0(-2017811095);
            ck11 K22222 = sb2.K(150, 0, null, 6);
            btsVar.t(false);
            tx01 s32222 = bvf0.s(a0, ldcVar3222, ldcVar22222, K22222, gl11Var22222, btsVar, ImageMetadata.EDGE_MODE);
            int i82222 = (i5 & 7168) | 384;
            ugc f62222 = ldc.f(((ldc) fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf((i82222 >> 6) & 112))).a);
            k2 = btsVar.k(f62222);
            Q2 = btsVar.Q();
            if (!k2) {
            }
            int i92222 = ldc.n;
            Q2 = (gl11) androidx.compose.animation.h.a().invoke(f62222);
            btsVar.o0(Q2);
            gl11 gl11Var32222 = (gl11) Q2;
            int i102222 = ((((i82222 << 3) & HProv.ALG_CLASS_ALL) | HProv.ALG_TYPE_SECURECHANNEL) >> 9) & 112;
            Object invoke3222 = fVar.invoke(a0.c(), btsVar, Integer.valueOf(i102222));
            Object invoke22222 = fVar.invoke(oz40Var.getValue(), btsVar, Integer.valueOf(i102222));
            a0.f();
            btsVar.e0(-1176639650);
            ck11 K32222 = sb2.K(150, 0, null, 6);
            btsVar.t(false);
            aVar.invoke(Float.valueOf(((Number) s42.A.getValue()).floatValue()), new ldc(((ldc) s32222.A.getValue()).a), new ldc(((ldc) bvf0.s(a0, invoke3222, invoke22222, K32222, gl11Var32222, btsVar, ImageMetadata.EDGE_MODE).A.getValue()).a), Float.valueOf(((Number) s22222.A.getValue()).floatValue()), btsVar, Integer.valueOf(HProv.ALG_CLASS_DATA_ENCRYPT));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(inputPhase, j, j2, fVar, z, aVar, i) { // from class: androidx.compose.material.h
                public final /* synthetic */ InputPhase b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long w;
                public final /* synthetic */ f x;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ androidx.compose.runtime.internal.a z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1769473);
                    j.this.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }
}
