package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.plus.api.dto.MenuType;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;

/* loaded from: classes9.dex */
public final /* synthetic */ class bsp0 implements uxs {
    public static final bsp0 a;
    private static final SerialDescriptor descriptor;

    static {
        bsp0 bsp0Var = new bsp0();
        a = bsp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.SdkStateResponse", bsp0Var, 8);
        pluginGeneratedSerialDescriptor.j("menu", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("plaque_v2", true);
        pluginGeneratedSerialDescriptor.j("menu_type", true);
        pluginGeneratedSerialDescriptor.j("menu_webview", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        pluginGeneratedSerialDescriptor.j("typed_screens", true);
        pluginGeneratedSerialDescriptor.j("server_data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(kk10.a), qke.n(j4u0.a), qke.n(tg20.a), qke.n((KSerializer) dsp0.i[3].getValue()), qke.n(co10.a), qke.n(pn11.a), qke.n(po11.a), qke.n(ltq0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dsp0.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        ntq0 ntq0Var = null;
        ok10 ok10Var = null;
        l4u0 l4u0Var = null;
        e0 e0Var = null;
        MenuType menuType = null;
        eo10 eo10Var = null;
        yn11 yn11Var = null;
        ro11 ro11Var = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ok10Var = (ok10) b.s(serialDescriptor, 0, kk10.a, ok10Var);
                    i |= 1;
                    break;
                case 1:
                    l4u0Var = (l4u0) b.s(serialDescriptor, 1, j4u0.a, l4u0Var);
                    i |= 2;
                    break;
                case 2:
                    e0Var = (e0) b.s(serialDescriptor, 2, tg20.a, e0Var);
                    i |= 4;
                    break;
                case 3:
                    menuType = (MenuType) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), menuType);
                    i |= 8;
                    break;
                case 4:
                    eo10Var = (eo10) b.s(serialDescriptor, 4, co10.a, eo10Var);
                    i |= 16;
                    break;
                case 5:
                    yn11Var = (yn11) b.s(serialDescriptor, 5, pn11.a, yn11Var);
                    i |= 32;
                    break;
                case 6:
                    ro11Var = (ro11) b.s(serialDescriptor, 6, po11.a, ro11Var);
                    i |= 64;
                    break;
                case 7:
                    ntq0Var = (ntq0) b.s(serialDescriptor, 7, ltq0.a, ntq0Var);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new dsp0(i, ok10Var, l4u0Var, e0Var, menuType, eo10Var, yn11Var, ro11Var, ntq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dsp0 dsp0Var = (dsp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dsp0.i;
        if (b.F() || dsp0Var.a != null) {
            b.g(serialDescriptor, 0, kk10.a, dsp0Var.a);
        }
        if (b.F() || dsp0Var.b != null) {
            b.g(serialDescriptor, 1, j4u0.a, dsp0Var.b);
        }
        if (b.F() || dsp0Var.c != null) {
            b.g(serialDescriptor, 2, tg20.a, dsp0Var.c);
        }
        if (b.F() || dsp0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), dsp0Var.d);
        }
        if (b.F() || dsp0Var.e != null) {
            b.g(serialDescriptor, 4, co10.a, dsp0Var.e);
        }
        if (b.F() || dsp0Var.f != null) {
            b.g(serialDescriptor, 5, pn11.a, dsp0Var.f);
        }
        if (b.F() || dsp0Var.g != null) {
            b.g(serialDescriptor, 6, po11.a, dsp0Var.g);
        }
        if (b.F() || dsp0Var.h != null) {
            b.g(serialDescriptor, 7, ltq0.a, dsp0Var.h);
        }
        b.c(serialDescriptor);
    }
}
