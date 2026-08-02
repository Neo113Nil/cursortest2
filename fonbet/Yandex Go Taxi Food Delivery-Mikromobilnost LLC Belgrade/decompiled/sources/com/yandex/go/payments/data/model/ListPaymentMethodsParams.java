package com.yandex.go.payments.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.wky;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/ListPaymentMethodsParams;", "", "Companion", "com/yandex/go/payments/data/model/v", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ListPaymentMethodsParams {
    public static final v Companion = new v();
    public static final i3y[] c;
    public static final Set d;
    public final List a;
    public final Set b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wky(11)), kotlin.a.b(lazyThreadSafetyMode, new wky(12))};
        d = Collections.singleton("yb_card_substitution");
    }

    public /* synthetic */ ListPaymentMethodsParams(int i, List list, Set set) {
        this.a = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.b = d;
        } else {
            this.b = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListPaymentMethodsParams)) {
            return false;
        }
        ListPaymentMethodsParams listPaymentMethodsParams = (ListPaymentMethodsParams) obj;
        return jl40.l(this.a, listPaymentMethodsParams.a) && jl40.l(this.b, listPaymentMethodsParams.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "ListPaymentMethodsParams(location=" + this.a + ", supportedFeatures=" + this.b + Extension.C_BRAKE;
    }

    public ListPaymentMethodsParams() {
        this(null, 3);
    }

    public ListPaymentMethodsParams(List list, int i) {
        this.a = (i & 1) != 0 ? null : list;
        this.b = d;
    }
}
