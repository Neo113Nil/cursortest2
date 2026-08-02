package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.sss;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/GetCurrenciesResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCurrenciesResponse {
    public static final h Companion = new h();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sss(6))};
    public final List a;

    public /* synthetic */ GetCurrenciesResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public GetCurrenciesResponse() {
        this.a = EmptyList.a;
    }
}
