package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5015mf {
    public final String a;
    public final JSONObject b;
    public final EnumC4801e8 c;

    public C5015mf(String str, JSONObject jSONObject, EnumC4801e8 enumC4801e8) {
        this.a = str;
        this.b = jSONObject;
        this.c = enumC4801e8;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.a + "', additionalParams=" + this.b + ", source=" + this.c + '}';
    }
}
