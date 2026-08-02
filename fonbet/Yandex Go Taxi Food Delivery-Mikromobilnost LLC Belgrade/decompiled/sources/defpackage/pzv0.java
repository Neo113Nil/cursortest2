package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class pzv0 implements uxs {
    public static final pzv0 a;
    private static final SerialDescriptor descriptor;

    static {
        pzv0 pzv0Var = new pzv0();
        a = pzv0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.shortcuts.dto.response.superapp.SuperAppExperiment", pzv0Var, 10);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("eats", true);
        pluginGeneratedSerialDescriptor.j("grocery", true);
        pluginGeneratedSerialDescriptor.j("pharmacy", true);
        pluginGeneratedSerialDescriptor.j("shop", true);
        pluginGeneratedSerialDescriptor.j("market", true);
        pluginGeneratedSerialDescriptor.j("market_viewer", true);
        pluginGeneratedSerialDescriptor.j("tracking_api", true);
        pluginGeneratedSerialDescriptor.j("ignore_shortcut_type_for_analytics", true);
        pluginGeneratedSerialDescriptor.j("services", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = szv0.l;
        swq0 swq0Var = swq0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), swq0Var, swq0Var, swq0Var, swq0Var, swq0Var, swq0Var, auu0.a, z96.a, i3yVarArr[9].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = szv0.l;
        b.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        Map map = null;
        uwq0 uwq0Var = null;
        uwq0 uwq0Var2 = null;
        uwq0 uwq0Var3 = null;
        uwq0 uwq0Var4 = null;
        uwq0 uwq0Var5 = null;
        uwq0 uwq0Var6 = null;
        String str = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                    i |= 1;
                    break;
                case 1:
                    uwq0Var = (uwq0) b.A(serialDescriptor, 1, swq0.a, uwq0Var);
                    i |= 2;
                    break;
                case 2:
                    uwq0Var2 = (uwq0) b.A(serialDescriptor, 2, swq0.a, uwq0Var2);
                    i |= 4;
                    break;
                case 3:
                    uwq0Var3 = (uwq0) b.A(serialDescriptor, 3, swq0.a, uwq0Var3);
                    i |= 8;
                    break;
                case 4:
                    uwq0Var4 = (uwq0) b.A(serialDescriptor, 4, swq0.a, uwq0Var4);
                    i |= 16;
                    break;
                case 5:
                    uwq0Var5 = (uwq0) b.A(serialDescriptor, 5, swq0.a, uwq0Var5);
                    i |= 32;
                    break;
                case 6:
                    uwq0Var6 = (uwq0) b.A(serialDescriptor, 6, swq0.a, uwq0Var6);
                    i |= 64;
                    break;
                case 7:
                    str = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z2 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    list = (List) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new szv0(i, map, uwq0Var, uwq0Var2, uwq0Var3, uwq0Var4, uwq0Var5, uwq0Var6, str, z2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.uwq0.L) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.uwq0.L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.uwq0.L) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.uwq0.L) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.uwq0.L) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.uwq0.L) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        szv0 szv0Var = (szv0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = szv0.l;
        if (b.F() || !jl40.l(szv0Var.b, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), szv0Var.b);
        }
        if (!b.F()) {
            uwq0 uwq0Var = szv0Var.c;
            uwq0.Companion.getClass();
        }
        b.e(serialDescriptor, 1, swq0.a, szv0Var.c);
        if (!b.F()) {
            uwq0 uwq0Var2 = szv0Var.d;
            uwq0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, swq0.a, szv0Var.d);
        if (!b.F()) {
            uwq0 uwq0Var3 = szv0Var.e;
            uwq0.Companion.getClass();
        }
        b.e(serialDescriptor, 3, swq0.a, szv0Var.e);
        if (!b.F()) {
            uwq0 uwq0Var4 = szv0Var.f;
            uwq0.Companion.getClass();
        }
        b.e(serialDescriptor, 4, swq0.a, szv0Var.f);
        if (!b.F()) {
            uwq0 uwq0Var5 = szv0Var.g;
            uwq0.Companion.getClass();
        }
        b.e(serialDescriptor, 5, swq0.a, szv0Var.g);
        if (!b.F()) {
            uwq0 uwq0Var6 = szv0Var.h;
            uwq0.Companion.getClass();
        }
        b.e(serialDescriptor, 6, swq0.a, szv0Var.h);
        if (b.F() || !jl40.l(szv0Var.i, "")) {
            b.o(serialDescriptor, 7, szv0Var.i);
        }
        if (b.F() || !szv0Var.j) {
            b.n(serialDescriptor, 8, szv0Var.j);
        }
        if (b.F() || !jl40.l(szv0Var.k, EmptyList.a)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), szv0Var.k);
        }
        b.c(serialDescriptor);
    }
}
