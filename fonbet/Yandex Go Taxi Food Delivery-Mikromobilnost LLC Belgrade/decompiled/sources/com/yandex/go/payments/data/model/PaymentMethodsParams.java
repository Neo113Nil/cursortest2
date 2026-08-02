package com.yandex.go.payments.data.model;

import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/PaymentMethodsParams;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsParams {
    public static final b0 Companion = new b0();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(9))};
    public final String a;
    public final zzs b;
    public final List c;

    public PaymentMethodsParams(int i, zzs zzsVar, String str, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = Collections.singletonList("family");
        } else {
            this.c = list;
        }
    }

    public PaymentMethodsParams() {
        this(7, null, null);
    }

    public PaymentMethodsParams(int i, zzs zzsVar, String str) {
        str = (i & 1) != 0 ? null : str;
        zzsVar = (i & 2) != 0 ? null : zzsVar;
        List singletonList = Collections.singletonList("family");
        this.a = str;
        this.b = zzsVar;
        this.c = singletonList;
    }
}
