package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.report.zd;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes2.dex */
public final class e implements v7p {
    public final /* synthetic */ int a;
    public final d b;

    public /* synthetic */ e(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                return dVar.a;
            case 1:
                return dVar.a;
            case 2:
                return dVar.a;
            case 3:
                return dVar.c;
            case 4:
                ProgressPropertiesImpl progressPropertiesImpl = dVar.d;
                q5z.i(progressPropertiesImpl);
                return progressPropertiesImpl;
            default:
                zd zdVar = dVar.b;
                q5z.i(zdVar);
                return zdVar;
        }
    }
}
