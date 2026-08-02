package com.yandex.dsl.views;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import defpackage.nka1;
import defpackage.pj91;
import defpackage.tje;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/yandex/dsl/views/TextViewKt$afterTextChange$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lzy11;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "before", "count", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "after", "beforeTextChanged", "core-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class TextViewKt$afterTextChange$1 implements TextWatcher {
    final /* synthetic */ tls $editableListener;
    final /* synthetic */ TextView $this_afterTextChange;

    public TextViewKt$afterTextChange$1(TextView textView, tls tlsVar) {
        this.$this_afterTextChange = textView;
        this.$editableListener = tlsVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        tje.N(nka1.c(pj91.f(this.$this_afterTextChange)), null, null, new TextViewKt$afterTextChange$1$afterTextChanged$1(this.$editableListener, s, null), 3);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
