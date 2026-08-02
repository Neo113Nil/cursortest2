package com.yandex.go.places.impl.ui.main.map.filters.overlay;

import defpackage.mwb0;
import defpackage.tje;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PlacesCategoryFiltersMapPresenter$attachPins$1$1 extends FunctionReferenceImpl implements tls {
    public final Boolean i(mwb0 mwb0Var) {
        a aVar = (a) this.receiver;
        aVar.getClass();
        tje.N(aVar.Jg(), null, null, new PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1(aVar, (String) mwb0Var.a(), null), 3);
        return Boolean.TRUE;
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((mwb0) obj);
        return Boolean.TRUE;
    }
}
