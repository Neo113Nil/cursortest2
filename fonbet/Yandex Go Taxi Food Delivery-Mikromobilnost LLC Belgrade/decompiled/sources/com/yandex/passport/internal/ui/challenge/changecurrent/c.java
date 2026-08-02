package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.SetCurrentAccountPropertiesImpl;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes15.dex */
public final class c implements v7p {
    public final /* synthetic */ int a;
    public final b b;

    public /* synthetic */ c(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                ProgressPropertiesImpl progressPropertiesImpl = bVar.c;
                q5z.i(progressPropertiesImpl);
                return progressPropertiesImpl;
            default:
                SetCurrentAccountPropertiesImpl setCurrentAccountPropertiesImpl = bVar.b;
                q5z.i(setCurrentAccountPropertiesImpl);
                return setCurrentAccountPropertiesImpl;
        }
    }
}
