package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto.TariffSelectorSectionDtoIntercity.SelectorItemDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer implements uxs {
    public static final IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer = new IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer();
        INSTANCE = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto.TariffSelectorSectionDtoIntercity.SelectorItemDto", intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.DISABLED, true);
        pluginGeneratedSerialDescriptor.j("default_state", true);
        pluginGeneratedSerialDescriptor.j("selected_state_overrides", true);
        pluginGeneratedSerialDescriptor.j("unavailable_state_overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(z96.a);
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer = IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer.INSTANCE;
        KSerializer n2 = qke.n(intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer);
        KSerializer n3 = qke.n(intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, n, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$SelectorItemState$$serializer.INSTANCE, n2, n3};
    }

    @Override // defpackage.myi
    public final IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.SelectorItemState selectorItemState = null;
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.OptionalSelectorItemState optionalSelectorItemState = null;
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.OptionalSelectorItemState optionalSelectorItemState2 = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                    i |= 4;
                    break;
                case 3:
                    selectorItemState = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.SelectorItemState) b.A(serialDescriptor, 3, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$SelectorItemState$$serializer.INSTANCE, selectorItemState);
                    i |= 8;
                    break;
                case 4:
                    optionalSelectorItemState = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.OptionalSelectorItemState) b.s(serialDescriptor, 4, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer.INSTANCE, optionalSelectorItemState);
                    i |= 16;
                    break;
                case 5:
                    optionalSelectorItemState2 = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.OptionalSelectorItemState) b.s(serialDescriptor, 5, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer.INSTANCE, optionalSelectorItemState2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto(i, str, str2, bool, selectorItemState, optionalSelectorItemState, optionalSelectorItemState2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, z96.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, new IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.SelectorItemState(0))) {
            b.e(serialDescriptor, 3, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$SelectorItemState$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
