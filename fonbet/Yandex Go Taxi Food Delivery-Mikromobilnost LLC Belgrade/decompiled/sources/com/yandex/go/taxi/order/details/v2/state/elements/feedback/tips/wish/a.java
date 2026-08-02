package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector$Content$ContentAnimation;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector$Content$ContentImage;
import com.yandex.go.taxi.order.models.api.response.v6;
import com.yandex.go.taxi.order.models.api.response.w6;
import defpackage.bdc;
import defpackage.dg4;
import defpackage.evu0;
import defpackage.fef;
import defpackage.g92;
import defpackage.gg4;
import defpackage.gpk0;
import defpackage.hg4;
import defpackage.ijk0;
import defpackage.ipk0;
import defpackage.irs0;
import defpackage.kdc;
import defpackage.lbk0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.opk0;
import defpackage.pdc;
import defpackage.pfk0;
import defpackage.rol0;
import defpackage.s6k0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sue0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tvi0;
import defpackage.uck0;
import defpackage.ufu;
import defpackage.ug2;
import defpackage.uyj;
import defpackage.vck0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.yjk0;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.a b;
    public final gpk0 c;
    public final s6k0 d;
    public final pfk0 e;
    public final sue0 f;
    public final opk0 g;
    public final c h;
    public final pdc i;
    public final irs0 j;
    public final lbk0 k;

    public a(o2y0 o2y0Var, com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar, gpk0 gpk0Var, s6k0 s6k0Var, pfk0 pfk0Var, sue0 sue0Var, opk0 opk0Var, c cVar, pdc pdcVar, irs0 irs0Var, lbk0 lbk0Var) {
        this.a = o2y0Var;
        this.b = aVar;
        this.c = gpk0Var;
        this.d = s6k0Var;
        this.e = pfk0Var;
        this.f = sue0Var;
        this.g = opk0Var;
        this.h = cVar;
        this.i = pdcVar;
        this.j = irs0Var;
        this.k = lbk0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a9, code lost:
    
        if (r2 == r7) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector, fef fefVar, ContinuationImpl continuationImpl) {
        RideCardTipsWishSelectorItemDataSource$stateFlow$1 rideCardTipsWishSelectorItemDataSource$stateFlow$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        fef fefVar2;
        Object i2;
        CharSequence charSequence;
        RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector2;
        tpr I;
        boolean z;
        Object g92Var;
        RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector3;
        CharSequence charSequence2;
        CharSequence charSequence3;
        hg4 hg4Var;
        RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector4 = rideCardItemDto$TipsWishSelector;
        if (continuationImpl instanceof RideCardTipsWishSelectorItemDataSource$stateFlow$1) {
            rideCardTipsWishSelectorItemDataSource$stateFlow$1 = (RideCardTipsWishSelectorItemDataSource$stateFlow$1) continuationImpl;
            int i3 = rideCardTipsWishSelectorItemDataSource$stateFlow$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardTipsWishSelectorItemDataSource$stateFlow$1.label = i3 - Integer.MIN_VALUE;
                RideCardTipsWishSelectorItemDataSource$stateFlow$1 rideCardTipsWishSelectorItemDataSource$stateFlow$12 = rideCardTipsWishSelectorItemDataSource$stateFlow$1;
                Object obj = rideCardTipsWishSelectorItemDataSource$stateFlow$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardTipsWishSelectorItemDataSource$stateFlow$12.label;
                c cVar = this.h;
                if (i != 0) {
                    b.b(obj);
                    if (!ijk0.b(rideCardItemDto$TipsWishSelector4) || rideCardItemDto$TipsWishSelector4.j.isEmpty()) {
                        return new g92(2, new yjk0(rideCardItemDto$TipsWishSelector4.a));
                    }
                    this.b.d();
                    FormattedText formattedText = rideCardItemDto$TipsWishSelector4.d;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$0 = rideCardItemDto$TipsWishSelector4;
                    fefVar2 = fefVar;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$1 = fefVar2;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.label = 1;
                    obj = c.i(cVar, formattedText, null, rideCardTipsWishSelectorItemDataSource$stateFlow$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            I = (tpr) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$6;
                            hg4 hg4Var2 = (hg4) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$4;
                            CharSequence charSequence4 = (CharSequence) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$3;
                            charSequence2 = (CharSequence) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$2;
                            RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector5 = (RideCardItemDto$TipsWishSelector) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$0;
                            b.b(obj);
                            charSequence3 = charSequence4;
                            rideCardItemDto$TipsWishSelector3 = rideCardItemDto$TipsWishSelector5;
                            hg4Var = hg4Var2;
                            return e.n(I, e.t((tpr) obj), e.t(com.yandex.go.coroutines.b.d(new rol0(new RideCardTipsWishSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1(rideCardItemDto$TipsWishSelector3.i, this, null)), new RideCardTipsWishSelectorItemDataSource$stateFlow$$inlined$start$1(null, null))), new RideCardTipsWishSelectorItemDataSource$stateFlow$2(rideCardItemDto$TipsWishSelector3, charSequence2, charSequence3, hg4Var, null));
                        }
                        CharSequence charSequence5 = (CharSequence) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$2;
                        fefVar2 = (fef) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$1;
                        rideCardItemDto$TipsWishSelector2 = (RideCardItemDto$TipsWishSelector) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$0;
                        b.b(obj);
                        charSequence = charSequence5;
                        CharSequence charSequence6 = (CharSequence) obj;
                        RideCardItemDto$TipsWishSelector.Background background = rideCardItemDto$TipsWishSelector2.f;
                        String str = background == null ? background.a : null;
                        ufu ufuVar = (ufu) this.i;
                        kdc b = ufuVar.b(str);
                        hg4 dg4Var = b == null ? new dg4(b) : gg4.a;
                        RideCardItemDto$TipsWishSelector.Style style = (RideCardItemDto$TipsWishSelector.Style) kotlin.collections.a.R(rideCardItemDto$TipsWishSelector2.h);
                        List g = scc.g(new vck0(ufuVar.h(new bdc(xng0.textOnControl), style == null ? style.b : null), ufuVar.a(new bdc(xng0.controlMain), style == null ? style.c : null)), new uck0(new bdc(xng0.textMain), new bdc(xng0.bgMain)));
                        RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector6 = rideCardItemDto$TipsWishSelector2;
                        I = e.I(e.t(e.I(this.a.a(), new RideCardTipsWishSelectorItemDataSource$getElementsFlow$1(2, null))), new RideCardTipsWishSelectorItemDataSource$getElementsFlow$2(this, rideCardItemDto$TipsWishSelector6, fefVar2, g, null));
                        w6 w6Var = rideCardItemDto$TipsWishSelector6.g;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$0 = rideCardItemDto$TipsWishSelector6;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$1 = null;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$2 = charSequence;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$3 = charSequence6;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$4 = dg4Var;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$5 = null;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$6 = I;
                        rideCardTipsWishSelectorItemDataSource$stateFlow$12.label = 3;
                        gpk0 gpk0Var = this.c;
                        gpk0Var.getClass();
                        z = w6Var instanceof RideCardItemDto$TipsWishSelector$Content$ContentImage;
                        ipk0 ipk0Var = ipk0.a;
                        if (!z) {
                            String str2 = ((RideCardItemDto$TipsWishSelector$Content$ContentImage) w6Var).a.c;
                            if (str2 == null || evu0.J(str2)) {
                                g92Var = new g92(2, ipk0Var);
                            } else {
                                gpk0Var.a.getClass();
                                sjh sjhVar = uyj.a;
                                g92Var = tje.k0(mdh.b, new RideCardTipsWishContentDataSource$tryLoadImage$2(gpk0Var, str2, null), rideCardTipsWishSelectorItemDataSource$stateFlow$12);
                            }
                        } else if (w6Var instanceof RideCardItemDto$TipsWishSelector$Content$ContentAnimation) {
                            ug2 ug2Var = ((RideCardItemDto$TipsWishSelector$Content$ContentAnimation) w6Var).a;
                            tvi0 tvi0Var = ug2Var instanceof tvi0 ? (tvi0) ug2Var : null;
                            String str3 = tvi0Var != null ? tvi0Var.a : null;
                            g92Var = (str3 == null || evu0.J(str3)) ? new g92(2, ipk0Var) : new rol0(new RideCardTipsWishContentDataSource$tryLoadAnimation$1(gpk0Var, str3, null));
                        } else {
                            if (!(w6Var instanceof v6) && w6Var != null) {
                                w511.b();
                                return null;
                            }
                            g92Var = new g92(2, ipk0Var);
                        }
                        if (g92Var != coroutineSingletons) {
                            rideCardItemDto$TipsWishSelector3 = rideCardItemDto$TipsWishSelector6;
                            obj = g92Var;
                            charSequence2 = charSequence;
                            charSequence3 = charSequence6;
                            hg4Var = dg4Var;
                            return e.n(I, e.t((tpr) obj), e.t(com.yandex.go.coroutines.b.d(new rol0(new RideCardTipsWishSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1(rideCardItemDto$TipsWishSelector3.i, this, null)), new RideCardTipsWishSelectorItemDataSource$stateFlow$$inlined$start$1(null, null))), new RideCardTipsWishSelectorItemDataSource$stateFlow$2(rideCardItemDto$TipsWishSelector3, charSequence2, charSequence3, hg4Var, null));
                        }
                        return coroutineSingletons;
                    }
                    fef fefVar3 = (fef) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$1;
                    RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector7 = (RideCardItemDto$TipsWishSelector) rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$0;
                    b.b(obj);
                    fefVar2 = fefVar3;
                    rideCardItemDto$TipsWishSelector4 = rideCardItemDto$TipsWishSelector7;
                }
                CharSequence charSequence7 = (CharSequence) obj;
                FormattedText formattedText2 = rideCardItemDto$TipsWishSelector4.e;
                rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$0 = rideCardItemDto$TipsWishSelector4;
                rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$1 = fefVar2;
                rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$2 = charSequence7;
                rideCardTipsWishSelectorItemDataSource$stateFlow$12.label = 2;
                i2 = c.i(cVar, formattedText2, null, rideCardTipsWishSelectorItemDataSource$stateFlow$12, 30);
                if (i2 != coroutineSingletons) {
                    charSequence = charSequence7;
                    obj = i2;
                    rideCardItemDto$TipsWishSelector2 = rideCardItemDto$TipsWishSelector4;
                    CharSequence charSequence62 = (CharSequence) obj;
                    RideCardItemDto$TipsWishSelector.Background background2 = rideCardItemDto$TipsWishSelector2.f;
                    if (background2 == null) {
                    }
                    ufu ufuVar2 = (ufu) this.i;
                    kdc b2 = ufuVar2.b(str);
                    if (b2 == null) {
                    }
                    RideCardItemDto$TipsWishSelector.Style style2 = (RideCardItemDto$TipsWishSelector.Style) kotlin.collections.a.R(rideCardItemDto$TipsWishSelector2.h);
                    List g2 = scc.g(new vck0(ufuVar2.h(new bdc(xng0.textOnControl), style2 == null ? style2.b : null), ufuVar2.a(new bdc(xng0.controlMain), style2 == null ? style2.c : null)), new uck0(new bdc(xng0.textMain), new bdc(xng0.bgMain)));
                    RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector62 = rideCardItemDto$TipsWishSelector2;
                    I = e.I(e.t(e.I(this.a.a(), new RideCardTipsWishSelectorItemDataSource$getElementsFlow$1(2, null))), new RideCardTipsWishSelectorItemDataSource$getElementsFlow$2(this, rideCardItemDto$TipsWishSelector62, fefVar2, g2, null));
                    w6 w6Var2 = rideCardItemDto$TipsWishSelector62.g;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$0 = rideCardItemDto$TipsWishSelector62;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$1 = null;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$2 = charSequence;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$3 = charSequence62;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$4 = dg4Var;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$5 = null;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.L$6 = I;
                    rideCardTipsWishSelectorItemDataSource$stateFlow$12.label = 3;
                    gpk0 gpk0Var2 = this.c;
                    gpk0Var2.getClass();
                    z = w6Var2 instanceof RideCardItemDto$TipsWishSelector$Content$ContentImage;
                    ipk0 ipk0Var2 = ipk0.a;
                    if (!z) {
                    }
                    if (g92Var != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        rideCardTipsWishSelectorItemDataSource$stateFlow$1 = new RideCardTipsWishSelectorItemDataSource$stateFlow$1(this, continuationImpl);
        RideCardTipsWishSelectorItemDataSource$stateFlow$1 rideCardTipsWishSelectorItemDataSource$stateFlow$122 = rideCardTipsWishSelectorItemDataSource$stateFlow$1;
        Object obj2 = rideCardTipsWishSelectorItemDataSource$stateFlow$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardTipsWishSelectorItemDataSource$stateFlow$122.label;
        c cVar2 = this.h;
        if (i != 0) {
        }
        CharSequence charSequence72 = (CharSequence) obj2;
        FormattedText formattedText22 = rideCardItemDto$TipsWishSelector4.e;
        rideCardTipsWishSelectorItemDataSource$stateFlow$122.L$0 = rideCardItemDto$TipsWishSelector4;
        rideCardTipsWishSelectorItemDataSource$stateFlow$122.L$1 = fefVar2;
        rideCardTipsWishSelectorItemDataSource$stateFlow$122.L$2 = charSequence72;
        rideCardTipsWishSelectorItemDataSource$stateFlow$122.label = 2;
        i2 = c.i(cVar2, formattedText22, null, rideCardTipsWishSelectorItemDataSource$stateFlow$122, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
