package com.yandex.plus.pay.internal.model;

import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.psq0;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xpd0;
import defpackage.yjd;
import defpackage.zpd0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails.PaymentMethod.$serializer", "Luxs;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayCompositeOfferDetails$PaymentMethod$$serializer implements uxs {
    public static final PlusPayCompositeOfferDetails$PaymentMethod$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayCompositeOfferDetails$PaymentMethod$$serializer plusPayCompositeOfferDetails$PaymentMethod$$serializer = new PlusPayCompositeOfferDetails$PaymentMethod$$serializer();
        INSTANCE = plusPayCompositeOfferDetails$PaymentMethod$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails.PaymentMethod", plusPayCompositeOfferDetails$PaymentMethod$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("bankName", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("textColor", false);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.j("buttonAsset", false);
        pluginGeneratedSerialDescriptor.j("widgetUrls", true);
        pluginGeneratedSerialDescriptor.j("timeoutParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayCompositeOfferDetails$PaymentMethod$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayCompositeOfferDetails.PaymentMethod.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var), auu0Var, xpd0.a, i3yVarArr[5].getValue(), i3yVarArr[6].getValue(), qke.n(PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE), qke.n(zpd0.a), qke.n(PlusPayWebPaymentWidgetTimeoutParams$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final PlusPayCompositeOfferDetails.PaymentMethod deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayCompositeOfferDetails.PaymentMethod.$childSerializers;
        b.getClass();
        PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams = null;
        PlusThemedUrl plusThemedUrl = null;
        boolean z = true;
        PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset = null;
        int i = 0;
        String str = null;
        PlusPayCompositeOfferDetails.PaymentMethod.Type type = null;
        String str2 = null;
        String str3 = null;
        PlusThemedImage plusThemedImage = null;
        PlusThemedColor plusThemedColor = null;
        PlusThemedColor plusThemedColor2 = null;
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
                    type = (PlusPayCompositeOfferDetails.PaymentMethod.Type) b.A(serialDescriptor, 1, (myi) i3yVarArr2[1].getValue(), type);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr2 = i3yVarArr;
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr2 = i3yVarArr;
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr2 = i3yVarArr;
                    plusThemedImage = (PlusThemedImage) b.A(serialDescriptor, 4, xpd0.a, plusThemedImage);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr2 = i3yVarArr;
                    plusThemedColor = (PlusThemedColor) b.A(serialDescriptor, 5, (myi) i3yVarArr2[5].getValue(), plusThemedColor);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr2 = i3yVarArr;
                    plusThemedColor2 = (PlusThemedColor) b.A(serialDescriptor, 6, (myi) i3yVarArr2[6].getValue(), plusThemedColor2);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr2 = i3yVarArr;
                    buttonAsset = (PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset) b.s(serialDescriptor, 7, PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE, buttonAsset);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr2 = i3yVarArr;
                    plusThemedUrl = (PlusThemedUrl) b.s(serialDescriptor, 8, zpd0.a, plusThemedUrl);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr2 = i3yVarArr;
                    plusPayWebPaymentWidgetTimeoutParams = (PlusPayWebPaymentWidgetTimeoutParams) b.s(serialDescriptor, 9, PlusPayWebPaymentWidgetTimeoutParams$$serializer.INSTANCE, plusPayWebPaymentWidgetTimeoutParams);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr = i3yVarArr2;
        }
        b.c(serialDescriptor);
        return new PlusPayCompositeOfferDetails.PaymentMethod(i, str, type, str2, str3, plusThemedImage, plusThemedColor, plusThemedColor2, buttonAsset, plusThemedUrl, plusPayWebPaymentWidgetTimeoutParams, (psq0) null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayCompositeOfferDetails.PaymentMethod value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayCompositeOfferDetails.PaymentMethod.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
