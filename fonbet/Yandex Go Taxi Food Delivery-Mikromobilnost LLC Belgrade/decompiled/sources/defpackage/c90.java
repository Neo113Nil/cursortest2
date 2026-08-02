package defpackage;

import android.view.View;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import java.util.function.Consumer;
import ru.yandex.taxi.banners.CardBannerV2ModalView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryExplicitCommentRequirementBaseView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;

/* loaded from: classes5.dex */
public final /* synthetic */ class c90 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ c90(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                CardBannerV2ModalView.showAnimation$lambda$1((Throwable) obj);
                break;
            case 2:
                DeliveryExplicitCommentRequirementBaseView.applyTheme$lambda$0((View) obj);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                ((rjy) obj).b();
                break;
            case 7:
                ((rjy) obj).b();
                break;
            case 8:
                ((rjy) obj).e();
                break;
            case 9:
                ((rjy) obj).b();
                break;
            case 10:
                ((rjy) obj).c();
                break;
            case 11:
                ((rjy) obj).a();
                break;
            case 12:
                ((rjy) obj).a();
                break;
            case 13:
                ((rjy) obj).b();
                break;
            case 14:
                ((rjy) obj).c();
                break;
            case 15:
                break;
            case 16:
                ScootersOrderSelectorView.render$lambda$0((Integer) obj);
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                TariffOptionsCardView.applyThemeToTree$lambda$0((View) obj);
                break;
            case 22:
                View view = (View) obj;
                xvy0.a(c.c(xng0.bgMain, view), view);
                break;
            case 23:
                break;
            default:
                int i = hkz0.R;
                break;
        }
    }

    public /* synthetic */ c90(int i, Object obj) {
        this.a = i;
    }
}
