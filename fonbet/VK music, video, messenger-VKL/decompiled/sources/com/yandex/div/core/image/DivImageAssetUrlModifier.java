package com.yandex.div.core.image;

import xsna.brm0;
import xsna.drm0;

/* compiled from: DivImageAssetUrlModifier.kt */
/* loaded from: classes7.dex */
public final class DivImageAssetUrlModifier implements DivImageUrlModifier {
    @Override // com.yandex.div.core.image.DivImageUrlModifier
    public String modifyImageUrl(String str) {
        return brm0.B(str, "divkit-asset", false) ? "file:///android_asset/divkit/".concat(drm0.U(str, "divkit-asset://")) : str;
    }
}
