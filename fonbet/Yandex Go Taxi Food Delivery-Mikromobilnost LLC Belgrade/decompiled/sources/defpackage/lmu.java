package defpackage;

import defpackage.kmu;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class lmu implements uxs {
    public static final lmu a;
    private static final SerialDescriptor descriptor;

    static {
        lmu lmuVar = new lmu();
        a = lmuVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.HistorySession.HistorySessionSegment", lmuVar, 8);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("total_price", true);
        pluginGeneratedSerialDescriptor.j("scale_size", true);
        pluginGeneratedSerialDescriptor.j("discount", true);
        pluginGeneratedSerialDescriptor.j("finish_info", true);
        pluginGeneratedSerialDescriptor.j("route", true);
        pluginGeneratedSerialDescriptor.j("ride_statistics", true);
        pluginGeneratedSerialDescriptor.j("info_message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kmu.b.i;
        KSerializer n = qke.n(auu0.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(rmu.a), qke.n(nmu.a), qke.n(w7s.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kmu.b.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        FormattedText formattedText = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        kmu.d dVar = null;
        kmu.c cVar = null;
        int i = 0;
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
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) b.s(serialDescriptor, 3, h6w.a, num3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    dVar = (kmu.d) b.s(serialDescriptor, 5, rmu.a, dVar);
                    i |= 32;
                    break;
                case 6:
                    cVar = (kmu.c) b.s(serialDescriptor, 6, nmu.a, cVar);
                    i |= 64;
                    break;
                case 7:
                    formattedText = (FormattedText) b.s(serialDescriptor, 7, w7s.a, formattedText);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new kmu.b(i, str, num, num2, num3, list, dVar, cVar, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kmu.b bVar = (kmu.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kmu.b.i;
        if (b.F() || bVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, bVar.c);
        }
        if (b.F() || bVar.d != null) {
            b.g(serialDescriptor, 3, h6w.a, bVar.d);
        }
        if (b.F() || bVar.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), bVar.e);
        }
        if (b.F() || bVar.f != null) {
            b.g(serialDescriptor, 5, rmu.a, bVar.f);
        }
        if (b.F() || bVar.g != null) {
            b.g(serialDescriptor, 6, nmu.a, bVar.g);
        }
        if (b.F() || bVar.h != null) {
            b.g(serialDescriptor, 7, w7s.a, bVar.h);
        }
        b.c(serialDescriptor);
    }
}
