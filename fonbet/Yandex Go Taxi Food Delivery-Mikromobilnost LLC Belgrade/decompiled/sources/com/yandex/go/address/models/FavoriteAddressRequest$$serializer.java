package com.yandex.go.address.models;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.auu0;
import defpackage.b0t;
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
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/address/models/FavoriteAddressRequest.$serializer", "Luxs;", "Lcom/yandex/go/address/models/FavoriteAddressRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/address/models/FavoriteAddressRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/address/models/FavoriteAddressRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class FavoriteAddressRequest$$serializer implements uxs {
    public static final FavoriteAddressRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FavoriteAddressRequest$$serializer favoriteAddressRequest$$serializer = new FavoriteAddressRequest$$serializer();
        INSTANCE = favoriteAddressRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.address.models.FavoriteAddressRequest", favoriteAddressRequest$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("full_text", true);
        pluginGeneratedSerialDescriptor.j("short_text", true);
        pluginGeneratedSerialDescriptor.j(IssuingDistributionPointExtension.POINT, true);
        pluginGeneratedSerialDescriptor.j("place_type", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("comment_courier", true);
        pluginGeneratedSerialDescriptor.j("porchnumber", true);
        pluginGeneratedSerialDescriptor.j("floor_number", true);
        pluginGeneratedSerialDescriptor.j("quarters_number", true);
        pluginGeneratedSerialDescriptor.j("doorphone_number", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("datum_type", true);
        pluginGeneratedSerialDescriptor.j("emoji", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FavoriteAddressRequest$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FavoriteAddressRequest.o;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, b0t.a, qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final FavoriteAddressRequest deserialize(Decoder decoder) {
        String str;
        zzs zzsVar;
        String str2;
        zzs zzsVar2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FavoriteAddressRequest.o;
        b.getClass();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        String str10 = null;
        String str11 = null;
        zzs zzsVar3 = null;
        PlaceType placeType = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z = true;
        String str15 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str2 = str4;
                    zzsVar2 = zzsVar3;
                    z = false;
                    zzsVar3 = zzsVar2;
                    str4 = str2;
                case 0:
                    str2 = str4;
                    str3 = str11;
                    str15 = b.k(serialDescriptor, 0);
                    i |= 1;
                    zzsVar3 = zzsVar3;
                    str11 = str3;
                    str4 = str2;
                case 1:
                    str2 = str4;
                    zzsVar2 = zzsVar3;
                    i |= 2;
                    str11 = b.k(serialDescriptor, 1);
                    zzsVar3 = zzsVar2;
                    str4 = str2;
                case 2:
                    str3 = str11;
                    str2 = str4;
                    zzsVar3 = (zzs) b.A(serialDescriptor, 2, b0t.a, zzsVar3);
                    i |= 4;
                    str11 = str3;
                    str4 = str2;
                case 3:
                    str = str11;
                    zzsVar = zzsVar3;
                    placeType = (PlaceType) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), placeType);
                    i |= 8;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 4:
                    str = str11;
                    zzsVar = zzsVar3;
                    str12 = (String) b.s(serialDescriptor, 4, auu0.a, str12);
                    i |= 16;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 5:
                    str = str11;
                    zzsVar = zzsVar3;
                    str13 = (String) b.s(serialDescriptor, 5, auu0.a, str13);
                    i |= 32;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 6:
                    str = str11;
                    zzsVar = zzsVar3;
                    str14 = (String) b.s(serialDescriptor, 6, auu0.a, str14);
                    i |= 64;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 7:
                    str = str11;
                    zzsVar = zzsVar3;
                    str9 = (String) b.s(serialDescriptor, 7, auu0.a, str9);
                    i |= 128;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 8:
                    str = str11;
                    zzsVar = zzsVar3;
                    str7 = (String) b.s(serialDescriptor, 8, auu0.a, str7);
                    i |= 256;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 9:
                    str = str11;
                    zzsVar = zzsVar3;
                    str6 = (String) b.s(serialDescriptor, 9, auu0.a, str6);
                    i |= 512;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 10:
                    str = str11;
                    zzsVar = zzsVar3;
                    str5 = (String) b.s(serialDescriptor, 10, auu0.a, str5);
                    i |= 1024;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 11:
                    str = str11;
                    zzsVar = zzsVar3;
                    str4 = (String) b.s(serialDescriptor, 11, auu0.a, str4);
                    i |= 2048;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 12:
                    str = str11;
                    zzsVar = zzsVar3;
                    str8 = (String) b.s(serialDescriptor, 12, auu0.a, str8);
                    i |= 4096;
                    str11 = str;
                    zzsVar3 = zzsVar;
                case 13:
                    str = str11;
                    zzsVar = zzsVar3;
                    str10 = (String) b.s(serialDescriptor, 13, auu0.a, str10);
                    i |= 8192;
                    str11 = str;
                    zzsVar3 = zzsVar;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FavoriteAddressRequest(i, str15, str11, zzsVar3, placeType, str12, str13, str14, str9, str7, str6, str5, str4, str8, str10);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FavoriteAddressRequest value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FavoriteAddressRequest.o;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, zzs.f)) {
            b.e(serialDescriptor, 2, b0t.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
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
            b.g(serialDescriptor, 11, auu0.a, value.l);
        }
        if (b.F() || value.m != null) {
            b.g(serialDescriptor, 12, auu0.a, value.m);
        }
        if (b.F() || value.n != null) {
            b.g(serialDescriptor, 13, auu0.a, value.n);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
