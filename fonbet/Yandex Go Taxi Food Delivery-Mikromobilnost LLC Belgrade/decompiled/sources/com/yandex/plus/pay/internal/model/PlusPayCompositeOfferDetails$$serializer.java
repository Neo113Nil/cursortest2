package com.yandex.plus.pay.internal.model;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails.$serializer", "Luxs;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayCompositeOfferDetails$$serializer implements uxs {
    public static final PlusPayCompositeOfferDetails$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayCompositeOfferDetails$$serializer plusPayCompositeOfferDetails$$serializer = new PlusPayCompositeOfferDetails$$serializer();
        INSTANCE = plusPayCompositeOfferDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails", plusPayCompositeOfferDetails$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("tariffDetails", false);
        pluginGeneratedSerialDescriptor.j("optionOffersDetails", false);
        pluginGeneratedSerialDescriptor.j("legalInfo", false);
        pluginGeneratedSerialDescriptor.j("promoLegalInfo", false);
        pluginGeneratedSerialDescriptor.j("paymentText", false);
        pluginGeneratedSerialDescriptor.j("successScreen", false);
        pluginGeneratedSerialDescriptor.j("invoicesDetails", false);
        pluginGeneratedSerialDescriptor.j("isSilentInvoiceAvailable", false);
        pluginGeneratedSerialDescriptor.j("mainPaymentMethod", false);
        pluginGeneratedSerialDescriptor.j("posId", false);
        pluginGeneratedSerialDescriptor.j("serviceToken", false);
        pluginGeneratedSerialDescriptor.j("paymentMethodsGroups", false);
        pluginGeneratedSerialDescriptor.j("additionalOffers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayCompositeOfferDetails$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayCompositeOfferDetails.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE), i3yVarArr[1].getValue(), qke.n(PlusPayLegalInfo$$serializer.INSTANCE), qke.n(PlusPayRichText$$serializer.INSTANCE), PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE, PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE, i3yVarArr[6].getValue(), qke.n(z96.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[11].getValue(), PlusPayAdditionalOffers$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final PlusPayCompositeOfferDetails deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails;
        List list;
        List list2;
        String str;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayCompositeOfferDetails.$childSerializers;
        b.getClass();
        List list3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        PlusPayAdditionalOffers plusPayAdditionalOffers = null;
        Boolean bool = null;
        int i = 0;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails2 = null;
        List list4 = null;
        PlusPayLegalInfo plusPayLegalInfo = null;
        PlusPayRichText plusPayRichText = null;
        PlusPayCompositeOfferDetails.PaymentText paymentText = null;
        PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails = null;
        List list5 = null;
        int i2 = 1;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    list2 = list3;
                    str = str2;
                    z = false;
                    str2 = str;
                    list3 = list2;
                    i2 = 1;
                case 0:
                    list2 = list3;
                    str = str2;
                    tariffOfferDetails2 = (PlusPayCompositeOfferDetails.TariffOfferDetails) b.s(serialDescriptor, 0, PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE, tariffOfferDetails2);
                    i |= 1;
                    str2 = str;
                    list3 = list2;
                    i2 = 1;
                case 1:
                    list4 = (List) b.A(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), list4);
                    i |= 2;
                    tariffOfferDetails2 = tariffOfferDetails2;
                    list3 = list3;
                case 2:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    plusPayLegalInfo = (PlusPayLegalInfo) b.s(serialDescriptor, 2, PlusPayLegalInfo$$serializer.INSTANCE, plusPayLegalInfo);
                    i |= 4;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 3:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    plusPayRichText = (PlusPayRichText) b.s(serialDescriptor, 3, PlusPayRichText$$serializer.INSTANCE, plusPayRichText);
                    i |= 8;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 4:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    paymentText = (PlusPayCompositeOfferDetails.PaymentText) b.A(serialDescriptor, 4, PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE, paymentText);
                    i |= 16;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 5:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    successScreenDetails = (PlusPayCompositeOfferDetails.SuccessScreenDetails) b.A(serialDescriptor, 5, PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE, successScreenDetails);
                    i |= 32;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 6:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    list5 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list5);
                    i |= 64;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 7:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 8:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    str4 = (String) b.s(serialDescriptor, 8, auu0.a, str4);
                    i |= 256;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 9:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    str3 = (String) b.s(serialDescriptor, 9, auu0.a, str3);
                    i |= 512;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 10:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    str2 = (String) b.s(serialDescriptor, 10, auu0.a, str2);
                    i |= 1024;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 11:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    list3 = (List) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list3);
                    i |= 2048;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                case 12:
                    tariffOfferDetails = tariffOfferDetails2;
                    list = list4;
                    plusPayAdditionalOffers = (PlusPayAdditionalOffers) b.A(serialDescriptor, 12, PlusPayAdditionalOffers$$serializer.INSTANCE, plusPayAdditionalOffers);
                    i |= 4096;
                    tariffOfferDetails2 = tariffOfferDetails;
                    list4 = list;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str5 = str2;
        b.c(serialDescriptor);
        return new PlusPayCompositeOfferDetails(i, tariffOfferDetails2, list4, plusPayLegalInfo, plusPayRichText, paymentText, successScreenDetails, list5, bool, str4, str3, str5, list3, plusPayAdditionalOffers, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayCompositeOfferDetails value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayCompositeOfferDetails.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
