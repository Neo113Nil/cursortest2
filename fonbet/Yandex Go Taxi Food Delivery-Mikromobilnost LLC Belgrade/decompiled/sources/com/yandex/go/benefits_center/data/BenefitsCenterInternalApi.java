package com.yandex.go.benefits_center.data;

import com.yandex.go.benefits_center.activation.data.model.BenefitActivationParam;
import com.yandex.go.benefits_center.activation.data.model.BenefitActivationResponse;
import com.yandex.go.benefits_center.claim.data.model.BenefitsClaimRequest;
import com.yandex.go.benefits_center.claim.data.model.BenefitsClaimResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/benefits_center/data/BenefitsCenterInternalApi;", "", "Lcom/yandex/go/benefits_center/activation/data/model/BenefitActivationParam;", "param", "Lcmt;", "Lcom/yandex/go/benefits_center/activation/data/model/BenefitActivationResponse;", "b", "(Lcom/yandex/go/benefits_center/activation/data/model/BenefitActivationParam;)Lcmt;", "Lcom/yandex/go/benefits_center/claim/data/model/BenefitsClaimRequest;", "request", "Lcom/yandex/go/benefits_center/claim/data/model/BenefitsClaimResponse;", "a", "(Lcom/yandex/go/benefits_center/claim/data/model/BenefitsClaimRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BenefitsCenterInternalApi {
    @s490("benefits-center/v1/benefits/claim")
    cmt<BenefitsClaimResponse> a(@q76 BenefitsClaimRequest request);

    @s490("benefits-center/v1/benefits/add")
    cmt<BenefitActivationResponse> b(@q76 BenefitActivationParam param);
}
