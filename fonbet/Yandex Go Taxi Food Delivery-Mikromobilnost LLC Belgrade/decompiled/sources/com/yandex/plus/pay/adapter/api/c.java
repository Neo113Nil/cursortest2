package com.yandex.plus.pay.adapter.api;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$PaymentFlowErrorReason;
import defpackage.lfx;
import defpackage.o4o;
import defpackage.qoi0;
import defpackage.ssp0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class c {
    public static final /* synthetic */ c a = new c();

    public final KSerializer serializer() {
        return new ssp0("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason", qoi0.a(PlusPaySdkAdapter$PaymentFlowErrorReason.class), new lfx[]{qoi0.a(PlusPaySdkAdapter$PaymentFlowErrorReason.Backend.class), qoi0.a(PlusPaySdkAdapter$PaymentFlowErrorReason.Connection.class), qoi0.a(PlusPaySdkAdapter$PaymentFlowErrorReason.PaymentMethodSelection.class), qoi0.a(PlusPaySdkAdapter$PaymentFlowErrorReason.Unauthorized.class), qoi0.a(PlusPaySdkAdapter$PaymentFlowErrorReason.Unexpected.class)}, new KSerializer[]{a.a, new o4o("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Connection", PlusPaySdkAdapter$PaymentFlowErrorReason.Connection.INSTANCE, new Annotation[0]), d.a, new o4o("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Unauthorized", PlusPaySdkAdapter$PaymentFlowErrorReason.Unauthorized.INSTANCE, new Annotation[0]), new o4o("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Unexpected", PlusPaySdkAdapter$PaymentFlowErrorReason.Unexpected.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
