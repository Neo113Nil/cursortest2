package com.yandex.passport.sloth.command;

import defpackage.unr0;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class a implements r {
    public final boolean a;

    public a(boolean z) {
        this.a = z;
    }

    @Override // com.yandex.passport.sloth.command.r
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ACSPConstants.STATUS, String.valueOf(this.a));
        return jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("BooleanResult(data="), this.a, ')');
    }
}
