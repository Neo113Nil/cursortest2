package com.yandex.runtime.init;

import com.yandex.runtime.Error;

/* loaded from: classes7.dex */
public interface MiidListener {
    void onMiidError(Error error);

    void onMiidReceived(String str);
}
