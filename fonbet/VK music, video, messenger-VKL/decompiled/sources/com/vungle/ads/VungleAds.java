package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.w2;
import com.vungle.ads.internal.z2;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class VungleAds {
    public static final String TAG = "VungleAds";
    public static final Companion Companion = new Companion(null);
    public static z2 a = new z2();
    public static w2 b = new w2();
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final void deInit(Context context) {
            VungleAds.b.a();
        }

        public final void getBiddingToken(Context context, BidTokenCallback bidTokenCallback) {
            VungleAds.a.getClass();
            z2.a(context, bidTokenCallback);
        }

        public final String getSdkVersion() {
            VungleAds.a.getClass();
            return BuildConfig.VERSION_NAME;
        }

        public final void init(Context context, String str, InitializationListener initializationListener) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            VungleAds.b.a(context, str, initializationListener);
        }

        public final boolean isInitialized() {
            return VungleAds.b.a.get();
        }

        public final boolean isInline(String str) {
            ConfigManager.INSTANCE.getClass();
            i3 a = ConfigManager.a(str);
            if (a != null) {
                return a.f();
            }
            return false;
        }

        public final void setIntegrationName(String str, String str2) {
            VungleAds.b.a(str, str2);
        }

        public Companion() {
        }
    }

    public static final void deInit(Context context) {
        Companion.deInit(context);
    }

    public static final void getBiddingToken(Context context, BidTokenCallback bidTokenCallback) {
        Companion.getBiddingToken(context, bidTokenCallback);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, InitializationListener initializationListener) {
        Companion.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final boolean isInline(String str) {
        return Companion.isInline(str);
    }

    public static final void setIntegrationName(String str, String str2) {
        Companion.setIntegrationName(str, str2);
    }
}
