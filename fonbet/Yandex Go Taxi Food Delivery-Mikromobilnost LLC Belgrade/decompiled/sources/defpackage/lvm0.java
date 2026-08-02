package defpackage;

import defpackage.ovm0;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class lvm0 implements uxs {
    public static final lvm0 a;
    private static final SerialDescriptor descriptor;

    static {
        lvm0 lvm0Var = new lvm0();
        a = lvm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto", lvm0Var, 11);
        pluginGeneratedSerialDescriptor.j("active_pass_id", true);
        pluginGeneratedSerialDescriptor.j("purchase_pass_id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("settings_section", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("upsale_longest_pass", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("unfreeze_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ovm0.l;
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        KSerializer n2 = qke.n(mvm0.a);
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[5].getValue());
        KSerializer n4 = qke.n(w7sVar);
        KSerializer n5 = qke.n(uwm0.a);
        pvm0 pvm0Var = pvm0.a;
        KSerializer n6 = qke.n(pvm0Var);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, w7sVar, n, n2, n3, wvm0.a, n4, n5, pvm0Var, n6};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = ovm0.l;
        b.getClass();
        ovm0.b bVar = null;
        ovm0.b bVar2 = null;
        ovm0.e eVar = null;
        boolean z2 = true;
        FormattedText formattedText = null;
        int i = 0;
        String str = null;
        String str2 = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        ovm0.a aVar = null;
        List list = null;
        ovm0.d dVar = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    i3yVarArr2 = i3yVarArr2;
                    continue;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    aVar = (ovm0.a) b.s(serialDescriptor, 4, mvm0.a, aVar);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    dVar = (ovm0.d) b.A(serialDescriptor, 6, wvm0.a, dVar);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    formattedText = (FormattedText) b.s(serialDescriptor, 7, w7s.a, formattedText);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    eVar = (ovm0.e) b.s(serialDescriptor, 8, uwm0.a, eVar);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    bVar2 = (ovm0.b) b.A(serialDescriptor, 9, pvm0.a, bVar2);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    bVar = (ovm0.b) b.s(serialDescriptor, 10, pvm0.a, bVar);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new ovm0(i, str, str2, formattedText2, formattedText3, aVar, list, dVar, formattedText, eVar, bVar2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ovm0 ovm0Var = (ovm0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ovm0.l;
        if (b.F() || !jl40.l(ovm0Var.a, "")) {
            b.o(serialDescriptor, 0, ovm0Var.a);
        }
        if (b.F() || !jl40.l(ovm0Var.b, "")) {
            b.o(serialDescriptor, 1, ovm0Var.b);
        }
        if (b.F() || !jl40.l(ovm0Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, ovm0Var.c);
        }
        if (b.F() || ovm0Var.d != null) {
            b.g(serialDescriptor, 3, w7s.a, ovm0Var.d);
        }
        if (b.F() || ovm0Var.e != null) {
            b.g(serialDescriptor, 4, mvm0.a, ovm0Var.e);
        }
        if (b.F() || ovm0Var.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), ovm0Var.f);
        }
        if (b.F() || !jl40.l(ovm0Var.g, new ovm0.d(0))) {
            b.e(serialDescriptor, 6, wvm0.a, ovm0Var.g);
        }
        if (b.F() || ovm0Var.h != null) {
            b.g(serialDescriptor, 7, w7s.a, ovm0Var.h);
        }
        if (b.F() || ovm0Var.i != null) {
            b.g(serialDescriptor, 8, uwm0.a, ovm0Var.i);
        }
        if (b.F() || !jl40.l(ovm0Var.j, new ovm0.b(0))) {
            b.e(serialDescriptor, 9, pvm0.a, ovm0Var.j);
        }
        if (b.F() || ovm0Var.k != null) {
            b.g(serialDescriptor, 10, pvm0.a, ovm0Var.k);
        }
        b.c(serialDescriptor);
    }
}
