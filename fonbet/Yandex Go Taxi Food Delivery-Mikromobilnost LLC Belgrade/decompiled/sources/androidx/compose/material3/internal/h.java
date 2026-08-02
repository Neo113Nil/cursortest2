package androidx.compose.material3.internal;

import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.internal.h;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import com.google.ar.core.ImageMetadata;
import defpackage.a92;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bfe;
import defpackage.bny0;
import defpackage.bq11;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.c530;
import defpackage.cjs0;
import defpackage.cma1;
import defpackage.cp1;
import defpackage.did;
import defpackage.eq11;
import defpackage.ety0;
import defpackage.exm;
import defpackage.f530;
import defpackage.fc0;
import defpackage.fid;
import defpackage.gl11;
import defpackage.gr5;
import defpackage.gtq0;
import defpackage.h8w;
import defpackage.hob1;
import defpackage.imy0;
import defpackage.it1;
import defpackage.j690;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.ldc;
import defpackage.m3u0;
import defpackage.mny0;
import defpackage.ngd0;
import defpackage.nny0;
import defpackage.oaa1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.pj91;
import defpackage.qje;
import defpackage.qvf0;
import defpackage.r1b0;
import defpackage.rh10;
import defpackage.rlb1;
import defpackage.rx01;
import defpackage.sb2;
import defpackage.sls;
import defpackage.smy0;
import defpackage.th40;
import defpackage.tls;
import defpackage.twt0;
import defpackage.tx01;
import defpackage.ulb1;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xvz;
import defpackage.y7m;
import defpackage.yws0;
import defpackage.z910;
import defpackage.zjy0;
import defpackage.zls;
import defpackage.zmy0;
import defpackage.zx01;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class h {
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03db, code lost:
    
        if (r4 != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0341, code lost:
    
        if (r4 != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0311, code lost:
    
        if (r4 != false) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0436 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final TextFieldType textFieldType, final CharSequence charSequence, final wls wlsVar, final nny0 nny0Var, final zls zlsVar, final wls wlsVar2, final wls wlsVar3, final wls wlsVar4, final wls wlsVar5, final boolean z, final boolean z2, final boolean z3, final h8w h8wVar, final j690 j690Var, final imy0 imy0Var, final wls wlsVar6, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        bts btsVar;
        int i6;
        boolean z4;
        float f;
        int i7;
        float f2;
        twt0 e;
        twt0 e2;
        int i8;
        long j;
        float f3;
        int i9;
        float f4;
        int i10;
        float f5;
        int i11;
        tx01 s;
        boolean k;
        Object Q;
        Object obj;
        boolean k2;
        Object Q2;
        Object Q3;
        ngd0 ngd0Var;
        ety0 ety0Var;
        int i12;
        imy0 imy0Var2;
        androidx.compose.runtime.internal.a aVar;
        Object Q4;
        final j690 j690Var2;
        final wls wlsVar7;
        imy0 imy0Var3;
        ngd0 ngd0Var2;
        androidx.compose.runtime.internal.a aVar2;
        tx01 tx01Var;
        int i13;
        androidx.compose.runtime.internal.a aVar3;
        int i14;
        androidx.compose.runtime.internal.a aVar4;
        Object Q5;
        androidx.compose.runtime.internal.a aVar5;
        androidx.compose.runtime.internal.a aVar6;
        boolean z5;
        int i15;
        androidx.compose.runtime.internal.a S;
        int i16;
        int i17;
        int i18;
        ngd0 ngd0Var3 = ngd0.F;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(546805032);
        if ((i & 6) == 0) {
            i3 = (btsVar2.c(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = i3 | (btsVar2.e(charSequence) ? 32 : 16);
        } else {
            i4 = i3;
        }
        if ((i & 384) == 0) {
            i4 |= btsVar2.e(wlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.k(nny0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.e(zlsVar) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i4 |= btsVar2.e(wlsVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= btsVar2.e(wlsVar3) ? 1048576 : 524288;
        }
        int i19 = i & 12582912;
        int i20 = SelfTester_JCP.ENCRYPT_CBC;
        if (i19 == 0) {
            i4 |= btsVar2.e(wlsVar4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= btsVar2.e(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i4 |= btsVar2.e(null) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i21 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (btsVar2.e(wlsVar5) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= btsVar2.a(z2) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar2.a(z3) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar2.k(h8wVar) ? 16384 : 8192;
        }
        if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
            i5 |= btsVar2.k(j690Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= btsVar2.k(imy0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            if (btsVar2.e(wlsVar6)) {
                i20 = 8388608;
            }
            i5 |= i20;
        }
        int i22 = i5;
        if (btsVar2.V(i21 & 1, ((306783379 & i21) == 306783378 && (i22 & 4793491) == 4793490) ? false : true)) {
            boolean booleanValue = ((Boolean) androidx.compose.foundation.interaction.a.b(h8wVar, btsVar2, (i22 >> 12) & 14).getValue()).booleanValue();
            InputPhase inputPhase = booleanValue ? InputPhase.Focused : charSequence.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            long j2 = !z2 ? imy0Var.z : z3 ? imy0Var.A : booleanValue ? imy0Var.x : imy0Var.y;
            bq11 bq11Var = (bq11) btsVar2.m(eq11.a);
            ety0 ety0Var2 = bq11Var.j;
            ety0 ety0Var3 = bq11Var.l;
            long b = ety0Var2.b();
            int i23 = ldc.n;
            long j3 = ldc.m;
            if ((!ldc.c(b, j3) || ldc.c(ety0Var3.b(), j3)) && (ldc.c(ety0Var2.b(), j3) || !ldc.c(ety0Var3.b(), j3))) {
                i6 = i21;
                z4 = false;
            } else {
                i6 = i21;
                z4 = true;
            }
            long b2 = ety0Var3.b();
            if (z4 && b2 == 16) {
                b2 = j2;
            }
            long b3 = ety0Var2.b();
            long j4 = (z4 && b3 == 16) ? j2 : b3;
            boolean z6 = zlsVar != null;
            int i24 = i6;
            zx01 a0 = bvf0.a0(inputPhase, "TextFieldInputState", btsVar2, 48);
            oz40 oz40Var = a0.d;
            twt0 e3 = hob1.e(MotionSchemeKeyTokens.FastSpatial, btsVar2);
            gl11 gl11Var = gtq0.f;
            InputPhase inputPhase2 = (InputPhase) a0.c();
            btsVar2.e0(-1436405362);
            int[] iArr = g.b;
            int i25 = iArr[inputPhase2.ordinal()];
            float f6 = 0.0f;
            if (i25 != 1) {
                if (i25 != 2) {
                    if (i25 != 3) {
                        w511.b();
                        return;
                    }
                } else if (z6) {
                    f = 0.0f;
                    btsVar2.t(false);
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase3 = (InputPhase) oz40Var.getValue();
                    btsVar2.e0(-1436405362);
                    i7 = iArr[inputPhase3.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                w511.b();
                                return;
                            }
                        } else if (z6) {
                            f2 = 0.0f;
                            btsVar2.t(false);
                            Float valueOf2 = Float.valueOf(f2);
                            a0.f();
                            btsVar2.e0(-709912974);
                            btsVar2.t(false);
                            tx01 s2 = bvf0.s(a0, valueOf, valueOf2, e3, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastEffects;
                            e = hob1.e(motionSchemeKeyTokens, btsVar2);
                            e2 = hob1.e(MotionSchemeKeyTokens.SlowEffects, btsVar2);
                            InputPhase inputPhase4 = (InputPhase) a0.c();
                            btsVar2.e0(-1093194547);
                            i8 = iArr[inputPhase4.ordinal()];
                            j = b2;
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    if (i8 != 3) {
                                        w511.b();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                btsVar2.t(false);
                                Float valueOf3 = Float.valueOf(f3);
                                InputPhase inputPhase5 = (InputPhase) oz40Var.getValue();
                                btsVar2.e0(-1093194547);
                                i9 = iArr[inputPhase5.ordinal()];
                                if (i9 != 1) {
                                    if (i9 != 2) {
                                        if (i9 != 3) {
                                            w511.b();
                                            return;
                                        }
                                    }
                                    f4 = 0.0f;
                                    btsVar2.t(false);
                                    Float valueOf4 = Float.valueOf(f4);
                                    rx01 f7 = a0.f();
                                    btsVar2.e0(-984009111);
                                    InputPhase inputPhase6 = InputPhase.Focused;
                                    InputPhase inputPhase7 = InputPhase.UnfocusedEmpty;
                                    twt0 twt0Var = (!f7.a(inputPhase6, inputPhase7) && (f7.a(inputPhase7, inputPhase6) || f7.a(InputPhase.UnfocusedNotEmpty, inputPhase7))) ? e2 : e;
                                    btsVar2.t(false);
                                    tx01 s3 = bvf0.s(a0, valueOf3, valueOf4, twt0Var, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                                    InputPhase inputPhase8 = (InputPhase) a0.c();
                                    btsVar2.e0(-1258455321);
                                    i10 = iArr[inputPhase8.ordinal()];
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 != 3) {
                                                w511.b();
                                                return;
                                            }
                                        } else if (z6) {
                                            f5 = 0.0f;
                                            btsVar2.t(false);
                                            Float valueOf5 = Float.valueOf(f5);
                                            InputPhase inputPhase9 = (InputPhase) oz40Var.getValue();
                                            btsVar2.e0(-1258455321);
                                            i11 = iArr[inputPhase9.ordinal()];
                                            if (i11 != 1) {
                                                if (i11 != 2) {
                                                    if (i11 != 3) {
                                                        w511.b();
                                                        return;
                                                    }
                                                }
                                            }
                                            f6 = 1.0f;
                                            btsVar2.t(false);
                                            Float valueOf6 = Float.valueOf(f6);
                                            a0.f();
                                            btsVar2.e0(2126293195);
                                            btsVar2.t(false);
                                            s = bvf0.s(a0, valueOf5, valueOf6, e, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                                            twt0 e4 = hob1.e(motionSchemeKeyTokens, btsVar2);
                                            InputPhase inputPhase10 = (InputPhase) oz40Var.getValue();
                                            btsVar2.e0(-12973394);
                                            long j5 = iArr[inputPhase10.ordinal()] == 1 ? j : j4;
                                            btsVar2.t(false);
                                            Object f8 = ldc.f(j5);
                                            k = btsVar2.k(f8);
                                            Q = btsVar2.Q();
                                            obj = did.a;
                                            if (!k || Q == obj) {
                                                Q = (gl11) androidx.compose.animation.h.a().invoke(f8);
                                                btsVar2.o0(Q);
                                            }
                                            gl11 gl11Var2 = (gl11) Q;
                                            InputPhase inputPhase11 = (InputPhase) a0.c();
                                            btsVar2.e0(-12973394);
                                            long j6 = iArr[inputPhase11.ordinal()] == 1 ? j : j4;
                                            btsVar2.t(false);
                                            ldc ldcVar = new ldc(j6);
                                            InputPhase inputPhase12 = (InputPhase) oz40Var.getValue();
                                            btsVar2.e0(-12973394);
                                            long j7 = iArr[inputPhase12.ordinal()] == 1 ? j : j4;
                                            btsVar2.t(false);
                                            ldc ldcVar2 = new ldc(j7);
                                            a0.f();
                                            btsVar2.e0(1954111929);
                                            btsVar2.t(false);
                                            tx01 s4 = bvf0.s(a0, ldcVar, ldcVar2, e4, gl11Var2, btsVar2, ImageMetadata.EDGE_MODE);
                                            btsVar2.e0(-464752477);
                                            btsVar2.t(false);
                                            Object f9 = ldc.f(j2);
                                            k2 = btsVar2.k(f9);
                                            Q2 = btsVar2.Q();
                                            if (!k2 || Q2 == obj) {
                                                Q2 = (gl11) androidx.compose.animation.h.a().invoke(f9);
                                                btsVar2.o0(Q2);
                                            }
                                            gl11 gl11Var3 = (gl11) Q2;
                                            btsVar2.e0(-464752477);
                                            btsVar2.t(false);
                                            ldc ldcVar3 = new ldc(j2);
                                            btsVar2.e0(-464752477);
                                            btsVar2.t(false);
                                            ldc ldcVar4 = new ldc(j2);
                                            a0.f();
                                            btsVar2.e0(1190923886);
                                            btsVar2.t(false);
                                            tx01 s5 = bvf0.s(a0, ldcVar3, ldcVar4, e4, gl11Var3, btsVar2, ImageMetadata.EDGE_MODE);
                                            Q3 = btsVar2.Q();
                                            if (Q3 == obj) {
                                                Q3 = new zmy0();
                                                btsVar2.o0(Q3);
                                            }
                                            zmy0 zmy0Var = (zmy0) Q3;
                                            if (zlsVar == null) {
                                                btsVar2.e0(-1891724857);
                                                btsVar2.t(false);
                                                imy0Var2 = imy0Var;
                                                ngd0Var = ngd0Var3;
                                                ety0Var = ety0Var3;
                                                i12 = 2;
                                                aVar = null;
                                            } else {
                                                btsVar2.e0(-1891724856);
                                                ngd0Var = ngd0Var3;
                                                ety0Var = ety0Var3;
                                                i12 = 2;
                                                imy0Var2 = imy0Var;
                                                androidx.compose.runtime.internal.a S2 = wwg.S(-1076580032, true, new fc0(ety0Var2, ety0Var, s2, s5, z4, s4, zlsVar, zmy0Var), btsVar2);
                                                btsVar2.t(false);
                                                aVar = S2;
                                            }
                                            long j8 = !z2 ? imy0Var2.D : z3 ? imy0Var2.E : booleanValue ? imy0Var2.B : imy0Var2.C;
                                            Q4 = btsVar2.Q();
                                            if (Q4 == obj) {
                                                Q4 = androidx.compose.runtime.f.e(new gr5(s3, 20), ngd0Var);
                                                btsVar2.o0(Q4);
                                            }
                                            m3u0 m3u0Var = (m3u0) Q4;
                                            if (wlsVar2 == null && charSequence.length() == 0 && ((Boolean) m3u0Var.getValue()).booleanValue()) {
                                                btsVar2.e0(-1890614312);
                                                ngd0Var2 = ngd0Var;
                                                aVar2 = aVar;
                                                long j9 = j8;
                                                tx01Var = s;
                                                i13 = i24;
                                                aVar3 = null;
                                                j690Var2 = j690Var;
                                                wlsVar7 = wlsVar6;
                                                i14 = i12;
                                                imy0Var3 = imy0Var;
                                                androidx.compose.runtime.internal.a S3 = wwg.S(1405547205, true, new exm(s3, j9, ety0Var2, wlsVar2), btsVar2);
                                                btsVar2.t(false);
                                                aVar4 = S3;
                                            } else {
                                                j690Var2 = j690Var;
                                                wlsVar7 = wlsVar6;
                                                imy0Var3 = imy0Var2;
                                                ngd0Var2 = ngd0Var;
                                                aVar2 = aVar;
                                                tx01Var = s;
                                                i13 = i24;
                                                aVar3 = null;
                                                i14 = i12;
                                                btsVar2.e0(-1890217110);
                                                btsVar2.t(false);
                                                aVar4 = null;
                                            }
                                            Q5 = btsVar2.Q();
                                            if (Q5 == obj) {
                                                Q5 = androidx.compose.runtime.f.e(new gr5(tx01Var, 21), ngd0Var2);
                                                btsVar2.o0(Q5);
                                            }
                                            btsVar2.e0(-1889500886);
                                            btsVar2.t(false);
                                            btsVar2.e0(-1888924534);
                                            btsVar2.t(false);
                                            long j10 = !z2 ? imy0Var3.r : z3 ? imy0Var3.s : booleanValue ? imy0Var3.p : imy0Var3.q;
                                            if (wlsVar3 == null) {
                                                btsVar2.e0(-1888749663);
                                                btsVar2.t(false);
                                                aVar5 = aVar3;
                                            } else {
                                                btsVar2.e0(-1888749662);
                                                androidx.compose.runtime.internal.a S4 = wwg.S(-1736293487, true, new smy0(j10, wlsVar3, 1, (byte) 0), btsVar2);
                                                btsVar2.t(false);
                                                aVar5 = S4;
                                            }
                                            long j11 = !z2 ? imy0Var3.v : z3 ? imy0Var3.w : booleanValue ? imy0Var3.t : imy0Var3.u;
                                            if (wlsVar4 == null) {
                                                btsVar2.e0(-1888469888);
                                                btsVar2.t(false);
                                                aVar6 = aVar3;
                                            } else {
                                                btsVar2.e0(-1888469887);
                                                androidx.compose.runtime.internal.a S5 = wwg.S(1334518521, true, new smy0(j11, wlsVar4, 2, (byte) 0), btsVar2);
                                                btsVar2.t(false);
                                                aVar6 = S5;
                                            }
                                            long j12 = !z2 ? imy0Var3.H : z3 ? imy0Var3.I : booleanValue ? imy0Var3.F : imy0Var3.G;
                                            if (wlsVar5 == null) {
                                                btsVar2.e0(-1888176380);
                                                btsVar2.t(false);
                                                z5 = false;
                                                i15 = 1;
                                                S = aVar3;
                                            } else {
                                                btsVar2.e0(-1888176379);
                                                ety0 ety0Var4 = ety0Var;
                                                z5 = false;
                                                i15 = 1;
                                                S = wwg.S(837168720, true, new a92(j12, ety0Var4, wlsVar5, 3), btsVar2);
                                                btsVar2.t(false);
                                            }
                                            i16 = g.a[textFieldType.ordinal()];
                                            if (i16 == i15) {
                                                androidx.compose.runtime.internal.a aVar7 = aVar3;
                                                btsVar2.e0(-1887830698);
                                                rlb1.b(wlsVar, aVar2, aVar4, aVar5, aVar6, aVar7, aVar7, z, nny0Var, new bny0(new TextFieldImplKt$CommonDecorationBox$3$1(s2, m3u0.class, "value", "getValue()Ljava/lang/Object;", 0)), wwg.S(-1729858187, true, new cp1(wlsVar6, 18), btsVar2), S, j690Var, btsVar2, ((i13 >> 3) & 112) | 6 | ((i22 << 21) & 234881024) | ((i13 << 18) & 1879048192), ((i22 >> 6) & 7168) | 48);
                                                btsVar = btsVar2;
                                                btsVar.t(false);
                                            } else {
                                                if (i16 != i14) {
                                                    throw unr0.y(493292232, btsVar2, z5);
                                                }
                                                btsVar2.e0(-1886778186);
                                                Object Q6 = btsVar2.Q();
                                                if (Q6 == obj) {
                                                    i17 = 1879048192;
                                                    i18 = 234881024;
                                                    Q6 = androidx.compose.runtime.f.j(new cjs0(0L));
                                                    btsVar2.o0(Q6);
                                                } else {
                                                    i17 = 1879048192;
                                                    i18 = 234881024;
                                                }
                                                final oz40 oz40Var2 = (oz40) Q6;
                                                int i26 = i17;
                                                androidx.compose.runtime.internal.a S6 = wwg.S(528115858, true, new wls() { // from class: androidx.compose.material3.internal.f
                                                    @Override // defpackage.wls
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        fid fidVar2 = (fid) obj2;
                                                        int intValue = ((Integer) obj3).intValue();
                                                        bts btsVar3 = (bts) fidVar2;
                                                        if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                                            f530 i27 = bb1.i(pj91.h(c530.a, "Container"), new th40(7, new TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1(oz40.this, oz40.class, "value", "getValue()Ljava/lang/Object;", 0), j690Var2, h.e(nny0Var)));
                                                            z910 d = pi6.d(x4c.b, true);
                                                            int S7 = cma1.S(btsVar3);
                                                            r1b0 o = btsVar3.o();
                                                            f530 d2 = androidx.compose.ui.b.d(btsVar3, i27);
                                                            ohd.G1.getClass();
                                                            sls slsVar = androidx.compose.ui.node.d.b;
                                                            if (btsVar3.a == null) {
                                                                cma1.b0();
                                                                throw null;
                                                            }
                                                            btsVar3.i0();
                                                            if (btsVar3.S) {
                                                                btsVar3.n(slsVar);
                                                            } else {
                                                                btsVar3.r0();
                                                            }
                                                            qje.W(btsVar3, androidx.compose.ui.node.d.f, d);
                                                            qje.W(btsVar3, androidx.compose.ui.node.d.e, o);
                                                            wls wlsVar8 = androidx.compose.ui.node.d.g;
                                                            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S7))) {
                                                                b64.z(S7, btsVar3, S7, wlsVar8);
                                                            }
                                                            qje.W(btsVar3, androidx.compose.ui.node.d.d, d2);
                                                            xvz.u(0, wlsVar7, btsVar3, true);
                                                        } else {
                                                            btsVar3.Y();
                                                        }
                                                        return zy11.a;
                                                    }
                                                }, btsVar2);
                                                bny0 bny0Var = new bny0(new TextFieldImplKt$CommonDecorationBox$3$2(s2, m3u0.class, "value", "getValue()Ljava/lang/Object;", 0));
                                                boolean k3 = ((i13 & 7168) == 2048) | btsVar2.k(s2);
                                                Object Q7 = btsVar2.Q();
                                                if (k3 || Q7 == obj) {
                                                    Q7 = new zjy0(2, nny0Var, s2, oz40Var2);
                                                    btsVar2.o0(Q7);
                                                }
                                                rh10.b(wlsVar, aVar4, aVar2, aVar5, aVar6, aVar3, aVar3, z, nny0Var, bny0Var, (tls) Q7, S6, S, j690Var2, btsVar2, ((i13 >> 3) & 112) | 6 | ((i22 << 21) & i18) | ((i13 << 18) & i26), (57344 & (i22 >> 3)) | 384);
                                                btsVar = btsVar2;
                                                btsVar.t(false);
                                            }
                                        }
                                    }
                                    f5 = 1.0f;
                                    btsVar2.t(false);
                                    Float valueOf52 = Float.valueOf(f5);
                                    InputPhase inputPhase92 = (InputPhase) oz40Var.getValue();
                                    btsVar2.e0(-1258455321);
                                    i11 = iArr[inputPhase92.ordinal()];
                                    if (i11 != 1) {
                                    }
                                    f6 = 1.0f;
                                    btsVar2.t(false);
                                    Float valueOf62 = Float.valueOf(f6);
                                    a0.f();
                                    btsVar2.e0(2126293195);
                                    btsVar2.t(false);
                                    s = bvf0.s(a0, valueOf52, valueOf62, e, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                                    twt0 e42 = hob1.e(motionSchemeKeyTokens, btsVar2);
                                    InputPhase inputPhase102 = (InputPhase) oz40Var.getValue();
                                    btsVar2.e0(-12973394);
                                    if (iArr[inputPhase102.ordinal()] == 1) {
                                    }
                                    btsVar2.t(false);
                                    Object f82 = ldc.f(j5);
                                    k = btsVar2.k(f82);
                                    Q = btsVar2.Q();
                                    obj = did.a;
                                    if (!k) {
                                    }
                                    Q = (gl11) androidx.compose.animation.h.a().invoke(f82);
                                    btsVar2.o0(Q);
                                    gl11 gl11Var22 = (gl11) Q;
                                    InputPhase inputPhase112 = (InputPhase) a0.c();
                                    btsVar2.e0(-12973394);
                                    if (iArr[inputPhase112.ordinal()] == 1) {
                                    }
                                    btsVar2.t(false);
                                    ldc ldcVar5 = new ldc(j6);
                                    InputPhase inputPhase122 = (InputPhase) oz40Var.getValue();
                                    btsVar2.e0(-12973394);
                                    if (iArr[inputPhase122.ordinal()] == 1) {
                                    }
                                    btsVar2.t(false);
                                    ldc ldcVar22 = new ldc(j7);
                                    a0.f();
                                    btsVar2.e0(1954111929);
                                    btsVar2.t(false);
                                    tx01 s42 = bvf0.s(a0, ldcVar5, ldcVar22, e42, gl11Var22, btsVar2, ImageMetadata.EDGE_MODE);
                                    btsVar2.e0(-464752477);
                                    btsVar2.t(false);
                                    Object f92 = ldc.f(j2);
                                    k2 = btsVar2.k(f92);
                                    Q2 = btsVar2.Q();
                                    if (!k2) {
                                    }
                                    Q2 = (gl11) androidx.compose.animation.h.a().invoke(f92);
                                    btsVar2.o0(Q2);
                                    gl11 gl11Var32 = (gl11) Q2;
                                    btsVar2.e0(-464752477);
                                    btsVar2.t(false);
                                    ldc ldcVar32 = new ldc(j2);
                                    btsVar2.e0(-464752477);
                                    btsVar2.t(false);
                                    ldc ldcVar42 = new ldc(j2);
                                    a0.f();
                                    btsVar2.e0(1190923886);
                                    btsVar2.t(false);
                                    tx01 s52 = bvf0.s(a0, ldcVar32, ldcVar42, e42, gl11Var32, btsVar2, ImageMetadata.EDGE_MODE);
                                    Q3 = btsVar2.Q();
                                    if (Q3 == obj) {
                                    }
                                    zmy0 zmy0Var2 = (zmy0) Q3;
                                    if (zlsVar == null) {
                                    }
                                    if (!z2) {
                                    }
                                    Q4 = btsVar2.Q();
                                    if (Q4 == obj) {
                                    }
                                    m3u0 m3u0Var2 = (m3u0) Q4;
                                    if (wlsVar2 == null) {
                                    }
                                    j690Var2 = j690Var;
                                    wlsVar7 = wlsVar6;
                                    imy0Var3 = imy0Var2;
                                    ngd0Var2 = ngd0Var;
                                    aVar2 = aVar;
                                    tx01Var = s;
                                    i13 = i24;
                                    aVar3 = null;
                                    i14 = i12;
                                    btsVar2.e0(-1890217110);
                                    btsVar2.t(false);
                                    aVar4 = null;
                                    Q5 = btsVar2.Q();
                                    if (Q5 == obj) {
                                    }
                                    btsVar2.e0(-1889500886);
                                    btsVar2.t(false);
                                    btsVar2.e0(-1888924534);
                                    btsVar2.t(false);
                                    long j102 = !z2 ? imy0Var3.r : z3 ? imy0Var3.s : booleanValue ? imy0Var3.p : imy0Var3.q;
                                    if (wlsVar3 == null) {
                                    }
                                    long j112 = !z2 ? imy0Var3.v : z3 ? imy0Var3.w : booleanValue ? imy0Var3.t : imy0Var3.u;
                                    if (wlsVar4 == null) {
                                    }
                                    long j122 = !z2 ? imy0Var3.H : z3 ? imy0Var3.I : booleanValue ? imy0Var3.F : imy0Var3.G;
                                    if (wlsVar5 == null) {
                                    }
                                    i16 = g.a[textFieldType.ordinal()];
                                    if (i16 == i15) {
                                    }
                                }
                                f4 = 1.0f;
                                btsVar2.t(false);
                                Float valueOf42 = Float.valueOf(f4);
                                rx01 f72 = a0.f();
                                btsVar2.e0(-984009111);
                                InputPhase inputPhase62 = InputPhase.Focused;
                                InputPhase inputPhase72 = InputPhase.UnfocusedEmpty;
                                if (f72.a(inputPhase62, inputPhase72)) {
                                    btsVar2.t(false);
                                    tx01 s32 = bvf0.s(a0, valueOf3, valueOf42, twt0Var, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                                    InputPhase inputPhase82 = (InputPhase) a0.c();
                                    btsVar2.e0(-1258455321);
                                    i10 = iArr[inputPhase82.ordinal()];
                                    if (i10 != 1) {
                                    }
                                    f5 = 1.0f;
                                    btsVar2.t(false);
                                    Float valueOf522 = Float.valueOf(f5);
                                    InputPhase inputPhase922 = (InputPhase) oz40Var.getValue();
                                    btsVar2.e0(-1258455321);
                                    i11 = iArr[inputPhase922.ordinal()];
                                    if (i11 != 1) {
                                    }
                                    f6 = 1.0f;
                                    btsVar2.t(false);
                                    Float valueOf622 = Float.valueOf(f6);
                                    a0.f();
                                    btsVar2.e0(2126293195);
                                    btsVar2.t(false);
                                    s = bvf0.s(a0, valueOf522, valueOf622, e, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                                    twt0 e422 = hob1.e(motionSchemeKeyTokens, btsVar2);
                                    InputPhase inputPhase1022 = (InputPhase) oz40Var.getValue();
                                    btsVar2.e0(-12973394);
                                    if (iArr[inputPhase1022.ordinal()] == 1) {
                                    }
                                    btsVar2.t(false);
                                    Object f822 = ldc.f(j5);
                                    k = btsVar2.k(f822);
                                    Q = btsVar2.Q();
                                    obj = did.a;
                                    if (!k) {
                                    }
                                    Q = (gl11) androidx.compose.animation.h.a().invoke(f822);
                                    btsVar2.o0(Q);
                                    gl11 gl11Var222 = (gl11) Q;
                                    InputPhase inputPhase1122 = (InputPhase) a0.c();
                                    btsVar2.e0(-12973394);
                                    if (iArr[inputPhase1122.ordinal()] == 1) {
                                    }
                                    btsVar2.t(false);
                                    ldc ldcVar52 = new ldc(j6);
                                    InputPhase inputPhase1222 = (InputPhase) oz40Var.getValue();
                                    btsVar2.e0(-12973394);
                                    if (iArr[inputPhase1222.ordinal()] == 1) {
                                    }
                                    btsVar2.t(false);
                                    ldc ldcVar222 = new ldc(j7);
                                    a0.f();
                                    btsVar2.e0(1954111929);
                                    btsVar2.t(false);
                                    tx01 s422 = bvf0.s(a0, ldcVar52, ldcVar222, e422, gl11Var222, btsVar2, ImageMetadata.EDGE_MODE);
                                    btsVar2.e0(-464752477);
                                    btsVar2.t(false);
                                    Object f922 = ldc.f(j2);
                                    k2 = btsVar2.k(f922);
                                    Q2 = btsVar2.Q();
                                    if (!k2) {
                                    }
                                    Q2 = (gl11) androidx.compose.animation.h.a().invoke(f922);
                                    btsVar2.o0(Q2);
                                    gl11 gl11Var322 = (gl11) Q2;
                                    btsVar2.e0(-464752477);
                                    btsVar2.t(false);
                                    ldc ldcVar322 = new ldc(j2);
                                    btsVar2.e0(-464752477);
                                    btsVar2.t(false);
                                    ldc ldcVar422 = new ldc(j2);
                                    a0.f();
                                    btsVar2.e0(1190923886);
                                    btsVar2.t(false);
                                    tx01 s522 = bvf0.s(a0, ldcVar322, ldcVar422, e422, gl11Var322, btsVar2, ImageMetadata.EDGE_MODE);
                                    Q3 = btsVar2.Q();
                                    if (Q3 == obj) {
                                    }
                                    zmy0 zmy0Var22 = (zmy0) Q3;
                                    if (zlsVar == null) {
                                    }
                                    if (!z2) {
                                    }
                                    Q4 = btsVar2.Q();
                                    if (Q4 == obj) {
                                    }
                                    m3u0 m3u0Var22 = (m3u0) Q4;
                                    if (wlsVar2 == null) {
                                    }
                                    j690Var2 = j690Var;
                                    wlsVar7 = wlsVar6;
                                    imy0Var3 = imy0Var2;
                                    ngd0Var2 = ngd0Var;
                                    aVar2 = aVar;
                                    tx01Var = s;
                                    i13 = i24;
                                    aVar3 = null;
                                    i14 = i12;
                                    btsVar2.e0(-1890217110);
                                    btsVar2.t(false);
                                    aVar4 = null;
                                    Q5 = btsVar2.Q();
                                    if (Q5 == obj) {
                                    }
                                    btsVar2.e0(-1889500886);
                                    btsVar2.t(false);
                                    btsVar2.e0(-1888924534);
                                    btsVar2.t(false);
                                    long j1022 = !z2 ? imy0Var3.r : z3 ? imy0Var3.s : booleanValue ? imy0Var3.p : imy0Var3.q;
                                    if (wlsVar3 == null) {
                                    }
                                    long j1122 = !z2 ? imy0Var3.v : z3 ? imy0Var3.w : booleanValue ? imy0Var3.t : imy0Var3.u;
                                    if (wlsVar4 == null) {
                                    }
                                    long j1222 = !z2 ? imy0Var3.H : z3 ? imy0Var3.I : booleanValue ? imy0Var3.F : imy0Var3.G;
                                    if (wlsVar5 == null) {
                                    }
                                    i16 = g.a[textFieldType.ordinal()];
                                    if (i16 == i15) {
                                    }
                                }
                                btsVar2.t(false);
                                tx01 s322 = bvf0.s(a0, valueOf3, valueOf42, twt0Var, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                                InputPhase inputPhase822 = (InputPhase) a0.c();
                                btsVar2.e0(-1258455321);
                                i10 = iArr[inputPhase822.ordinal()];
                                if (i10 != 1) {
                                }
                                f5 = 1.0f;
                                btsVar2.t(false);
                                Float valueOf5222 = Float.valueOf(f5);
                                InputPhase inputPhase9222 = (InputPhase) oz40Var.getValue();
                                btsVar2.e0(-1258455321);
                                i11 = iArr[inputPhase9222.ordinal()];
                                if (i11 != 1) {
                                }
                                f6 = 1.0f;
                                btsVar2.t(false);
                                Float valueOf6222 = Float.valueOf(f6);
                                a0.f();
                                btsVar2.e0(2126293195);
                                btsVar2.t(false);
                                s = bvf0.s(a0, valueOf5222, valueOf6222, e, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                                twt0 e4222 = hob1.e(motionSchemeKeyTokens, btsVar2);
                                InputPhase inputPhase10222 = (InputPhase) oz40Var.getValue();
                                btsVar2.e0(-12973394);
                                if (iArr[inputPhase10222.ordinal()] == 1) {
                                }
                                btsVar2.t(false);
                                Object f8222 = ldc.f(j5);
                                k = btsVar2.k(f8222);
                                Q = btsVar2.Q();
                                obj = did.a;
                                if (!k) {
                                }
                                Q = (gl11) androidx.compose.animation.h.a().invoke(f8222);
                                btsVar2.o0(Q);
                                gl11 gl11Var2222 = (gl11) Q;
                                InputPhase inputPhase11222 = (InputPhase) a0.c();
                                btsVar2.e0(-12973394);
                                if (iArr[inputPhase11222.ordinal()] == 1) {
                                }
                                btsVar2.t(false);
                                ldc ldcVar522 = new ldc(j6);
                                InputPhase inputPhase12222 = (InputPhase) oz40Var.getValue();
                                btsVar2.e0(-12973394);
                                if (iArr[inputPhase12222.ordinal()] == 1) {
                                }
                                btsVar2.t(false);
                                ldc ldcVar2222 = new ldc(j7);
                                a0.f();
                                btsVar2.e0(1954111929);
                                btsVar2.t(false);
                                tx01 s4222 = bvf0.s(a0, ldcVar522, ldcVar2222, e4222, gl11Var2222, btsVar2, ImageMetadata.EDGE_MODE);
                                btsVar2.e0(-464752477);
                                btsVar2.t(false);
                                Object f9222 = ldc.f(j2);
                                k2 = btsVar2.k(f9222);
                                Q2 = btsVar2.Q();
                                if (!k2) {
                                }
                                Q2 = (gl11) androidx.compose.animation.h.a().invoke(f9222);
                                btsVar2.o0(Q2);
                                gl11 gl11Var3222 = (gl11) Q2;
                                btsVar2.e0(-464752477);
                                btsVar2.t(false);
                                ldc ldcVar3222 = new ldc(j2);
                                btsVar2.e0(-464752477);
                                btsVar2.t(false);
                                ldc ldcVar4222 = new ldc(j2);
                                a0.f();
                                btsVar2.e0(1190923886);
                                btsVar2.t(false);
                                tx01 s5222 = bvf0.s(a0, ldcVar3222, ldcVar4222, e4222, gl11Var3222, btsVar2, ImageMetadata.EDGE_MODE);
                                Q3 = btsVar2.Q();
                                if (Q3 == obj) {
                                }
                                zmy0 zmy0Var222 = (zmy0) Q3;
                                if (zlsVar == null) {
                                }
                                if (!z2) {
                                }
                                Q4 = btsVar2.Q();
                                if (Q4 == obj) {
                                }
                                m3u0 m3u0Var222 = (m3u0) Q4;
                                if (wlsVar2 == null) {
                                }
                                j690Var2 = j690Var;
                                wlsVar7 = wlsVar6;
                                imy0Var3 = imy0Var2;
                                ngd0Var2 = ngd0Var;
                                aVar2 = aVar;
                                tx01Var = s;
                                i13 = i24;
                                aVar3 = null;
                                i14 = i12;
                                btsVar2.e0(-1890217110);
                                btsVar2.t(false);
                                aVar4 = null;
                                Q5 = btsVar2.Q();
                                if (Q5 == obj) {
                                }
                                btsVar2.e0(-1889500886);
                                btsVar2.t(false);
                                btsVar2.e0(-1888924534);
                                btsVar2.t(false);
                                long j10222 = !z2 ? imy0Var3.r : z3 ? imy0Var3.s : booleanValue ? imy0Var3.p : imy0Var3.q;
                                if (wlsVar3 == null) {
                                }
                                long j11222 = !z2 ? imy0Var3.v : z3 ? imy0Var3.w : booleanValue ? imy0Var3.t : imy0Var3.u;
                                if (wlsVar4 == null) {
                                }
                                long j12222 = !z2 ? imy0Var3.H : z3 ? imy0Var3.I : booleanValue ? imy0Var3.F : imy0Var3.G;
                                if (wlsVar5 == null) {
                                }
                                i16 = g.a[textFieldType.ordinal()];
                                if (i16 == i15) {
                                }
                            }
                            f3 = 1.0f;
                            btsVar2.t(false);
                            Float valueOf32 = Float.valueOf(f3);
                            InputPhase inputPhase52 = (InputPhase) oz40Var.getValue();
                            btsVar2.e0(-1093194547);
                            i9 = iArr[inputPhase52.ordinal()];
                            if (i9 != 1) {
                            }
                            f4 = 1.0f;
                            btsVar2.t(false);
                            Float valueOf422 = Float.valueOf(f4);
                            rx01 f722 = a0.f();
                            btsVar2.e0(-984009111);
                            InputPhase inputPhase622 = InputPhase.Focused;
                            InputPhase inputPhase722 = InputPhase.UnfocusedEmpty;
                            if (f722.a(inputPhase622, inputPhase722)) {
                            }
                            btsVar2.t(false);
                            tx01 s3222 = bvf0.s(a0, valueOf32, valueOf422, twt0Var, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                            InputPhase inputPhase8222 = (InputPhase) a0.c();
                            btsVar2.e0(-1258455321);
                            i10 = iArr[inputPhase8222.ordinal()];
                            if (i10 != 1) {
                            }
                            f5 = 1.0f;
                            btsVar2.t(false);
                            Float valueOf52222 = Float.valueOf(f5);
                            InputPhase inputPhase92222 = (InputPhase) oz40Var.getValue();
                            btsVar2.e0(-1258455321);
                            i11 = iArr[inputPhase92222.ordinal()];
                            if (i11 != 1) {
                            }
                            f6 = 1.0f;
                            btsVar2.t(false);
                            Float valueOf62222 = Float.valueOf(f6);
                            a0.f();
                            btsVar2.e0(2126293195);
                            btsVar2.t(false);
                            s = bvf0.s(a0, valueOf52222, valueOf62222, e, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                            twt0 e42222 = hob1.e(motionSchemeKeyTokens, btsVar2);
                            InputPhase inputPhase102222 = (InputPhase) oz40Var.getValue();
                            btsVar2.e0(-12973394);
                            if (iArr[inputPhase102222.ordinal()] == 1) {
                            }
                            btsVar2.t(false);
                            Object f82222 = ldc.f(j5);
                            k = btsVar2.k(f82222);
                            Q = btsVar2.Q();
                            obj = did.a;
                            if (!k) {
                            }
                            Q = (gl11) androidx.compose.animation.h.a().invoke(f82222);
                            btsVar2.o0(Q);
                            gl11 gl11Var22222 = (gl11) Q;
                            InputPhase inputPhase112222 = (InputPhase) a0.c();
                            btsVar2.e0(-12973394);
                            if (iArr[inputPhase112222.ordinal()] == 1) {
                            }
                            btsVar2.t(false);
                            ldc ldcVar5222 = new ldc(j6);
                            InputPhase inputPhase122222 = (InputPhase) oz40Var.getValue();
                            btsVar2.e0(-12973394);
                            if (iArr[inputPhase122222.ordinal()] == 1) {
                            }
                            btsVar2.t(false);
                            ldc ldcVar22222 = new ldc(j7);
                            a0.f();
                            btsVar2.e0(1954111929);
                            btsVar2.t(false);
                            tx01 s42222 = bvf0.s(a0, ldcVar5222, ldcVar22222, e42222, gl11Var22222, btsVar2, ImageMetadata.EDGE_MODE);
                            btsVar2.e0(-464752477);
                            btsVar2.t(false);
                            Object f92222 = ldc.f(j2);
                            k2 = btsVar2.k(f92222);
                            Q2 = btsVar2.Q();
                            if (!k2) {
                            }
                            Q2 = (gl11) androidx.compose.animation.h.a().invoke(f92222);
                            btsVar2.o0(Q2);
                            gl11 gl11Var32222 = (gl11) Q2;
                            btsVar2.e0(-464752477);
                            btsVar2.t(false);
                            ldc ldcVar32222 = new ldc(j2);
                            btsVar2.e0(-464752477);
                            btsVar2.t(false);
                            ldc ldcVar42222 = new ldc(j2);
                            a0.f();
                            btsVar2.e0(1190923886);
                            btsVar2.t(false);
                            tx01 s52222 = bvf0.s(a0, ldcVar32222, ldcVar42222, e42222, gl11Var32222, btsVar2, ImageMetadata.EDGE_MODE);
                            Q3 = btsVar2.Q();
                            if (Q3 == obj) {
                            }
                            zmy0 zmy0Var2222 = (zmy0) Q3;
                            if (zlsVar == null) {
                            }
                            if (!z2) {
                            }
                            Q4 = btsVar2.Q();
                            if (Q4 == obj) {
                            }
                            m3u0 m3u0Var2222 = (m3u0) Q4;
                            if (wlsVar2 == null) {
                            }
                            j690Var2 = j690Var;
                            wlsVar7 = wlsVar6;
                            imy0Var3 = imy0Var2;
                            ngd0Var2 = ngd0Var;
                            aVar2 = aVar;
                            tx01Var = s;
                            i13 = i24;
                            aVar3 = null;
                            i14 = i12;
                            btsVar2.e0(-1890217110);
                            btsVar2.t(false);
                            aVar4 = null;
                            Q5 = btsVar2.Q();
                            if (Q5 == obj) {
                            }
                            btsVar2.e0(-1889500886);
                            btsVar2.t(false);
                            btsVar2.e0(-1888924534);
                            btsVar2.t(false);
                            long j102222 = !z2 ? imy0Var3.r : z3 ? imy0Var3.s : booleanValue ? imy0Var3.p : imy0Var3.q;
                            if (wlsVar3 == null) {
                            }
                            long j112222 = !z2 ? imy0Var3.v : z3 ? imy0Var3.w : booleanValue ? imy0Var3.t : imy0Var3.u;
                            if (wlsVar4 == null) {
                            }
                            long j122222 = !z2 ? imy0Var3.H : z3 ? imy0Var3.I : booleanValue ? imy0Var3.F : imy0Var3.G;
                            if (wlsVar5 == null) {
                            }
                            i16 = g.a[textFieldType.ordinal()];
                            if (i16 == i15) {
                            }
                        }
                    }
                    f2 = 1.0f;
                    btsVar2.t(false);
                    Float valueOf22 = Float.valueOf(f2);
                    a0.f();
                    btsVar2.e0(-709912974);
                    btsVar2.t(false);
                    tx01 s22 = bvf0.s(a0, valueOf, valueOf22, e3, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                    MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.FastEffects;
                    e = hob1.e(motionSchemeKeyTokens2, btsVar2);
                    e2 = hob1.e(MotionSchemeKeyTokens.SlowEffects, btsVar2);
                    InputPhase inputPhase42 = (InputPhase) a0.c();
                    btsVar2.e0(-1093194547);
                    i8 = iArr[inputPhase42.ordinal()];
                    j = b2;
                    if (i8 != 1) {
                    }
                    f3 = 1.0f;
                    btsVar2.t(false);
                    Float valueOf322 = Float.valueOf(f3);
                    InputPhase inputPhase522 = (InputPhase) oz40Var.getValue();
                    btsVar2.e0(-1093194547);
                    i9 = iArr[inputPhase522.ordinal()];
                    if (i9 != 1) {
                    }
                    f4 = 1.0f;
                    btsVar2.t(false);
                    Float valueOf4222 = Float.valueOf(f4);
                    rx01 f7222 = a0.f();
                    btsVar2.e0(-984009111);
                    InputPhase inputPhase6222 = InputPhase.Focused;
                    InputPhase inputPhase7222 = InputPhase.UnfocusedEmpty;
                    if (f7222.a(inputPhase6222, inputPhase7222)) {
                    }
                    btsVar2.t(false);
                    tx01 s32222 = bvf0.s(a0, valueOf322, valueOf4222, twt0Var, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                    InputPhase inputPhase82222 = (InputPhase) a0.c();
                    btsVar2.e0(-1258455321);
                    i10 = iArr[inputPhase82222.ordinal()];
                    if (i10 != 1) {
                    }
                    f5 = 1.0f;
                    btsVar2.t(false);
                    Float valueOf522222 = Float.valueOf(f5);
                    InputPhase inputPhase922222 = (InputPhase) oz40Var.getValue();
                    btsVar2.e0(-1258455321);
                    i11 = iArr[inputPhase922222.ordinal()];
                    if (i11 != 1) {
                    }
                    f6 = 1.0f;
                    btsVar2.t(false);
                    Float valueOf622222 = Float.valueOf(f6);
                    a0.f();
                    btsVar2.e0(2126293195);
                    btsVar2.t(false);
                    s = bvf0.s(a0, valueOf522222, valueOf622222, e, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
                    twt0 e422222 = hob1.e(motionSchemeKeyTokens2, btsVar2);
                    InputPhase inputPhase1022222 = (InputPhase) oz40Var.getValue();
                    btsVar2.e0(-12973394);
                    if (iArr[inputPhase1022222.ordinal()] == 1) {
                    }
                    btsVar2.t(false);
                    Object f822222 = ldc.f(j5);
                    k = btsVar2.k(f822222);
                    Q = btsVar2.Q();
                    obj = did.a;
                    if (!k) {
                    }
                    Q = (gl11) androidx.compose.animation.h.a().invoke(f822222);
                    btsVar2.o0(Q);
                    gl11 gl11Var222222 = (gl11) Q;
                    InputPhase inputPhase1122222 = (InputPhase) a0.c();
                    btsVar2.e0(-12973394);
                    if (iArr[inputPhase1122222.ordinal()] == 1) {
                    }
                    btsVar2.t(false);
                    ldc ldcVar52222 = new ldc(j6);
                    InputPhase inputPhase1222222 = (InputPhase) oz40Var.getValue();
                    btsVar2.e0(-12973394);
                    if (iArr[inputPhase1222222.ordinal()] == 1) {
                    }
                    btsVar2.t(false);
                    ldc ldcVar222222 = new ldc(j7);
                    a0.f();
                    btsVar2.e0(1954111929);
                    btsVar2.t(false);
                    tx01 s422222 = bvf0.s(a0, ldcVar52222, ldcVar222222, e422222, gl11Var222222, btsVar2, ImageMetadata.EDGE_MODE);
                    btsVar2.e0(-464752477);
                    btsVar2.t(false);
                    Object f922222 = ldc.f(j2);
                    k2 = btsVar2.k(f922222);
                    Q2 = btsVar2.Q();
                    if (!k2) {
                    }
                    Q2 = (gl11) androidx.compose.animation.h.a().invoke(f922222);
                    btsVar2.o0(Q2);
                    gl11 gl11Var322222 = (gl11) Q2;
                    btsVar2.e0(-464752477);
                    btsVar2.t(false);
                    ldc ldcVar322222 = new ldc(j2);
                    btsVar2.e0(-464752477);
                    btsVar2.t(false);
                    ldc ldcVar422222 = new ldc(j2);
                    a0.f();
                    btsVar2.e0(1190923886);
                    btsVar2.t(false);
                    tx01 s522222 = bvf0.s(a0, ldcVar322222, ldcVar422222, e422222, gl11Var322222, btsVar2, ImageMetadata.EDGE_MODE);
                    Q3 = btsVar2.Q();
                    if (Q3 == obj) {
                    }
                    zmy0 zmy0Var22222 = (zmy0) Q3;
                    if (zlsVar == null) {
                    }
                    if (!z2) {
                    }
                    Q4 = btsVar2.Q();
                    if (Q4 == obj) {
                    }
                    m3u0 m3u0Var22222 = (m3u0) Q4;
                    if (wlsVar2 == null) {
                    }
                    j690Var2 = j690Var;
                    wlsVar7 = wlsVar6;
                    imy0Var3 = imy0Var2;
                    ngd0Var2 = ngd0Var;
                    aVar2 = aVar;
                    tx01Var = s;
                    i13 = i24;
                    aVar3 = null;
                    i14 = i12;
                    btsVar2.e0(-1890217110);
                    btsVar2.t(false);
                    aVar4 = null;
                    Q5 = btsVar2.Q();
                    if (Q5 == obj) {
                    }
                    btsVar2.e0(-1889500886);
                    btsVar2.t(false);
                    btsVar2.e0(-1888924534);
                    btsVar2.t(false);
                    long j1022222 = !z2 ? imy0Var3.r : z3 ? imy0Var3.s : booleanValue ? imy0Var3.p : imy0Var3.q;
                    if (wlsVar3 == null) {
                    }
                    long j1122222 = !z2 ? imy0Var3.v : z3 ? imy0Var3.w : booleanValue ? imy0Var3.t : imy0Var3.u;
                    if (wlsVar4 == null) {
                    }
                    long j1222222 = !z2 ? imy0Var3.H : z3 ? imy0Var3.I : booleanValue ? imy0Var3.F : imy0Var3.G;
                    if (wlsVar5 == null) {
                    }
                    i16 = g.a[textFieldType.ordinal()];
                    if (i16 == i15) {
                    }
                }
            }
            f = 1.0f;
            btsVar2.t(false);
            Float valueOf7 = Float.valueOf(f);
            InputPhase inputPhase32 = (InputPhase) oz40Var.getValue();
            btsVar2.e0(-1436405362);
            i7 = iArr[inputPhase32.ordinal()];
            if (i7 != 1) {
            }
            f2 = 1.0f;
            btsVar2.t(false);
            Float valueOf222 = Float.valueOf(f2);
            a0.f();
            btsVar2.e0(-709912974);
            btsVar2.t(false);
            tx01 s222 = bvf0.s(a0, valueOf7, valueOf222, e3, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
            MotionSchemeKeyTokens motionSchemeKeyTokens22 = MotionSchemeKeyTokens.FastEffects;
            e = hob1.e(motionSchemeKeyTokens22, btsVar2);
            e2 = hob1.e(MotionSchemeKeyTokens.SlowEffects, btsVar2);
            InputPhase inputPhase422 = (InputPhase) a0.c();
            btsVar2.e0(-1093194547);
            i8 = iArr[inputPhase422.ordinal()];
            j = b2;
            if (i8 != 1) {
            }
            f3 = 1.0f;
            btsVar2.t(false);
            Float valueOf3222 = Float.valueOf(f3);
            InputPhase inputPhase5222 = (InputPhase) oz40Var.getValue();
            btsVar2.e0(-1093194547);
            i9 = iArr[inputPhase5222.ordinal()];
            if (i9 != 1) {
            }
            f4 = 1.0f;
            btsVar2.t(false);
            Float valueOf42222 = Float.valueOf(f4);
            rx01 f72222 = a0.f();
            btsVar2.e0(-984009111);
            InputPhase inputPhase62222 = InputPhase.Focused;
            InputPhase inputPhase72222 = InputPhase.UnfocusedEmpty;
            if (f72222.a(inputPhase62222, inputPhase72222)) {
            }
            btsVar2.t(false);
            tx01 s322222 = bvf0.s(a0, valueOf3222, valueOf42222, twt0Var, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
            InputPhase inputPhase822222 = (InputPhase) a0.c();
            btsVar2.e0(-1258455321);
            i10 = iArr[inputPhase822222.ordinal()];
            if (i10 != 1) {
            }
            f5 = 1.0f;
            btsVar2.t(false);
            Float valueOf5222222 = Float.valueOf(f5);
            InputPhase inputPhase9222222 = (InputPhase) oz40Var.getValue();
            btsVar2.e0(-1258455321);
            i11 = iArr[inputPhase9222222.ordinal()];
            if (i11 != 1) {
            }
            f6 = 1.0f;
            btsVar2.t(false);
            Float valueOf6222222 = Float.valueOf(f6);
            a0.f();
            btsVar2.e0(2126293195);
            btsVar2.t(false);
            s = bvf0.s(a0, valueOf5222222, valueOf6222222, e, gl11Var, btsVar2, ImageMetadata.EDGE_MODE);
            twt0 e4222222 = hob1.e(motionSchemeKeyTokens22, btsVar2);
            InputPhase inputPhase10222222 = (InputPhase) oz40Var.getValue();
            btsVar2.e0(-12973394);
            if (iArr[inputPhase10222222.ordinal()] == 1) {
            }
            btsVar2.t(false);
            Object f8222222 = ldc.f(j5);
            k = btsVar2.k(f8222222);
            Q = btsVar2.Q();
            obj = did.a;
            if (!k) {
            }
            Q = (gl11) androidx.compose.animation.h.a().invoke(f8222222);
            btsVar2.o0(Q);
            gl11 gl11Var2222222 = (gl11) Q;
            InputPhase inputPhase11222222 = (InputPhase) a0.c();
            btsVar2.e0(-12973394);
            if (iArr[inputPhase11222222.ordinal()] == 1) {
            }
            btsVar2.t(false);
            ldc ldcVar522222 = new ldc(j6);
            InputPhase inputPhase12222222 = (InputPhase) oz40Var.getValue();
            btsVar2.e0(-12973394);
            if (iArr[inputPhase12222222.ordinal()] == 1) {
            }
            btsVar2.t(false);
            ldc ldcVar2222222 = new ldc(j7);
            a0.f();
            btsVar2.e0(1954111929);
            btsVar2.t(false);
            tx01 s4222222 = bvf0.s(a0, ldcVar522222, ldcVar2222222, e4222222, gl11Var2222222, btsVar2, ImageMetadata.EDGE_MODE);
            btsVar2.e0(-464752477);
            btsVar2.t(false);
            Object f9222222 = ldc.f(j2);
            k2 = btsVar2.k(f9222222);
            Q2 = btsVar2.Q();
            if (!k2) {
            }
            Q2 = (gl11) androidx.compose.animation.h.a().invoke(f9222222);
            btsVar2.o0(Q2);
            gl11 gl11Var3222222 = (gl11) Q2;
            btsVar2.e0(-464752477);
            btsVar2.t(false);
            ldc ldcVar3222222 = new ldc(j2);
            btsVar2.e0(-464752477);
            btsVar2.t(false);
            ldc ldcVar4222222 = new ldc(j2);
            a0.f();
            btsVar2.e0(1190923886);
            btsVar2.t(false);
            tx01 s5222222 = bvf0.s(a0, ldcVar3222222, ldcVar4222222, e4222222, gl11Var3222222, btsVar2, ImageMetadata.EDGE_MODE);
            Q3 = btsVar2.Q();
            if (Q3 == obj) {
            }
            zmy0 zmy0Var222222 = (zmy0) Q3;
            if (zlsVar == null) {
            }
            if (!z2) {
            }
            Q4 = btsVar2.Q();
            if (Q4 == obj) {
            }
            m3u0 m3u0Var222222 = (m3u0) Q4;
            if (wlsVar2 == null) {
            }
            j690Var2 = j690Var;
            wlsVar7 = wlsVar6;
            imy0Var3 = imy0Var2;
            ngd0Var2 = ngd0Var;
            aVar2 = aVar;
            tx01Var = s;
            i13 = i24;
            aVar3 = null;
            i14 = i12;
            btsVar2.e0(-1890217110);
            btsVar2.t(false);
            aVar4 = null;
            Q5 = btsVar2.Q();
            if (Q5 == obj) {
            }
            btsVar2.e0(-1889500886);
            btsVar2.t(false);
            btsVar2.e0(-1888924534);
            btsVar2.t(false);
            long j10222222 = !z2 ? imy0Var3.r : z3 ? imy0Var3.s : booleanValue ? imy0Var3.p : imy0Var3.q;
            if (wlsVar3 == null) {
            }
            long j11222222 = !z2 ? imy0Var3.v : z3 ? imy0Var3.w : booleanValue ? imy0Var3.t : imy0Var3.u;
            if (wlsVar4 == null) {
            }
            long j12222222 = !z2 ? imy0Var3.H : z3 ? imy0Var3.I : booleanValue ? imy0Var3.F : imy0Var3.G;
            if (wlsVar5 == null) {
            }
            i16 = g.a[textFieldType.ordinal()];
            if (i16 == i15) {
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: vmy0
                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    h.a(TextFieldType.this, charSequence, wlsVar, nny0Var, zlsVar, wlsVar2, wlsVar3, wlsVar4, wlsVar5, z, z2, z3, h8wVar, j690Var, imy0Var, wlsVar6, (fid) obj2, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(long j, ety0 ety0Var, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(396611577);
        int i2 = (btsVar.d(j) ? 4 : 2) | i | (btsVar.k(ety0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            oaa1.b(j, ety0Var, wlsVar, btsVar, i2 & 1022);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qvf0(j, ety0Var, wlsVar, i, 1);
        }
    }

    public static final void c(long j, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(590397809);
        int i2 = (btsVar.d(j) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sb2.b(bfe.a.a(new ldc(j)), wlsVar, btsVar, (i2 & 112) | 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new smy0(j, wlsVar, i);
        }
    }

    public static final it1 d(nny0 nny0Var) {
        return nny0Var.c;
    }

    public static final it1 e(ulb1 ulb1Var) {
        if (ulb1Var instanceof mny0) {
            return ((mny0) ulb1Var).b;
        }
        if (ulb1Var instanceof nny0) {
            return ((nny0) ulb1Var).b;
        }
        kbs.f(ulb1Var, "Unknown position: ");
        return null;
    }

    public static final float f(fid fidVar) {
        float f = ((y7m) ((bts) fidVar).m(androidx.compose.material3.h.c)).a;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - yws0.c) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }
}
