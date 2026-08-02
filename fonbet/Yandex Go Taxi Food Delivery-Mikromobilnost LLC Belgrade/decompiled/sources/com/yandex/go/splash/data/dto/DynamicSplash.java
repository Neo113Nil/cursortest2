package com.yandex.go.splash.data.dto;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.tvl;
import defpackage.unr0;
import defpackage.vfc;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/splash/data/dto/DynamicSplash;", "", "Companion", "$serializer", "com/yandex/go/splash/data/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DynamicSplash {
    public static final c Companion = new c();
    public static final i3y[] m;
    public final String a;
    public final SplashScreenType b;
    public final String c;
    public final String d;
    public final String e;
    public final SplashScreenShowPolicy f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final Map k;
    public final float l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new tvl(19)), null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tvl(20))};
    }

    public /* synthetic */ DynamicSplash(int i, String str, SplashScreenType splashScreenType, String str2, String str3, String str4, SplashScreenShowPolicy splashScreenShowPolicy, int i2, int i3, int i4, String str5, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = SplashScreenType.DYNAMIC_PROMO;
        } else {
            this.b = splashScreenType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = new SplashScreenShowPolicy(0);
        } else {
            this.f = splashScreenShowPolicy;
        }
        if ((i & 64) == 0) {
            this.g = 500;
        } else {
            this.g = i2;
        }
        if ((i & 128) == 0) {
            this.h = 500;
        } else {
            this.h = i3;
        }
        if ((i & 256) == 0) {
            this.i = 300;
        } else {
            this.i = i4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = kotlin.collections.b.f();
        } else {
            this.k = map;
        }
        this.l = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSplash)) {
            return false;
        }
        DynamicSplash dynamicSplash = (DynamicSplash) obj;
        return jl40.l(this.a, dynamicSplash.a) && this.b == dynamicSplash.b && jl40.l(this.c, dynamicSplash.c) && jl40.l(this.d, dynamicSplash.d) && jl40.l(this.e, dynamicSplash.e) && jl40.l(this.f, dynamicSplash.f) && this.g == dynamicSplash.g && this.h == dynamicSplash.h && this.i == dynamicSplash.i && jl40.l(this.j, dynamicSplash.j) && jl40.l(this.k, dynamicSplash.k) && Float.compare(this.l, dynamicSplash.l) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int b = oyr.b(this.i, oyr.b(this.h, oyr.b(this.g, (this.f.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31), 31), 31);
        String str4 = this.j;
        return Float.hashCode(this.l) + unr0.d((b + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicSplash(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", textColor=");
        g8e.D(sb, this.c, ", topImageTag=", this.d, ", backgroundImageTag=");
        sb.append(this.e);
        sb.append(", showPolicy=");
        sb.append(this.f);
        sb.append(", contentAppearDuration=");
        vfc.u(this.g, this.h, ", contentFreezeDuration=", ", fadeDuration=", sb);
        smw0.t(this.i, ", text=", this.j, ", analyticsPayload=", sb);
        sb.append(this.k);
        sb.append(", transparentPartHeight=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public DynamicSplash(String str, SplashScreenType splashScreenType, String str2, String str3, String str4, SplashScreenShowPolicy splashScreenShowPolicy, int i, int i2, int i3, String str5, Map map, float f) {
        this.a = str;
        this.b = splashScreenType;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = splashScreenShowPolicy;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str5;
        this.k = map;
        this.l = f;
    }

    public DynamicSplash() {
        this("", SplashScreenType.DYNAMIC_PROMO, (String) null, (String) null, (String) null, new SplashScreenShowPolicy(0), 500, 500, 300, (String) null, kotlin.collections.b.f(), 0.0f);
    }
}
