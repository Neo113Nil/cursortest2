package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import defpackage.ag70;
import defpackage.atx0;
import defpackage.cvw;
import defpackage.d3w;
import defpackage.esw;
import defpackage.i091;
import defpackage.i971;
import defpackage.j091;
import defpackage.o8g0;
import defpackage.ouy;
import defpackage.pm2;
import defpackage.pui0;
import defpackage.puy;
import defpackage.qz40;
import defpackage.r530;
import defpackage.udq0;
import defpackage.ust;
import defpackage.ysx0;
import defpackage.zm2;
import defpackage.zsx0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class c extends ust {
    public static final zm2 k = new zm2("ModuleInstall.API", new esw(4), new pm2());

    public final zzw e(ag70... ag70VarArr) {
        int i = 0;
        cvw.d("Please provide at least one OptionalModuleApi.", ag70VarArr.length > 0);
        for (ag70 ag70Var : ag70VarArr) {
            cvw.m(ag70Var, "Requested API must not be null.");
        }
        ApiFeatureRequest zaa = ApiFeatureRequest.zaa(Arrays.asList(ag70VarArr), false);
        if (zaa.getApiFeatures().isEmpty()) {
            return udq0.p(new ModuleAvailabilityResponse(true, 0));
        }
        ysx0 a = zsx0.a();
        a.c = new Feature[]{i091.a};
        a.d = 27301;
        a.b = false;
        a.a = new b(this, zaa, i);
        return d(0, a.a());
    }

    public final Task f(r530 r530Var) {
        final ApiFeatureRequest fromModuleInstallRequest = ApiFeatureRequest.fromModuleInstallRequest(r530Var);
        final d3w d3wVar = r530Var.b;
        if (fromModuleInstallRequest.getApiFeatures().isEmpty()) {
            return udq0.p(new ModuleInstallResponse(0));
        }
        int i = 1;
        if (d3wVar == null) {
            ysx0 a = zsx0.a();
            a.c = new Feature[]{i091.a};
            a.b = true;
            a.d = 27304;
            a.a = new b(this, fromModuleInstallRequest, i);
            return d(0, a.a());
        }
        ouy a2 = puy.a(this.f, d3wVar, d3w.class.getSimpleName());
        final zaab zaabVar = new zaab(a2);
        final AtomicReference atomicReference = new AtomicReference();
        pui0 pui0Var = new pui0() { // from class: com.google.android.gms.common.moduleinstall.internal.a
            @Override // defpackage.pui0
            public final void accept(Object obj, Object obj2) {
                AtomicReference atomicReference2 = atomicReference;
                d3w d3wVar2 = d3wVar;
                ((zaf) ((j091) obj).i()).zag(new zau(c.this, atomicReference2, (atx0) obj2, d3wVar2), fromModuleInstallRequest, zaabVar);
            }
        };
        b bVar = new b(this, zaabVar, 2);
        qz40 a3 = o8g0.a();
        a3.e = a2;
        a3.f = new Feature[]{i091.a};
        a3.b = true;
        a3.c = pui0Var;
        a3.d = bVar;
        a3.a = 27305;
        return b(a3.i()).p(new i971(20, atomicReference));
    }
}
