package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class jnv implements uxs {
    public static final jnv a;
    private static final SerialDescriptor descriptor;

    static {
        jnv jnvVar = new jnv();
        a = jnvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("STORY_IS_VISIBLE", jnvVar, 3);
        pluginGeneratedSerialDescriptor.j("trackId", false);
        pluginGeneratedSerialDescriptor.j("controlType", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = nnv.d;
        return new KSerializer[]{qke.n(auu0.a), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = nnv.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType = null;
        InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                inMessage$StoryIsVisibleEvent$MiniStoryControlType = (InMessage$StoryIsVisibleEvent$MiniStoryControlType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), inMessage$StoryIsVisibleEvent$MiniStoryControlType);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                inMessage$StoryIsVisibleEvent$StoryNavigationType = (InMessage$StoryIsVisibleEvent$StoryNavigationType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), inMessage$StoryIsVisibleEvent$StoryNavigationType);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new nnv(i, str, inMessage$StoryIsVisibleEvent$MiniStoryControlType, inMessage$StoryIsVisibleEvent$StoryNavigationType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nnv nnvVar = (nnv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = nnv.d;
        b.g(serialDescriptor, 0, auu0.a, nnvVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), nnvVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), nnvVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
