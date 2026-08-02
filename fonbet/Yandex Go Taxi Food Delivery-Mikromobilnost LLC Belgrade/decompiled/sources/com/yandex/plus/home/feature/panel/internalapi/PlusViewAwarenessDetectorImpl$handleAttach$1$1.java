package com.yandex.plus.home.feature.panel.internalapi;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PlusViewAwarenessDetectorImpl$handleAttach$1$1 implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ boolean $needNotifyImmediately;
    final /* synthetic */ View $view;
    final /* synthetic */ a this$0;

    public PlusViewAwarenessDetectorImpl$handleAttach$1$1(a aVar, View view, boolean z) {
        this.this$0 = aVar;
        this.$view = view;
        this.$needNotifyImmediately = z;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        a.d(this.this$0, this.$view, this.$needNotifyImmediately);
    }
}
