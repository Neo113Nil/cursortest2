package com.yandex.div.core.widget;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectView$Companion$aspectRatioProperty$1 extends Lambda implements tls {
    public static final AspectView$Companion$aspectRatioProperty$1 w = new AspectView$Companion$aspectRatioProperty$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
