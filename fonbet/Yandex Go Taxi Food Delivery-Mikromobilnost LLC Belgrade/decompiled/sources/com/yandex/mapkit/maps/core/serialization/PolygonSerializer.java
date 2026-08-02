package com.yandex.mapkit.maps.core.serialization;

import com.yandex.mapkit.maps.core.geometry.CommonPoint;
import com.yandex.mapkit.maps.core.geometry.CommonPolygon;
import com.yandex.mapkit.maps.core.geometry.Point;
import com.yandex.mapkit.maps.core.geometry.Polygon;
import defpackage.e6m;
import defpackage.p53;
import defpackage.s43;
import defpackage.scc;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/mapkit/maps/core/serialization/PolygonSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/mapkit/maps/core/geometry/Polygon;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/mapkit/maps/core/geometry/Polygon;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/mapkit/maps/core/geometry/Polygon;", "", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PolygonSerializer implements KSerializer {
    public static final PolygonSerializer INSTANCE = new PolygonSerializer();
    private static final SerialDescriptor descriptor;
    private static final KSerializer serializer;

    static {
        p53 p53Var = new p53(new p53(e6m.a, 0), 0);
        serializer = p53Var;
        descriptor = (s43) p53Var.c;
    }

    private PolygonSerializer() {
    }

    @Override // defpackage.myi
    public Polygon deserialize(Decoder decoder) {
        List<List> list = (List) decoder.B(serializer);
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (List list2 : list) {
            arrayList.add(new CommonPoint(((Number) list2.get(1)).doubleValue(), ((Number) list2.get(0)).doubleValue()));
        }
        return new CommonPolygon(arrayList);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Polygon value) {
        KSerializer kSerializer = serializer;
        List<Point> coordinates = value.getCoordinates();
        ArrayList arrayList = new ArrayList(tcc.n(coordinates, 10));
        for (Point point : coordinates) {
            arrayList.add(scc.g(Double.valueOf(point.getLon()), Double.valueOf(point.getLat())));
        }
        kSerializer.serialize(encoder, arrayList);
    }
}
