package com.yandex.mobile.ads.common;

import xsna.epx;
import xsna.ss9;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class Creative {
    private final String a;
    private final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public Creative() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Creative)) {
            return false;
        }
        Creative creative = (Creative) obj;
        return epx.f(this.a, creative.a) && epx.f(this.b, creative.b);
    }

    public final String getCreativeId() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ss9.a("Creative(creativeId=", this.a, ", campaignId=", this.b, ")");
    }

    public Creative(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ Creative(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
