package com.yandex.go.payments.shared.business.accountcreation.corp.checklogin;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/checklogin/ClientInfoResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/checklogin/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClientInfoResponse {
    public static final a Companion = new a();
    public final Role a;
    public final Boolean b;

    public /* synthetic */ ClientInfoResponse(int i, Role role, Boolean bool) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ClientInfoResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = role;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }
}
