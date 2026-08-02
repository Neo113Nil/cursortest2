package com.yandex.go.places.organization.card.impl.ui.gallery;

import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c;
import defpackage.kf80;
import defpackage.ne80;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class OrganizationCardGalleryView$organizationImagesSliderAdapter$2$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        c cVar = (c) ((kf80) this.receiver);
        cVar.M.b.reloadDocument();
        ne80 ne80Var = (ne80) cVar.J.a.getValue();
        if (ne80Var != null) {
            cVar.Z.o(ne80Var.a, ne80Var.b);
        }
        return zy11.a;
    }
}
