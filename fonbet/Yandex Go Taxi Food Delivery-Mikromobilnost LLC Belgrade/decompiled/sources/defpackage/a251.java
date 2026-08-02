package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.WidgetDto$Group$Line$Orientation;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class a251 implements uxs {
    public static final a251 a;
    private static final SerialDescriptor descriptor;

    static {
        a251 a251Var = new a251();
        a = a251Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Line", a251Var, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("widgetIds", false);
        pluginGeneratedSerialDescriptor.j("orientation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = c251.g;
        return new KSerializer[]{auu0.a, qke.n(qfe.a), qke.n((KSerializer) i3yVarArr[2].getValue()), nzj.a, i3yVarArr[4].getValue(), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c251.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        sfe sfeVar = null;
        wv wvVar = null;
        wzj wzjVar = null;
        List list = null;
        WidgetDto$Group$Line$Orientation widgetDto$Group$Line$Orientation = null;
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
                    sfeVar = (sfe) b.s(serialDescriptor, 1, qfe.a, sfeVar);
                    i |= 2;
                    break;
                case 2:
                    wvVar = (wv) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), wvVar);
                    i |= 4;
                    break;
                case 3:
                    wzjVar = (wzj) b.A(serialDescriptor, 3, nzj.a, wzjVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    widgetDto$Group$Line$Orientation = (WidgetDto$Group$Line$Orientation) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), widgetDto$Group$Line$Orientation);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new c251(i, str, sfeVar, wvVar, wzjVar, list, widgetDto$Group$Line$Orientation);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c251 c251Var = (c251) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c251.g;
        b.o(serialDescriptor, 0, c251Var.a);
        b.g(serialDescriptor, 1, qfe.a, c251Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), c251Var.c);
        b.e(serialDescriptor, 3, nzj.a, c251Var.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), c251Var.e);
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), c251Var.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
