package com.yandex.go.address.dto;

import com.yandex.go.address.models.EditAction;
import com.yandex.go.panorama.api.data.PanoramaIdDataDto;
import defpackage.ar;
import defpackage.bgq0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.il0;
import defpackage.lwj0;
import defpackage.yu21;
import defpackage.zn11;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.object.GeoObjectType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/address/dto/AddressDTO;", "Llwj0;", "Companion", "com/yandex/go/address/dto/b", "$serializer", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AddressDTO extends lwj0 {
    public static final b Companion = new b();
    public static final i3y[] G;
    public static final i3y H;
    public static final i3y I;
    public String A;
    public FormattedText B;
    public yu21 C;
    public il0 D;
    public List E;
    public List F;
    public final zzs a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final GeoObjectType i;
    public final String j;
    public final String k;
    public final List l;
    public final String m;
    public final String n;
    public final boolean o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final bgq0 u;
    public final EditAction v;
    public final Integer w;
    public final PanoramaIdDataDto x;
    public zn11 y;
    public boolean z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        G = new i3y[]{null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ar(24)), null, null, kotlin.a.b(lazyThreadSafetyMode, new ar(25)), null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ar(26)), null, null, null};
        H = kotlin.a.a(new ar(27));
        I = kotlin.a.a(new ar(28));
    }

    public /* synthetic */ AddressDTO(int i, zzs zzsVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, GeoObjectType geoObjectType, String str8, String str9, List list, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, String str16, bgq0 bgq0Var, EditAction editAction, Integer num, PanoramaIdDataDto panoramaIdDataDto, zn11 zn11Var) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = GeoObjectType.ADDRESS;
        } else {
            this.i = geoObjectType;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str9;
        }
        int i2 = i & 2048;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.l = emptyList;
        } else {
            this.l = list;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str10;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str11;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str13;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str14;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str15;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str16;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bgq0Var;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = editAction;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = num;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = panoramaIdDataDto;
        }
        if ((i & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = zn11Var;
        }
        this.z = false;
        this.A = null;
        this.B = FormattedText.c;
        this.C = yu21.c;
        this.D = il0.b;
        this.E = emptyList;
        this.F = emptyList;
    }

    public static AddressDTO g(AddressDTO addressDTO, zzs zzsVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, bgq0 bgq0Var, int i) {
        zzs zzsVar2 = (i & 1) != 0 ? addressDTO.a : zzsVar;
        String str15 = (i & 2) != 0 ? addressDTO.b : str;
        String str16 = (i & 4) != 0 ? addressDTO.c : str2;
        String str17 = addressDTO.d;
        String str18 = (i & 16) != 0 ? addressDTO.e : str3;
        String str19 = (i & 32) != 0 ? addressDTO.f : str4;
        String str20 = (i & 64) != 0 ? addressDTO.g : str5;
        String str21 = (i & 128) != 0 ? addressDTO.h : str6;
        GeoObjectType geoObjectType = addressDTO.i;
        String str22 = addressDTO.j;
        String str23 = (i & 1024) != 0 ? addressDTO.k : str7;
        List list = addressDTO.l;
        String str24 = (i & 4096) != 0 ? addressDTO.m : str8;
        String str25 = (i & 8192) != 0 ? addressDTO.n : str9;
        boolean z = addressDTO.o;
        String str26 = (32768 & i) != 0 ? addressDTO.p : str10;
        String str27 = (65536 & i) != 0 ? addressDTO.q : str11;
        String str28 = (131072 & i) != 0 ? addressDTO.r : str12;
        String str29 = (262144 & i) != 0 ? addressDTO.s : str13;
        String str30 = (524288 & i) != 0 ? addressDTO.t : str14;
        bgq0 bgq0Var2 = (i & 1048576) != 0 ? addressDTO.u : bgq0Var;
        EditAction editAction = addressDTO.v;
        Integer num = addressDTO.w;
        PanoramaIdDataDto panoramaIdDataDto = addressDTO.x;
        zn11 zn11Var = addressDTO.y;
        addressDTO.getClass();
        return new AddressDTO(zzsVar2, str15, str16, str17, str18, str19, str20, str21, geoObjectType, str22, str23, list, str24, str25, z, str26, str27, str28, str29, str30, bgq0Var2, editAction, num, panoramaIdDataDto, zn11Var);
    }

    @Override // defpackage.lwj0
    /* renamed from: e, reason: from getter */
    public final zn11 getR() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDTO)) {
            return false;
        }
        AddressDTO addressDTO = (AddressDTO) obj;
        return cvu0.t(this.e, addressDTO.e, true) && cvu0.t(this.c, addressDTO.c, true);
    }

    public final String h() {
        String str = this.k;
        if (str != null && !evu0.J(str)) {
            return str;
        }
        List list = this.l;
        if (list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public AddressDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431);
    }

    public AddressDTO(zzs zzsVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, GeoObjectType geoObjectType, String str8, String str9, List list, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, String str16, bgq0 bgq0Var, EditAction editAction, Integer num, PanoramaIdDataDto panoramaIdDataDto, zn11 zn11Var) {
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = geoObjectType;
        this.j = str8;
        this.k = str9;
        this.l = list;
        this.m = str10;
        this.n = str11;
        this.o = z;
        this.p = str12;
        this.q = str13;
        this.r = str14;
        this.s = str15;
        this.t = str16;
        this.u = bgq0Var;
        this.v = editAction;
        this.w = num;
        this.x = panoramaIdDataDto;
        this.y = zn11Var;
        this.B = FormattedText.c;
        this.C = yu21.c;
        this.D = il0.b;
        EmptyList emptyList = EmptyList.a;
        this.E = emptyList;
        this.F = emptyList;
    }

    public /* synthetic */ AddressDTO(zzs zzsVar, String str, String str2, String str3, String str4, String str5, String str6, GeoObjectType geoObjectType, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, bgq0 bgq0Var, EditAction editAction, Integer num, PanoramaIdDataDto panoramaIdDataDto, int i) {
        this((i & 1) != 0 ? zzs.f : zzsVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, null, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? GeoObjectType.ADDRESS : geoObjectType, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, EmptyList.a, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, false, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : str13, (262144 & i) != 0 ? null : str14, (524288 & i) != 0 ? null : str15, (1048576 & i) != 0 ? null : bgq0Var, (2097152 & i) != 0 ? null : editAction, (4194304 & i) != 0 ? null : num, (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? null : panoramaIdDataDto, null);
    }
}
