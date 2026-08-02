package com.yandex.plus.core.data.pay;

import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.myi;
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
public final /* synthetic */ class g implements uxs {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState.Success", gVar, 2);
        pluginGeneratedSerialDescriptor.j("selectButtonText", false);
        pluginGeneratedSerialDescriptor.j("paymentMethod", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusSelectPaymentMethodState.Success.$childSerializers;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusSelectPaymentMethodState.Success.$childSerializers;
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        String str = null;
        PlusPaymentMethod plusPaymentMethod = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                plusPaymentMethod = (PlusPaymentMethod) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), plusPaymentMethod);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new PlusSelectPaymentMethodState.Success(i, str, plusPaymentMethod, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusSelectPaymentMethodState.Success.write$Self$psdk_adapter_api_release((PlusSelectPaymentMethodState.Success) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
