package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/DriverPictures;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/m", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DriverPictures {
    public static final m Companion = new m();
    public static final DriverPictures c = new DriverPictures(0);
    public final n7v a;
    public final n7v b;

    public /* synthetic */ DriverPictures(int i, n7v n7vVar, n7v n7vVar2) {
        this.a = (i & 1) == 0 ? n7v.f : n7vVar;
        if ((i & 2) == 0) {
            this.b = n7v.f;
        } else {
            this.b = n7vVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverPictures)) {
            return false;
        }
        DriverPictures driverPictures = (DriverPictures) obj;
        return jl40.l(this.a, driverPictures.a) && jl40.l(this.b, driverPictures.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DriverPictures(avatarImage=" + this.a + ", profilePhoto=" + this.b + Extension.C_BRAKE;
    }

    public DriverPictures() {
        this(0);
    }

    public DriverPictures(int i) {
        n7v n7vVar = n7v.f;
        this.a = n7vVar;
        this.b = n7vVar;
    }
}
