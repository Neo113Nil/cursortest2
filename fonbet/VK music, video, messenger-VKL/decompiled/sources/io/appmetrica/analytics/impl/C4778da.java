package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4778da {
    public final String a;
    public final int b;
    public final boolean c;

    public C4778da(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4778da.class == obj.getClass()) {
            C4778da c4778da = (C4778da) obj;
            if (this.b != c4778da.b || this.c != c4778da.c) {
                return false;
            }
            String str = this.a;
            String str2 = c4778da.a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }

    public C4778da(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
