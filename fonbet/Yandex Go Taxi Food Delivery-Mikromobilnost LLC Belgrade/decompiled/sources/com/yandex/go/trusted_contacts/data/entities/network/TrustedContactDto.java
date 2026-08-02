package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.z411;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactDto;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrustedContactDto {
    public static final l Companion = new l();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z411(29))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ TrustedContactDto(int i, String str, String str2, String str3, String str4, List list) {
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
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public static TrustedContactDto a(TrustedContactDto trustedContactDto, String str, String str2, List list, int i) {
        String str3 = trustedContactDto.a;
        if ((i & 2) != 0) {
            str = trustedContactDto.b;
        }
        String str4 = str;
        String str5 = trustedContactDto.c;
        if ((i & 8) != 0) {
            str2 = trustedContactDto.d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            list = trustedContactDto.e;
        }
        trustedContactDto.getClass();
        return new TrustedContactDto(str3, str4, str5, str6, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedContactDto)) {
            return false;
        }
        TrustedContactDto trustedContactDto = (TrustedContactDto) obj;
        return jl40.l(this.a, trustedContactDto.a) && jl40.l(this.b, trustedContactDto.b) && jl40.l(this.c, trustedContactDto.c) && jl40.l(this.d, trustedContactDto.d) && jl40.l(this.e, trustedContactDto.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("TrustedContactDto(id=", this.a, ", name=", this.b, ", phoneNumber=");
        g8e.D(v, this.c, ", selectedShareSettingsOption=", this.d, ", selectedShareSettingsSwitches=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrustedContactDto() {
        this(r0, r0, r0, 31);
        String str = null;
    }

    public TrustedContactDto(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public /* synthetic */ TrustedContactDto(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, "", EmptyList.a);
    }
}
