package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.ImageDto$$serializer;
import defpackage.auu0;
import defpackage.dor;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto.PinWarDefaultSelectedPinStyleDto.$serializer", "Luxs;", "Lcom/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer implements uxs {
    public static final MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer = new MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer();
        INSTANCE = mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto.PinWarDefaultSelectedPinStyleDto", mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("anchor", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(dor.c), ImageDto$$serializer.INSTANCE, qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        float[] fArr = null;
        ImageDto imageDto = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                fArr = (float[]) b.s(serialDescriptor, 0, dor.c, fArr);
                i |= 1;
            } else if (v == 1) {
                imageDto = (ImageDto) b.A(serialDescriptor, 1, ImageDto$$serializer.INSTANCE, imageDto);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto(i, fArr, imageDto, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, dor.c, value.a);
        }
        if (b.F() || !xvz.C(0, value.b)) {
            b.e(serialDescriptor, 1, ImageDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
