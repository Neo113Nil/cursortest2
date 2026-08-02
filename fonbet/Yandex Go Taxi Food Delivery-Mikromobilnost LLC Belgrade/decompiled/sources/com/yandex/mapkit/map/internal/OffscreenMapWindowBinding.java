package com.yandex.mapkit.map.internal;

import android.graphics.Bitmap;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.OffscreenMapWindow;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class OffscreenMapWindowBinding implements OffscreenMapWindow {
    private final NativeObject nativeObject;

    public OffscreenMapWindowBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.OffscreenMapWindow
    public native Bitmap captureScreenshot();

    @Override // com.yandex.mapkit.map.OffscreenMapWindow
    public native MapWindow getMapWindow();
}
