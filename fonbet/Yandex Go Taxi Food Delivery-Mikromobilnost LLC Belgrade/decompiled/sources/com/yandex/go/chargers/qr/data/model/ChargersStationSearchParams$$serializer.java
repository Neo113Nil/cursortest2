package com.yandex.go.chargers.qr.data.model;

import defpackage.auu0;
import defpackage.b0t;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/qr/data/model/ChargersStationSearchParams.$serializer", "Luxs;", "Lcom/yandex/go/chargers/qr/data/model/ChargersStationSearchParams;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/qr/data/model/ChargersStationSearchParams;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/qr/data/model/ChargersStationSearchParams;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersStationSearchParams$$serializer implements uxs {
    public static final ChargersStationSearchParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersStationSearchParams$$serializer chargersStationSearchParams$$serializer = new ChargersStationSearchParams$$serializer();
        INSTANCE = chargersStationSearchParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.qr.data.model.ChargersStationSearchParams", chargersStationSearchParams$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("station_number", false);
        pluginGeneratedSerialDescriptor.j("user_location", true);
        pluginGeneratedSerialDescriptor.j("pin_position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersStationSearchParams$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        b0t b0tVar = b0t.a;
        return new KSerializer[]{auu0.a, qke.n(b0tVar), qke.n(b0tVar)};
    }

    @Override // defpackage.myi
    public final ChargersStationSearchParams deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        zzs zzsVar = null;
        zzs zzsVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                zzsVar = (zzs) b.s(serialDescriptor, 1, b0t.a, zzsVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                zzsVar2 = (zzs) b.s(serialDescriptor, 2, b0t.a, zzsVar2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ChargersStationSearchParams(i, str, zzsVar, zzsVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersStationSearchParams value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = value.a;
        zzs zzsVar = value.c;
        zzs zzsVar2 = value.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || zzsVar2 != null) {
            b.g(serialDescriptor, 1, b0t.a, zzsVar2);
        }
        if (b.F() || zzsVar != null) {
            b.g(serialDescriptor, 2, b0t.a, zzsVar);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
