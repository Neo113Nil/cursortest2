package com.yandex.go.slot.dto;

import com.yandex.go.slot.dto.SlotButtonDto;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/slot/dto/SlotButtonDto.Properties.$serializer", "Luxs;", "Lcom/yandex/go/slot/dto/SlotButtonDto$Properties;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/slot/dto/SlotButtonDto$Properties;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/slot/dto/SlotButtonDto$Properties;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class SlotButtonDto$Properties$$serializer implements uxs {
    public static final SlotButtonDto$Properties$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SlotButtonDto$Properties$$serializer slotButtonDto$Properties$$serializer = new SlotButtonDto$Properties$$serializer();
        INSTANCE = slotButtonDto$Properties$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.slot.dto.SlotButtonDto.Properties", slotButtonDto$Properties$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("size", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("form", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SlotButtonDto$Properties$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SlotButtonDto.Properties.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final SlotButtonDto.Properties deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SlotButtonDto.Properties.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        SlotButtonDto.Properties.Size size = null;
        SlotButtonDto.Properties.Style style = null;
        SlotButtonDto.Properties.Form form = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                size = (SlotButtonDto.Properties.Size) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), size);
                i |= 1;
            } else if (v == 1) {
                style = (SlotButtonDto.Properties.Style) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), style);
                i |= 2;
            } else if (v == 2) {
                form = (SlotButtonDto.Properties.Form) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), form);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SlotButtonDto.Properties(i, size, style, form, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SlotButtonDto.Properties value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SlotButtonDto.Properties.e;
        if (b.F() || value.a != SlotButtonDto.Properties.Size.M) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != SlotButtonDto.Properties.Style.MINOR) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != SlotButtonDto.Properties.Form.SQUIRCLE) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || !jl40.l(value.d, "controlMinor")) {
            b.o(serialDescriptor, 3, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
