package com.yandex.go.places.experiments.map;

import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import defpackage.auu0;
import defpackage.e6m;
import defpackage.h6w;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/experiments/map/PlacesMapScreenExperiment.CardOption.$serializer", "Luxs;", "Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CardOption;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CardOption;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CardOption;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PlacesMapScreenExperiment$CardOption$$serializer implements uxs {
    public static final PlacesMapScreenExperiment$CardOption$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlacesMapScreenExperiment$CardOption$$serializer placesMapScreenExperiment$CardOption$$serializer = new PlacesMapScreenExperiment$CardOption$$serializer();
        INSTANCE = placesMapScreenExperiment$CardOption$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.experiments.map.PlacesMapScreenExperiment.CardOption", placesMapScreenExperiment$CardOption$$serializer, 12);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("map_style", true);
        pluginGeneratedSerialDescriptor.j("default_map_zoom", true);
        pluginGeneratedSerialDescriptor.j("min_height", true);
        pluginGeneratedSerialDescriptor.j("default_height_ratio", true);
        pluginGeneratedSerialDescriptor.j("max_height_ratio", true);
        pluginGeneratedSerialDescriptor.j("initial_revealing_state", true);
        pluginGeneratedSerialDescriptor.j("common_map_style_name", true);
        pluginGeneratedSerialDescriptor.j("category_filters", true);
        pluginGeneratedSerialDescriptor.j("nearby_distance", true);
        pluginGeneratedSerialDescriptor.j("pin_tags", true);
        pluginGeneratedSerialDescriptor.j("slider_map_updates_config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlacesMapScreenExperiment$CardOption$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PlacesMapScreenExperiment.CardOption.m;
        auu0 auu0Var = auu0.a;
        e6m e6mVar = e6m.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), auu0Var, e6mVar, qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n(h6w.a), qke.n(PlacesMapScreenExperiment$PinTags$$serializer.INSTANCE), qke.n(PlacesMapScreenExperiment$SliderMapUpdatesConfig$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final PlacesMapScreenExperiment.CardOption deserialize(Decoder decoder) {
        double d;
        String str;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlacesMapScreenExperiment.CardOption.m;
        b.getClass();
        double d2 = 0.0d;
        PlacesMapScreenExperiment.PinTags pinTags = null;
        Integer num = null;
        List list = null;
        String str2 = null;
        PlacesMapScreenExperiment.SliderMapUpdatesConfig sliderMapUpdatesConfig = null;
        Double d3 = null;
        PlacesMapScreenExperiment.RevealingState revealingState = null;
        int i = 0;
        PlacesMapScreenExperiment.Screen screen = null;
        String str3 = null;
        Double d4 = null;
        Double d5 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    d = d2;
                    z = false;
                    d2 = d;
                case 0:
                    str = str3;
                    d = d2;
                    screen = (PlacesMapScreenExperiment.Screen) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), screen);
                    i |= 1;
                    str3 = str;
                    d2 = d;
                case 1:
                    d = d2;
                    i |= 2;
                    str3 = b.k(serialDescriptor, 1);
                    d2 = d;
                case 2:
                    d2 = b.E(serialDescriptor, 2);
                    i |= 4;
                    str3 = str3;
                case 3:
                    str = str3;
                    d = d2;
                    d4 = (Double) b.s(serialDescriptor, 3, e6m.a, d4);
                    i |= 8;
                    str3 = str;
                    d2 = d;
                case 4:
                    str = str3;
                    d = d2;
                    d5 = (Double) b.s(serialDescriptor, 4, e6m.a, d5);
                    i |= 16;
                    str3 = str;
                    d2 = d;
                case 5:
                    str = str3;
                    d = d2;
                    d3 = (Double) b.s(serialDescriptor, 5, e6m.a, d3);
                    i |= 32;
                    str3 = str;
                    d2 = d;
                case 6:
                    str = str3;
                    d = d2;
                    revealingState = (PlacesMapScreenExperiment.RevealingState) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), revealingState);
                    i |= 64;
                    str3 = str;
                    d2 = d;
                case 7:
                    str = str3;
                    d = d2;
                    str2 = (String) b.s(serialDescriptor, 7, auu0.a, str2);
                    i |= 128;
                    str3 = str;
                    d2 = d;
                case 8:
                    str = str3;
                    d = d2;
                    list = (List) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    str3 = str;
                    d2 = d;
                case 9:
                    str = str3;
                    d = d2;
                    num = (Integer) b.s(serialDescriptor, 9, h6w.a, num);
                    i |= 512;
                    str3 = str;
                    d2 = d;
                case 10:
                    str = str3;
                    d = d2;
                    pinTags = (PlacesMapScreenExperiment.PinTags) b.s(serialDescriptor, 10, PlacesMapScreenExperiment$PinTags$$serializer.INSTANCE, pinTags);
                    i |= 1024;
                    str3 = str;
                    d2 = d;
                case 11:
                    str = str3;
                    d = d2;
                    sliderMapUpdatesConfig = (PlacesMapScreenExperiment.SliderMapUpdatesConfig) b.s(serialDescriptor, 11, PlacesMapScreenExperiment$SliderMapUpdatesConfig$$serializer.INSTANCE, sliderMapUpdatesConfig);
                    i |= 2048;
                    str3 = str;
                    d2 = d;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlacesMapScreenExperiment.CardOption(i, screen, str3, d2, d4, d5, d3, revealingState, str2, list, num, pinTags, sliderMapUpdatesConfig);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlacesMapScreenExperiment.CardOption value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlacesMapScreenExperiment.CardOption.m;
        if (b.F() || value.a != PlacesMapScreenExperiment.Screen.NONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, "none")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || Double.compare(value.c, 12.0d) != 0) {
            b.E(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, e6m.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, e6m.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, e6m.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, h6w.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, PlacesMapScreenExperiment$PinTags$$serializer.INSTANCE, value.k);
        }
        if (b.F() || value.l != null) {
            b.g(serialDescriptor, 11, PlacesMapScreenExperiment$SliderMapUpdatesConfig$$serializer.INSTANCE, value.l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
