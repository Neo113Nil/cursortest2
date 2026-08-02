package com.yandex.go.tappable_poi.experiments;

import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.nor;
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
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment.CardOption.$serializer", "Luxs;", "Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment$CardOption;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment$CardOption;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment$CardOption;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TappablePoiCardExperiment$CardOption$$serializer implements uxs {
    public static final TappablePoiCardExperiment$CardOption$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TappablePoiCardExperiment$CardOption$$serializer tappablePoiCardExperiment$CardOption$$serializer = new TappablePoiCardExperiment$CardOption$$serializer();
        INSTANCE = tappablePoiCardExperiment$CardOption$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment.CardOption", tappablePoiCardExperiment$CardOption$$serializer, 11);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("drive_states", true);
        pluginGeneratedSerialDescriptor.j("is_fullscreen", true);
        pluginGeneratedSerialDescriptor.j("without_gallery_on_anchored", true);
        pluginGeneratedSerialDescriptor.j("max_anchored_height", true);
        pluginGeneratedSerialDescriptor.j("max_anchored_height_ratio", true);
        pluginGeneratedSerialDescriptor.j("with_external_map", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("map_style", true);
        pluginGeneratedSerialDescriptor.j("common_map_style_name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TappablePoiCardExperiment$CardOption$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TappablePoiCardExperiment.CardOption.l;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), z96Var, z96Var, h6w.a, qke.n(nor.a), z96Var, auu0Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final TappablePoiCardExperiment.CardOption deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TappablePoiCardExperiment.CardOption.l;
        b.getClass();
        TappablePoiCardExperiment.CardOption cardOption = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        String str = null;
        jsq0 jsq0Var = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                    i |= 2;
                    break;
                case 2:
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z3 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    f = (Float) b.s(serialDescriptor, 5, nor.a, f);
                    i |= 32;
                    break;
                case 6:
                    z4 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    str2 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    str3 = b.k(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    str4 = b.k(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    str5 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    ny61.c(v);
                    return cardOption;
            }
            cardOption = null;
        }
        b.c(serialDescriptor);
        return new TappablePoiCardExperiment.CardOption(i, str, jsq0Var, z2, z3, i2, f, z4, str2, str3, str4, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TappablePoiCardExperiment.CardOption value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TappablePoiCardExperiment.CardOption.l;
        if (b.F() || !jl40.l(value.a, "none")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, ksq0.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != 0) {
            b.A(4, value.e, serialDescriptor);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, nor.a, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || !jl40.l(value.h, TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
            b.o(serialDescriptor, 7, value.h);
        }
        if (b.F() || !jl40.l(value.i, TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
            b.o(serialDescriptor, 8, value.i);
        }
        if (b.F() || !jl40.l(value.j, "")) {
            b.o(serialDescriptor, 9, value.j);
        }
        if (b.F() || !jl40.l(value.k, "")) {
            b.o(serialDescriptor, 10, value.k);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
