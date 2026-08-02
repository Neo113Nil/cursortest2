package androidx.appcompat.widget;

import android.view.View;
import defpackage.q9s0;

/* loaded from: classes10.dex */
class PopupMenu$3 extends ForwardingListener {
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenu$3(k kVar, View view) {
        super(view);
        this.this$0 = kVar;
    }

    @Override // androidx.appcompat.widget.ForwardingListener
    public q9s0 getPopup() {
        return this.this$0.c.b();
    }

    @Override // androidx.appcompat.widget.ForwardingListener
    public boolean onForwardingStarted() {
        this.this$0.a();
        return true;
    }

    @Override // androidx.appcompat.widget.ForwardingListener
    public boolean onForwardingStopped() {
        this.this$0.c.a();
        return true;
    }
}
