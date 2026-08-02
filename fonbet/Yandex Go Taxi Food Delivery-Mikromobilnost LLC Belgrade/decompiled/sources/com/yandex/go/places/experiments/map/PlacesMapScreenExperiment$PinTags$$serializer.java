package com.yandex.go.places.experiments.map;

import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.ImageDto$$serializer;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xvz;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/experiments/map/PlacesMapScreenExperiment.PinTags.$serializer", "Luxs;", "Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$PinTags;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$PinTags;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$PinTags;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PlacesMapScreenExperiment$PinTags$$serializer implements uxs {
    public static final PlacesMapScreenExperiment$PinTags$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlacesMapScreenExperiment$PinTags$$serializer placesMapScreenExperiment$PinTags$$serializer = new PlacesMapScreenExperiment$PinTags$$serializer();
        INSTANCE = placesMapScreenExperiment$PinTags$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.experiments.map.PlacesMapScreenExperiment.PinTags", placesMapScreenExperiment$PinTags$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("home", true);
        pluginGeneratedSerialDescriptor.j("work", true);
        pluginGeneratedSerialDescriptor.j("favorite", true);
        pluginGeneratedSerialDescriptor.j("favorite_badge_18", true);
        pluginGeneratedSerialDescriptor.j("favorite_badge_24", true);
        pluginGeneratedSerialDescriptor.j("media_overlay", true);
        pluginGeneratedSerialDescriptor.j("home_selected", true);
        pluginGeneratedSerialDescriptor.j("work_selected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlacesMapScreenExperiment$PinTags$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        ImageDto$$serializer imageDto$$serializer = ImageDto$$serializer.INSTANCE;
        return new KSerializer[]{qke.n(imageDto$$serializer), qke.n(imageDto$$serializer), qke.n(imageDto$$serializer), qke.n(imageDto$$serializer), qke.n(imageDto$$serializer), qke.n(imageDto$$serializer), qke.n(imageDto$$serializer), qke.n(imageDto$$serializer)};
    }

    @Override // defpackage.myi
    public final PlacesMapScreenExperiment.PinTags deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        PlacesMapScreenExperiment.PinTags pinTags = null;
        boolean z = true;
        int i = 0;
        ImageDto imageDto = null;
        ImageDto imageDto2 = null;
        ImageDto imageDto3 = null;
        ImageDto imageDto4 = null;
        ImageDto imageDto5 = null;
        ImageDto imageDto6 = null;
        ImageDto imageDto7 = null;
        ImageDto imageDto8 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    imageDto = (ImageDto) b.s(serialDescriptor, 0, ImageDto$$serializer.INSTANCE, imageDto);
                    i |= 1;
                    break;
                case 1:
                    imageDto2 = (ImageDto) b.s(serialDescriptor, 1, ImageDto$$serializer.INSTANCE, imageDto2);
                    i |= 2;
                    break;
                case 2:
                    imageDto3 = (ImageDto) b.s(serialDescriptor, 2, ImageDto$$serializer.INSTANCE, imageDto3);
                    i |= 4;
                    break;
                case 3:
                    imageDto4 = (ImageDto) b.s(serialDescriptor, 3, ImageDto$$serializer.INSTANCE, imageDto4);
                    i |= 8;
                    break;
                case 4:
                    imageDto5 = (ImageDto) b.s(serialDescriptor, 4, ImageDto$$serializer.INSTANCE, imageDto5);
                    i |= 16;
                    break;
                case 5:
                    imageDto6 = (ImageDto) b.s(serialDescriptor, 5, ImageDto$$serializer.INSTANCE, imageDto6);
                    i |= 32;
                    break;
                case 6:
                    imageDto7 = (ImageDto) b.s(serialDescriptor, 6, ImageDto$$serializer.INSTANCE, imageDto7);
                    i |= 64;
                    break;
                case 7:
                    imageDto8 = (ImageDto) b.s(serialDescriptor, 7, ImageDto$$serializer.INSTANCE, imageDto8);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return pinTags;
            }
            pinTags = null;
        }
        b.c(serialDescriptor);
        return new PlacesMapScreenExperiment.PinTags(i, imageDto, imageDto2, imageDto3, imageDto4, imageDto5, imageDto6, imageDto7, imageDto8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlacesMapScreenExperiment.PinTags value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !xvz.C(0, value.a)) {
            b.g(serialDescriptor, 0, ImageDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !xvz.C(0, value.b)) {
            b.g(serialDescriptor, 1, ImageDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !xvz.C(0, value.c)) {
            b.g(serialDescriptor, 2, ImageDto$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !xvz.C(0, value.d)) {
            b.g(serialDescriptor, 3, ImageDto$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !xvz.C(0, value.e)) {
            b.g(serialDescriptor, 4, ImageDto$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !xvz.C(0, value.f)) {
            b.g(serialDescriptor, 5, ImageDto$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !xvz.C(0, value.g)) {
            b.g(serialDescriptor, 6, ImageDto$$serializer.INSTANCE, value.g);
        }
        if (b.F() || !xvz.C(0, value.h)) {
            b.g(serialDescriptor, 7, ImageDto$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
