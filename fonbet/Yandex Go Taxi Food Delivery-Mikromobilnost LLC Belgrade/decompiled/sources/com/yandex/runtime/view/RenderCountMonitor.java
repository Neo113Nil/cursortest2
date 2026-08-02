package com.yandex.runtime.view;

import java.util.List;

/* loaded from: classes2.dex */
public interface RenderCountMonitor {
    boolean isValid();

    List<FpsRenderCounts> stop();
}
