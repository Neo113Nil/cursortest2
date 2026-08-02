package defpackage;

import com.yandex.go.payments.data.model.response.ActionButton;
import com.yandex.go.payments.sbp.ui.opening_bank_dialog.OpeningBankDialogModalView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final class ma70 implements oa70 {
    public final /* synthetic */ OpeningBankDialogModalView a;

    public ma70(OpeningBankDialogModalView openingBankDialogModalView) {
        this.a = openingBankDialogModalView;
    }

    public final void h(ActionButton actionButton, ButtonComponent buttonComponent) {
        if (actionButton == null) {
            buttonComponent.setVisibility(8);
            return;
        }
        String str = actionButton.a;
        buttonComponent.setVisibility(0);
        buttonComponent.setText(str);
        buttonComponent.setContentDescription(str);
        buttonComponent.setDebounceClickListener(new sd30(7, actionButton, this.a));
    }
}
