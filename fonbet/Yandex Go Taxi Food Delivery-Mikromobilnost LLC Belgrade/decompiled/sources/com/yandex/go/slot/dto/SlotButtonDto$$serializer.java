package com.yandex.go.slot.dto;

import com.yandex.go.slot.dto.SlotButtonDto;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/slot/dto/SlotButtonDto.$serializer", "Luxs;", "Lcom/yandex/go/slot/dto/SlotButtonDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/slot/dto/SlotButtonDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/slot/dto/SlotButtonDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class SlotButtonDto$$serializer implements uxs {
    public static final SlotButtonDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SlotButtonDto$$serializer slotButtonDto$$serializer = new SlotButtonDto$$serializer();
        INSTANCE = slotButtonDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.slot.dto.SlotButtonDto", slotButtonDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("analytics_id", true);
        pluginGeneratedSerialDescriptor.j("accessibility", true);
        pluginGeneratedSerialDescriptor.j("width_strategy", true);
        pluginGeneratedSerialDescriptor.j("button_properties", true);
        pluginGeneratedSerialDescriptor.j("slot", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SlotButtonDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SlotButtonDto.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[4].getValue(), SlotButtonDto$Properties$$serializer.INSTANCE, qke.n(SlotItemDto$$serializer.INSTANCE), qke.n(BadgeItemDto.Companion.serializer())};
    }

    @Override // defpackage.myi
    public final SlotButtonDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SlotButtonDto.i;
        b.getClass();
        SlotButtonDto slotButtonDto = null;
        boolean z = true;
        BadgeItemDto badgeItemDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        SlotButtonDto.WidthStrategy widthStrategy = null;
        SlotButtonDto.Properties properties = null;
        SlotItemDto slotItemDto = null;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    widthStrategy = (SlotButtonDto.WidthStrategy) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), widthStrategy);
                    i |= 16;
                    break;
                case 5:
                    properties = (SlotButtonDto.Properties) b.A(serialDescriptor, 5, SlotButtonDto$Properties$$serializer.INSTANCE, properties);
                    i |= 32;
                    break;
                case 6:
                    slotItemDto = (SlotItemDto) b.s(serialDescriptor, 6, SlotItemDto$$serializer.INSTANCE, slotItemDto);
                    i |= 64;
                    break;
                case 7:
                    badgeItemDto = (BadgeItemDto) b.s(serialDescriptor, 7, BadgeItemDto.Companion.serializer(), badgeItemDto);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return slotButtonDto;
            }
            slotButtonDto = null;
        }
        b.c(serialDescriptor);
        return new SlotButtonDto(i, str, str2, str3, str4, widthStrategy, properties, slotItemDto, badgeItemDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SlotButtonDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SlotButtonDto.i;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != SlotButtonDto.WidthStrategy.DEFAULT) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || !jl40.l(value.f, new SlotButtonDto.Properties(0))) {
            b.e(serialDescriptor, 5, SlotButtonDto$Properties$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, SlotItemDto$$serializer.INSTANCE, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, BadgeItemDto.Companion.serializer(), value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
