package com.yandex.mapkit.maps.core.serialization;

import com.yandex.mapkit.maps.core.geometry.Point;
import defpackage.asq0;
import defpackage.e6m;
import defpackage.evu0;
import defpackage.h0c;
import defpackage.j73;
import defpackage.ny61;
import defpackage.o2f0;
import defpackage.ovu0;
import defpackage.qv10;
import defpackage.sjd;
import defpackage.yjd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/mapkit/maps/core/serialization/PointObjectSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/mapkit/maps/core/geometry/Point;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/mapkit/maps/core/geometry/Point;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PointObjectSerializer implements KSerializer {
    public static final PointObjectSerializer INSTANCE = new PointObjectSerializer();
    private static final SerialDescriptor descriptor;

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (evu0.J("PointObjectSerializer")) {
            ny61.g("Blank serial names are prohibited");
            return;
        }
        h0c h0cVar = new h0c("PointObjectSerializer");
        descriptor$lambda$0(h0cVar);
        descriptor = new asq0("PointObjectSerializer", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    private PointObjectSerializer() {
    }

    private static final zy11 descriptor$lambda$0(h0c h0cVar) {
        e6m e6mVar = e6m.a;
        o2f0 o2f0Var = e6m.b;
        h0cVar.a("lat", o2f0Var, false);
        h0cVar.a("lon", o2f0Var, false);
        return zy11.a;
    }

    @Override // defpackage.myi
    public Point deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        Double d = null;
        Double d2 = null;
        while (true) {
            PointObjectSerializer pointObjectSerializer = INSTANCE;
            int v = b.v(pointObjectSerializer.getDescriptor());
            if (v == -1) {
                if (d == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                if (d2 == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                Point invoke = Point.INSTANCE.invoke(d.doubleValue(), d2.doubleValue());
                b.c(descriptor2);
                return invoke;
            }
            if (v == 0) {
                d = Double.valueOf(b.E(pointObjectSerializer.getDescriptor(), 0));
            } else {
                if (v != 1) {
                    ny61.r(qv10.g(v, "Unexpected index: "));
                    return null;
                }
                d2 = Double.valueOf(b.E(pointObjectSerializer.getDescriptor(), 1));
            }
        }
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Point value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        PointObjectSerializer pointObjectSerializer = INSTANCE;
        b.E(pointObjectSerializer.getDescriptor(), 0, value.getLat());
        b.E(pointObjectSerializer.getDescriptor(), 1, value.getLon());
        b.c(descriptor2);
    }
}
