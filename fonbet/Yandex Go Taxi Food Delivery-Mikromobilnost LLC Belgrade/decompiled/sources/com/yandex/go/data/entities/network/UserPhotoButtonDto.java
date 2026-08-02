package com.yandex.go.data.entities.network;

import defpackage.b64;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/data/entities/network/UserPhotoButtonDto;", "", "Companion", "$serializer", "com/yandex/go/data/entities/network/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserPhotoButtonDto {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(7)), null, null};
    public final String a;
    public final String b;
    public final UserPhotoActionTypeDto c;
    public final String d;
    public final String e;

    public /* synthetic */ UserPhotoButtonDto(int i, String str, String str2, UserPhotoActionTypeDto userPhotoActionTypeDto, String str3, String str4) {
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
            this.c = null;
        } else {
            this.c = userPhotoActionTypeDto;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPhotoButtonDto)) {
            return false;
        }
        UserPhotoButtonDto userPhotoButtonDto = (UserPhotoButtonDto) obj;
        return jl40.l(this.a, userPhotoButtonDto.a) && jl40.l(this.b, userPhotoButtonDto.b) && this.c == userPhotoButtonDto.c && jl40.l(this.d, userPhotoButtonDto.d) && jl40.l(this.e, userPhotoButtonDto.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        UserPhotoActionTypeDto userPhotoActionTypeDto = this.c;
        return this.e.hashCode() + unr0.b((b + (userPhotoActionTypeDto == null ? 0 : userPhotoActionTypeDto.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("UserPhotoButtonDto(text=", this.a, ", unavailableText=", this.b, ", action=");
        v.append(this.c);
        v.append(", color=");
        v.append(this.d);
        v.append(", textColor=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public UserPhotoButtonDto() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = "";
    }
}
