package com.yandex.go.benefits_center.claim.data.model;

import com.yandex.go.benefits_center.data.model.BenefitsCenterBanner;
import com.yandex.go.benefits_center.data.model.c;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/claim/data/model/BenefitsClaimResponse;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/claim/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitsClaimResponse {
    public static final b Companion = new b();
    public final BenefitsCenterBanner a;

    static {
        c cVar = BenefitsCenterBanner.Companion;
    }

    public /* synthetic */ BenefitsClaimResponse(int i, BenefitsCenterBanner benefitsCenterBanner) {
        if ((i & 1) == 0) {
            this.a = new BenefitsCenterBanner(0);
        } else {
            this.a = benefitsCenterBanner;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsClaimResponse) && jl40.l(this.a, ((BenefitsClaimResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BenefitsClaimResponse(banner=" + this.a + Extension.C_BRAKE;
    }

    public BenefitsClaimResponse() {
        this.a = new BenefitsCenterBanner(0);
    }
}
