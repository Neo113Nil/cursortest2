package com.yandex.go.places.impl.ui.organizations;

import com.yandex.go.places.impl.ui.organizations.data.PageRequestState;
import defpackage.gp80;
import defpackage.ip80;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class OrganizationsModalView$adapter$2$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = (d) this.receiver;
        ip80 a = dVar.L.a();
        a.getClass();
        gp80 gp80Var = a instanceof gp80 ? (gp80) a : null;
        if (gp80Var != null && gp80Var.b == PageRequestState.ERROR) {
            dVar.Rg(gp80Var.a);
        }
        return zy11.a;
    }
}
