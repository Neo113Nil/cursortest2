package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ErrorType;
import defpackage.o61;
import defpackage.opj;
import defpackage.tls;
import defpackage.xjg;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class DiscountsAddPromoCodeModalView$promoCodeInputTextWatcher$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        b bVar = (b) this.receiver;
        bVar.G.l(str);
        r0 r0Var = bVar.H;
        r0Var.getClass();
        r0Var.m(null, opj.a);
        if (str.length() == 0) {
            xjg xjgVar = bVar.y;
            boolean z = bVar.I;
            o61 o61Var = (o61) xjgVar.c;
            String value = z ? ErrorType.NETWORK.getValue() : null;
            o61Var.getClass();
            HashMap hashMap = new HashMap();
            if (value != null) {
                hashMap.put("type_error", value);
            }
            o61Var.a.a("EnterPromoCodeCard.CodeDeleted", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
