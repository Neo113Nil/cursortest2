package com.yandex.go.payments.shared.business.accountcreation.corp;

import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggestRequest;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggestResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/CitySuggestApi;", "", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/CitySuggestRequest;", "info", "Lcmt;", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/CitySuggestResponse;", "a", "(Lcom/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/CitySuggestRequest;)Lcmt;", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/ClientTrialBodyParam;", "clientTrialBodyParam", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Lcom/yandex/go/payments/shared/business/accountcreation/corp/ClientTrialBodyParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CitySuggestApi {
    @s490("corp-suggest/v1/cities")
    cmt<CitySuggestResponse> a(@q76 CitySuggestRequest info);

    @s490("corp-requests/v1/register-trial")
    cmt<zy11> b(@q76 ClientTrialBodyParam clientTrialBodyParam);
}
