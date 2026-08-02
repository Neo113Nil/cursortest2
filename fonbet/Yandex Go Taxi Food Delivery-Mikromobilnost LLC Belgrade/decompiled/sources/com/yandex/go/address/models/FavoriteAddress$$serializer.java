package com.yandex.go.address.models;

import com.yandex.go.address.models.FavoriteAddress;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.auu0;
import defpackage.b0t;
import defpackage.h6w;
import defpackage.i3y;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/address/models/FavoriteAddress.$serializer", "Luxs;", "Lcom/yandex/go/address/models/FavoriteAddress;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/address/models/FavoriteAddress;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/address/models/FavoriteAddress;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class FavoriteAddress$$serializer implements uxs {
    public static final FavoriteAddress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FavoriteAddress$$serializer favoriteAddress$$serializer = new FavoriteAddress$$serializer();
        INSTANCE = favoriteAddress$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.address.models.FavoriteAddress", favoriteAddress$$serializer, 22);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("short_text", true);
        pluginGeneratedSerialDescriptor.j("full_text", true);
        pluginGeneratedSerialDescriptor.j(IssuingDistributionPointExtension.POINT, true);
        pluginGeneratedSerialDescriptor.j("place_type", true);
        pluginGeneratedSerialDescriptor.j("datum_type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("comment_courier", true);
        pluginGeneratedSerialDescriptor.j("doorphone_number", true);
        pluginGeneratedSerialDescriptor.j("floor_number", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("house", true);
        pluginGeneratedSerialDescriptor.j("quarters_number", true);
        pluginGeneratedSerialDescriptor.j("porchnumber", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("emoji", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("log", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FavoriteAddress$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = FavoriteAddress.a;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n((KSerializer) i3yVarArr[5].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[6].getValue());
        FavoriteAddress$FavoriteTitle$$serializer favoriteAddress$FavoriteTitle$$serializer = FavoriteAddress$FavoriteTitle$$serializer.INSTANCE;
        return new KSerializer[]{auu0Var, h6w.a, auu0Var, auu0Var, b0t.a, n, n2, favoriteAddress$FavoriteTitle$$serializer, qke.n(favoriteAddress$FavoriteTitle$$serializer), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final FavoriteAddress deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        String str;
        FavoriteAddress.FavoriteTitle favoriteTitle;
        int i;
        String str2;
        FavoriteAddress.FavoriteTitle favoriteTitle2;
        String str3;
        FavoriteAddress.FavoriteTitle favoriteTitle3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = FavoriteAddress.a;
        b.getClass();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        FavoriteAddress.FavoriteTitle favoriteTitle4 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        boolean z = true;
        String str16 = null;
        int i3 = 0;
        String str17 = null;
        String str18 = null;
        zzs zzsVar = null;
        PlaceType placeType = null;
        FavoriteAddressDatumType favoriteAddressDatumType = null;
        FavoriteAddress.FavoriteTitle favoriteTitle5 = null;
        String str19 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str2 = str4;
                    favoriteTitle2 = favoriteTitle4;
                    z = false;
                    favoriteTitle4 = favoriteTitle2;
                    str4 = str2;
                case 0:
                    str2 = str4;
                    str3 = str6;
                    favoriteTitle3 = favoriteTitle4;
                    str16 = b.k(serialDescriptor, 0);
                    i2 |= 1;
                    favoriteTitle4 = favoriteTitle3;
                    str6 = str3;
                    str4 = str2;
                case 1:
                    str2 = str4;
                    str3 = str6;
                    i3 = b.h(serialDescriptor, 1);
                    i2 |= 2;
                    str6 = str3;
                    str4 = str2;
                case 2:
                    str2 = str4;
                    str3 = str6;
                    str17 = b.k(serialDescriptor, 2);
                    i2 |= 4;
                    str6 = str3;
                    str4 = str2;
                case 3:
                    str2 = str4;
                    str3 = str6;
                    str18 = b.k(serialDescriptor, 3);
                    i2 |= 8;
                    str6 = str3;
                    str4 = str2;
                case 4:
                    str2 = str4;
                    str3 = str6;
                    favoriteTitle3 = favoriteTitle4;
                    zzsVar = (zzs) b.A(serialDescriptor, 4, b0t.a, zzsVar);
                    i2 |= 16;
                    favoriteTitle4 = favoriteTitle3;
                    str6 = str3;
                    str4 = str2;
                case 5:
                    str2 = str4;
                    str3 = str6;
                    favoriteTitle3 = favoriteTitle4;
                    placeType = (PlaceType) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), placeType);
                    i2 |= 32;
                    favoriteTitle4 = favoriteTitle3;
                    str6 = str3;
                    str4 = str2;
                case 6:
                    str2 = str4;
                    str3 = str6;
                    favoriteTitle3 = favoriteTitle4;
                    favoriteAddressDatumType = (FavoriteAddressDatumType) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), favoriteAddressDatumType);
                    i2 |= 64;
                    favoriteTitle4 = favoriteTitle3;
                    str6 = str3;
                    str4 = str2;
                case 7:
                    str2 = str4;
                    str3 = str6;
                    favoriteTitle3 = favoriteTitle4;
                    favoriteTitle5 = (FavoriteAddress.FavoriteTitle) b.A(serialDescriptor, 7, FavoriteAddress$FavoriteTitle$$serializer.INSTANCE, favoriteTitle5);
                    i2 |= 128;
                    favoriteTitle4 = favoriteTitle3;
                    str6 = str3;
                    str4 = str2;
                case 8:
                    str2 = str4;
                    str3 = str6;
                    favoriteTitle4 = (FavoriteAddress.FavoriteTitle) b.s(serialDescriptor, 8, FavoriteAddress$FavoriteTitle$$serializer.INSTANCE, favoriteTitle4);
                    i2 |= 256;
                    str6 = str3;
                    str4 = str2;
                case 9:
                    favoriteTitle2 = favoriteTitle4;
                    str2 = str4;
                    str6 = (String) b.s(serialDescriptor, 9, auu0.a, str6);
                    i2 |= 512;
                    favoriteTitle4 = favoriteTitle2;
                    str4 = str2;
                case 10:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str5 = (String) b.s(serialDescriptor, 10, auu0.a, str5);
                    i2 |= 1024;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 11:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str4 = (String) b.s(serialDescriptor, 11, auu0.a, str4);
                    i2 |= 2048;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 12:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str7 = (String) b.s(serialDescriptor, 12, auu0.a, str7);
                    i2 |= 4096;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 13:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str9 = (String) b.s(serialDescriptor, 13, auu0.a, str9);
                    i2 |= 8192;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 14:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str10 = (String) b.s(serialDescriptor, 14, auu0.a, str10);
                    i2 |= 16384;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 15:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str11 = (String) b.s(serialDescriptor, 15, auu0.a, str11);
                    i = 32768;
                    i2 |= i;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 16:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str12 = (String) b.s(serialDescriptor, 16, auu0.a, str12);
                    i = 65536;
                    i2 |= i;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 17:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str13 = (String) b.s(serialDescriptor, 17, auu0.a, str13);
                    i = 131072;
                    i2 |= i;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 18:
                    str = str6;
                    str19 = b.k(serialDescriptor, 18);
                    i2 |= 262144;
                    str6 = str;
                case 19:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str14 = (String) b.s(serialDescriptor, 19, auu0.a, str14);
                    i = 524288;
                    i2 |= i;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 20:
                    str = str6;
                    favoriteTitle = favoriteTitle4;
                    str15 = (String) b.s(serialDescriptor, 20, auu0.a, str15);
                    i = 1048576;
                    i2 |= i;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                case 21:
                    favoriteTitle = favoriteTitle4;
                    str = str6;
                    str8 = (String) b.s(serialDescriptor, 21, auu0.a, str8);
                    i = 2097152;
                    i2 |= i;
                    favoriteTitle4 = favoriteTitle;
                    str6 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str20 = str4;
        FavoriteAddress.FavoriteTitle favoriteTitle6 = favoriteTitle4;
        zzs zzsVar2 = zzsVar;
        b.c(serialDescriptor);
        String str21 = str14;
        String str22 = str15;
        FavoriteAddressDatumType favoriteAddressDatumType2 = favoriteAddressDatumType;
        String str23 = str12;
        return new FavoriteAddress(i2, str16, i3, str17, str18, zzsVar2, placeType, favoriteAddressDatumType2, favoriteTitle5, favoriteTitle6, str6, str5, str20, str7, str9, str10, str11, str23, str13, str19, str21, str22, str8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FavoriteAddress value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        FavoriteAddress.r(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
