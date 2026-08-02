package defpackage;

import defpackage.qe40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class le40 implements uxs {
    public static final le40 a;
    private static final SerialDescriptor descriptor;

    static {
        le40 le40Var = new le40();
        a = le40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainDateSelector", le40Var, 5);
        pluginGeneratedSerialDescriptor.j("date_picker", true);
        pluginGeneratedSerialDescriptor.j("selected_date", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("selected_state", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        kf40 kf40Var = kf40.a;
        return new KSerializer[]{te40.a, auu0Var, kf40Var, kf40Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        qe40.b bVar = null;
        String str = null;
        mf40 mf40Var = null;
        mf40 mf40Var2 = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (qe40.b) b.A(serialDescriptor, 0, te40.a, bVar);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                mf40Var = (mf40) b.A(serialDescriptor, 2, kf40.a, mf40Var);
                i |= 4;
            } else if (v == 3) {
                mf40Var2 = (mf40) b.A(serialDescriptor, 3, kf40.a, mf40Var2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ne40(i, bVar, str, mf40Var, mf40Var2, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        ne40 ne40Var = (ne40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        me40 me40Var = ne40.Companion;
        if (b.F() || !jl40.l(ne40Var.a, new qe40.b(0))) {
            b.e(serialDescriptor, 0, te40.a, ne40Var.a);
        }
        if (b.F() || !jl40.l(ne40Var.b, "")) {
            b.o(serialDescriptor, 1, ne40Var.b);
        }
        boolean F = b.F();
        mf40 mf40Var = mf40.d;
        if (!F) {
            mf40 mf40Var2 = ne40Var.c;
            mf40.Companion.getClass();
        }
        b.e(serialDescriptor, 2, kf40.a, ne40Var.c);
        if (!b.F()) {
            mf40 mf40Var3 = ne40Var.d;
            mf40.Companion.getClass();
        }
        b.e(serialDescriptor, 3, kf40.a, ne40Var.d);
        if (b.F() || ne40Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, ne40Var.e);
        }
        b.c(serialDescriptor);
    }
}
