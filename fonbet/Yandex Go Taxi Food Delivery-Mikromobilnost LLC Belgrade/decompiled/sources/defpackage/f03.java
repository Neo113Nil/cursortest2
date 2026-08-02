package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class f03 implements uxs {
    public static final f03 a;
    private static final SerialDescriptor descriptor;

    static {
        f03 f03Var = new f03();
        a = f03Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.ApplicationMobileCell", f03Var, 6);
        pluginGeneratedSerialDescriptor.j("mcc", true);
        pluginGeneratedSerialDescriptor.j("mnc", true);
        pluginGeneratedSerialDescriptor.j("cid", true);
        pluginGeneratedSerialDescriptor.j("lac", true);
        pluginGeneratedSerialDescriptor.j("signal_strength", true);
        pluginGeneratedSerialDescriptor.j("timestamp_millis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        KSerializer n = qke.n(h6wVar);
        KSerializer n2 = qke.n(h6wVar);
        pnz pnzVar = pnz.a;
        return new KSerializer[]{n, n2, qke.n(pnzVar), qke.n(h6wVar), qke.n(h6wVar), pnzVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        Integer num3 = null;
        Integer num4 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) b.s(serialDescriptor, 1, h6w.a, num2);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) b.s(serialDescriptor, 2, pnz.a, l);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) b.s(serialDescriptor, 3, h6w.a, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) b.s(serialDescriptor, 4, h6w.a, num4);
                    i |= 16;
                    break;
                case 5:
                    j = b.f(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new h03(i, num, num2, l, num3, num4, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h03 h03Var = (h03) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || h03Var.a != null) {
            b.g(serialDescriptor, 0, h6w.a, h03Var.a);
        }
        if (b.F() || h03Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, h03Var.b);
        }
        if (b.F() || h03Var.c != null) {
            b.g(serialDescriptor, 2, pnz.a, h03Var.c);
        }
        if (b.F() || h03Var.d != null) {
            b.g(serialDescriptor, 3, h6w.a, h03Var.d);
        }
        if (b.F() || h03Var.e != null) {
            b.g(serialDescriptor, 4, h6w.a, h03Var.e);
        }
        if (b.F() || h03Var.f != 0) {
            b.s(serialDescriptor, 5, h03Var.f);
        }
        b.c(serialDescriptor);
    }
}
