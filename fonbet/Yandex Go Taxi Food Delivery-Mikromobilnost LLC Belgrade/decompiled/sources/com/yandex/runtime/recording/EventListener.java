package com.yandex.runtime.recording;

import java.util.Map;

/* loaded from: classes8.dex */
public interface EventListener {
    void onEvent(String str, Map<String, String> map);

    void onFlush(boolean z);
}
