package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class eu implements uxs {
    public static final eu a;
    private static final SerialDescriptor descriptor;

    static {
        eu euVar = new eu();
        a = euVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.api.network.objects.ActionDataNotification", euVar, 6);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("icon_image_tag", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("event_info", true);
        pluginGeneratedSerialDescriptor.j("show_limitations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = gu.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[3].getValue(), qke.n(ofo.a), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gu.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        qfo qfoVar = null;
        List list2 = null;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    qfoVar = (qfo) b.s(serialDescriptor, 4, ofo.a, qfoVar);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new gu(i, str, str2, str3, list, qfoVar, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gu guVar = (gu) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gu.g;
        if (b.F() || guVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, guVar.a);
        }
        if (b.F() || guVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, guVar.b);
        }
        if (b.F() || guVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, guVar.c);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(guVar.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), guVar.d);
        }
        if (b.F() || guVar.e != null) {
            b.g(serialDescriptor, 4, ofo.a, guVar.e);
        }
        if (b.F() || !jl40.l(guVar.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), guVar.f);
        }
        b.c(serialDescriptor);
    }
}
