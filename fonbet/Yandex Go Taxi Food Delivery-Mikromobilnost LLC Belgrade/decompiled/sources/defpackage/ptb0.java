package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class ptb0 implements uxs {
    public static final ptb0 a;
    private static final SerialDescriptor descriptor;

    static {
        ptb0 ptb0Var = new ptb0();
        a = ptb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiment.PinAbsenceExperiment", ptb0Var, 10);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("you_here_hint_bubble_tk", true);
        pluginGeneratedSerialDescriptor.j("you_here_hint_bubble_show_time", true);
        pluginGeneratedSerialDescriptor.j("your_address_on_main_title_tk", true);
        pluginGeneratedSerialDescriptor.j("to_update_address_location_diff_in_meters", true);
        pluginGeneratedSerialDescriptor.j("clarify_source_point_entrance_enabled", true);
        pluginGeneratedSerialDescriptor.j("update_source_point_on_summary", true);
        pluginGeneratedSerialDescriptor.j("sticky", true);
        pluginGeneratedSerialDescriptor.j("geo_tap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = rtb0.l;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), auu0Var, qke.n(h6wVar), auu0Var, h6wVar, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rtb0.l;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Map map = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    z4 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z5 = b.C(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    z6 = b.C(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new rtb0(i, z2, map, str, num, str2, i2, z3, z4, z5, z6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rtb0.l;
        if (b.F() || rtb0Var.b) {
            b.n(serialDescriptor, 0, rtb0Var.b);
        }
        if (b.F() || !jl40.l(rtb0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), rtb0Var.c);
        }
        if (b.F() || !jl40.l(rtb0Var.d, "")) {
            b.o(serialDescriptor, 2, rtb0Var.d);
        }
        if (b.F() || rtb0Var.e != null) {
            b.g(serialDescriptor, 3, h6w.a, rtb0Var.e);
        }
        if (b.F() || !jl40.l(rtb0Var.f, "")) {
            b.o(serialDescriptor, 4, rtb0Var.f);
        }
        if (b.F() || rtb0Var.g != 0) {
            b.A(5, rtb0Var.g, serialDescriptor);
        }
        if (b.F() || rtb0Var.h) {
            b.n(serialDescriptor, 6, rtb0Var.h);
        }
        if (b.F() || rtb0Var.i) {
            b.n(serialDescriptor, 7, rtb0Var.i);
        }
        if (b.F() || !rtb0Var.j) {
            b.n(serialDescriptor, 8, rtb0Var.j);
        }
        if (b.F() || rtb0Var.k) {
            b.n(serialDescriptor, 9, rtb0Var.k);
        }
        b.c(serialDescriptor);
    }
}
