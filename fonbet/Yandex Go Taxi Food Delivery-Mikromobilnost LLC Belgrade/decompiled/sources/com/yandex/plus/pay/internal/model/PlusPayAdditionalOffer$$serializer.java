package com.yandex.plus.pay.internal.model;

import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayAdditionalOffer.$serializer", "Luxs;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayAdditionalOffer$$serializer implements uxs {
    public static final PlusPayAdditionalOffer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayAdditionalOffer$$serializer plusPayAdditionalOffer$$serializer = new PlusPayAdditionalOffer$$serializer();
        INSTANCE = plusPayAdditionalOffer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer", plusPayAdditionalOffer$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("offer", false);
        pluginGeneratedSerialDescriptor.j("assets", false);
        pluginGeneratedSerialDescriptor.j("isAvailable", false);
        pluginGeneratedSerialDescriptor.j("isSelected", false);
        pluginGeneratedSerialDescriptor.j("offersToReplace", false);
        pluginGeneratedSerialDescriptor.j("upsaleStep", false);
        pluginGeneratedSerialDescriptor.j("upsaleType", false);
        pluginGeneratedSerialDescriptor.j("offerSwitchToggle", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayAdditionalOffer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayAdditionalOffer.$childSerializers;
        z96 z96Var = z96.a;
        return new KSerializer[]{PlusPayAdditionalOffer$Offer$$serializer.INSTANCE, PlusPayAdditionalOffer$Assets$$serializer.INSTANCE, z96Var, z96Var, i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), i3yVarArr[6].getValue(), qke.n(PlusPayOfferSwitchToggle$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final PlusPayAdditionalOffer deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayAdditionalOffer.$childSerializers;
        b.getClass();
        PlusPayAdditionalOffer plusPayAdditionalOffer = null;
        boolean z = true;
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle = null;
        PlusPayAdditionalOffer.Offer offer = null;
        PlusPayAdditionalOffer.Assets assets = null;
        List list = null;
        PlusPayUpsaleStep plusPayUpsaleStep = null;
        PlusPayUpsaleType plusPayUpsaleType = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    offer = (PlusPayAdditionalOffer.Offer) b.A(serialDescriptor, 0, PlusPayAdditionalOffer$Offer$$serializer.INSTANCE, offer);
                    i |= 1;
                    break;
                case 1:
                    assets = (PlusPayAdditionalOffer.Assets) b.A(serialDescriptor, 1, PlusPayAdditionalOffer$Assets$$serializer.INSTANCE, assets);
                    i |= 2;
                    break;
                case 2:
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z3 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    plusPayUpsaleStep = (PlusPayUpsaleStep) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), plusPayUpsaleStep);
                    i |= 32;
                    break;
                case 6:
                    plusPayUpsaleType = (PlusPayUpsaleType) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), plusPayUpsaleType);
                    i |= 64;
                    break;
                case 7:
                    plusPayOfferSwitchToggle = (PlusPayOfferSwitchToggle) b.s(serialDescriptor, 7, PlusPayOfferSwitchToggle$$serializer.INSTANCE, plusPayOfferSwitchToggle);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return plusPayAdditionalOffer;
            }
            plusPayAdditionalOffer = null;
        }
        b.c(serialDescriptor);
        return new PlusPayAdditionalOffer(i, offer, assets, z2, z3, list, plusPayUpsaleStep, plusPayUpsaleType, plusPayOfferSwitchToggle, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayAdditionalOffer value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayAdditionalOffer.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
