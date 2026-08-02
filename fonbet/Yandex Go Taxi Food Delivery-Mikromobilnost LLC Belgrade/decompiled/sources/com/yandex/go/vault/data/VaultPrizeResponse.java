package com.yandex.go.vault.data;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/data/VaultPrizeResponse;", "", "Companion", "$serializer", "com/yandex/go/vault/data/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class VaultPrizeResponse {
    public static final d Companion = new d();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(16))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public /* synthetic */ VaultPrizeResponse(int i, String str, String str2, String str3, String str4, String str5, List list) {
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
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultPrizeResponse)) {
            return false;
        }
        VaultPrizeResponse vaultPrizeResponse = (VaultPrizeResponse) obj;
        return jl40.l(this.a, vaultPrizeResponse.a) && jl40.l(this.b, vaultPrizeResponse.b) && jl40.l(this.c, vaultPrizeResponse.c) && jl40.l(this.d, vaultPrizeResponse.d) && jl40.l(this.e, vaultPrizeResponse.e) && jl40.l(this.f, vaultPrizeResponse.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("VaultPrizeResponse(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", backgroundEffectColor=", this.d, ", serviceIcon=");
        return tse0.j(this.e, ", actionButton=", Extension.C_BRAKE, v, this.f);
    }

    public VaultPrizeResponse(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = EmptyList.a;
    }

    public VaultPrizeResponse() {
        this(0);
    }
}
