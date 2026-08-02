package com.yandex.plus.pay.api.model;

import com.adjust.sdk.Constants;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/api/model/PlusPayCompositeOffers.Offer.$serializer", "Luxs;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayCompositeOffers$Offer$$serializer implements uxs {
    public static final PlusPayCompositeOffers$Offer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayCompositeOffers$Offer$$serializer plusPayCompositeOffers$Offer$$serializer = new PlusPayCompositeOffers$Offer$$serializer();
        INSTANCE = plusPayCompositeOffers$Offer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer", plusPayCompositeOffers$Offer$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("positionId", false);
        pluginGeneratedSerialDescriptor.j("structureType", false);
        pluginGeneratedSerialDescriptor.j("activeTariffId", false);
        pluginGeneratedSerialDescriptor.j("tariffOffer", false);
        pluginGeneratedSerialDescriptor.j("optionOffers", false);
        pluginGeneratedSerialDescriptor.j("legalInfo", false);
        pluginGeneratedSerialDescriptor.j("invoices", false);
        pluginGeneratedSerialDescriptor.j("isUpsale", false);
        pluginGeneratedSerialDescriptor.j("assets", false);
        pluginGeneratedSerialDescriptor.j("canAttemptSilentPurchase", false);
        pluginGeneratedSerialDescriptor.j(Constants.REFERRER_API_META, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayCompositeOffers$Offer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayCompositeOffers.Offer.$childSerializers;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE), i3yVarArr[4].getValue(), qke.n(PlusPayLegalInfo$$serializer.INSTANCE), i3yVarArr[6].getValue(), z96Var, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE, z96Var, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final PlusPayCompositeOffers.Offer deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayCompositeOffers.Offer.$childSerializers;
        b.getClass();
        PlusPayCompositeOffers.Offer.Meta meta = null;
        boolean z = true;
        PlusPayCompositeOffers.Offer.Assets assets = null;
        int i = 0;
        String str = null;
        PlusPayCompositeOffers.Offer.StructureType structureType = null;
        String str2 = null;
        PlusPayCompositeOffers.Offer.Tariff tariff = null;
        List list = null;
        PlusPayLegalInfo plusPayLegalInfo = null;
        List list2 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    structureType = (PlusPayCompositeOffers.Offer.StructureType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), structureType);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    tariff = (PlusPayCompositeOffers.Offer.Tariff) b.s(serialDescriptor, 3, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, tariff);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    plusPayLegalInfo = (PlusPayLegalInfo) b.s(serialDescriptor, 5, PlusPayLegalInfo$$serializer.INSTANCE, plusPayLegalInfo);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    assets = (PlusPayCompositeOffers.Offer.Assets) b.A(serialDescriptor, 8, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE, assets);
                    i |= 256;
                    break;
                case 9:
                    z3 = b.C(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    meta = (PlusPayCompositeOffers.Offer.Meta) b.A(serialDescriptor, 10, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE, meta);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlusPayCompositeOffers.Offer(i, str, structureType, str2, tariff, list, plusPayLegalInfo, list2, z2, assets, z3, meta, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayCompositeOffers.Offer value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayCompositeOffers.Offer.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
