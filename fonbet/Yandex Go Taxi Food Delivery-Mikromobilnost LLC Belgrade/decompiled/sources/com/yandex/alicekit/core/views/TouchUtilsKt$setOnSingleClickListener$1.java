package com.yandex.alicekit.core.views;

import android.os.SystemClock;
import android.view.View;
import defpackage.u3c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/alicekit/core/views/TouchUtilsKt$setOnSingleClickListener$1", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "Lzy11;", "onClick", "(Landroid/view/View;)V", "", "lastClickTimestamp", "J", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TouchUtilsKt$setOnSingleClickListener$1 implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener $listener;
    private long lastClickTimestamp;

    public TouchUtilsKt$setOnSingleClickListener$1(View.OnClickListener onClickListener) {
        this.$listener = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        u3c.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.lastClickTimestamp;
        if (j < 0 || j > 1000) {
            this.lastClickTimestamp = elapsedRealtime;
            this.$listener.onClick(view);
        }
    }
}
