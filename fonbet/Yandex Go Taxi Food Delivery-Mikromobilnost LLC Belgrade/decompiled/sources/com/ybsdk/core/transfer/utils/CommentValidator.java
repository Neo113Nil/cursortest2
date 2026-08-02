package com.ybsdk.core.transfer.utils;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.anc;
import defpackage.dj9;
import defpackage.dzh0;
import defpackage.gvu0;
import defpackage.tls;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001'B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\"\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/ybsdk/core/transfer/utils/CommentValidator;", "Landroid/text/TextWatcher;", "Landroidx/appcompat/widget/AppCompatEditText;", "editText", "Lkotlin/Function1;", "", "Lzy11;", "onValidationFailed", "", "afterTextChangedListener", "<init>", "(Landroidx/appcompat/widget/AppCompatEditText;Ltls;Ltls;)V", "", "s", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Landroidx/appcompat/widget/AppCompatEditText;", "Ltls;", "", "", "allowedSymbols", "Ljava/util/Set;", "", "isSelfEdit", "Z", "isFailed", "textBefore", "Ljava/lang/String;", "invalidSymbolCursorPosition", CA20Status.STATUS_USER_I, "Companion", "anc", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentValidator implements TextWatcher {
    private static final anc Companion = new anc();

    @Deprecated
    public static final int MAX_LENGTH = 100;
    private final tls afterTextChangedListener;
    private final AppCompatEditText editText;
    private int invalidSymbolCursorPosition;
    private boolean isFailed;
    private boolean isSelfEdit;
    private final tls onValidationFailed;
    private final Set<Character> allowedSymbols = a.N0(a.o0(a.o0(a.o0(a.m0(new dj9('{', '~'), a.m0(new dj9('[', '`'), a.m0(new dj9('8', '@'), a.m0(new dj9(HexString.CHAR_SPACE, '/'), a.m0(new dj9(MoneyInputEditView.DEFAULT_VALUE, '9'), a.m0(new dj9(1040, 1103), a.l0(new dj9('A', 'Z'), new dj9('a', 'z')))))))), (char) 8470), (char) 1105), (char) 1025));
    private String textBefore = "";

    public CommentValidator(AppCompatEditText appCompatEditText, tls tlsVar, tls tlsVar2) {
        this.editText = appCompatEditText;
        this.onValidationFailed = tlsVar;
        this.afterTextChangedListener = tlsVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        if (this.isSelfEdit) {
            return;
        }
        this.isSelfEdit = true;
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                if (!this.allowedSymbols.contains(Character.valueOf(s.charAt(i)))) {
                    this.onValidationFailed.invoke(Integer.valueOf(dzh0.ybsdk_transfer_comment_forbidden_symbols));
                    this.isFailed = true;
                    this.editText.setText(s.replace(0, s.length(), this.textBefore));
                    this.editText.setSelection(this.invalidSymbolCursorPosition);
                }
            }
        }
        if (s != null && s.length() > 100) {
            this.onValidationFailed.invoke(Integer.valueOf(dzh0.ybsdk_transfer_comment_lenght_limit));
            this.isFailed = true;
            this.editText.setText(s.replace(0, s.length(), gvu0.s0(s.length() - 100, s)));
            this.editText.setSelection(100);
        }
        if (!this.isFailed) {
            this.afterTextChangedListener.invoke(String.valueOf(s));
        }
        this.isSelfEdit = false;
        this.isFailed = false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (this.isSelfEdit) {
            return;
        }
        this.textBefore = s.toString();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (this.isSelfEdit) {
            return;
        }
        this.invalidSymbolCursorPosition = before + start;
    }
}
