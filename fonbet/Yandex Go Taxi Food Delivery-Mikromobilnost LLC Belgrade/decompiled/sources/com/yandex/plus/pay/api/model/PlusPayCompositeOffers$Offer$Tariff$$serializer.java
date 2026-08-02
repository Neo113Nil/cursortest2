package com.yandex.plus.pay.api.model;

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
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/api/model/PlusPayCompositeOffers.Offer.Tariff.$serializer", "Luxs;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayCompositeOffers$Offer$Tariff$$serializer implements uxs {
    public static final PlusPayCompositeOffers$Offer$Tariff$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayCompositeOffers$Offer$Tariff$$serializer plusPayCompositeOffers$Offer$Tariff$$serializer = new PlusPayCompositeOffers$Offer$Tariff$$serializer();
        INSTANCE = plusPayCompositeOffers$Offer$Tariff$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Tariff", plusPayCompositeOffers$Offer$Tariff$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("additionalText", false);
        pluginGeneratedSerialDescriptor.j("commonPrice", false);
        pluginGeneratedSerialDescriptor.j("commonPeriod", false);
        pluginGeneratedSerialDescriptor.j("plans", false);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.VENDOR, false);
        pluginGeneratedSerialDescriptor.j("payload", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayCompositeOffers$Offer$Tariff$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayCompositeOffers.Offer.Tariff.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), PlusPayPrice$$serializer.INSTANCE, auu0Var, i3yVarArr[8].getValue(), i3yVarArr[9].getValue(), qke.n((KSerializer) i3yVarArr[10].getValue())};
    }

    @Override // defpackage.myi
    public final PlusPayCompositeOffers.Offer.Tariff deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayCompositeOffers.Offer.Tariff.$childSerializers;
        b.getClass();
        Map map = null;
        PlusPayCompositeOffers.Offer.Vendor vendor = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        PlusPayPrice plusPayPrice = null;
        String str7 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr2 = i3yVarArr;
                    z = false;
                    break;
                case 0:
                    i3yVarArr2 = i3yVarArr;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr2 = i3yVarArr;
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr2 = i3yVarArr;
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr2 = i3yVarArr;
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr2 = i3yVarArr;
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr2 = i3yVarArr;
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr2 = i3yVarArr;
                    plusPayPrice = (PlusPayPrice) b.A(serialDescriptor, 6, PlusPayPrice$$serializer.INSTANCE, plusPayPrice);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr2 = i3yVarArr;
                    str7 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr2 = i3yVarArr;
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr2[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr2 = i3yVarArr;
                    vendor = (PlusPayCompositeOffers.Offer.Vendor) b.A(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), vendor);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr2 = i3yVarArr;
                    map = (Map) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), map);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr = i3yVarArr2;
        }
        b.c(serialDescriptor);
        return new PlusPayCompositeOffers.Offer.Tariff(i, str, str2, str3, str4, str5, str6, plusPayPrice, str7, list, vendor, map, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayCompositeOffers.Offer.Tariff value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayCompositeOffers.Offer.Tariff.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
