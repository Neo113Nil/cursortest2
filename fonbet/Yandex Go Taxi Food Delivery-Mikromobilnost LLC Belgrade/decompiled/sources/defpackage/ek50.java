package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class ek50 implements uxs {
    public static final ek50 a;
    private static final SerialDescriptor descriptor;

    static {
        ek50 ek50Var = new ek50();
        a = ek50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.NearestDriversParam", ek50Var, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j(IssuingDistributionPointExtension.POINT, false);
        pluginGeneratedSerialDescriptor.j("classes", false);
        pluginGeneratedSerialDescriptor.j("current_drivers", false);
        pluginGeneratedSerialDescriptor.j("simplify", false);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = gk50.h;
        return new KSerializer[]{auu0.a, b0t.a, i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), z96.a, qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(nka0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gk50.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        zzs zzsVar = null;
        Set set = null;
        List list = null;
        RequirementsParam requirementsParam = null;
        pka0 pka0Var = null;
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
                    zzsVar = (zzs) b.A(serialDescriptor, 1, b0t.a, zzsVar);
                    i |= 2;
                    break;
                case 2:
                    set = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    requirementsParam = (RequirementsParam) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), requirementsParam);
                    i |= 32;
                    break;
                case 6:
                    pka0Var = (pka0) b.s(serialDescriptor, 6, nka0.a, pka0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new gk50(i, str, zzsVar, set, list, z2, requirementsParam, pka0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gk50 gk50Var = (gk50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gk50.h;
        b.o(serialDescriptor, 0, gk50Var.a);
        b.e(serialDescriptor, 1, b0t.a, gk50Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), gk50Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), gk50Var.d);
        b.n(serialDescriptor, 4, gk50Var.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), gk50Var.f);
        b.g(serialDescriptor, 6, nka0.a, gk50Var.g);
        b.c(serialDescriptor);
    }
}
