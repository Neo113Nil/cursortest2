package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes9.dex */
public final /* synthetic */ class imx0 implements uxs {
    public static final imx0 a;
    private static final SerialDescriptor descriptor;

    static {
        imx0 imx0Var = new imx0();
        a = imx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.TariffRequirementsParam", imx0Var, 2);
        pluginGeneratedSerialDescriptor.j("class", false);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) kmx0.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kmx0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        RequirementsParam requirementsParam = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                requirementsParam = (RequirementsParam) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), requirementsParam);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new kmx0(i, str, requirementsParam);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kmx0 kmx0Var = (kmx0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kmx0.c;
        b.o(serialDescriptor, 0, kmx0Var.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), kmx0Var.b);
        b.c(serialDescriptor);
    }
}
