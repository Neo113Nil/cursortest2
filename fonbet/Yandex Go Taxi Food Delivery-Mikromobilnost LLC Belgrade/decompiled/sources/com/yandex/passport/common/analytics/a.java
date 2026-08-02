package com.yandex.passport.common.analytics;

import android.os.Build;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static void c() {
        String str = Build.MANUFACTURER;
    }

    public static void d() {
        String str = Build.MODEL;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && this.d.equals(aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode3 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticalCharacteristics(deviceLanguage=");
        sb.append(this.a);
        sb.append(", deviceCellProvider=");
        sb.append(this.b);
        sb.append(", deviceGeoLocation=");
        sb.append(this.c);
        sb.append(", applicationPackageName=");
        sb.append(this.d);
        sb.append(", applicationVersion=");
        sb.append(this.e);
        sb.append(", applicationClid=");
        return b64.p(sb, this.f, ')');
    }
}
