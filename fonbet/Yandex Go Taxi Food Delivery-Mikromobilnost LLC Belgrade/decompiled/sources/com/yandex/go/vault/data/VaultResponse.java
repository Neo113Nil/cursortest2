package com.yandex.go.vault.data;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/data/VaultResponse;", "", "Companion", "$serializer", "com/yandex/go/vault/data/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class VaultResponse {
    public static final f Companion = new f();
    public final VaultPrizeResponse a;

    public /* synthetic */ VaultResponse(int i, VaultPrizeResponse vaultPrizeResponse) {
        if ((i & 1) == 0) {
            this.a = new VaultPrizeResponse(0);
        } else {
            this.a = vaultPrizeResponse;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VaultResponse) && jl40.l(this.a, ((VaultResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VaultResponse(prize=" + this.a + Extension.C_BRAKE;
    }

    public VaultResponse() {
        this.a = new VaultPrizeResponse(0);
    }
}
