package com.yandex.go.chargers.offer.passes.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/model/PassPurchaseParams;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/passes/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassPurchaseParams {
    public static final c Companion = new c();
    public final String a;
    public final PassPayment b;
    public final String c;
    public final Boolean d;

    static {
        b bVar = PassPayment.Companion;
    }

    public /* synthetic */ PassPurchaseParams(int i, String str, PassPayment passPayment, String str2, Boolean bool) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, PassPurchaseParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = passPayment;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public PassPurchaseParams(String str, PassPayment passPayment, String str2, Boolean bool) {
        this.a = str;
        this.b = passPayment;
        this.c = str2;
        this.d = bool;
    }
}
