package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class fxu0 implements uxs {
    public static final fxu0 a;
    private static final SerialDescriptor descriptor;

    static {
        fxu0 fxu0Var = new fxu0();
        a = fxu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.StyleImage", fxu0Var, 6);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("size", true);
        pluginGeneratedSerialDescriptor.j("doublex", true);
        pluginGeneratedSerialDescriptor.j("triplex", true);
        pluginGeneratedSerialDescriptor.j("anchor", true);
        pluginGeneratedSerialDescriptor.j("corner_radius", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = hxu0.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(ixu0.a), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[4].getValue()), nor.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = hxu0.g;
        b.getClass();
        int i = 0;
        String str = null;
        kxu0 kxu0Var = null;
        String str2 = null;
        String str3 = null;
        Float[] fArr = null;
        float f = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    kxu0Var = (kxu0) b.s(serialDescriptor, 1, ixu0.a, kxu0Var);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    fArr = (Float[]) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), fArr);
                    i |= 16;
                    break;
                case 5:
                    f = b.y(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new hxu0(i, str, kxu0Var, str2, str3, fArr, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hxu0 hxu0Var = (hxu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = hxu0.g;
        if (b.F() || hxu0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, hxu0Var.a);
        }
        if (b.F() || hxu0Var.b != null) {
            b.g(serialDescriptor, 1, ixu0.a, hxu0Var.b);
        }
        if (b.F() || hxu0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, hxu0Var.c);
        }
        if (b.F() || hxu0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, hxu0Var.d);
        }
        if (b.F() || hxu0Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), hxu0Var.e);
        }
        if (b.F() || Float.compare(hxu0Var.f, 0.0f) != 0) {
            b.z(serialDescriptor, 5, hxu0Var.f);
        }
        b.c(serialDescriptor);
    }
}
