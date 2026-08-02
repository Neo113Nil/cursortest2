package com.yandex.div.internal.expressions;

import defpackage.jdc;
import defpackage.tls;
import defpackage.wwg;
import defpackage.xfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Ljdc;", "invoke-C4zCDoM", "(Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class DivExpressionParser$ANY_TO_COLOR$1 extends Lambda implements tls {
    public static final DivExpressionParser$ANY_TO_COLOR$1 w = new DivExpressionParser$ANY_TO_COLOR$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue;
        if (obj instanceof String) {
            intValue = wwg.B((String) obj);
        } else if (obj instanceof jdc) {
            intValue = ((jdc) obj).a;
        } else {
            if (!(obj instanceof Integer)) {
                xfo.h("Received value of wrong type");
                return null;
            }
            intValue = ((Number) obj).intValue();
        }
        return new jdc(intValue);
    }
}
