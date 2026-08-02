package com.yandex.go.benefits_center.activation.data.model;

import com.yandex.go.benefits_center.data.model.BenefitsCenterBanner;
import com.yandex.go.benefits_center.data.model.c;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/activation/data/model/BenefitActivationResponse;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/activation/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitActivationResponse {
    public static final b Companion = new b();
    public final BenefitsCenterBanner a;

    static {
        c cVar = BenefitsCenterBanner.Companion;
    }

    public /* synthetic */ BenefitActivationResponse(int i, BenefitsCenterBanner benefitsCenterBanner) {
        if ((i & 1) == 0) {
            this.a = new BenefitsCenterBanner(0);
        } else {
            this.a = benefitsCenterBanner;
        }
    }

    /* renamed from: a, reason: from getter */
    public final BenefitsCenterBanner getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitActivationResponse) && jl40.l(this.a, ((BenefitActivationResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BenefitActivationResponse(banner=" + this.a + Extension.C_BRAKE;
    }

    public BenefitActivationResponse() {
        this.a = new BenefitsCenterBanner(0);
    }
}
