package io.appmetrica.analytics.remotepermissions.impl;

import java.util.Set;
import xsna.ur;

/* loaded from: classes8.dex */
public final class a {
    public final Set a;

    public a(Set set) {
        this.a = set;
    }

    public final String toString() {
        return ur.c(new StringBuilder("FeatureConfig(permittedPermissions="), this.a, ')');
    }
}
