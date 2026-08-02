package com.yandex.go.places.experiments.map.pin_war_v2;

import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.ImageDto$$serializer;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xvz;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment.Clustering.$serializer", "Luxs;", "Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$Clustering;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$Clustering;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$Clustering;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PlacesPinWarV2Experiment$Clustering$$serializer implements uxs {
    public static final PlacesPinWarV2Experiment$Clustering$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlacesPinWarV2Experiment$Clustering$$serializer placesPinWarV2Experiment$Clustering$$serializer = new PlacesPinWarV2Experiment$Clustering$$serializer();
        INSTANCE = placesPinWarV2Experiment$Clustering$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment.Clustering", placesPinWarV2Experiment$Clustering$$serializer, 9);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("less_than_zoom", true);
        pluginGeneratedSerialDescriptor.j("radius_dp", true);
        pluginGeneratedSerialDescriptor.j("camera_redraw_mode", true);
        pluginGeneratedSerialDescriptor.j("zoom_step", true);
        pluginGeneratedSerialDescriptor.j("animation", true);
        pluginGeneratedSerialDescriptor.j("super_pin_priority_threshold", true);
        pluginGeneratedSerialDescriptor.j("pin_style_config", true);
        pluginGeneratedSerialDescriptor.j("stub_image", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlacesPinWarV2Experiment$Clustering$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PlacesPinWarV2Experiment.Clustering.j;
        KSerializer n = qke.n(h6w.a);
        nor norVar = nor.a;
        return new KSerializer[]{z96.a, n, qke.n(norVar), qke.n(PlacesPinWarV2Experiment$CameraRedrawMode$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(PlacesPinWarV2Experiment$Animation$$serializer.INSTANCE), qke.n(norVar), qke.n(PlacesPinWarV2Experiment$PinStyleVariantConfig$$serializer.INSTANCE), qke.n(ImageDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final PlacesPinWarV2Experiment.Clustering deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlacesPinWarV2Experiment.Clustering.j;
        b.getClass();
        ImageDto imageDto = null;
        boolean z = true;
        PlacesPinWarV2Experiment.PinStyleVariantConfig pinStyleVariantConfig = null;
        int i = 0;
        boolean z2 = false;
        Integer num = null;
        Float f = null;
        PlacesPinWarV2Experiment.CameraRedrawMode cameraRedrawMode = null;
        PlacesPinWarV2Experiment.ZoomStep zoomStep = null;
        PlacesPinWarV2Experiment.Animation animation = null;
        Float f2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) b.s(serialDescriptor, 2, nor.a, f);
                    i |= 4;
                    break;
                case 3:
                    cameraRedrawMode = (PlacesPinWarV2Experiment.CameraRedrawMode) b.s(serialDescriptor, 3, PlacesPinWarV2Experiment$CameraRedrawMode$$serializer.INSTANCE, cameraRedrawMode);
                    i |= 8;
                    break;
                case 4:
                    zoomStep = (PlacesPinWarV2Experiment.ZoomStep) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), zoomStep);
                    i |= 16;
                    break;
                case 5:
                    animation = (PlacesPinWarV2Experiment.Animation) b.s(serialDescriptor, 5, PlacesPinWarV2Experiment$Animation$$serializer.INSTANCE, animation);
                    i |= 32;
                    break;
                case 6:
                    f2 = (Float) b.s(serialDescriptor, 6, nor.a, f2);
                    i |= 64;
                    break;
                case 7:
                    pinStyleVariantConfig = (PlacesPinWarV2Experiment.PinStyleVariantConfig) b.s(serialDescriptor, 7, PlacesPinWarV2Experiment$PinStyleVariantConfig$$serializer.INSTANCE, pinStyleVariantConfig);
                    i |= 128;
                    break;
                case 8:
                    imageDto = (ImageDto) b.s(serialDescriptor, 8, ImageDto$$serializer.INSTANCE, imageDto);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlacesPinWarV2Experiment.Clustering(i, z2, num, f, cameraRedrawMode, zoomStep, animation, f2, pinStyleVariantConfig, imageDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlacesPinWarV2Experiment.Clustering value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlacesPinWarV2Experiment.Clustering.j;
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, h6w.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, nor.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, PlacesPinWarV2Experiment$CameraRedrawMode$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, PlacesPinWarV2Experiment$Animation$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, nor.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, PlacesPinWarV2Experiment$PinStyleVariantConfig$$serializer.INSTANCE, value.h);
        }
        if (b.F() || !xvz.C(0, value.i)) {
            b.g(serialDescriptor, 8, ImageDto$$serializer.INSTANCE, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
