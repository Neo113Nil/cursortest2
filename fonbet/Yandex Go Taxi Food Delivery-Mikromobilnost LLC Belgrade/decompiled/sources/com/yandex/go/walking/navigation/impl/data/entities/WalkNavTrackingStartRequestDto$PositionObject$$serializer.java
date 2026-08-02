package com.yandex.go.walking.navigation.impl.data.entities;

import com.yandex.go.walking.navigation.impl.data.entities.WalkNavTrackingStartRequestDto;
import defpackage.e6m;
import defpackage.jxi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStartRequestDto.PositionObject.$serializer", "Luxs;", "Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStartRequestDto$PositionObject;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStartRequestDto$PositionObject;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStartRequestDto$PositionObject;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class WalkNavTrackingStartRequestDto$PositionObject$$serializer implements uxs {
    public static final int $stable = 0;
    public static final WalkNavTrackingStartRequestDto$PositionObject$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WalkNavTrackingStartRequestDto$PositionObject$$serializer walkNavTrackingStartRequestDto$PositionObject$$serializer = new WalkNavTrackingStartRequestDto$PositionObject$$serializer();
        INSTANCE = walkNavTrackingStartRequestDto$PositionObject$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.walking.navigation.impl.data.entities.WalkNavTrackingStartRequestDto.PositionObject", walkNavTrackingStartRequestDto$PositionObject$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("lat", false);
        pluginGeneratedSerialDescriptor.j("lon", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WalkNavTrackingStartRequestDto$PositionObject$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar};
    }

    @Override // defpackage.myi
    public final WalkNavTrackingStartRequestDto.PositionObject deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                d2 = b.E(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new WalkNavTrackingStartRequestDto.PositionObject(d, d2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WalkNavTrackingStartRequestDto.PositionObject value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.E(serialDescriptor, 0, value.a);
        b.E(serialDescriptor, 1, value.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
