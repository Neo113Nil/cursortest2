package com.yandex.go.multimodal_route.ui.rate_route;

import android.content.Context;
import com.yandex.go.multimodal_route.interactors.i;
import defpackage.agd;
import defpackage.bgd;
import defpackage.bms;
import defpackage.bts;
import defpackage.d130;
import defpackage.did;
import defpackage.fid;
import defpackage.iv40;
import defpackage.jv40;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.rol0;
import defpackage.rv40;
import defpackage.sls;
import defpackage.sv40;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.tv40;
import defpackage.uv40;
import defpackage.uyj;
import defpackage.vv40;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xfd;
import defpackage.yfd;
import defpackage.yqb1;
import defpackage.yu40;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final class e extends pgd {
    public final Context F;
    public final d130 G;
    public final yu40 H;
    public final i I;
    public final mu5 J;

    public e(final g gVar, final f fVar, Context context, d130 d130Var, yu40 yu40Var, i iVar) {
        super(0);
        this.F = context;
        this.G = d130Var;
        this.H = yu40Var;
        this.I = iVar;
        this.J = new mu5(new tls() { // from class: com.yandex.go.multimodal_route.ui.rate_route.b
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final e eVar = e.this;
                final jv40 jv40Var = new jv40(eVar);
                String str = ((iv40) ((agd) yfdVar).a).a;
                agd agdVar = (agd) yfdVar;
                String str2 = ((iv40) agdVar.a).b;
                g gVar2 = gVar;
                agdVar.c = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.m(new rol0(new MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$1(gVar2, str, null)), gVar2.a.b, gVar2.b.b, gVar2.c.b, new MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2(gVar2, str, str2, null)), new MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$$inlined$start$1(null, gVar2))), uyj.a);
                final f fVar2 = fVar;
                agdVar.e = new tls() { // from class: com.yandex.go.multimodal_route.ui.rate_route.c
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(e.this.o(), null, null, new MultimodalRoutesRateScreenRouter$content$1$1$1(fVar2, yfdVar, (rv40) obj2, jv40Var, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.g = new androidx.compose.runtime.internal.a(1257476131, new bms() { // from class: com.yandex.go.multimodal_route.ui.rate_route.d
                    @Override // defpackage.bms
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        xfd xfdVar = (xfd) obj2;
                        vv40 vv40Var = (vv40) obj3;
                        fid fidVar = (fid) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 6) == 0) {
                            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(vv40Var) : fidVar.e(vv40Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        if (!btsVar.V(i & 1, (i & 147) != 146)) {
                            btsVar.Y();
                        } else if ((vv40Var instanceof sv40) || (vv40Var instanceof uv40)) {
                            btsVar.e0(766797792);
                            yqb1.c(vv40Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
                            btsVar.t(false);
                        } else if (vv40Var instanceof tv40) {
                            btsVar.e0(1548759839);
                            e eVar2 = e.this;
                            boolean e = btsVar.e(eVar2);
                            Object Q = btsVar.Q();
                            if (e || Q == did.a) {
                                MultimodalRoutesRateScreenRouter$content$1$2$1$1 multimodalRoutesRateScreenRouter$content$1$2$1$1 = new MultimodalRoutesRateScreenRouter$content$1$2$1$1(0, eVar2, e.class, "goBackAndClear", "goBackAndClear()V", 0);
                                btsVar.o0(multimodalRoutesRateScreenRouter$content$1$2$1$1);
                                Q = multimodalRoutesRateScreenRouter$content$1$2$1$1;
                            }
                            zpn.i((sls) ((tfx) Q), btsVar);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(766950591);
                            btsVar.t(false);
                        }
                        return zy11.a;
                    }
                }, true);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new MultimodalRoutesRateScreenRouter$onLaunch$1(this, (iv40) obj, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
