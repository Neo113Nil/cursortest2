package defpackage;

import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class m8a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChargersOfferModalView b;

    public /* synthetic */ m8a(ChargersOfferModalView chargersOfferModalView, int i) {
        this.a = i;
        this.b = chargersOfferModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ChargersOfferModalView chargersOfferModalView = this.b;
        switch (i) {
            case 0:
                ChargersOfferModalView.backButton$lambda$0(chargersOfferModalView);
                break;
            default:
                ChargersOfferModalView.onAttachedToWindow$lambda$3(chargersOfferModalView);
                break;
        }
    }
}
