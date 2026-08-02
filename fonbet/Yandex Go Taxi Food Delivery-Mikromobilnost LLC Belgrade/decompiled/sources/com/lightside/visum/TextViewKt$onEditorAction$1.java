package com.lightside.visum;

import android.view.KeyEvent;
import android.widget.TextView;
import defpackage.wls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class TextViewKt$onEditorAction$1 implements TextView.OnEditorActionListener {
    final /* synthetic */ wls $actionListener;

    public TextViewKt$onEditorAction$1(wls wlsVar) {
        this.$actionListener = wlsVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return ((Boolean) this.$actionListener.invoke(Integer.valueOf(i), keyEvent)).booleanValue();
    }
}
