package com.yandex.div.internal.parser;

import defpackage.tls;
import defpackage.wwg;
import defpackage.xfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "value", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParsingConvertersKt$ANY_TO_BOOLEAN$1 extends Lambda implements tls {
    public static final ParsingConvertersKt$ANY_TO_BOOLEAN$1 w = new ParsingConvertersKt$ANY_TO_BOOLEAN$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Boolean bool;
        Boolean W;
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Double) {
                    double doubleValue = number.doubleValue();
                    if (doubleValue == 0.0d) {
                        W = Boolean.FALSE;
                    } else if (doubleValue == 1.0d) {
                        W = Boolean.TRUE;
                    }
                } else {
                    W = wwg.W(number.intValue());
                }
                bool = W;
            }
            bool = null;
        }
        if (bool != null) {
            return bool;
        }
        xfo.h("Received value of wrong type");
        return null;
    }
}
