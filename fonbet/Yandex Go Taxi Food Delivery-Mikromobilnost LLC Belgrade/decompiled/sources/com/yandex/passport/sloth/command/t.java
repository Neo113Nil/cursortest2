package com.yandex.passport.sloth.command;

import defpackage.jl40;
import defpackage.smw0;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t implements r {
    public final Map a;

    public t(Map map) {
        this.a = map;
    }

    @Override // com.yandex.passport.sloth.command.r
    public final String a() {
        return new JSONObject(this.a).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && jl40.l(this.a, ((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("MapResult(data="), this.a, ')');
    }
}
