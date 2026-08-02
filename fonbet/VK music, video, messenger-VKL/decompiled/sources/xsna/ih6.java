package xsna;

import java.util.UUID;
import xsna.p940;
import xsna.t940;

/* compiled from: BaseMusicAnalyticsCollector.kt */
/* loaded from: classes3.dex */
public abstract class ih6<T extends t940> implements o940<T> {
    public final String b = UUID.randomUUID().toString();

    public ih6(p940.a aVar) {
        if (aVar.isValid()) {
            return;
        }
        throw new IllegalArgumentException("MusicAnalyticsCollectorConfig is invalid: " + aVar);
    }

    public final boolean equals(Object obj) {
        ih6 ih6Var = obj instanceof ih6 ? (ih6) obj : null;
        return epx.f(ih6Var != null ? ih6Var.b : null, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
