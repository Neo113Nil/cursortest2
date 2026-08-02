package com.yandex.go.scooters.passes.data.model;

import com.yandex.go.scooters.passes.model.PassPayment;
import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/PassUpdateAutorenewParams;", "", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PassUpdateAutorenewParams {
    public static final a Companion = new a();
    public final String a;
    public final boolean b;
    public final PassPayment c;

    public /* synthetic */ PassUpdateAutorenewParams(int i, String str, boolean z, PassPayment passPayment) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, PassUpdateAutorenewParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = passPayment;
    }

    public PassUpdateAutorenewParams(String str, boolean z, PassPayment passPayment) {
        this.a = str;
        this.b = z;
        this.c = passPayment;
    }
}
