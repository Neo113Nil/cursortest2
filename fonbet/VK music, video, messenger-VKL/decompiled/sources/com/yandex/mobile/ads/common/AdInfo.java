package com.yandex.mobile.ads.common;

import java.util.List;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes8.dex */
public final class AdInfo {
    private final String a;
    private final AdSize b;
    private final String c;
    private final List d;

    public AdInfo(String str, AdSize adSize, String str2, List<Creative> list) {
        this.a = str;
        this.b = adSize;
        this.c = str2;
        this.d = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AdInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AdInfo adInfo = (AdInfo) obj;
        return epx.f(this.a, adInfo.a) && epx.f(this.b, adInfo.b) && epx.f(this.c, adInfo.c) && epx.f(this.d, adInfo.d);
    }

    public final List<Creative> getCreatives() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AdSize adSize = this.b;
        int hashCode2 = (hashCode + (adSize != null ? adSize.hashCode() : 0)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.a;
        AdSize adSize = this.b;
        String adSize2 = adSize != null ? adSize.toString() : null;
        if (adSize2 == null) {
            adSize2 = "";
        }
        String str2 = this.c;
        String str3 = str2 != null ? str2 : "";
        int size = this.d.size();
        StringBuilder a = xe9.a("AdSize (adUnitId: ", str, ", adSize: ", adSize2, ", data: ");
        a.append(str3);
        a.append(", creatives: ");
        a.append(size);
        a.append(")");
        return a.toString();
    }
}
