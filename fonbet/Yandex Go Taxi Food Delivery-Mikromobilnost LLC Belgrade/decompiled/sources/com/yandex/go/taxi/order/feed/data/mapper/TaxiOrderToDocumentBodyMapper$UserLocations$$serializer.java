package com.yandex.go.taxi.order.feed.data.mapper;

import com.yandex.go.shortcuts.dto.request.SavedPlace;
import com.yandex.go.shortcuts.dto.request.SavedPlace$Location$$serializer;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/feed/data/mapper/TaxiOrderToDocumentBodyMapper.UserLocations.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/feed/data/mapper/TaxiOrderToDocumentBodyMapper$UserLocations;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/feed/data/mapper/TaxiOrderToDocumentBodyMapper$UserLocations;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/feed/data/mapper/TaxiOrderToDocumentBodyMapper$UserLocations;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderToDocumentBodyMapper$UserLocations$$serializer implements uxs {
    public static final TaxiOrderToDocumentBodyMapper$UserLocations$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiOrderToDocumentBodyMapper$UserLocations$$serializer taxiOrderToDocumentBodyMapper$UserLocations$$serializer = new TaxiOrderToDocumentBodyMapper$UserLocations$$serializer();
        INSTANCE = taxiOrderToDocumentBodyMapper$UserLocations$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.feed.data.mapper.TaxiOrderToDocumentBodyMapper.UserLocations", taxiOrderToDocumentBodyMapper$UserLocations$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("currentLocation", false);
        pluginGeneratedSerialDescriptor.j("pointA", false);
        pluginGeneratedSerialDescriptor.j("pointB", false);
        pluginGeneratedSerialDescriptor.j("savedPlaces", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiOrderToDocumentBodyMapper$UserLocations$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TaxiOrderToDocumentBodyMapper$UserLocations.e;
        SavedPlace$Location$$serializer savedPlace$Location$$serializer = SavedPlace$Location$$serializer.INSTANCE;
        return new KSerializer[]{savedPlace$Location$$serializer, qke.n(savedPlace$Location$$serializer), qke.n(savedPlace$Location$$serializer), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final TaxiOrderToDocumentBodyMapper$UserLocations deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderToDocumentBodyMapper$UserLocations.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        SavedPlace.Location location = null;
        SavedPlace.Location location2 = null;
        SavedPlace.Location location3 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                location = (SavedPlace.Location) b.A(serialDescriptor, 0, SavedPlace$Location$$serializer.INSTANCE, location);
                i |= 1;
            } else if (v == 1) {
                location2 = (SavedPlace.Location) b.s(serialDescriptor, 1, SavedPlace$Location$$serializer.INSTANCE, location2);
                i |= 2;
            } else if (v == 2) {
                location3 = (SavedPlace.Location) b.s(serialDescriptor, 2, SavedPlace$Location$$serializer.INSTANCE, location3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new TaxiOrderToDocumentBodyMapper$UserLocations(i, location, location2, location3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiOrderToDocumentBodyMapper$UserLocations value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderToDocumentBodyMapper$UserLocations.e;
        SavedPlace$Location$$serializer savedPlace$Location$$serializer = SavedPlace$Location$$serializer.INSTANCE;
        b.e(serialDescriptor, 0, savedPlace$Location$$serializer, value.a);
        b.g(serialDescriptor, 1, savedPlace$Location$$serializer, value.b);
        b.g(serialDescriptor, 2, savedPlace$Location$$serializer, value.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
