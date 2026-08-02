package com.yandex.go.address.dto;

import com.yandex.go.address.models.EditAction;
import com.yandex.go.panorama.api.data.PanoramaIdDataDto;
import com.yandex.go.panorama.api.data.PanoramaIdDataDto$$serializer;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.auu0;
import defpackage.b0t;
import defpackage.bgq0;
import defpackage.cdx;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import defpackage.zfq0;
import defpackage.zn11;
import defpackage.zzs;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/address/dto/AddressDTO.$serializer", "Luxs;", "Lcom/yandex/go/address/dto/AddressDTO;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/address/dto/AddressDTO;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/address/dto/AddressDTO;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class AddressDTO$$serializer implements uxs {
    public static final AddressDTO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AddressDTO$$serializer addressDTO$$serializer = new AddressDTO$$serializer();
        INSTANCE = addressDTO$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.address.dto.AddressDTO", addressDTO$$serializer, 25);
        pluginGeneratedSerialDescriptor.j("geopoint", true);
        final String[] strArr = {IssuingDistributionPointExtension.POINT};
        pluginGeneratedSerialDescriptor.k(new cdx() { // from class: com.yandex.go.address.dto.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return cdx.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof cdx) && Arrays.equals(strArr, ((cdx) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr) ^ 397397176;
            }

            @Override // defpackage.cdx
            public final /* synthetic */ String[] names() {
                return strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return oyr.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr), Extension.C_BRAKE);
            }
        });
        pluginGeneratedSerialDescriptor.j("locality", true);
        final String[] strArr2 = {"city"};
        pluginGeneratedSerialDescriptor.k(new cdx() { // from class: com.yandex.go.address.dto.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return cdx.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof cdx) && Arrays.equals(strArr2, ((cdx) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr2) ^ 397397176;
            }

            @Override // defpackage.cdx
            public final /* synthetic */ String[] names() {
                return strArr2;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return oyr.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr2), Extension.C_BRAKE);
            }
        });
        pluginGeneratedSerialDescriptor.j("porchnumber", true);
        pluginGeneratedSerialDescriptor.j("address_details", true);
        pluginGeneratedSerialDescriptor.j("fullname", true);
        final String[] strArr3 = {"full_text"};
        pluginGeneratedSerialDescriptor.k(new cdx() { // from class: com.yandex.go.address.dto.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return cdx.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof cdx) && Arrays.equals(strArr3, ((cdx) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr3) ^ 397397176;
            }

            @Override // defpackage.cdx
            public final /* synthetic */ String[] names() {
                return strArr3;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return oyr.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr3), Extension.C_BRAKE);
            }
        });
        pluginGeneratedSerialDescriptor.j("short_text", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("method", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("uris", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("passed", true);
        pluginGeneratedSerialDescriptor.j("house", true);
        pluginGeneratedSerialDescriptor.j("quarters_number", true);
        pluginGeneratedSerialDescriptor.j("floor_number", true);
        pluginGeneratedSerialDescriptor.j("doorphone_number", true);
        pluginGeneratedSerialDescriptor.j("comment_courier", true);
        pluginGeneratedSerialDescriptor.j("contact", true);
        pluginGeneratedSerialDescriptor.j("edit_action", true);
        pluginGeneratedSerialDescriptor.j("group_id", true);
        pluginGeneratedSerialDescriptor.j("panorama_id_data", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddressDTO$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = AddressDTO.G;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{b0t.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[8].getValue(), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[11].getValue(), qke.n(auu0Var), qke.n(auu0Var), z96.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(zfq0.a), qke.n((KSerializer) i3yVarArr[21].getValue()), qke.n(h6w.a), qke.n(PanoramaIdDataDto$$serializer.INSTANCE), qke.n(zn11.Companion.serializer())};
    }

    @Override // defpackage.myi
    public final AddressDTO deserialize(Decoder decoder) {
        List list;
        String str;
        int i;
        zn11 zn11Var;
        List list2;
        String str2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddressDTO.G;
        b.getClass();
        List list3 = null;
        zn11 zn11Var2 = null;
        PanoramaIdDataDto panoramaIdDataDto = null;
        Integer num = null;
        String str3 = null;
        EditAction editAction = null;
        int i2 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        bgq0 bgq0Var = null;
        boolean z = true;
        String str10 = null;
        String str11 = null;
        zzs zzsVar = null;
        String str12 = null;
        boolean z2 = false;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        GeoObjectType geoObjectType = null;
        String str17 = null;
        String str18 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    zn11Var = zn11Var2;
                    z = false;
                    panoramaIdDataDto = panoramaIdDataDto;
                    str3 = str3;
                    zzsVar = zzsVar;
                    zn11Var2 = zn11Var;
                case 0:
                    list = list3;
                    i2 |= 1;
                    panoramaIdDataDto = panoramaIdDataDto;
                    str3 = str3;
                    zn11Var2 = zn11Var2;
                    zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                    list3 = list;
                case 1:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str2 = str3;
                    str12 = (String) b.s(serialDescriptor, 1, auu0.a, str12);
                    i2 |= 2;
                    str13 = str13;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 2:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str2 = str3;
                    str13 = (String) b.s(serialDescriptor, 2, auu0.a, str13);
                    i2 |= 4;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 3:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str2 = str3;
                    str14 = (String) b.s(serialDescriptor, 3, auu0.a, str14);
                    i2 |= 8;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 4:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str10 = b.k(serialDescriptor, 4);
                    i2 |= 16;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 5:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str11 = b.k(serialDescriptor, 5);
                    i2 |= 32;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 6:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str2 = str3;
                    str15 = (String) b.s(serialDescriptor, 6, auu0.a, str15);
                    i2 |= 64;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 7:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str2 = str3;
                    str16 = (String) b.s(serialDescriptor, 7, auu0.a, str16);
                    i2 |= 128;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 8:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str2 = str3;
                    geoObjectType = (GeoObjectType) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), geoObjectType);
                    i2 |= 256;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 9:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str2 = str3;
                    str17 = (String) b.s(serialDescriptor, 9, auu0.a, str17);
                    i2 |= 512;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 10:
                    zn11Var = zn11Var2;
                    str2 = str3;
                    list2 = list3;
                    str18 = (String) b.s(serialDescriptor, 10, auu0.a, str18);
                    i2 |= 1024;
                    str3 = str2;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 11:
                    zn11Var = zn11Var2;
                    list3 = (List) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list3);
                    i2 |= 2048;
                    str3 = str3;
                    zn11Var2 = zn11Var;
                case 12:
                    list2 = list3;
                    zn11Var = zn11Var2;
                    str3 = (String) b.s(serialDescriptor, 12, auu0.a, str3);
                    i2 |= 4096;
                    list3 = list2;
                    zn11Var2 = zn11Var;
                case 13:
                    list = list3;
                    str = str3;
                    str8 = (String) b.s(serialDescriptor, 13, auu0.a, str8);
                    i2 |= 8192;
                    str3 = str;
                    list3 = list;
                case 14:
                    list = list3;
                    z2 = b.C(serialDescriptor, 14);
                    i2 |= 16384;
                    list3 = list;
                case 15:
                    list = list3;
                    str = str3;
                    str9 = (String) b.s(serialDescriptor, 15, auu0.a, str9);
                    i = 32768;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 16:
                    list = list3;
                    str = str3;
                    str4 = (String) b.s(serialDescriptor, 16, auu0.a, str4);
                    i = 65536;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 17:
                    list = list3;
                    str = str3;
                    str5 = (String) b.s(serialDescriptor, 17, auu0.a, str5);
                    i = 131072;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 18:
                    list = list3;
                    str = str3;
                    str6 = (String) b.s(serialDescriptor, 18, auu0.a, str6);
                    i = 262144;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 19:
                    list = list3;
                    str = str3;
                    str7 = (String) b.s(serialDescriptor, 19, auu0.a, str7);
                    i = 524288;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 20:
                    list = list3;
                    str = str3;
                    bgq0Var = (bgq0) b.s(serialDescriptor, 20, zfq0.a, bgq0Var);
                    i = 1048576;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 21:
                    list = list3;
                    str = str3;
                    editAction = (EditAction) b.s(serialDescriptor, 21, (myi) i3yVarArr[21].getValue(), editAction);
                    i = 2097152;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 22:
                    list = list3;
                    str = str3;
                    num = (Integer) b.s(serialDescriptor, 22, h6w.a, num);
                    i = SelfTester_JCP.ENCRYPT_CBC;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 23:
                    list = list3;
                    str = str3;
                    panoramaIdDataDto = (PanoramaIdDataDto) b.s(serialDescriptor, 23, PanoramaIdDataDto$$serializer.INSTANCE, panoramaIdDataDto);
                    i = SelfTester_JCP.ENCRYPT_CNT;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                case 24:
                    list = list3;
                    str = str3;
                    zn11Var2 = (zn11) b.s(serialDescriptor, 24, zn11.Companion.serializer(), zn11Var2);
                    i = 16777216;
                    i2 |= i;
                    str3 = str;
                    list3 = list;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        zn11 zn11Var3 = zn11Var2;
        String str19 = str3;
        zzs zzsVar2 = zzsVar;
        String str20 = str12;
        String str21 = str13;
        b.c(serialDescriptor);
        return new AddressDTO(i2, zzsVar2, str20, str21, str14, str10, str11, str15, str16, geoObjectType, str17, str18, list3, str19, str8, z2, str9, str4, str5, str6, str7, bgq0Var, editAction, num, panoramaIdDataDto, zn11Var3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AddressDTO value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddressDTO.G;
        if (b.F() || !jl40.l(value.a, zzs.f)) {
            b.e(serialDescriptor, 0, b0t.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != GeoObjectType.ADDRESS) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, auu0.a, value.k);
        }
        if (b.F() || !jl40.l(value.l, EmptyList.a)) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), value.l);
        }
        if (b.F() || value.m != null) {
            b.g(serialDescriptor, 12, auu0.a, value.m);
        }
        if (b.F() || value.n != null) {
            b.g(serialDescriptor, 13, auu0.a, value.n);
        }
        if (b.F() || value.o) {
            b.n(serialDescriptor, 14, value.o);
        }
        if (b.F() || value.p != null) {
            b.g(serialDescriptor, 15, auu0.a, value.p);
        }
        if (b.F() || value.q != null) {
            b.g(serialDescriptor, 16, auu0.a, value.q);
        }
        if (b.F() || value.r != null) {
            b.g(serialDescriptor, 17, auu0.a, value.r);
        }
        if (b.F() || value.s != null) {
            b.g(serialDescriptor, 18, auu0.a, value.s);
        }
        if (b.F() || value.t != null) {
            b.g(serialDescriptor, 19, auu0.a, value.t);
        }
        if (b.F() || value.u != null) {
            b.g(serialDescriptor, 20, zfq0.a, value.u);
        }
        if (b.F() || value.v != null) {
            b.g(serialDescriptor, 21, (KSerializer) i3yVarArr[21].getValue(), value.v);
        }
        if (b.F() || value.w != null) {
            b.g(serialDescriptor, 22, h6w.a, value.w);
        }
        if (b.F() || value.x != null) {
            b.g(serialDescriptor, 23, PanoramaIdDataDto$$serializer.INSTANCE, value.x);
        }
        if (b.F() || value.y != null) {
            b.g(serialDescriptor, 24, zn11.Companion.serializer(), value.y);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
