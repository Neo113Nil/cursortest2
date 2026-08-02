package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.Driver;
import defpackage.auu0;
import defpackage.b0t;
import defpackage.e6m;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/Driver.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/objects/Driver;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/objects/Driver;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/objects/Driver;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class Driver$$serializer implements uxs {
    public static final Driver$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Driver$$serializer driver$$serializer = new Driver$$serializer();
        INSTANCE = driver$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.objects.Driver", driver$$serializer, 20);
        pluginGeneratedSerialDescriptor.j("color_code", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("plates", true);
        pluginGeneratedSerialDescriptor.j("forwarding", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("phone", true);
        pluginGeneratedSerialDescriptor.j("car", true);
        pluginGeneratedSerialDescriptor.j("car_direction", true);
        pluginGeneratedSerialDescriptor.j("yellow_car_number", true);
        pluginGeneratedSerialDescriptor.j("profile_facts", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("feedback_badges", true);
        pluginGeneratedSerialDescriptor.j("short_name", true);
        pluginGeneratedSerialDescriptor.j("status_title", true);
        pluginGeneratedSerialDescriptor.j("tag", true);
        pluginGeneratedSerialDescriptor.j("kis_art", true);
        pluginGeneratedSerialDescriptor.j("extra_items", true);
        pluginGeneratedSerialDescriptor.j("details_unavailable", true);
        pluginGeneratedSerialDescriptor.j("is_deaf", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Driver$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = Driver.u;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(Forwarding$$serializer.INSTANCE), auu0Var, auu0Var, qke.n(b0t.a), qke.n(e6m.a), z96Var, i3yVarArr[10].getValue(), auu0Var, i3yVarArr[12].getValue(), auu0Var, auu0Var, auu0Var, Driver$KisArt$$serializer.INSTANCE, i3yVarArr[17].getValue(), z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Driver deserialize(Decoder decoder) {
        String str;
        int i;
        String str2;
        String str3;
        int i2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = Driver.u;
        b.getClass();
        Driver.KisArt kisArt = null;
        List list = null;
        List list2 = null;
        Double d = null;
        List list3 = null;
        zzs zzsVar = null;
        int i3 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Forwarding forwarding = null;
        String str8 = null;
        String str9 = null;
        boolean z = false;
        boolean z2 = true;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z3 = false;
        boolean z4 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str5;
                    z2 = false;
                    str5 = str;
                case 0:
                    str2 = str5;
                    str3 = str8;
                    str4 = (String) b.s(serialDescriptor, 0, auu0.a, str4);
                    i3 |= 1;
                    str5 = str2;
                    str8 = str3;
                case 1:
                    str3 = str8;
                    i3 |= 2;
                    str5 = b.k(serialDescriptor, 1);
                    str8 = str3;
                case 2:
                    str2 = str5;
                    str3 = str8;
                    str6 = (String) b.s(serialDescriptor, 2, auu0.a, str6);
                    i3 |= 4;
                    str5 = str2;
                    str8 = str3;
                case 3:
                    str2 = str5;
                    str3 = str8;
                    str7 = (String) b.s(serialDescriptor, 3, auu0.a, str7);
                    i3 |= 8;
                    str5 = str2;
                    str8 = str3;
                case 4:
                    str2 = str5;
                    str3 = str8;
                    forwarding = (Forwarding) b.s(serialDescriptor, 4, Forwarding$$serializer.INSTANCE, forwarding);
                    i3 |= 16;
                    str5 = str2;
                    str8 = str3;
                case 5:
                    str = str5;
                    str8 = b.k(serialDescriptor, 5);
                    i3 |= 32;
                    str5 = str;
                case 6:
                    str = str5;
                    str9 = b.k(serialDescriptor, 6);
                    i3 |= 64;
                    str5 = str;
                case 7:
                    str2 = str5;
                    str3 = str8;
                    zzsVar = (zzs) b.s(serialDescriptor, 7, b0t.a, zzsVar);
                    i3 |= 128;
                    str5 = str2;
                    str8 = str3;
                case 8:
                    str2 = str5;
                    str3 = str8;
                    d = (Double) b.s(serialDescriptor, 8, e6m.a, d);
                    i3 |= 256;
                    str5 = str2;
                    str8 = str3;
                case 9:
                    str = str5;
                    z = b.C(serialDescriptor, 9);
                    i3 |= 512;
                    str5 = str;
                case 10:
                    str2 = str5;
                    str3 = str8;
                    list2 = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list2);
                    i3 |= 1024;
                    str5 = str2;
                    str8 = str3;
                case 11:
                    str = str5;
                    str10 = b.k(serialDescriptor, 11);
                    i3 |= 2048;
                    str5 = str;
                case 12:
                    str2 = str5;
                    str3 = str8;
                    list = (List) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list);
                    i3 |= 4096;
                    str5 = str2;
                    str8 = str3;
                case 13:
                    str = str5;
                    str11 = b.k(serialDescriptor, 13);
                    i3 |= 8192;
                    str5 = str;
                case 14:
                    str = str5;
                    str12 = b.k(serialDescriptor, 14);
                    i3 |= 16384;
                    str5 = str;
                case 15:
                    str = str5;
                    str13 = b.k(serialDescriptor, 15);
                    i = 32768;
                    i3 |= i;
                    str5 = str;
                case 16:
                    str2 = str5;
                    str3 = str8;
                    kisArt = (Driver.KisArt) b.A(serialDescriptor, 16, Driver$KisArt$$serializer.INSTANCE, kisArt);
                    i2 = 65536;
                    i3 |= i2;
                    str5 = str2;
                    str8 = str3;
                case 17:
                    str2 = str5;
                    str3 = str8;
                    list3 = (List) b.A(serialDescriptor, 17, (myi) i3yVarArr[17].getValue(), list3);
                    i2 = 131072;
                    i3 |= i2;
                    str5 = str2;
                    str8 = str3;
                case 18:
                    str = str5;
                    z3 = b.C(serialDescriptor, 18);
                    i = 262144;
                    i3 |= i;
                    str5 = str;
                case 19:
                    str = str5;
                    z4 = b.C(serialDescriptor, 19);
                    i = 524288;
                    i3 |= i;
                    str5 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Driver(i3, str4, str5, str6, str7, forwarding, str8, str9, zzsVar, d, z, list2, str10, list, str11, str12, str13, kisArt, list3, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Driver value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Driver.u;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, Forwarding$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, b0t.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, e6m.a, value.i);
        }
        if (b.F() || value.j) {
            b.n(serialDescriptor, 9, value.j);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.k, emptyList)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        }
        if (b.F() || !jl40.l(value.l, "")) {
            b.o(serialDescriptor, 11, value.l);
        }
        if (b.F() || !jl40.l(value.m, emptyList)) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), value.m);
        }
        if (b.F() || !jl40.l(value.n, "")) {
            b.o(serialDescriptor, 13, value.n);
        }
        if (b.F() || !jl40.l(value.o, "")) {
            b.o(serialDescriptor, 14, value.o);
        }
        if (b.F() || !jl40.l(value.p, "")) {
            b.o(serialDescriptor, 15, value.p);
        }
        if (b.F() || !jl40.l(value.q, Driver.KisArt.c)) {
            b.e(serialDescriptor, 16, Driver$KisArt$$serializer.INSTANCE, value.q);
        }
        if (b.F() || !jl40.l(value.r, emptyList)) {
            b.e(serialDescriptor, 17, (KSerializer) i3yVarArr[17].getValue(), value.r);
        }
        if (b.F() || value.s) {
            b.n(serialDescriptor, 18, value.s);
        }
        if (b.F() || value.t) {
            b.n(serialDescriptor, 19, value.t);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
