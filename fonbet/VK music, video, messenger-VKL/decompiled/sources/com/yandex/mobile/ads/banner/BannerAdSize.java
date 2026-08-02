package com.yandex.mobile.ads.banner;

import android.content.Context;
import xsna.epx;
import xsna.zcl;
import yads.d13;
import yads.e13;
import yads.ov0;
import yads.xj2;

/* loaded from: classes8.dex */
public final class BannerAdSize extends xj2 {
    public static final a a = new a(null);
    private final e13 b;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final BannerAdSize fixedSize(Context context, int i, int i2) {
            return new BannerAdSize(new ov0(i, i2, d13.c, null));
        }

        private a() {
        }
    }

    public BannerAdSize(e13 e13Var) {
        this.b = e13Var;
    }

    public final e13 a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !BannerAdSize.class.equals(obj.getClass())) {
            return false;
        }
        return epx.f(this.b, ((BannerAdSize) obj).b);
    }

    public final int getHeight() {
        return this.b.getHeight();
    }

    public final int getWidth() {
        return this.b.getWidth();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString();
    }
}
