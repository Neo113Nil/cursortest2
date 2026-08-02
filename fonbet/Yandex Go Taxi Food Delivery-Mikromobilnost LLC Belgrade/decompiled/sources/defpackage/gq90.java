package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class gq90 implements uxs {
    public static final gq90 a;
    private static final SerialDescriptor descriptor;

    static {
        gq90 gq90Var = new gq90();
        a = gq90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.data.model.PatchParam", gq90Var, 12);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("selected_class", true);
        pluginGeneratedSerialDescriptor.j("revision_id", true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("payment_method", true);
        pluginGeneratedSerialDescriptor.j("multiclass_options", true);
        pluginGeneratedSerialDescriptor.j("selected_vertical", true);
        pluginGeneratedSerialDescriptor.j("selected_options_in_verticals", true);
        pluginGeneratedSerialDescriptor.j("comment_validated", true);
        pluginGeneratedSerialDescriptor.j("tariff_change_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = iq90.q;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(h1a0.a), qke.n(jp40.a), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[9].getValue()), z96.a, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = iq90.q;
        b.getClass();
        String str = null;
        Map map = null;
        String str2 = null;
        boolean z2 = true;
        np40 np40Var = null;
        int i = 0;
        String str3 = null;
        List list = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        List list2 = null;
        o1a0 o1a0Var = null;
        int i2 = 1;
        boolean z3 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    i2 = 1;
                case 0:
                    str3 = (String) b.s(serialDescriptor, 0, auu0.a, str3);
                    i |= 1;
                    i3yVarArr2 = i3yVarArr2;
                    z2 = z2;
                    i2 = 1;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list = (List) b.s(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), list);
                    i |= 2;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 2, auu0.a, str4);
                    i |= 4;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 3, auu0.a, str5);
                    i |= 8;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                    i |= 16;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list2 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    o1a0Var = (o1a0) b.s(serialDescriptor, 6, h1a0.a, o1a0Var);
                    i |= 64;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    np40Var = (np40) b.s(serialDescriptor, 7, jp40.a, np40Var);
                    i |= 128;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 8, auu0.a, str2);
                    i |= 256;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    map = (Map) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), map);
                    i |= 512;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                case 10:
                    z3 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    i3yVarArr2 = i3yVarArr2;
                case 11:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 11, auu0.a, str);
                    i |= 2048;
                    i3yVarArr2 = i3yVarArr;
                    z2 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new iq90(i, str3, list, str4, str5, num, list2, o1a0Var, np40Var, str2, map, z3, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        iq90 iq90Var = (iq90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = iq90.q;
        auu0 auu0Var = auu0.a;
        String str = iq90Var.e;
        String str2 = iq90Var.p;
        boolean z = iq90Var.o;
        Map map = iq90Var.n;
        String str3 = iq90Var.m;
        np40 np40Var = iq90Var.l;
        o1a0 o1a0Var = iq90Var.k;
        List list = iq90Var.j;
        Integer num = iq90Var.i;
        String str4 = iq90Var.h;
        String str5 = iq90Var.g;
        b.g(serialDescriptor, 0, auu0Var, str);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), iq90Var.f);
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 2, auu0Var, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 3, auu0Var, str4);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 4, h6w.a, num);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), list);
        }
        if (b.F() || o1a0Var != null) {
            b.g(serialDescriptor, 6, h1a0.a, o1a0Var);
        }
        if (b.F() || np40Var != null) {
            b.g(serialDescriptor, 7, jp40.a, np40Var);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 8, auu0Var, str3);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), map);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 10, z);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 11, auu0Var, str2);
        }
        b.c(serialDescriptor);
    }
}
