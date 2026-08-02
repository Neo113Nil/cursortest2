package com.yandex.delivery.attrbutedtext.api;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class b {
    public static FormattedText a(String str, Integer num, String str2, FormattedText.FontWeight fontWeight) {
        FormattedText formattedText = FormattedText.b;
        return new FormattedText(Collections.singletonList(new h(str, FormattedText.FontStyle.NORMAL, fontWeight, num, null, null, str2, null, null, 1840)));
    }
}
