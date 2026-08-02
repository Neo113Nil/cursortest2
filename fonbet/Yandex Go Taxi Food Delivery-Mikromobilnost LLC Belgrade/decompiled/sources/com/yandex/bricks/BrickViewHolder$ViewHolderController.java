package com.yandex.bricks;

/* loaded from: classes11.dex */
class BrickViewHolder$ViewHolderController extends BrickController {
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrickViewHolder$ViewHolderController(d dVar) {
        super(dVar, false);
        this.this$0 = dVar;
    }

    public void attachTo() {
        this.this$0.a.addOnAttachStateChangeListener(this);
        if (BrickController.isAttachedToWindow(this.this$0.a)) {
            onViewAttachedToWindow(this.this$0.a);
        }
    }

    public void detachFrom() {
        this.this$0.a.removeOnAttachStateChangeListener(this);
        if (BrickController.isAttachedToWindow(this.this$0.a)) {
            onViewDetachedFromWindow(this.this$0.a);
        }
    }
}
