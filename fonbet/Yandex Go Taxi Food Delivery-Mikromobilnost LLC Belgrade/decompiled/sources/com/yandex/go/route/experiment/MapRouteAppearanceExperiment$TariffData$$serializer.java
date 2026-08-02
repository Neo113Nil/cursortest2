package com.yandex.go.route.experiment;

import com.yandex.go.route.experiment.MapRouteAppearanceExperiment;
import com.yandex.go.taxi.order.models.api.route.e;
import com.yandex.go.taxi.order.models.api.route.g;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/route/experiment/MapRouteAppearanceExperiment.TariffData.$serializer", "Luxs;", "Lcom/yandex/go/route/experiment/MapRouteAppearanceExperiment$TariffData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/route/experiment/MapRouteAppearanceExperiment$TariffData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/route/experiment/MapRouteAppearanceExperiment$TariffData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class MapRouteAppearanceExperiment$TariffData$$serializer implements uxs {
    public static final MapRouteAppearanceExperiment$TariffData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MapRouteAppearanceExperiment$TariffData$$serializer mapRouteAppearanceExperiment$TariffData$$serializer = new MapRouteAppearanceExperiment$TariffData$$serializer();
        INSTANCE = mapRouteAppearanceExperiment$TariffData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.route.experiment.MapRouteAppearanceExperiment.TariffData", mapRouteAppearanceExperiment$TariffData$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("map_route", true);
        pluginGeneratedSerialDescriptor.j("tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("alternative_types", true);
        pluginGeneratedSerialDescriptor.j("managed_by_routestats", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapRouteAppearanceExperiment$TariffData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MapRouteAppearanceExperiment.TariffData.e;
        return new KSerializer[]{g.Companion.serializer(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final MapRouteAppearanceExperiment.TariffData deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteAppearanceExperiment.TariffData.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        g gVar = null;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                gVar = (g) b.A(serialDescriptor, 0, g.Companion.serializer(), gVar);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                list2 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new MapRouteAppearanceExperiment.TariffData(i, gVar, list, list2, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MapRouteAppearanceExperiment.TariffData value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteAppearanceExperiment.TariffData.e;
        if (b.F() || !jl40.l(value.a, e.INSTANCE)) {
            b.e(serialDescriptor, 0, g.Companion.serializer(), value.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
