package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import defpackage.tls;
import defpackage.whq0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class SelectedPaymentMethodResolver$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((whq0) this.receiver).toParcelable((SelectedPaymentMethodPayload) obj);
    }
}
