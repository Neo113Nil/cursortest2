package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class imj0 implements uxs {
    public static final imj0 a;
    private static final SerialDescriptor descriptor;

    static {
        imj0 imj0Var = new imj0();
        a = imj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsAddressInputAddressView", imj0Var, 4);
        pluginGeneratedSerialDescriptor.j("floor_input", true);
        pluginGeneratedSerialDescriptor.j("porch_input", true);
        pluginGeneratedSerialDescriptor.j("doorphone_input", true);
        pluginGeneratedSerialDescriptor.j("apartment_input", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        xmj0 xmj0Var = xmj0.a;
        return new KSerializer[]{xmj0Var, xmj0Var, xmj0Var, xmj0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zmj0 zmj0Var = null;
        zmj0 zmj0Var2 = null;
        zmj0 zmj0Var3 = null;
        zmj0 zmj0Var4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zmj0Var = (zmj0) b.A(serialDescriptor, 0, xmj0.a, zmj0Var);
                i |= 1;
            } else if (v == 1) {
                zmj0Var2 = (zmj0) b.A(serialDescriptor, 1, xmj0.a, zmj0Var2);
                i |= 2;
            } else if (v == 2) {
                zmj0Var3 = (zmj0) b.A(serialDescriptor, 2, xmj0.a, zmj0Var3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                zmj0Var4 = (zmj0) b.A(serialDescriptor, 3, xmj0.a, zmj0Var4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new kmj0(i, zmj0Var, zmj0Var2, zmj0Var3, zmj0Var4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        kmj0 kmj0Var = (kmj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        jmj0 jmj0Var = kmj0.Companion;
        boolean F = b.F();
        zmj0 zmj0Var = zmj0.b;
        if (!F) {
            zmj0 zmj0Var2 = kmj0Var.a;
            zmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 0, xmj0.a, kmj0Var.a);
        if (!b.F()) {
            zmj0 zmj0Var3 = kmj0Var.b;
            zmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 1, xmj0.a, kmj0Var.b);
        if (!b.F()) {
            zmj0 zmj0Var4 = kmj0Var.c;
            zmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, xmj0.a, kmj0Var.c);
        if (!b.F()) {
            zmj0 zmj0Var5 = kmj0Var.d;
            zmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 3, xmj0.a, kmj0Var.d);
        b.c(serialDescriptor);
    }
}
