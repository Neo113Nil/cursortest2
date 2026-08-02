package com.yandex.go.splash.data.dto;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/splash/data/dto/DynamicSplashRequestPoint;", "", "Companion", "$serializer", "com/yandex/go/splash/data/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DynamicSplashRequestPoint {
    public static final d Companion = new d();
    public final Double a;
    public final Double b;

    public /* synthetic */ DynamicSplashRequestPoint(int i, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSplashRequestPoint)) {
            return false;
        }
        DynamicSplashRequestPoint dynamicSplashRequestPoint = (DynamicSplashRequestPoint) obj;
        return jl40.l(this.a, dynamicSplashRequestPoint.a) && jl40.l(this.b, dynamicSplashRequestPoint.b);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicSplashRequestPoint(latitude=" + this.a + ", longitude=" + this.b + Extension.C_BRAKE;
    }

    public DynamicSplashRequestPoint(Double d, Double d2) {
        this.a = d;
        this.b = d2;
    }

    public DynamicSplashRequestPoint() {
        this(null, null);
    }
}
