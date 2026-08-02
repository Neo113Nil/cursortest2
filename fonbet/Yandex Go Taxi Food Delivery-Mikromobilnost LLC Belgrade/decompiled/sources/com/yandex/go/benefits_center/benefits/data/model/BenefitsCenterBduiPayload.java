package com.yandex.go.benefits_center.benefits.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.xm5;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/data/model/BenefitsCenterBduiPayload;", "", "Companion", "xm5", "$serializer", "com/yandex/go/benefits_center/benefits/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitsCenterBduiPayload {
    public static final d Companion = new d();
    public final String a;
    public final String b;
    public final xm5 c;

    public /* synthetic */ BenefitsCenterBduiPayload(int i, String str, String str2, xm5 xm5Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, BenefitsCenterBduiPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = xm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitsCenterBduiPayload)) {
            return false;
        }
        BenefitsCenterBduiPayload benefitsCenterBduiPayload = (BenefitsCenterBduiPayload) obj;
        return jl40.l(this.a, benefitsCenterBduiPayload.a) && jl40.l(this.b, benefitsCenterBduiPayload.b) && jl40.l(this.c, benefitsCenterBduiPayload.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        xm5 xm5Var = this.c;
        return hashCode2 + (xm5Var != null ? xm5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BenefitsCenterBduiPayload(openReason=", this.a, ", title=", this.b, ", bduiNavigationAction=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public BenefitsCenterBduiPayload(String str, String str2, xm5 xm5Var) {
        this.a = str;
        this.b = str2;
        this.c = xm5Var;
    }
}
