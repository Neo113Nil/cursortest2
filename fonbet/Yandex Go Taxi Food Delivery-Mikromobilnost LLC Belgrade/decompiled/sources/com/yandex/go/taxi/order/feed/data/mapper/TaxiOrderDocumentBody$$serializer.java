package com.yandex.go.taxi.order.feed.data.mapper;

import com.yandex.go.feed_common.api.payment.PaymentInfo;
import com.yandex.go.feed_common.api.payment.PaymentInfo$$serializer;
import defpackage.auu0;
import defpackage.jxi;
import defpackage.nf10;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pf10;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/feed/data/mapper/TaxiOrderDocumentBody.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/feed/data/mapper/TaxiOrderDocumentBody;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/feed/data/mapper/TaxiOrderDocumentBody;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/feed/data/mapper/TaxiOrderDocumentBody;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderDocumentBody$$serializer implements uxs {
    public static final TaxiOrderDocumentBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiOrderDocumentBody$$serializer taxiOrderDocumentBody$$serializer = new TaxiOrderDocumentBody$$serializer();
        INSTANCE = taxiOrderDocumentBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.feed.data.mapper.TaxiOrderDocumentBody", taxiOrderDocumentBody$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("userLocations", false);
        pluginGeneratedSerialDescriptor.j("media_size_info", false);
        pluginGeneratedSerialDescriptor.j("order_status", true);
        pluginGeneratedSerialDescriptor.j("payment_info", false);
        pluginGeneratedSerialDescriptor.j("order_tariff_class", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiOrderDocumentBody$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{TaxiOrderToDocumentBodyMapper$UserLocations$$serializer.INSTANCE, nf10.a, qke.n(auu0Var), PaymentInfo$$serializer.INSTANCE, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final TaxiOrderDocumentBody deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        TaxiOrderToDocumentBodyMapper$UserLocations taxiOrderToDocumentBodyMapper$UserLocations = null;
        pf10 pf10Var = null;
        String str = null;
        PaymentInfo paymentInfo = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                taxiOrderToDocumentBodyMapper$UserLocations = (TaxiOrderToDocumentBodyMapper$UserLocations) b.A(serialDescriptor, 0, TaxiOrderToDocumentBodyMapper$UserLocations$$serializer.INSTANCE, taxiOrderToDocumentBodyMapper$UserLocations);
                i |= 1;
            } else if (v == 1) {
                pf10Var = (pf10) b.A(serialDescriptor, 1, nf10.a, pf10Var);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else if (v == 3) {
                paymentInfo = (PaymentInfo) b.A(serialDescriptor, 3, PaymentInfo$$serializer.INSTANCE, paymentInfo);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new TaxiOrderDocumentBody(i, taxiOrderToDocumentBodyMapper$UserLocations, pf10Var, str, paymentInfo, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiOrderDocumentBody value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        TaxiOrderToDocumentBodyMapper$UserLocations$$serializer taxiOrderToDocumentBodyMapper$UserLocations$$serializer = TaxiOrderToDocumentBodyMapper$UserLocations$$serializer.INSTANCE;
        TaxiOrderToDocumentBodyMapper$UserLocations taxiOrderToDocumentBodyMapper$UserLocations = value.a;
        String str = value.e;
        String str2 = value.c;
        b.e(serialDescriptor, 0, taxiOrderToDocumentBodyMapper$UserLocations$$serializer, taxiOrderToDocumentBodyMapper$UserLocations);
        b.e(serialDescriptor, 1, nf10.a, value.b);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 2, auu0.a, str2);
        }
        b.e(serialDescriptor, 3, PaymentInfo$$serializer.INSTANCE, value.d);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 4, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
