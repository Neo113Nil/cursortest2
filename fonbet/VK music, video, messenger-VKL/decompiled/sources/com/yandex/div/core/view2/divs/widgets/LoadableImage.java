package com.yandex.div.core.view2.divs.widgets;

import java.util.concurrent.Future;

/* compiled from: LoadableImage.kt */
/* loaded from: classes7.dex */
public interface LoadableImage {
    void cleanLoadingTask();

    Future<?> getLoadingTask();

    void saveLoadingTask(Future<?> future);
}
