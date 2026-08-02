package com.yandex.go.places.impl.ui.filters;

import defpackage.mqb;
import defpackage.rm80;
import defpackage.tje;
import defpackage.tls;
import defpackage.um80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class OrganizationsFiltersModalView$filtersAdapter$2$1 extends FunctionReferenceImpl implements tls {
    public final void i(mqb mqbVar) {
        rm80 rm80Var = (rm80) this.receiver;
        tje.N(rm80Var.y.a, null, null, new OrganizationsFiltersPresenter$onFilterItemClicked$1(rm80Var, mqbVar, null), 3);
        um80 um80Var = rm80Var.z;
        um80Var.a.a(mqbVar.a);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((mqb) obj);
        return zy11.a;
    }
}
