package com.yandex.passport.internal.impl;

import com.yandex.passport.internal.properties.EsiaBindProperties;
import com.yandex.passport.internal.social.esia.EsiaInternalBindProperties;

/* loaded from: classes15.dex */
public abstract class s {
    public static final EsiaInternalBindProperties.UserAwareRequest a(EsiaBindProperties esiaBindProperties) {
        return new EsiaInternalBindProperties.UserAwareRequest(com.yandex.passport.internal.util.p.B(esiaBindProperties.getUid()), esiaBindProperties.getApplication(), esiaBindProperties.getConsumer(), esiaBindProperties.getScope(), com.yandex.passport.internal.util.p.t(esiaBindProperties.getTheme()));
    }
}
