package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class az31 extends sh3 {
    public final String f;
    public final ServerMessageRef g;
    public final String h;

    public az31(String str, ServerMessageRef serverMessageRef, String str2, ly31 ly31Var, long j) {
        super(ly31Var, j);
        this.f = str;
        this.g = serverMessageRef;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof az31)) {
            return false;
        }
        az31 az31Var = (az31) obj;
        return jl40.l(this.f, az31Var.f) && jl40.l(this.g, az31Var.g);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
