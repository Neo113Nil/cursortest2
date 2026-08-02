package com.yandex.div.internal.widget;

import android.view.View;

/* compiled from: TransientView.kt */
/* loaded from: classes7.dex */
public interface TransientView {
    boolean isTransient();

    void transitionFinished(View view);

    void transitionStarted(View view);
}
