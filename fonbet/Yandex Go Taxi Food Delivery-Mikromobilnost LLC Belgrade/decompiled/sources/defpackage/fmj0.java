package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class fmj0 implements uxs {
    public static final fmj0 a;
    private static final SerialDescriptor descriptor;

    static {
        fmj0 fmj0Var = new fmj0();
        a = fmj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsAddressInputAddressSelection", fmj0Var, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("address_view", true);
        pluginGeneratedSerialDescriptor.j("client_section", true);
        pluginGeneratedSerialDescriptor.j("source_section", true);
        pluginGeneratedSerialDescriptor.j("comment_section", true);
        pluginGeneratedSerialDescriptor.j("destination_section", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, imj0.a, lmj0.a, anj0.a, omj0.a, rmj0.a, cmj0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        kmj0 kmj0Var = null;
        nmj0 nmj0Var = null;
        cnj0 cnj0Var = null;
        qmj0 qmj0Var = null;
        tmj0 tmj0Var = null;
        emj0 emj0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    kmj0Var = (kmj0) b.A(serialDescriptor, 1, imj0.a, kmj0Var);
                    i |= 2;
                    break;
                case 2:
                    nmj0Var = (nmj0) b.A(serialDescriptor, 2, lmj0.a, nmj0Var);
                    i |= 4;
                    break;
                case 3:
                    cnj0Var = (cnj0) b.A(serialDescriptor, 3, anj0.a, cnj0Var);
                    i |= 8;
                    break;
                case 4:
                    qmj0Var = (qmj0) b.A(serialDescriptor, 4, omj0.a, qmj0Var);
                    i |= 16;
                    break;
                case 5:
                    tmj0Var = (tmj0) b.A(serialDescriptor, 5, rmj0.a, tmj0Var);
                    i |= 32;
                    break;
                case 6:
                    emj0Var = (emj0) b.A(serialDescriptor, 6, cmj0.a, emj0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new hmj0(i, str, kmj0Var, nmj0Var, cnj0Var, qmj0Var, tmj0Var, emj0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.nmj0.c) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.cnj0.b) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.qmj0.c) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.tmj0.b) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.emj0.b) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.kmj0.e) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        hmj0 hmj0Var = (hmj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        gmj0 gmj0Var = hmj0.Companion;
        if (b.F() || !jl40.l(hmj0Var.a, "")) {
            b.o(serialDescriptor, 0, hmj0Var.a);
        }
        if (!b.F()) {
            kmj0 kmj0Var = hmj0Var.b;
            kmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 1, imj0.a, hmj0Var.b);
        if (!b.F()) {
            nmj0 nmj0Var = hmj0Var.c;
            nmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, lmj0.a, hmj0Var.c);
        if (!b.F()) {
            cnj0 cnj0Var = hmj0Var.d;
            cnj0.Companion.getClass();
        }
        b.e(serialDescriptor, 3, anj0.a, hmj0Var.d);
        if (!b.F()) {
            qmj0 qmj0Var = hmj0Var.e;
            qmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 4, omj0.a, hmj0Var.e);
        if (!b.F()) {
            tmj0 tmj0Var = hmj0Var.f;
            tmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 5, rmj0.a, hmj0Var.f);
        if (!b.F()) {
            emj0 emj0Var = hmj0Var.g;
            emj0.Companion.getClass();
        }
        b.e(serialDescriptor, 6, cmj0.a, hmj0Var.g);
        b.c(serialDescriptor);
    }
}
