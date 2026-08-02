package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class db41 implements uxs {
    public static final db41 a;
    private static final SerialDescriptor descriptor;

    static {
        db41 db41Var = new db41();
        a = db41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.logistics.care.web_view.impl.js.WebCameraConfig.CameraStep", db41Var, 9);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("photo_class", false);
        pluginGeneratedSerialDescriptor.j("show_overlay", true);
        pluginGeneratedSerialDescriptor.j("orientation", false);
        pluginGeneratedSerialDescriptor.j("available_controls", false);
        pluginGeneratedSerialDescriptor.j("camera", true);
        pluginGeneratedSerialDescriptor.j("overlay_config", true);
        pluginGeneratedSerialDescriptor.j("self_timer", true);
        pluginGeneratedSerialDescriptor.j("exposure", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = fb41.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, z96.a, auu0Var, i3yVarArr[4].getValue(), auu0Var, qke.n(wb41.a), qke.n(zb41.a), qke.n(nb41.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = fb41.j;
        b.getClass();
        pb41 pb41Var = null;
        boolean z = true;
        ec41 ec41Var = null;
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        List list = null;
        String str4 = null;
        yb41 yb41Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    yb41Var = (yb41) b.s(serialDescriptor, 6, wb41.a, yb41Var);
                    i |= 64;
                    break;
                case 7:
                    ec41Var = (ec41) b.s(serialDescriptor, 7, zb41.a, ec41Var);
                    i |= 128;
                    break;
                case 8:
                    pb41Var = (pb41) b.s(serialDescriptor, 8, nb41.a, pb41Var);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new fb41(i, str, str2, z2, str3, list, str4, yb41Var, ec41Var, pb41Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fb41 fb41Var = (fb41) obj;
        String str = fb41Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fb41.j;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        String str2 = fb41Var.b;
        pb41 pb41Var = fb41Var.i;
        ec41 ec41Var = fb41Var.h;
        yb41 yb41Var = fb41Var.g;
        String str3 = fb41Var.f;
        boolean z = fb41Var.c;
        b.o(serialDescriptor, 1, str2);
        if (b.F() || z) {
            b.n(serialDescriptor, 2, z);
        }
        b.o(serialDescriptor, 3, fb41Var.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), fb41Var.e);
        if (b.F() || !jl40.l(str3, "back")) {
            b.o(serialDescriptor, 5, str3);
        }
        if (b.F() || yb41Var != null) {
            b.g(serialDescriptor, 6, wb41.a, yb41Var);
        }
        if (b.F() || ec41Var != null) {
            b.g(serialDescriptor, 7, zb41.a, ec41Var);
        }
        if (b.F() || pb41Var != null) {
            b.g(serialDescriptor, 8, nb41.a, pb41Var);
        }
        b.c(serialDescriptor);
    }
}
