package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class jq20 implements uxs {
    public static final jq20 a;
    private static final SerialDescriptor descriptor;

    static {
        jq20 jq20Var = new jq20();
        a = jq20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.api.model.MobProxy", jq20Var, 9);
        pluginGeneratedSerialDescriptor.j("api_name", false);
        pluginGeneratedSerialDescriptor.j("proxy_id", false);
        pluginGeneratedSerialDescriptor.j("base_url", false);
        pluginGeneratedSerialDescriptor.j(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, false);
        pluginGeneratedSerialDescriptor.j("ip", true);
        pluginGeneratedSerialDescriptor.j("base_url_ip", true);
        pluginGeneratedSerialDescriptor.j("host_ip", true);
        pluginGeneratedSerialDescriptor.j("ip_default_host", true);
        pluginGeneratedSerialDescriptor.j("contour", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str4 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str5 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i |= 16;
                    break;
                case 5:
                    str7 = (String) b.s(serialDescriptor, 5, auu0.a, str7);
                    i |= 32;
                    break;
                case 6:
                    str8 = (String) b.s(serialDescriptor, 6, auu0.a, str8);
                    i |= 64;
                    break;
                case 7:
                    str9 = (String) b.s(serialDescriptor, 7, auu0.a, str9);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new lq20(i, str2, str3, str4, str5, str6, str7, str8, str9, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lq20 lq20Var = (lq20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = lq20Var.a;
        String str2 = lq20Var.i;
        String str3 = lq20Var.h;
        String str4 = lq20Var.g;
        String str5 = lq20Var.f;
        String str6 = lq20Var.e;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, lq20Var.b);
        b.o(serialDescriptor, 2, lq20Var.c);
        b.o(serialDescriptor, 3, lq20Var.d);
        if (b.F() || str6 != null) {
            b.g(serialDescriptor, 4, auu0.a, str6);
        }
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 5, auu0.a, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 6, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 7, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 8, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
