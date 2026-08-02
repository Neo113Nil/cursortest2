package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class b8c implements uxs {
    public static final b8c a;
    private static final SerialDescriptor descriptor;

    static {
        b8c b8cVar = new b8c();
        a = b8cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.ClusterObject", b8cVar, 9);
        pluginGeneratedSerialDescriptor.j("badges", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("number", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.VENDOR, true);
        pluginGeneratedSerialDescriptor.j("parking_place", true);
        pluginGeneratedSerialDescriptor.j("onboarding_type", true);
        pluginGeneratedSerialDescriptor.j("battery", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{d8c.j[0].getValue(), auu0Var, b0t.a, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, of5.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d8c.j;
        b.getClass();
        Object obj = null;
        boolean z = true;
        qf5 qf5Var = null;
        List list = null;
        String str = null;
        zzs zzsVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    zzsVar = (zzs) b.A(serialDescriptor, 2, b0t.a, zzsVar);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str6 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    qf5Var = (qf5) b.A(serialDescriptor, 8, of5.a, qf5Var);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new d8c(i, list, str, zzsVar, str2, str3, str4, str5, str6, qf5Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.qf5.d) == false) goto L55;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        d8c d8cVar = (d8c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d8c.j;
        if (b.F() || !jl40.l(d8cVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), d8cVar.a);
        }
        if (b.F() || !jl40.l(d8cVar.b, "")) {
            b.o(serialDescriptor, 1, d8cVar.b);
        }
        if (b.F() || !jl40.l(d8cVar.c, zzs.f)) {
            b.e(serialDescriptor, 2, b0t.a, d8cVar.c);
        }
        if (b.F() || !jl40.l(d8cVar.d, "")) {
            b.o(serialDescriptor, 3, d8cVar.d);
        }
        if (b.F() || !jl40.l(d8cVar.e, "")) {
            b.o(serialDescriptor, 4, d8cVar.e);
        }
        if (b.F() || !jl40.l(d8cVar.f, "")) {
            b.o(serialDescriptor, 5, d8cVar.f);
        }
        if (b.F() || !jl40.l(d8cVar.g, "")) {
            b.o(serialDescriptor, 6, d8cVar.g);
        }
        if (b.F() || !jl40.l(d8cVar.h, "")) {
            b.o(serialDescriptor, 7, d8cVar.h);
        }
        if (!b.F()) {
            qf5 qf5Var = d8cVar.i;
            qf5.Companion.getClass();
        }
        b.e(serialDescriptor, 8, of5.a, d8cVar.i);
        b.c(serialDescriptor);
    }
}
