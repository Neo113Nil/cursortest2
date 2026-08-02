package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.OpenYbParams$ScreenType;
import ru.yandex.taxi.eatskit.dto.YbDepositType;

/* loaded from: classes5.dex */
public final /* synthetic */ class aa70 implements uxs {
    public static final aa70 a;
    private static final SerialDescriptor descriptor;

    static {
        aa70 aa70Var = new aa70();
        a = aa70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.OpenYbParams", aa70Var, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("depositMoney", true);
        pluginGeneratedSerialDescriptor.j("depositType", true);
        pluginGeneratedSerialDescriptor.j("openReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = da70.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(ms51.a), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = da70.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        OpenYbParams$ScreenType openYbParams$ScreenType = null;
        os51 os51Var = null;
        YbDepositType ybDepositType = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                openYbParams$ScreenType = (OpenYbParams$ScreenType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), openYbParams$ScreenType);
                i |= 1;
            } else if (v == 1) {
                os51Var = (os51) b.s(serialDescriptor, 1, ms51.a, os51Var);
                i |= 2;
            } else if (v == 2) {
                ybDepositType = (YbDepositType) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), ybDepositType);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new da70(i, openYbParams$ScreenType, os51Var, ybDepositType, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        da70 da70Var = (da70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = da70.e;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        OpenYbParams$ScreenType openYbParams$ScreenType = da70Var.a;
        String str = da70Var.d;
        YbDepositType ybDepositType = da70Var.c;
        os51 os51Var = da70Var.b;
        b.e(serialDescriptor, 0, kSerializer, openYbParams$ScreenType);
        if (b.F() || os51Var != null) {
            b.g(serialDescriptor, 1, ms51.a, os51Var);
        }
        if (b.F() || ybDepositType != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ybDepositType);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 3, auu0.a, str);
        }
        b.c(serialDescriptor);
    }
}
