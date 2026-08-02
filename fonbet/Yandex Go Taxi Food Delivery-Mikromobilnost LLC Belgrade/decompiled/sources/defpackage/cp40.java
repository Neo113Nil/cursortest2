package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes9.dex */
public final /* synthetic */ class cp40 implements uxs {
    public static final cp40 a;
    private static final SerialDescriptor descriptor;

    static {
        cp40 cp40Var = new cp40();
        a = cp40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.MulticlassOptions", cp40Var, 4);
        pluginGeneratedSerialDescriptor.j("class", false);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, false);
        pluginGeneratedSerialDescriptor.j("verticals", false);
        pluginGeneratedSerialDescriptor.j("selected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ip40.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue()), i3yVarArr[2].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ip40.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Set set = null;
        RequirementsParam requirementsParam = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                set = (Set) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), set);
                i |= 1;
            } else if (v == 1) {
                requirementsParam = (RequirementsParam) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), requirementsParam);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ip40(i, set, requirementsParam, list, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ip40 ip40Var = (ip40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ip40.e;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        Set set = ip40Var.a;
        boolean z = ip40Var.d;
        b.e(serialDescriptor, 0, kSerializer, set);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ip40Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ip40Var.c);
        if (b.F() || z) {
            b.n(serialDescriptor, 3, z);
        }
        b.c(serialDescriptor);
    }
}
