package com.yandex.go.taxi.order.models.api.route;

import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$ShimmeringAnimation;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/route/MapRouteAppearance.ShimmeringAnimation.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/route/MapRouteAppearance$ShimmeringAnimation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/route/MapRouteAppearance$ShimmeringAnimation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/route/MapRouteAppearance$ShimmeringAnimation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class MapRouteAppearance$ShimmeringAnimation$$serializer implements uxs {
    public static final MapRouteAppearance$ShimmeringAnimation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MapRouteAppearance$ShimmeringAnimation$$serializer mapRouteAppearance$ShimmeringAnimation$$serializer = new MapRouteAppearance$ShimmeringAnimation$$serializer();
        INSTANCE = mapRouteAppearance$ShimmeringAnimation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.route.MapRouteAppearance.ShimmeringAnimation", mapRouteAppearance$ShimmeringAnimation$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("delay", true);
        pluginGeneratedSerialDescriptor.j("duration", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("gradient_length", true);
        pluginGeneratedSerialDescriptor.j("length", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapRouteAppearance$ShimmeringAnimation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MapRouteAppearance$ShimmeringAnimation.h;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{pnzVar, pnzVar, i3yVarArr[2].getValue(), auu0.a, nor.a, h6w.a, qke.n(MapRouteAppearance$ShimmeringAnimation$ShowPolicy$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final MapRouteAppearance$ShimmeringAnimation deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteAppearance$ShimmeringAnimation.h;
        b.getClass();
        int i = 0;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        MapRouteAppearance$ShimmeringAnimation.ShowPolicy showPolicy = null;
        MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType = null;
        String str = null;
        float f = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    j = b.f(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j2 = b.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    mapRouteAppearance$AnimationType = (MapRouteAppearance$AnimationType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), mapRouteAppearance$AnimationType);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    f = b.y(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    showPolicy = (MapRouteAppearance$ShimmeringAnimation.ShowPolicy) b.s(serialDescriptor, 6, MapRouteAppearance$ShimmeringAnimation$ShowPolicy$$serializer.INSTANCE, showPolicy);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MapRouteAppearance$ShimmeringAnimation(i, j, j2, mapRouteAppearance$AnimationType, str, f, i2, showPolicy);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MapRouteAppearance$ShimmeringAnimation value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MapRouteAppearance$ShimmeringAnimation.h;
        if (b.F() || value.a != 0) {
            b.s(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != 0) {
            b.s(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != MapRouteAppearance$AnimationType.UNKNOWN) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || Float.compare(value.e, 0.0f) != 0) {
            b.z(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != 0) {
            b.A(5, value.f, serialDescriptor);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, MapRouteAppearance$ShimmeringAnimation$ShowPolicy$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
