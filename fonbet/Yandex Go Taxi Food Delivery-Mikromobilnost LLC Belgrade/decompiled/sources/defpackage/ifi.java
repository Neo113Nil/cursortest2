package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes9.dex */
public final /* synthetic */ class ifi implements uxs {
    public static final ifi a;
    private static final SerialDescriptor descriptor;

    static {
        ifi ifiVar = new ifi();
        a = ifiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.DeliveryOrderAdditionalStepExperiment", ifiVar, 18);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("short_form_tariffs", true);
        pluginGeneratedSerialDescriptor.j("address_related_requirement", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("title_overwriting_by_tariff_rules", true);
        pluginGeneratedSerialDescriptor.j("price_label", true);
        pluginGeneratedSerialDescriptor.j(CRLDistributionPointsExtension.POINTS, true);
        pluginGeneratedSerialDescriptor.j("continue_with_requirement_alert", true);
        pluginGeneratedSerialDescriptor.j("details_field_effects", true);
        pluginGeneratedSerialDescriptor.j("sender_or_adressee_is_me_radiobutton_text", true);
        pluginGeneratedSerialDescriptor.j("empty_contact_item", true);
        pluginGeneratedSerialDescriptor.j("new_delivery_flow", true);
        pluginGeneratedSerialDescriptor.j("tariff_screen_continue_button_text", true);
        pluginGeneratedSerialDescriptor.j("show_door_to_door_requirement_on_summary", true);
        pluginGeneratedSerialDescriptor.j("disable_comment_on_summary", true);
        pluginGeneratedSerialDescriptor.j("additional_requirements", true);
        pluginGeneratedSerialDescriptor.j("setup_requirements", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kfi.t;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), lmi.a, auu0Var, qke.n((KSerializer) i3yVarArr[5].getValue()), auu0Var, i3yVarArr[7].getValue(), n1i.a, i8j.a, auu0Var, qke.n(f7i.a), z96Var, auu0Var, z96Var, z96Var, i3yVarArr[16].getValue(), rfr0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        boolean z;
        int i;
        boolean z2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kfi.t;
        b.getClass();
        List list = null;
        h7i h7iVar = null;
        k8j k8jVar = null;
        p1i p1iVar = null;
        tfr0 tfr0Var = null;
        List list2 = null;
        int i2 = 0;
        boolean z3 = false;
        List list3 = null;
        List list4 = null;
        nmi nmiVar = null;
        String str2 = null;
        List list5 = null;
        String str3 = null;
        int i3 = 1;
        boolean z4 = true;
        String str4 = null;
        boolean z5 = false;
        String str5 = null;
        boolean z6 = false;
        boolean z7 = false;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = z3;
                    z4 = false;
                    z3 = z2;
                case 0:
                    str = str2;
                    i2 |= 1;
                    z3 = b.C(serialDescriptor, 0);
                    i3 = i3;
                    str2 = str;
                case 1:
                    z = z3;
                    str = str2;
                    list3 = (List) b.A(serialDescriptor, i3, (myi) i3yVarArr[i3].getValue(), list3);
                    i2 |= 2;
                    z3 = z;
                    str2 = str;
                case 2:
                    z = z3;
                    str = str2;
                    list4 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list4);
                    i2 |= 4;
                    z3 = z;
                    str2 = str;
                case 3:
                    z = z3;
                    str = str2;
                    nmiVar = (nmi) b.A(serialDescriptor, 3, lmi.a, nmiVar);
                    i2 |= 8;
                    z3 = z;
                    str2 = str;
                case 4:
                    z2 = z3;
                    str2 = b.k(serialDescriptor, 4);
                    i2 |= 16;
                    z3 = z2;
                case 5:
                    z = z3;
                    str = str2;
                    list5 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list5);
                    i2 |= 32;
                    z3 = z;
                    str2 = str;
                case 6:
                    z2 = z3;
                    str3 = b.k(serialDescriptor, 6);
                    i2 |= 64;
                    z3 = z2;
                case 7:
                    z = z3;
                    str = str2;
                    list2 = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list2);
                    i2 |= 128;
                    z3 = z;
                    str2 = str;
                case 8:
                    z = z3;
                    str = str2;
                    p1iVar = (p1i) b.A(serialDescriptor, 8, n1i.a, p1iVar);
                    i2 |= 256;
                    z3 = z;
                    str2 = str;
                case 9:
                    z = z3;
                    str = str2;
                    k8jVar = (k8j) b.A(serialDescriptor, 9, i8j.a, k8jVar);
                    i2 |= 512;
                    z3 = z;
                    str2 = str;
                case 10:
                    z2 = z3;
                    str4 = b.k(serialDescriptor, 10);
                    i2 |= 1024;
                    z3 = z2;
                case 11:
                    z = z3;
                    str = str2;
                    h7iVar = (h7i) b.s(serialDescriptor, 11, f7i.a, h7iVar);
                    i2 |= 2048;
                    z3 = z;
                    str2 = str;
                case 12:
                    z2 = z3;
                    z5 = b.C(serialDescriptor, 12);
                    i2 |= 4096;
                    z3 = z2;
                case 13:
                    z2 = z3;
                    str5 = b.k(serialDescriptor, 13);
                    i2 |= 8192;
                    z3 = z2;
                case 14:
                    z2 = z3;
                    z6 = b.C(serialDescriptor, 14);
                    i2 |= 16384;
                    z3 = z2;
                case 15:
                    z2 = z3;
                    z7 = b.C(serialDescriptor, 15);
                    i2 |= 32768;
                    z3 = z2;
                case 16:
                    z = z3;
                    str = str2;
                    list = (List) b.A(serialDescriptor, 16, (myi) i3yVarArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    z3 = z;
                    str2 = str;
                case 17:
                    z = z3;
                    str = str2;
                    tfr0Var = (tfr0) b.A(serialDescriptor, 17, rfr0.a, tfr0Var);
                    i = 131072;
                    i2 |= i;
                    z3 = z;
                    str2 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new kfi(i2, z3, list3, list4, nmiVar, str2, list5, str3, list2, p1iVar, k8jVar, str4, h7iVar, z5, str5, z6, z7, list, tfr0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kfi kfiVar = (kfi) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kfi.t;
        if (b.F() || kfiVar.b) {
            b.n(serialDescriptor, 0, kfiVar.b);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(kfiVar.c, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), kfiVar.c);
        }
        if (b.F() || !jl40.l(kfiVar.d, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), kfiVar.d);
        }
        if (b.F() || !jl40.l(kfiVar.e, new nmi(0))) {
            b.e(serialDescriptor, 3, lmi.a, kfiVar.e);
        }
        if (b.F() || !jl40.l(kfiVar.f, "")) {
            b.o(serialDescriptor, 4, kfiVar.f);
        }
        if (b.F() || !jl40.l(kfiVar.g, emptyList)) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), kfiVar.g);
        }
        if (b.F() || !jl40.l(kfiVar.h, "")) {
            b.o(serialDescriptor, 6, kfiVar.h);
        }
        if (b.F() || !jl40.l(kfiVar.i, emptyList)) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), kfiVar.i);
        }
        if (b.F() || !jl40.l(kfiVar.j, new p1i(0))) {
            b.e(serialDescriptor, 8, n1i.a, kfiVar.j);
        }
        if (b.F() || !jl40.l(kfiVar.k, new k8j(0))) {
            b.e(serialDescriptor, 9, i8j.a, kfiVar.k);
        }
        if (b.F() || !jl40.l(kfiVar.l, "")) {
            b.o(serialDescriptor, 10, kfiVar.l);
        }
        if (b.F() || kfiVar.m != null) {
            b.g(serialDescriptor, 11, f7i.a, kfiVar.m);
        }
        if (b.F() || kfiVar.n) {
            b.n(serialDescriptor, 12, kfiVar.n);
        }
        if (b.F() || !jl40.l(kfiVar.o, "")) {
            b.o(serialDescriptor, 13, kfiVar.o);
        }
        if (b.F() || !kfiVar.p) {
            b.n(serialDescriptor, 14, kfiVar.p);
        }
        if (b.F() || kfiVar.q) {
            b.n(serialDescriptor, 15, kfiVar.q);
        }
        if (b.F() || !jl40.l(kfiVar.r, emptyList)) {
            b.e(serialDescriptor, 16, (KSerializer) i3yVarArr[16].getValue(), kfiVar.r);
        }
        if (b.F() || !jl40.l(kfiVar.s, new tfr0(0))) {
            b.e(serialDescriptor, 17, rfr0.a, kfiVar.s);
        }
        b.c(serialDescriptor);
    }
}
