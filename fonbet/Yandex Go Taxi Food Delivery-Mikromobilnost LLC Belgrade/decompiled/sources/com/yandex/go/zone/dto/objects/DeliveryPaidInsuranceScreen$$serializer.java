package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreen.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class DeliveryPaidInsuranceScreen$$serializer implements uxs {
    public static final DeliveryPaidInsuranceScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryPaidInsuranceScreen$$serializer deliveryPaidInsuranceScreen$$serializer = new DeliveryPaidInsuranceScreen$$serializer();
        INSTANCE = deliveryPaidInsuranceScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreen", deliveryPaidInsuranceScreen$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("toggle", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("description_at", true);
        pluginGeneratedSerialDescriptor.j("info_button", true);
        pluginGeneratedSerialDescriptor.j("button_text", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeliveryPaidInsuranceScreen$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DeliveryPaidInsuranceScreen.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, qke.n(DeliveryPaidInsuranceToggleItem$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(DeliveryPaidInsuranceInfoButton$$serializer.INSTANCE), auu0Var, qke.n(DeliveryPaidInsuranceScreenButtonByEntryPoint$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final DeliveryPaidInsuranceScreen deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryPaidInsuranceScreen.i;
        b.getClass();
        DeliveryPaidInsuranceScreen deliveryPaidInsuranceScreen = null;
        boolean z = true;
        DeliveryPaidInsuranceScreenButtonByEntryPoint deliveryPaidInsuranceScreenButtonByEntryPoint = null;
        String str = null;
        String str2 = null;
        DeliveryPaidInsuranceToggleItem deliveryPaidInsuranceToggleItem = null;
        List list = null;
        List list2 = null;
        DeliveryPaidInsuranceInfoButton deliveryPaidInsuranceInfoButton = null;
        String str3 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    deliveryPaidInsuranceToggleItem = (DeliveryPaidInsuranceToggleItem) b.s(serialDescriptor, 2, DeliveryPaidInsuranceToggleItem$$serializer.INSTANCE, deliveryPaidInsuranceToggleItem);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    deliveryPaidInsuranceInfoButton = (DeliveryPaidInsuranceInfoButton) b.s(serialDescriptor, 5, DeliveryPaidInsuranceInfoButton$$serializer.INSTANCE, deliveryPaidInsuranceInfoButton);
                    i |= 32;
                    break;
                case 6:
                    str3 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    deliveryPaidInsuranceScreenButtonByEntryPoint = (DeliveryPaidInsuranceScreenButtonByEntryPoint) b.s(serialDescriptor, 7, DeliveryPaidInsuranceScreenButtonByEntryPoint$$serializer.INSTANCE, deliveryPaidInsuranceScreenButtonByEntryPoint);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return deliveryPaidInsuranceScreen;
            }
            deliveryPaidInsuranceScreen = null;
        }
        b.c(serialDescriptor);
        return new DeliveryPaidInsuranceScreen(i, str, str2, deliveryPaidInsuranceToggleItem, list, list2, deliveryPaidInsuranceInfoButton, str3, deliveryPaidInsuranceScreenButtonByEntryPoint);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DeliveryPaidInsuranceScreen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryPaidInsuranceScreen.i;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, DeliveryPaidInsuranceToggleItem$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, DeliveryPaidInsuranceInfoButton$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, DeliveryPaidInsuranceScreenButtonByEntryPoint$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
