package com.yandex.go.vault.flexsdk.shared;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/shared/VaultPaletteDto;", "", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/shared/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class VaultPaletteDto {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public /* synthetic */ VaultPaletteDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str11;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultPaletteDto)) {
            return false;
        }
        VaultPaletteDto vaultPaletteDto = (VaultPaletteDto) obj;
        return jl40.l(this.a, vaultPaletteDto.a) && jl40.l(this.b, vaultPaletteDto.b) && jl40.l(this.c, vaultPaletteDto.c) && jl40.l(this.d, vaultPaletteDto.d) && jl40.l(this.e, vaultPaletteDto.e) && jl40.l(this.f, vaultPaletteDto.f) && jl40.l(this.g, vaultPaletteDto.g) && jl40.l(this.h, vaultPaletteDto.h) && jl40.l(this.i, vaultPaletteDto.i) && jl40.l(this.j, vaultPaletteDto.j) && jl40.l(this.k, vaultPaletteDto.k) && jl40.l(this.l, vaultPaletteDto.l);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("VaultPaletteDto(mainScreenControlColor=", this.a, ", textOnControlColor=", this.b, ", mainScreenFirstGradientColor=");
        g8e.D(v, this.c, ", mainScreenSecondGradientColor=", this.d, ", mainScreenSkeletorShimmerColor=");
        g8e.D(v, this.e, ", mainScreenImageShimmerBackgroundColor=", this.f, ", mainScreenImageShimmerLineColor=");
        g8e.D(v, this.g, ", prizeScreenBackgroundColor=", this.h, ", bduiModalViewBackgroundColor=");
        g8e.D(v, this.i, ", copyPromoMainTextColor=", this.j, ", copyPromoSecondaryTextColor=");
        return g8e.r(v, this.k, ", copyPromoBackgroundTextColor=", this.l, Extension.C_BRAKE);
    }

    public VaultPaletteDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
