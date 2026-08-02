package com.vungle.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import xsna.zcl;

/* loaded from: classes7.dex */
public class AdConfig {
    public static final int AUTO_ROTATE = 2;
    public static final Companion Companion = new Companion(null);
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    public int b;
    public LinkedHashMap a = new LinkedHashMap();
    public int c = 2;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Orientation {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Settings {
    }

    public final int getAdOrientation() {
        return this.c;
    }

    public final int getSettings() {
        return this.b;
    }

    public final String getWatermark$vungle_ads_release() {
        return (String) this.a.get("WATERMARK");
    }

    public final void setAdOrientation(int i) {
        this.c = i;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z) {
        this.b = z ? this.b | 2 : this.b & (-3);
    }

    public final void setWatermark(String str) {
        this.a.put("WATERMARK", str);
    }

    @Orientation
    public static /* synthetic */ void getAdOrientation$annotations() {
    }
}
