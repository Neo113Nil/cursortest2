package com.yandex.go.explorer.impl.data.models;

import defpackage.e6m;
import defpackage.jxi;
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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/explorer/impl/data/models/LocationEntryDto.$serializer", "Luxs;", "Lcom/yandex/go/explorer/impl/data/models/LocationEntryDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/explorer/impl/data/models/LocationEntryDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/explorer/impl/data/models/LocationEntryDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class LocationEntryDto$$serializer implements uxs {
    public static final LocationEntryDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LocationEntryDto$$serializer locationEntryDto$$serializer = new LocationEntryDto$$serializer();
        INSTANCE = locationEntryDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.explorer.impl.data.models.LocationEntryDto", locationEntryDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, false);
        pluginGeneratedSerialDescriptor.j("horizontal_accuracy", false);
        pluginGeneratedSerialDescriptor.j("speed", false);
        pluginGeneratedSerialDescriptor.j("course", false);
        pluginGeneratedSerialDescriptor.j("vertical_accuracy", false);
        pluginGeneratedSerialDescriptor.j("altitude", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocationEntryDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{CoordinateDto$$serializer.INSTANCE, pnz.a, e6mVar, e6mVar, qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar)};
    }

    @Override // defpackage.myi
    public final LocationEntryDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        LocationEntryDto locationEntryDto = null;
        int i = 0;
        CoordinateDto coordinateDto = null;
        long j = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = true;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    coordinateDto = (CoordinateDto) b.A(serialDescriptor, 0, CoordinateDto$$serializer.INSTANCE, coordinateDto);
                    i |= 1;
                    break;
                case 1:
                    j = b.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d = b.E(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d2 = b.E(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    d3 = (Double) b.s(serialDescriptor, 4, e6m.a, d3);
                    i |= 16;
                    break;
                case 5:
                    d4 = (Double) b.s(serialDescriptor, 5, e6m.a, d4);
                    i |= 32;
                    break;
                case 6:
                    d5 = (Double) b.s(serialDescriptor, 6, e6m.a, d5);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return locationEntryDto;
            }
            locationEntryDto = null;
        }
        b.c(serialDescriptor);
        return new LocationEntryDto(i, coordinateDto, j, d, d2, d3, d4, d5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LocationEntryDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, CoordinateDto$$serializer.INSTANCE, value.a);
        b.s(serialDescriptor, 1, value.b);
        b.E(serialDescriptor, 2, value.c);
        b.E(serialDescriptor, 3, value.d);
        e6m e6mVar = e6m.a;
        b.g(serialDescriptor, 4, e6mVar, value.e);
        b.g(serialDescriptor, 5, e6mVar, value.f);
        b.g(serialDescriptor, 6, e6mVar, value.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
