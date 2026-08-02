package com.yandex.go.scooters.passes.model;

import defpackage.aw80;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/model/PassPayment;", "", "Companion", "$serializer", "com/yandex/go/scooters/passes/model/a", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PassPayment {
    public static final a Companion = new a();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(25)), null, null};
    public final PassPaymentType a;
    public final String b;
    public final boolean c;

    public /* synthetic */ PassPayment(int i, PassPaymentType passPaymentType, String str, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, PassPayment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = passPaymentType;
        this.b = str;
        this.c = z;
    }

    public PassPayment(PassPaymentType passPaymentType, String str, boolean z) {
        this.a = passPaymentType;
        this.b = str;
        this.c = z;
    }
}
