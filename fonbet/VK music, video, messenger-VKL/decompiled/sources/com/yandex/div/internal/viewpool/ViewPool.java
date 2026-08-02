package com.yandex.div.internal.viewpool;

import android.view.View;

/* compiled from: ViewPool.kt */
/* loaded from: classes7.dex */
public interface ViewPool {
    <T extends View> T obtain(String str);

    <T extends View> void register(String str, ViewFactory<T> viewFactory, int i);
}
