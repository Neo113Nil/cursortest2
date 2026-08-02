package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class cf40 implements uxs {
    public static final cf40 a;
    private static final SerialDescriptor descriptor;

    static {
        cf40 cf40Var = new cf40();
        a = cf40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainFilter", cf40Var, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("selected_state", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        kf40 kf40Var = kf40.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, kf40Var, kf40Var, if40.e};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        mf40 mf40Var = null;
        mf40 mf40Var2 = null;
        hf40 hf40Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    mf40Var = (mf40) b.A(serialDescriptor, 3, kf40.a, mf40Var);
                    i |= 8;
                    break;
                case 4:
                    mf40Var2 = (mf40) b.A(serialDescriptor, 4, kf40.a, mf40Var2);
                    i |= 16;
                    break;
                case 5:
                    hf40Var = (hf40) b.A(serialDescriptor, 5, if40.e, hf40Var);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ef40(i, str, str2, str3, mf40Var, mf40Var2, hf40Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        ef40 ef40Var = (ef40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        df40 df40Var = ef40.Companion;
        if (b.F() || !jl40.l(ef40Var.a, "")) {
            b.o(serialDescriptor, 0, ef40Var.a);
        }
        if (b.F() || !jl40.l(ef40Var.b, "")) {
            b.o(serialDescriptor, 1, ef40Var.b);
        }
        if (b.F() || !jl40.l(ef40Var.c, "")) {
            b.o(serialDescriptor, 2, ef40Var.c);
        }
        boolean F = b.F();
        mf40 mf40Var = mf40.d;
        if (!F) {
            mf40 mf40Var2 = ef40Var.d;
            mf40.Companion.getClass();
        }
        b.e(serialDescriptor, 3, kf40.a, ef40Var.d);
        if (!b.F()) {
            mf40 mf40Var3 = ef40Var.e;
            mf40.Companion.getClass();
        }
        b.e(serialDescriptor, 4, kf40.a, ef40Var.e);
        if (b.F() || !jl40.l(ef40Var.f, e5r.INSTANCE)) {
            b.e(serialDescriptor, 5, if40.e, ef40Var.f);
        }
        b.c(serialDescriptor);
    }
}
