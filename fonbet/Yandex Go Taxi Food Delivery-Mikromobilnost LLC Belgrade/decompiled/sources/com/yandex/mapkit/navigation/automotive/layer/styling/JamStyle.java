package com.yandex.mapkit.navigation.automotive.layer.styling;

import com.yandex.mapkit.navigation.JamTypeColor;
import java.util.List;

/* loaded from: classes15.dex */
public interface JamStyle {
    boolean isValid();

    void setColors(List<JamTypeColor> list);

    void setGradientLength(float f);
}
