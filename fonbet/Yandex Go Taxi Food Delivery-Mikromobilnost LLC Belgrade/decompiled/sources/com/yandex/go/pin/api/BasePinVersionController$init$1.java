package com.yandex.go.pin.api;

import android.view.View;
import defpackage.gh00;
import defpackage.x65;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/yandex/go/pin/api/BasePinVersionController$init$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BasePinVersionController$init$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ x65 this$0;

    public BasePinVersionController$init$1(x65 x65Var) {
        this.this$0 = x65Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.this$0.e.a();
        x65 x65Var = this.this$0;
        ((gh00) x65Var.b).e(x65Var.h);
        this.this$0.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.this$0.e.b();
        x65 x65Var = this.this$0;
        ((gh00) x65Var.b).u(x65Var.h);
        this.this$0.getClass();
    }
}
