package com.yandex.mapkit.map;

import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;

/* loaded from: classes15.dex */
public interface Icon extends PlacemarkPresentation {
    IconStyle getStyle();

    void setImage(ImageProvider imageProvider);

    void setImage(ImageProvider imageProvider, IconStyle iconStyle);

    void setImage(ImageProvider imageProvider, IconStyle iconStyle, Callback callback);

    void setStyle(IconStyle iconStyle);

    void setView(ViewProvider viewProvider);

    void setView(ViewProvider viewProvider, IconStyle iconStyle);

    void setView(ViewProvider viewProvider, IconStyle iconStyle, Callback callback);
}
