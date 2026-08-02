package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.InteractionType;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.adsession.media.Position;
import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.f3;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.net.URL;
import java.util.Collections;
import kotlin.Result;
import xsna.emb;
import xsna.fpf0;
import xsna.m9y;
import xsna.n9y;
import xsna.s1v;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class b {
    public final boolean a;
    public AdSession b;
    public AdEvents c;
    public MediaEvents d;

    public b(String str, String str2, boolean z) {
        Object failure;
        this.a = z;
        m9y a = n9y.a(a.a);
        try {
            AdSessionConfiguration a2 = z ? a(CreativeType.VIDEO) : a(CreativeType.NATIVE_DISPLAY);
            Partner createPartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] decode = Base64.decode(str, 0);
            f3 f3Var = decode != null ? (f3) a.a(s1v.p(a.b, fpf0.d(f3.class)), new String(decode, emb.b)) : null;
            if ((f3Var != null ? f3Var.c() : null) == null) {
                boolean z2 = u.a;
                t.b("NativeAd-OMTracker", "Invalid OMSDK data: missing vendorURL");
            } else {
                this.b = AdSession.createAdSession(a2, AdSessionContext.createNativeAdSessionContext(createPartner, str2, Collections.singletonList(VerificationScriptResource.createVerificationScriptResourceWithParameters(f3Var.b(), new URL(f3Var.c()), f3Var.a())), null, null));
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a3 = Result.a(failure);
        if (a3 != null) {
            boolean z3 = u.a;
            t.a("NativeAd-OMTracker", "error occured when create omsdk adSession:", a3);
        }
    }

    public final void a(View view) {
        Object failure;
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "start OM tracker");
        try {
            AdSession adSession = this.b;
            if (adSession != null) {
                this.c = AdEvents.createAdEvents(adSession);
                if (this.a) {
                    this.d = MediaEvents.createMediaEvents(adSession);
                }
                adSession.registerAdView(view);
                adSession.start();
                if (this.a) {
                    VastProperties createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
                    AdEvents adEvents = this.c;
                    if (adEvents != null) {
                        adEvents.loaded(createVastPropertiesForNonSkippableMedia);
                    }
                } else {
                    AdEvents adEvents2 = this.c;
                    if (adEvents2 != null) {
                        adEvents2.loaded();
                    }
                }
                failure = Integer.valueOf(t.a("NativeAd-OMTracker", "track event: loaded"));
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z2 = u.a;
            t.a("NativeAd-OMTracker", "error occured when start omsdk adSession:", a);
        }
    }

    public final void b() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onStateCompleted");
        try {
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.complete();
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public final void c() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onStatePaused");
        try {
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.pause();
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public final void d() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onStatePlay");
        try {
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.resume();
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onUserInteraction");
        try {
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(float f, float f2) {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onQuartileStart duration=" + f + " volume=" + f2);
        try {
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.start(f, f2);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(int i) {
        MediaEvents mediaEvents;
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onQuartileChanged quartile=" + i);
        try {
            if (i == 5) {
                MediaEvents mediaEvents2 = this.d;
                if (mediaEvents2 != null) {
                    mediaEvents2.firstQuartile();
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            }
            if (i != 6) {
                if (i == 7 && (mediaEvents = this.d) != null) {
                    mediaEvents.thirdQuartile();
                    s3q0 s3q0Var2 = s3q0.a;
                    return;
                }
                return;
            }
            MediaEvents mediaEvents3 = this.d;
            if (mediaEvents3 != null) {
                mediaEvents3.midpoint();
                s3q0 s3q0Var3 = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(boolean z) {
        boolean z2 = u.a;
        t.a("NativeAd-OMTracker", "track event: onMuteChanged muted=" + z);
        try {
            if (z) {
                MediaEvents mediaEvents = this.d;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            }
            MediaEvents mediaEvents2 = this.d;
            if (mediaEvents2 != null) {
                mediaEvents2.volumeChange(1.0f);
                s3q0 s3q0Var2 = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: impressionOccurred");
        try {
            AdEvents adEvents = this.c;
            if (adEvents != null) {
                adEvents.impressionOccurred();
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
    }

    public static AdSessionConfiguration a(CreativeType creativeType) {
        ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
        Owner owner = Owner.NATIVE;
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, creativeType == CreativeType.NATIVE_DISPLAY ? Owner.NONE : owner, false);
    }
}
