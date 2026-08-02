package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class o8 implements uxs {
    public static final o8 a;
    private static final SerialDescriptor descriptor;

    static {
        o8 o8Var = new o8();
        a = o8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetSsoConfigRequest.Result", o8Var, 2);
        pluginGeneratedSerialDescriptor.j("disallowed_ya_apps", true);
        pluginGeneratedSerialDescriptor.j("allowed_sso_apps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = q8.c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = q8.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, kSerializerArr[0], list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.A(serialDescriptor, 1, kSerializerArr[1], list2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new q8(list, list2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q8 q8Var = (q8) obj;
        List list = q8Var.b;
        List list2 = q8Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = q8.c;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(list2, emptyList)) {
            b.e(serialDescriptor, 0, kSerializerArr[0], list2);
        }
        if (b.F() || !jl40.l(list, emptyList)) {
            b.e(serialDescriptor, 1, kSerializerArr[1], list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
