package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.CompositeIcon;
import com.yandex.mapkit.map.Icon;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes15.dex */
public class CompositeIconBinding extends PlacemarkPresentationBinding implements CompositeIcon {
    public CompositeIconBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native Icon icon(String str);

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void removeAll();

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void removeIcon(String str);

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void setIcon(String str, ImageProvider imageProvider, IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void setIcon(String str, ImageProvider imageProvider, IconStyle iconStyle, Callback callback);

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void setIconStyle(String str, IconStyle iconStyle);
}
