package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeModalView;
import defpackage.apj;
import defpackage.bdc;
import defpackage.cpj;
import defpackage.evu0;
import defpackage.jpj;
import defpackage.kpj;
import defpackage.lpj;
import defpackage.t8j;
import defpackage.xng0;
import defpackage.zvg;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class a implements cpj {
    public final /* synthetic */ DiscountsAddPromoCodeModalView a;

    public a(DiscountsAddPromoCodeModalView discountsAddPromoCodeModalView) {
        this.a = discountsAddPromoCodeModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        apj binding;
        DiscountsAddPromoCodeModalView.SwitchableChangeTextWatcher switchableChangeTextWatcher;
        lpj lpjVar = (lpj) obj;
        DiscountsAddPromoCodeModalView discountsAddPromoCodeModalView = this.a;
        binding = discountsAddPromoCodeModalView.getBinding();
        RobotoTextView robotoTextView = binding.d;
        CharSequence charSequence = lpjVar.a;
        jpj jpjVar = lpjVar.c;
        DiscountsAddPromoCodeUiState$ButtonStatus discountsAddPromoCodeUiState$ButtonStatus = jpjVar.b;
        robotoTextView.setText(charSequence);
        switchableChangeTextWatcher = discountsAddPromoCodeModalView.promoCodeInputTextWatcher;
        kpj kpjVar = lpjVar.b;
        switchableChangeTextWatcher.setEnabled(kpjVar != null && kpjVar.a);
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.c;
        animatedListItemInputComponent.setVisibility(kpjVar != null ? 0 : 8);
        String str = kpjVar != null ? kpjVar.b : null;
        animatedListItemInputComponent.setErrorText(str);
        animatedListItemInputComponent.setMinHeight((str == null || evu0.J(str)) ? discountsAddPromoCodeModalView.standardMinHeight : discountsAddPromoCodeModalView.errorMinHeight);
        animatedListItemInputComponent.setOnEditorActionListener(new t8j(3, discountsAddPromoCodeModalView, lpjVar));
        discountsAddPromoCodeModalView.changeKeyboardVisibility(kpjVar != null);
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.setEnabled(discountsAddPromoCodeUiState$ButtonStatus.getEnabled());
        buttonComponent.setText(jpjVar.a);
        if (discountsAddPromoCodeUiState$ButtonStatus.getLoading()) {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
            DiscountsAddPromoCodeModalView.Companion.getClass();
            buttonComponent.setButtonTitleColor(new bdc(buttonComponent.isEnabled() ? xng0.textOnControl : xng0.textMain));
            buttonComponent.startAnimation();
        } else {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
            DiscountsAddPromoCodeModalView.Companion.getClass();
            buttonComponent.setButtonTitleColor(new bdc(buttonComponent.isEnabled() ? xng0.textOnControl : xng0.textMain));
            buttonComponent.stopAnimation();
        }
        buttonComponent.setDebounceClickListener(new zvg(28, discountsAddPromoCodeModalView, lpjVar));
    }
}
