package com.yandex.passport.common.network;

import defpackage.auu0;
import defpackage.mdx;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qcx;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final /* synthetic */ class b0 implements uxs {
    public static final b0 a;
    private static final SerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.common.network.ResponseError.PhraseTraceErrorResponse", b0Var, 4);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("phrase", true);
        pluginGeneratedSerialDescriptor.j("trace", true);
        pluginGeneratedSerialDescriptor.j("request_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{mdx.a, auu0Var, auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        kotlinx.serialization.json.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (kotlinx.serialization.json.c) b.A(serialDescriptor, 0, mdx.a, cVar);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new d0(i, str, str2, str3, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (defpackage.jl40.l(r3, java.lang.String.valueOf(r8 != null ? defpackage.qcx.n(r8) : null)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (defpackage.jl40.l(r8, java.lang.String.valueOf(r0 != null ? defpackage.qcx.n(r0) : null)) == false) goto L11;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        d0 d0Var = (d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        mdx mdxVar = mdx.a;
        kotlinx.serialization.json.c cVar = d0Var.a;
        String str = d0Var.d;
        String str2 = d0Var.c;
        String str3 = d0Var.b;
        b.e(serialDescriptor, 0, mdxVar, cVar);
        if (!b.F()) {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) qcx.m(cVar).get("phrase");
        }
        b.o(serialDescriptor, 1, str3);
        if (!b.F()) {
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) qcx.m(cVar).get("trace");
        }
        b.o(serialDescriptor, 2, str2);
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
