package com.yandex.div.evaluable.function;

import defpackage.jdc;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljdc;", "color", "", "invoke-cIhhviA", "(I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class ColorAlphaComponentGetter$1 extends Lambda implements tls {
    public static final ColorAlphaComponentGetter$1 w = new ColorAlphaComponentGetter$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Integer.valueOf(((jdc) obj).a >>> 24);
    }
}
