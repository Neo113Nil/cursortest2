package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;
import xsna.epx;

/* loaded from: classes8.dex */
public final class Af implements InterfaceC4827f8 {

    @Nullable
    public final String a;

    @NonNull
    public final JSONObject b;
    public final boolean c;
    public final boolean d;

    @NonNull
    public final EnumC4801e8 e;

    public Af(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2, @NonNull EnumC4801e8 enumC4801e8) {
        this.a = str;
        this.b = jSONObject;
        this.c = z;
        this.d = z2;
        this.e = enumC4801e8;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4827f8
    @NonNull
    public final EnumC4801e8 a() {
        return this.e;
    }

    @Nullable
    public final JSONObject b() {
        if (!this.c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            if (this.b.length() > 0) {
                jSONObject.put("additionalParams", this.b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            jSONObject.put("additionalParams", this.b);
            jSONObject.put("wasSet", this.c);
            jSONObject.put("autoTracking", this.d);
            jSONObject.put("source", this.e.a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.a + "', additionalParameters=" + this.b + ", wasSet=" + this.c + ", autoTrackingEnabled=" + this.d + ", source=" + this.e + '}';
    }

    @NonNull
    public static Af a(@Nullable JSONObject jSONObject) {
        EnumC4801e8 enumC4801e8;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC4801e8[] values = EnumC4801e8.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                enumC4801e8 = null;
                break;
            }
            enumC4801e8 = values[i];
            if (epx.f(enumC4801e8.a, optStringOrNull2)) {
                break;
            }
            i++;
        }
        if (enumC4801e8 == null) {
            enumC4801e8 = EnumC4801e8.b;
        }
        return new Af(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, enumC4801e8);
    }
}
