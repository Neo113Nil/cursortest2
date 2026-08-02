package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/NewTrustedContactsPutRequest;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class NewTrustedContactsPutRequest {
    public static final g Companion = new g();
    public final NewTrustedContactDto a;

    public /* synthetic */ NewTrustedContactsPutRequest(int i, NewTrustedContactDto newTrustedContactDto) {
        if ((i & 1) == 0) {
            this.a = new NewTrustedContactDto(0);
        } else {
            this.a = newTrustedContactDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewTrustedContactsPutRequest) && jl40.l(this.a, ((NewTrustedContactsPutRequest) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewTrustedContactsPutRequest(newTrustedContact=" + this.a + Extension.C_BRAKE;
    }

    public NewTrustedContactsPutRequest(NewTrustedContactDto newTrustedContactDto) {
        this.a = newTrustedContactDto;
    }

    public NewTrustedContactsPutRequest() {
        this(new NewTrustedContactDto(0));
    }
}
