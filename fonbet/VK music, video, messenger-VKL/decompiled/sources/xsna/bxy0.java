package xsna;

import java.util.Map;

/* loaded from: classes9.dex */
public final class bxy0 {
    public final Map<String, String> a;

    public bxy0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxy0)) {
            return false;
        }
        bxy0 bxy0Var = (bxy0) obj;
        bxy0Var.getClass();
        return epx.f(this.a, bxy0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 249895160;
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("ReviewAnalyticsEvent(eventName=sdkInfo, eventData="), this.a, ')');
    }
}
