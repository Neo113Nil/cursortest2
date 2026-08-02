package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ft80 implements uxs {
    public static final ft80 a;
    private static final SerialDescriptor descriptor;

    static {
        ft80 ft80Var = new ft80();
        a = ft80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MINI_STORY_IS_SHOWN", ft80Var, 3);
        pluginGeneratedSerialDescriptor.j("trackId", true);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = it80.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = it80.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType = (OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new it80(i, str, str2, outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        it80 it80Var = (it80) obj;
        String str = it80Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = it80.d;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        String str2 = it80Var.b;
        OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType = it80Var.c;
        b.o(serialDescriptor, 1, str2);
        if (b.F() || outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
