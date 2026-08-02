package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import kotlin.NoWhenBranchMatchedException;
import xsna.cxs;
import xsna.gi0;

/* compiled from: AdRequestsAnalytics.kt */
/* loaded from: classes6.dex */
public final class vh0 {
    public final xh0 a;
    public final AdRequestEvent.RequestType b;

    /* compiled from: AdRequestsAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRequestPurpose.values().length];
            try {
                iArr[AdRequestPurpose.SHOW_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdRequestPurpose.CHECK_INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdRequestPurpose.LOAD_INITIAL_INSTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdRequestPurpose.LOAD_NEXT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vh0(xh0 xh0Var, AdRequestEvent.RequestType requestType) {
        this.a = xh0Var;
        this.b = requestType;
    }

    public static void c(vh0 vh0Var, String str, ei0 ei0Var, j11 j11Var) {
        AdRequestPurpose adRequestPurpose = AdRequestPurpose.SHOW_INSTANCE;
        vh0Var.getClass();
        AdRequestEvent.AdFormat adFormat = ei0Var.getAdFormat();
        AdRequestEvent.RequestType requestType = vh0Var.b;
        AdRequestEvent.RequestSubtype e = e(adRequestPurpose);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.SHOW;
        int i = j11Var.a;
        String str2 = j11Var.b;
        Integer valueOf = Integer.valueOf(i);
        xh0 xh0Var = vh0Var.a;
        gi0.a aVar = ei0Var.a;
        xh0Var.a(new AdRequestEvent(adFormat, str, eventType, requestType, e, valueOf, str2, Integer.valueOf(aVar.d), Integer.valueOf(aVar.a), null, null));
    }

    public static AdRequestEvent.RequestSubtype e(AdRequestPurpose adRequestPurpose) {
        int i = a.$EnumSwitchMapping$0[adRequestPurpose.ordinal()];
        if (i == 1) {
            return AdRequestEvent.RequestSubtype.SHOW;
        }
        if (i == 2) {
            return AdRequestEvent.RequestSubtype.CHECK;
        }
        if (i == 3) {
            return AdRequestEvent.RequestSubtype.PRELOAD;
        }
        if (i == 4) {
            return AdRequestEvent.RequestSubtype.LOAD_NEXT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(String str, fi0 fi0Var, AdRequestPurpose adRequestPurpose) {
        AdRequestEvent.AdFormat adFormat = fi0Var.getAdFormat();
        AdRequestEvent.RequestSubtype e = e(adRequestPurpose);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.LOAD;
        Integer valueOf = Integer.valueOf(fi0Var.a());
        this.a.a(new AdRequestEvent(adFormat, str, eventType, this.b, e, null, null, Integer.valueOf(fi0Var.getAdSource()), valueOf, null, null));
    }

    public final void b(String str, fi0 fi0Var, AdRequestPurpose adRequestPurpose, j11 j11Var) {
        AdRequestEvent.AdFormat adFormat = fi0Var.getAdFormat();
        AdRequestEvent.RequestSubtype e = e(adRequestPurpose);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.LOAD;
        int i = j11Var.a;
        String str2 = j11Var.b;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(fi0Var.a());
        this.a.a(new AdRequestEvent(adFormat, str, eventType, this.b, e, valueOf, str2, Integer.valueOf(fi0Var.getAdSource()), valueOf2, null, null));
    }

    public final void d(String str, fi0 fi0Var, AdRequestPurpose adRequestPurpose) {
        AdRequestEvent.AdFormat adFormat = fi0Var.getAdFormat();
        AdRequestEvent.RequestSubtype e = e(adRequestPurpose);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.SHOW;
        Integer valueOf = Integer.valueOf(fi0Var.a());
        this.a.a(new AdRequestEvent(adFormat, str, eventType, this.b, e, null, null, Integer.valueOf(fi0Var.getAdSource()), valueOf, null, null));
    }

    public final void f(boolean z, String str, ei0 ei0Var, xf0 xf0Var) {
        Float f;
        String str2;
        Float l;
        gi0.a aVar = ei0Var.a;
        xh0 xh0Var = this.a;
        if (!z) {
            xh0Var.a(new AdRequestEvent(ei0Var.getAdFormat(), str, AdRequestEvent.EventType.IMPRESSION, this.b, AdRequestEvent.RequestSubtype.SHOW, 402, "Ad closed before impression", Integer.valueOf(aVar.d), Integer.valueOf(aVar.a), null, null));
            return;
        }
        AdRequestEvent.AdFormat adFormat = ei0Var.getAdFormat();
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.IMPRESSION;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        if (xf0Var != null) {
            cxs.b bVar = xf0Var.a;
            String str3 = bVar.b;
            float floatValue = (str3 == null || (l = arm0.l(str3)) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : l.floatValue();
            str2 = bVar.a;
            f = Float.valueOf(floatValue);
        } else {
            f = null;
            str2 = null;
        }
        xh0Var.a(new AdRequestEvent(adFormat, str, eventType, this.b, requestSubtype, null, null, Integer.valueOf(aVar.d), Integer.valueOf(aVar.a), f, str2));
    }
}
