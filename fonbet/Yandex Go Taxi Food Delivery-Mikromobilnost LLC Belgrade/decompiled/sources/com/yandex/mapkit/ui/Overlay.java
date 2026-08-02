package com.yandex.mapkit.ui;

import com.yandex.mapkit.ScreenRect;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;

/* loaded from: classes15.dex */
public interface Overlay {
    boolean isValid();

    void remove();

    void setImage(ImageProvider imageProvider, ScreenRect screenRect);

    void setView(ViewProvider viewProvider, ScreenRect screenRect);
}
