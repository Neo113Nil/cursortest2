package io.appmetrica.analytics.coreapi.internal.identifiers;

import xsna.epx;

/* loaded from: classes8.dex */
public final class AppSetId {
    private final String a;
    private final AppSetIdScope b;

    public AppSetId(String str, AppSetIdScope appSetIdScope) {
        this.a = str;
        this.b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appSetId.a;
        }
        if ((i & 2) != 0) {
            appSetIdScope = appSetId.b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final String component1() {
        return this.a;
    }

    public final AppSetIdScope component2() {
        return this.b;
    }

    public final AppSetId copy(String str, AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return epx.f(this.a, appSetId.a) && this.b == appSetId.b;
    }

    public final String getId() {
        return this.a;
    }

    public final AppSetIdScope getScope() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "AppSetId(id=" + this.a + ", scope=" + this.b + ')';
    }
}
