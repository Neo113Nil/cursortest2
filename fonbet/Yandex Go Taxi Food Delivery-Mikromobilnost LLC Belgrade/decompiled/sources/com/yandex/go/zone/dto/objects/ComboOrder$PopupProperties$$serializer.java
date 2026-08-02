package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.ComboOrder;
import defpackage.auu0;
import defpackage.c7v;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.n7v;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/ComboOrder.PopupProperties.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/ComboOrder$PopupProperties;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/ComboOrder$PopupProperties;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/ComboOrder$PopupProperties;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class ComboOrder$PopupProperties$$serializer implements uxs {
    public static final ComboOrder$PopupProperties$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ComboOrder$PopupProperties$$serializer comboOrder$PopupProperties$$serializer = new ComboOrder$PopupProperties$$serializer();
        INSTANCE = comboOrder$PopupProperties$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.ComboOrder.PopupProperties", comboOrder$PopupProperties$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("decline_button_text", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_text", true);
        pluginGeneratedSerialDescriptor.j("buffer_list_item", true);
        pluginGeneratedSerialDescriptor.j("fake_passengers_number_selector", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ComboOrder$PopupProperties$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(c7v.a), auu0Var, auu0Var, auu0Var, ComboOrder$BufferListItem$$serializer.INSTANCE, ComboOrder$FakePassengersNumberSelector$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final ComboOrder.PopupProperties deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        n7v n7vVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ComboOrder.BufferListItem bufferListItem = null;
        ComboOrder.FakePassengersNumberSelector fakePassengersNumberSelector = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    n7vVar = (n7v) b.s(serialDescriptor, 0, c7v.a, n7vVar);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    bufferListItem = (ComboOrder.BufferListItem) b.A(serialDescriptor, 4, ComboOrder$BufferListItem$$serializer.INSTANCE, bufferListItem);
                    i |= 16;
                    break;
                case 5:
                    fakePassengersNumberSelector = (ComboOrder.FakePassengersNumberSelector) b.A(serialDescriptor, 5, ComboOrder$FakePassengersNumberSelector$$serializer.INSTANCE, fakePassengersNumberSelector);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ComboOrder.PopupProperties(i, n7vVar, str, str2, str3, bufferListItem, fakePassengersNumberSelector);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.ComboOrder.BufferListItem.c) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.ComboOrder.FakePassengersNumberSelector.f) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ComboOrder.PopupProperties value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        g0 g0Var = ComboOrder.PopupProperties.Companion;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, c7v.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (!b.F()) {
            ComboOrder.BufferListItem bufferListItem = value.e;
            ComboOrder.BufferListItem.Companion.getClass();
        }
        b.e(serialDescriptor, 4, ComboOrder$BufferListItem$$serializer.INSTANCE, value.e);
        if (!b.F()) {
            ComboOrder.FakePassengersNumberSelector fakePassengersNumberSelector = value.f;
            ComboOrder.FakePassengersNumberSelector.Companion.getClass();
        }
        b.e(serialDescriptor, 5, ComboOrder$FakePassengersNumberSelector$$serializer.INSTANCE, value.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
