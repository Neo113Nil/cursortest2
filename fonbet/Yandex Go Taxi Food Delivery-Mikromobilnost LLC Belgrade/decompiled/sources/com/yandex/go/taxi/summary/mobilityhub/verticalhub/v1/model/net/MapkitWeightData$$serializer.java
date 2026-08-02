package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.h6w;
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
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitWeightData.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitWeightData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitWeightData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitWeightData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class MapkitWeightData$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MapkitWeightData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MapkitWeightData$$serializer mapkitWeightData$$serializer = new MapkitWeightData$$serializer();
        INSTANCE = mapkitWeightData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitWeightData", mapkitWeightData$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.TIME, false);
        pluginGeneratedSerialDescriptor.j("walking_distance", false);
        pluginGeneratedSerialDescriptor.j("transfers_count", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapkitWeightData$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        LocalizedValueParam$$serializer localizedValueParam$$serializer = LocalizedValueParam$$serializer.INSTANCE;
        return new KSerializer[]{localizedValueParam$$serializer, localizedValueParam$$serializer, n};
    }

    @Override // defpackage.myi
    public final MapkitWeightData deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        LocalizedValueParam localizedValueParam = null;
        LocalizedValueParam localizedValueParam2 = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                localizedValueParam = (LocalizedValueParam) b.A(serialDescriptor, 0, LocalizedValueParam$$serializer.INSTANCE, localizedValueParam);
                i |= 1;
            } else if (v == 1) {
                localizedValueParam2 = (LocalizedValueParam) b.A(serialDescriptor, 1, LocalizedValueParam$$serializer.INSTANCE, localizedValueParam2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new MapkitWeightData(i, localizedValueParam, localizedValueParam2, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MapkitWeightData value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        LocalizedValueParam$$serializer localizedValueParam$$serializer = LocalizedValueParam$$serializer.INSTANCE;
        b.e(serialDescriptor, 0, localizedValueParam$$serializer, value.a);
        b.e(serialDescriptor, 1, localizedValueParam$$serializer, value.b);
        b.g(serialDescriptor, 2, h6w.a, value.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
