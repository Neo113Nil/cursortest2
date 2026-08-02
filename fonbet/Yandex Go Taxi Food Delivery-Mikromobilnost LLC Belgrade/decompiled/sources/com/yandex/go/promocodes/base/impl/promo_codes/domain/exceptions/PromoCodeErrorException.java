package com.yandex.go.promocodes.base.impl.promo_codes.domain.exceptions;

import defpackage.jmf0;
import defpackage.wlf0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/domain/exceptions/PromoCodeErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lwlf0;", "promoCode", "Lwlf0;", "b", "()Lwlf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoCodeErrorException extends Exception {
    private final wlf0 promoCode;

    public PromoCodeErrorException(wlf0 wlf0Var) {
        this.promoCode = wlf0Var;
    }

    public final jmf0 a() {
        return this.promoCode.h;
    }

    /* renamed from: b, reason: from getter */
    public final wlf0 getPromoCode() {
        return this.promoCode;
    }
}
