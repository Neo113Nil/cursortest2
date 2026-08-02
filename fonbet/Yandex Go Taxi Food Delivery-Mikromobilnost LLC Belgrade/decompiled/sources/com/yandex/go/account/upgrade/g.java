package com.yandex.go.account.upgrade;

import com.yandex.go.account.upgrade.ForceAccountUpgradeExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ForceAccountUpgradeExperiment.AccountType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
