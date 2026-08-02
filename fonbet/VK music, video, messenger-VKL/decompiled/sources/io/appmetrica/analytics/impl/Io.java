package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Io {
    public final Lo a;
    public final Lo b;
    public final Jo c;
    public JSONObject d;

    public Io(Lo lo, Lo lo2, Jo jo) {
        this.a = lo;
        this.b = lo2;
        this.c = jo;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.d == null) {
                JSONObject a = this.c.a(a(this.a), a(this.b));
                this.d = a;
                a(a);
            }
            jSONObject = this.d;
            if (jSONObject == null) {
                jSONObject = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(Lo lo) {
        try {
            String a = lo.a();
            return a != null ? new JSONObject(a) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
