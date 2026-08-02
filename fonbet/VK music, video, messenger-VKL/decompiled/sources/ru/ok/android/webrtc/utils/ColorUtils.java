package ru.ok.android.webrtc.utils;

import com.vk.dto.common.ImageSizeKey;
import xsna.drm0;
import xsna.ro;

/* loaded from: classes9.dex */
public final class ColorUtils {
    public static final ColorUtils INSTANCE = new ColorUtils();

    public final String colorToHex(int i) {
        ro.d(16);
        String l = Long.toString(i & 4294967295L, 16);
        return drm0.R(l, l.length() > 6 ? 8 : 6, ImageSizeKey.SIZE_KEY_UNDEFINED);
    }
}
