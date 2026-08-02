package com.yandex.plus.pay.internal.model;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayPresale.$serializer", "Luxs;", "Lcom/yandex/plus/pay/internal/model/PlusPayPresale;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/internal/model/PlusPayPresale;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/internal/model/PlusPayPresale;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayPresale$$serializer implements uxs {
    public static final PlusPayPresale$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayPresale$$serializer plusPayPresale$$serializer = new PlusPayPresale$$serializer();
        INSTANCE = plusPayPresale$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.model.PlusPayPresale", plusPayPresale$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("suggestedOffer", false);
        pluginGeneratedSerialDescriptor.j("loadingDelayMillis", false);
        pluginGeneratedSerialDescriptor.j("assets", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayPresale$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PlusPayCompositeOffers$Offer$$serializer.INSTANCE, pnz.a, PlusPayPresale$Assets$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final PlusPayPresale deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        PlusPayCompositeOffers.Offer offer = null;
        PlusPayPresale.Assets assets = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                offer = (PlusPayCompositeOffers.Offer) b.A(serialDescriptor, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, offer);
                i |= 1;
            } else if (v == 1) {
                j = b.f(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                assets = (PlusPayPresale.Assets) b.A(serialDescriptor, 2, PlusPayPresale$Assets$$serializer.INSTANCE, assets);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new PlusPayPresale(i, offer, j, assets, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayPresale value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayPresale.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
