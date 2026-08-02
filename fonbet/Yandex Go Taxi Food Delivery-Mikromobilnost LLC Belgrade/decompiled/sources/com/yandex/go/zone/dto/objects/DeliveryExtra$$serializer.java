package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.DeliveryExtra;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.q7i;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryExtra.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/DeliveryExtra;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/DeliveryExtra;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/DeliveryExtra;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class DeliveryExtra$$serializer implements uxs {
    public static final DeliveryExtra$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryExtra$$serializer deliveryExtra$$serializer = new DeliveryExtra$$serializer();
        INSTANCE = deliveryExtra$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.DeliveryExtra", deliveryExtra$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("offer_id", true);
        pluginGeneratedSerialDescriptor.j("order_select_settings", true);
        pluginGeneratedSerialDescriptor.j("pins", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("delivery_information_form", true);
        pluginGeneratedSerialDescriptor.j("flow_type", true);
        pluginGeneratedSerialDescriptor.j("cost_details", true);
        pluginGeneratedSerialDescriptor.j("paid_insurance_info", true);
        pluginGeneratedSerialDescriptor.j("rental", true);
        pluginGeneratedSerialDescriptor.j("door_to_door", true);
        pluginGeneratedSerialDescriptor.j("ordering_process", true);
        pluginGeneratedSerialDescriptor.j("delivery_intervals", true);
        pluginGeneratedSerialDescriptor.j("estimated_waiting", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeliveryExtra$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = DeliveryExtra.n;
        return new KSerializer[]{qke.n(auu0.a), qke.n(DeliveryExtra$OrderSelectSettings$$serializer.INSTANCE), i3yVarArr[2].getValue(), qke.n(DeliveryExtra$Service$$serializer.INSTANCE), qke.n(DeliveryExtra$DeliveryInformationForm$$serializer.INSTANCE), i3yVarArr[5].getValue(), qke.n(DeliveryCostDetails$$serializer.INSTANCE), qke.n(DeliveryPaidInsuranceInfo$$serializer.INSTANCE), qke.n(DeliveryRentalDetails$$serializer.INSTANCE), qke.n(DeliveryDoorToDoorDetails$$serializer.INSTANCE), qke.n(DeliveryOrderingProcess$$serializer.INSTANCE), qke.n(DeliveryTimeIntervals$$serializer.INSTANCE), qke.n(q7i.e)};
    }

    @Override // defpackage.myi
    public final DeliveryExtra deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        String str;
        DeliveryExtra.OrderSelectSettings orderSelectSettings;
        DeliveryTimeIntervals deliveryTimeIntervals;
        DeliveryOrderingProcess deliveryOrderingProcess;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = DeliveryExtra.n;
        b.getClass();
        DeliveryTimeIntervals deliveryTimeIntervals2 = null;
        DeliveryOrderingProcess deliveryOrderingProcess2 = null;
        DeliveryDoorToDoorDetails deliveryDoorToDoorDetails = null;
        DeliveryRentalDetails deliveryRentalDetails = null;
        s0 s0Var = null;
        DeliveryPaidInsuranceInfo deliveryPaidInsuranceInfo = null;
        int i = 0;
        String str2 = null;
        DeliveryExtra.OrderSelectSettings orderSelectSettings2 = null;
        List list = null;
        DeliveryExtra.Service service = null;
        DeliveryExtra.DeliveryInformationForm deliveryInformationForm = null;
        DeliveryExtra.DeliveryFlowType deliveryFlowType = null;
        DeliveryCostDetails deliveryCostDetails = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    deliveryTimeIntervals = deliveryTimeIntervals2;
                    deliveryOrderingProcess = deliveryOrderingProcess2;
                    z = false;
                    deliveryOrderingProcess2 = deliveryOrderingProcess;
                    deliveryTimeIntervals2 = deliveryTimeIntervals;
                case 0:
                    deliveryTimeIntervals = deliveryTimeIntervals2;
                    deliveryOrderingProcess = deliveryOrderingProcess2;
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i |= 1;
                    deliveryOrderingProcess2 = deliveryOrderingProcess;
                    deliveryTimeIntervals2 = deliveryTimeIntervals;
                case 1:
                    deliveryTimeIntervals = deliveryTimeIntervals2;
                    orderSelectSettings2 = (DeliveryExtra.OrderSelectSettings) b.s(serialDescriptor, 1, DeliveryExtra$OrderSelectSettings$$serializer.INSTANCE, orderSelectSettings2);
                    i |= 2;
                    str2 = str2;
                    deliveryTimeIntervals2 = deliveryTimeIntervals;
                case 2:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 3:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    service = (DeliveryExtra.Service) b.s(serialDescriptor, 3, DeliveryExtra$Service$$serializer.INSTANCE, service);
                    i |= 8;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 4:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryInformationForm = (DeliveryExtra.DeliveryInformationForm) b.s(serialDescriptor, 4, DeliveryExtra$DeliveryInformationForm$$serializer.INSTANCE, deliveryInformationForm);
                    i |= 16;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 5:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryFlowType = (DeliveryExtra.DeliveryFlowType) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), deliveryFlowType);
                    i |= 32;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 6:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryCostDetails = (DeliveryCostDetails) b.s(serialDescriptor, 6, DeliveryCostDetails$$serializer.INSTANCE, deliveryCostDetails);
                    i |= 64;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 7:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryPaidInsuranceInfo = (DeliveryPaidInsuranceInfo) b.s(serialDescriptor, 7, DeliveryPaidInsuranceInfo$$serializer.INSTANCE, deliveryPaidInsuranceInfo);
                    i |= 128;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 8:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryRentalDetails = (DeliveryRentalDetails) b.s(serialDescriptor, 8, DeliveryRentalDetails$$serializer.INSTANCE, deliveryRentalDetails);
                    i |= 256;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 9:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryDoorToDoorDetails = (DeliveryDoorToDoorDetails) b.s(serialDescriptor, 9, DeliveryDoorToDoorDetails$$serializer.INSTANCE, deliveryDoorToDoorDetails);
                    i |= 512;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 10:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryOrderingProcess2 = (DeliveryOrderingProcess) b.s(serialDescriptor, 10, DeliveryOrderingProcess$$serializer.INSTANCE, deliveryOrderingProcess2);
                    i |= 1024;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 11:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    deliveryTimeIntervals2 = (DeliveryTimeIntervals) b.s(serialDescriptor, 11, DeliveryTimeIntervals$$serializer.INSTANCE, deliveryTimeIntervals2);
                    i |= 2048;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                case 12:
                    str = str2;
                    orderSelectSettings = orderSelectSettings2;
                    s0Var = (s0) b.s(serialDescriptor, 12, q7i.e, s0Var);
                    i |= 4096;
                    str2 = str;
                    orderSelectSettings2 = orderSelectSettings;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        DeliveryOrderingProcess deliveryOrderingProcess3 = deliveryOrderingProcess2;
        b.c(serialDescriptor);
        return new DeliveryExtra(i, str2, orderSelectSettings2, list, service, deliveryInformationForm, deliveryFlowType, deliveryCostDetails, deliveryPaidInsuranceInfo, deliveryRentalDetails, deliveryDoorToDoorDetails, deliveryOrderingProcess3, deliveryTimeIntervals2, s0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DeliveryExtra value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        DeliveryExtra.n(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
