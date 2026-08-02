package com.yandex.go.places.organization.card.impl.domain.interactors.flex;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.organization.card.impl.domain.interactors.flex.OrganizationCardFlexInteractor", f = "OrganizationCardFlexInteractor.kt", l = {HProv.PP_SIGNATUREOID, HProv.PP_DELETE_SAVED_PASSWD}, m = "handleOnGalleryClicked", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardFlexInteractor$handleOnGalleryClicked$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardFlexInteractor$handleOnGalleryClicked$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, this);
    }
}
