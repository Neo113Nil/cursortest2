package defpackage;

import com.yandex.go.yb.ui.SuggestYbCardInRideView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes15.dex */
public final class dav0 implements z9v0 {
    public final /* synthetic */ SuggestYbCardInRideView a;

    public dav0(SuggestYbCardInRideView suggestYbCardInRideView) {
        this.a = suggestYbCardInRideView;
    }

    @Override // defpackage.z9v0
    public final void dismiss() {
        this.a.dismiss();
    }

    @Override // defpackage.z9v0
    public final void setProgressing(boolean z) {
        SuggestYbCardInRideView suggestYbCardInRideView = this.a;
        boolean z2 = !z;
        SuggestYbCardInRideView.access$getBinding(suggestYbCardInRideView).b.setEnabled(z2);
        SuggestYbCardInRideView.access$getBinding(suggestYbCardInRideView).c.setEnabled(z2);
        if (z) {
            SuggestYbCardInRideView.access$getBinding(suggestYbCardInRideView).b.startAnimation();
            suggestYbCardInRideView.setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        } else {
            SuggestYbCardInRideView.access$getBinding(suggestYbCardInRideView).b.stopAnimation();
            suggestYbCardInRideView.setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        }
    }
}
