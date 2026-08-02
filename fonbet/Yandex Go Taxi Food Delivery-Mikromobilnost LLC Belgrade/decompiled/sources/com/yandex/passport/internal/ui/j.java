package com.yandex.passport.internal.ui;

import com.yandex.passport.internal.methods.b3;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.report.reporters.q0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l1;
import com.yandex.passport.internal.ui.challenge.ChallengeActivity;
import com.yandex.passport.sloth.y0;
import com.yandex.passport.sloth.z0;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes2.dex */
public final class j implements v7p {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (ChallengeActivity) ((b3) obj).a;
            case 1:
                return new l1((com.yandex.passport.internal.usecase.ui.e) ((q0) obj).get());
            case 2:
                ProgressPropertiesImpl progressPropertiesImpl = ((com.yandex.passport.internal.ui.challenge.logout.c) obj).b;
                q5z.i(progressPropertiesImpl);
                return progressPropertiesImpl;
            case 3:
                return new y0((com.yandex.passport.sloth.dependencies.d) ((com.yandex.passport.sloth.dependencies.c) obj).get());
            default:
                return new z0((com.yandex.passport.sloth.dependencies.g) ((com.yandex.passport.sloth.dependencies.c) obj).get());
        }
    }
}
