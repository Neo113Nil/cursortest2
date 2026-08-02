package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/SetCommonLimitRequest;", "", "Companion", "com/yandex/go/payments/shared/data/model/q", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SetCommonLimitRequest {
    public static final q Companion = new q();
    public final Long a;
    public final boolean b;

    public /* synthetic */ SetCommonLimitRequest(int i, Long l, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, SetCommonLimitRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = l;
        this.b = z;
    }

    public SetCommonLimitRequest(Long l, boolean z) {
        this.a = l;
        this.b = z;
    }
}
