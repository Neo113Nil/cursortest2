package com.ybsdk.feature.pin.internal.screens.checkpin;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel", f = "CheckPinViewModel.kt", l = {252, SubsamplingScaleImageView.ORIENTATION_270, 284, HProv.ALG_SID_SHA_224}, m = "processStartSessionResponse")
/* loaded from: classes3.dex */
final class CheckPinViewModel$processStartSessionResponse$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$processStartSessionResponse$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.g0(this.this$0, null, false, this);
    }
}
