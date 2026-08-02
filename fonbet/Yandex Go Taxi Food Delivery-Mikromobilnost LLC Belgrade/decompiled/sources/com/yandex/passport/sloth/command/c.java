package com.yandex.passport.sloth.command;

import com.yandex.passport.common.web.BridgeMethod;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class c {
    public final BridgeMethod a;
    public final String b;
    public final Object c;

    public c(BridgeMethod bridgeMethod, String str, Object obj) {
        this.a = bridgeMethod;
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsCommand(method=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", data=");
        return qv10.r(sb, this.c, ')');
    }
}
