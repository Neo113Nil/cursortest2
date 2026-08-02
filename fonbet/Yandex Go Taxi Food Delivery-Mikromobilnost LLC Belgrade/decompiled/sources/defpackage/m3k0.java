package defpackage;

import com.yandex.plus.pay.data.mb.dto.RichTextDto$Item$Type;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class m3k0 implements uxs {
    public static final m3k0 a;
    private static final SerialDescriptor descriptor;

    static {
        m3k0 m3k0Var = new m3k0();
        a = m3k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.RichTextDto.Item", m3k0Var, 4);
        pluginGeneratedSerialDescriptor.j("key", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, false);
        pluginGeneratedSerialDescriptor.j("link", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = p3k0.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p3k0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        RichTextDto$Item$Type richTextDto$Item$Type = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                richTextDto$Item$Type = (RichTextDto$Item$Type) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), richTextDto$Item$Type);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new p3k0(i, str, richTextDto$Item$Type, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p3k0 p3k0Var = (p3k0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p3k0.e;
        String str = p3k0Var.a;
        String str2 = p3k0Var.d;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), p3k0Var.b);
        b.o(serialDescriptor, 2, p3k0Var.c);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 3, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
