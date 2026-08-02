package com.yandex.go.benefits_center.benefits.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xm5;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/benefits_center/benefits/data/model/BenefitsCenterBduiPayload$NavigationAction$OpenActivation", "Lxm5;", "Companion", "$serializer", "com/yandex/go/benefits_center/benefits/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitsCenterBduiPayload$NavigationAction$OpenActivation implements xm5 {
    public static final e Companion = new e();
    public final String a;

    public /* synthetic */ BenefitsCenterBduiPayload$NavigationAction$OpenActivation(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsCenterBduiPayload$NavigationAction$OpenActivation) && jl40.l(this.a, ((BenefitsCenterBduiPayload$NavigationAction$OpenActivation) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenActivation(code=", this.a, Extension.C_BRAKE);
    }

    public BenefitsCenterBduiPayload$NavigationAction$OpenActivation(String str) {
        this.a = str;
    }

    public BenefitsCenterBduiPayload$NavigationAction$OpenActivation() {
        this(null);
    }
}
