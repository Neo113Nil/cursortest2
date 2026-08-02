package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/DeleteSettingsDto;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeleteSettingsDto {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ DeleteSettingsDto(int i, String str, String str2, String str3, String str4) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSettingsDto)) {
            return false;
        }
        DeleteSettingsDto deleteSettingsDto = (DeleteSettingsDto) obj;
        return jl40.l(this.a, deleteSettingsDto.a) && jl40.l(this.b, deleteSettingsDto.b) && jl40.l(this.c, deleteSettingsDto.c) && jl40.l(this.d, deleteSettingsDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("DeleteSettingsDto(title=", this.a, ", subtitle=", this.b, ", deleteButtonTitle="), this.c, ", changeSettingsButtonTitle=", this.d, Extension.C_BRAKE);
    }

    public DeleteSettingsDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }
}
