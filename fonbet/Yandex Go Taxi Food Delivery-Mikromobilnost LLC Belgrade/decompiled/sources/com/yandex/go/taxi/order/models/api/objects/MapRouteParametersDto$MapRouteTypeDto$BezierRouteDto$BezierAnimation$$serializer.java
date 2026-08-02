package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto.MapRouteTypeDto.BezierRouteDto.BezierAnimation.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer implements uxs {
    public static final MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer = new MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer();
        INSTANCE = mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto.MapRouteTypeDto.BezierRouteDto.BezierAnimation", mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("duration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation.c[0].getValue(), nor.a};
    }

    @Override // defpackage.myi
    public final MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation.c;
        b.getClass();
        float f = 0.0f;
        boolean z = true;
        int i = 0;
        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType bezierAnimationType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bezierAnimationType = (MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), bezierAnimationType);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                f = b.y(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation(i, bezierAnimationType, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation.c;
        if (b.F() || value.a != MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || Float.compare(value.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
