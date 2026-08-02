package com.yandex.passport.internal.ui.router;

import android.os.Bundle;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class k implements j {
    public final RoadSign a;
    public final Bundle b;
    public final String c;

    public k(RoadSign roadSign, Bundle bundle, String str) {
        this.a = roadSign;
        this.b = bundle;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b.equals(kVar.b) && jl40.l(this.c, kVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteData(roadSign=");
        sb.append(this.a);
        sb.append(", bundle=");
        sb.append(this.b);
        sb.append(", correction=");
        return b64.p(sb, this.c, ')');
    }
}
