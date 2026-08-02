package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto.SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule.$serializer", "Luxs;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer implements uxs {
    public static final IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer = new IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer();
        INSTANCE = intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto.SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule", intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("requirement_name", true);
        pluginGeneratedSerialDescriptor.j("min_value", true);
        pluginGeneratedSerialDescriptor.j("max_value", true);
        pluginGeneratedSerialDescriptor.j("default_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0.a, h6wVar, h6wVar, qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Integer num = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i3 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule(i, i2, i3, num, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != 0) {
            b.A(1, value.b, serialDescriptor);
        }
        if (b.F() || value.c != 0) {
            b.A(2, value.c, serialDescriptor);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, h6w.a, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
