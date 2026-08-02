package com.yandex.go.places.impl.data.entities.network.organizations.layer;

import defpackage.auu0;
import defpackage.b0t;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uc4;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerStateRequestParam.$serializer", "Luxs;", "Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerStateRequestParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerStateRequestParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerStateRequestParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class PlacesOrganizationsLayerStateRequestParam$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PlacesOrganizationsLayerStateRequestParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlacesOrganizationsLayerStateRequestParam$$serializer placesOrganizationsLayerStateRequestParam$$serializer = new PlacesOrganizationsLayerStateRequestParam$$serializer();
        INSTANCE = placesOrganizationsLayerStateRequestParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerStateRequestParam", placesOrganizationsLayerStateRequestParam$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("bbox", true);
        pluginGeneratedSerialDescriptor.j("zoom", true);
        pluginGeneratedSerialDescriptor.j("favorites", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("context", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlacesOrganizationsLayerStateRequestParam$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(uc4.Companion.serializer());
        KSerializer n2 = qke.n(h6w.a);
        KSerializer n3 = qke.n(z96.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{b0t.a, n, n2, n3, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final PlacesOrganizationsLayerStateRequestParam deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        uc4 uc4Var = null;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                    i |= 1;
                    break;
                case 1:
                    uc4Var = (uc4) b.s(serialDescriptor, 1, uc4.Companion.serializer(), uc4Var);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.s(serialDescriptor, 5, auu0.a, str2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlacesOrganizationsLayerStateRequestParam(i, zzsVar, uc4Var, num, bool, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlacesOrganizationsLayerStateRequestParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, zzs.f)) {
            b.e(serialDescriptor, 0, b0t.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, uc4.Companion.serializer(), value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, h6w.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, z96.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
