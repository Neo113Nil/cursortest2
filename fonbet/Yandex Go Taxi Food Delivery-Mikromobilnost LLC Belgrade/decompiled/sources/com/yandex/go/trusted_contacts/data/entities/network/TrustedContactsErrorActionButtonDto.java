package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsErrorActionButtonDto;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrustedContactsErrorActionButtonDto {
    public static final m Companion = new m();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(1))};
    public final String a;
    public final TrustedContactsErrorActionDto b;

    public /* synthetic */ TrustedContactsErrorActionButtonDto(int i, String str, TrustedContactsErrorActionDto trustedContactsErrorActionDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = TrustedContactsErrorActionDto.BACK;
        } else {
            this.b = trustedContactsErrorActionDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedContactsErrorActionButtonDto)) {
            return false;
        }
        TrustedContactsErrorActionButtonDto trustedContactsErrorActionButtonDto = (TrustedContactsErrorActionButtonDto) obj;
        return jl40.l(this.a, trustedContactsErrorActionButtonDto.a) && this.b == trustedContactsErrorActionButtonDto.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrustedContactsErrorActionButtonDto(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    public TrustedContactsErrorActionButtonDto() {
        this(0);
    }

    public TrustedContactsErrorActionButtonDto(int i) {
        TrustedContactsErrorActionDto trustedContactsErrorActionDto = TrustedContactsErrorActionDto.BACK;
        this.a = "";
        this.b = trustedContactsErrorActionDto;
    }
}
