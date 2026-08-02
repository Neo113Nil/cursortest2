package defpackage;

import defpackage.f0k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class a0k implements uxs {
    public static final a0k a;
    private static final SerialDescriptor descriptor;

    static {
        a0k a0kVar = new a0k();
        a = a0kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.DisplaySettings.Extra.AdvertPoiAnalyticsData", a0kVar, 11);
        pluginGeneratedSerialDescriptor.j("point_type", true);
        pluginGeneratedSerialDescriptor.j("icon_type", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("formatted_title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("formatted_subtitle", true);
        pluginGeneratedSerialDescriptor.j("permalink", true);
        pluginGeneratedSerialDescriptor.j("hitlog", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("is_paid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Boolean bool = null;
        String str = null;
        boolean z2 = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    str3 = (String) b.s(serialDescriptor, 0, auu0.a, str3);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 1, auu0.a, str4);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 2, auu0.a, str5);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 3, auu0.a, str6);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    str7 = (String) b.s(serialDescriptor, 4, auu0.a, str7);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    str8 = (String) b.s(serialDescriptor, 5, auu0.a, str8);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    str10 = (String) b.s(serialDescriptor, 7, auu0.a, str10);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 8, auu0.a, str2);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    bool = (Boolean) b.s(serialDescriptor, 10, z96.a, bool);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new f0k.a.C0095a(i, str3, str4, str5, str6, str7, str8, str9, str10, str2, str, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0k.a.C0095a c0095a = (f0k.a.C0095a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || c0095a.a != null) {
            b.g(serialDescriptor, 0, auu0.a, c0095a.a);
        }
        if (b.F() || c0095a.b != null) {
            b.g(serialDescriptor, 1, auu0.a, c0095a.b);
        }
        if (b.F() || c0095a.c != null) {
            b.g(serialDescriptor, 2, auu0.a, c0095a.c);
        }
        if (b.F() || c0095a.d != null) {
            b.g(serialDescriptor, 3, auu0.a, c0095a.d);
        }
        if (b.F() || c0095a.e != null) {
            b.g(serialDescriptor, 4, auu0.a, c0095a.e);
        }
        if (b.F() || c0095a.f != null) {
            b.g(serialDescriptor, 5, auu0.a, c0095a.f);
        }
        if (b.F() || c0095a.g != null) {
            b.g(serialDescriptor, 6, auu0.a, c0095a.g);
        }
        if (b.F() || c0095a.h != null) {
            b.g(serialDescriptor, 7, auu0.a, c0095a.h);
        }
        if (b.F() || c0095a.i != null) {
            b.g(serialDescriptor, 8, auu0.a, c0095a.i);
        }
        if (b.F() || c0095a.j != null) {
            b.g(serialDescriptor, 9, auu0.a, c0095a.j);
        }
        if (b.F() || c0095a.k != null) {
            b.g(serialDescriptor, 10, z96.a, c0095a.k);
        }
        b.c(serialDescriptor);
    }
}
