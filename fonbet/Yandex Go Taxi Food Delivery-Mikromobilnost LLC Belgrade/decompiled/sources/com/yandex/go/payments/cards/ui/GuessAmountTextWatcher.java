package com.yandex.go.payments.cards.ui;

import android.text.Editable;
import com.yandex.go.payments.cards.data.model.GuessAmount;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.c4u;
import defpackage.d4u;
import defpackage.evu0;
import defpackage.j6i0;
import defpackage.sue0;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.utils.BaseTextWatcher;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u000f\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/payments/cards/ui/GuessAmountTextWatcher;", "Lru/yandex/taxi/utils/BaseTextWatcher;", "<init>", "()V", "", "isValid", "()Z", "Lcom/yandex/go/payments/cards/data/model/GuessAmount;", "getGuessAmount", "()Lcom/yandex/go/payments/cards/data/model/GuessAmount;", "Landroid/text/Editable;", "s", "Lzy11;", "afterTextChanged", "(Landroid/text/Editable;)V", "Ld4u;", "listener", "setListener", "(Ld4u;)V", "", "decimalSeparator", CA20Status.STATUS_REQUEST_C, "isEditing", "Z", "", TarifficatorScenarioActivity.RESULT_KEY, "Ljava/lang/String;", "Ld4u;", "Companion", "c4u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GuessAmountTextWatcher extends BaseTextWatcher {
    public static final int $stable = 8;
    public static final c4u Companion = new c4u();
    private static final char DECIMAL_SEPARATOR_BACKEND = '.';
    private static final int NUMBER_OF_DECIMAL_PLACES = 2;
    private boolean isEditing;
    private d4u listener;
    private final char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
    private String result = "";

    private final GuessAmount getGuessAmount() {
        if (isValid()) {
            return new GuessAmount(this.result.replace(this.decimalSeparator, DECIMAL_SEPARATOR_BACKEND));
        }
        return null;
    }

    private final boolean isValid() {
        return !evu0.J(this.result);
    }

    @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        int i;
        if (this.isEditing) {
            return;
        }
        this.isEditing = true;
        int i2 = -1;
        int i3 = 0;
        while (i3 < s.length()) {
            char charAt = s.charAt(i3);
            if (charAt != this.decimalSeparator && (charAt < '0' || charAt > '9')) {
                s.delete(i3, i3 + 1);
            } else if (i3 == 1 && s.charAt(0) == '0' && charAt != this.decimalSeparator) {
                s.delete(0, 1);
            } else {
                if (charAt == this.decimalSeparator) {
                    if (i3 == 0) {
                        s.insert(0, "0");
                    } else if (i2 == -1) {
                        i2 = i3;
                    } else {
                        s.delete(i3, i3 + 1);
                    }
                }
                i3++;
            }
        }
        if (i2 != -1 && s.length() > (i = i2 + 3)) {
            s.delete(i, s.length());
        }
        this.result = s.toString();
        d4u d4uVar = this.listener;
        if (d4uVar != null) {
            GuessAmount guessAmount = getGuessAmount();
            if (guessAmount != null) {
                j6i0 j6i0Var = (j6i0) ((sue0) d4uVar).b;
                j6i0Var.l = guessAmount;
                j6i0Var.f.setConfirmButtonEnabled(true);
            } else {
                j6i0 j6i0Var2 = (j6i0) ((sue0) d4uVar).b;
                j6i0Var2.l = null;
                j6i0Var2.f.setConfirmButtonEnabled(false);
            }
        }
        this.isEditing = false;
    }

    public final void setListener(d4u listener) {
        this.listener = listener;
    }
}
