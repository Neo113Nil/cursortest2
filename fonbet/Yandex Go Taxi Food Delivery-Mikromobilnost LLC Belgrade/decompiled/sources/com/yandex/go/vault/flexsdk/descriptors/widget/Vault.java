package com.yandex.go.vault.flexsdk.descriptors.widget;

import defpackage.g8e;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import defpackage.w8s0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/Vault;", "", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/descriptors/widget/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Vault {
    public static final a Companion = new a();
    public static final i3y[] i = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(14)), null, null, null, null, null, null, null};
    public final VaultRarity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final w8s0 h;

    public /* synthetic */ Vault(int i2, VaultRarity vaultRarity, String str, String str2, String str3, String str4, String str5, int i3, w8s0 w8s0Var) {
        if (223 != (i2 & 223)) {
            qje.Z(i2, 223, Vault$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = vaultRarity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        if ((i2 & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        this.g = i3;
        this.h = w8s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vault)) {
            return false;
        }
        Vault vault = (Vault) obj;
        return this.a == vault.a && jl40.l(this.b, vault.b) && jl40.l(this.c, vault.c) && jl40.l(this.d, vault.d) && jl40.l(this.e, vault.e) && jl40.l(this.f, vault.f) && this.g == vault.g && jl40.l(this.h, vault.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + oyr.b(this.g, unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vault(rarity=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", titleColor=");
        g8e.D(sb, this.c, ", imageTag=", this.d, ", openAnimation=");
        g8e.D(sb, this.e, ", backgroundTopGradientColor=", this.f, ", keyAmountToOpen=");
        sb.append(this.g);
        sb.append(", openPrizeListAction=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
