package defpackage;

import defpackage.qd0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class od0 implements uxs {
    public static final od0 a;
    private static final SerialDescriptor descriptor;

    static {
        od0 od0Var = new od0();
        a = od0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiment.AddFavoriteScreenModalExperiment.AddFavoritesConfig", od0Var, 10);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title_tk", true);
        pluginGeneratedSerialDescriptor.j("save_button_tk", true);
        pluginGeneratedSerialDescriptor.j("no_favorite_type_message_tk", true);
        pluginGeneratedSerialDescriptor.j("new_favorite_type_button_tk", true);
        pluginGeneratedSerialDescriptor.j("new_favorite_type_placeholder_tk", true);
        pluginGeneratedSerialDescriptor.j("default_subtitle_tk", true);
        pluginGeneratedSerialDescriptor.j("address_title_for_current_location_tk", true);
        pluginGeneratedSerialDescriptor.j("map_locked", true);
        pluginGeneratedSerialDescriptor.j("notification_after_save", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, z96.a, sd0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        qd0.b bVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
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
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str8 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z2 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    bVar = (qd0.b) b.A(serialDescriptor, 9, sd0.a, bVar);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new qd0.a(i, str, str2, str3, str4, str5, str6, str7, str8, z2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (defpackage.jl40.l(r0, qd0.b.c) == false) goto L61;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        qd0.a aVar = (qd0.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        pd0 pd0Var = qd0.a.Companion;
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, "")) {
            b.o(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, "")) {
            b.o(serialDescriptor, 4, aVar.e);
        }
        if (b.F() || !jl40.l(aVar.f, "")) {
            b.o(serialDescriptor, 5, aVar.f);
        }
        if (b.F() || !jl40.l(aVar.g, "")) {
            b.o(serialDescriptor, 6, aVar.g);
        }
        if (b.F() || !jl40.l(aVar.h, "")) {
            b.o(serialDescriptor, 7, aVar.h);
        }
        if (b.F() || aVar.i) {
            b.n(serialDescriptor, 8, aVar.i);
        }
        if (!b.F()) {
            qd0.b bVar = aVar.j;
            qd0.b.Companion.getClass();
        }
        b.e(serialDescriptor, 9, sd0.a, aVar.j);
        b.c(serialDescriptor);
    }
}
