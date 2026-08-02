package com.yandex.mapkit.maps.core.serialization;

import com.yandex.mapkit.maps.core.geometry.Point;
import defpackage.d6z;
import defpackage.f5m;
import defpackage.h2f0;
import defpackage.yci0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/mapkit/maps/core/serialization/PointDoubleArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/mapkit/maps/core/geometry/Point;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/mapkit/maps/core/geometry/Point;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "doubleArraySerializer", "Lkotlinx/serialization/KSerializer;", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PointDoubleArraySerializer implements KSerializer {
    public static final PointDoubleArraySerializer INSTANCE = new PointDoubleArraySerializer();
    private static final SerialDescriptor descriptor = d6z.a("PointDoubleListSerializer", h2f0.o);
    private static final KSerializer doubleArraySerializer = f5m.c;

    private PointDoubleArraySerializer() {
    }

    @Override // defpackage.myi
    public Point deserialize(Decoder decoder) {
        double[] dArr = (double[]) doubleArraySerializer.deserialize(decoder);
        if (dArr.length != 2) {
            yci0.m("Point must contain exactly 2 Double values");
            return null;
        }
        double d = dArr[0];
        return Point.INSTANCE.invoke(dArr[1], d);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Point value) {
        doubleArraySerializer.serialize(encoder, new double[]{value.getLon(), value.getLat()});
    }
}
