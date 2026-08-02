package com.yandex.go.zone.repository;

import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.mdx;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/repository/ZoneCacheEntry.$serializer", "Luxs;", "Lcom/yandex/go/zone/repository/ZoneCacheEntry;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/repository/ZoneCacheEntry;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/repository/ZoneCacheEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ZoneCacheEntry$$serializer implements uxs {
    public static final ZoneCacheEntry$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ZoneCacheEntry$$serializer zoneCacheEntry$$serializer = new ZoneCacheEntry$$serializer();
        INSTANCE = zoneCacheEntry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.repository.ZoneCacheEntry", zoneCacheEntry$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("created", true);
        pluginGeneratedSerialDescriptor.j("accessed", true);
        pluginGeneratedSerialDescriptor.j("ttl_sec", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZoneCacheEntry$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        pnz pnzVar = pnz.a;
        return new KSerializer[]{mdx.a, pnzVar, pnzVar, n};
    }

    @Override // defpackage.myi
    public final ZoneCacheEntry deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        kotlinx.serialization.json.c cVar = null;
        Integer num = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (kotlinx.serialization.json.c) b.A(serialDescriptor, 0, mdx.a, cVar);
                i |= 1;
            } else if (v == 1) {
                j = b.f(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                j2 = b.f(serialDescriptor, 2);
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
        return new ZoneCacheEntry(i, cVar, j, j2, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ZoneCacheEntry value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, new kotlinx.serialization.json.c(kotlin.collections.b.f()))) {
            b.e(serialDescriptor, 0, mdx.a, value.a);
        }
        if (b.F() || value.b != 0) {
            b.s(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != value.b) {
            b.s(serialDescriptor, 2, value.c);
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
