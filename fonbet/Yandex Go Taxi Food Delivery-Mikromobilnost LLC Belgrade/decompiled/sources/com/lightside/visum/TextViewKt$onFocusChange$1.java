package com.lightside.visum;

import android.view.View;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class TextViewKt$onFocusChange$1 implements View.OnFocusChangeListener {
    final /* synthetic */ tls $focusListener;

    public TextViewKt$onFocusChange$1(tls tlsVar) {
        this.$focusListener = tlsVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.$focusListener.invoke(Boolean.valueOf(z));
    }
}
