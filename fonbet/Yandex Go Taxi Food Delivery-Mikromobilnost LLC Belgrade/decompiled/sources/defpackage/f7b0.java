package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class f7b0 implements uxs {
    public static final f7b0 a;
    private static final SerialDescriptor descriptor;

    static {
        f7b0 f7b0Var = new f7b0();
        a = f7b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.data.model.PersonalStateResponse", f7b0Var, 9);
        pluginGeneratedSerialDescriptor.j("is_fallback", true);
        pluginGeneratedSerialDescriptor.j("selected_class", true);
        pluginGeneratedSerialDescriptor.j("revision_id", true);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("multiclass_options", true);
        pluginGeneratedSerialDescriptor.j("selected_vertical", true);
        pluginGeneratedSerialDescriptor.j("selected_options_in_verticals", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = j7b0.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, qke.n(auu0Var), h6w.a, i3yVarArr[3].getValue(), qke.n(au.a), i3yVarArr[5].getValue(), qke.n(jp40.a), qke.n(auu0Var), i3yVarArr[8].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j7b0.j;
        b.getClass();
        Map map = null;
        boolean z = true;
        String str = null;
        int i = 0;
        boolean z2 = false;
        String str2 = null;
        int i2 = 0;
        d580 d580Var = null;
        cu cuVar = null;
        List list = null;
        np40 np40Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d580Var = (d580) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), d580Var);
                    i |= 8;
                    break;
                case 4:
                    cuVar = (cu) b.s(serialDescriptor, 4, au.a, cuVar);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    np40Var = (np40) b.s(serialDescriptor, 6, jp40.a, np40Var);
                    i |= 64;
                    break;
                case 7:
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                case 8:
                    map = (Map) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), map);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new j7b0(i, z2, str2, i2, d580Var, cuVar, list, np40Var, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j7b0 j7b0Var = (j7b0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j7b0.j;
        int i = 0;
        if (b.F() || j7b0Var.a) {
            b.n(serialDescriptor, 0, j7b0Var.a);
        }
        if (b.F() || j7b0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, j7b0Var.b);
        }
        if (b.F() || j7b0Var.c != 0) {
            b.A(2, j7b0Var.c, serialDescriptor);
        }
        if (b.F() || !jl40.l(j7b0Var.d, new d580(i))) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), j7b0Var.d);
        }
        if (b.F() || j7b0Var.e != null) {
            b.g(serialDescriptor, 4, au.a, j7b0Var.e);
        }
        if (b.F() || !jl40.l(j7b0Var.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), j7b0Var.f);
        }
        if (b.F() || j7b0Var.g != null) {
            b.g(serialDescriptor, 6, jp40.a, j7b0Var.g);
        }
        if (b.F() || j7b0Var.h != null) {
            b.g(serialDescriptor, 7, auu0.a, j7b0Var.h);
        }
        if (b.F() || !jl40.l(j7b0Var.i, new HashMap())) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), j7b0Var.i);
        }
        b.c(serialDescriptor);
    }
}
