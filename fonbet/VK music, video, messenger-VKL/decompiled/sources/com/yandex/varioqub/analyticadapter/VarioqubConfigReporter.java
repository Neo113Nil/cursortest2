package com.yandex.varioqub.analyticadapter;

import com.yandex.varioqub.analyticadapter.data.ConfigData;
import java.util.Set;

/* loaded from: classes8.dex */
public interface VarioqubConfigReporter {
    void reportConfigChanged(ConfigData configData);

    void setExperiments(String str);

    void setTriggeredTestIds(Set<Long> set);
}
