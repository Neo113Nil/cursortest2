package com.yandex.go.scooters.zones.data.model;

import com.yandex.go.scooters.zones.data.model.ScootersPolygonLegend;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.nor;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/zones/data/model/ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle.$serializer", "Luxs;", "Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer implements uxs {
    public static final ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer scootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer = new ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer();
        INSTANCE = scootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.zones.data.model.ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle", scootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("stroke_color", true);
        pluginGeneratedSerialDescriptor.j("stroke_opacity", true);
        pluginGeneratedSerialDescriptor.j("stroke_width", true);
        pluginGeneratedSerialDescriptor.j("fill_params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n(nor.a), ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$FillParams$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        Float f = null;
        ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle.FillParams fillParams = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else if (v == 3) {
                f = (Float) b.s(serialDescriptor, 3, nor.a, f);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                fillParams = (ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle.FillParams) b.A(serialDescriptor, 4, ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$FillParams$$serializer.INSTANCE, fillParams);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle(i, str, str2, num, f, fillParams);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, h6w.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, nor.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, new ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle.FillParams(0))) {
            b.e(serialDescriptor, 4, ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$FillParams$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
