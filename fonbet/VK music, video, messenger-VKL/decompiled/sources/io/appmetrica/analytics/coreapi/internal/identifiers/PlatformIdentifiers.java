package io.appmetrica.analytics.coreapi.internal.identifiers;

import xsna.epx;

/* loaded from: classes8.dex */
public final class PlatformIdentifiers {
    private final SimpleAdvertisingIdGetter a;
    private final AppSetIdProvider b;

    public PlatformIdentifiers(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        this.a = simpleAdvertisingIdGetter;
        this.b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.a;
        }
        if ((i & 2) != 0) {
            appSetIdProvider = platformIdentifiers.b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final SimpleAdvertisingIdGetter component1() {
        return this.a;
    }

    public final AppSetIdProvider component2() {
        return this.b;
    }

    public final PlatformIdentifiers copy(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return epx.f(this.a, platformIdentifiers.a) && epx.f(this.b, platformIdentifiers.b);
    }

    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.a;
    }

    public final AppSetIdProvider getAppSetIdProvider() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.a + ", appSetIdProvider=" + this.b + ')';
    }
}
