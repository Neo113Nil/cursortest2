package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PersistedArgs.kt */
/* loaded from: classes2.dex */
public final class ny90 {
    public final JSONObject a;

    /* compiled from: PersistedArgs.kt */
    public static final class a {
        public static ny90 a(String str) {
            return new ny90(new JSONObject(str));
        }
    }

    public ny90(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final boolean a(String str) {
        return this.a.getBoolean(str);
    }

    public final double b(String str) {
        return this.a.getDouble(str);
    }

    public final int c(String str) {
        return this.a.getInt(str);
    }

    public final ArrayList d(String str) {
        return f370.J(this.a.getJSONArray(str));
    }

    public final long e(String str) {
        return this.a.getLong(str);
    }

    public final String f(String str) {
        return this.a.getString(str);
    }

    public final boolean g(String str) {
        return this.a.has(str);
    }

    public final boolean h(String str) {
        return this.a.optBoolean(str, false);
    }

    public final String i(String str, String str2) {
        return this.a.optString(str, str2);
    }

    public final void j(String str, boolean z) {
        this.a.put(str, z);
    }

    public final void k(String str, double d) {
        this.a.put(str, d);
    }

    public final void l(String str, int i) {
        this.a.put(str, i);
    }

    public final void m(String str, List<Integer> list) {
        this.a.put(str, new JSONArray((Collection) list));
    }

    public final void n(String str, long j) {
        this.a.put(str, j);
    }

    public final void o(String str, String str2) {
        this.a.put(str, str2);
    }

    public ny90() {
        this(new JSONObject());
    }
}
