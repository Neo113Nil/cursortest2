package com.yandex.plus.pay.internal.di;

import android.content.Context;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.pay.internal.di.d;
import defpackage.asd;
import defpackage.bdd0;
import defpackage.ccd0;
import defpackage.da31;
import defpackage.dbd0;
import defpackage.e5o;
import defpackage.ecd0;
import defpackage.efd0;
import defpackage.fad0;
import defpackage.ffx;
import defpackage.hhw;
import defpackage.hl21;
import defpackage.ibd0;
import defpackage.jcd0;
import defpackage.ku2;
import defpackage.lzs;
import defpackage.ndd0;
import defpackage.ocd0;
import defpackage.p5z;
import defpackage.ped0;
import defpackage.sls;
import defpackage.tyq0;
import defpackage.vbd0;
import defpackage.x75;
import defpackage.xbt;
import defpackage.xyj;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d implements efd0 {
    public final b a;
    public final fad0 b;
    public final hhw c;
    public final dbd0 d;
    public final ibd0 e;

    public d(b bVar, fad0 fad0Var, hhw hhwVar, dbd0 dbd0Var, ibd0 ibd0Var, vbd0 vbd0Var) {
        this.a = bVar;
        this.b = fad0Var;
        this.c = hhwVar;
        this.d = dbd0Var;
        this.e = ibd0Var;
    }

    public final xbt a() {
        ibd0 ibd0Var = this.e;
        return ffx.K(((ccd0) ((ecd0) ibd0Var.e.invoke())).b()) ? (com.yandex.plus.pay.internal.feature.presale.a) ibd0Var.A.getValue() : (com.yandex.plus.pay.internal.feature.presale.c) ibd0Var.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ffd0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [ffd0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [ffd0] */
    public final bdd0 b() {
        b bVar = this.a;
        String str = bVar.a;
        String str2 = bVar.b;
        String str3 = bVar.c;
        String str4 = bVar.d;
        PlusSdkBrandType plusSdkBrandType = bVar.e;
        String c = bVar.c();
        String str5 = bVar.f;
        da31 da31Var = da31.a;
        Context context = bVar.g;
        da31Var.getClass();
        Long a = da31.a(context);
        Context context2 = bVar.g;
        p5z b = bVar.b();
        com.yandex.plus.domain.auth.impl.a aVar = bVar.t;
        lzs lzsVar = bVar.k;
        e5o e5oVar = bVar.h;
        com.yandex.plus.metrica.api.a aVar2 = bVar.o;
        x75 x75Var = bVar.p;
        hl21 hl21Var = bVar.q;
        tyq0 tyq0Var = bVar.r;
        asd asdVar = bVar.s;
        ku2 ku2Var = bVar.u;
        sls slsVar = bVar.v;
        com.yandex.plus.core.benchmark.a aVar3 = bVar.w;
        dbd0 dbd0Var = this.d;
        PlusPaySdkComponentImpl$getInternalDependencies$1 plusPaySdkComponentImpl$getInternalDependencies$1 = new PlusPaySdkComponentImpl$getInternalDependencies$1(dbd0Var, dbd0.class, "okHttpClient", "getOkHttpClient()Lokhttp3/OkHttpClient;", 0);
        fad0 fad0Var = this.b;
        ndd0 ndd0Var = fad0Var.e;
        ped0 ped0Var = (ped0) fad0Var.d.getValue();
        xyj xyjVar = bVar.n;
        PlusPaySdkComponentImpl$getInternalDependencies$2 plusPaySdkComponentImpl$getInternalDependencies$2 = new PlusPaySdkComponentImpl$getInternalDependencies$2(dbd0Var, dbd0.class, "experimentsRepository", "getExperimentsRepository()Lcom/yandex/plus/experiments/api/providers/PlusExperimentsRepository;", 0);
        PlusPaySdkComponentImpl$getInternalDependencies$3 plusPaySdkComponentImpl$getInternalDependencies$3 = new PlusPaySdkComponentImpl$getInternalDependencies$3(fad0Var, fad0.class, "dwhAnalyticsReporter", "getDwhAnalyticsReporter()Lcom/yandex/plus/analytics/dwh/DwhAnalyticsReporter;", 0);
        PlusPaySdkComponentImpl$getInternalDependencies$4 plusPaySdkComponentImpl$getInternalDependencies$4 = new PlusPaySdkComponentImpl$getInternalDependencies$4(fad0Var, fad0.class, "originProvider", "getOriginProvider()Lcom/yandex/plus/pay/internal/analytics/OriginProvider;", 0);
        ocd0 d = dbd0Var.d();
        PlusPaySdkComponentImpl$getInternalDependencies$5 plusPaySdkComponentImpl$getInternalDependencies$5 = new PlusPaySdkComponentImpl$getInternalDependencies$5(this.e, ibd0.class, "resetCacheInteractor", "getResetCacheInteractor()Lcom/yandex/plus/pay/internal/feature/cache/ResetCacheInteractor;", 0);
        PlusPaySdkComponentImpl$getInternalDependencies$6 plusPaySdkComponentImpl$getInternalDependencies$6 = new PlusPaySdkComponentImpl$getInternalDependencies$6(0, bVar.A.c, jcd0.class, "getBduiGatewayHostProvider", "getBduiGatewayHostProvider()Lcom/yandex/plus/core/network/hosts/HostProvider;", 0);
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        return new bdd0(str, str2, str3, str4, plusSdkBrandType, c, str5, a, context2, b, aVar, lzsVar, e5oVar, xyjVar, aVar2, x75Var, hl21Var, tyq0Var, asdVar, ku2Var, slsVar, aVar3, plusPaySdkComponentImpl$getInternalDependencies$1, ndd0Var, ped0Var, plusPaySdkComponentImpl$getInternalDependencies$2, plusPaySdkComponentImpl$getInternalDependencies$3, plusPaySdkComponentImpl$getInternalDependencies$4, d, new PlusPaySdkComponentImpl$getInternalDependencies$7(this, null), new sls(this) { // from class: ffd0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i;
                d dVar = this.b;
                switch (i4) {
                    case 0:
                        return (Map) ((at90) dVar.b.g.getValue()).a().a;
                    case 1:
                        return ((lbd0) ((i3y) dVar.c.e).getValue()).a().a();
                    default:
                        return ((nbd0) ((i3y) dVar.c.f).getValue()).a().c();
                }
            }
        }, new sls(this) { // from class: ffd0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i2;
                d dVar = this.b;
                switch (i4) {
                    case 0:
                        return (Map) ((at90) dVar.b.g.getValue()).a().a;
                    case 1:
                        return ((lbd0) ((i3y) dVar.c.e).getValue()).a().a();
                    default:
                        return ((nbd0) ((i3y) dVar.c.f).getValue()).a().c();
                }
            }
        }, new sls(this) { // from class: ffd0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                d dVar = this.b;
                switch (i4) {
                    case 0:
                        return (Map) ((at90) dVar.b.g.getValue()).a().a;
                    case 1:
                        return ((lbd0) ((i3y) dVar.c.e).getValue()).a().a();
                    default:
                        return ((nbd0) ((i3y) dVar.c.f).getValue()).a().c();
                }
            }
        }, plusPaySdkComponentImpl$getInternalDependencies$5, plusPaySdkComponentImpl$getInternalDependencies$6);
    }
}
