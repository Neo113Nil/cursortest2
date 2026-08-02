package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.bdr;
import defpackage.pw21;

/* loaded from: classes10.dex */
class FirstFrameWaiter$1 implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ bdr this$0;
    final /* synthetic */ View val$view;

    public FirstFrameWaiter$1(bdr bdrVar, View view) {
        this.this$0 = bdrVar;
        this.val$view = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        pw21.j().post(new a());
    }
}
