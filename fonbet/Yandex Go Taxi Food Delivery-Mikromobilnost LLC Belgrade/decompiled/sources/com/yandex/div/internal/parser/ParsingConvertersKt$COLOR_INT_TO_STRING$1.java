package com.yandex.div.internal.parser;

import defpackage.jdc;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParsingConvertersKt$COLOR_INT_TO_STRING$1 extends Lambda implements tls {
    public static final ParsingConvertersKt$COLOR_INT_TO_STRING$1 w = new ParsingConvertersKt$COLOR_INT_TO_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return jdc.a(((Number) obj).intValue());
    }
}
