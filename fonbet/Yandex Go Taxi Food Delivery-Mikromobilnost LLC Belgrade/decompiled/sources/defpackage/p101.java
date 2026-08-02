package defpackage;

import com.yandex.go.agreement.trackable.mvp.TrackableAcceptanceModalView;
import com.yandex.go.design.view.GoImageView;
import java.util.List;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

/* loaded from: classes12.dex */
public final class p101 implements r101 {
    public final /* synthetic */ TrackableAcceptanceModalView a;

    public p101(TrackableAcceptanceModalView trackableAcceptanceModalView) {
        this.a = trackableAcceptanceModalView;
    }

    @Override // defpackage.r101
    public final void m9(n101 n101Var) {
        w101 binding;
        LinkMovementMethod linkMovementMethod;
        TrackableAcceptanceModalView trackableAcceptanceModalView = this.a;
        binding = trackableAcceptanceModalView.getBinding();
        trackableAcceptanceModalView.setCloseButton(n101Var.e);
        GoImageView goImageView = binding.d;
        UiStateDrawableWrapper uiStateDrawableWrapper = n101Var.a;
        goImageView.setImageDrawable(uiStateDrawableWrapper.getDrawable());
        RobotoTextView robotoTextView = binding.e;
        CharSequence charSequence = n101Var.b;
        robotoTextView.setText(charSequence);
        RobotoTextView robotoTextView2 = binding.c;
        CharSequence charSequence2 = n101Var.c;
        robotoTextView2.setText(charSequence2);
        linkMovementMethod = trackableAcceptanceModalView.getLinkMovementMethod();
        robotoTextView2.setMovementMethod(linkMovementMethod);
        List list = n101Var.d;
        trackableAcceptanceModalView.setButtons(list);
        binding.d.setVisibility(uiStateDrawableWrapper.getDrawable() != null ? 0 : 8);
        robotoTextView.setVisibility((charSequence == null || evu0.J(charSequence)) ? 8 : 0);
        robotoTextView2.setVisibility((charSequence2 == null || evu0.J(charSequence2)) ? 8 : 0);
        binding.b.setVisibility(list.isEmpty() ? 8 : 0);
    }

    @Override // defpackage.r101
    public final void u2(boolean z) {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        TrackableAcceptanceModalView trackableAcceptanceModalView = this.a;
        trackableAcceptanceModalView.setInterceptOnBackPress(!z);
        trackableAcceptanceModalView.setDismissOnBackPressed(z);
        trackableAcceptanceModalView.setDismissOnTouchOutside(z);
        bottomSheetBehavior = trackableAcceptanceModalView.getBottomSheetBehavior();
        bottomSheetBehavior.a0 = z;
        if (z) {
            trackableAcceptanceModalView.setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
            trackableAcceptanceModalView.setOnTouchOutsideListener(new o101(trackableAcceptanceModalView, 1));
            trackableAcceptanceModalView.setOnSlideOutListener(new o101(trackableAcceptanceModalView, 2));
            trackableAcceptanceModalView.setOnBackPressedListener(new o101(trackableAcceptanceModalView, 3));
            return;
        }
        trackableAcceptanceModalView.setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        trackableAcceptanceModalView.setOnTouchOutsideListener(null);
        trackableAcceptanceModalView.setOnSlideOutListener(new d82(1));
        trackableAcceptanceModalView.setOnBackPressedListener(new d82(1));
    }
}
