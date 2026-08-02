package com.yandex.go.places.models.data.entities.network;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.auu0;
import defpackage.f5m;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/models/data/entities/network/DeliveryOrderFormRoutePointDto.$serializer", "Luxs;", "Lcom/yandex/go/places/models/data/entities/network/DeliveryOrderFormRoutePointDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/models/data/entities/network/DeliveryOrderFormRoutePointDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/models/data/entities/network/DeliveryOrderFormRoutePointDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class DeliveryOrderFormRoutePointDto$$serializer implements uxs {
    public static final DeliveryOrderFormRoutePointDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryOrderFormRoutePointDto$$serializer deliveryOrderFormRoutePointDto$$serializer = new DeliveryOrderFormRoutePointDto$$serializer();
        INSTANCE = deliveryOrderFormRoutePointDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.models.data.entities.network.DeliveryOrderFormRoutePointDto", deliveryOrderFormRoutePointDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("coordinates", true);
        pluginGeneratedSerialDescriptor.j("point_index", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeliveryOrderFormRoutePointDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DeliveryOrderFormRoutePointDto.e[0].getValue(), qke.n(auu0.a), f5m.c, qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final DeliveryOrderFormRoutePointDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryOrderFormRoutePointDto.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        DeliveryPointTypeDto deliveryPointTypeDto = null;
        Integer num = null;
        String str = null;
        double[] dArr = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                deliveryPointTypeDto = (DeliveryPointTypeDto) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), deliveryPointTypeDto);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                dArr = (double[]) b.A(serialDescriptor, 2, f5m.c, dArr);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new DeliveryOrderFormRoutePointDto(i, deliveryPointTypeDto, num, str, dArr);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DeliveryOrderFormRoutePointDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryOrderFormRoutePointDto.e;
        if (b.F() || value.a != DeliveryPointTypeDto.DESTINATION) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, new double[]{0.0d, 0.0d})) {
            b.e(serialDescriptor, 2, f5m.c, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, h6w.a, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
