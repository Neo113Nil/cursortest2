package com.yandex.go.places.map.ui.pinwar;

import defpackage.mwb0;
import defpackage.tje;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PinsMapPresenterV2$attachPins$1$1 extends FunctionReferenceImpl implements tls {
    public final Boolean i(mwb0 mwb0Var) {
        b bVar = (b) this.receiver;
        bVar.getClass();
        tje.N(bVar.Jg(), null, null, new PinsMapPresenterV2$handleOnOrganizationPinClick$1(bVar, (String) mwb0Var.a(), null), 3);
        return Boolean.TRUE;
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((mwb0) obj);
        return Boolean.TRUE;
    }
}
