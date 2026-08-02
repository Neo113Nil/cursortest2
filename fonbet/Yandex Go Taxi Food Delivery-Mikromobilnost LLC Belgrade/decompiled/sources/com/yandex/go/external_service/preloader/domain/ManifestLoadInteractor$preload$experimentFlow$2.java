package com.yandex.go.external_service.preloader.domain;

import android.content.Context;
import com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment;
import com.yandex.go.external_service.preloader.data.models.RepositoryConfiguration$BundleStrategy;
import defpackage.b7u0;
import defpackage.d7u0;
import defpackage.f6u0;
import defpackage.g6u0;
import defpackage.hst;
import defpackage.jst;
import defpackage.mc;
import defpackage.me00;
import defpackage.ne00;
import defpackage.p4j0;
import defpackage.v6u0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ManifestLoadInteractor$preload$experimentFlow$2 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RepositoryConfiguration$BundleStrategy repositoryConfiguration$BundleStrategy;
        SuperAppConfigEatsKitStaticExperiment superAppConfigEatsKitStaticExperiment = (SuperAppConfigEatsKitStaticExperiment) obj;
        g gVar = (g) this.receiver;
        gVar.getClass();
        int i = me00.a[superAppConfigEatsKitStaticExperiment.g.ordinal()];
        if (i == 1) {
            repositoryConfiguration$BundleStrategy = RepositoryConfiguration$BundleStrategy.NORMAL;
        } else if (i == 2) {
            repositoryConfiguration$BundleStrategy = RepositoryConfiguration$BundleStrategy.PRELOAD;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            repositoryConfiguration$BundleStrategy = RepositoryConfiguration$BundleStrategy.IGNORE;
        }
        ne00 ne00Var = gVar.a;
        p4j0 p4j0Var = new p4j0(ne00Var.c.a(), RepositoryConfiguration$BundleStrategy.NORMAL, superAppConfigEatsKitStaticExperiment.c, superAppConfigEatsKitStaticExperiment.d);
        com.yandex.go.external_service.preloader.data.a aVar = ne00Var.d;
        if (!p4j0Var.equals(aVar != null ? aVar.a : null)) {
            b7u0 b7u0Var = ne00Var.b;
            Long valueOf = Long.valueOf(p4j0Var.e);
            b7u0Var.getClass();
            ne00Var.d = new com.yandex.go.external_service.preloader.data.a(p4j0Var, new gom.yandex.go.web.statics.data.b(new File(b7u0Var.a.getCacheDir(), "eatskitstatic/manifests"), valueOf), (v6u0) ne00Var.a.a.a.get());
        }
        d7u0 d7u0Var = gVar.b;
        p4j0 p4j0Var2 = new p4j0(d7u0Var.d.a(), repositoryConfiguration$BundleStrategy, superAppConfigEatsKitStaticExperiment.e, superAppConfigEatsKitStaticExperiment.f);
        com.yandex.go.external_service.preloader.data.b bVar = d7u0Var.e;
        if (!p4j0Var2.equals(bVar != null ? bVar.a : null)) {
            b7u0 b7u0Var2 = d7u0Var.b;
            Long valueOf2 = Long.valueOf(p4j0Var2.e);
            b7u0Var2.getClass();
            gom.yandex.go.web.statics.data.b bVar2 = new gom.yandex.go.web.statics.data.b(new File(b7u0Var2.a.getCacheDir(), "eatskitstatic/statics"), valueOf2);
            g6u0 g6u0Var = d7u0Var.c;
            g6u0Var.getClass();
            f6u0 f6u0Var = new f6u0(g6u0Var.a.getAssets());
            mc mcVar = d7u0Var.a.a;
            d7u0Var.e = new com.yandex.go.external_service.preloader.data.b(p4j0Var2, bVar2, f6u0Var, (v6u0) mcVar.a.get(), (Context) mcVar.b.get());
        }
        hst hstVar = jst.e;
        Objects.toString(repositoryConfiguration$BundleStrategy);
        hstVar.getClass();
        return zy11.a;
    }
}
