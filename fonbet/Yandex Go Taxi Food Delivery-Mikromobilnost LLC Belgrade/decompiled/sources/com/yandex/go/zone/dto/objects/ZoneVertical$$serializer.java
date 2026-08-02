package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.c7v;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/ZoneVertical.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/ZoneVertical;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/ZoneVertical;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/ZoneVertical;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ZoneVertical$$serializer implements uxs {
    public static final ZoneVertical$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ZoneVertical$$serializer zoneVertical$$serializer = new ZoneVertical$$serializer();
        INSTANCE = zoneVertical$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.ZoneVertical", zoneVertical$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("class", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("title_summary", true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("default_tariff", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("header_icon", true);
        pluginGeneratedSerialDescriptor.j("header_title", true);
        pluginGeneratedSerialDescriptor.j("multiclass", true);
        pluginGeneratedSerialDescriptor.j("requirement_overrides", true);
        pluginGeneratedSerialDescriptor.j("trap_only", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZoneVertical$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ZoneVertical.o;
        auu0 auu0Var = auu0.a;
        c7v c7vVar = c7v.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), auu0Var, auu0Var, i3yVarArr[5].getValue(), qke.n(auu0Var), qke.n(c7vVar), qke.n(c7vVar), qke.n(c7vVar), qke.n(auu0Var), qke.n(ZoneVerticalMulticlass$$serializer.INSTANCE), i3yVarArr[12].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final ZoneVertical deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ZoneVertical.o;
        b.getClass();
        ZoneVerticalMulticlass zoneVerticalMulticlass = null;
        String str4 = null;
        n7v n7vVar = null;
        n7v n7vVar2 = null;
        List list = null;
        n7v n7vVar3 = null;
        int i = 0;
        String str5 = null;
        String str6 = null;
        VerticalType verticalType = null;
        String str7 = null;
        String str8 = null;
        List list2 = null;
        String str9 = null;
        boolean z = true;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str2 = str6;
                    z = false;
                    str6 = str2;
                case 0:
                    str2 = str6;
                    i |= 1;
                    str5 = b.k(serialDescriptor, 0);
                    str6 = str2;
                case 1:
                    str = str5;
                    str6 = b.k(serialDescriptor, 1);
                    i |= 2;
                    str5 = str;
                case 2:
                    str3 = str5;
                    str2 = str6;
                    verticalType = (VerticalType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), verticalType);
                    i |= 4;
                    str5 = str3;
                    str6 = str2;
                case 3:
                    str = str5;
                    str7 = b.k(serialDescriptor, 3);
                    i |= 8;
                    str5 = str;
                case 4:
                    str = str5;
                    str8 = b.k(serialDescriptor, 4);
                    i |= 16;
                    str5 = str;
                case 5:
                    str3 = str5;
                    str2 = str6;
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    str5 = str3;
                    str6 = str2;
                case 6:
                    str3 = str5;
                    str2 = str6;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i |= 64;
                    str5 = str3;
                    str6 = str2;
                case 7:
                    str3 = str5;
                    str2 = str6;
                    n7vVar3 = (n7v) b.s(serialDescriptor, 7, c7v.a, n7vVar3);
                    i |= 128;
                    str5 = str3;
                    str6 = str2;
                case 8:
                    str3 = str5;
                    str2 = str6;
                    n7vVar2 = (n7v) b.s(serialDescriptor, 8, c7v.a, n7vVar2);
                    i |= 256;
                    str5 = str3;
                    str6 = str2;
                case 9:
                    str3 = str5;
                    str2 = str6;
                    n7vVar = (n7v) b.s(serialDescriptor, 9, c7v.a, n7vVar);
                    i |= 512;
                    str5 = str3;
                    str6 = str2;
                case 10:
                    str3 = str5;
                    str2 = str6;
                    str4 = (String) b.s(serialDescriptor, 10, auu0.a, str4);
                    i |= 1024;
                    str5 = str3;
                    str6 = str2;
                case 11:
                    str3 = str5;
                    str2 = str6;
                    zoneVerticalMulticlass = (ZoneVerticalMulticlass) b.s(serialDescriptor, 11, ZoneVerticalMulticlass$$serializer.INSTANCE, zoneVerticalMulticlass);
                    i |= 2048;
                    str5 = str3;
                    str6 = str2;
                case 12:
                    str3 = str5;
                    str2 = str6;
                    list = (List) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list);
                    i |= 4096;
                    str5 = str3;
                    str6 = str2;
                case 13:
                    str = str5;
                    z2 = b.C(serialDescriptor, 13);
                    i |= 8192;
                    str5 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ZoneVertical(i, str5, str6, verticalType, str7, str8, list2, str9, n7vVar3, n7vVar2, n7vVar, str4, zoneVerticalMulticlass, list, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ZoneVertical value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ZoneVertical.o;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != VerticalType.NONE) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, c7v.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, c7v.a, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, c7v.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, auu0.a, value.k);
        }
        if (b.F() || value.l != null) {
            b.g(serialDescriptor, 11, ZoneVerticalMulticlass$$serializer.INSTANCE, value.l);
        }
        if (b.F() || !jl40.l(value.m, emptyList)) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), value.m);
        }
        if (b.F() || value.n) {
            b.n(serialDescriptor, 13, value.n);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
