package com.yandex.go.zone.dto.objects;

import com.yandex.go.order.state.instructions.InstructionItemButton;
import com.yandex.go.order.state.instructions.InstructionItemButton$$serializer;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction$$serializer;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/ScheduledOrderDescriptionItem.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/ScheduledOrderDescriptionItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/ScheduledOrderDescriptionItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/ScheduledOrderDescriptionItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ScheduledOrderDescriptionItem$$serializer implements uxs {
    public static final ScheduledOrderDescriptionItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduledOrderDescriptionItem$$serializer scheduledOrderDescriptionItem$$serializer = new ScheduledOrderDescriptionItem$$serializer();
        INSTANCE = scheduledOrderDescriptionItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.ScheduledOrderDescriptionItem", scheduledOrderDescriptionItem$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("icon_image_tag", true);
        pluginGeneratedSerialDescriptor.j("substitute_daytime", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("substitute_daytime_delta_mins", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScheduledOrderDescriptionItem$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), auu0Var, z96.a, qke.n(InstructionItemButton$$serializer.INSTANCE), qke.n(ScheduledOrderItemAction$$serializer.INSTANCE), h6w.a};
    }

    @Override // defpackage.myi
    public final ScheduledOrderDescriptionItem deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        InstructionItemButton instructionItemButton = null;
        ScheduledOrderItemAction scheduledOrderItemAction = null;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    instructionItemButton = (InstructionItemButton) b.s(serialDescriptor, 4, InstructionItemButton$$serializer.INSTANCE, instructionItemButton);
                    i |= 16;
                    break;
                case 5:
                    scheduledOrderItemAction = (ScheduledOrderItemAction) b.s(serialDescriptor, 5, ScheduledOrderItemAction$$serializer.INSTANCE, scheduledOrderItemAction);
                    i |= 32;
                    break;
                case 6:
                    i2 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ScheduledOrderDescriptionItem(i, str, str2, str3, z2, instructionItemButton, scheduledOrderItemAction, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScheduledOrderDescriptionItem value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ScheduledOrderDescriptionItem.d(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
