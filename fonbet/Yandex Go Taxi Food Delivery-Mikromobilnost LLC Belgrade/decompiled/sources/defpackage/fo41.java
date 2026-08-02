package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.AllowNewTabType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class fo41 implements uxs {
    public static final fo41 a;
    private static final SerialDescriptor descriptor;

    static {
        fo41 fo41Var = new fo41();
        a = fo41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.WebViewCustomProps", fo41Var, 10);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("allowNewTabType", true);
        pluginGeneratedSerialDescriptor.j("authRequired", true);
        pluginGeneratedSerialDescriptor.j("colors", true);
        pluginGeneratedSerialDescriptor.j("enableFullUrlLogging", true);
        pluginGeneratedSerialDescriptor.j("enableHtmlSize", true);
        pluginGeneratedSerialDescriptor.j("onErrorAction", true);
        pluginGeneratedSerialDescriptor.j("onLoadComplete", true);
        pluginGeneratedSerialDescriptor.j("onPageLoadStartedAction", true);
        pluginGeneratedSerialDescriptor.j("onPostMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = jo41.k;
        KSerializer n = qke.n((KSerializer) i3yVarArr[1].getValue());
        z96 z96Var = z96.a;
        KSerializer n2 = qke.n(jm41.a);
        KSerializer n3 = qke.n(z96Var);
        KSerializer n4 = qke.n(z96Var);
        elk elkVar = elk.a;
        return new KSerializer[]{auu0.a, n, z96Var, n2, n3, n4, qke.n(elkVar), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(elkVar), qke.n((KSerializer) i3yVarArr[9].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = jo41.k;
        b.getClass();
        List list = null;
        ilk ilkVar = null;
        boolean z = true;
        List list2 = null;
        int i = 0;
        String str = null;
        AllowNewTabType allowNewTabType = null;
        boolean z2 = false;
        lm41 lm41Var = null;
        Boolean bool = null;
        Boolean bool2 = null;
        ilk ilkVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    allowNewTabType = (AllowNewTabType) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), allowNewTabType);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    lm41Var = (lm41) b.s(serialDescriptor, 3, jm41.a, lm41Var);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    bool2 = (Boolean) b.s(serialDescriptor, 5, z96.a, bool2);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    ilkVar2 = (ilk) b.s(serialDescriptor, 6, elk.a, ilkVar2);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    list2 = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list2);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    ilkVar = (ilk) b.s(serialDescriptor, 8, elk.a, ilkVar);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.s(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new jo41(i, str, allowNewTabType, z2, lm41Var, bool, bool2, ilkVar2, list2, ilkVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jo41 jo41Var = (jo41) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = jo41.k;
        String str = jo41Var.a;
        List list = jo41Var.j;
        ilk ilkVar = jo41Var.i;
        List list2 = jo41Var.h;
        ilk ilkVar2 = jo41Var.g;
        Boolean bool = jo41Var.f;
        Boolean bool2 = jo41Var.e;
        lm41 lm41Var = jo41Var.d;
        boolean z = jo41Var.c;
        AllowNewTabType allowNewTabType = jo41Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || allowNewTabType != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), allowNewTabType);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 2, z);
        }
        if (b.F() || lm41Var != null) {
            b.g(serialDescriptor, 3, jm41.a, lm41Var);
        }
        if (b.F() || bool2 != null) {
            b.g(serialDescriptor, 4, z96.a, bool2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 5, z96.a, bool);
        }
        if (b.F() || ilkVar2 != null) {
            b.g(serialDescriptor, 6, elk.a, ilkVar2);
        }
        if (b.F() || list2 != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), list2);
        }
        if (b.F() || ilkVar != null) {
            b.g(serialDescriptor, 8, elk.a, ilkVar);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), list);
        }
        b.c(serialDescriptor);
    }
}
