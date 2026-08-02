package com.yandex.go.benefits_center.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.qje;
import defpackage.tt4;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/data/model/BenefitGeoState;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitGeoState {
    public static final a Companion = new a();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(23))};
    public final int a;
    public final String b;
    public final List c;

    public /* synthetic */ BenefitGeoState(int i, int i2, String str, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, BenefitGeoState$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitGeoState)) {
            return false;
        }
        BenefitGeoState benefitGeoState = (BenefitGeoState) obj;
        return this.a == benefitGeoState.a && jl40.l(this.b, benefitGeoState.b) && jl40.l(this.c, benefitGeoState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(unr0.v(this.a, "BenefitGeoState(accuracy=", ", zoneName=", this.b, ", location="), this.c, Extension.C_BRAKE);
    }

    public BenefitGeoState(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }
}
