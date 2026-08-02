package com.yandex.passport.internal.storage;

import com.yandex.passport.common.core.Uid;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes15.dex */
public final /* synthetic */ class j implements uxs {
    public static final j a;
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.internal.storage.UidWithTtl", jVar, 2);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j("ttl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{com.yandex.passport.internal.serialization.a.a, pnz.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        Uid uid = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                uid = (Uid) b.A(serialDescriptor, 0, com.yandex.passport.internal.serialization.a.a, uid);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                j = b.f(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new l(i, uid, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        k kVar = l.Companion;
        b.e(serialDescriptor, 0, com.yandex.passport.internal.serialization.a.a, lVar.a);
        b.s(serialDescriptor, 1, lVar.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
