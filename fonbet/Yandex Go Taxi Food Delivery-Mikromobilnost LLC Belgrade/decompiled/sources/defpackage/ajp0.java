package defpackage;

import flex.feature.sections.action.ScrollPositionSurrogate;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class ajp0 implements uxs {
    public static final ajp0 a;
    private static final SerialDescriptor descriptor;

    static {
        ajp0 ajp0Var = new ajp0();
        a = ajp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.sections.action.ScrollToItemActionSerializer.ScrollToItemActionSurrogate", ajp0Var, 5);
        pluginGeneratedSerialDescriptor.j("itemId", false);
        pluginGeneratedSerialDescriptor.j("scrollPosition", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("offset", true);
        pluginGeneratedSerialDescriptor.j("animated", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cjp0.f;
        return new KSerializer[]{auu0.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), h6w.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cjp0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        String str = null;
        ScrollPositionSurrogate scrollPositionSurrogate = null;
        ScrollPositionSurrogate scrollPositionSurrogate2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                scrollPositionSurrogate = (ScrollPositionSurrogate) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), scrollPositionSurrogate);
                i |= 2;
            } else if (v == 2) {
                scrollPositionSurrogate2 = (ScrollPositionSurrogate) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), scrollPositionSurrogate2);
                i |= 4;
            } else if (v == 3) {
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new cjp0(i, str, scrollPositionSurrogate, scrollPositionSurrogate2, i2, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cjp0 cjp0Var = (cjp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cjp0.f;
        String str = cjp0Var.a;
        boolean z = cjp0Var.e;
        int i = cjp0Var.d;
        ScrollPositionSurrogate scrollPositionSurrogate = cjp0Var.c;
        ScrollPositionSurrogate scrollPositionSurrogate2 = cjp0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || scrollPositionSurrogate2 != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), scrollPositionSurrogate2);
        }
        if (b.F() || scrollPositionSurrogate != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), scrollPositionSurrogate);
        }
        if (b.F() || i != 0) {
            b.A(3, i, serialDescriptor);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 4, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
