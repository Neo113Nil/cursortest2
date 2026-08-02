package com.yandex.div.core.util.mask;

import com.vk.dto.common.ImageSizeKey;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import xsna.drm0;
import xsna.h3a0;

/* compiled from: PhoneInputMask.kt */
/* loaded from: classes7.dex */
public final class PhoneInputMaskKt {
    private static final List<BaseInputMask.MaskKey> DEFAULT_DECODING_MASK_KEY;
    private static final BaseInputMask.MaskData DEFAULT_MASK_DATA;

    static {
        List<BaseInputMask.MaskKey> singletonList = Collections.singletonList(new BaseInputMask.MaskKey(ImageSizeKey.SIZE_KEY_UNDEFINED, "\\d", '_'));
        DEFAULT_DECODING_MASK_KEY = singletonList;
        DEFAULT_MASK_DATA = new BaseInputMask.MaskData(getPhoneMaskPattern(""), singletonList, false);
    }

    public static final List<BaseInputMask.MaskKey> getDEFAULT_DECODING_MASK_KEY() {
        return DEFAULT_DECODING_MASK_KEY;
    }

    public static final BaseInputMask.MaskData getDEFAULT_MASK_DATA() {
        return DEFAULT_MASK_DATA;
    }

    public static final String getPhoneMaskPattern(String str) {
        if (drm0.N(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = h3a0.a;
        int i = 0;
        while (true) {
            if (jSONObject.has("value")) {
                break;
            }
            String str2 = "*";
            if (i >= str.length()) {
                jSONObject = (JSONObject) jSONObject.get("*");
                break;
            }
            int i2 = i + 1;
            String valueOf = String.valueOf(str.charAt(i));
            if (jSONObject.has(valueOf)) {
                str2 = valueOf;
            }
            jSONObject = (JSONObject) jSONObject.get(str2);
            i = i2;
        }
        return jSONObject.getString("value") + "00";
    }
}
