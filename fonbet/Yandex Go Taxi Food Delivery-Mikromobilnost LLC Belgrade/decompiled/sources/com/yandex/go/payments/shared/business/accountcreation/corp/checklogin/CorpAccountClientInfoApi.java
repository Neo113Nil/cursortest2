package com.yandex.go.payments.shared.business.accountcreation.corp.checklogin;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.wqs;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/checklogin/CorpAccountClientInfoApi;", "", "", "personalPhoneId", "Lcmt;", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/checklogin/ClientInfoResponse;", "a", "(Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CorpAccountClientInfoApi {
    @wqs("corp-clients/v1/client-info")
    cmt<ClientInfoResponse> a(@djg0("personal_phone_id") String personalPhoneId);
}
