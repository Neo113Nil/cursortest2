package com.yandex.go.payments_widgets.section.payments;

import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import flex.section.divkit.DivkitSnippet;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments_widgets/section/payments/PaymentWidgetsDataDto.$serializer", "Luxs;", "Lcom/yandex/go/payments_widgets/section/payments/PaymentWidgetsDataDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments_widgets/section/payments/PaymentWidgetsDataDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments_widgets/section/payments/PaymentWidgetsDataDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PaymentWidgetsDataDto$$serializer implements uxs {
    public static final PaymentWidgetsDataDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentWidgetsDataDto$$serializer paymentWidgetsDataDto$$serializer = new PaymentWidgetsDataDto$$serializer();
        INSTANCE = paymentWidgetsDataDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments_widgets.section.payments.PaymentWidgetsDataDto", paymentWidgetsDataDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("expanded_widgets", true);
        pluginGeneratedSerialDescriptor.j("collapsed_widgets", true);
        pluginGeneratedSerialDescriptor.j("is_initially_collapsed", true);
        pluginGeneratedSerialDescriptor.j("is_expandable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentWidgetsDataDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PaymentWidgetsDataDto.e;
        KSerializer n = qke.n((KSerializer) i3yVarArr[0].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[1].getValue());
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final PaymentWidgetsDataDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentWidgetsDataDto.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        DivkitSnippet divkitSnippet = null;
        DivkitSnippet divkitSnippet2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                divkitSnippet = (DivkitSnippet) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), divkitSnippet);
                i |= 1;
            } else if (v == 1) {
                divkitSnippet2 = (DivkitSnippet) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), divkitSnippet2);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool2 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new PaymentWidgetsDataDto(i, divkitSnippet, divkitSnippet2, bool, bool2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentWidgetsDataDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentWidgetsDataDto.e;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, z96.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, z96.a, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
