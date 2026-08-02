package com.yandex.go.places.organization.card.impl.domain.interactors.map.common;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.organization.card.impl.domain.interactors.map.common.BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2", f = "BaseOrganizationCardMapInteractor.kt", l = {HProv.PP_AUTH_INFO, 241, 244, 250, 251, 253, 264, 266, 269, SubsamplingScaleImageView.ORIENTATION_270, 283, 284, 291}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
