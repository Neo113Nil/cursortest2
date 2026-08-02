package com.yandex.go.benefits_center.claim.data.model;

import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitPaymentInfo;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/claim/data/model/BenefitsClaimRequest;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/claim/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitsClaimRequest {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final BenefitGeoState d;
    public final BenefitPaymentInfo e;

    static {
        com.yandex.go.benefits_center.data.model.a aVar = BenefitGeoState.Companion;
    }

    public /* synthetic */ BenefitsClaimRequest(int i, String str, String str2, String str3, BenefitGeoState benefitGeoState, BenefitPaymentInfo benefitPaymentInfo) {
        if (24 != (i & 24)) {
            qje.Z(i, 24, BenefitsClaimRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        this.d = benefitGeoState;
        this.e = benefitPaymentInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitsClaimRequest)) {
            return false;
        }
        BenefitsClaimRequest benefitsClaimRequest = (BenefitsClaimRequest) obj;
        return jl40.l(this.a, benefitsClaimRequest.a) && jl40.l(this.b, benefitsClaimRequest.b) && jl40.l(this.c, benefitsClaimRequest.c) && jl40.l(this.d, benefitsClaimRequest.d) && jl40.l(this.e, benefitsClaimRequest.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        BenefitGeoState benefitGeoState = this.d;
        int hashCode = (b + (benefitGeoState == null ? 0 : benefitGeoState.hashCode())) * 31;
        BenefitPaymentInfo benefitPaymentInfo = this.e;
        return hashCode + (benefitPaymentInfo != null ? benefitPaymentInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BenefitsClaimRequest(source=", this.a, ", adminRewardId=", this.b, ", rewardId=");
        v.append(this.c);
        v.append(", geoState=");
        v.append(this.d);
        v.append(", paymentInfo=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public BenefitsClaimRequest(String str, String str2, String str3, BenefitGeoState benefitGeoState, BenefitPaymentInfo benefitPaymentInfo) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = benefitGeoState;
        this.e = benefitPaymentInfo;
    }
}
