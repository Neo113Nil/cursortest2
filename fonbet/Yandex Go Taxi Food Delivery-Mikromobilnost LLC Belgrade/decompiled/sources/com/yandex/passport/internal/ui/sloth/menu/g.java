package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.UserMenuProperties;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes15.dex */
public final class g implements v7p {
    public final /* synthetic */ int a;
    public final f b;

    public /* synthetic */ g(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                return fVar.a;
            case 1:
                ProgressPropertiesImpl progressPropertiesImpl = fVar.c;
                q5z.i(progressPropertiesImpl);
                return progressPropertiesImpl;
            default:
                UserMenuProperties userMenuProperties = fVar.b;
                q5z.i(userMenuProperties);
                return userMenuProperties;
        }
    }
}
