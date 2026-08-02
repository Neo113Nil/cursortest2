package com.yandex.plus.pay.adapter.api;

import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$PaymentFlowErrorReason;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.psq0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.PaymentMethodSelection", dVar, 1);
        pluginGeneratedSerialDescriptor.j("errorState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{com.yandex.plus.core.data.pay.c.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        PlusSelectPaymentMethodState.Error error = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                error = (PlusSelectPaymentMethodState.Error) b.A(serialDescriptor, 0, com.yandex.plus.core.data.pay.c.a, error);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new PlusPaySdkAdapter$PaymentFlowErrorReason.PaymentMethodSelection(i, error, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, com.yandex.plus.core.data.pay.c.a, ((PlusPaySdkAdapter$PaymentFlowErrorReason.PaymentMethodSelection) obj).errorState);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
