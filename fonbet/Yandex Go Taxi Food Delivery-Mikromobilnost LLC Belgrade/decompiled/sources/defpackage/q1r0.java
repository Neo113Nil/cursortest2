package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes6.dex */
public final /* synthetic */ class q1r0 implements uxs {
    public static final q1r0 a;
    private static final SerialDescriptor descriptor;

    static {
        q1r0 q1r0Var = new q1r0();
        a = q1r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SessionSegmentMeta", q1r0Var, 3);
        pluginGeneratedSerialDescriptor.j("start", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j(UgcLiveVideoData.UgcLiveStatus.FINISHED, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(pnz.a), qke.n(auu0.a), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new s1r0(i, l, str, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s1r0 s1r0Var = (s1r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || s1r0Var.a != null) {
            b.g(serialDescriptor, 0, pnz.a, s1r0Var.a);
        }
        if (b.F() || s1r0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, s1r0Var.b);
        }
        if (b.F() || s1r0Var.c != null) {
            b.g(serialDescriptor, 2, z96.a, s1r0Var.c);
        }
        b.c(serialDescriptor);
    }
}
