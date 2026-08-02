package com.yandex.passport.internal.di.module;

import com.yandex.passport.data.network.e9;
import com.yandex.passport.data.network.nc;
import com.yandex.passport.internal.usecase.ui.v;
import defpackage.n3w;
import defpackage.v7p;

/* loaded from: classes8.dex */
public final class c implements v7p {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a) obj).getClass();
                return "7.55.1";
            case 1:
                return new com.yandex.passport.internal.flags.experiments.f((com.yandex.passport.internal.flags.experiments.d) ((q) obj).get());
            case 2:
                return new com.yandex.passport.internal.helper.g((com.yandex.passport.internal.properties.p) ((n3w) obj).a);
            case 3:
                return new com.yandex.passport.internal.network.mappers.h((com.yandex.passport.data.mapper.a) ((r) obj).get());
            case 4:
                return new com.yandex.passport.internal.sloth.d((v) ((e9) obj).get());
            case 5:
                return new com.yandex.passport.internal.sloth.performers.m((com.yandex.passport.internal.core.accounts.p) ((nc) obj).get());
            default:
                return new com.yandex.passport.internal.ui.account_upgrade.g((com.yandex.passport.internal.upgrader.c) ((com.yandex.passport.data.network.core.i) obj).get());
        }
    }
}
