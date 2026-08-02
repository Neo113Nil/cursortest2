package com.yandex.plus.home.plaque.plugin.internal.di;

import android.content.Context;
import com.yandex.plus.home.c;
import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.home.internal.di.g;
import defpackage.b5d0;
import defpackage.cop0;
import defpackage.lzc0;
import defpackage.lzs;
import defpackage.m6d0;
import defpackage.mdh;
import defpackage.o1k0;
import defpackage.p4d0;
import defpackage.pgz;
import defpackage.qo2;
import defpackage.rog;
import defpackage.sls;
import defpackage.sog;
import defpackage.t0k0;
import defpackage.tcc;
import defpackage.vog;
import defpackage.wyj;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ p4d0 b;
    public final /* synthetic */ com.yandex.plus.plaquesdk.widget.a c;
    public final /* synthetic */ vog w;

    public /* synthetic */ b(p4d0 p4d0Var, vog vogVar, com.yandex.plus.plaquesdk.widget.a aVar) {
        this.b = p4d0Var;
        this.w = vogVar;
        this.c = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        vog vogVar = this.w;
        p4d0 p4d0Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) p4d0Var;
                g gVar = cVar.e;
                CrossPlaqueControllerApi crossPlaqueControllerApi = (CrossPlaqueControllerApi) ((t0k0) gVar.m.getValue()).b(CrossPlaqueControllerApi.class);
                cop0 cop0Var = cVar.b;
                Context context = cop0Var.a;
                pgz b = vogVar.b();
                ((wyj) cop0Var.z).getClass();
                mdh mdhVar = wyj.e;
                return new com.yandex.plus.home.plaque.repository.rest.b(crossPlaqueControllerApi, new com.yandex.plus.home.plaque.plugin.internal.defaults.c(context, b, mdhVar), (m6d0) cVar.f.B.getValue(), (lzs) vogVar.b.getValue(), this.c, cop0Var.g, new sog(p4d0Var, 0), new DataModule$plaqueRepository$2$1$2(p4d0Var, null), new sog(p4d0Var, 1), new DataModule$plaqueRepository$2$1$4(p4d0Var, vogVar, null), new sog(p4d0Var, 2), new sog(p4d0Var, 3), new sog(p4d0Var, 4), (o1k0) gVar.p.getValue(), vogVar.b(), cVar.i, mdhVar);
            default:
                c cVar2 = (c) p4d0Var;
                g gVar2 = cVar2.e;
                qo2 b2 = gVar2.b();
                cop0 cop0Var2 = cVar2.b;
                com.yandex.plus.core.graphql.target.a aVar = (com.yandex.plus.core.graphql.target.a) cVar2.f.q.getValue();
                ArrayList arrayList = new ArrayList(tcc.n(EmptyList.a, 10));
                b5d0 b5d0Var = cop0Var2.g;
                Context context2 = cop0Var2.a;
                ((wyj) cop0Var2.z).getClass();
                mdh mdhVar2 = wyj.e;
                return new com.yandex.plus.home.plaque.repository.graphql.a(b2, aVar, arrayList, this.c, b5d0Var, new com.yandex.plus.home.plaque.plugin.internal.defaults.b(context2, vogVar.b(), mdhVar2), new rog(p4d0Var, 0), new rog(p4d0Var, 1), new DataModule$plaqueRepository$2$2$4(p4d0Var, vogVar, null), context2.getResources().getDisplayMetrics().densityDpi, new rog(p4d0Var, 2), new rog(p4d0Var, 3), new rog(p4d0Var, 4), new rog(p4d0Var, 5), (o1k0) gVar2.p.getValue(), vogVar.b(), cVar2.i, mdhVar2);
        }
    }

    public /* synthetic */ b(p4d0 p4d0Var, lzc0 lzc0Var, com.yandex.plus.plaquesdk.widget.a aVar, vog vogVar) {
        this.b = p4d0Var;
        this.c = aVar;
        this.w = vogVar;
    }
}
