package com.yandex.passport.internal.entities;

import com.yandex.passport.api.PassportParameterRule;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.s1;
import com.yandex.passport.api.t0;
import com.yandex.passport.api.z0;
import com.yandex.passport.common.bitflag.EnumFlagHolder;
import defpackage.gw00;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class f {
    public static Filter a(z0 z0Var) {
        PassportEnvironmentImpl from = PassportEnvironmentImpl.from(z0Var.getPrimaryEnvironment());
        t0 secondaryTeamEnvironment = z0Var.getSecondaryTeamEnvironment();
        PassportEnvironmentImpl from2 = secondaryTeamEnvironment != null ? PassportEnvironmentImpl.from(secondaryTeamEnvironment) : null;
        EnumFlagHolder enumFlagHolder = new EnumFlagHolder(z0Var.getSupportedAccountTypes());
        s1 partitions = z0Var.getPartitions();
        Map filterRules = z0Var.getFilterRules();
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(filterRules.size()));
        for (Map.Entry entry : filterRules.entrySet()) {
            linkedHashMap.put(entry.getKey(), h.b((PassportParameterRule) entry.getValue()));
        }
        return new Filter(from, from2, enumFlagHolder, partitions, linkedHashMap);
    }
}
