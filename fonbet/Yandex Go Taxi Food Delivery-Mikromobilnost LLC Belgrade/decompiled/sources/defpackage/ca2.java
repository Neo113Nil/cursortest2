package defpackage;

import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;

/* loaded from: classes9.dex */
public final class ca2 {
    public final AndroidLocationProviderType a;

    public ca2(AndroidLocationProviderType androidLocationProviderType) {
        this.a = androidLocationProviderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca2) && this.a == ((ca2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "AndroidLastLocationRequest(providerType=" + this.a + ", fusedProviderPreferenceOrder=null)";
    }
}
