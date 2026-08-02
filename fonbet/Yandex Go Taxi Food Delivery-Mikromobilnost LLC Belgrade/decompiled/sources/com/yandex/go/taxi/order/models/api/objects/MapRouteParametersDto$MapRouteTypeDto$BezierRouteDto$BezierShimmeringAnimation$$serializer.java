package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto.MapRouteTypeDto.BezierRouteDto.BezierShimmeringAnimation.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer implements uxs {
    public static final MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer = new MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer();
        INSTANCE = mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto.MapRouteTypeDto.BezierRouteDto.BezierShimmeringAnimation", mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("delay", true);
        pluginGeneratedSerialDescriptor.j("length", true);
        pluginGeneratedSerialDescriptor.j("duration", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("gradient_length", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        nor norVar = nor.a;
        return new KSerializer[]{MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation.h[0].getValue(), auu0.a, norVar, h6w.a, norVar, qke.n(MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$ShimmeringShowPolicy$$serializer.INSTANCE), norVar};
    }

    @Override // defpackage.myi
    public final MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation.h;
        b.getClass();
        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation bezierShimmeringAnimation = null;
        int i = 0;
        int i2 = 0;
        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType bezierAnimationType = null;
        String str = null;
        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation.ShimmeringShowPolicy shimmeringShowPolicy = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    bezierAnimationType = (MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), bezierAnimationType);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    f = b.y(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    f2 = b.y(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    shimmeringShowPolicy = (MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation.ShimmeringShowPolicy) b.s(serialDescriptor, 5, MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$ShimmeringShowPolicy$$serializer.INSTANCE, shimmeringShowPolicy);
                    i |= 32;
                    break;
                case 6:
                    f3 = b.y(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return bezierShimmeringAnimation;
            }
            bezierShimmeringAnimation = null;
        }
        b.c(serialDescriptor);
        return new MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation(i, bezierAnimationType, str, f, i2, f2, shimmeringShowPolicy, f3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation.h;
        if (b.F() || value.a != MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || Float.compare(value.c, 0.0f) != 0) {
            b.z(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != 0) {
            b.A(3, value.d, serialDescriptor);
        }
        if (b.F() || Float.compare(value.e, 0.0f) != 0) {
            b.z(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$ShimmeringShowPolicy$$serializer.INSTANCE, value.f);
        }
        if (b.F() || Float.compare(value.g, 0.0f) != 0) {
            b.z(serialDescriptor, 6, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
