package defpackage;

import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class l8a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChargersOfferModalView b;

    public /* synthetic */ l8a(ChargersOfferModalView chargersOfferModalView, int i) {
        this.a = i;
        this.b = chargersOfferModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 chargersOfferBottomComponent$lambda$0;
        zy11 onAttachedToWindow$lambda$2;
        zy11 renderSuccess$lambda$3;
        int i = this.a;
        ChargersOfferModalView chargersOfferModalView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = ChargersOfferModalView.insetsType$lambda$0(chargersOfferModalView, (t1w) obj);
                return insetsType$lambda$0;
            case 1:
                chargersOfferBottomComponent$lambda$0 = ChargersOfferModalView.chargersOfferBottomComponent$lambda$0(chargersOfferModalView, (uj9) obj);
                return chargersOfferBottomComponent$lambda$0;
            case 2:
                onAttachedToWindow$lambda$2 = ChargersOfferModalView.onAttachedToWindow$lambda$2(chargersOfferModalView, (qo9) obj);
                return onAttachedToWindow$lambda$2;
            default:
                renderSuccess$lambda$3 = ChargersOfferModalView.renderSuccess$lambda$3(chargersOfferModalView, (uj9) obj);
                return renderSuccess$lambda$3;
        }
    }
}
