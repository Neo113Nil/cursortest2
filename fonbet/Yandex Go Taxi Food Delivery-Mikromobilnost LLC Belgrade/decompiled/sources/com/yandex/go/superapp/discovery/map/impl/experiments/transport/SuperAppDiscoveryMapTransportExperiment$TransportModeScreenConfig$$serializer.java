package com.yandex.go.superapp.discovery.map.impl.experiments.transport;

import com.yandex.go.superapp.discovery.map.impl.experiments.transport.SuperAppDiscoveryMapTransportExperiment;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.ggu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.j9u;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.l9u;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.StopModalDto;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/transport/SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig.$serializer", "Luxs;", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/transport/SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/discovery/map/impl/experiments/transport/SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/discovery/map/impl/experiments/transport/SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer implements uxs {
    public static final SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer superAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer = new SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer();
        INSTANCE = superAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.discovery.map.impl.experiments.transport.SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig", superAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer, 12);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("lineinfo_polling_period", true);
        pluginGeneratedSerialDescriptor.j("stopinfo_polling_period", true);
        pluginGeneratedSerialDescriptor.j("masstransit_map_style", true);
        pluginGeneratedSerialDescriptor.j("apply_map_style_on_main", true);
        pluginGeneratedSerialDescriptor.j("messagebox_enabled", true);
        pluginGeneratedSerialDescriptor.j("variants_style", true);
        pluginGeneratedSerialDescriptor.j("stops_scale", true);
        pluginGeneratedSerialDescriptor.j("stop_modal", true);
        pluginGeneratedSerialDescriptor.j("diff_time_limit", true);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("button_loading_delay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig.n;
        z96 z96Var = z96.a;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{z96Var, pnzVar, pnzVar, auu0.a, z96Var, z96Var, i3yVarArr[6].getValue(), i3yVarArr[7].getValue(), qke.n(ggu0.a), h6w.a, j9u.a, pnzVar};
    }

    @Override // defpackage.myi
    public final SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig.n;
        b.getClass();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        l9u l9uVar = null;
        boolean z = true;
        Map map = null;
        StopModalDto stopModalDto = null;
        List list = null;
        int i = 0;
        boolean z2 = false;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    j = b.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    j2 = b.f(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z3 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z4 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    stopModalDto = (StopModalDto) b.s(serialDescriptor, 8, ggu0.a, stopModalDto);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    i2 = b.h(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    l9uVar = (l9u) b.A(serialDescriptor, 10, j9u.a, l9uVar);
                    i |= 1024;
                    break;
                case 11:
                    j3 = b.f(serialDescriptor, 11);
                    i |= 2048;
                    continue;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig(i, z2, j, j2, str, z3, z4, map, list, stopModalDto, i2, l9uVar, j3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.l9u.d) == false) goto L67;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig.n;
        if (b.F() || value.b) {
            b.n(serialDescriptor, 0, value.b);
        }
        if (b.F() || value.c != 60) {
            b.s(serialDescriptor, 1, value.c);
        }
        if (b.F() || value.d != 30) {
            b.s(serialDescriptor, 2, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 3, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 4, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 5, value.g);
        }
        if (b.F() || !jl40.l(value.h, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.h);
        }
        if (b.F() || !jl40.l(value.i, EmptyList.a)) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 8, ggu0.a, value.j);
        }
        if (b.F() || value.k != 0) {
            b.A(9, value.k, serialDescriptor);
        }
        if (!b.F()) {
            l9u l9uVar = value.l;
            l9u.Companion.getClass();
        }
        b.e(serialDescriptor, 10, j9u.a, value.l);
        if (b.F() || value.m != 2000) {
            b.s(serialDescriptor, 11, value.m);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
