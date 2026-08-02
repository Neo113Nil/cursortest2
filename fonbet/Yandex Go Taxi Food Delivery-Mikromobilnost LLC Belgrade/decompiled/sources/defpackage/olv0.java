package defpackage;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.summary.promotions.models.TextAlign;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class olv0 implements rlv0 {
    public final /* synthetic */ SummaryPromotionModalWindowsModalView a;

    public olv0(SummaryPromotionModalWindowsModalView summaryPromotionModalWindowsModalView) {
        this.a = summaryPromotionModalWindowsModalView;
    }

    @Override // defpackage.rlv0
    public final void Fc() {
        SliderButtonView sliderButtonView;
        sliderButtonView = this.a.sliderView;
        if (sliderButtonView != null) {
            sliderButtonView.startBounceAnimation();
        }
    }

    @Override // defpackage.rlv0
    public final void c6(wlv0 wlv0Var) {
        ylv0 binding;
        int componentAlignment;
        int componentAlignment2;
        int componentAlignment3;
        SummaryPromotionModalWindowsModalView summaryPromotionModalWindowsModalView = this.a;
        binding = summaryPromotionModalWindowsModalView.getBinding();
        Drawable drawable = wlv0Var.b;
        CharSequence charSequence = wlv0Var.f;
        if (drawable != null) {
            binding.g.setImageDrawable(drawable);
        }
        Drawable drawable2 = wlv0Var.c;
        if (drawable2 != null) {
            binding.f.setImageDrawable(drawable2);
        }
        ListHeaderComponent listHeaderComponent = binding.e;
        ListTextComponent listTextComponent = binding.h;
        ListTextComponent listTextComponent2 = binding.d;
        listHeaderComponent.setTitle(wlv0Var.d);
        TextAlign textAlign = wlv0Var.i;
        if (textAlign != null) {
            componentAlignment3 = summaryPromotionModalWindowsModalView.toComponentAlignment(textAlign);
            binding.e.setTitleAlignment(componentAlignment3);
        }
        listTextComponent.setText(wlv0Var.e);
        listTextComponent.setTextPaddings(0, 0, 0, 0);
        TextAlign textAlign2 = wlv0Var.j;
        if (textAlign2 != null) {
            componentAlignment2 = summaryPromotionModalWindowsModalView.toComponentAlignment(textAlign2);
            listTextComponent.setTextAlignment(componentAlignment2);
        }
        listTextComponent2.setVisibility(charSequence.length() > 0 ? 0 : 8);
        listTextComponent2.setText(charSequence);
        RobotoTextView textView = listTextComponent2.getTextView();
        textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), tje.r(mrg0.go_design_m_space, summaryPromotionModalWindowsModalView.getContext()));
        listTextComponent2.setMovementMethod(qeb1.d(charSequence) ? LinkMovementMethod.getInstance() : null);
        componentAlignment = summaryPromotionModalWindowsModalView.toComponentAlignment(wlv0Var.k);
        listTextComponent2.setTextAlignment(componentAlignment);
        List list = wlv0Var.h;
        if (list == null) {
            list = EmptyList.a;
        }
        summaryPromotionModalWindowsModalView.renderBullets(list);
        summaryPromotionModalWindowsModalView.renderWidget(wlv0Var.g);
    }

    @Override // defpackage.rlv0
    public final void dismiss() {
        this.a.dismiss();
    }
}
