package com.yandex.div.internal.parser;

import defpackage.jdc;
import defpackage.tls;
import defpackage.wwg;
import defpackage.xfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "value", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParsingConvertersKt$STRING_TO_COLOR_INT$1 extends Lambda implements tls {
    public static final ParsingConvertersKt$STRING_TO_COLOR_INT$1 w = new ParsingConvertersKt$STRING_TO_COLOR_INT$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i;
        if (obj instanceof String) {
            i = wwg.B((String) obj);
        } else {
            if (!(obj instanceof jdc)) {
                xfo.h("Received value of wrong type");
                return null;
            }
            i = ((jdc) obj).a;
        }
        return Integer.valueOf(i);
    }
}
