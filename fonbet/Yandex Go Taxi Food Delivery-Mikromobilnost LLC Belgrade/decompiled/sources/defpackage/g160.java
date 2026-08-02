package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkStyledTextItemModel$TextStyle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class g160 implements uxs {
    public static final g160 a;
    private static final SerialDescriptor descriptor;

    static {
        g160 g160Var = new g160();
        a = g160Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkStyledTextItemModel", g160Var, 6);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("textSize", false);
        pluginGeneratedSerialDescriptor.j("textWeight", false);
        pluginGeneratedSerialDescriptor.j("textStyle", false);
        pluginGeneratedSerialDescriptor.j("textColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = i160.g;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, auu0Var, h6wVar, h6wVar, i3yVarArr[4].getValue(), auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = i160.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        NetworkStyledTextItemModel$TextStyle networkStyledTextItemModel$TextStyle = null;
        String str3 = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    networkStyledTextItemModel$TextStyle = (NetworkStyledTextItemModel$TextStyle) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), networkStyledTextItemModel$TextStyle);
                    i |= 16;
                    break;
                case 5:
                    str3 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i160(i, str, str2, i2, i3, networkStyledTextItemModel$TextStyle, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i160 i160Var = (i160) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = i160.g;
        b.o(serialDescriptor, 0, i160Var.a);
        b.o(serialDescriptor, 1, i160Var.b);
        b.A(2, i160Var.c, serialDescriptor);
        b.A(3, i160Var.d, serialDescriptor);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), i160Var.e);
        b.o(serialDescriptor, 5, i160Var.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
