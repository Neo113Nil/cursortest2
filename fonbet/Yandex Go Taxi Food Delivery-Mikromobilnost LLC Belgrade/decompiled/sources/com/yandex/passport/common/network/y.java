package com.yandex.passport.common.network;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
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

/* loaded from: classes15.dex */
public final /* synthetic */ class y implements uxs {
    public static final y a;
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.common.network.ResponseError.MultipleErrorResponse", yVar, 4);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("errors", true);
        pluginGeneratedSerialDescriptor.j("error_description", true);
        pluginGeneratedSerialDescriptor.j("request_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = a0.e;
        KSerializer n = qke.n(kSerializerArr[0]);
        KSerializer kSerializer = kSerializerArr[1];
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, kSerializer, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = a0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        BackendError backendError = null;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                backendError = (BackendError) b.s(serialDescriptor, 0, kSerializerArr[0], backendError);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, kSerializerArr[1], list);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new a0(i, backendError, list, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a0 a0Var = (a0) obj;
        String str = a0Var.d;
        String str2 = a0Var.c;
        List list = a0Var.b;
        BackendError backendError = a0Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = a0.e;
        if (b.F() || backendError != null) {
            b.g(serialDescriptor, 0, kSerializerArr[0], backendError);
        }
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 1, kSerializerArr[1], list);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 2, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 3, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
