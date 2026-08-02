package com.yandex.go.platform.web_api;

import com.adjust.sdk.Constants;
import defpackage.sls;
import defpackage.vez0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationType$Companion$1 extends Lambda implements sls {
    public static final NavigationType$Companion$1 w = new NavigationType$Companion$1(0);

    @Override // defpackage.sls
    public final Object invoke() {
        return vez0.g("com.yandex.go.platform.web_api.NavigationType", NavigationType.values(), new String[]{"external_deeplink", "internal_deeplink", Constants.PUSH}, new Annotation[][]{null, null, null});
    }
}
