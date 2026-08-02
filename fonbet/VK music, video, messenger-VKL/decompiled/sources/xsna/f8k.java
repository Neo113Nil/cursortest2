package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f8k implements yzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f8k(ControlsState.b bVar, izs izsVar, izs izsVar2) {
        this.d = bVar;
        this.c = izsVar;
        this.e = izsVar2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mtk0 mtk0Var = (mtk0) this.d;
                mtk0 mtk0Var2 = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1303066653, intValue, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewContentView.<anonymous>.<anonymous> (CreateMarketItemReviewContentView.kt:132)");
                }
                boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) mtk0Var2.getValue()).booleanValue();
                izs izsVar = this.c;
                boolean J = aVar.J(izsVar);
                Object x = aVar.x();
                Object obj4 = a.C0011a.a;
                if (J || x == obj4) {
                    x = new h8k(izsVar, 0);
                    aVar.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean J2 = aVar.J(izsVar);
                Object x2 = aVar.x();
                if (J2 || x2 == obj4) {
                    x2 = new k74(izsVar, 4);
                    aVar.R(x2);
                }
                ahg0.a(booleanValue, booleanValue2, true, gzsVar, (gzs) x2, null, "sendReviewButton", aVar, 1573248);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                dlv0 dlv0Var = (dlv0) this.d;
                s7k0 s7k0Var = (s7k0) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1138546294, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerScaffold.<anonymous> (RadioBigPlayerScaffold.kt:36)");
                    }
                    d4b0.a(dlv0Var, s7k0Var.a, null, this.c, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ControlsState.b bVar = (ControlsState.b) this.d;
                izs izsVar2 = (izs) this.e;
                dqj dqjVar = (dqj) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                a.d dVar = dqjVar.c;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(dqjVar) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(596921345, intValue3, -1, "com.vk.fullscreenvideo.top.MainControlsButtons.<anonymous> (TopControls.kt:387)");
                    }
                    boolean f = epx.f(dVar, a.d.i.a);
                    ControlsState.c cVar = bVar.n;
                    eqj eqjVar = new eqj(cVar.c == ControlsState.Like.LIKED, cVar.h, null);
                    String b = ods0.b(dVar);
                    q630 q630Var = q630.a.a;
                    q630 q = txj0.q(ahn.E(q630Var, b), 48);
                    if (f) {
                        aVar3.K(1719801039);
                        izs izsVar3 = this.c;
                        boolean J3 = aVar3.J(izsVar3);
                        Object x3 = aVar3.x();
                        if (J3 || x3 == a.C0011a.a) {
                            x3 = new opd(izsVar3, 6);
                            aVar3.R(x3);
                        }
                        q630Var = egi.o(q630Var, (izs) x3);
                        aVar3.j();
                    } else {
                        aVar3.K(1720041537);
                        aVar3.j();
                    }
                    bqj.a(dqjVar, izsVar2, q.g(q630Var), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, eqjVar, null, aVar3, intValue3 & 14, 88);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ f8k(izs izsVar, wh50 wh50Var, wh50 wh50Var2) {
        this.c = izsVar;
        this.d = wh50Var;
        this.e = wh50Var2;
    }

    public /* synthetic */ f8k(dlv0 dlv0Var, s7k0 s7k0Var, izs izsVar) {
        this.d = dlv0Var;
        this.e = s7k0Var;
        this.c = izsVar;
    }
}
