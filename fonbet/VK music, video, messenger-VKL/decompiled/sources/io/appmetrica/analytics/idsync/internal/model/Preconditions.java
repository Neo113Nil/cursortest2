package io.appmetrica.analytics.idsync.internal.model;

/* loaded from: classes8.dex */
public final class Preconditions {
    private final NetworkType a;

    public Preconditions(NetworkType networkType) {
        this.a = networkType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Preconditions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.a == ((Preconditions) obj).a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.Preconditions");
    }

    public final NetworkType getNetworkType() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Preconditions(networkType=" + this.a + ')';
    }
}
