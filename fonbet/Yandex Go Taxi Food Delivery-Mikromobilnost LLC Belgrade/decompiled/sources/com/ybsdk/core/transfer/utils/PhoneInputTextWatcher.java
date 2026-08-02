package com.ybsdk.core.transfer.utils;

import android.text.Editable;
import android.text.TextWatcher;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.b64;
import defpackage.gvu0;
import defpackage.kfb0;
import defpackage.my30;
import defpackage.tls;
import defpackage.x4c;
import kotlin.Metadata;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(J/\u0010)\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010(J\u0019\u0010+\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/ybsdk/core/transfer/utils/PhoneInputTextWatcher;", "Landroid/text/TextWatcher;", "Lcom/ybsdk/widgets/common/LoadableInput;", "filterInput", "Lkotlin/Function1;", "", "Lzy11;", "afterTextChangedListener", "<init>", "(Lcom/ybsdk/widgets/common/LoadableInput;Ltls;)V", "input", "", "start", "before", "count", "getFormattedPhoneOrName", "(Ljava/lang/String;III)Ljava/lang/String;", "stringToRightOfCursor", "getFormattedPhone", "(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;", "getValidPhone", "phone", "removePrefixAndExtraSymbolsAtTheEnd", "(Ljava/lang/String;)Ljava/lang/String;", "", "isPhone", "formattedValue", "digitCountToRightOfCursor", "renderInputAndSelection", "(ZLjava/lang/String;I)V", "formattedPhone", "setSelectionForFormattedPhone", "(Ljava/lang/String;I)V", "digits", "getNewCursorPosition", "(ILjava/lang/String;)I", "", "s", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Lcom/ybsdk/widgets/common/LoadableInput;", "Ltls;", "beforeString", "Ljava/lang/String;", "newValue", "isSelfEdit", "Z", "Lkotlin/text/Regex;", "separators", "Lkotlin/text/Regex;", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhoneInputTextWatcher implements TextWatcher {
    private final tls afterTextChangedListener;
    private final LoadableInput filterInput;
    private boolean isSelfEdit;
    private String beforeString = "";
    private String newValue = "";
    private final Regex separators = new Regex("[-\\s]");

    public PhoneInputTextWatcher(LoadableInput loadableInput, tls tlsVar) {
        this.filterInput = loadableInput;
        this.afterTextChangedListener = tlsVar;
    }

    private final String getFormattedPhone(String input, int start, int count, String stringToRightOfCursor) {
        return kfb0.b(getValidPhone(input, start, count, stringToRightOfCursor));
    }

    private final String getFormattedPhoneOrName(String input, int start, int before, int count) {
        String str = this.beforeString;
        String substring = str.substring(before + start, str.length());
        StringBuilder sb = new StringBuilder();
        int length = substring.length();
        for (int i = 0; i < length; i++) {
            char charAt = substring.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        int length2 = sb.toString().length();
        boolean c = kfb0.c(input);
        if (c) {
            input = getFormattedPhone(input, start, count, substring);
        }
        this.isSelfEdit = true;
        renderInputAndSelection(c, input, length2);
        this.isSelfEdit = false;
        return input;
    }

    private final int getNewCursorPosition(int digits, String phone) {
        String obj = gvu0.z0(phone).toString();
        int length = obj.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = obj.charAt(i2);
            if (digits == 0) {
                break;
            }
            if (Character.isDigit(charAt)) {
                digits--;
            }
            i++;
        }
        return phone.length() - i;
    }

    private final String getValidPhone(String input, int start, int count, String stringToRightOfCursor) {
        if (count == 0 && start > 0) {
            if (this.separators.a(String.valueOf(this.beforeString.charAt(start)))) {
                return b64.j(input.substring(0, start - 1), stringToRightOfCursor);
            }
        }
        return removePrefixAndExtraSymbolsAtTheEnd(input);
    }

    private final String removePrefixAndExtraSymbolsAtTheEnd(String phone) {
        String e = kfb0.e(phone);
        StringBuilder sb = new StringBuilder();
        int length = e.length();
        for (int i = 0; i < length; i++) {
            char charAt = e.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Regex regex = kfb0.a;
        if (sb2.length() <= 10) {
            return e;
        }
        String e2 = kfb0.e(this.beforeString);
        StringBuilder sb3 = new StringBuilder();
        int length2 = e2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt2 = e2.charAt(i2);
            if (Character.isDigit(charAt2)) {
                sb3.append(charAt2);
            }
        }
        return gvu0.A0(10, sb3.toString());
    }

    private final void renderInputAndSelection(boolean isPhone, String formattedValue, int digitCountToRightOfCursor) {
        LoadableInput.render$default(this.filterInput, false, new my30(formattedValue, 25), 1, null);
        if (isPhone) {
            setSelectionForFormattedPhone(formattedValue, digitCountToRightOfCursor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderInputAndSelection$lambda$2(String str, g gVar) {
        return g.a(gVar, str, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554430);
    }

    private final void setSelectionForFormattedPhone(String formattedPhone, int digitCountToRightOfCursor) {
        this.filterInput.getEditText().setSelection(getNewCursorPosition(digitCountToRightOfCursor, formattedPhone));
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
            obj = getFormattedPhoneOrName(s.toString(), start, before, count);
        } catch (Exception e) {
            x4c.g("Failed to set value in PhoneInputTextWatcher", e, "value=" + ((Object) s), null, 8);
            obj = s.toString();
        }
        this.newValue = obj;
    }
}
