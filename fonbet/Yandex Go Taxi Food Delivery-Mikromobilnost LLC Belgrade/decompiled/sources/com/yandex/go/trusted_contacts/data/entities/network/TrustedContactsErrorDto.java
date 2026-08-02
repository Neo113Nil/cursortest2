package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsErrorDto;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrustedContactsErrorDto {
    public static final n Companion = new n();
    public final String a;
    public final String b;
    public final TrustedContactsErrorActionButtonDto c;

    public /* synthetic */ TrustedContactsErrorDto(int i, String str, String str2, TrustedContactsErrorActionButtonDto trustedContactsErrorActionButtonDto) {
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
            this.c = new TrustedContactsErrorActionButtonDto(0);
        } else {
            this.c = trustedContactsErrorActionButtonDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedContactsErrorDto)) {
            return false;
        }
        TrustedContactsErrorDto trustedContactsErrorDto = (TrustedContactsErrorDto) obj;
        return jl40.l(this.a, trustedContactsErrorDto.a) && jl40.l(this.b, trustedContactsErrorDto.b) && jl40.l(this.c, trustedContactsErrorDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("TrustedContactsErrorDto(title=", this.a, ", text=", this.b, ", actionButton=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public TrustedContactsErrorDto() {
        TrustedContactsErrorActionButtonDto trustedContactsErrorActionButtonDto = new TrustedContactsErrorActionButtonDto(0);
        this.a = "";
        this.b = "";
        this.c = trustedContactsErrorActionButtonDto;
    }
}
