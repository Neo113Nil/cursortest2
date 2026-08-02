package com.yandex.go.logistics.cargo_flow.form.address;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.logistics.cargo_flow.form.address.DeliveryRouteInteractorImpl", f = "DeliveryRouteInteractorImpl.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "updateSourceAndDestAddresses", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRouteInteractorImpl$updateSourceAndDestAddresses$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRouteInteractorImpl$updateSourceAndDestAddresses$2(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(null, null, null, this);
    }
}
