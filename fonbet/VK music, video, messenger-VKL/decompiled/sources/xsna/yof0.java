package xsna;

import java.util.List;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class yof0 extends wof0 {
    public final List<zof0> a;

    public yof0(List<zof0> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yof0) && epx.f(this.a, ((yof0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wq.c("ReefWifiInfoState(wifiNetworks=", ")", this.a);
    }
}
