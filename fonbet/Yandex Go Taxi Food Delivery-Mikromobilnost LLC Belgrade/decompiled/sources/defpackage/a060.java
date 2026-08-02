package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class a060 implements uxs {
    public static final a060 a;
    private static final SerialDescriptor descriptor;

    static {
        a060 a060Var = new a060();
        a = a060Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkSdkConfigurationModel", a060Var, 7);
        pluginGeneratedSerialDescriptor.j("hostsForOpenInSystem", false);
        pluginGeneratedSerialDescriptor.j("allowedDomains", false);
        pluginGeneratedSerialDescriptor.j("jsBridgeAllowedDomains", false);
        pluginGeneratedSerialDescriptor.j("forbiddenDomains", false);
        pluginGeneratedSerialDescriptor.j("webViewHideThreshold", false);
        pluginGeneratedSerialDescriptor.j("webViewDownwardScrollFriction", false);
        pluginGeneratedSerialDescriptor.j("plusHomeBaseUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = c060.h;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), h6wVar, h6wVar, qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c060.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    list4 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list4);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) b.s(serialDescriptor, 6, auu0.a, str);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new c060(i, list, list2, list3, list4, i2, i3, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c060 c060Var = (c060) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c060.h;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        List list = c060Var.a;
        String str = c060Var.g;
        b.e(serialDescriptor, 0, kSerializer, list);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), c060Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), c060Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), c060Var.d);
        b.A(4, c060Var.e, serialDescriptor);
        b.A(5, c060Var.f, serialDescriptor);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 6, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
