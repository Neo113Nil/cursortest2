package defpackage;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.due_selector.impl.domain.entity.ControlButtonState;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorView;
import ru.yandex.taxi.utils.StyledTypefaceSpan;

/* loaded from: classes5.dex */
public final class fym implements ivm {
    public final /* synthetic */ DueSelectorView a;

    public fym(DueSelectorView dueSelectorView) {
        this.a = dueSelectorView;
    }

    public final void a(ButtonComponent buttonComponent, xvm xvmVar) {
        SpannableString spannableString;
        if (jl40.l(xvmVar, xvm.g)) {
            buttonComponent.setVisibility(8);
            return;
        }
        buttonComponent.setVisibility(0);
        int i = xvmVar.c;
        ControlButtonState controlButtonState = xvmVar.e;
        DueSelectorView dueSelectorView = this.a;
        String string = i != -1 ? dueSelectorView.getContext().getString(i) : xvmVar.b;
        int i2 = controlButtonState.getIsAccent() ? 3 : 0;
        String str = xvmVar.d;
        Spanned c = qeb1.c(string);
        Spanned c2 = qeb1.c(str);
        if (c2 == null || evu0.J(c2)) {
            spannableString = new SpannableString(c);
        } else {
            spannableString = new SpannableString(((Object) c) + "\n" + ((Object) c2));
        }
        if (c != null && !evu0.J(c)) {
            int[] iArr = up11.a;
            spannableString.setSpan(new StyledTypefaceSpan(eja1.w(i2, 0), 0, 2, null), 0, c.length(), 33);
        }
        if (c2 != null && !evu0.J(c2)) {
            int[] iArr2 = up11.a;
            spannableString.setSpan(new StyledTypefaceSpan(eja1.w(0, 0), 0, 2, null), c.length(), spannableString.length(), 33);
        }
        if (c2 != null && !evu0.J(c2)) {
            spannableString.setSpan(new RelativeSizeSpan(0.8125f), c.length(), spannableString.length(), 33);
        }
        buttonComponent.setText(spannableString);
        buttonComponent.setButtonTitleColor(new bdc(controlButtonState.getTextColor()));
        buttonComponent.setButtonBackground(new bdc(controlButtonState.getBgColor()));
        buttonComponent.setDisabledButtonBackground(new bdc(controlButtonState.getBgColor()));
        buttonComponent.setEnabled(controlButtonState.getIsEnabled());
        buttonComponent.setAccent(controlButtonState.getIsAccent());
        if (xvmVar.f) {
            buttonComponent.setAnimationDelay(0);
            buttonComponent.startAnimation();
        } else {
            buttonComponent.stopAnimation();
        }
        buttonComponent.setDebounceClickListener(new wqj(14, xvmVar, dueSelectorView));
    }

    public final void b(xvm xvmVar, xvm xvmVar2) {
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        DueSelectorView dueSelectorView = this.a;
        buttonComponent = dueSelectorView.leadingButton;
        a(buttonComponent, xvmVar);
        buttonComponent2 = dueSelectorView.trailingButton;
        a(buttonComponent2, xvmVar2);
    }
}
