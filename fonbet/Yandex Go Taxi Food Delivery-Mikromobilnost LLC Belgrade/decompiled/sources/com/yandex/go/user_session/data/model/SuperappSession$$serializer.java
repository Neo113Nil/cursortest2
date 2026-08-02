package com.yandex.go.user_session.data.model;

import defpackage.auu0;
import defpackage.h6w;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/user_session/data/model/SuperappSession.$serializer", "Luxs;", "Lcom/yandex/go/user_session/data/model/SuperappSession;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/user_session/data/model/SuperappSession;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/user_session/data/model/SuperappSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SuperappSession$$serializer implements uxs {
    public static final SuperappSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperappSession$$serializer superappSession$$serializer = new SuperappSession$$serializer();
        INSTANCE = superappSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.user_session.data.model.SuperappSession", superappSession$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j("createdAt", false);
        pluginGeneratedSerialDescriptor.j("foregroundStoppedAt", true);
        pluginGeneratedSerialDescriptor.j("creationTtl", false);
        pluginGeneratedSerialDescriptor.j("foregroundStoppedTtl", false);
        pluginGeneratedSerialDescriptor.j("appVersion", false);
        pluginGeneratedSerialDescriptor.j("passportUid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperappSession$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{auu0.a, pnzVar, qke.n(pnzVar), pnzVar, pnzVar, h6w.a, pnzVar};
    }

    @Override // defpackage.myi
    public final SuperappSession deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        String str = null;
        Long l = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = b.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) b.s(serialDescriptor, 2, pnz.a, l);
                    i |= 4;
                    break;
                case 3:
                    j2 = b.f(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j3 = b.f(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j4 = b.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SuperappSession(i, str, j, l, j2, j3, i2, j4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperappSession value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = value.a;
        Long l = value.c;
        b.o(serialDescriptor, 0, str);
        b.s(serialDescriptor, 1, value.b);
        if (b.F() || l != null) {
            b.g(serialDescriptor, 2, pnz.a, l);
        }
        b.s(serialDescriptor, 3, value.d);
        b.s(serialDescriptor, 4, value.e);
        b.A(5, value.f, serialDescriptor);
        b.s(serialDescriptor, 6, value.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
