package com.yandex.mobile.ads.common;

import xsna.epx;
import xsna.i5s;
import xsna.kh10;

/* loaded from: classes8.dex */
public final class AdRequestError {
    private final int a;
    private final String b;
    private final String c;

    public AdRequestError(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AdRequestError.class.equals(obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.a == adRequestError.a && epx.f(this.c, adRequestError.c)) {
            return epx.f(this.b, adRequestError.b);
        }
        return false;
    }

    public final int getCode() {
        return this.a;
    }

    public final String getDescription() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + this.a) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        if (str2 == null) {
            str2 = "";
        }
        return i5s.a(kh10.a(i, "AdRequestError (code: ", ", description: ", str, ", adUnitId: "), str2, ")");
    }
}
