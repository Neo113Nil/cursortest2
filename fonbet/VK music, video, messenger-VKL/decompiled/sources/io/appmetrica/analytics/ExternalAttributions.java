package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C5092pe;
import io.appmetrica.analytics.impl.C5115qb;
import io.appmetrica.analytics.impl.C5195te;
import io.appmetrica.analytics.impl.Mc;
import io.appmetrica.analytics.impl.V9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(@Nullable Object obj) {
        return obj == null ? new C5092pe(V9.ADJUST) : new C5195te(V9.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(@Nullable Map<String, String> map) {
        return map == null ? new C5092pe(V9.AIRBRIDGE) : new Mc(V9.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(@Nullable Map<String, Object> map) {
        return map == null ? new C5092pe(V9.APPSFLYER) : new Mc(V9.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(@Nullable JSONObject jSONObject) {
        return jSONObject == null ? new C5092pe(V9.KOCHAVA) : new C5115qb(V9.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(@Nullable Map<String, Object> map) {
        return map == null ? new C5092pe(V9.SINGULAR) : new Mc(V9.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(@Nullable Map<String, String> map) {
        return map == null ? new C5092pe(V9.TENJIN) : new Mc(V9.TENJIN, map);
    }
}
