package io.appmetrica.analytics.impl;

import xsna.vu5;

/* loaded from: classes8.dex */
public final class Mm {
    public final int a;

    public Mm(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mm) && this.a == ((Mm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.a, ')');
    }
}
