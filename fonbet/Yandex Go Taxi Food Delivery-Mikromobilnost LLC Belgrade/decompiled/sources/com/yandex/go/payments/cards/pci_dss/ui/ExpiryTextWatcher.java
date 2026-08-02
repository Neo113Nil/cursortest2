package com.yandex.go.payments.cards.pci_dss.ui;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import defpackage.evu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/payments/cards/pci_dss/ui/ExpiryTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/text/InputFilter;", "<init>", "()V", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "source", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExpiryTextWatcher implements TextWatcher, InputFilter {
    public static final int $stable = 0;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        int H = evu0.H(s.toString(), "/", 0, false, 6);
        if ((H == -1 || H == 2) && (H != -1 || s.length() <= 2)) {
            return;
        }
        s.clear();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        int i;
        int i2 = end;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(source);
        if (dstart == 0 && spannableStringBuilder.length() > 0 && '1' < spannableStringBuilder.charAt(0) && spannableStringBuilder.charAt(0) <= '9') {
            spannableStringBuilder.insert(0, (CharSequence) "0");
            i2++;
        }
        int i3 = dend - dstart;
        if (dstart - i3 <= 2 && (dstart + i2) - i3 >= 2 && ((i = 2 - dstart) == i2 || (i >= 0 && i < i2 && spannableStringBuilder.charAt(i) != '/'))) {
            spannableStringBuilder.insert(i, (CharSequence) "/");
            i2++;
        }
        String spannableStringBuilder2 = new SpannableStringBuilder(dest).replace(dstart, dend, (CharSequence) spannableStringBuilder, start, i2).toString();
        if ((spannableStringBuilder2.length() > 0 && (spannableStringBuilder2.charAt(0) < '0' || '1' < spannableStringBuilder2.charAt(0))) || spannableStringBuilder2.length() > 5) {
            return "";
        }
        if (spannableStringBuilder2.length() >= 2) {
            if (spannableStringBuilder2.charAt(0) != '0' && spannableStringBuilder2.charAt(1) > '2') {
                return "";
            }
            if (spannableStringBuilder2.charAt(0) == '0' && spannableStringBuilder2.charAt(1) == '0') {
                return "";
            }
        }
        return spannableStringBuilder;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
