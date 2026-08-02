package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.error;

import android.view.View;
import defpackage.bx60;
import defpackage.n751;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomErrorViewController$applyWindowInsets$1$2 implements bx60 {
    final /* synthetic */ View $v;
    final /* synthetic */ CustomErrorViewController this$0;

    public CustomErrorViewController$applyWindowInsets$1$2(CustomErrorViewController customErrorViewController, View view) {
        this.this$0 = customErrorViewController;
        this.$v = view;
    }

    @Override // defpackage.bx60
    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
        this.this$0.applyInsetsToView(this.$v, n751Var.a.g(519));
        return n751Var;
    }
}
