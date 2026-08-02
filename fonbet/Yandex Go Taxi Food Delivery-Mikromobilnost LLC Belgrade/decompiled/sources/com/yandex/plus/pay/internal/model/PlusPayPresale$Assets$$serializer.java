package com.yandex.plus.pay.internal.model;

import com.yandex.plus.pay.internal.model.PlusPayPresale;
import defpackage.jxi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayPresale.Assets.$serializer", "Luxs;", "Lcom/yandex/plus/pay/internal/model/PlusPayPresale$Assets;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/internal/model/PlusPayPresale$Assets;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/internal/model/PlusPayPresale$Assets;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayPresale$Assets$$serializer implements uxs {
    public static final PlusPayPresale$Assets$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayPresale$Assets$$serializer plusPayPresale$Assets$$serializer = new PlusPayPresale$Assets$$serializer();
        INSTANCE = plusPayPresale$Assets$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.model.PlusPayPresale.Assets", plusPayPresale$Assets$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("loadingText", false);
        pluginGeneratedSerialDescriptor.j("benefitText", false);
        pluginGeneratedSerialDescriptor.j("periodText", false);
        pluginGeneratedSerialDescriptor.j("priceText", false);
        pluginGeneratedSerialDescriptor.j("priceDescriptionText", false);
        pluginGeneratedSerialDescriptor.j("suggestedOfferButtonText", false);
        pluginGeneratedSerialDescriptor.j("suggestedOfferButtonAdditionalText", false);
        pluginGeneratedSerialDescriptor.j("originalOfferButtonText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayPresale$Assets$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        return new KSerializer[]{plusPayRichText$$serializer, qke.n(plusPayRichText$$serializer), plusPayRichText$$serializer, plusPayRichText$$serializer, plusPayRichText$$serializer, plusPayRichText$$serializer, qke.n(plusPayRichText$$serializer), plusPayRichText$$serializer};
    }

    @Override // defpackage.myi
    public final PlusPayPresale.Assets deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        PlusPayPresale.Assets assets = null;
        boolean z = true;
        int i = 0;
        PlusPayRichText plusPayRichText = null;
        PlusPayRichText plusPayRichText2 = null;
        PlusPayRichText plusPayRichText3 = null;
        PlusPayRichText plusPayRichText4 = null;
        PlusPayRichText plusPayRichText5 = null;
        PlusPayRichText plusPayRichText6 = null;
        PlusPayRichText plusPayRichText7 = null;
        PlusPayRichText plusPayRichText8 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    plusPayRichText = (PlusPayRichText) b.A(serialDescriptor, 0, PlusPayRichText$$serializer.INSTANCE, plusPayRichText);
                    i |= 1;
                    break;
                case 1:
                    plusPayRichText2 = (PlusPayRichText) b.s(serialDescriptor, 1, PlusPayRichText$$serializer.INSTANCE, plusPayRichText2);
                    i |= 2;
                    break;
                case 2:
                    plusPayRichText3 = (PlusPayRichText) b.A(serialDescriptor, 2, PlusPayRichText$$serializer.INSTANCE, plusPayRichText3);
                    i |= 4;
                    break;
                case 3:
                    plusPayRichText4 = (PlusPayRichText) b.A(serialDescriptor, 3, PlusPayRichText$$serializer.INSTANCE, plusPayRichText4);
                    i |= 8;
                    break;
                case 4:
                    plusPayRichText5 = (PlusPayRichText) b.A(serialDescriptor, 4, PlusPayRichText$$serializer.INSTANCE, plusPayRichText5);
                    i |= 16;
                    break;
                case 5:
                    plusPayRichText6 = (PlusPayRichText) b.A(serialDescriptor, 5, PlusPayRichText$$serializer.INSTANCE, plusPayRichText6);
                    i |= 32;
                    break;
                case 6:
                    plusPayRichText7 = (PlusPayRichText) b.s(serialDescriptor, 6, PlusPayRichText$$serializer.INSTANCE, plusPayRichText7);
                    i |= 64;
                    break;
                case 7:
                    plusPayRichText8 = (PlusPayRichText) b.A(serialDescriptor, 7, PlusPayRichText$$serializer.INSTANCE, plusPayRichText8);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return assets;
            }
            assets = null;
        }
        b.c(serialDescriptor);
        return new PlusPayPresale.Assets(i, plusPayRichText, plusPayRichText2, plusPayRichText3, plusPayRichText4, plusPayRichText5, plusPayRichText6, plusPayRichText7, plusPayRichText8, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayPresale.Assets value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayPresale.Assets.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
