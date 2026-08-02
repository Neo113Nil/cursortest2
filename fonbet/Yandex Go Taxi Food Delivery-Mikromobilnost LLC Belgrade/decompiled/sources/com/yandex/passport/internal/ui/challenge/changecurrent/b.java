package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.os.Bundle;
import com.yandex.passport.internal.methods.b3;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.SetCurrentAccountPropertiesImpl;

/* loaded from: classes2.dex */
public final class b extends b3 {
    public final SetCurrentAccountPropertiesImpl b;
    public final ProgressPropertiesImpl c;

    public b(SetCurrentAccountActivity setCurrentAccountActivity, Bundle bundle) {
        super(setCurrentAccountActivity);
        SetCurrentAccountPropertiesImpl.Companion.getClass();
        SetCurrentAccountPropertiesImpl a = com.yandex.passport.internal.properties.s.a(bundle);
        this.b = a;
        this.c = a.getProgressProperties();
    }
}
