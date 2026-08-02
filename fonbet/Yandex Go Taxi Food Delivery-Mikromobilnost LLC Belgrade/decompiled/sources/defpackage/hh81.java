package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class hh81 implements uxs {
    public static final hh81 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        hh81 hh81Var = new hh81();
        a = hh81Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", hh81Var, 5);
        pluginGeneratedSerialDescriptor.j("adapter", true);
        pluginGeneratedSerialDescriptor.j("network_name", false);
        pluginGeneratedSerialDescriptor.j("bidding_parameters", false);
        pluginGeneratedSerialDescriptor.j("network_ad_unit_id", true);
        pluginGeneratedSerialDescriptor.j("network_ad_unit_id_name", true);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = fr81.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, i3yVarArr[2].getValue(), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = fr81.f;
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b2.s(pluginGeneratedSerialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = b2.k(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                list = (List) b2.A(pluginGeneratedSerialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else if (v == 3) {
                str3 = (String) b2.s(pluginGeneratedSerialDescriptor, 3, auu0.a, str3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str4 = (String) b2.s(pluginGeneratedSerialDescriptor, 4, auu0.a, str4);
                i |= 16;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new fr81(i, str, str2, str3, str4, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fr81 fr81Var = (fr81) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = fr81.f;
        if (b2.F() || fr81Var.a != null) {
            b2.g(pluginGeneratedSerialDescriptor, 0, auu0.a, fr81Var.a);
        }
        String str = fr81Var.b;
        String str2 = fr81Var.e;
        String str3 = fr81Var.d;
        b2.o(pluginGeneratedSerialDescriptor, 1, str);
        b2.e(pluginGeneratedSerialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), fr81Var.c);
        if (b2.F() || str3 != null) {
            b2.g(pluginGeneratedSerialDescriptor, 3, auu0.a, str3);
        }
        if (b2.F() || str2 != null) {
            b2.g(pluginGeneratedSerialDescriptor, 4, auu0.a, str2);
        }
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
