package io.appmetrica.analytics.billing.impl;

import defpackage.q0;
import java.util.List;
import xsna.epx;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4680a {
    public final List a;
    public final boolean b;

    public C4680a(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4680a)) {
            return false;
        }
        C4680a c4680a = (C4680a) obj;
        return epx.f(this.a, c4680a.a) && this.b == c4680a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoInappCollectingInfo(billingInfos=");
        sb.append(this.a);
        sb.append(", firstInappCheckOccurred=");
        return q0.a(sb, this.b, ')');
    }
}
