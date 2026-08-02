package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/widget/payment/method/PaymentMethodWidgetSection.$serializer", "Luxs;", "Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/widget/payment/method/PaymentMethodWidgetSection;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/widget/payment/method/PaymentMethodWidgetSection;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/widget/payment/method/PaymentMethodWidgetSection;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class PaymentMethodWidgetSection$$serializer implements uxs {
    public static final PaymentMethodWidgetSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentMethodWidgetSection$$serializer paymentMethodWidgetSection$$serializer = new PaymentMethodWidgetSection$$serializer();
        INSTANCE = paymentMethodWidgetSection$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.PaymentMethodWidgetSection", paymentMethodWidgetSection$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, false);
        pluginGeneratedSerialDescriptor.j("reloadable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentMethodWidgetSection$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(PaymentMethodWidgetData$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, n, z96.a};
    }

    @Override // defpackage.myi
    public final PaymentMethodWidgetSection deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        PaymentMethodWidgetData paymentMethodWidgetData = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                paymentMethodWidgetData = (PaymentMethodWidgetData) b.s(serialDescriptor, 2, PaymentMethodWidgetData$$serializer.INSTANCE, paymentMethodWidgetData);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new PaymentMethodWidgetSection(i, str, str2, paymentMethodWidgetData, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentMethodWidgetSection value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "payment_method_widget")) {
            b.o(serialDescriptor, 1, value.b);
        }
        PaymentMethodWidgetData$$serializer paymentMethodWidgetData$$serializer = PaymentMethodWidgetData$$serializer.INSTANCE;
        PaymentMethodWidgetData paymentMethodWidgetData = value.c;
        boolean z = value.d;
        b.g(serialDescriptor, 2, paymentMethodWidgetData$$serializer, paymentMethodWidgetData);
        if (b.F() || z) {
            b.n(serialDescriptor, 3, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
