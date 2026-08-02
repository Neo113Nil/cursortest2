package com.yandex.div.core.timer;

import com.yandex.div.core.c;
import com.yandex.div.core.view2.Div2View;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class TimerController$ticker$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        b bVar = (b) this.receiver;
        bVar.h(longValue);
        Div2View div2View = bVar.e;
        if (div2View != null) {
            c.c(bVar.b, div2View, div2View.getExpressionResolver(), bVar.g, "timer");
        }
        return zy11.a;
    }
}
