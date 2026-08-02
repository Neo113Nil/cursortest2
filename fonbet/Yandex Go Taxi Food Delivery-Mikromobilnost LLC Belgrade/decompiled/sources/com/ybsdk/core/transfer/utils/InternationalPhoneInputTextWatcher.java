package com.ybsdk.core.transfer.utils;

import android.text.Editable;
import android.text.TextWatcher;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.kfb0;
import defpackage.tls;
import defpackage.vsq;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/ybsdk/core/transfer/utils/InternationalPhoneInputTextWatcher;", "Landroid/text/TextWatcher;", "Lcom/ybsdk/widgets/common/LoadableInput;", "filterInput", "Lkotlin/Function1;", "", "Lzy11;", "afterTextChangedListener", "<init>", "(Lcom/ybsdk/widgets/common/LoadableInput;Ltls;)V", "input", "", "start", "before", "count", "processInput", "(Ljava/lang/String;III)Ljava/lang/String;", "digitsToRight", "text", "getNewCursorPosition", "(ILjava/lang/String;)I", "", "s", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Lcom/ybsdk/widgets/common/LoadableInput;", "Ltls;", "beforeString", "Ljava/lang/String;", "newValue", "", "isSelfEdit", "Z", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InternationalPhoneInputTextWatcher implements TextWatcher {
    private final tls afterTextChangedListener;
    private final LoadableInput filterInput;
    private boolean isSelfEdit;
    private String beforeString = "";
    private String newValue = "";

    public InternationalPhoneInputTextWatcher(LoadableInput loadableInput, tls tlsVar) {
        this.filterInput = loadableInput;
        this.afterTextChangedListener = tlsVar;
    }

    private final int getNewCursorPosition(int digitsToRight, String text) {
        String obj = gvu0.z0(text).toString();
        int length = obj.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = obj.charAt(i2);
            if (digitsToRight == 0) {
                break;
            }
            if (Character.isDigit(charAt)) {
                digitsToRight--;
            }
            i++;
        }
        return text.length() - i;
    }

    private final String processInput(String input, int start, int before, int count) {
        if (input.length() == 0) {
            return input;
        }
        String Q = evu0.Q("+", input);
        if (Q.length() == 0) {
            return "";
        }
        boolean c = kfb0.c(Q);
        if (c) {
            StringBuilder sb = new StringBuilder();
            int length = Q.length();
            for (int i = 0; i < length; i++) {
                char charAt = Q.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            Q = sb.toString();
        }
        this.isSelfEdit = true;
        LoadableInput.render$default(this.filterInput, false, new vsq(Q, 16), 1, null);
        if (c && Q.length() > 0) {
            int i2 = start + before;
            int length2 = this.beforeString.length();
            if (i2 > length2) {
                i2 = length2;
            }
            String substring = this.beforeString.substring(i2);
            int i3 = 0;
            for (int i4 = 0; i4 < substring.length(); i4++) {
                if (Character.isDigit(substring.charAt(i4))) {
                    i3++;
                }
            }
            this.filterInput.getEditText().setSelection(getNewCursorPosition(i3, Q));
        }
        this.isSelfEdit = false;
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g processInput$lambda$1(String str, g gVar) {
        return g.a(gVar, str, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554430);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        if (this.isSelfEdit) {
            return;
        }
        this.isSelfEdit = true;
        this.afterTextChangedListener.invoke(this.newValue);
        this.isSelfEdit = false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (this.isSelfEdit) {
            return;
        }
        this.beforeString = s.toString();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String obj;
        if (this.isSelfEdit) {
            return;
        }
        try {
            obj = processInput(s.toString(), start, before, count);
        } catch (Exception unused) {
            obj = s.toString();
        }
        this.newValue = obj;
    }
}
