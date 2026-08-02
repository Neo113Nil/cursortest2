package com.yandex.go.taxi.order.communications;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.communications.ToggleCommunicationsViewHolder", f = "ToggleCommunicationsViewHolder.kt", l = {HProv.PP_PASSWD_TERM, HProv.PP_SAME_MEDIA}, m = "updateFormattedText", v = 2)
/* loaded from: classes14.dex */
final class ToggleCommunicationsViewHolder$updateFormattedText$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleCommunicationsViewHolder$updateFormattedText$2(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d0(null, null, null, this);
    }
}
