package com.yandex.go.payments.addmethod.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AsyncApplicationBindingFlow;", "Lcom/yandex/go/payments/addmethod/data/model/g0;", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AsyncApplicationBindingFlow extends g0 {
    public static final e0 Companion = new e0();
    public final String a;

    public AsyncApplicationBindingFlow(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public AsyncApplicationBindingFlow() {
        this.a = "";
    }
}
