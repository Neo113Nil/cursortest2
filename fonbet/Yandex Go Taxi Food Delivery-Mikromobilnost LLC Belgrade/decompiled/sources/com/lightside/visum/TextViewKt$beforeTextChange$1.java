package com.lightside.visum;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import defpackage.tje;
import defpackage.tka1;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/lightside/visum/TextViewKt$beforeTextChange$1", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class TextViewKt$beforeTextChange$1 implements TextWatcher {
    final /* synthetic */ tls $textListener;
    final /* synthetic */ TextView $this_beforeTextChange;

    public TextViewKt$beforeTextChange$1(TextView textView, tls tlsVar) {
        this.$this_beforeTextChange = textView;
        this.$textListener = tlsVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        tje.N(tka1.h(tka1.g(this.$this_beforeTextChange)), null, null, new TextViewKt$beforeTextChange$1$beforeTextChanged$1(this.$textListener, s, null), 3);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
