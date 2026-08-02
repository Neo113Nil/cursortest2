package com.yandex.go.address.models;

import defpackage.b64;
import defpackage.d6p;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/address/models/FavoriteAddressRequest;", "", "Companion", "$serializer", "com/yandex/go/address/models/c", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteAddressRequest {
    public static final c Companion = new c();
    public static final i3y[] o = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d6p(28)), null, null, null, null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final zzs c;
    public final PlaceType d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public /* synthetic */ FavoriteAddressRequest(int i, String str, String str2, zzs zzsVar, PlaceType placeType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = zzs.f;
        } else {
            this.c = zzsVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = placeType;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
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
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str10;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str11;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str12;
        }
    }

    public static FavoriteAddressRequest a(FavoriteAddressRequest favoriteAddressRequest, PlaceType placeType, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        return new FavoriteAddressRequest(favoriteAddressRequest.a, favoriteAddressRequest.b, favoriteAddressRequest.c, placeType, str, favoriteAddressRequest.f, (i & 64) != 0 ? favoriteAddressRequest.g : str2, favoriteAddressRequest.h, (i & 256) != 0 ? favoriteAddressRequest.i : str3, (i & 512) != 0 ? favoriteAddressRequest.j : str4, (i & 1024) != 0 ? favoriteAddressRequest.k : str5, favoriteAddressRequest.l, favoriteAddressRequest.m, (i & 8192) != 0 ? favoriteAddressRequest.n : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteAddressRequest)) {
            return false;
        }
        FavoriteAddressRequest favoriteAddressRequest = (FavoriteAddressRequest) obj;
        return jl40.l(this.a, favoriteAddressRequest.a) && jl40.l(this.b, favoriteAddressRequest.b) && jl40.l(this.c, favoriteAddressRequest.c) && this.d == favoriteAddressRequest.d && jl40.l(this.e, favoriteAddressRequest.e) && jl40.l(this.f, favoriteAddressRequest.f) && jl40.l(this.g, favoriteAddressRequest.g) && jl40.l(this.h, favoriteAddressRequest.h) && jl40.l(this.i, favoriteAddressRequest.i) && jl40.l(this.j, favoriteAddressRequest.j) && jl40.l(this.k, favoriteAddressRequest.k) && jl40.l(this.l, favoriteAddressRequest.l) && jl40.l(this.m, favoriteAddressRequest.m) && jl40.l(this.n, favoriteAddressRequest.n);
    }

    public final int hashCode() {
        int b = nnm.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
        PlaceType placeType = this.d;
        int hashCode = (b + (placeType == null ? 0 : placeType.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.m;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.n;
        return hashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("FavoriteAddressRequest(fullText=", this.a, ", shortText=", this.b, ", point=");
        v.append(this.c);
        v.append(", placeType=");
        v.append(this.d);
        v.append(", name=");
        g8e.D(v, this.e, ", comment=", this.f, ", commentCourier=");
        g8e.D(v, this.g, ", porchNumber=", this.h, ", floorNumber=");
        g8e.D(v, this.i, ", quartersNumber=", this.j, ", doorPhoneNumber=");
        g8e.D(v, this.k, ", uri=", this.l, ", datumType=");
        return g8e.r(v, this.m, ", emoji=", this.n, Extension.C_BRAKE);
    }

    public FavoriteAddressRequest() {
        this((String) null, (String) null, (zzs) null, (PlaceType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383);
    }

    public FavoriteAddressRequest(String str, String str2, zzs zzsVar, PlaceType placeType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.a = str;
        this.b = str2;
        this.c = zzsVar;
        this.d = placeType;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
    }

    public /* synthetic */ FavoriteAddressRequest(String str, String str2, zzs zzsVar, PlaceType placeType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? zzs.f : zzsVar, (i & 8) != 0 ? null : placeType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (String) null, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11);
    }
}
