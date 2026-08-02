package com.yandex.go.shortcuts.dto.request;

import defpackage.auu0;
import defpackage.b0t;
import defpackage.bp40;
import defpackage.h6w;
import defpackage.hp40;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.orx;
import defpackage.qke;
import defpackage.sjd;
import defpackage.srx;
import defpackage.uc4;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/request/ProductsParamsState.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/request/ProductsParamsState;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/request/ProductsParamsState;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/request/ProductsParamsState;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ProductsParamsState$$serializer implements uxs {
    public static final ProductsParamsState$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductsParamsState$$serializer productsParamsState$$serializer = new ProductsParamsState$$serializer();
        INSTANCE = productsParamsState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.request.ProductsParamsState", productsParamsState$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("saved_places", true);
        pluginGeneratedSerialDescriptor.j("accuracy", true);
        pluginGeneratedSerialDescriptor.j("fields", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("known_orders", true);
        pluginGeneratedSerialDescriptor.j("screen_type", true);
        pluginGeneratedSerialDescriptor.j("current_mode", true);
        pluginGeneratedSerialDescriptor.j("appearance_mode", true);
        pluginGeneratedSerialDescriptor.j("ultima_mode", true);
        pluginGeneratedSerialDescriptor.j("choose_appearance_mode", true);
        pluginGeneratedSerialDescriptor.j("multiclass_options", true);
        pluginGeneratedSerialDescriptor.j("selected_class", true);
        pluginGeneratedSerialDescriptor.j("shown_objects_over_map", true);
        pluginGeneratedSerialDescriptor.j("known_orders_info", true);
        pluginGeneratedSerialDescriptor.j("bbox", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductsParamsState$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ProductsParamsState.q;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{b0t.a, qke.n((KSerializer) i3yVarArr[1].getValue()), h6w.a, qke.n((KSerializer) i3yVarArr[3].getValue()), orx.a, i3yVarArr[5].getValue(), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(bp40.a), qke.n(auu0Var), i3yVarArr[13].getValue(), qke.n((KSerializer) i3yVarArr[14].getValue()), qke.n(uc4.Companion.serializer())};
    }

    @Override // defpackage.myi
    public final ProductsParamsState deserialize(Decoder decoder) {
        List list;
        srx srxVar;
        hp40 hp40Var;
        zzs zzsVar;
        List list2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ProductsParamsState.q;
        b.getClass();
        hp40 hp40Var2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        List list3 = null;
        uc4 uc4Var = null;
        List list4 = null;
        List list5 = null;
        srx srxVar2 = null;
        List list6 = null;
        ProductsScreenType$Type productsScreenType$Type = null;
        int i2 = 1;
        boolean z = true;
        int i3 = 0;
        zzs zzsVar2 = null;
        List list7 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    hp40Var = hp40Var2;
                    zzsVar = zzsVar2;
                    z = false;
                    str = str;
                    srxVar2 = srxVar2;
                    i2 = 1;
                    zzsVar2 = zzsVar;
                    hp40Var2 = hp40Var;
                case 0:
                    hp40Var = hp40Var2;
                    zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar2);
                    i |= 1;
                    str = str;
                    srxVar2 = srxVar2;
                    list5 = list5;
                    i2 = 1;
                    zzsVar2 = zzsVar;
                    hp40Var2 = hp40Var;
                case 1:
                    hp40Var = hp40Var2;
                    list2 = list5;
                    list7 = (List) b.s(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), list7);
                    i |= 2;
                    srxVar2 = srxVar2;
                    list5 = list2;
                    hp40Var2 = hp40Var;
                case 2:
                    hp40Var = hp40Var2;
                    i3 = b.h(serialDescriptor, 2);
                    i |= 4;
                    list5 = list5;
                    hp40Var2 = hp40Var;
                case 3:
                    hp40Var = hp40Var2;
                    list5 = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list5);
                    i |= 8;
                    srxVar2 = srxVar2;
                    hp40Var2 = hp40Var;
                case 4:
                    list2 = list5;
                    hp40Var = hp40Var2;
                    srxVar2 = (srx) b.A(serialDescriptor, 4, orx.a, srxVar2);
                    i |= 16;
                    list5 = list2;
                    hp40Var2 = hp40Var;
                case 5:
                    list = list5;
                    srxVar = srxVar2;
                    list6 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list6);
                    i |= 32;
                    srxVar2 = srxVar;
                    list5 = list;
                case 6:
                    list = list5;
                    srxVar = srxVar2;
                    productsScreenType$Type = (ProductsScreenType$Type) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), productsScreenType$Type);
                    i |= 64;
                    srxVar2 = srxVar;
                    list5 = list;
                case 7:
                    list = list5;
                    srxVar = srxVar2;
                    str5 = (String) b.s(serialDescriptor, 7, auu0.a, str5);
                    i |= 128;
                    srxVar2 = srxVar;
                    list5 = list;
                case 8:
                    list = list5;
                    srxVar = srxVar2;
                    str3 = (String) b.s(serialDescriptor, 8, auu0.a, str3);
                    i |= 256;
                    srxVar2 = srxVar;
                    list5 = list;
                case 9:
                    list = list5;
                    srxVar = srxVar2;
                    str2 = (String) b.s(serialDescriptor, 9, auu0.a, str2);
                    i |= 512;
                    srxVar2 = srxVar;
                    list5 = list;
                case 10:
                    list = list5;
                    srxVar = srxVar2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    srxVar2 = srxVar;
                    list5 = list;
                case 11:
                    list = list5;
                    srxVar = srxVar2;
                    hp40Var2 = (hp40) b.s(serialDescriptor, 11, bp40.a, hp40Var2);
                    i |= 2048;
                    srxVar2 = srxVar;
                    list5 = list;
                case 12:
                    list = list5;
                    srxVar = srxVar2;
                    str4 = (String) b.s(serialDescriptor, 12, auu0.a, str4);
                    i |= 4096;
                    srxVar2 = srxVar;
                    list5 = list;
                case 13:
                    list = list5;
                    srxVar = srxVar2;
                    list4 = (List) b.A(serialDescriptor, 13, (myi) i3yVarArr[13].getValue(), list4);
                    i |= 8192;
                    srxVar2 = srxVar;
                    list5 = list;
                case 14:
                    list = list5;
                    srxVar = srxVar2;
                    list3 = (List) b.s(serialDescriptor, 14, (myi) i3yVarArr[14].getValue(), list3);
                    i |= 16384;
                    srxVar2 = srxVar;
                    list5 = list;
                case 15:
                    list = list5;
                    srxVar = srxVar2;
                    uc4Var = (uc4) b.s(serialDescriptor, 15, uc4.Companion.serializer(), uc4Var);
                    i |= 32768;
                    srxVar2 = srxVar;
                    list5 = list;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        hp40 hp40Var3 = hp40Var2;
        srx srxVar3 = srxVar2;
        zzs zzsVar3 = zzsVar2;
        List list8 = list7;
        b.c(serialDescriptor);
        return new ProductsParamsState(i, zzsVar3, list8, i3, list5, srxVar3, list6, productsScreenType$Type, str5, str3, str2, str, hp40Var3, str4, list4, list3, uc4Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ProductsParamsState value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ProductsParamsState.q;
        if (b.F() || !jl40.l(value.a, new zzs(0.0d, 0.0d, 0, null, null, 24))) {
            b.e(serialDescriptor, 0, b0t.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != 0) {
            b.A(2, value.c, serialDescriptor);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || !jl40.l(value.e, new srx(null, null))) {
            b.e(serialDescriptor, 4, orx.a, value.e);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || value.g != ProductsScreenType$Type.MAIN) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, auu0.a, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, auu0.a, value.k);
        }
        if (b.F() || value.l != null) {
            b.g(serialDescriptor, 11, bp40.a, value.l);
        }
        if (b.F() || value.m != null) {
            b.g(serialDescriptor, 12, auu0.a, value.m);
        }
        if (b.F() || !jl40.l(value.n, emptyList)) {
            b.e(serialDescriptor, 13, (KSerializer) i3yVarArr[13].getValue(), value.n);
        }
        if (b.F() || value.o != null) {
            b.g(serialDescriptor, 14, (KSerializer) i3yVarArr[14].getValue(), value.o);
        }
        if (b.F() || value.p != null) {
            b.g(serialDescriptor, 15, uc4.Companion.serializer(), value.p);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
