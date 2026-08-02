package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;

/* loaded from: classes9.dex */
public final /* synthetic */ class js implements uxs {
    public static final js a;
    private static final SerialDescriptor descriptor;

    static {
        js jsVar = new js();
        a = jsVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.menu.button.ActionButtonDto", jsVar, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("states", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ls.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[2].getValue(), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ls.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ButtonAction buttonAction = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                buttonAction = (ButtonAction) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), buttonAction);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ls(i, str, str2, buttonAction, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ls lsVar = (ls) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ls.e;
        if (b.F() || lsVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, lsVar.a);
        }
        if (b.F() || lsVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, lsVar.b);
        }
        if (b.F() || lsVar.c != ButtonAction.UNSUPPORTED) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), lsVar.c);
        }
        if (b.F() || !jl40.l(lsVar.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), lsVar.d);
        }
        b.c(serialDescriptor);
    }
}
