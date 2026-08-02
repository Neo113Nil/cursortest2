package com.yandex.mapkit.navigation.automotive.layer.styling.internal;

import com.yandex.mapkit.navigation.JamTypeColor;
import com.yandex.mapkit.navigation.automotive.layer.styling.JamStyle;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class JamStyleBinding implements JamStyle {
    private final NativeObject nativeObject;

    public JamStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.JamStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.JamStyle
    public native void setColors(List<JamTypeColor> list);

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.JamStyle
    public native void setGradientLength(float f);
}
