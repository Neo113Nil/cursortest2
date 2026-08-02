package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class eo41 implements uxs {
    public static final eo41 a;
    private static final SerialDescriptor descriptor;

    static {
        eo41 eo41Var = new eo41();
        a = eo41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.customview.views.webview.WebViewCustomProps", eo41Var, 5);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("onErrorAction", true);
        pluginGeneratedSerialDescriptor.j("onLoadComplete", true);
        pluginGeneratedSerialDescriptor.j("onLoadStarted", true);
        pluginGeneratedSerialDescriptor.j("tags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = io41.f;
        return new KSerializer[]{auu0.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = io41.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        hlk hlkVar = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                hlkVar = (hlk) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), hlkVar);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else if (v == 3) {
                list2 = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list3 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new io41(i, str, hlkVar, list, list2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        io41 io41Var = (io41) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = io41.f;
        String str = io41Var.a;
        List list = io41Var.e;
        List list2 = io41Var.d;
        List list3 = io41Var.c;
        hlk hlkVar = io41Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || hlkVar != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), hlkVar);
        }
        if (b.F() || list3 != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), list3);
        }
        if (b.F() || list2 != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), list2);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), list);
        }
        b.c(serialDescriptor);
    }
}
