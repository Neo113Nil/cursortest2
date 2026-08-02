package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class orx implements uxs {
    public static final orx a;
    private static final SerialDescriptor descriptor;

    static {
        orx orxVar = new orx();
        a = orxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.taxi.suggest.LanguageInfo", orxVar, 2);
        pluginGeneratedSerialDescriptor.j("mobile_networks", true);
        pluginGeneratedSerialDescriptor.j("mapkit_lang_region", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) srx.c[0].getValue()), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = srx.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new srx(i, list, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        srx srxVar = (srx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = srx.c;
        if (b.F() || srxVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), srxVar.a);
        }
        if (b.F() || srxVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, srxVar.b);
        }
        b.c(serialDescriptor);
    }
}
