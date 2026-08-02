package com.yandex.plus.pay.adapter.api;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$PaymentFlowErrorReason;
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
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Backend", aVar, 1);
        pluginGeneratedSerialDescriptor.j("kind", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPaySdkAdapter$PaymentFlowErrorReason.Backend.$childSerializers;
        return new KSerializer[]{i3yVarArr[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPaySdkAdapter$PaymentFlowErrorReason.Backend.$childSerializers;
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                plusPaySdkAdapter$TrustErrorKind = (PlusPaySdkAdapter$TrustErrorKind) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), plusPaySdkAdapter$TrustErrorKind);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new PlusPaySdkAdapter$PaymentFlowErrorReason.Backend(i, plusPaySdkAdapter$TrustErrorKind, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) PlusPaySdkAdapter$PaymentFlowErrorReason.Backend.$childSerializers[0].getValue(), ((PlusPaySdkAdapter$PaymentFlowErrorReason.Backend) obj).kind);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
