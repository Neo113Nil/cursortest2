package com.yandex.plus.pay.internal.model;

import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPayPrice$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayInvoice.$serializer", "Luxs;", "Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusPayInvoice$$serializer implements uxs {
    public static final PlusPayInvoice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlusPayInvoice$$serializer plusPayInvoice$$serializer = new PlusPayInvoice$$serializer();
        INSTANCE = plusPayInvoice$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.model.PlusPayInvoice", plusPayInvoice$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("invoiceStatus", false);
        pluginGeneratedSerialDescriptor.j("paymentMethodId", false);
        pluginGeneratedSerialDescriptor.j("paidAmount", false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("totalAmount", false);
        pluginGeneratedSerialDescriptor.j("trustFormUrl", false);
        pluginGeneratedSerialDescriptor.j("pollingConfiguration", false);
        pluginGeneratedSerialDescriptor.j("webWidgetQrCodeParams", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlusPayInvoice$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayInvoice.$childSerializers;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n((KSerializer) i3yVarArr[1].getValue());
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(PlusPayInvoice$Payment$$serializer.INSTANCE);
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n(PlusPayInvoice$PollingConfiguration$$serializer.INSTANCE);
        KSerializer n6 = qke.n(PlusPayInvoice$WebWidgetQrCodeParams$$serializer.INSTANCE);
        PlusPayPrice$$serializer plusPayPrice$$serializer = PlusPayPrice$$serializer.INSTANCE;
        return new KSerializer[]{auu0Var, n, n2, plusPayPrice$$serializer, n3, plusPayPrice$$serializer, n4, n5, n6};
    }

    @Override // defpackage.myi
    public final PlusPayInvoice deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayInvoice.$childSerializers;
        b.getClass();
        PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams = null;
        boolean z = true;
        PlusPayInvoice.PollingConfiguration pollingConfiguration = null;
        int i = 0;
        String str = null;
        PlusPayInvoice.Status status = null;
        String str2 = null;
        PlusPayPrice plusPayPrice = null;
        PlusPayInvoice.Payment payment = null;
        PlusPayPrice plusPayPrice2 = null;
        String str3 = null;
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
                    status = (PlusPayInvoice.Status) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), status);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    plusPayPrice = (PlusPayPrice) b.A(serialDescriptor, 3, PlusPayPrice$$serializer.INSTANCE, plusPayPrice);
                    i |= 8;
                    break;
                case 4:
                    payment = (PlusPayInvoice.Payment) b.s(serialDescriptor, 4, PlusPayInvoice$Payment$$serializer.INSTANCE, payment);
                    i |= 16;
                    break;
                case 5:
                    plusPayPrice2 = (PlusPayPrice) b.A(serialDescriptor, 5, PlusPayPrice$$serializer.INSTANCE, plusPayPrice2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                case 7:
                    pollingConfiguration = (PlusPayInvoice.PollingConfiguration) b.s(serialDescriptor, 7, PlusPayInvoice$PollingConfiguration$$serializer.INSTANCE, pollingConfiguration);
                    i |= 128;
                    break;
                case 8:
                    webWidgetQrCodeParams = (PlusPayInvoice.WebWidgetQrCodeParams) b.s(serialDescriptor, 8, PlusPayInvoice$WebWidgetQrCodeParams$$serializer.INSTANCE, webWidgetQrCodeParams);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlusPayInvoice(i, str, status, str2, plusPayPrice, payment, plusPayPrice2, str3, pollingConfiguration, webWidgetQrCodeParams, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlusPayInvoice value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayInvoice.write$Self$pay_sdk_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
