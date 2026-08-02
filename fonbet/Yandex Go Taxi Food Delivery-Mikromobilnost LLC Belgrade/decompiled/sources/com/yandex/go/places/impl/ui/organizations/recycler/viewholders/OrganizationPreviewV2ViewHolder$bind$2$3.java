package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import com.yandex.go.places.impl.ui.organizations.buttons.OrganizationActionButtonComponent;
import defpackage.sj80;
import defpackage.tls;
import defpackage.to80;
import defpackage.zo31;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OrganizationPreviewV2ViewHolder$bind$2$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a aVar = (a) this.receiver;
        aVar.getClass();
        OrganizationActionButtonComponent organizationActionButtonComponent = new OrganizationActionButtonComponent(((to80) ((zo31) aVar.R)).a.getContext(), aVar.U);
        organizationActionButtonComponent.bind((sj80) obj, aVar.a0);
        return organizationActionButtonComponent;
    }
}
