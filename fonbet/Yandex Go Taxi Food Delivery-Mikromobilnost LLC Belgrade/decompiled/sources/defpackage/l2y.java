package defpackage;

import android.view.View;
import com.yandex.go.order.tariffs_suggest.ui.SuggestTariffCashbackView;
import ru.yandex.taxi.plus.design.view.ShaderClipFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class l2y implements zo31 {
    public final SuggestTariffCashbackView a;
    public final RobotoTextView b;
    public final ShaderClipFrameLayout c;

    public l2y(SuggestTariffCashbackView suggestTariffCashbackView, RobotoTextView robotoTextView, ShaderClipFrameLayout shaderClipFrameLayout) {
        this.a = suggestTariffCashbackView;
        this.b = robotoTextView;
        this.c = shaderClipFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
