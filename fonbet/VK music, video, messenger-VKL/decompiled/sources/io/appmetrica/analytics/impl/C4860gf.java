package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4860gf extends Jd implements Lo {
    public static final long d = 0;
    public static final int e = -1;
    public static final String f = "";
    public static final String g = "";
    public static final String r = "SESSION_";
    public static final Cif h = new Cif("PERMISSIONS_CHECK_TIME", null);
    public static final Cif i = new Cif("PROFILE_ID", null);
    public static final Cif j = new Cif("APP_ENVIRONMENT", null);
    public static final Cif k = new Cif("APP_ENVIRONMENT_REVISION", null);
    public static final Cif l = new Cif("LAST_APP_VERSION_WITH_FEATURES", null);
    public static final Cif m = new Cif("APPLICATION_FEATURES", null);
    public static final Cif n = new Cif("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final Cif o = new Cif("VITAL_DATA", null);
    public static final Cif p = new Cif("SENT_EXTERNAL_ATTRIBUTIONS", null);
    public static final Cif q = new Cif("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);
    public static final Cif s = new Cif("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C4860gf(Ta ta) {
        super(ta);
    }

    public final C4860gf a(C4897i0 c4897i0) {
        synchronized (this) {
            b(j.b, c4897i0.a);
            b(k.b, c4897i0.b);
        }
        return this;
    }

    public final void b(boolean z) {
        b(s.b, z);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4886hf
    @NonNull
    public final Set<String> c() {
        return this.a.a();
    }

    public final C4897i0 d() {
        C4897i0 c4897i0;
        synchronized (this) {
            c4897i0 = new C4897i0(this.a.getString(j.b, "{}"), this.a.getLong(k.b, 0L));
        }
        return c4897i0;
    }

    public final String e() {
        return this.a.getString(m.b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.a.getString(q.b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @NonNull
    public final List<String> g() {
        String str = n.b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.a.getInt(l.b, -1);
    }

    public final long i() {
        return this.a.getLong(h.b, 0L);
    }

    @Nullable
    public final String j() {
        return this.a.getString(i.b, null);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.a.getString(p.b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(p.b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.a.getString(new Cif(r, str).b, "");
    }

    public final C4860gf i(String str) {
        return (C4860gf) b(m.b, str);
    }

    public final C4860gf j(@Nullable String str) {
        return (C4860gf) b(i.b, str);
    }

    public final C4860gf e(String str, String str2) {
        return (C4860gf) b(new Cif(r, str).b, str2);
    }

    public final C4860gf a(long j2) {
        return (C4860gf) b(h.b, j2);
    }

    @Override // io.appmetrica.analytics.impl.Jd
    @NonNull
    public final String f(@NonNull String str) {
        return new Cif(str, null).b;
    }

    public final C4860gf a(int i2) {
        return (C4860gf) b(l.b, i2);
    }

    public final C4860gf a(List<String> list) {
        return (C4860gf) a(n.b, list);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(s.b, z);
    }

    @Override // io.appmetrica.analytics.impl.Lo
    @Nullable
    public final String a() {
        return this.a.getString(o.b, null);
    }

    @Override // io.appmetrica.analytics.impl.Lo
    public final void a(@NonNull String str) {
        b(o.b, str);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(q.b, jSONObject.toString());
    }
}
