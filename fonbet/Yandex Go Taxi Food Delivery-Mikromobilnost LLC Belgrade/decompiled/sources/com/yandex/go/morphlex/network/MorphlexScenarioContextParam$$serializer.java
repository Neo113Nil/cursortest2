package com.yandex.go.morphlex.network;

import com.yandex.go.morphlex.network.MorphlexScenarioContextParam;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/morphlex/network/MorphlexScenarioContextParam.$serializer", "Luxs;", "Lcom/yandex/go/morphlex/network/MorphlexScenarioContextParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/morphlex/network/MorphlexScenarioContextParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/morphlex/network/MorphlexScenarioContextParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MorphlexScenarioContextParam$$serializer implements uxs {
    public static final MorphlexScenarioContextParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MorphlexScenarioContextParam$$serializer morphlexScenarioContextParam$$serializer = new MorphlexScenarioContextParam$$serializer();
        INSTANCE = morphlexScenarioContextParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.morphlex.network.MorphlexScenarioContextParam", morphlexScenarioContextParam$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("point_a", false);
        pluginGeneratedSerialDescriptor.j("point_b", false);
        pluginGeneratedSerialDescriptor.j("geo_position", false);
        pluginGeneratedSerialDescriptor.j("voice_over_enabled", false);
        pluginGeneratedSerialDescriptor.j("appearance_mode", false);
        pluginGeneratedSerialDescriptor.j("scenario_name", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MorphlexScenarioContextParam$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        MorphlexScenarioContextParam$Point$$serializer morphlexScenarioContextParam$Point$$serializer = MorphlexScenarioContextParam$Point$$serializer.INSTANCE;
        KSerializer n = qke.n(morphlexScenarioContextParam$Point$$serializer);
        KSerializer n2 = qke.n(morphlexScenarioContextParam$Point$$serializer);
        KSerializer n3 = qke.n(morphlexScenarioContextParam$Point$$serializer);
        KSerializer n4 = qke.n(z96.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, n4, qke.n(auu0Var), auu0Var};
    }

    @Override // defpackage.myi
    public final MorphlexScenarioContextParam deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        MorphlexScenarioContextParam.Point point = null;
        MorphlexScenarioContextParam.Point point2 = null;
        MorphlexScenarioContextParam.Point point3 = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    point = (MorphlexScenarioContextParam.Point) b.s(serialDescriptor, 0, MorphlexScenarioContextParam$Point$$serializer.INSTANCE, point);
                    i |= 1;
                    break;
                case 1:
                    point2 = (MorphlexScenarioContextParam.Point) b.s(serialDescriptor, 1, MorphlexScenarioContextParam$Point$$serializer.INSTANCE, point2);
                    i |= 2;
                    break;
                case 2:
                    point3 = (MorphlexScenarioContextParam.Point) b.s(serialDescriptor, 2, MorphlexScenarioContextParam$Point$$serializer.INSTANCE, point3);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MorphlexScenarioContextParam(i, point, point2, point3, bool, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MorphlexScenarioContextParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        MorphlexScenarioContextParam$Point$$serializer morphlexScenarioContextParam$Point$$serializer = MorphlexScenarioContextParam$Point$$serializer.INSTANCE;
        b.g(serialDescriptor, 0, morphlexScenarioContextParam$Point$$serializer, value.a);
        b.g(serialDescriptor, 1, morphlexScenarioContextParam$Point$$serializer, value.b);
        b.g(serialDescriptor, 2, morphlexScenarioContextParam$Point$$serializer, value.c);
        b.g(serialDescriptor, 3, z96.a, value.d);
        b.g(serialDescriptor, 4, auu0.a, value.e);
        b.o(serialDescriptor, 5, value.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
