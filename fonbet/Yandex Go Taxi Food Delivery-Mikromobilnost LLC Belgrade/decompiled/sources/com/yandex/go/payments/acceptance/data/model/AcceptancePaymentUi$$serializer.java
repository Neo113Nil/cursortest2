package com.yandex.go.payments.acceptance.data.model;

import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/acceptance/data/model/AcceptancePaymentUi.$serializer", "Luxs;", "Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentUi;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentUi;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentUi;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class AcceptancePaymentUi$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AcceptancePaymentUi$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AcceptancePaymentUi$$serializer acceptancePaymentUi$$serializer = new AcceptancePaymentUi$$serializer();
        INSTANCE = acceptancePaymentUi$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.acceptance.data.model.AcceptancePaymentUi", acceptancePaymentUi$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("fullscreen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AcceptancePaymentUi$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AcceptancePaymentNotification$$serializer.INSTANCE, AcceptancePaymentFullscreen$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final AcceptancePaymentUi deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        AcceptancePaymentNotification acceptancePaymentNotification = null;
        AcceptancePaymentFullscreen acceptancePaymentFullscreen = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                acceptancePaymentNotification = (AcceptancePaymentNotification) b.A(serialDescriptor, 0, AcceptancePaymentNotification$$serializer.INSTANCE, acceptancePaymentNotification);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                acceptancePaymentFullscreen = (AcceptancePaymentFullscreen) b.A(serialDescriptor, 1, AcceptancePaymentFullscreen$$serializer.INSTANCE, acceptancePaymentFullscreen);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new AcceptancePaymentUi(i, acceptancePaymentNotification, acceptancePaymentFullscreen);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AcceptancePaymentUi value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, new AcceptancePaymentNotification(0))) {
            b.e(serialDescriptor, 0, AcceptancePaymentNotification$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, new AcceptancePaymentFullscreen(0))) {
            b.e(serialDescriptor, 1, AcceptancePaymentFullscreen$$serializer.INSTANCE, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
