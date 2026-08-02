package com.bumptech.glide.request.target;

import android.view.View;
import defpackage.e5j0;

/* loaded from: classes10.dex */
class CustomViewTarget$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ b this$0;

    public CustomViewTarget$1(b bVar) {
        this.this$0 = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        e5j0 request = this.this$0.getRequest();
        if (request == null || !request.c()) {
            return;
        }
        request.j();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        e5j0 request = this.this$0.getRequest();
        if (request != null) {
            request.clear();
        }
    }
}
