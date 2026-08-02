package com.yandex.go.places.experiments.map;

import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.ImageDto$$serializer;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/experiments/map/PlacesMapScreenExperiment.CategoryFilter.$serializer", "Luxs;", "Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CategoryFilter;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CategoryFilter;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CategoryFilter;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PlacesMapScreenExperiment$CategoryFilter$$serializer implements uxs {
    public static final PlacesMapScreenExperiment$CategoryFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlacesMapScreenExperiment$CategoryFilter$$serializer placesMapScreenExperiment$CategoryFilter$$serializer = new PlacesMapScreenExperiment$CategoryFilter$$serializer();
        INSTANCE = placesMapScreenExperiment$CategoryFilter$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.experiments.map.PlacesMapScreenExperiment.CategoryFilter", placesMapScreenExperiment$CategoryFilter$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("content_description", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("analytics_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlacesMapScreenExperiment$CategoryFilter$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PlacesMapScreenExperiment.CategoryFilter.g;
        KSerializer n = qke.n(ImageDto$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n(auu0Var), PlacesMapScreenExperiment$CategoryFilterAction$$serializer.INSTANCE, qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final PlacesMapScreenExperiment.CategoryFilter deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlacesMapScreenExperiment.CategoryFilter.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        ImageDto imageDto = null;
        String str = null;
        String str2 = null;
        PlacesMapScreenExperiment.CategoryFilterAction categoryFilterAction = null;
        CategoryFilterType categoryFilterType = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    imageDto = (ImageDto) b.s(serialDescriptor, 0, ImageDto$$serializer.INSTANCE, imageDto);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    categoryFilterAction = (PlacesMapScreenExperiment.CategoryFilterAction) b.A(serialDescriptor, 3, PlacesMapScreenExperiment$CategoryFilterAction$$serializer.INSTANCE, categoryFilterAction);
                    i |= 8;
                    break;
                case 4:
                    categoryFilterType = (CategoryFilterType) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), categoryFilterType);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlacesMapScreenExperiment.CategoryFilter(i, imageDto, str, str2, categoryFilterAction, categoryFilterType, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlacesMapScreenExperiment.CategoryFilter value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlacesMapScreenExperiment.CategoryFilter.g;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, ImageDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, new PlacesMapScreenExperiment.CategoryFilterAction(0))) {
            b.e(serialDescriptor, 3, PlacesMapScreenExperiment$CategoryFilterAction$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != CategoryFilterType.UNKNOWN) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
