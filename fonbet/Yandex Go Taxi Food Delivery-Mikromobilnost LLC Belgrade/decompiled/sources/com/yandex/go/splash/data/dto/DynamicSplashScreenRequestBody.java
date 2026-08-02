package com.yandex.go.splash.data.dto;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/splash/data/dto/DynamicSplashScreenRequestBody;", "", "Companion", "$serializer", "com/yandex/go/splash/data/dto/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DynamicSplashScreenRequestBody {
    public static final e Companion = new e();
    public final DynamicSplashRequestPoint a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;

    public /* synthetic */ DynamicSplashScreenRequestBody(int i, DynamicSplashRequestPoint dynamicSplashRequestPoint, String str, String str2, Integer num, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = dynamicSplashRequestPoint;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSplashScreenRequestBody)) {
            return false;
        }
        DynamicSplashScreenRequestBody dynamicSplashScreenRequestBody = (DynamicSplashScreenRequestBody) obj;
        return jl40.l(this.a, dynamicSplashScreenRequestBody.a) && jl40.l(this.b, dynamicSplashScreenRequestBody.b) && jl40.l(this.c, dynamicSplashScreenRequestBody.c) && jl40.l(this.d, dynamicSplashScreenRequestBody.d) && jl40.l(this.e, dynamicSplashScreenRequestBody.e) && jl40.l(this.f, dynamicSplashScreenRequestBody.f);
    }

    public final int hashCode() {
        DynamicSplashRequestPoint dynamicSplashRequestPoint = this.a;
        int hashCode = (dynamicSplashRequestPoint == null ? 0 : dynamicSplashRequestPoint.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicSplashScreenRequestBody(pointA=");
        sb.append(this.a);
        sb.append(", ultimaMode=");
        sb.append(this.b);
        sb.append(", chooseUltimaAppearanceMode=");
        vfc.w(this.d, this.c, ", userPowerPrc=", ", userPluggedState=", sb);
        return g8e.r(sb, this.e, ", perfClass=", this.f, Extension.C_BRAKE);
    }

    public DynamicSplashScreenRequestBody(DynamicSplashRequestPoint dynamicSplashRequestPoint, String str, String str2, Integer num, String str3, String str4) {
        this.a = dynamicSplashRequestPoint;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = str3;
        this.f = str4;
    }

    public DynamicSplashScreenRequestBody() {
        this(null, null, null, null, null, null);
    }
}
