package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;

/* loaded from: classes5.dex */
public final /* synthetic */ class j0t implements uxs {
    public static final j0t a;
    private static final SerialDescriptor descriptor;

    static {
        j0t j0tVar = new j0t();
        a = j0tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.GeoPositionWithSource", j0tVar, 11);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("lat", false);
        pluginGeneratedSerialDescriptor.j("lon", false);
        pluginGeneratedSerialDescriptor.j("fullAddress", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("entrance", true);
        pluginGeneratedSerialDescriptor.j("doorcode", true);
        pluginGeneratedSerialDescriptor.j("floor", true);
        pluginGeneratedSerialDescriptor.j("office", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) l0t.o[0].getValue());
        e6m e6mVar = e6m.a;
        KSerializer n2 = qke.n(e6mVar);
        KSerializer n3 = qke.n(e6mVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = l0t.o;
        b.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = true;
        String str4 = null;
        int i = 0;
        GeoPointSource geoPointSource = null;
        Double d = null;
        Double d2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    geoPointSource = (GeoPointSource) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), geoPointSource);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    d = (Double) b.s(serialDescriptor, 1, e6m.a, d);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    d2 = (Double) b.s(serialDescriptor, 2, e6m.a, d2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 3, auu0.a, str5);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str7 = (String) b.s(serialDescriptor, 5, auu0.a, str7);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str8 = (String) b.s(serialDescriptor, 6, auu0.a, str8);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 7, auu0.a, str4);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str3 = (String) b.s(serialDescriptor, 8, auu0.a, str3);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 9, auu0.a, str2);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new l0t(i, geoPointSource, d, d2, str5, str6, str7, str8, str4, str3, str2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0t l0tVar = (l0t) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l0t.o;
        if (b.F() || l0tVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), l0tVar.a);
        }
        e6m e6mVar = e6m.a;
        Double d = l0tVar.b;
        String str = l0tVar.k;
        String str2 = l0tVar.j;
        String str3 = l0tVar.i;
        String str4 = l0tVar.h;
        String str5 = l0tVar.g;
        String str6 = l0tVar.f;
        String str7 = l0tVar.e;
        String str8 = l0tVar.d;
        b.g(serialDescriptor, 1, e6mVar, d);
        b.g(serialDescriptor, 2, e6mVar, l0tVar.c);
        if (b.F() || str8 != null) {
            b.g(serialDescriptor, 3, auu0.a, str8);
        }
        if (b.F() || str7 != null) {
            b.g(serialDescriptor, 4, auu0.a, str7);
        }
        if (b.F() || str6 != null) {
            b.g(serialDescriptor, 5, auu0.a, str6);
        }
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 6, auu0.a, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 7, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 8, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 9, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 10, auu0.a, str);
        }
        b.c(serialDescriptor);
    }
}
