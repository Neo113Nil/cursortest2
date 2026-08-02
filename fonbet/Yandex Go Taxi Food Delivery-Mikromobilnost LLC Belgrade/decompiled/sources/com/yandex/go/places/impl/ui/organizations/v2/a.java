package com.yandex.go.places.impl.ui.organizations.v2;

import defpackage.bn80;
import defpackage.hsj;
import defpackage.jio;
import defpackage.r7c0;
import defpackage.rn80;
import defpackage.tje;
import defpackage.tse0;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class a implements r7c0 {
    public final /* synthetic */ f a;

    public a(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.r7c0
    public final void a() {
        f fVar = this.a;
        ((rn80) fVar.Dg()).ig(true);
        fVar.Mg().Z();
    }

    @Override // defpackage.r7c0
    public final void b() {
        f fVar = this.a;
        tje.N(fVar.Jg(), null, null, new OrganizationsListV2Presenter$flexCallbacks$1$onDocumentRendered$1(fVar, null), 3);
    }

    @Override // defpackage.r7c0
    public final void c() {
        f fVar = this.a;
        jio jioVar = fVar.T;
        bn80 bn80Var = (bn80) fVar.U.a.getValue();
        String str = bn80Var != null ? bn80Var.a : null;
        hsj hsjVar = jioVar.b;
        String i = jioVar.i();
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("geosearch_context", str);
        }
        hsjVar.a.a("Discovery.OrganisationList.LoadingFailed", hashMap, 3, tse0.r("source", hashMap, i));
        tje.N(fVar.Jg(), null, null, new OrganizationsListV2Presenter$flexCallbacks$1$onDocumentLoadingFailed$1(fVar, null), 3);
    }

    @Override // defpackage.r7c0
    public final void d() {
        f fVar = this.a;
        ((rn80) fVar.Dg()).ig(false);
        ((rn80) fVar.Dg()).N8(false);
    }
}
