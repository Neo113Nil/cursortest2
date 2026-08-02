package com.yandex.go.payments.paymentdomain.data;

import defpackage.acj;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/data/DomainConfigDto;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentdomain/data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DomainConfigDto {
    public static final a Companion = new a();
    public static final i3y[] d;
    public final String a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new acj(26)), kotlin.a.b(lazyThreadSafetyMode, new acj(27))};
    }

    public /* synthetic */ DomainConfigDto(int i, String str, List list, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
    }

    public DomainConfigDto(int i) {
        this.a = "";
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
    }

    public DomainConfigDto() {
        this(0);
    }
}
