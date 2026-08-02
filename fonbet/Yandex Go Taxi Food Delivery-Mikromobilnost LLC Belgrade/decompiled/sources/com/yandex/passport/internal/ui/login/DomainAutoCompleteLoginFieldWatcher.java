package com.yandex.passport.internal.ui.login;

import android.text.Editable;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;

/* loaded from: classes15.dex */
public class DomainAutoCompleteLoginFieldWatcher implements TextWatcher, SpanWatcher {
    private final String[] domains;
    private final int maskColor;
    private boolean isTextChanging = false;
    private boolean isSelectionChanging = false;

    public DomainAutoCompleteLoginFieldWatcher(String[] strArr, int i) {
        this.domains = strArr;
        this.maskColor = i;
    }

    private String findDomain(String str) {
        for (String str2 : this.domains) {
            if (str2.startsWith(str)) {
                return str2;
            }
        }
        return null;
    }

    private int getUserInputLength(Spannable spannable) {
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class);
        return (foregroundColorSpanArr == null || foregroundColorSpanArr.length <= 0) ? spannable.length() : spannable.getSpanStart(foregroundColorSpanArr[0]);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.isTextChanging) {
            return;
        }
        this.isTextChanging = true;
        int userInputLength = getUserInputLength(editable);
        if (userInputLength == 0) {
            if (editable.length() > 0) {
                editable.clear();
            }
            this.isTextChanging = false;
            return;
        }
        editable.delete(userInputLength, editable.length());
        int indexOf = TextUtils.indexOf(editable, "@");
        if (indexOf < 0) {
            editable.append("@");
            indexOf = editable.length() - 1;
        }
        int i = indexOf + 1;
        if (i <= 0 || userInputLength <= i) {
            editable.append((CharSequence) this.domains[0]);
        } else {
            String findDomain = findDomain(TextUtils.substring(editable, i, userInputLength));
            if (findDomain != null) {
                editable.replace(i, editable.length(), findDomain);
            }
        }
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class);
        editable.setSpan((foregroundColorSpanArr == null || foregroundColorSpanArr.length <= 0) ? new ForegroundColorSpan(this.maskColor) : foregroundColorSpanArr[0], userInputLength, editable.length(), 33);
        this.isTextChanging = false;
    }

    public void applyAutoComplete(Spannable spannable) {
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class);
        if (foregroundColorSpanArr.length > 0) {
            spannable.removeSpan(foregroundColorSpanArr[0]);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.isSelectionChanging) {
            return;
        }
        boolean z = obj == Selection.SELECTION_START || obj == Selection.SELECTION_END;
        this.isSelectionChanging = z;
        if (z) {
            int userInputLength = getUserInputLength(spannable);
            if (userInputLength < i3) {
                spannable.setSpan(obj, userInputLength, userInputLength, 34);
            }
            this.isSelectionChanging = false;
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
