package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes8.dex */
public final /* synthetic */ class p5 implements uxs {
    public static final p5 a;
    private static final SerialDescriptor descriptor;

    static {
        p5 p5Var = new p5();
        a = p5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetConfigRequest.ConfigEntryDTO", p5Var, 5);
        pluginGeneratedSerialDescriptor.j("platform", true);
        pluginGeneratedSerialDescriptor.j("am_version", true);
        pluginGeneratedSerialDescriptor.j(StartupRequest.PARAM_APP_VERSION, true);
        pluginGeneratedSerialDescriptor.j(CommonUrlParts.APP_ID, true);
        pluginGeneratedSerialDescriptor.j("filter_rules", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = r5.f;
        KSerializer n = qke.n(auu0.a);
        k6 k6Var = k6.a;
        return new KSerializer[]{n, qke.n(k6Var), qke.n(k6Var), qke.n(kSerializerArr[3]), kSerializerArr[4]};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = r5.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        m6 m6Var = null;
        m6 m6Var2 = null;
        List list = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                m6Var = (m6) b.s(serialDescriptor, 1, k6.a, m6Var);
                i |= 2;
            } else if (v == 2) {
                m6Var2 = (m6) b.s(serialDescriptor, 2, k6.a, m6Var2);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.s(serialDescriptor, 3, kSerializerArr[3], list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 4, kSerializerArr[4], map);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new r5(i, str, m6Var, m6Var2, list, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r5 r5Var = (r5) obj;
        List list = r5Var.d;
        m6 m6Var = r5Var.c;
        m6 m6Var2 = r5Var.b;
        String str = r5Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = r5.f;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        if (b.F() || m6Var2 != null) {
            b.g(serialDescriptor, 1, k6.a, m6Var2);
        }
        if (b.F() || m6Var != null) {
            b.g(serialDescriptor, 2, k6.a, m6Var);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 3, kSerializerArr[3], list);
        }
        b.e(serialDescriptor, 4, kSerializerArr[4], r5Var.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
