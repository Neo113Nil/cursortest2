package com.yandex.div.core.image;

import android.content.Context;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.brm0;
import xsna.drm0;

/* compiled from: DivImageLoaderWrapper.kt */
/* loaded from: classes7.dex */
public final class DivImageLoaderWrapper implements DivImageLoader {
    private final List<DivImageUrlModifier> modifiers = Collections.singletonList(new DivImageAssetUrlModifier());
    private final DivImageLoader providedImageLoader;
    private final SvgDivImageLoader svgImageLoader;

    public DivImageLoaderWrapper(DivImageLoader divImageLoader, Context context) {
        this.providedImageLoader = divImageLoader;
        this.svgImageLoader = !divImageLoader.hasSvgSupport().booleanValue() ? new SvgDivImageLoader(context) : null;
    }

    private final String getModifiedUrl(String str) {
        Iterator<T> it = this.modifiers.iterator();
        while (it.hasNext()) {
            str = ((DivImageUrlModifier) it.next()).modifyImageUrl(str);
        }
        return str;
    }

    private final DivImageLoader getProperLoader(String str) {
        return (this.svgImageLoader == null || !isSvg(str)) ? this.providedImageLoader : this.svgImageLoader;
    }

    private final boolean isSvg(String str) {
        int L = drm0.L(str, '?', 0, 6);
        if (L < 0) {
            L = str.length();
        }
        return brm0.v(str.substring(0, L), ".svg", false);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        String modifiedUrl = getModifiedUrl(str);
        return getProperLoader(modifiedUrl).loadImage(modifiedUrl, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback) {
        String modifiedUrl = getModifiedUrl(str);
        return getProperLoader(modifiedUrl).loadImageBytes(modifiedUrl, divImageDownloadCallback);
    }
}
