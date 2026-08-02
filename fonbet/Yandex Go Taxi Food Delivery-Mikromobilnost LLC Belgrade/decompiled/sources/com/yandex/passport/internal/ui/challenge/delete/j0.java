package com.yandex.passport.internal.ui.challenge.delete;

import android.os.Bundle;
import com.yandex.passport.internal.methods.b3;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;

/* loaded from: classes2.dex */
public final class j0 extends b3 {
    public final PassportDeleteAccountPropertiesImpl b;
    public final ProgressPropertiesImpl c;

    public j0(DeleteForeverActivity deleteForeverActivity, Bundle bundle) {
        super(deleteForeverActivity);
        PassportDeleteAccountPropertiesImpl.Companion.getClass();
        PassportDeleteAccountPropertiesImpl a = com.yandex.passport.internal.properties.k.a(bundle);
        this.b = a;
        this.c = a.getProgressProperties();
    }
}
