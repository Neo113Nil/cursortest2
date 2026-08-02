package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/addmethod/data/model/WebviewBindingFlow.PaymentMethodBindResponseSignalAction.$serializer", "Luxs;", "Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignalAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignalAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignalAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class WebviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer implements uxs {
    public static final int $stable = 0;
    public static final WebviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WebviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer webviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer = new WebviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer();
        INSTANCE = webviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow.PaymentMethodBindResponseSignalAction", webviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WebviewBindingFlow$PaymentMethodBindResponseSignalAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{WebviewBindingFlow.PaymentMethodBindResponseSignalAction.c[0].getValue(), qke.n(WebviewBindingFlow$SignalParamPayload$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final WebviewBindingFlow.PaymentMethodBindResponseSignalAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = WebviewBindingFlow.PaymentMethodBindResponseSignalAction.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type type = null;
        WebviewBindingFlow.SignalParamPayload signalParamPayload = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                type = (WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), type);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                signalParamPayload = (WebviewBindingFlow.SignalParamPayload) b.s(serialDescriptor, 1, WebviewBindingFlow$SignalParamPayload$$serializer.INSTANCE, signalParamPayload);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new WebviewBindingFlow.PaymentMethodBindResponseSignalAction(i, type, signalParamPayload);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WebviewBindingFlow.PaymentMethodBindResponseSignalAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = WebviewBindingFlow.PaymentMethodBindResponseSignalAction.c;
        if (b.F() || value.a != WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, WebviewBindingFlow$SignalParamPayload$$serializer.INSTANCE, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
