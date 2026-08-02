package defpackage;

import defpackage.fmy;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class bmy implements uxs {
    public static final bmy a;
    private static final SerialDescriptor descriptor;

    static {
        bmy bmyVar = new bmy();
        a = bmyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderDisplayDto", bmyVar, 17);
        pluginGeneratedSerialDescriptor.j("popup_title", true);
        pluginGeneratedSerialDescriptor.j("status_title", true);
        pluginGeneratedSerialDescriptor.j("status_subtitle", true);
        pluginGeneratedSerialDescriptor.j("additional_title", true);
        pluginGeneratedSerialDescriptor.j("additional_subtitle", true);
        pluginGeneratedSerialDescriptor.j("status_icon", true);
        pluginGeneratedSerialDescriptor.j("additional_information", true);
        pluginGeneratedSerialDescriptor.j("info_items", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("payment_method", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("porch_label", true);
        pluginGeneratedSerialDescriptor.j("apartment_label", true);
        pluginGeneratedSerialDescriptor.j("floor_label", true);
        pluginGeneratedSerialDescriptor.j("intercom_label", true);
        pluginGeneratedSerialDescriptor.j("is_expand_when_open_details_screen", true);
        pluginGeneratedSerialDescriptor.j("share_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = fmy.r;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, i3yVarArr[7].getValue(), dmy.a, kmy.a, imy.a, auu0Var, auu0Var, auu0Var, auu0Var, z96.a, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        int i;
        i3y[] i3yVarArr2;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = fmy.r;
        b.getClass();
        fmy.c cVar = null;
        fmy.d dVar = null;
        fmy.a aVar = null;
        boolean z2 = true;
        List list = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z3 = false;
        String str12 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str = b.k(serialDescriptor, 0);
                    i2 |= 1;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 1:
                    i3yVarArr = i3yVarArr3;
                    str2 = b.k(serialDescriptor, 1);
                    i2 |= 2;
                    i3yVarArr3 = i3yVarArr;
                case 2:
                    i3yVarArr = i3yVarArr3;
                    str3 = b.k(serialDescriptor, 2);
                    i2 |= 4;
                    i3yVarArr3 = i3yVarArr;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    str4 = b.k(serialDescriptor, 3);
                    i2 |= 8;
                    i3yVarArr3 = i3yVarArr;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    str5 = b.k(serialDescriptor, 4);
                    i2 |= 16;
                    i3yVarArr3 = i3yVarArr;
                case 5:
                    i3yVarArr = i3yVarArr3;
                    str6 = b.k(serialDescriptor, 5);
                    i2 |= 32;
                    i3yVarArr3 = i3yVarArr;
                case 6:
                    i3yVarArr = i3yVarArr3;
                    str7 = b.k(serialDescriptor, 6);
                    i2 |= 64;
                    i3yVarArr3 = i3yVarArr;
                case 7:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr2[7].getValue(), list);
                    i2 |= 128;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 8:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    aVar = (fmy.a) b.A(serialDescriptor, 8, dmy.a, aVar);
                    i2 |= 256;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    dVar = (fmy.d) b.A(serialDescriptor, 9, kmy.a, dVar);
                    i2 |= 512;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 10:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    cVar = (fmy.c) b.A(serialDescriptor, 10, imy.a, cVar);
                    i2 |= 1024;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 11:
                    i3yVarArr = i3yVarArr3;
                    str8 = b.k(serialDescriptor, 11);
                    i2 |= 2048;
                    i3yVarArr3 = i3yVarArr;
                case 12:
                    i3yVarArr = i3yVarArr3;
                    str9 = b.k(serialDescriptor, 12);
                    i2 |= 4096;
                    i3yVarArr3 = i3yVarArr;
                case 13:
                    i3yVarArr = i3yVarArr3;
                    str10 = b.k(serialDescriptor, 13);
                    i2 |= 8192;
                    i3yVarArr3 = i3yVarArr;
                case 14:
                    i3yVarArr = i3yVarArr3;
                    str11 = b.k(serialDescriptor, 14);
                    i2 |= 16384;
                    i3yVarArr3 = i3yVarArr;
                case 15:
                    i3yVarArr = i3yVarArr3;
                    z3 = b.C(serialDescriptor, 15);
                    i = 32768;
                    i2 |= i;
                    i3yVarArr3 = i3yVarArr;
                case 16:
                    i3yVarArr = i3yVarArr3;
                    str12 = b.k(serialDescriptor, 16);
                    i = 65536;
                    i2 |= i;
                    i3yVarArr3 = i3yVarArr;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new fmy(i2, str, str2, str3, str4, str5, str6, str7, list, aVar, dVar, cVar, str8, str9, str10, str11, z3, str12);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fmy fmyVar = (fmy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fmy.r;
        if (b.F() || !jl40.l(fmyVar.a, "")) {
            b.o(serialDescriptor, 0, fmyVar.a);
        }
        if (b.F() || !jl40.l(fmyVar.b, "")) {
            b.o(serialDescriptor, 1, fmyVar.b);
        }
        if (b.F() || !jl40.l(fmyVar.c, "")) {
            b.o(serialDescriptor, 2, fmyVar.c);
        }
        if (b.F() || !jl40.l(fmyVar.d, "")) {
            b.o(serialDescriptor, 3, fmyVar.d);
        }
        if (b.F() || !jl40.l(fmyVar.e, "")) {
            b.o(serialDescriptor, 4, fmyVar.e);
        }
        if (b.F() || !jl40.l(fmyVar.f, "")) {
            b.o(serialDescriptor, 5, fmyVar.f);
        }
        if (b.F() || !jl40.l(fmyVar.g, "")) {
            b.o(serialDescriptor, 6, fmyVar.g);
        }
        if (b.F() || !jl40.l(fmyVar.h, EmptyList.a)) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), fmyVar.h);
        }
        if (b.F() || !jl40.l(fmyVar.i, new fmy.a(0))) {
            b.e(serialDescriptor, 8, dmy.a, fmyVar.i);
        }
        if (b.F() || !jl40.l(fmyVar.j, new fmy.d(0))) {
            b.e(serialDescriptor, 9, kmy.a, fmyVar.j);
        }
        if (b.F() || !jl40.l(fmyVar.k, new fmy.c(0))) {
            b.e(serialDescriptor, 10, imy.a, fmyVar.k);
        }
        if (b.F() || !jl40.l(fmyVar.l, "")) {
            b.o(serialDescriptor, 11, fmyVar.l);
        }
        if (b.F() || !jl40.l(fmyVar.m, "")) {
            b.o(serialDescriptor, 12, fmyVar.m);
        }
        if (b.F() || !jl40.l(fmyVar.n, "")) {
            b.o(serialDescriptor, 13, fmyVar.n);
        }
        if (b.F() || !jl40.l(fmyVar.o, "")) {
            b.o(serialDescriptor, 14, fmyVar.o);
        }
        if (b.F() || fmyVar.p) {
            b.n(serialDescriptor, 15, fmyVar.p);
        }
        if (b.F() || !jl40.l(fmyVar.q, "")) {
            b.o(serialDescriptor, 16, fmyVar.q);
        }
        b.c(serialDescriptor);
    }
}
