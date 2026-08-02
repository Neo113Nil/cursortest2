package androidx.compose.animation;

import androidx.compose.ui.layout.o;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fgw0;
import defpackage.fid;
import defpackage.gl11;
import defpackage.gtq0;
import defpackage.hy01;
import defpackage.kp50;
import defpackage.m2k0;
import defpackage.n8e;
import defpackage.ng2;
import defpackage.nz60;
import defpackage.o430;
import defpackage.ohd;
import defpackage.ox01;
import defpackage.oyr;
import defpackage.oz40;
import defpackage.q2o;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rf9;
import defpackage.sls;
import defpackage.sns0;
import defpackage.sz40;
import defpackage.tic;
import defpackage.tls;
import defpackage.v2o;
import defpackage.vng;
import defpackage.w2o;
import defpackage.wgc;
import defpackage.wls;
import defpackage.x910;
import defpackage.ymo;
import defpackage.zls;
import defpackage.zmo;
import defpackage.zpn;
import defpackage.zx01;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class g {
    public static final void a(final zx01 zx01Var, final tls tlsVar, final f530 f530Var, final v2o v2oVar, final ymo ymoVar, final wls wlsVar, zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        final zls zlsVar2;
        int i4;
        o430 o430Var;
        gl11 gl11Var;
        zmo zmoVar;
        hy01 hy01Var;
        zx01 zx01Var2;
        boolean z;
        ox01 ox01Var;
        ox01 ox01Var2;
        ox01 ox01Var3;
        rf9 rf9Var;
        ox01 ox01Var4;
        ox01 ox01Var5;
        ox01 ox01Var6;
        ox01 ox01Var7;
        v2o v2oVar2;
        ymo ymoVar2;
        zls zlsVar3;
        zls zlsVar4 = zlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1912839215);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(zx01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(v2oVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.k(ymoVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar.e(wlsVar) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= (2097152 & i) == 0 ? btsVar.k(null) : btsVar.e(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar.e(zlsVar4) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (!btsVar.V(i3 & 1, (4793491 & i3) != 4793490)) {
            btsVar.Y();
            zlsVar2 = zlsVar4;
        } else if (((Boolean) tlsVar.invoke(zx01Var.d.getValue())).booleanValue() || ((Boolean) tlsVar.invoke(zx01Var.c())).booleanValue() || zx01Var.g() || zx01Var.d()) {
            btsVar.e0(-232386135);
            int i5 = i3 & 14;
            int i6 = i5 | 48;
            int i7 = i6 & 14;
            boolean z2 = ((i7 ^ 6) > 4 && btsVar.k(zx01Var)) || (i6 & 6) == 4;
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z2 || Q == o430Var2) {
                Q = zx01Var.c();
                btsVar.o0(Q);
            }
            if (zx01Var.g()) {
                Q = zx01Var.c();
            }
            btsVar.e0(1844425648);
            EnterExitState g = g(zx01Var, tlsVar, Q, btsVar);
            btsVar.t(false);
            Object value = zx01Var.d.getValue();
            btsVar.e0(1844425648);
            EnterExitState g2 = g(zx01Var, tlsVar, value, btsVar);
            btsVar.t(false);
            int i8 = i7 | HProv.ALG_TYPE_SECURECHANNEL;
            int i9 = (i8 & 14) ^ 6;
            int i10 = i3;
            boolean z3 = (i9 > 4 && btsVar.k(zx01Var)) || (i8 & 6) == 4;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var2) {
                i4 = i8;
                Q2 = new zx01(new sz40(g), zx01Var, oyr.t(new StringBuilder(), zx01Var.c, " > EnterExitTransition"));
                btsVar.o0(Q2);
            } else {
                i4 = i8;
            }
            zx01 zx01Var3 = (zx01) Q2;
            boolean k = ((i9 > 4 && btsVar.k(zx01Var)) || (i4 & 6) == 4) | btsVar.k(zx01Var3);
            Object Q3 = btsVar.Q();
            if (k || Q3 == o430Var2) {
                Q3 = new fgw0(3, zx01Var, zx01Var3);
                btsVar.o0(Q3);
            }
            zpn.a(zx01Var3, (tls) Q3, btsVar);
            if (zx01Var.g()) {
                zx01Var3.j(g, g2);
            } else {
                zx01Var3.k(g2);
                zx01Var3.k.setValue(Boolean.FALSE);
            }
            gl11 gl11Var2 = k.a;
            boolean k2 = btsVar.k(zx01Var3);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == o430Var2) {
                Q4 = androidx.compose.runtime.f.j(v2oVar);
                btsVar.o0(Q4);
            }
            oz40 oz40Var = (oz40) Q4;
            Object c = zx01Var3.c();
            oz40 oz40Var2 = zx01Var3.d;
            if (c == oz40Var2.getValue() && zx01Var3.c() == EnterExitState.Visible) {
                if (zx01Var3.g()) {
                    oz40Var.setValue(v2oVar);
                } else {
                    oz40Var.setValue(v2o.a);
                }
            } else if (oz40Var2.getValue() == EnterExitState.Visible) {
                oz40Var.setValue(((v2o) oz40Var.getValue()).a(v2oVar));
            }
            v2o v2oVar3 = (v2o) oz40Var.getValue();
            boolean k3 = btsVar.k(zx01Var3);
            Object Q5 = btsVar.Q();
            if (k3 || Q5 == o430Var2) {
                Q5 = androidx.compose.runtime.f.j(ymoVar);
                btsVar.o0(Q5);
            }
            oz40 oz40Var3 = (oz40) Q5;
            if (zx01Var3.c() == oz40Var2.getValue() && zx01Var3.c() == EnterExitState.Visible) {
                if (zx01Var3.g()) {
                    oz40Var3.setValue(ymoVar);
                } else {
                    oz40Var3.setValue(ymo.a);
                }
            } else if (oz40Var2.getValue() != EnterExitState.Visible) {
                oz40Var3.setValue(((ymo) oz40Var3.getValue()).a(ymoVar));
            }
            ymo ymoVar3 = (ymo) oz40Var3.getValue();
            oz40 n = androidx.compose.runtime.f.n(wlsVar, btsVar);
            Object invoke = wlsVar.invoke(zx01Var3.c(), oz40Var2.getValue());
            boolean k4 = btsVar.k(zx01Var3) | btsVar.k(n);
            Object Q6 = btsVar.Q();
            if (k4 || Q6 == o430Var2) {
                Q6 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(zx01Var3, n, null);
                btsVar.o0(Q6);
            }
            oz40 k5 = androidx.compose.runtime.f.k(btsVar, (wls) Q6, invoke);
            Object c2 = zx01Var3.c();
            EnterExitState enterExitState = EnterExitState.PostExit;
            if (c2 == enterExitState && oz40Var2.getValue() == enterExitState && ((Boolean) k5.getValue()).booleanValue()) {
                btsVar.e0(-229368781);
                btsVar.t(false);
                zlsVar3 = zlsVar;
                z = false;
            } else {
                btsVar.e0(-230699766);
                boolean z4 = i5 == 4;
                Object Q7 = btsVar.Q();
                if (z4 || Q7 == o430Var2) {
                    Q7 = new ng2(zx01Var3);
                    btsVar.o0(Q7);
                }
                ng2 ng2Var = (ng2) Q7;
                gl11 gl11Var3 = gtq0.l;
                Object Q8 = btsVar.Q();
                if (Q8 == o430Var2) {
                    Q8 = EnterExitTransitionKt$createModifier$1$1.w;
                    btsVar.o0(Q8);
                }
                final sls slsVar = (sls) Q8;
                btsVar.e0(-167964673);
                btsVar.t(false);
                btsVar.e0(-167961890);
                btsVar.t(false);
                hy01 hy01Var2 = ((w2o) v2oVar3).b;
                zmo zmoVar2 = (zmo) ymoVar3;
                hy01 hy01Var3 = zmoVar2.c;
                hy01 hy01Var4 = ((w2o) v2oVar3).b;
                sns0 sns0Var = hy01Var4.b;
                rf9 rf9Var2 = hy01Var4.c;
                boolean z5 = (sns0Var == null && hy01Var3.b == null) ? false : true;
                boolean z6 = (rf9Var2 == null && hy01Var3.c == null) ? false : true;
                if (z5) {
                    btsVar.e0(-911488127);
                    Object Q9 = btsVar.Q();
                    if (Q9 == o430Var2) {
                        Q9 = "Built-in slide";
                        btsVar.o0("Built-in slide");
                    }
                    String str = (String) Q9;
                    zmoVar = zmoVar2;
                    o430Var = o430Var2;
                    hy01Var = hy01Var4;
                    zx01Var2 = zx01Var3;
                    z = false;
                    ox01 r = bvf0.r(zx01Var2, gl11Var3, str, btsVar, 384, 0);
                    gl11Var = gl11Var3;
                    btsVar.t(false);
                    ox01Var = r;
                } else {
                    o430Var = o430Var2;
                    gl11Var = gl11Var3;
                    zmoVar = zmoVar2;
                    hy01Var = hy01Var4;
                    zx01Var2 = zx01Var3;
                    z = false;
                    btsVar.e0(-911382324);
                    btsVar.t(false);
                    ox01Var = null;
                }
                if (z6) {
                    btsVar.e0(-911290533);
                    gl11 gl11Var4 = gtq0.m;
                    Object Q10 = btsVar.Q();
                    if (Q10 == o430Var) {
                        Q10 = "Built-in shrink/expand";
                        btsVar.o0("Built-in shrink/expand");
                    }
                    ox01 r2 = bvf0.r(zx01Var2, gl11Var4, (String) Q10, btsVar, 384, 0);
                    btsVar.t(z);
                    ox01Var2 = r2;
                } else {
                    btsVar.e0(-911179709);
                    btsVar.t(z);
                    ox01Var2 = null;
                }
                if (z6) {
                    btsVar.e0(-911106083);
                    Object Q11 = btsVar.Q();
                    if (Q11 == o430Var) {
                        Q11 = "Built-in InterruptionHandlingOffset";
                        btsVar.o0("Built-in InterruptionHandlingOffset");
                    }
                    ox01 r3 = bvf0.r(zx01Var2, gl11Var, (String) Q11, btsVar, 384, 0);
                    btsVar.t(z);
                    ox01Var3 = r3;
                } else {
                    btsVar.e0(-910935677);
                    btsVar.t(z);
                    ox01Var3 = null;
                }
                final boolean z7 = ((rf9Var2 == null || rf9Var2.d) && ((rf9Var = zmoVar.c.c) == null || rf9Var.d) && z6) ? z : true;
                float[] fArr = wgc.a;
                btsVar.e0(-910130296);
                btsVar.t(z);
                hy01 hy01Var5 = ((zmo) ymoVar3).c;
                gl11 gl11Var5 = gtq0.f;
                boolean z8 = (hy01Var.a == null && hy01Var5.a == null) ? z : true;
                boolean z9 = (hy01Var.d == null && hy01Var5.d == null) ? z : true;
                if (z8) {
                    btsVar.e0(-703879421);
                    Object Q12 = btsVar.Q();
                    if (Q12 == o430Var) {
                        Q12 = "Built-in alpha";
                        btsVar.o0("Built-in alpha");
                    }
                    ox01 r4 = bvf0.r(zx01Var2, gl11Var5, (String) Q12, btsVar, 384, 0);
                    btsVar.t(z);
                    ox01Var4 = r4;
                } else {
                    btsVar.e0(-703709976);
                    btsVar.t(z);
                    ox01Var4 = null;
                }
                if (z9) {
                    btsVar.e0(-703642333);
                    Object Q13 = btsVar.Q();
                    if (Q13 == o430Var) {
                        Q13 = "Built-in scale";
                        btsVar.o0("Built-in scale");
                    }
                    ox01 r5 = bvf0.r(zx01Var2, gl11Var5, (String) Q13, btsVar, 384, 0);
                    btsVar.t(z);
                    ox01Var5 = r5;
                } else {
                    btsVar.e0(-703472888);
                    btsVar.t(z);
                    ox01Var5 = null;
                }
                if (z9) {
                    btsVar.e0(-703395232);
                    ox01Var6 = ox01Var5;
                    ox01Var7 = bvf0.r(zx01Var2, k.a, "TransformOriginInterruptionHandling", btsVar, 384, 0);
                    btsVar.t(z);
                } else {
                    ox01Var6 = ox01Var5;
                    btsVar.e0(-703222904);
                    btsVar.t(z);
                    ox01Var7 = null;
                }
                boolean e = btsVar.e(ox01Var4) | btsVar.k(v2oVar3) | btsVar.k(ymoVar3) | btsVar.e(ox01Var6) | btsVar.k(zx01Var2) | btsVar.e(ox01Var7);
                Object Q14 = btsVar.Q();
                if (e || Q14 == o430Var) {
                    v2oVar2 = v2oVar3;
                    ymoVar2 = ymoVar3;
                    Q14 = new q2o(ox01Var4, ox01Var6, zx01Var2, v2oVar2, ymoVar2, ox01Var7);
                    btsVar.o0(Q14);
                } else {
                    v2oVar2 = v2oVar3;
                    ymoVar2 = ymoVar3;
                }
                q2o q2oVar = (q2o) Q14;
                boolean a = btsVar.a(z7) | btsVar.k(slsVar);
                Object Q15 = btsVar.Q();
                if (a || Q15 == o430Var) {
                    Q15 = new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            ((m2k0) obj).g(!z7 && ((Boolean) slsVar.invoke()).booleanValue());
                            return zy11.a;
                        }
                    };
                    btsVar.o0(Q15);
                }
                c530 c530Var = c530.a;
                f530 k6 = androidx.compose.ui.graphics.d.a(c530Var, (tls) Q15).k(new j(zx01Var2, ox01Var2, ox01Var3, ox01Var, v2oVar2, ymoVar2, slsVar, q2oVar)).k(c530Var);
                btsVar.e0(-7404393);
                btsVar.t(z);
                f530 k7 = f530Var.k(k6.k(c530Var));
                Object Q16 = btsVar.Q();
                if (Q16 == o430Var) {
                    Q16 = new f(ng2Var);
                    btsVar.o0(Q16);
                }
                f fVar = (f) Q16;
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = androidx.compose.ui.b.d(btsVar, k7);
                ohd.G1.getClass();
                sls slsVar2 = androidx.compose.ui.node.d.b;
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
                qje.W(btsVar, androidx.compose.ui.node.d.f, fVar);
                qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                qje.y(btsVar, Integer.valueOf(hashCode), androidx.compose.ui.node.d.g);
                qje.M(btsVar, androidx.compose.ui.node.d.h);
                qje.W(btsVar, androidx.compose.ui.node.d.d, d);
                zls zlsVar5 = zlsVar;
                zlsVar5.invoke(ng2Var, btsVar, Integer.valueOf((i10 >> 18) & 112));
                btsVar.t(true);
                btsVar.t(z);
                zlsVar3 = zlsVar5;
            }
            btsVar.t(z);
            zlsVar2 = zlsVar3;
        } else {
            btsVar.e0(-229362829);
            btsVar.t(false);
            zlsVar2 = zlsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                final /* synthetic */ nz60 $onLookaheadMeasured;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    g.a(zx01.this, tlsVar, f530Var, v2oVar, ymoVar, wlsVar, zlsVar2, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final tic ticVar, final boolean z, f530 f530Var, v2o v2oVar, ymo ymoVar, String str, final zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        final v2o v2oVar2;
        int i5;
        ymo ymoVar2;
        int i6;
        String str2;
        zls zlsVar2;
        final ymo ymoVar3;
        final f530 f530Var3;
        bts btsVar;
        final String str3;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1799879339);
        if ((i & 48) == 0) {
            i3 = (btsVar2.a(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                v2oVar2 = v2oVar;
                i3 |= btsVar2.k(v2oVar2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    ymoVar2 = ymoVar;
                    i3 |= btsVar2.k(ymoVar2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= btsVar2.k(str2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            zlsVar2 = zlsVar;
                            i3 |= btsVar2.e(zlsVar2) ? 1048576 : 524288;
                        } else {
                            zlsVar2 = zlsVar;
                        }
                        if (btsVar2.V(i3 & 1, (599185 & i3) != 599184)) {
                            if (i7 != 0) {
                                f530Var2 = c530.a;
                            }
                            v2o a = i4 != 0 ? k.e(null, 3).a(k.d(null, null, 15)) : v2oVar2;
                            ymo a2 = i5 != 0 ? k.f(null, 3).a(k.l(null, null, 15)) : ymoVar2;
                            if (i6 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i8 = i3 >> 3;
                            zx01 a0 = bvf0.a0(Boolean.valueOf(z), str2, btsVar2, (i8 & 14) | ((i3 >> 12) & 112));
                            Object Q = btsVar2.Q();
                            if (Q == did.a) {
                                Q = AnimatedVisibilityKt$AnimatedVisibility$5$1.w;
                                btsVar2.o0(Q);
                            }
                            f(a0, (tls) Q, f530Var2, a, a2, zlsVar2, btsVar2, (i3 & HProv.ALG_CLASS_ALL) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & ImageMetadata.JPEG_GPS_COORDINATES));
                            ymoVar3 = a2;
                            v2oVar2 = a;
                            btsVar = btsVar2;
                            str3 = str2;
                            f530Var3 = f530Var2;
                        } else {
                            btsVar2.Y();
                            ymoVar3 = ymoVar2;
                            f530Var3 = f530Var2;
                            btsVar = btsVar2;
                            str3 = str2;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Number) obj2).intValue();
                                    g.b(tic.this, z, f530Var3, v2oVar2, ymoVar3, str3, zlsVar, (fid) obj, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((1572864 & i) == 0) {
                    }
                    if (btsVar2.V(i3 & 1, (599185 & i3) != 599184)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                ymoVar2 = ymoVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                if (btsVar2.V(i3 & 1, (599185 & i3) != 599184)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            v2oVar2 = v2oVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            ymoVar2 = ymoVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            if (btsVar2.V(i3 & 1, (599185 & i3) != 599184)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        v2oVar2 = v2oVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        ymoVar2 = ymoVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        if (btsVar2.V(i3 & 1, (599185 & i3) != 599184)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final sz40 sz40Var, f530 f530Var, v2o v2oVar, ymo ymoVar, String str, final zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        v2o v2oVar2;
        int i5;
        ymo ymoVar2;
        int i6;
        final f530 f530Var3;
        final v2o v2oVar3;
        final ymo ymoVar3;
        final String str2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(657024243);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(sz40Var) : btsVar.e(sz40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                v2oVar2 = v2oVar;
                i3 |= btsVar.k(v2oVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    ymoVar2 = ymoVar;
                    i3 |= btsVar.k(ymoVar2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i3 |= btsVar.k(str) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i3 |= btsVar.e(zlsVar) ? 131072 : 65536;
                        }
                        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                            f530 f530Var4 = i7 != 0 ? c530.a : f530Var2;
                            v2o a = i4 != 0 ? k.e(null, 3).a(k.c(null, 15)) : v2oVar2;
                            ymo a2 = i5 != 0 ? k.f(null, 3).a(k.k(null, 15)) : ymoVar2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str;
                            zx01 O = bvf0.O(sz40Var, str3, btsVar, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            Object Q = btsVar.Q();
                            if (Q == did.a) {
                                Q = AnimatedVisibilityKt$AnimatedVisibility$7$1.w;
                                btsVar.o0(Q);
                            }
                            tls tlsVar = (tls) Q;
                            int i8 = i3 << 3;
                            v2o v2oVar4 = a;
                            f(O, tlsVar, f530Var4, v2oVar4, a2, zlsVar, btsVar, (i8 & HProv.ALG_CLASS_ALL) | (i8 & 896) | 48 | (i8 & 7168) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
                            str2 = str3;
                            f530Var3 = f530Var4;
                            v2oVar3 = v2oVar4;
                            ymoVar3 = a2;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            v2oVar3 = v2oVar2;
                            ymoVar3 = ymoVar2;
                            str2 = str;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Number) obj2).intValue();
                                    g.c(sz40.this, f530Var3, v2oVar3, ymoVar3, str2, zlsVar, (fid) obj, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    if ((196608 & i) == 0) {
                    }
                    if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                ymoVar2 = ymoVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            v2oVar2 = v2oVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            ymoVar2 = ymoVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        v2oVar2 = v2oVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        ymoVar2 = ymoVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final zx01 zx01Var, final tls tlsVar, f530 f530Var, v2o v2oVar, ymo ymoVar, final zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        final v2o v2oVar2;
        int i5;
        ymo ymoVar2;
        final f530 f530Var3;
        final ymo ymoVar3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1699747442);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(zx01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                v2oVar2 = v2oVar;
                i3 |= btsVar.k(v2oVar2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    ymoVar2 = ymoVar;
                    i3 |= btsVar.k(ymoVar2) ? 16384 : 8192;
                    if ((196608 & i) == 0) {
                        i3 |= btsVar.e(zlsVar) ? 131072 : 65536;
                    }
                    if (btsVar.V(i3 & 1, (74899 & i3) == 74898)) {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                        ymoVar3 = ymoVar2;
                    } else {
                        f530 f530Var4 = i6 != 0 ? c530.a : f530Var2;
                        v2o a = i4 != 0 ? k.e(null, 3).a(k.c(null, 15)) : v2oVar2;
                        ymo a2 = i5 != 0 ? k.k(null, 15).a(k.f(null, 3)) : ymoVar2;
                        v2o v2oVar3 = a;
                        f(zx01Var, tlsVar, f530Var4, v2oVar3, a2, zlsVar, btsVar, i3 & 524286);
                        f530Var3 = f530Var4;
                        v2oVar2 = v2oVar3;
                        ymoVar3 = a2;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Number) obj2).intValue();
                                g.d(zx01.this, tlsVar, f530Var3, v2oVar2, ymoVar3, zlsVar, (fid) obj, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                ymoVar2 = ymoVar;
                if ((196608 & i) == 0) {
                }
                if (btsVar.V(i3 & 1, (74899 & i3) == 74898)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            v2oVar2 = v2oVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            ymoVar2 = ymoVar;
            if ((196608 & i) == 0) {
            }
            if (btsVar.V(i3 & 1, (74899 & i3) == 74898)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        v2oVar2 = v2oVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        ymoVar2 = ymoVar;
        if ((196608 & i) == 0) {
        }
        if (btsVar.V(i3 & 1, (74899 & i3) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final boolean z, f530 f530Var, v2o v2oVar, ymo ymoVar, String str, final zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        v2o v2oVar2;
        int i5;
        ymo ymoVar2;
        int i6;
        final f530 f530Var3;
        final v2o v2oVar3;
        final ymo ymoVar3;
        final String str2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1448730565);
        if ((i & 6) == 0) {
            i3 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                v2oVar2 = v2oVar;
                i3 |= btsVar.k(v2oVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    ymoVar2 = ymoVar;
                    i3 |= btsVar.k(ymoVar2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i3 |= btsVar.k(str) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i3 |= btsVar.e(zlsVar) ? 131072 : 65536;
                        }
                        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                            f530 f530Var4 = i7 != 0 ? c530.a : f530Var2;
                            v2o a = i4 != 0 ? k.e(null, 3).a(k.c(null, 15)) : v2oVar2;
                            ymo a2 = i5 != 0 ? k.k(null, 15).a(k.f(null, 3)) : ymoVar2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str;
                            zx01 a0 = bvf0.a0(Boolean.valueOf(z), str3, btsVar, (i3 & 14) | ((i3 >> 9) & 112));
                            Object Q = btsVar.Q();
                            if (Q == did.a) {
                                Q = AnimatedVisibilityKt$AnimatedVisibility$1$1.w;
                                btsVar.o0(Q);
                            }
                            tls tlsVar = (tls) Q;
                            int i8 = i3 << 3;
                            v2o v2oVar4 = a;
                            f(a0, tlsVar, f530Var4, v2oVar4, a2, zlsVar, btsVar, (i8 & HProv.ALG_CLASS_ALL) | (i8 & 896) | 48 | (i8 & 7168) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
                            str2 = str3;
                            f530Var3 = f530Var4;
                            v2oVar3 = v2oVar4;
                            ymoVar3 = a2;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            v2oVar3 = v2oVar2;
                            ymoVar3 = ymoVar2;
                            str2 = str;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Number) obj2).intValue();
                                    g.e(z, f530Var3, v2oVar3, ymoVar3, str2, zlsVar, (fid) obj, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    if ((196608 & i) == 0) {
                    }
                    if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                ymoVar2 = ymoVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            v2oVar2 = v2oVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            ymoVar2 = ymoVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        v2oVar2 = v2oVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        ymoVar2 = ymoVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void f(final zx01 zx01Var, final tls tlsVar, final f530 f530Var, final v2o v2oVar, final ymo ymoVar, final zls zlsVar, fid fidVar, final int i) {
        int i2;
        v2o v2oVar2;
        ymo ymoVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1706321816);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(zx01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            v2oVar2 = v2oVar;
            i2 |= btsVar.k(v2oVar2) ? 2048 : 1024;
        } else {
            v2oVar2 = v2oVar;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            ymoVar2 = ymoVar;
            i2 |= btsVar.k(ymoVar2) ? 16384 : 8192;
        } else {
            ymoVar2 = ymoVar;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i2 |= btsVar.e(zlsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new zls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        long j;
                        androidx.compose.ui.layout.k kVar = (androidx.compose.ui.layout.k) obj;
                        final o l0 = ((x910) obj2).l0(((n8e) obj3).a);
                        if (!kVar.d0() || ((Boolean) tls.this.invoke(zx01Var.d.getValue())).booleanValue()) {
                            j = (l0.a << 32) | (l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        } else {
                            j = 0;
                        }
                        return kVar.w((int) (j >> 32), (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j), kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj4) {
                                ((o.a) obj4).g(o.this, 0, 0, 0.0f);
                                return zy11.a;
                            }
                        });
                    }
                };
                btsVar.o0(Q);
            }
            f530 F = kp50.F(f530Var, (zls) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1.w;
                btsVar.o0(Q2);
            }
            a(zx01Var, tlsVar, F, v2oVar2, ymoVar2, (wls) Q2, zlsVar, btsVar, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    g.f(zx01.this, tlsVar, f530Var, v2oVar, ymoVar, zlsVar, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final EnterExitState g(zx01 zx01Var, tls tlsVar, Object obj, fid fidVar) {
        EnterExitState enterExitState;
        bts btsVar = (bts) fidVar;
        btsVar.c0(-422486745, zx01Var);
        if (zx01Var.g()) {
            btsVar.e0(-212166497);
            btsVar.t(false);
            enterExitState = ((Boolean) tlsVar.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) tlsVar.invoke(zx01Var.c())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            btsVar.e0(-211892364);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            if (((Boolean) tlsVar.invoke(zx01Var.c())).booleanValue()) {
                oz40Var.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) tlsVar.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) oz40Var.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            btsVar.t(false);
        }
        btsVar.t(false);
        return enterExitState;
    }
}
