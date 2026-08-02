package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationCardStateRequestParam;
import defpackage.auu0;
import defpackage.b0t;
import defpackage.d430;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationCardStateRequestParam.$serializer", "Luxs;", "Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationCardStateRequestParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationCardStateRequestParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationCardStateRequestParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class OrganizationCardStateRequestParam$$serializer implements uxs {
    public static final int $stable = 0;
    public static final OrganizationCardStateRequestParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrganizationCardStateRequestParam$$serializer organizationCardStateRequestParam$$serializer = new OrganizationCardStateRequestParam$$serializer();
        INSTANCE = organizationCardStateRequestParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationCardStateRequestParam", organizationCardStateRequestParam$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("mode_context", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("permalink", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrganizationCardStateRequestParam$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{b0t.a, qke.n(auu0Var), qke.n(d430.e), qke.n(auu0Var), qke.n(OrganizationCardStateRequestParam$PermalinkStateParam$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final OrganizationCardStateRequestParam deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        String str = null;
        c cVar = null;
        String str2 = null;
        OrganizationCardStateRequestParam.PermalinkStateParam permalinkStateParam = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                cVar = (c) b.s(serialDescriptor, 2, d430.e, cVar);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                permalinkStateParam = (OrganizationCardStateRequestParam.PermalinkStateParam) b.s(serialDescriptor, 4, OrganizationCardStateRequestParam$PermalinkStateParam$$serializer.INSTANCE, permalinkStateParam);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new OrganizationCardStateRequestParam(i, zzsVar, str, cVar, str2, permalinkStateParam);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OrganizationCardStateRequestParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, zzs.f)) {
            b.e(serialDescriptor, 0, b0t.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, d430.e, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, OrganizationCardStateRequestParam$PermalinkStateParam$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
