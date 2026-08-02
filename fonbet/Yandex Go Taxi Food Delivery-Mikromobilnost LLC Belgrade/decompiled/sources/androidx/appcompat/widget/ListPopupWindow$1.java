package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes10.dex */
class ListPopupWindow$1 extends ForwardingListener {
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPopupWindow$1(i iVar, View view) {
        super(view);
        this.this$0 = iVar;
    }

    @Override // androidx.appcompat.widget.ForwardingListener
    public i getPopup() {
        return this.this$0;
    }
}
