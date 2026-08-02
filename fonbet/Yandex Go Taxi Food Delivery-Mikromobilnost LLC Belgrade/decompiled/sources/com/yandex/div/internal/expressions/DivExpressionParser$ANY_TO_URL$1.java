package com.yandex.div.internal.expressions;

import android.net.Uri;
import defpackage.rg21;
import defpackage.tls;
import defpackage.xfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lrg21;", "invoke-VcSV9u8", "(Ljava/lang/Object;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class DivExpressionParser$ANY_TO_URL$1 extends Lambda implements tls {
    public static final DivExpressionParser$ANY_TO_URL$1 w = new DivExpressionParser$ANY_TO_URL$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String obj2;
        if (obj instanceof String) {
            obj2 = (String) obj;
        } else if (obj instanceof rg21) {
            obj2 = ((rg21) obj).a;
        } else {
            if (!(obj instanceof Uri)) {
                xfo.h("Received value of wrong type");
                return null;
            }
            obj2 = obj.toString();
        }
        return new rg21(obj2);
    }
}
