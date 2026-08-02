package defpackage;

import java.util.function.Consumer;
import ru.yandex.taxi.banners.CardBannerV2ModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class jb8 implements Consumer {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ CardBannerV2ModalView b;
    public final /* synthetic */ cb8 c;

    public /* synthetic */ jb8(cb8 cb8Var, CardBannerV2ModalView cardBannerV2ModalView) {
        this.c = cb8Var;
        this.b = cardBannerV2ModalView;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        cb8 cb8Var = this.c;
        CardBannerV2ModalView cardBannerV2ModalView = this.b;
        switch (i) {
            case 0:
                CardBannerV2ModalView.setData$lambda$0(cb8Var, cardBannerV2ModalView, (isf0) obj);
                break;
            default:
                CardBannerV2ModalView.setData$lambda$6(cardBannerV2ModalView, cb8Var, ((Long) obj).longValue());
                break;
        }
    }

    public /* synthetic */ jb8(CardBannerV2ModalView cardBannerV2ModalView, cb8 cb8Var) {
        this.b = cardBannerV2ModalView;
        this.c = cb8Var;
    }
}
