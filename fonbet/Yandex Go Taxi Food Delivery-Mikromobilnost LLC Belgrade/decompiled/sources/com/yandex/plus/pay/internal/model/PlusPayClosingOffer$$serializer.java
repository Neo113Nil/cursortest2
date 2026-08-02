package com.yandex.plus.pay.internal.model;

import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xpd0;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayClosingOffer.$serializer", "Luxs;", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayClosingOffer$$serializer implements uxs {
    public static final PlusPayClosingOffer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayClosingOffer$$serializer plusPayClosingOffer$$serializer = new PlusPayClosingOffer$$serializer();
        INSTANCE = plusPayClosingOffer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.model.PlusPayClosingOffer", plusPayClosingOffer$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("backgroundImage", false);
        pluginGeneratedSerialDescriptor.j("titleText", false);
        pluginGeneratedSerialDescriptor.j("subtitleText", false);
        pluginGeneratedSerialDescriptor.j("offer", false);
        pluginGeneratedSerialDescriptor.j("assets", false);
        pluginGeneratedSerialDescriptor.j("acceptButtonText", false);
        pluginGeneratedSerialDescriptor.j("rejectButtonText", false);
        pluginGeneratedSerialDescriptor.j("footerText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayClosingOffer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayClosingOffer.$childSerializers;
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{xpd0.a, plusPayRichText$$serializer, qke.n(plusPayRichText$$serializer), PlusPayCompositeOffers$Offer$$serializer.INSTANCE, i3yVarArr[4].getValue(), auu0Var, auu0Var, qke.n(plusPayRichText$$serializer)};
    }

    @Override // defpackage.myi
    public final PlusPayClosingOffer deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayClosingOffer.$childSerializers;
        b.getClass();
        PlusPayClosingOffer plusPayClosingOffer = null;
        boolean z = true;
        PlusPayRichText plusPayRichText = null;
        PlusThemedImage plusThemedImage = null;
        PlusPayRichText plusPayRichText2 = null;
        PlusPayRichText plusPayRichText3 = null;
        PlusPayCompositeOffers.Offer offer = null;
        List list = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    plusThemedImage = (PlusThemedImage) b.A(serialDescriptor, 0, xpd0.a, plusThemedImage);
                    i |= 1;
                    break;
                case 1:
                    plusPayRichText2 = (PlusPayRichText) b.A(serialDescriptor, 1, PlusPayRichText$$serializer.INSTANCE, plusPayRichText2);
                    i |= 2;
                    break;
                case 2:
                    plusPayRichText3 = (PlusPayRichText) b.s(serialDescriptor, 2, PlusPayRichText$$serializer.INSTANCE, plusPayRichText3);
                    i |= 4;
                    break;
                case 3:
                    offer = (PlusPayCompositeOffers.Offer) b.A(serialDescriptor, 3, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, offer);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    plusPayRichText = (PlusPayRichText) b.s(serialDescriptor, 7, PlusPayRichText$$serializer.INSTANCE, plusPayRichText);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return plusPayClosingOffer;
            }
            plusPayClosingOffer = null;
        }
        b.c(serialDescriptor);
        return new PlusPayClosingOffer(i, plusThemedImage, plusPayRichText2, plusPayRichText3, offer, list, str, str2, plusPayRichText, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayClosingOffer value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayClosingOffer.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
