package defpackage;

import android.view.View;
import ru.yandex.taxi.banners.CardBannerV2ModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class hb8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardBannerV2ModalView b;

    public /* synthetic */ hb8(CardBannerV2ModalView cardBannerV2ModalView, int i) {
        this.a = i;
        this.b = cardBannerV2ModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 addCloseButton$lambda$0$2;
        View view;
        int i = this.a;
        CardBannerV2ModalView cardBannerV2ModalView = this.b;
        switch (i) {
            case 0:
                addCloseButton$lambda$0$2 = CardBannerV2ModalView.addCloseButton$lambda$0$2(cardBannerV2ModalView);
                return addCloseButton$lambda$0$2;
            default:
                view = cardBannerV2ModalView.contentContainer;
                return view;
        }
    }
}
