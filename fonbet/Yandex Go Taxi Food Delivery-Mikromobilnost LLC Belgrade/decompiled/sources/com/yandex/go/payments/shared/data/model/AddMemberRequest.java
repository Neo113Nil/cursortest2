package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/AddMemberRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddMemberRequest {
    public static final e Companion = new e();
    public final MemberDetails a;

    public /* synthetic */ AddMemberRequest(int i, MemberDetails memberDetails) {
        if (1 == (i & 1)) {
            this.a = memberDetails;
        } else {
            qje.Z(i, 1, AddMemberRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public AddMemberRequest(MemberDetails memberDetails) {
        this.a = memberDetails;
    }
}
