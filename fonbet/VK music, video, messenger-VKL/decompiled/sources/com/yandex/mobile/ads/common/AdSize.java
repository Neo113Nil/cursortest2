package com.yandex.mobile.ads.common;

import xsna.sl9;

/* loaded from: classes8.dex */
public final class AdSize {
    private final int a;
    private final int b;

    public AdSize(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdSize.class.equals(obj.getClass())) {
            AdSize adSize = (AdSize) obj;
            if (this.a == adSize.a && this.b == adSize.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return sl9.c(this.a, this.b, "AdSize (width=", ", height=", ")");
    }
}
