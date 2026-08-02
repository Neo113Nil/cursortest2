package com.yandex.plus.pay.data.mb.dto;

import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto.SynchronizationStateDto", dVar, 4);
        pluginGeneratedSerialDescriptor.j("ottSubscriptionSync", true);
        pluginGeneratedSerialDescriptor.j("featuresSync", true);
        pluginGeneratedSerialDescriptor.j("familyRoleSync", true);
        pluginGeneratedSerialDescriptor.j("totalSync", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z3 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                z4 = b.C(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z5 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SubscriptionInfoDto.a(i, z2, z3, z4, z5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SubscriptionInfoDto.a aVar = (SubscriptionInfoDto.a) obj;
        boolean z = aVar.d;
        boolean z2 = aVar.c;
        boolean z3 = aVar.b;
        boolean z4 = aVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !z4) {
            b.n(serialDescriptor, 0, z4);
        }
        if (b.F() || !z3) {
            b.n(serialDescriptor, 1, z3);
        }
        if (b.F() || !z2) {
            b.n(serialDescriptor, 2, z2);
        }
        if (b.F() || !z) {
            b.n(serialDescriptor, 3, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
