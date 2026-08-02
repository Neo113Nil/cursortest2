package com.yandex.passport.internal.storage.datastore;

import defpackage.kme0;
import kotlin.collections.EmptySet;

/* loaded from: classes15.dex */
public final class b {
    public final kme0 a;

    public b(kme0 kme0Var) {
        this.a = kme0Var;
    }

    public final kme0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !this.a.equals(((b) obj).a)) {
            return false;
        }
        EmptySet emptySet = EmptySet.a;
        return emptySet.equals(emptySet);
    }

    public final int hashCode() {
        return this.a.a.hashCode() * 31;
    }

    public final String toString() {
        return "PreferenceRequest(key=" + this.a + ", defaultValue=" + EmptySet.a + ')';
    }
}
