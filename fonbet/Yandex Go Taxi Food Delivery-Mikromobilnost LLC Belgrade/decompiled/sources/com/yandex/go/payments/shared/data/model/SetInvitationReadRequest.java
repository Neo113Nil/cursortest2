package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/SetInvitationReadRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SetInvitationReadRequest {
    public static final s Companion = new s();
    public final boolean a;

    public /* synthetic */ SetInvitationReadRequest(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = true;
        } else {
            this.a = z;
        }
    }

    public SetInvitationReadRequest(int i) {
        this.a = true;
    }

    public SetInvitationReadRequest() {
        this(0);
    }
}
