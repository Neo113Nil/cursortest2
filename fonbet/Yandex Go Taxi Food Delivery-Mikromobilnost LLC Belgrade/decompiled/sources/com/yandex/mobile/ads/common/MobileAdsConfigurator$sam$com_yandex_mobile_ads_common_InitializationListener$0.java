package com.yandex.mobile.ads.common;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MobileAdsConfigurator$sam$com_yandex_mobile_ads_common_InitializationListener$0 implements InitializationListener, jms {
    private final /* synthetic */ sls function;

    public MobileAdsConfigurator$sam$com_yandex_mobile_ads_common_InitializationListener$0(sls slsVar) {
        this.function = slsVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InitializationListener) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.mobile.ads.common.InitializationListener
    public final /* synthetic */ void onInitializationCompleted() {
        this.function.invoke();
    }
}
