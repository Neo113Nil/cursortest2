package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$Tariff$$serializer;
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
public final /* synthetic */ class s implements uxs {
    public static final s a;
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.adapter.internal.TariffImpl", sVar, 1);
        pluginGeneratedSerialDescriptor.j("actualTariff", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        PlusPayCompositeOffers.Offer.Tariff tariff = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                tariff = (PlusPayCompositeOffers.Offer.Tariff) b.A(serialDescriptor, 0, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, tariff);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new TariffImpl(i, tariff, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, ((TariffImpl) obj).actualTariff);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
