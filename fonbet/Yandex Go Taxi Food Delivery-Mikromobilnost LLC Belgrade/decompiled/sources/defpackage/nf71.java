package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class nf71 implements uxs {
    public static final nf71 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        nf71 nf71Var = new nf71();
        a = nf71Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", nf71Var, 6);
        pluginGeneratedSerialDescriptor.j("app_data", false);
        pluginGeneratedSerialDescriptor.j("sdk_data", false);
        pluginGeneratedSerialDescriptor.j("adapters_data", false);
        pluginGeneratedSerialDescriptor.j("consents_data", false);
        pluginGeneratedSerialDescriptor.j("sdk_logs", false);
        pluginGeneratedSerialDescriptor.j("network_logs", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = yu71.g;
        return new KSerializer[]{w271.a, jb81.a, i3yVarArr[2].getValue(), qo71.a, i3yVarArr[4].getValue(), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = yu71.g;
        b2.getClass();
        boolean z = true;
        int i = 0;
        b971 b971Var = null;
        al81 al81Var = null;
        List list = null;
        ru71 ru71Var = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    b971Var = (b971) b2.A(pluginGeneratedSerialDescriptor, 0, w271.a, b971Var);
                    i |= 1;
                    break;
                case 1:
                    al81Var = (al81) b2.A(pluginGeneratedSerialDescriptor, 1, jb81.a, al81Var);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b2.A(pluginGeneratedSerialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    ru71Var = (ru71) b2.A(pluginGeneratedSerialDescriptor, 3, qo71.a, ru71Var);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b2.A(pluginGeneratedSerialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) b2.A(pluginGeneratedSerialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new yu71(i, b971Var, al81Var, list, ru71Var, list2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yu71 yu71Var = (yu71) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = yu71.g;
        b2.e(pluginGeneratedSerialDescriptor, 0, w271.a, yu71Var.a);
        b2.e(pluginGeneratedSerialDescriptor, 1, jb81.a, yu71Var.b);
        b2.e(pluginGeneratedSerialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), yu71Var.c);
        b2.e(pluginGeneratedSerialDescriptor, 3, qo71.a, yu71Var.d);
        b2.e(pluginGeneratedSerialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), yu71Var.e);
        b2.e(pluginGeneratedSerialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), yu71Var.f);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
