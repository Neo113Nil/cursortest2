package com.yandex.passport.sloth.command;

import defpackage.b64;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class v implements r {
    public final String a;

    public v(String str) {
        this.a = str;
    }

    @Override // com.yandex.passport.sloth.command.r
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", this.a);
        return jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a.equals(((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("StringResult(data="), this.a, ')');
    }
}
