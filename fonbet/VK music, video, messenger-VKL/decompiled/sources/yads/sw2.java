package yads;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.yandex.div.core.DivConfiguration;
import com.yandex.mobile.ads.R$layout;
import java.util.Iterator;
import java.util.List;
import xsna.bpn0;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class sw2 implements t52 {
    public final /* synthetic */ uw2 a;

    public sw2(uw2 uw2Var) {
        this.a = uw2Var;
    }

    @Override // yads.t52
    public final void a(l4 l4Var) {
        uw2 uw2Var = this.a;
        if (uw2Var.o) {
            return;
        }
        uw2Var.m = null;
        uw2Var.n = null;
        uw2Var.a.b(l4Var);
    }

    @Override // yads.t52
    public final void a(x12 x12Var) {
        uw2 uw2Var = this.a;
        if (uw2Var.o) {
            return;
        }
        uw2Var.n = x12Var;
        uw2Var.g.post(new xsna.ep0(uw2Var, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(uw2 uw2Var) {
        x12 x12Var;
        String str;
        ve1 ve1Var;
        xm xmVar;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        v9 v9Var;
        kz kzVar;
        wm wmVar;
        DivConfiguration divConfiguration;
        hi0 hi0Var;
        Object obj;
        List list;
        gz1 gz1Var;
        List list2;
        Object obj2;
        pk1 pk1Var;
        if (!uw2Var.o) {
            v9 v9Var2 = uw2Var.m;
            km kmVar = uw2Var.a;
            wc1 wc1Var = kmVar.C;
            if (v9Var2 == null || (x12Var = uw2Var.n) == null) {
                return;
            }
            dn dnVar = uw2Var.c;
            Context context = kmVar.a;
            n32 n32Var = uw2Var.f;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = uw2Var.l;
            pi3 pi3Var = kmVar.E;
            kz kzVar2 = uw2Var.k;
            dnVar.getClass();
            e22 b = x12Var.b();
            ve1 ve1Var2 = null;
            if (b != null && (list = b.a) != null && (gz1Var = (gz1) j5g.a0(list)) != null && (list2 = gz1Var.b) != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (epx.f(((oi) obj2).a, X3.i.I0)) {
                            break;
                        }
                    }
                }
                oi oiVar = (oi) obj2;
                if (oiVar != null) {
                    Object obj3 = oiVar.c;
                    po1 po1Var = obj3 instanceof po1 ? (po1) obj3 : null;
                    if (po1Var != null && (pk1Var = po1Var.a) != null) {
                        str = pk1Var.a;
                        if (str != null) {
                            ve1Var = null;
                        } else {
                            Context applicationContext = context.getApplicationContext();
                            sf1 sf1Var = new sf1(applicationContext, gx2.a(), new ag1(applicationContext), new qf1(applicationContext));
                            ov2 ov2Var = dnVar.a;
                            pu puVar = new pu(yf0.b);
                            ve1Var = new ve1(R$layout.monetization_ads_internal_divkit, new hf1(x12Var, n32Var, puVar, new gf1(puVar), sf1Var, str, ((mv3) ov2Var).a()), new if1(v9Var2));
                        }
                        ym ymVar = dnVar.b;
                        ymVar.c.getClass();
                        if (pi0.a(context)) {
                            List d = x12Var.d();
                            if (d != null) {
                                Iterator it2 = d.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    String str2 = ((hi0) obj).a;
                                    fg0[] fg0VarArr = fg0.b;
                                    if (epx.f(str2, "ad")) {
                                        break;
                                    }
                                }
                                hi0Var = (hi0) obj;
                            } else {
                                hi0Var = null;
                            }
                            if (hi0Var != null) {
                                d4 d4Var = ymVar.a;
                                ov2 ov2Var2 = ymVar.b;
                                xmVar = new xm(hi0Var, d4Var, ov2Var2, new rh0(), new zg0(((mv3) ov2Var2).a()), new ye1());
                                if (xmVar != null) {
                                    pu puVar2 = new pu(xmVar.a.h);
                                    wm wmVar2 = new wm();
                                    bu1 a = ((mv3) xmVar.c).a();
                                    xmVar.d.getClass();
                                    zf0 a2 = rh0.a(x12Var, kzVar2, n32Var, puVar2, a);
                                    ai0 ai0Var = new ai0(puVar2);
                                    zg0 zg0Var = xmVar.e;
                                    hi0 hi0Var2 = xmVar.a;
                                    zg0Var.getClass();
                                    if (x12Var instanceof w32) {
                                        v9Var = v9Var2;
                                        jp2 jp2Var = zg0Var.a;
                                        b23 b23Var = new b23(jp2Var);
                                        w32 w32Var = (w32) x12Var;
                                        kzVar = kzVar2;
                                        wmVar = wmVar2;
                                        b23Var.e.put(hi0Var2.e, new d23(w32Var, jp2Var, hi0Var2.h, new lh0(), new kq0(), new mj(y12.a(w32Var, yh0.c))));
                                        zg0Var.b.getClass();
                                        divConfiguration = c23.a(context, b23Var, ai0Var);
                                    } else {
                                        v9Var = v9Var2;
                                        kzVar = kzVar2;
                                        wmVar = wmVar2;
                                        divConfiguration = (DivConfiguration) new bpn0(new gi0(context, ai0Var)).getValue();
                                    }
                                    onPreDrawListener = onPreDrawListener2;
                                    v9Var2 = v9Var;
                                    jy jyVar = new jy(new zh0(xmVar.a.e, new ph0(context, xmVar.b, xmVar.c, v9Var2, kzVar, wmVar, ai0Var), divConfiguration, a, "rootDivkitView", new qv0(), PsExtractor.AUDIO_STREAM), a2, new o32(x12Var.c(), pi3Var));
                                    ki0 ki0Var = new ki0(v9Var2);
                                    ye1 ye1Var = xmVar.f;
                                    int i = R$layout.monetization_ads_internal_divkit;
                                    ye1Var.getClass();
                                    ve1Var2 = new ve1(i, jyVar, ki0Var);
                                } else {
                                    onPreDrawListener = onPreDrawListener2;
                                }
                                cn cnVar = new cn(new bn(context, wc1Var, xsna.rl3.I(new ve1[]{ve1Var, ve1Var2}), onPreDrawListener));
                                uw2Var.p = cnVar;
                                cnVar.a(v9Var2.c(), new tw2(uw2Var));
                                return;
                            }
                        }
                        xmVar = null;
                        if (xmVar != null) {
                        }
                        cn cnVar2 = new cn(new bn(context, wc1Var, xsna.rl3.I(new ve1[]{ve1Var, ve1Var2}), onPreDrawListener));
                        uw2Var.p = cnVar2;
                        cnVar2.a(v9Var2.c(), new tw2(uw2Var));
                        return;
                    }
                }
            }
            str = null;
            if (str != null) {
            }
            ym ymVar2 = dnVar.b;
            ymVar2.c.getClass();
            if (pi0.a(context)) {
            }
            xmVar = null;
            if (xmVar != null) {
            }
            cn cnVar22 = new cn(new bn(context, wc1Var, xsna.rl3.I(new ve1[]{ve1Var, ve1Var2}), onPreDrawListener));
            uw2Var.p = cnVar22;
            cnVar22.a(v9Var2.c(), new tw2(uw2Var));
            return;
        }
        uw2Var.a.b(h9.f);
    }
}
