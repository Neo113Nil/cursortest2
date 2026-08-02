package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import defpackage.g7c;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class ClosingOfferFragment$onViewCreated$closingOfferViewController$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        PlusPayClosingOffer plusPayClosingOffer = aVar.A;
        if (plusPayClosingOffer != null) {
            ((g7c) aVar.z).a(aVar.x.a.a(), plusPayClosingOffer);
        }
        aVar.b.a();
        return zy11.a;
    }
}
