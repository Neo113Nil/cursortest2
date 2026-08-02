package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkLineWidgetGroupModel$Orientation;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class fw50 implements uxs {
    public static final fw50 a;
    private static final SerialDescriptor descriptor;

    static {
        fw50 fw50Var = new fw50();
        a = fw50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkLineWidgetGroupModel", fw50Var, 8);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("widgetIds", false);
        pluginGeneratedSerialDescriptor.j("orientation", false);
        pluginGeneratedSerialDescriptor.j("templates", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = hw50.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{wr50.a, pq50.Companion.serializer(), auu0Var, auu0Var, i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(co50.Companion.serializer())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = hw50.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        co50 co50Var = null;
        yr50 yr50Var = null;
        pq50 pq50Var = null;
        String str = null;
        String str2 = null;
        List list = null;
        NetworkLineWidgetGroupModel$Orientation networkLineWidgetGroupModel$Orientation = null;
        List list2 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    yr50Var = (yr50) b.A(serialDescriptor, 0, wr50.a, yr50Var);
                    i |= 1;
                    break;
                case 1:
                    pq50Var = (pq50) b.A(serialDescriptor, 1, pq50.Companion.serializer(), pq50Var);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    networkLineWidgetGroupModel$Orientation = (NetworkLineWidgetGroupModel$Orientation) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), networkLineWidgetGroupModel$Orientation);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    co50Var = (co50) b.s(serialDescriptor, 7, co50.Companion.serializer(), co50Var);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new hw50(i, yr50Var, pq50Var, str, str2, list, networkLineWidgetGroupModel$Orientation, list2, co50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hw50 hw50Var = (hw50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = hw50.i;
        wr50 wr50Var = wr50.a;
        yr50 yr50Var = hw50Var.a;
        co50 co50Var = hw50Var.h;
        List list = hw50Var.g;
        b.e(serialDescriptor, 0, wr50Var, yr50Var);
        b.e(serialDescriptor, 1, pq50.Companion.serializer(), hw50Var.b);
        b.o(serialDescriptor, 2, hw50Var.c);
        b.o(serialDescriptor, 3, hw50Var.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), hw50Var.e);
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), hw50Var.f);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), list);
        }
        if (b.F() || co50Var != null) {
            b.g(serialDescriptor, 7, co50.Companion.serializer(), co50Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
