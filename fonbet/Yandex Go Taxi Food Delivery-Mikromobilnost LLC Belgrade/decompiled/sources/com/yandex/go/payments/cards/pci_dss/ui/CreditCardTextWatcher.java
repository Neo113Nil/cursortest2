package com.yandex.go.payments.cards.pci_dss.ui;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import defpackage.j73;
import defpackage.mp8;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011JA\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/payments/cards/pci_dss/ui/CreditCardTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/text/InputFilter;", "<init>", "()V", "Landroid/text/Editable;", "source", "Lzy11;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;", "spacerToDelete", CA20Status.STATUS_USER_I, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreditCardTextWatcher implements TextWatcher, InputFilter {
    public static final int $stable = 8;
    private int spacerToDelete;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable source) {
        String obj = source.toString();
        if (obj == null) {
            obj = "";
        }
        StringBuilder sb = new StringBuilder();
        int length = obj.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = obj.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        CardType.Companion.getClass();
        CardType a = mp8.a(sb2);
        int i3 = this.spacerToDelete;
        if (i3 > 1) {
            int i4 = i3 - 1;
            this.spacerToDelete = 0;
            if (i3 > i4) {
                source.delete(i4, i3);
            }
        }
        while (i < source.length()) {
            char charAt2 = source.charAt(i);
            if (j73.w(i, a.h())) {
                if (charAt2 != ' ') {
                    source.insert(i, " ");
                }
            } else if (charAt2 == ' ') {
                source.delete(i, i + 1);
                i--;
            }
            i++;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        int i;
        int i2 = end;
        String spannableStringBuilder = new SpannableStringBuilder(dest).replace(dstart, dend, source, start, i2).toString();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        StringBuilder sb = new StringBuilder();
        int length = spannableStringBuilder.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = spannableStringBuilder.charAt(i3);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        CardType.Companion.getClass();
        CardType a = mp8.a(sb2);
        if (sb2.length() > a.g()) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(source);
        int i4 = dend - dstart;
        for (int i5 : a.h()) {
            if (source.length() == 0 && dstart == i5 && dest.length() > dstart && dest.charAt(dstart) == ' ') {
                this.spacerToDelete = i5;
            }
            if (dstart - i4 <= i5 && (dstart + i2) - i4 >= i5 && ((i = i5 - dstart) == i2 || (i >= 0 && i < i2 && spannableStringBuilder2.charAt(i) != ' '))) {
                spannableStringBuilder2.insert(i, (CharSequence) " ");
                i2++;
            }
        }
        return spannableStringBuilder2;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
