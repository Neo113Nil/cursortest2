package com.yandex.passport.internal.properties;

import com.yandex.passport.api.u1;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;

/* loaded from: classes8.dex */
public final class m {
    public static ProgressPropertiesImpl a() {
        ProgressPropertiesImpl.a aVar = new ProgressPropertiesImpl.a();
        ProgressPropertiesImpl.Companion.getClass();
        return b(aVar);
    }

    public static ProgressPropertiesImpl b(u1 u1Var) {
        return new ProgressPropertiesImpl(u1Var.getAnimation(), u1Var.getSize(), u1Var.getBackground(), u1Var.getShowCancelButton());
    }
}
