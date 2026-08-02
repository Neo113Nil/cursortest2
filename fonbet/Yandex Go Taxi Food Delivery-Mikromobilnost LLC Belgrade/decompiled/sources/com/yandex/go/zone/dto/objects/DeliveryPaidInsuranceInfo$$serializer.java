package com.yandex.go.zone.dto.objects;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryPaidInsuranceInfo.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class DeliveryPaidInsuranceInfo$$serializer implements uxs {
    public static final DeliveryPaidInsuranceInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryPaidInsuranceInfo$$serializer deliveryPaidInsuranceInfo$$serializer = new DeliveryPaidInsuranceInfo$$serializer();
        INSTANCE = deliveryPaidInsuranceInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceInfo", deliveryPaidInsuranceInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("summary_list_item", true);
        pluginGeneratedSerialDescriptor.j("summary_bubble", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeliveryPaidInsuranceInfo$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, DeliveryPaidInsuranceScreen$$serializer.INSTANCE, DeliveryPaidInsuranceSummaryListItem$$serializer.INSTANCE, DeliveryPaidInsuranceSummaryBubble$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final DeliveryPaidInsuranceInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        DeliveryPaidInsuranceScreen deliveryPaidInsuranceScreen = null;
        DeliveryPaidInsuranceSummaryListItem deliveryPaidInsuranceSummaryListItem = null;
        DeliveryPaidInsuranceSummaryBubble deliveryPaidInsuranceSummaryBubble = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                deliveryPaidInsuranceScreen = (DeliveryPaidInsuranceScreen) b.A(serialDescriptor, 1, DeliveryPaidInsuranceScreen$$serializer.INSTANCE, deliveryPaidInsuranceScreen);
                i |= 2;
            } else if (v == 2) {
                deliveryPaidInsuranceSummaryListItem = (DeliveryPaidInsuranceSummaryListItem) b.A(serialDescriptor, 2, DeliveryPaidInsuranceSummaryListItem$$serializer.INSTANCE, deliveryPaidInsuranceSummaryListItem);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                deliveryPaidInsuranceSummaryBubble = (DeliveryPaidInsuranceSummaryBubble) b.A(serialDescriptor, 3, DeliveryPaidInsuranceSummaryBubble$$serializer.INSTANCE, deliveryPaidInsuranceSummaryBubble);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new DeliveryPaidInsuranceInfo(i, z2, deliveryPaidInsuranceScreen, deliveryPaidInsuranceSummaryListItem, deliveryPaidInsuranceSummaryBubble);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DeliveryPaidInsuranceInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, new DeliveryPaidInsuranceScreen(148))) {
            b.e(serialDescriptor, 1, DeliveryPaidInsuranceScreen$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, new DeliveryPaidInsuranceSummaryListItem(0))) {
            b.e(serialDescriptor, 2, DeliveryPaidInsuranceSummaryListItem$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, new DeliveryPaidInsuranceSummaryBubble(0))) {
            b.e(serialDescriptor, 3, DeliveryPaidInsuranceSummaryBubble$$serializer.INSTANCE, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
