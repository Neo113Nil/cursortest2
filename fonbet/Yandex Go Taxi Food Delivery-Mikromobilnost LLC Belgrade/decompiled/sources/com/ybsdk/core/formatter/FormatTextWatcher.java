package com.ybsdk.core.formatter;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.h9s;
import defpackage.l9s;
import defpackage.tls;
import defpackage.xvq;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Lcom/ybsdk/core/formatter/FormatTextWatcher;", "Landroid/text/TextWatcher;", "Lh9s;", "formatter", "Landroid/widget/TextView;", "textView", "", "predefinedString", "", "updateAfterInitialization", "Lkotlin/Function1;", "Lzy11;", "afterTextChangedCallback", "<init>", "(Lh9s;Landroid/widget/TextView;Ljava/lang/String;ZLtls;)V", "", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Lh9s;", "Landroid/widget/TextView;", "Z", "Ltls;", "textBefore", "Ljava/lang/String;", "newCursorPosition", CA20Status.STATUS_USER_I, "isNeedToSkip", "core-formatter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FormatTextWatcher implements TextWatcher {
    private final tls afterTextChangedCallback;
    private final h9s formatter;
    private boolean isNeedToSkip;
    private int newCursorPosition;
    private String textBefore;
    private final TextView textView;
    private final boolean updateAfterInitialization;

    public FormatTextWatcher(h9s h9sVar, TextView textView, String str, boolean z, tls tlsVar) {
        this.formatter = h9sVar;
        this.textView = textView;
        this.updateAfterInitialization = z;
        this.afterTextChangedCallback = tlsVar;
        this.textBefore = str;
        textView.addTextChangedListener(this);
        if (((l9s) h9sVar).b().length() > 0) {
            ((l9s) h9sVar).h(0, ((l9s) h9sVar).b().length());
        }
        if (str.length() > 0) {
            ((l9s) h9sVar).d(0, str);
        }
        if (!z || str.length() <= 0) {
            return;
        }
        tlsVar.invoke(((l9s) h9sVar).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(String str) {
        return zy11.a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        if (this.isNeedToSkip) {
            return;
        }
        this.isNeedToSkip = true;
        if (s != null) {
            s.replace(0, s.length(), ((l9s) this.formatter).b());
            try {
                TextView textView = this.textView;
                EditText editText = textView instanceof EditText ? (EditText) textView : null;
                if (editText != null) {
                    editText.setSelection(this.newCursorPosition);
                }
            } catch (Throwable unused) {
            }
            this.afterTextChangedCallback.invoke(((l9s) this.formatter).b());
        }
        this.isNeedToSkip = false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (this.isNeedToSkip) {
            return;
        }
        this.textBefore = s.toString();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        int d;
        if (this.isNeedToSkip) {
            return;
        }
        if (s.length() > this.textBefore.length()) {
            d = ((l9s) this.formatter).d(start, s.subSequence(start, count + start).toString());
        } else if (count > 1) {
            h9s h9sVar = this.formatter;
            ((l9s) h9sVar).h(0, ((l9s) h9sVar).b().length());
            d = ((l9s) this.formatter).d(0, s.toString());
        } else {
            int length = s.length();
            int length2 = this.textBefore.length();
            h9s h9sVar2 = this.formatter;
            if (length < length2) {
                d = ((l9s) h9sVar2).h(start, before);
            } else {
                ((l9s) h9sVar2).h(0, ((l9s) h9sVar2).b().length());
                d = ((l9s) this.formatter).d(0, s.toString());
            }
        }
        this.newCursorPosition = d;
    }

    public /* synthetic */ FormatTextWatcher(h9s h9sVar, TextView textView, String str, boolean z, tls tlsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(h9sVar, textView, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new xvq(19) : tlsVar);
    }
}
