package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsPutRequest;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrustedContactsPutRequest {
    public static final o Companion = new o();
    public final TrustedContactDto a;

    public /* synthetic */ TrustedContactsPutRequest(int i, TrustedContactDto trustedContactDto) {
        if ((i & 1) != 0) {
            this.a = trustedContactDto;
        } else {
            String str = null;
            this.a = new TrustedContactDto(str, str, str, 31);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrustedContactsPutRequest) && jl40.l(this.a, ((TrustedContactsPutRequest) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrustedContactsPutRequest(trustedContact=" + this.a + Extension.C_BRAKE;
    }

    public TrustedContactsPutRequest(TrustedContactDto trustedContactDto) {
        this.a = trustedContactDto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrustedContactsPutRequest() {
        this(new TrustedContactDto(r1, r1, r1, 31));
        String str = null;
    }
}
