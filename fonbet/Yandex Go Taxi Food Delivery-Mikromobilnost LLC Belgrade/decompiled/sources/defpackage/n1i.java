package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class n1i implements uxs {
    public static final n1i a;
    private static final SerialDescriptor descriptor;

    static {
        n1i n1iVar = new n1i();
        a = n1iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.DeliveryContinueWithRequirementAlertDto", n1iVar, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("cancel_button_text", true);
        pluginGeneratedSerialDescriptor.j("continue_button_text", true);
        pluginGeneratedSerialDescriptor.j("conditions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = p1i.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p1i.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new p1i(i, str, str2, str3, str4, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p1i p1iVar = (p1i) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p1i.f;
        if (b.F() || !jl40.l(p1iVar.a, "")) {
            b.o(serialDescriptor, 0, p1iVar.a);
        }
        if (b.F() || !jl40.l(p1iVar.b, "")) {
            b.o(serialDescriptor, 1, p1iVar.b);
        }
        if (b.F() || !jl40.l(p1iVar.c, "")) {
            b.o(serialDescriptor, 2, p1iVar.c);
        }
        if (b.F() || !jl40.l(p1iVar.d, "")) {
            b.o(serialDescriptor, 3, p1iVar.d);
        }
        if (b.F() || !jl40.l(p1iVar.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), p1iVar.e);
        }
        b.c(serialDescriptor);
    }
}
