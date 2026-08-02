package com.yandex.go.benefits_center.benefits.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qje;
import defpackage.tt4;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/data/model/BenefitCenterRequestBody;", "", "Companion", "PaymentInfo", "GeoState", "$serializer", "com/yandex/go/benefits_center/benefits/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitCenterRequestBody {
    public static final a Companion = new a();
    public final PaymentInfo a;
    public final GeoState b;
    public final String c;

    public /* synthetic */ BenefitCenterRequestBody(int i, PaymentInfo paymentInfo, GeoState geoState, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, BenefitCenterRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = paymentInfo;
        this.b = geoState;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitCenterRequestBody)) {
            return false;
        }
        BenefitCenterRequestBody benefitCenterRequestBody = (BenefitCenterRequestBody) obj;
        return jl40.l(this.a, benefitCenterRequestBody.a) && jl40.l(this.b, benefitCenterRequestBody.b) && jl40.l(this.c, benefitCenterRequestBody.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BenefitCenterRequestBody(benefitActivationPaymentInfo=");
        sb.append(this.a);
        sb.append(", geoState=");
        sb.append(this.b);
        sb.append(", activePromo=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/data/model/BenefitCenterRequestBody$PaymentInfo;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/benefits/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentInfo {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ PaymentInfo(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, BenefitCenterRequestBody$PaymentInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentInfo)) {
                return false;
            }
            PaymentInfo paymentInfo = (PaymentInfo) obj;
            return jl40.l(this.a, paymentInfo.a) && jl40.l(this.b, paymentInfo.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return unr0.p("PaymentInfo(paymentMethodId=", this.a, ", type=", this.b, Extension.C_BRAKE);
        }

        public PaymentInfo(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/data/model/BenefitCenterRequestBody$GeoState;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/benefits/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class GeoState {
        public static final b Companion = new b();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(22))};
        public final float a;
        public final String b;
        public final List c;

        public /* synthetic */ GeoState(float f, int i, String str, List list) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, BenefitCenterRequestBody$GeoState$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = f;
            this.b = str;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeoState)) {
                return false;
            }
            GeoState geoState = (GeoState) obj;
            return Float.compare(this.a, geoState.a) == 0 && jl40.l(this.b, geoState.b) && jl40.l(this.c, geoState.c);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.a) * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GeoState(accuracy=");
            sb.append(this.a);
            sb.append(", zoneName=");
            sb.append(this.b);
            sb.append(", location=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        public GeoState(float f, String str, List list) {
            this.a = f;
            this.b = str;
            this.c = list;
        }
    }

    public BenefitCenterRequestBody(PaymentInfo paymentInfo, GeoState geoState, String str) {
        this.a = paymentInfo;
        this.b = geoState;
        this.c = str;
    }
}
