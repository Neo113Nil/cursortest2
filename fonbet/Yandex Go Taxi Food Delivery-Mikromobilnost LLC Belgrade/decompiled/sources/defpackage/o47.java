package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes6.dex */
public final /* synthetic */ class o47 implements uxs {
    public static final o47 a;
    private static final SerialDescriptor descriptor;

    static {
        o47 o47Var = new o47();
        a = o47Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.Buttons", o47Var, 2);
        pluginGeneratedSerialDescriptor.j("orientation", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = r47.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = r47.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Orientation orientation = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                orientation = (Orientation) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), orientation);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new r47(i, orientation, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r47 r47Var = (r47) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = r47.c;
        if (b.F() || r47Var.a != Orientation.VERTICAL) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), r47Var.a);
        }
        if (b.F() || !jl40.l(r47Var.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), r47Var.b);
        }
        b.c(serialDescriptor);
    }
}
