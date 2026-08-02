package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.cvw;
import defpackage.fc91;
import defpackage.h391;
import defpackage.kua1;
import defpackage.l891;
import defpackage.lxa1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.yandex.common.clid.ClidProvider;

@Deprecated
/* loaded from: classes11.dex */
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final fc91 a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(g gVar) {
        this.a = new h391(gVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                if (b == null) {
                    kua1 kua1Var = (kua1) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (kua1Var != null) {
                        b = new AppMeasurement(kua1Var);
                    } else {
                        b = new AppMeasurement(g.m(context, new zzdd(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return b;
    }

    public void beginAdUnitExposure(String str) {
        this.a.c(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.g(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.a.b(str);
    }

    public long generateEventId() {
        return this.a.zzl();
    }

    public String getAppInstanceId() {
        return this.a.zzj();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> h = this.a.h(str, str2);
        ArrayList arrayList = new ArrayList(h == null ? 0 : h.size());
        for (Bundle bundle : h) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            cvw.l(bundle);
            conditionalUserProperty.mAppId = (String) lxa1.h(bundle, CommonUrlParts.APP_ID, String.class, null);
            conditionalUserProperty.mOrigin = (String) lxa1.h(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) lxa1.h(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = lxa1.h(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) lxa1.h(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) lxa1.h(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) lxa1.h(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) lxa1.h(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) lxa1.h(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) lxa1.h(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) lxa1.h(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) lxa1.h(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) lxa1.h(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) lxa1.h(bundle, ClidProvider.APP_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) lxa1.h(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) lxa1.h(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.a.zzi();
    }

    public String getCurrentScreenName() {
        return this.a.zzh();
    }

    public String getGmpAppId() {
        return this.a.zzk();
    }

    public int getMaxUserProperties(String str) {
        return this.a.d(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.f(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.a(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        cvw.l(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(CommonUrlParts.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            lxa1.g(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(ClidProvider.APP_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.a.e(bundle);
    }

    public AppMeasurement(kua1 kua1Var) {
        this.a = new l891(kua1Var);
    }
}
