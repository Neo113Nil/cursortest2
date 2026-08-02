package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.common.core.Environment;

/* loaded from: classes15.dex */
public final class m0 implements n0 {
    public final Environment a;

    public m0(Environment environment) {
        this.a = environment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.a == ((m0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnUpdateNetworkCache(environment=" + this.a + ')';
    }
}
