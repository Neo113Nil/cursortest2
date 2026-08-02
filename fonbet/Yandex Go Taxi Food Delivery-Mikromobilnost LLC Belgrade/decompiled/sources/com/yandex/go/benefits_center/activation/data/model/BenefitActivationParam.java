package com.yandex.go.benefits_center.activation.data.model;

import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitPaymentInfo;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/activation/data/model/BenefitActivationParam;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/activation/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitActivationParam {
    public static final a Companion = new a();
    public final BenefitPaymentInfo a;
    public final BenefitGeoState b;
    public final String c;

    static {
        com.yandex.go.benefits_center.data.model.a aVar = BenefitGeoState.Companion;
    }

    public /* synthetic */ BenefitActivationParam(int i, BenefitPaymentInfo benefitPaymentInfo, BenefitGeoState benefitGeoState, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, BenefitActivationParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = benefitPaymentInfo;
        this.b = benefitGeoState;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitActivationParam)) {
            return false;
        }
        BenefitActivationParam benefitActivationParam = (BenefitActivationParam) obj;
        return jl40.l(this.a, benefitActivationParam.a) && jl40.l(this.b, benefitActivationParam.b) && jl40.l(this.c, benefitActivationParam.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BenefitActivationParam(benefitPaymentInfo=");
        sb.append(this.a);
        sb.append(", geoState=");
        sb.append(this.b);
        sb.append(", code=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public BenefitActivationParam(BenefitGeoState benefitGeoState, BenefitPaymentInfo benefitPaymentInfo, String str) {
        this.a = benefitPaymentInfo;
        this.b = benefitGeoState;
        this.c = str;
    }
}
