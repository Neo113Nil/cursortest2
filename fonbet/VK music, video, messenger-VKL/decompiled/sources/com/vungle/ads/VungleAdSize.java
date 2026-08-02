package com.vungle.ads;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.util.a0;
import xsna.vu5;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class VungleAdSize {
    public final int a;
    public final int b;
    public boolean c;
    public boolean d;
    public static final Companion Companion = new Companion(null);
    public static final VungleAdSize BANNER = new VungleAdSize(320, 50);
    public static final VungleAdSize BANNER_SHORT = new VungleAdSize(300, 50);
    public static final VungleAdSize BANNER_LEADERBOARD = new VungleAdSize(728, 90);
    public static final VungleAdSize MREC = new VungleAdSize(300, 250);

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final VungleAdSize getAdSizeWithWidth(Context context, int i) {
            int intValue = ((Number) a0.a(context).g()).intValue();
            if (i < 0) {
                i = 0;
            }
            VungleAdSize vungleAdSize = new VungleAdSize(i, intValue);
            if (vungleAdSize.getWidth() == 0) {
                vungleAdSize.setAdaptiveWidth$vungle_ads_release(true);
            }
            vungleAdSize.setAdaptiveHeight$vungle_ads_release(true);
            return vungleAdSize;
        }

        public final VungleAdSize getAdSizeWithWidthAndHeight(int i, int i2) {
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            VungleAdSize vungleAdSize = new VungleAdSize(i, i2);
            if (vungleAdSize.getWidth() == 0) {
                vungleAdSize.setAdaptiveWidth$vungle_ads_release(true);
            }
            if (vungleAdSize.getHeight() == 0) {
                vungleAdSize.setAdaptiveHeight$vungle_ads_release(true);
            }
            return vungleAdSize;
        }

        public final VungleAdSize getValidAdSizeFromSize(int i, int i2, String str) {
            ConfigManager.INSTANCE.getClass();
            i3 a = ConfigManager.a(str);
            if (a != null) {
                if (!a.f()) {
                    a = null;
                }
                if (a != null) {
                    return VungleAdSize.Companion.getAdSizeWithWidthAndHeight(i, i2);
                }
            }
            VungleAdSize vungleAdSize = VungleAdSize.MREC;
            if (i >= vungleAdSize.getWidth() && i2 >= vungleAdSize.getHeight()) {
                return vungleAdSize;
            }
            VungleAdSize vungleAdSize2 = VungleAdSize.BANNER_LEADERBOARD;
            if (i >= vungleAdSize2.getWidth() && i2 >= vungleAdSize2.getHeight()) {
                return vungleAdSize2;
            }
            VungleAdSize vungleAdSize3 = VungleAdSize.BANNER;
            if (i >= vungleAdSize3.getWidth() && i2 >= vungleAdSize3.getHeight()) {
                return vungleAdSize3;
            }
            VungleAdSize vungleAdSize4 = VungleAdSize.BANNER_SHORT;
            return (i < vungleAdSize4.getWidth() || i2 < vungleAdSize4.getHeight()) ? getAdSizeWithWidthAndHeight(i, i2) : vungleAdSize4;
        }

        public Companion() {
        }
    }

    public VungleAdSize(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static final VungleAdSize getAdSizeWithWidth(Context context, int i) {
        return Companion.getAdSizeWithWidth(context, i);
    }

    public static final VungleAdSize getAdSizeWithWidthAndHeight(int i, int i2) {
        return Companion.getAdSizeWithWidthAndHeight(i, i2);
    }

    public static final VungleAdSize getValidAdSizeFromSize(int i, int i2, String str) {
        return Companion.getValidAdSizeFromSize(i, i2, str);
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.a;
    }

    public final boolean isAdaptiveHeight$vungle_ads_release() {
        return this.c;
    }

    public final boolean isAdaptiveWidth$vungle_ads_release() {
        return this.d;
    }

    public final boolean isValidSize$vungle_ads_release() {
        return this.a >= 0 && this.b >= 0;
    }

    public final void setAdaptiveHeight$vungle_ads_release(boolean z) {
        this.c = z;
    }

    public final void setAdaptiveWidth$vungle_ads_release(boolean z) {
        this.d = z;
    }

    public String toString() {
        StringBuilder a = l.a("VungleAdSize(width=");
        a.append(this.a);
        a.append(", height=");
        return vu5.b(a, this.b, ')');
    }
}
