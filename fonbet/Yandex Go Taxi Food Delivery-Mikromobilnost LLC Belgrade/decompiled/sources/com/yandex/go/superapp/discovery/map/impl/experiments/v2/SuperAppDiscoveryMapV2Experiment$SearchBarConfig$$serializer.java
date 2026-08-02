package com.yandex.go.superapp.discovery.map.impl.experiments.v2;

import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment.SearchBarConfig.$serializer", "Luxs;", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$SearchBarConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$SearchBarConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$SearchBarConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer implements uxs {
    public static final SuperAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer superAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer = new SuperAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer();
        INSTANCE = superAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment.SearchBarConfig", superAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("main_button", true);
        pluginGeneratedSerialDescriptor.j("leading_buttons", true);
        pluginGeneratedSerialDescriptor.j("trailing_buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppDiscoveryMapV2Experiment$SearchBarConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SuperAppDiscoveryMapV2Experiment.SearchBarConfig.e;
        return new KSerializer[]{z96.a, SuperAppDiscoveryMapV2Experiment$Searchbar$$serializer.INSTANCE, i3yVarArr[2].getValue(), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final SuperAppDiscoveryMapV2Experiment.SearchBarConfig deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppDiscoveryMapV2Experiment.SearchBarConfig.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        SuperAppDiscoveryMapV2Experiment.Searchbar searchbar = null;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                searchbar = (SuperAppDiscoveryMapV2Experiment.Searchbar) b.A(serialDescriptor, 1, SuperAppDiscoveryMapV2Experiment$Searchbar$$serializer.INSTANCE, searchbar);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppDiscoveryMapV2Experiment.SearchBarConfig(i, z2, searchbar, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppDiscoveryMapV2Experiment.SearchBarConfig value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppDiscoveryMapV2Experiment.SearchBarConfig.e;
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, new SuperAppDiscoveryMapV2Experiment.Searchbar(0))) {
            b.e(serialDescriptor, 1, SuperAppDiscoveryMapV2Experiment$Searchbar$$serializer.INSTANCE, value.b);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || !jl40.l(value.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
