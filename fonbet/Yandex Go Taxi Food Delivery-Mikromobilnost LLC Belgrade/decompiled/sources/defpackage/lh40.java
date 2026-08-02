package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class lh40 implements uxs {
    public static final lh40 a;
    private static final SerialDescriptor descriptor;

    static {
        lh40 lh40Var = new lh40();
        a = lh40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainStations", lh40Var, 2);
        pluginGeneratedSerialDescriptor.j("starting_station", true);
        pluginGeneratedSerialDescriptor.j("destination_station", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        ih40 ih40Var = ih40.a;
        return new KSerializer[]{ih40Var, ih40Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        kh40 kh40Var = null;
        kh40 kh40Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                kh40Var = (kh40) b.A(serialDescriptor, 0, ih40.a, kh40Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                kh40Var2 = (kh40) b.A(serialDescriptor, 1, ih40.a, kh40Var2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new nh40(i, kh40Var, kh40Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        nh40 nh40Var = (nh40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        mh40 mh40Var = nh40.Companion;
        boolean F = b.F();
        kh40 kh40Var = kh40.d;
        if (!F) {
            kh40 kh40Var2 = nh40Var.a;
            kh40.Companion.getClass();
        }
        b.e(serialDescriptor, 0, ih40.a, nh40Var.a);
        if (!b.F()) {
            kh40 kh40Var3 = nh40Var.b;
            kh40.Companion.getClass();
        }
        b.e(serialDescriptor, 1, ih40.a, nh40Var.b);
        b.c(serialDescriptor);
    }
}
