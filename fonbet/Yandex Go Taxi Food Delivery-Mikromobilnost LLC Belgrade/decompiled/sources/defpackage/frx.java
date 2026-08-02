package defpackage;

import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.theme.ThemedColor;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class frx implements uxs {
    public static final frx a;
    private static final SerialDescriptor descriptor;

    static {
        frx frxVar = new frx();
        a = frxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.divkit.scaffold.LandscapeSettings", frxVar, 2);
        pluginGeneratedSerialDescriptor.j("horizontalPadding", true);
        pluginGeneratedSerialDescriptor.j("paddingColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ayk.a), qke.n((KSerializer) hrx.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = hrx.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        DivKitScaffoldPadding divKitScaffoldPadding = null;
        ThemedColor themedColor = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                divKitScaffoldPadding = (DivKitScaffoldPadding) b.s(serialDescriptor, 0, ayk.a, divKitScaffoldPadding);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                themedColor = (ThemedColor) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), themedColor);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new hrx(i, divKitScaffoldPadding, themedColor);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hrx hrxVar = (hrx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = hrx.c;
        if (b.F() || hrxVar.a != null) {
            b.g(serialDescriptor, 0, ayk.a, hrxVar.a);
        }
        if (b.F() || hrxVar.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), hrxVar.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
