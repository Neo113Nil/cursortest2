package com.yandex.mapkit.indoor;

import java.util.List;

/* loaded from: classes6.dex */
public interface IndoorPlan {
    String getActiveLevelId();

    List<IndoorLevel> getLevels();

    void setActiveLevelId(String str);
}
