package defpackage;

import defpackage.i210;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class f210 implements uxs {
    public static final f210 a;
    private static final SerialDescriptor descriptor;

    static {
        f210 f210Var = new f210();
        a = f210Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.MasstransitBleScanningScreenSettingsDto", f210Var, 4);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("header_section", true);
        pluginGeneratedSerialDescriptor.j("ble_section", true);
        pluginGeneratedSerialDescriptor.j("ble_scan_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) i210.f[0].getValue()), qke.n(m210.a), qke.n(j210.a), qke.n(g210.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = i210.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        i210.c cVar = null;
        i210.b bVar = null;
        i210.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else if (v == 1) {
                cVar = (i210.c) b.s(serialDescriptor, 1, m210.a, cVar);
                i |= 2;
            } else if (v == 2) {
                bVar = (i210.b) b.s(serialDescriptor, 2, j210.a, bVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar = (i210.a) b.s(serialDescriptor, 3, g210.a, aVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new i210(i, map, cVar, bVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i210 i210Var = (i210) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = i210.f;
        if (b.F() || i210Var.b != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), i210Var.b);
        }
        if (b.F() || i210Var.c != null) {
            b.g(serialDescriptor, 1, m210.a, i210Var.c);
        }
        if (b.F() || i210Var.d != null) {
            b.g(serialDescriptor, 2, j210.a, i210Var.d);
        }
        if (b.F() || i210Var.e != null) {
            b.g(serialDescriptor, 3, g210.a, i210Var.e);
        }
        b.c(serialDescriptor);
    }
}
