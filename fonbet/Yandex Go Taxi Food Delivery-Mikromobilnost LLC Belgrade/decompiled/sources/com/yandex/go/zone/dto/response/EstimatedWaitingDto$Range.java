package com.yandex.go.zone.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/response/EstimatedWaitingDto$Range", "Lcom/yandex/go/zone/dto/response/c;", "Companion", "$serializer", "com/yandex/go/zone/dto/response/b", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EstimatedWaitingDto$Range extends c {
    public static final b Companion = new b();
    public final double a;
    public final String b;

    public EstimatedWaitingDto$Range(double d, int i, String str) {
        this.a = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    @Override // com.yandex.go.zone.dto.response.c
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // com.yandex.go.zone.dto.response.c
    /* renamed from: b, reason: from getter */
    public final double getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimatedWaitingDto$Range)) {
            return false;
        }
        EstimatedWaitingDto$Range estimatedWaitingDto$Range = (EstimatedWaitingDto$Range) obj;
        return Double.compare(this.a, estimatedWaitingDto$Range.a) == 0 && jl40.l(this.b, estimatedWaitingDto$Range.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Range(seconds=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }

    public EstimatedWaitingDto$Range() {
        this.a = 0.0d;
        this.b = "";
    }
}
