package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.StopModalDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class i110 implements uxs {
    public static final i110 a;
    private static final SerialDescriptor descriptor;

    static {
        i110 i110Var = new i110();
        a = i110Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.MassTransitStopsExperiment", i110Var, 13);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("lineinfo_polling_period", true);
        pluginGeneratedSerialDescriptor.j("stopinfo_polling_period", true);
        pluginGeneratedSerialDescriptor.j("masstransit_map_style", true);
        pluginGeneratedSerialDescriptor.j("apply_map_style_on_main", true);
        pluginGeneratedSerialDescriptor.j("messagebox_enabled", true);
        pluginGeneratedSerialDescriptor.j("variants_style", true);
        pluginGeneratedSerialDescriptor.j("stops_scale", true);
        pluginGeneratedSerialDescriptor.j("stop_modal", true);
        pluginGeneratedSerialDescriptor.j("diff_time_limit", true);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("button_loading_delay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = k110.p;
        z96 z96Var = z96.a;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), pnzVar, pnzVar, auu0.a, z96Var, z96Var, i3yVarArr[7].getValue(), i3yVarArr[8].getValue(), qke.n(ggu0.a), h6w.a, j9u.a, pnzVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = k110.p;
        b.getClass();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        l9u l9uVar = null;
        StopModalDto stopModalDto = null;
        boolean z = true;
        Map map = null;
        List list = null;
        int i = 0;
        boolean z2 = false;
        Map map2 = null;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    map2 = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map2);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    j = b.f(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    j2 = b.f(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z4 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    stopModalDto = (StopModalDto) b.s(serialDescriptor, 9, ggu0.a, stopModalDto);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    i2 = b.h(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    i3yVarArr = i3yVarArr2;
                    l9uVar = (l9u) b.A(serialDescriptor, 11, j9u.a, l9uVar);
                    i |= 2048;
                    break;
                case 12:
                    j3 = b.f(serialDescriptor, 12);
                    i |= 4096;
                    continue;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new k110(i, z2, map2, j, j2, str, z3, z4, map, list, stopModalDto, i2, l9uVar, j3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.l9u.d) == false) goto L73;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        k110 k110Var = (k110) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = k110.p;
        if (b.F() || k110Var.b) {
            b.n(serialDescriptor, 0, k110Var.b);
        }
        if (b.F() || !jl40.l(k110Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), k110Var.c);
        }
        if (b.F() || k110Var.d != 60) {
            b.s(serialDescriptor, 2, k110Var.d);
        }
        if (b.F() || k110Var.e != 30) {
            b.s(serialDescriptor, 3, k110Var.e);
        }
        if (b.F() || !jl40.l(k110Var.f, "")) {
            b.o(serialDescriptor, 4, k110Var.f);
        }
        if (b.F() || k110Var.g) {
            b.n(serialDescriptor, 5, k110Var.g);
        }
        if (b.F() || k110Var.h) {
            b.n(serialDescriptor, 6, k110Var.h);
        }
        if (b.F() || !jl40.l(k110Var.i, b.f())) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), k110Var.i);
        }
        if (b.F() || !jl40.l(k110Var.j, EmptyList.a)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), k110Var.j);
        }
        if (b.F() || k110Var.k != null) {
            b.g(serialDescriptor, 9, ggu0.a, k110Var.k);
        }
        if (b.F() || k110Var.l != 0) {
            b.A(10, k110Var.l, serialDescriptor);
        }
        if (!b.F()) {
            l9u l9uVar = k110Var.m;
            l9u.Companion.getClass();
        }
        b.e(serialDescriptor, 11, j9u.a, k110Var.m);
        if (b.F() || k110Var.n != 2000) {
            b.s(serialDescriptor, 12, k110Var.n);
        }
        b.c(serialDescriptor);
    }
}
