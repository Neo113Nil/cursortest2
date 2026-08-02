package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NativeVibrateRequest$VibrateType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class jt80 implements uxs {
    public static final jt80 a;
    private static final SerialDescriptor descriptor;

    static {
        jt80 jt80Var = new jt80();
        a = jt80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("NATIVE_VIBRATE_REQUEST", jt80Var, 2);
        pluginGeneratedSerialDescriptor.j("trackId", true);
        pluginGeneratedSerialDescriptor.j("vibrateType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), lt80.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lt80.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                outMessage$NativeVibrateRequest$VibrateType = (OutMessage$NativeVibrateRequest$VibrateType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), outMessage$NativeVibrateRequest$VibrateType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new lt80(i, str, outMessage$NativeVibrateRequest$VibrateType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lt80 lt80Var = (lt80) obj;
        String str = lt80Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = lt80.c;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), lt80Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
