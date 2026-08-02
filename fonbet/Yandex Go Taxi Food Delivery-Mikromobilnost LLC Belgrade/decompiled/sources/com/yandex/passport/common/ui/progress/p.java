package com.yandex.passport.common.ui.progress;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.google.ar.core.ImageMetadata;
import com.yandex.passport.common.ui.view.CommonSpinner;
import defpackage.agc;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bgc;
import defpackage.bts;
import defpackage.c530;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dgc;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rfc;
import defpackage.rzo;
import defpackage.sls;
import defpackage.sz40;
import defpackage.tbn;
import defpackage.tls;
import defpackage.ubn;
import defpackage.uc20;
import defpackage.unr0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public abstract class p {
    public static final void a(f530 f530Var, final boolean z, fid fidVar, final int i) {
        int i2;
        final f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1000886874);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            final long j = ((agc) btsVar.m(dgc.a)).a;
            btsVar.e0(-705757308);
            boolean d = ((i2 & 14) == 4) | btsVar.d(j);
            Object Q = btsVar.Q();
            if (d || Q == did.a) {
                Q = new tls() { // from class: com.yandex.passport.common.ui.progress.m
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        CommonSpinner commonSpinner = new CommonSpinner((Context) obj);
                        commonSpinner.setColor(rzo.X(z ? ldc.f : j));
                        commonSpinner.startAnimation();
                        return commonSpinner;
                    }
                };
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530Var2 = f530Var;
            androidx.compose.ui.viewinterop.b.a((tls) Q, f530Var2, null, btsVar, i2 & 112, 4);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: com.yandex.passport.common.ui.progress.n
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    p.a(f530Var2, z, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(final int i, final f530 f530Var, sls slsVar, int i2, fid fidVar, final int i3, final int i4) {
        int i5;
        final sls slsVar2;
        final int i6;
        final sls slsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(785323946);
        if ((i3 & 6) == 0) {
            i5 = (btsVar.c(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar.c(i2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            slsVar3 = slsVar;
            i6 = i2;
        } else {
            o430 o430Var = did.a;
            if (i7 != 0) {
                btsVar.e0(-1507492642);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new bgc(12);
                    btsVar.o0(Q);
                }
                slsVar2 = (sls) Q;
                btsVar.t(false);
            } else {
                slsVar2 = slsVar;
            }
            final int i9 = i8 != 0 ? -1 : i2;
            btsVar.e0(-1507489519);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new AnimatorListenerAdapter() { // from class: com.yandex.passport.common.ui.progress.ProgressScreenKt$LottieSpinner$animatorListener$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        sls.this.invoke();
                    }
                };
                btsVar.o0(Q2);
            }
            final ProgressScreenKt$LottieSpinner$animatorListener$1$1 progressScreenKt$LottieSpinner$animatorListener$1$1 = (ProgressScreenKt$LottieSpinner$animatorListener$1$1) Q2;
            btsVar.t(false);
            btsVar.e0(-1507481527);
            boolean z = ((i5 & 7168) == 2048) | ((i5 & 14) == 4);
            Object Q3 = btsVar.Q();
            if (z || Q3 == o430Var) {
                Q3 = new tls() { // from class: com.yandex.passport.common.ui.progress.k
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        LottieAnimationView lottieAnimationView = new LottieAnimationView((Context) obj);
                        lottieAnimationView.setRepeatCount(i9);
                        lottieAnimationView.setAnimation(i);
                        lottieAnimationView.playAnimation();
                        lottieAnimationView.addAnimatorListener(progressScreenKt$LottieSpinner$animatorListener$1$1);
                        return lottieAnimationView;
                    }
                };
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            androidx.compose.ui.viewinterop.b.a((tls) Q3, f530Var, null, btsVar, i5 & 112, 4);
            i6 = i9;
            slsVar3 = slsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: com.yandex.passport.common.ui.progress.l
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.b(i, f530Var, slsVar3, i6, (fid) obj, vng.O(i3 | 1), i4);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(final g gVar, final f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        c cVar = gVar.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1683861310);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(gVar) : btsVar.e(gVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 f530Var2 = c530.a;
            if (i4 != 0) {
                f530Var = f530Var2;
            }
            boolean z = ((com.yandex.passport.common.ui.compose.theme.b) btsVar.m(com.yandex.passport.common.ui.compose.theme.e.d)).a;
            boolean z2 = ((com.yandex.passport.common.ui.compose.theme.f) btsVar.m(com.yandex.passport.common.ui.compose.theme.e.e)).a;
            btsVar.e0(452426859);
            u uVar = gVar.b;
            if (uVar instanceof q) {
                q qVar = (q) uVar;
                f530Var2 = ljs0.n(f530Var2, (int) (qVar.a / uc20.a().density), (int) (qVar.b / uc20.a().density));
            } else if (uVar.equals(r.a)) {
                f530Var2 = cVar instanceof a ? ljs0.r(ljs0.e(f530Var2, 50.0f), 50.0f, 70.0f) : ljs0.n(f530Var2, 50.0f, 50.0f);
            } else if (uVar.equals(s.a)) {
                f530Var2 = ljs0.c;
            } else if (!uVar.equals(t.a)) {
                w511.b();
                return;
            }
            f530 k = f530Var.k(f530Var2);
            btsVar.t(false);
            e(cVar, z2, z, k, btsVar, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: com.yandex.passport.common.ui.progress.i
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    p.c(g.this, f530Var, (fid) obj, O, i2);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(f530 f530Var, g gVar, boolean z, fid fidVar, final int i, final int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        pa90 rfcVar;
        int i5;
        g gVar2 = gVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(357759865);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? btsVar.k(gVar2) : btsVar.e(gVar2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            }
            i5 = 16;
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 256 : 128;
            if ((i3 & 147) == 146 || !btsVar.E()) {
                btsVar.a0();
                i4 = i & 1;
                c530 c530Var = c530.a;
                if (i4 != 0 || btsVar.C()) {
                    if (i6 != 0) {
                        f530Var2 = c530Var;
                    }
                    if ((i2 & 2) != 0) {
                        gVar2 = new g(new a(0), r.a, e.a, true);
                        i3 &= -113;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                } else {
                    btsVar.Y();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                }
                btsVar.u();
                f530 k = f530Var2.k(ljs0.c);
                btsVar.e0(-1966252872);
                if (z2) {
                    rfcVar = new rfc(ldc.l);
                } else if (gVar2.c instanceof d) {
                    btsVar.e0(-824199267);
                    rfcVar = mt71.m(((d) gVar2.c).a(), 0, btsVar);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-824084567);
                    rfcVar = new rfc(((agc) btsVar.m(dgc.a)).n);
                    btsVar.t(false);
                }
                pa90 pa90Var = rfcVar;
                btsVar.t(false);
                f530 j0 = cma1.j0(k, pa90Var, null, mhe.g, 0.0f, null, 54);
                z910 d = pi6.d(x4c.y, false);
                int S = cma1.S(btsVar);
                r1b0 o = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, j0);
                ohd.G1.getClass();
                sls slsVar = androidx.compose.ui.node.d.b;
                if (btsVar.a != null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, androidx.compose.ui.node.d.f, d);
                qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                wls wlsVar = androidx.compose.ui.node.d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                    b64.z(S, btsVar, S, wlsVar);
                }
                qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
                c(gVar2, c530Var, btsVar, ((i3 >> 3) & 14) | 48, 0);
                btsVar.t(true);
            } else {
                btsVar.Y();
            }
            final g gVar3 = gVar2;
            aii0 v = btsVar.v();
            if (v != null) {
                final f530 f530Var3 = f530Var2;
                final boolean z3 = z2;
                v.d = new wls() { // from class: com.yandex.passport.common.ui.progress.h
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.d(f530.this, gVar3, z3, (fid) obj, vng.O(i | 1), i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 147) == 146) {
        }
        btsVar.a0();
        i4 = i & 1;
        c530 c530Var2 = c530.a;
        if (i4 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i7 != 0) {
        }
        btsVar.u();
        f530 k2 = f530Var2.k(ljs0.c);
        btsVar.e0(-1966252872);
        if (z2) {
        }
        pa90 pa90Var2 = rfcVar;
        btsVar.t(false);
        f530 j02 = cma1.j0(k2, pa90Var2, null, mhe.g, 0.0f, null, 54);
        z910 d3 = pi6.d(x4c.y, false);
        int S2 = cma1.S(btsVar);
        r1b0 o2 = btsVar.o();
        f530 d22 = androidx.compose.ui.b.d(btsVar, j02);
        ohd.G1.getClass();
        sls slsVar2 = androidx.compose.ui.node.d.b;
        if (btsVar.a != null) {
        }
    }

    public static final void e(final c cVar, final boolean z, final boolean z2, final f530 f530Var, fid fidVar, final int i) {
        sz40 sz40Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-600838773);
        int i2 = i | (btsVar.k(cVar) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.a(z2) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            Object[] objArr = new Object[0];
            btsVar.e0(1223396711);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new com.yandex.passport.common.network.a(3);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            oz40 oz40Var = (oz40) cvw.V(objArr, (sls) Q, btsVar, 48);
            btsVar.e0(1223398491);
            boolean k = ((i2 & 14) == 4) | btsVar.k(oz40Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ProgressScreenKt$ProgressSpinner$1$1(cVar, oz40Var, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            zy11 zy11Var = zy11.a;
            zpn.e(btsVar, (wls) Q2, zy11Var);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                if (cVar instanceof a) {
                    btsVar.e0(-729024182);
                    btsVar.e0(1223408696);
                    Object Q3 = btsVar.Q();
                    if (Q3 == o430Var) {
                        Q3 = new sz40(Boolean.FALSE);
                        btsVar.o0(Q3);
                    }
                    sz40 sz40Var2 = (sz40) Q3;
                    btsVar.t(false);
                    btsVar.e0(1223412125);
                    if (z) {
                        sz40Var = sz40Var2;
                    } else {
                        btsVar.e0(1223412613);
                        boolean e = btsVar.e(sz40Var2);
                        Object Q4 = btsVar.Q();
                        if (e || Q4 == o430Var) {
                            Q4 = new ProgressScreenKt$ProgressSpinner$2$1(sz40Var2, null);
                            btsVar.o0(Q4);
                        }
                        btsVar.t(false);
                        zpn.e(btsVar, (wls) Q4, zy11Var);
                        tbn tbnVar = ubn.d;
                        ck11 ck11Var = new ck11(1000, 0, tbnVar);
                        ck11 ck11Var2 = new ck11(500, 0, tbnVar);
                        sz40Var = sz40Var2;
                        androidx.compose.animation.g.c(sz40Var, null, androidx.compose.animation.k.e(ck11Var, 2), androidx.compose.animation.k.f(ck11Var2, 2), null, wwg.S(-1567232431, true, new o(z2, f530Var, sz40Var2), btsVar), btsVar, ImageMetadata.EDGE_MODE, 18);
                    }
                    btsVar.t(false);
                    if (sz40Var.a() && !((Boolean) sz40Var.b.getValue()).booleanValue()) {
                        a(f530Var, z2, btsVar, (i2 >> 6) & HProv.PP_DELETE_SAVED_PASSWD);
                    }
                    btsVar.t(false);
                } else {
                    if (!(cVar instanceof b)) {
                        throw unr0.y(1223407029, btsVar, false);
                    }
                    btsVar.e0(-727183371);
                    b(((b) cVar).a(), f530Var, null, 0, btsVar, (i2 >> 6) & 112, 12);
                    btsVar.t(false);
                }
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(z, z2, f530Var, i) { // from class: com.yandex.passport.common.ui.progress.j
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ f530 w;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    p.e(c.this, this.b, this.c, this.w, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }
}
