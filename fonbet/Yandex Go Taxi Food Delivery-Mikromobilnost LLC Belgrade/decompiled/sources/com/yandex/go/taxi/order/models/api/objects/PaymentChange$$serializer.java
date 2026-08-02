package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.PaymentChange;
import defpackage.jv90;
import defpackage.jxi;
import defpackage.lv90;
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
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/PaymentChange.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/objects/PaymentChange;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/objects/PaymentChange;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/objects/PaymentChange;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class PaymentChange$$serializer implements uxs {
    public static final PaymentChange$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentChange$$serializer paymentChange$$serializer = new PaymentChange$$serializer();
        INSTANCE = paymentChange$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.objects.PaymentChange", paymentChange$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("from", true);
        pluginGeneratedSerialDescriptor.j("to", true);
        pluginGeneratedSerialDescriptor.j(CRLReasonCodeExtension.REASON, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentChange$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        jv90 jv90Var = jv90.a;
        return new KSerializer[]{qke.n(jv90Var), qke.n(jv90Var), qke.n(PaymentChange$Reason$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final PaymentChange deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        lv90 lv90Var = null;
        lv90 lv90Var2 = null;
        PaymentChange.Reason reason = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                lv90Var = (lv90) b.s(serialDescriptor, 0, jv90.a, lv90Var);
                i |= 1;
            } else if (v == 1) {
                lv90Var2 = (lv90) b.s(serialDescriptor, 1, jv90.a, lv90Var2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                reason = (PaymentChange.Reason) b.s(serialDescriptor, 2, PaymentChange$Reason$$serializer.INSTANCE, reason);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new PaymentChange(i, lv90Var, lv90Var2, reason);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentChange value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, jv90.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, jv90.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, PaymentChange$Reason$$serializer.INSTANCE, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
