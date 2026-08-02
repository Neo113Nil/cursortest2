package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/TaxiOrderAdditionalData;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/p1", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderAdditionalData {
    public static final p1 Companion = new p1();
    public static final TaxiOrderAdditionalData c = new TaxiOrderAdditionalData(null, null);
    public final DriverPictures a;
    public final String b;

    public /* synthetic */ TaxiOrderAdditionalData(int i, DriverPictures driverPictures, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = driverPictures;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final n7v a() {
        n7v n7vVar;
        DriverPictures driverPictures = this.a;
        return (driverPictures == null || (n7vVar = driverPictures.a) == null) ? n7v.f : n7vVar;
    }

    public final TaxiOrderAdditionalData b(DriverPictures driverPictures) {
        return new TaxiOrderAdditionalData(driverPictures, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderAdditionalData)) {
            return false;
        }
        TaxiOrderAdditionalData taxiOrderAdditionalData = (TaxiOrderAdditionalData) obj;
        return jl40.l(this.a, taxiOrderAdditionalData.a) && jl40.l(this.b, taxiOrderAdditionalData.b);
    }

    public final int hashCode() {
        DriverPictures driverPictures = this.a;
        int hashCode = (driverPictures == null ? 0 : driverPictures.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TaxiOrderAdditionalData(driverPictures=" + this.a + ", commentFeedbackModalTitle=" + this.b + Extension.C_BRAKE;
    }

    public TaxiOrderAdditionalData(DriverPictures driverPictures, String str) {
        this.a = driverPictures;
        this.b = str;
    }

    public TaxiOrderAdditionalData() {
        this(null, null);
    }
}
