package com.yandex.go.loyalty.impl.selector.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qxz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyStateResponse;", "", "Companion", "$serializer", "com/yandex/go/loyalty/impl/selector/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyStateResponse {
    public static final k Companion = new k();
    public static final i3y[] d;
    public final LoyaltySelectorMenuDto a;
    public final LoyaltyPaymentMethodsMenuDto b;
    public final List c;

    static {
        g gVar = LoyaltySelectorMenuDto.Companion;
        d = new i3y[]{null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(0))};
    }

    public LoyaltyStateResponse(int i, LoyaltySelectorMenuDto loyaltySelectorMenuDto, LoyaltyPaymentMethodsMenuDto loyaltyPaymentMethodsMenuDto, List list) {
        if ((i & 1) == 0) {
            LoyaltySelectorMenuDto.Companion.getClass();
            loyaltySelectorMenuDto = LoyaltySelectorMenuDto.d;
        }
        this.a = loyaltySelectorMenuDto;
        if ((i & 2) == 0) {
            LoyaltyPaymentMethodsMenuDto.Companion.getClass();
            this.b = LoyaltyPaymentMethodsMenuDto.b;
        } else {
            this.b = loyaltyPaymentMethodsMenuDto;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public LoyaltyStateResponse() {
        LoyaltySelectorMenuDto.Companion.getClass();
        LoyaltySelectorMenuDto loyaltySelectorMenuDto = LoyaltySelectorMenuDto.d;
        LoyaltyPaymentMethodsMenuDto.Companion.getClass();
        this.a = loyaltySelectorMenuDto;
        this.b = LoyaltyPaymentMethodsMenuDto.b;
        this.c = EmptyList.a;
    }
}
