package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ir40;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class er40 implements uxs {
    public static final er40 a;
    private static final SerialDescriptor descriptor;

    static {
        er40 er40Var = new er40();
        a = er40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.multiexit.MultiexitSettingsExperiment", er40Var, 8);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("main_screen_drag_max_distance", true);
        pluginGeneratedSerialDescriptor.j("main_screen_shown_notification_min_distance", true);
        pluginGeneratedSerialDescriptor.j("auto_selection_max_distance", true);
        pluginGeneratedSerialDescriptor.j("remember_point_max_distance", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("main_screen_notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ir40.j;
        h6w h6wVar = h6w.a;
        gr40 gr40Var = gr40.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), gr40Var, gr40Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ir40.j;
        b.getClass();
        Object obj = null;
        boolean z = true;
        ir40.a aVar = null;
        Map map = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        ir40.a aVar2 = null;
        int i = 0;
        boolean z2 = false;
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
                    num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) b.s(serialDescriptor, 3, h6w.a, num2);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) b.s(serialDescriptor, 4, h6w.a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) b.s(serialDescriptor, 5, h6w.a, num4);
                    i |= 32;
                    break;
                case 6:
                    aVar2 = (ir40.a) b.A(serialDescriptor, 6, gr40.a, aVar2);
                    i |= 64;
                    break;
                case 7:
                    aVar = (ir40.a) b.A(serialDescriptor, 7, gr40.a, aVar);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ir40(i, z2, map, num, num2, num3, num4, aVar2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ir40 ir40Var = (ir40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ir40.j;
        if (b.F() || ir40Var.b) {
            b.n(serialDescriptor, 0, ir40Var.b);
        }
        if (b.F() || !jl40.l(ir40Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ir40Var.c);
        }
        if (b.F() || ir40Var.d != null) {
            b.g(serialDescriptor, 2, h6w.a, ir40Var.d);
        }
        if (b.F() || ir40Var.e != null) {
            b.g(serialDescriptor, 3, h6w.a, ir40Var.e);
        }
        if (b.F() || ir40Var.f != null) {
            b.g(serialDescriptor, 4, h6w.a, ir40Var.f);
        }
        if (b.F() || ir40Var.g != null) {
            b.g(serialDescriptor, 5, h6w.a, ir40Var.g);
        }
        if (b.F() || !jl40.l(ir40Var.h, new ir40.a(0))) {
            b.e(serialDescriptor, 6, gr40.a, ir40Var.h);
        }
        if (b.F() || !jl40.l(ir40Var.i, new ir40.a(0))) {
            b.e(serialDescriptor, 7, gr40.a, ir40Var.i);
        }
        b.c(serialDescriptor);
    }
}
