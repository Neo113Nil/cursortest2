package com.ybsdk.core.utils;

import android.graphics.Color;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.ybsdk.core.utils.ColorModel;
import defpackage.gvu0;
import defpackage.x4c;

/* loaded from: classes2.dex */
public final class b {
    public static ColorModel.Hex a(String str) {
        String str2;
        if (str != null) {
            try {
                Character v0 = gvu0.v0(str);
                if (v0 != null && v0.charValue() == '#') {
                    str2 = str;
                    return new ColorModel.Hex(Color.parseColor(str2));
                }
                str2 = ShimmerDivHandler.NUMBER_SING.concat(str);
                return new ColorModel.Hex(Color.parseColor(str2));
            } catch (IllegalArgumentException e) {
                x4c.g("Unknown color", e, str, null, 8);
            }
        }
        return null;
    }
}
