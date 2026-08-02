package com.yandex.go.places.impl.ui.organizations;

import defpackage.bn80;
import defpackage.hsj;
import defpackage.jdj;
import defpackage.jio;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OrganizationsModalView$InnerMvpView$hideContentAndShowError$1$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m195invoke() {
        d dVar = (d) this.receiver;
        jdj jdjVar = dVar.P;
        bn80 bn80Var = (bn80) dVar.Q.a.getValue();
        String str = bn80Var != null ? bn80Var.a : null;
        jio jioVar = (jio) jdjVar.c;
        hsj hsjVar = jioVar.b;
        String i = jioVar.i();
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("geosearch_context", str);
        }
        hsjVar.a.a("Discovery.OrganisationList.RetryTapped", hashMap, 2, tse0.r("source", hashMap, i));
        tje.N(dVar.Jg(), null, null, new OrganizationsPresenter$onReloadScreenButtonClicked$1(dVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m195invoke();
        return zy11.a;
    }
}
