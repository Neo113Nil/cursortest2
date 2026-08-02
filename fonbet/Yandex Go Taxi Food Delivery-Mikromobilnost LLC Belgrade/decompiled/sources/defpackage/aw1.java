package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.persuggest.api.AlternativeActionType;

/* loaded from: classes9.dex */
public final /* synthetic */ class aw1 implements uxs {
    public static final aw1 a;
    private static final SerialDescriptor descriptor;

    static {
        aw1 aw1Var = new aw1();
        a = aw1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.AlternativeAction", aw1Var, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("oid", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("suggest_reqid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{cw1.e[0].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cw1.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        AlternativeActionType alternativeActionType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                alternativeActionType = (AlternativeActionType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), alternativeActionType);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new cw1(i, alternativeActionType, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cw1 cw1Var = (cw1) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cw1.e;
        if (b.F() || cw1Var.a != AlternativeActionType.ORGANIZATION_CARD) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), cw1Var.a);
        }
        if (b.F() || cw1Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, cw1Var.b);
        }
        if (b.F() || cw1Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, cw1Var.c);
        }
        if (b.F() || cw1Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, cw1Var.d);
        }
        b.c(serialDescriptor);
    }
}
