package com.yandex.passport.api;

import java.util.EnumSet;
import java.util.Map;

/* loaded from: classes8.dex */
public interface z0 {
    Map getFilterRules();

    s1 getPartitions();

    t0 getPrimaryEnvironment();

    t0 getSecondaryTeamEnvironment();

    EnumSet getSupportedAccountTypes();
}
