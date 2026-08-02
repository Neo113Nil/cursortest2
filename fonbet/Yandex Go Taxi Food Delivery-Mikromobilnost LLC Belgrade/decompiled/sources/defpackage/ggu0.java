package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.StopModalDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class ggu0 implements uxs {
    public static final ggu0 a;
    private static final SerialDescriptor descriptor;

    static {
        ggu0 ggu0Var = new ggu0();
        a = ggu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.StopModalDto", ggu0Var, 4);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("address_resolving_error_key", true);
        pluginGeneratedSerialDescriptor.j("arriving_title_key", true);
        pluginGeneratedSerialDescriptor.j("max_walking_duration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{StopModalDto.e[0].getValue(), auu0Var, auu0Var, qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = StopModalDto.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new StopModalDto(i, num, str, str2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        StopModalDto stopModalDto = (StopModalDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = StopModalDto.e;
        if (b.F() || !jl40.l(stopModalDto.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), stopModalDto.a);
        }
        if (b.F() || !jl40.l(stopModalDto.b, "")) {
            b.o(serialDescriptor, 1, stopModalDto.b);
        }
        if (b.F() || !jl40.l(stopModalDto.c, "")) {
            b.o(serialDescriptor, 2, stopModalDto.c);
        }
        if (b.F() || stopModalDto.d != null) {
            b.g(serialDescriptor, 3, h6w.a, stopModalDto.d);
        }
        b.c(serialDescriptor);
    }
}
