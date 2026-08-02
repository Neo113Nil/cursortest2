package com.yandex.go.payments.promo;

import com.adjust.sdk.Constants;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/promo/PaymentMethodsPromoBannerExperiment.PromoBannerDto.$serializer", "Luxs;", "Lcom/yandex/go/payments/promo/PaymentMethodsPromoBannerExperiment$PromoBannerDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/promo/PaymentMethodsPromoBannerExperiment$PromoBannerDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/promo/PaymentMethodsPromoBannerExperiment$PromoBannerDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PaymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PaymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer paymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer = new PaymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer();
        INSTANCE = paymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment.PromoBannerDto", paymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("description_key", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PaymentMethodsPromoBannerExperiment.PromoBannerDto.l;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(h6w.a), i3yVarArr[2].getValue(), qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final PaymentMethodsPromoBannerExperiment.PromoBannerDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        boolean z;
        i3y[] i3yVarArr3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PaymentMethodsPromoBannerExperiment.PromoBannerDto.l;
        b.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = true;
        String str4 = null;
        int i = 0;
        String str5 = null;
        Integer num = null;
        Set set = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr3 = i3yVarArr;
                    z2 = false;
                    i3yVarArr = i3yVarArr3;
                case 0:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str5 = b.k(serialDescriptor, 0);
                    i |= 1;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 1:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 2:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    set = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr2[2].getValue(), set);
                    i |= 4;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 3:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 3, auu0.a, str6);
                    i |= 8;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 4:
                    i3yVarArr3 = i3yVarArr;
                    str7 = b.k(serialDescriptor, 4);
                    i |= 16;
                    i3yVarArr = i3yVarArr3;
                case 5:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str8 = (String) b.s(serialDescriptor, 5, auu0.a, str8);
                    i |= 32;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 6:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i |= 64;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 7:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 7, auu0.a, str4);
                    i |= 128;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 8:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str3 = (String) b.s(serialDescriptor, 8, auu0.a, str3);
                    i |= 256;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 9, auu0.a, str2);
                    i |= 512;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 10:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PaymentMethodsPromoBannerExperiment.PromoBannerDto(i, str5, num, set, str6, str7, str8, str9, str4, str3, str2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentMethodsPromoBannerExperiment.PromoBannerDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PaymentMethodsPromoBannerExperiment.PromoBannerDto.l(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
