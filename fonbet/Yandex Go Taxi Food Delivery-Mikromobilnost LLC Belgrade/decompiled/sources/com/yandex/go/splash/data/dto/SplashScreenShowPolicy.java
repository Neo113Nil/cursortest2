package com.yandex.go.splash.data.dto;

import defpackage.gsq0;
import defpackage.jl40;
import java.util.Calendar;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/splash/data/dto/SplashScreenShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/splash/data/dto/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SplashScreenShowPolicy {
    public static final g Companion = new g();
    public final int a;
    public final Calendar b;
    public final Calendar c;
    public final String d;
    public final String e;
    public final Integer f;

    public /* synthetic */ SplashScreenShowPolicy(int i, int i2, Calendar calendar, Calendar calendar2, String str, String str2, Integer num) {
        this.a = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = calendar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = calendar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final Calendar getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashScreenShowPolicy)) {
            return false;
        }
        SplashScreenShowPolicy splashScreenShowPolicy = (SplashScreenShowPolicy) obj;
        return this.a == splashScreenShowPolicy.a && jl40.l(this.b, splashScreenShowPolicy.b) && jl40.l(this.c, splashScreenShowPolicy.c) && jl40.l(this.d, splashScreenShowPolicy.d) && jl40.l(this.e, splashScreenShowPolicy.e) && jl40.l(this.f, splashScreenShowPolicy.f);
    }

    /* renamed from: f, reason: from getter */
    public final Calendar getB() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Calendar calendar = this.b;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.c;
        int hashCode3 = (hashCode2 + (calendar2 == null ? 0 : calendar2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SplashScreenShowPolicy(maxShowCount=" + this.a + ", startDate=" + this.b + ", endDate=" + this.c + ", dailyStartTime=" + this.d + ", dailyEndTime=" + this.e + ", priority=" + this.f + Extension.C_BRAKE;
    }

    public SplashScreenShowPolicy(int i) {
        this.a = -1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public SplashScreenShowPolicy() {
        this(0);
    }
}
