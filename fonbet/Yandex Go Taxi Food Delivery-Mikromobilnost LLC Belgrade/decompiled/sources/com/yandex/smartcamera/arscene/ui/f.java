package com.yandex.smartcamera.arscene.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.opengl.GLSurfaceView;
import android.widget.FrameLayout;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.smartcamera.arscene.ar_core.helpers.TapHelper;
import com.yandex.smartcamera.arscene.ui.f;
import defpackage.aii0;
import defpackage.an91;
import defpackage.at5;
import defpackage.b64;
import defpackage.bns;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.ctq;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g400;
import defpackage.iez;
import defpackage.jl40;
import defpackage.k200;
import defpackage.l1;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lzr;
import defpackage.m33;
import defpackage.m4m0;
import defpackage.mt71;
import defpackage.o4b1;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pey;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qxg0;
import defpackage.r1b0;
import defpackage.rzo;
import defpackage.s33;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.tls;
import defpackage.ttm;
import defpackage.udq0;
import defpackage.uh6;
import defpackage.v33;
import defpackage.vez0;
import defpackage.vmz;
import defpackage.wls;
import defpackage.wqy0;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y4h0;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class f {
    public static final void a(final g400 g400Var, v33 v33Var, final tls tlsVar, final sls slsVar, fid fidVar, final int i) {
        int i2;
        sls slsVar2;
        Activity activity;
        Object obj;
        Object obj2;
        Object obj3;
        oz40 oz40Var;
        final v33 v33Var2 = v33Var;
        m33 m33Var = g400Var.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(937892815);
        int i3 = 4;
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(g400Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(v33Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar.e(slsVar2) ? 2048 : 1024;
        } else {
            slsVar2 = slsVar;
        }
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i5 = 0;
                    final sls slsVar3 = slsVar2;
                    v.d = new wls() { // from class: h400
                        @Override // defpackage.wls
                        public final Object invoke(Object obj4, Object obj5) {
                            int i6 = i5;
                            zy11 zy11Var = zy11.a;
                            int i7 = i;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    int O = vng.O(i7 | 1);
                                    f.a(g400Var, v33Var2, tlsVar, slsVar3, (fid) obj4, O);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    int O2 = vng.O(i7 | 1);
                                    f.a(g400Var, v33Var2, tlsVar, slsVar3, (fid) obj4, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            Object Q = btsVar.Q();
            Object obj4 = did.a;
            if (Q == obj4) {
                Q = androidx.compose.runtime.f.j(Boolean.TRUE);
                btsVar.o0(Q);
            }
            oz40 oz40Var2 = (oz40) Q;
            Object Q2 = btsVar.Q();
            Object obj5 = Q2;
            if (Q2 == obj4) {
                l1 l1Var = new l1(activity);
                l1Var.x = new vmz(i3, activity, tlsVar);
                l1Var.y = new iez(12);
                btsVar.o0(l1Var);
                obj5 = l1Var;
            }
            l1 l1Var2 = (l1) obj5;
            Object Q3 = btsVar.Q();
            Object obj6 = Q3;
            if (Q3 == obj4) {
                GLSurfaceView gLSurfaceView = new GLSurfaceView(activity);
                gLSurfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                btsVar.o0(gLSurfaceView);
                obj6 = gLSurfaceView;
            }
            GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj6;
            Object Q4 = btsVar.Q();
            Object obj7 = Q4;
            if (Q4 == obj4) {
                TapHelper tapHelper = new TapHelper(activity);
                gLSurfaceView2.setOnTouchListener(tapHelper);
                btsVar.o0(tapHelper);
                obj7 = tapHelper;
            }
            TapHelper tapHelper2 = (TapHelper) obj7;
            Object Q5 = btsVar.Q();
            if (Q5 == obj4) {
                Activity activity2 = activity;
                Object s33Var = new s33(activity2, l1Var2, tapHelper2, m33Var, tlsVar, slsVar, new ttm(i3, oz40Var2));
                obj2 = tapHelper2;
                obj = l1Var2;
                obj3 = activity2;
                btsVar.o0(s33Var);
                Q5 = s33Var;
            } else {
                obj = l1Var2;
                obj2 = tapHelper2;
                obj3 = activity;
            }
            s33 s33Var2 = (s33) Q5;
            g400Var.b = s33Var2;
            Object lifecycle = ((pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            boolean e = btsVar.e(s33Var2) | btsVar.e(g400Var);
            Object Q6 = btsVar.Q();
            if (e || Q6 == obj4) {
                Q6 = new MainCameraScreenKt$MainCameraScreen$1$1(s33Var2, g400Var, null);
                btsVar.o0(Q6);
            }
            zpn.e(btsVar, (wls) Q6, m33Var);
            boolean e2 = btsVar.e(gLSurfaceView2) | btsVar.e(s33Var2) | btsVar.e(obj3) | btsVar.e(obj2) | btsVar.e(lifecycle) | btsVar.e(obj);
            Object Q7 = btsVar.Q();
            if (e2 || Q7 == obj4) {
                oz40Var = oz40Var2;
                Object at5Var = new at5(gLSurfaceView2, s33Var2, obj3, obj2, lifecycle, obj, 6);
                btsVar.o0(at5Var);
                Q7 = at5Var;
            } else {
                oz40Var = oz40Var2;
            }
            zpn.a(zy11.a, (tls) Q7, btsVar);
            boolean e3 = btsVar.e(gLSurfaceView2);
            Object Q8 = btsVar.Q();
            if (e3 || Q8 == obj4) {
                Q8 = new k200(i4, gLSurfaceView2);
                btsVar.o0(Q8);
            }
            v33Var2 = v33Var;
            androidx.compose.ui.viewinterop.b.a((tls) Q8, ljs0.c, null, btsVar, 48, 4);
            g.e(((Boolean) oz40Var.getValue()).booleanValue(), null, k.e(null, 3), k.f(null, 3), null, wwg.S(-597967705, true, new ctq(21, v33Var2), btsVar), btsVar, 200064, 18);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i6 = 1;
            v2.d = new wls() { // from class: h400
                @Override // defpackage.wls
                public final Object invoke(Object obj42, Object obj52) {
                    int i62 = i6;
                    zy11 zy11Var = zy11.a;
                    int i7 = i;
                    switch (i62) {
                        case 0:
                            ((Integer) obj52).getClass();
                            int O = vng.O(i7 | 1);
                            f.a(g400Var, v33Var2, tlsVar, slsVar, (fid) obj42, O);
                            break;
                        default:
                            ((Integer) obj52).getClass();
                            int O2 = vng.O(i7 | 1);
                            f.a(g400Var, v33Var2, tlsVar, slsVar, (fid) obj42, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void b(v33 v33Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1992643830);
        if ((((btsVar.k(v33Var) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 b = m4m0.b(ljs0.c, rzo.f(2147483648L), qke.q);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            c530 c530Var = c530.a;
            o4b1.b(mt71.m(qxg0.smart_camera_ar_no_plane_image, 0, btsVar), null, ljs0.e(ljs0.q(c530Var, 265.0f), 93.0f), null, null, 0.0f, null, btsVar, 432, 120);
            oeb1.c(btsVar, ljs0.e(c530Var, 23.0f));
            wqy0.b(v33Var.a, an91.m(c530Var, 42.0f, 0.0f, 2), ldc.f, uh6.E(16), null, lzr.b, udq0.a(vez0.a(y4h0.ys_text_regular, null, 0, 14)), 0L, null, new sjy0(3), uh6.E(19), 0, false, 0, 0, null, null, btsVar, 200112, 6, 129424);
            btsVar = btsVar;
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(v33Var, i, 21);
        }
    }
}
