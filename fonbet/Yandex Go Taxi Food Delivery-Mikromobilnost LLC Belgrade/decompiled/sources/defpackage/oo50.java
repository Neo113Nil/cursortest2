package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class oo50 implements uxs {
    public static final oo50 a;
    private static final SerialDescriptor descriptor;

    static {
        oo50 oo50Var = new oo50();
        a = oo50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkBackgroundShapeModel", oo50Var, 4);
        pluginGeneratedSerialDescriptor.j("leftTopCorner", false);
        pluginGeneratedSerialDescriptor.j("rightTopCorner", false);
        pluginGeneratedSerialDescriptor.j("leftBottomCorner", false);
        pluginGeneratedSerialDescriptor.j("rightBottomCorner", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        cr50 cr50Var = dr50.Companion;
        return new KSerializer[]{cr50Var.serializer(), cr50Var.serializer(), cr50Var.serializer(), cr50Var.serializer()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        dr50 dr50Var = null;
        dr50 dr50Var2 = null;
        dr50 dr50Var3 = null;
        dr50 dr50Var4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dr50Var = (dr50) b.A(serialDescriptor, 0, dr50.Companion.serializer(), dr50Var);
                i |= 1;
            } else if (v == 1) {
                dr50Var2 = (dr50) b.A(serialDescriptor, 1, dr50.Companion.serializer(), dr50Var2);
                i |= 2;
            } else if (v == 2) {
                dr50Var3 = (dr50) b.A(serialDescriptor, 2, dr50.Companion.serializer(), dr50Var3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                dr50Var4 = (dr50) b.A(serialDescriptor, 3, dr50.Companion.serializer(), dr50Var4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new qo50(i, dr50Var, dr50Var2, dr50Var3, dr50Var4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qo50 qo50Var = (qo50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        cr50 cr50Var = dr50.Companion;
        b.e(serialDescriptor, 0, cr50Var.serializer(), qo50Var.a);
        b.e(serialDescriptor, 1, cr50Var.serializer(), qo50Var.b);
        b.e(serialDescriptor, 2, cr50Var.serializer(), qo50Var.c);
        b.e(serialDescriptor, 3, cr50Var.serializer(), qo50Var.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
