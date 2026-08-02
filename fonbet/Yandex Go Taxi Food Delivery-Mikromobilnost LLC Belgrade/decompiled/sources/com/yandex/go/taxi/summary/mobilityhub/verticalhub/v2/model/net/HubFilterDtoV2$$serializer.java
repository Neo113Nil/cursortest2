package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xxu;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubFilterDtoV2.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubFilterDtoV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubFilterDtoV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubFilterDtoV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubFilterDtoV2$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubFilterDtoV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubFilterDtoV2$$serializer hubFilterDtoV2$$serializer = new HubFilterDtoV2$$serializer();
        INSTANCE = hubFilterDtoV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterDtoV2", hubFilterDtoV2$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("content_description", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("is_selected", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("selected_state", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("reset_action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubFilterDtoV2$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        FilterStateDtoV2$$serializer filterStateDtoV2$$serializer = FilterStateDtoV2$$serializer.INSTANCE;
        return new KSerializer[]{auu0Var, auu0Var, n, n2, z96.a, filterStateDtoV2$$serializer, qke.n(filterStateDtoV2$$serializer), xxu.e, qke.n(ResetFilterAction$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final HubFilterDtoV2 deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        HubFilterDtoV2 hubFilterDtoV2 = null;
        boolean z = true;
        ResetFilterAction resetFilterAction = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        FilterStateDtoV2 filterStateDtoV2 = null;
        FilterStateDtoV2 filterStateDtoV22 = null;
        y yVar = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
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
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    filterStateDtoV2 = (FilterStateDtoV2) b.A(serialDescriptor, 5, FilterStateDtoV2$$serializer.INSTANCE, filterStateDtoV2);
                    i |= 32;
                    break;
                case 6:
                    filterStateDtoV22 = (FilterStateDtoV2) b.s(serialDescriptor, 6, FilterStateDtoV2$$serializer.INSTANCE, filterStateDtoV22);
                    i |= 64;
                    break;
                case 7:
                    yVar = (y) b.A(serialDescriptor, 7, xxu.e, yVar);
                    i |= 128;
                    break;
                case 8:
                    resetFilterAction = (ResetFilterAction) b.s(serialDescriptor, 8, ResetFilterAction$$serializer.INSTANCE, resetFilterAction);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return hubFilterDtoV2;
            }
            hubFilterDtoV2 = null;
        }
        b.c(serialDescriptor);
        return new HubFilterDtoV2(i, str, str2, str3, str4, z2, filterStateDtoV2, filterStateDtoV22, yVar, resetFilterAction);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubFilterDtoV2 value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, new FilterStateDtoV2(0))) {
            b.e(serialDescriptor, 5, FilterStateDtoV2$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, FilterStateDtoV2$$serializer.INSTANCE, value.g);
        }
        if (b.F() || !jl40.l(value.h, x.INSTANCE)) {
            b.e(serialDescriptor, 7, xxu.e, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, ResetFilterAction$$serializer.INSTANCE, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
