package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/UpdatedTrustedContactsResponse;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdatedTrustedContactsResponse {
    public static final r Companion = new r();
    public final TrustedContactDto a;
    public final ModalContentDto b;

    public /* synthetic */ UpdatedTrustedContactsResponse(int i, TrustedContactDto trustedContactDto, ModalContentDto modalContentDto) {
        String str = null;
        this.a = (i & 1) == 0 ? new TrustedContactDto(str, str, str, 31) : trustedContactDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = modalContentDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedTrustedContactsResponse)) {
            return false;
        }
        UpdatedTrustedContactsResponse updatedTrustedContactsResponse = (UpdatedTrustedContactsResponse) obj;
        return jl40.l(this.a, updatedTrustedContactsResponse.a) && jl40.l(this.b, updatedTrustedContactsResponse.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ModalContentDto modalContentDto = this.b;
        return hashCode + (modalContentDto == null ? 0 : modalContentDto.hashCode());
    }

    public final String toString() {
        return "UpdatedTrustedContactsResponse(trustedContact=" + this.a + ", modalContent=" + this.b + Extension.C_BRAKE;
    }

    public UpdatedTrustedContactsResponse() {
        String str = null;
        this.a = new TrustedContactDto(str, str, str, 31);
        this.b = null;
    }
}
