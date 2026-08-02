package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class mko implements uxs {
    public static final mko a;
    private static final SerialDescriptor descriptor;

    static {
        mko mkoVar = new mko();
        a = mkoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.executeonwidgetdivaction.ExecuteOnWidgetDivAction", mkoVar, 7);
        pluginGeneratedSerialDescriptor.j("log_id", false);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("widget_id", false);
        pluginGeneratedSerialDescriptor.j("on_fail", true);
        pluginGeneratedSerialDescriptor.j("on_success", true);
        pluginGeneratedSerialDescriptor.j("on_widget_not_found", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = oko.h;
        KSerializer n = qke.n((KSerializer) i3yVarArr[3].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[4].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[5].getValue());
        KSerializer n4 = qke.n(mdx.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, n, n2, n3, n4};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = oko.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        vm50 vm50Var3 = null;
        c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    vm50Var = (vm50) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), vm50Var);
                    i |= 8;
                    break;
                case 4:
                    vm50Var2 = (vm50) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), vm50Var2);
                    i |= 16;
                    break;
                case 5:
                    vm50Var3 = (vm50) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), vm50Var3);
                    i |= 32;
                    break;
                case 6:
                    cVar = (c) b.s(serialDescriptor, 6, mdx.a, cVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new oko(i, str, str2, str3, vm50Var, vm50Var2, vm50Var3, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        oko okoVar = (oko) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = oko.h;
        String str = okoVar.a;
        c cVar = okoVar.g;
        vm50 vm50Var = okoVar.f;
        vm50 vm50Var2 = okoVar.e;
        vm50 vm50Var3 = okoVar.d;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, okoVar.b);
        b.o(serialDescriptor, 2, okoVar.c);
        if (b.F() || vm50Var3 != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), vm50Var3);
        }
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), vm50Var);
        }
        if (b.F() || cVar != null) {
            b.g(serialDescriptor, 6, mdx.a, cVar);
        }
        b.c(serialDescriptor);
    }
}
