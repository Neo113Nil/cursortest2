package defpackage;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import flex.theme.ThemedColor;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class mjh implements uxs {
    public static final mjh a;
    private static final SerialDescriptor descriptor;

    static {
        mjh mjhVar = new mjh();
        a = mjhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.scaffold.de.fault.DefaultScaffold", mjhVar, 1);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) ojh.b[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ojh.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        ThemedColor themedColor = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                themedColor = (ThemedColor) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), themedColor);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new ojh(i, themedColor);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, (KSerializer) ojh.b[0].getValue(), ((ojh) obj).a);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
