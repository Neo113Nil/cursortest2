package com.yandex.go.vault.data;

import defpackage.g8e;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/data/VaultActionButtonResponse;", "", "Companion", "$serializer", "com/yandex/go/vault/data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class VaultActionButtonResponse {
    public static final a Companion = new a();
    public static final i3y[] g = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(15)), null, null, null, null, null};
    public final ActionButtonTypeResponse a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ VaultActionButtonResponse(int i, ActionButtonTypeResponse actionButtonTypeResponse, String str, String str2, String str3, String str4, String str5) {
        this.a = (i & 1) == 0 ? ActionButtonTypeResponse.DEEPLINK : actionButtonTypeResponse;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultActionButtonResponse)) {
            return false;
        }
        VaultActionButtonResponse vaultActionButtonResponse = (VaultActionButtonResponse) obj;
        return this.a == vaultActionButtonResponse.a && jl40.l(this.b, vaultActionButtonResponse.b) && jl40.l(this.c, vaultActionButtonResponse.c) && jl40.l(this.d, vaultActionButtonResponse.d) && jl40.l(this.e, vaultActionButtonResponse.e) && jl40.l(this.f, vaultActionButtonResponse.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VaultActionButtonResponse(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", textToCopy=");
        g8e.D(sb, this.c, ", inactiveTitle=", this.d, ", subtitle=");
        return g8e.r(sb, this.e, ", deeplink=", this.f, Extension.C_BRAKE);
    }

    public VaultActionButtonResponse() {
        this.a = ActionButtonTypeResponse.DEEPLINK;
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
