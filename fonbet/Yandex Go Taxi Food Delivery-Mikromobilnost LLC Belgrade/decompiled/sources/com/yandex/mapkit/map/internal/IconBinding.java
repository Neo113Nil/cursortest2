package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.Icon;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;

/* loaded from: classes15.dex */
public class IconBinding extends PlacemarkPresentationBinding implements Icon {
    public IconBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.Icon
    public native IconStyle getStyle();

    @Override // com.yandex.mapkit.map.Icon
    public native void setImage(ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.Icon
    public native void setImage(ImageProvider imageProvider, IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.Icon
    public native void setImage(ImageProvider imageProvider, IconStyle iconStyle, Callback callback);

    @Override // com.yandex.mapkit.map.Icon
    public native void setStyle(IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.Icon
    public native void setView(ViewProvider viewProvider);

    @Override // com.yandex.mapkit.map.Icon
    public native void setView(ViewProvider viewProvider, IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.Icon
    public native void setView(ViewProvider viewProvider, IconStyle iconStyle, Callback callback);
}
