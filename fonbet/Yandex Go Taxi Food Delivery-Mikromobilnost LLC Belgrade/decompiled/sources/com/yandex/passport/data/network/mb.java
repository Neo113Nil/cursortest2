package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.core.sync.SyncAdapter;
import defpackage.bvf0;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kl40;
import defpackage.ku2;
import defpackage.mdh;
import defpackage.n1r;
import defpackage.ph41;
import defpackage.sjh;
import defpackage.ueo;
import defpackage.uyj;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class mb implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final xvf0 c;

    public /* synthetic */ mb(xvf0 xvf0Var, yvf0 yvf0Var, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return new ib((com.yandex.passport.data.network.core.p) yvf0Var.get(), (com.yandex.passport.data.network.core.h) xvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.e((Context) yvf0Var.get(), (com.yandex.passport.internal.helper.g) xvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.config.h((com.yandex.passport.internal.config.e) yvf0Var.get(), (com.yandex.passport.common.common.a) xvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.core.accounts.r((Context) yvf0Var.get(), (com.yandex.passport.internal.storage.i) xvf0Var.get());
            case 4:
                return new SyncAdapter((Context) yvf0Var.get(), (com.yandex.passport.internal.core.accounts.a) xvf0Var.get());
            case 5:
                Context context = (Context) yvf0Var.get();
                dxf0 dxf0Var = new dxf0(new ph41(5, (com.yandex.passport.internal.report.reporters.z0) xvf0Var.get()));
                ku2 ku2Var = new ku2(context, 21);
                sjh sjhVar = uyj.a;
                return new androidx.datastore.preferences.core.a(new androidx.datastore.preferences.core.a(androidx.datastore.core.b.a(new n1r(kl40.E, new ueo(4, ku2Var)), dxf0Var, EmptyList.a, bvf0.a(mdh.b.plus(jl40.a())))));
            case 6:
                return new com.yandex.passport.internal.network.d((com.yandex.passport.internal.network.e) yvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) xvf0Var.get());
            case 7:
                return new com.yandex.passport.internal.provider.communication.k((com.yandex.passport.internal.provider.communication.u) yvf0Var.get(), (com.yandex.passport.internal.provider.communication.l) xvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.provider.communication.u((Context) yvf0Var.get(), (com.yandex.passport.internal.provider.communication.r) xvf0Var.get());
            case 9:
                return new com.yandex.passport.internal.report.g((com.yandex.passport.internal.e) xvf0Var.get(), (com.yandex.passport.internal.properties.p) yvf0Var.get());
            case 10:
                return new com.yandex.passport.internal.report.diary.b((com.yandex.passport.common.a) yvf0Var.get(), (com.yandex.passport.internal.report.diary.c) xvf0Var.get());
            case 11:
                return new com.yandex.passport.internal.report.diary.n((com.yandex.passport.internal.database.diary.e) xvf0Var.get(), (com.yandex.passport.common.coroutine.a) yvf0Var.get());
            case 12:
                return new com.yandex.passport.internal.report.reporters.w((com.yandex.passport.internal.report.j) xvf0Var.get(), (com.yandex.passport.internal.features.a) yvf0Var.get());
            case 13:
                return new com.yandex.passport.internal.rotation.g((Context) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.i0) xvf0Var.get());
            case 14:
                return new com.yandex.passport.internal.sloth.performers.k((com.yandex.passport.internal.sloth.credentialmanager.d) xvf0Var.get(), (Context) yvf0Var.get());
            case 15:
                return new com.yandex.passport.internal.sloth.performers.n((com.yandex.passport.internal.sloth.credentialmanager.d) xvf0Var.get(), (Context) yvf0Var.get());
            case 16:
                return new com.yandex.passport.internal.sloth.performers.o((com.yandex.passport.internal.sloth.webauthn.c) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.j1) xvf0Var.get());
            case 17:
                return new com.yandex.passport.internal.sloth.performers.q((com.yandex.passport.internal.sloth.webauthn.c) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.j1) xvf0Var.get());
            case 18:
                return new com.yandex.passport.internal.sloth.performers.webcard.a((com.yandex.passport.internal.sloth.performers.webcard.g) yvf0Var.get(), (com.yandex.passport.internal.usecase.ui.n) xvf0Var.get());
            case 19:
                return new com.yandex.passport.internal.usecase.ui.i((com.yandex.passport.common.coroutine.a) yvf0Var.get(), (com.yandex.passport.internal.usecase.ui.j) xvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.o0((com.yandex.passport.common.coroutine.a) yvf0Var.get(), (com.yandex.passport.internal.usecase.ui.p0) xvf0Var.get());
        }
    }

    public /* synthetic */ mb(yvf0 yvf0Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = xvf0Var;
    }
}
