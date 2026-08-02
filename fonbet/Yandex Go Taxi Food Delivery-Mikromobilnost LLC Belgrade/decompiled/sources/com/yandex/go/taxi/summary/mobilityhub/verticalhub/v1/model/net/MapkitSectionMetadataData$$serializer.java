package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.i3y;
import defpackage.jxi;
import defpackage.mdx;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitSectionMetadataData.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitSectionMetadataData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitSectionMetadataData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitSectionMetadataData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class MapkitSectionMetadataData$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MapkitSectionMetadataData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MapkitSectionMetadataData$$serializer mapkitSectionMetadataData$$serializer = new MapkitSectionMetadataData$$serializer();
        INSTANCE = mapkitSectionMetadataData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitSectionMetadataData", mapkitSectionMetadataData$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("wait", false);
        pluginGeneratedSerialDescriptor.j("fitness", false);
        pluginGeneratedSerialDescriptor.j("transfer", false);
        pluginGeneratedSerialDescriptor.j(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, false);
        pluginGeneratedSerialDescriptor.j("transports", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapkitSectionMetadataData$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MapkitSectionMetadataData.f;
        mdx mdxVar = mdx.a;
        return new KSerializer[]{qke.n(mdxVar), qke.n(mdxVar), qke.n(mdxVar), qke.n(mdxVar), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final MapkitSectionMetadataData deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapkitSectionMetadataData.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        kotlinx.serialization.json.c cVar = null;
        kotlinx.serialization.json.c cVar2 = null;
        kotlinx.serialization.json.c cVar3 = null;
        kotlinx.serialization.json.c cVar4 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (kotlinx.serialization.json.c) b.s(serialDescriptor, 0, mdx.a, cVar);
                i |= 1;
            } else if (v == 1) {
                cVar2 = (kotlinx.serialization.json.c) b.s(serialDescriptor, 1, mdx.a, cVar2);
                i |= 2;
            } else if (v == 2) {
                cVar3 = (kotlinx.serialization.json.c) b.s(serialDescriptor, 2, mdx.a, cVar3);
                i |= 4;
            } else if (v == 3) {
                cVar4 = (kotlinx.serialization.json.c) b.s(serialDescriptor, 3, mdx.a, cVar4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new MapkitSectionMetadataData(i, cVar, cVar2, cVar3, cVar4, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MapkitSectionMetadataData value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapkitSectionMetadataData.f;
        mdx mdxVar = mdx.a;
        b.g(serialDescriptor, 0, mdxVar, value.a);
        b.g(serialDescriptor, 1, mdxVar, value.b);
        b.g(serialDescriptor, 2, mdxVar, value.c);
        b.g(serialDescriptor, 3, mdxVar, value.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
