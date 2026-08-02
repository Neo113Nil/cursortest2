package com.vungle.ads;

import xsna.ozl;

@ozl
/* loaded from: classes7.dex */
public enum BannerAdSize {
    VUNGLE_MREC("mrec", 300, 250),
    BANNER("banner", 320, 50),
    BANNER_SHORT("banner_short", 300, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

    public final String a;
    public final int b;
    public final int c;

    BannerAdSize(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int getHeight() {
        return this.c;
    }

    public final String getSizeName() {
        return this.a;
    }

    public final int getWidth() {
        return this.b;
    }
}
