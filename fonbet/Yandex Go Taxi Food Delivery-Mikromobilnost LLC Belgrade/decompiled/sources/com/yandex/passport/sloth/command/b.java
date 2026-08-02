package com.yandex.passport.sloth.command;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements r {
    public final JSONObject a;

    public b(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.yandex.passport.sloth.command.r
    public final String a() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JSONObjectResult(data=" + this.a + ')';
    }
}
