package com.yandex.div.internal.parser;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "n", "", "invoke", "(Ljava/lang/Number;)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParsingConvertersKt$NUMBER_TO_DOUBLE$1 extends Lambda implements tls {
    public static final ParsingConvertersKt$NUMBER_TO_DOUBLE$1 w = new ParsingConvertersKt$NUMBER_TO_DOUBLE$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Double.valueOf(((Number) obj).doubleValue());
    }
}
