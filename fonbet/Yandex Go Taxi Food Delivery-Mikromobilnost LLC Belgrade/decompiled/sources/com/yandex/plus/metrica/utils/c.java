package com.yandex.plus.metrica.utils;

import defpackage.n45;
import defpackage.oa20;
import defpackage.ra20;
import defpackage.sls;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(String str, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                oa20 oa20Var = (oa20) obj;
                ReentrantLock reentrantLock = oa20Var.h;
                ConcurrentHashMap concurrentHashMap = oa20Var.i;
                BaseMetricaFacade$getComponentHistograms$1$1$1 baseMetricaFacade$getComponentHistograms$1$1$1 = new BaseMetricaFacade$getComponentHistograms$1$1$1(0, oa20Var, d.class, "getComponentHistogramsStatus", "getComponentHistogramsStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0);
                String str = this.b;
                return oa20Var.d(str, reentrantLock, concurrentHashMap, baseMetricaFacade$getComponentHistograms$1$1$1, new n45(oa20Var, str), "ComponentHistograms");
            default:
                e eVar = (e) obj;
                return new ra20(this.b, eVar.f, new Metrica8ObjectProviders$createRtmConfigUpdater$1(0, eVar, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0));
        }
    }
}
