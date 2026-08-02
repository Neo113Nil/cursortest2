package com.yandex.go.vault.flexsdk.descriptors.widget;

import defpackage.g8e;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/VaultsPagerWidgetData;", "", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/descriptors/widget/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class VaultsPagerWidgetData {
    public static final b Companion = new b();
    public static final i3y[] g = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(18)), null, null, null, null, null};
    public final List a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ VaultsPagerWidgetData(int i, int i2, String str, String str2, String str3, String str4, List list) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, VaultsPagerWidgetData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultsPagerWidgetData)) {
            return false;
        }
        VaultsPagerWidgetData vaultsPagerWidgetData = (VaultsPagerWidgetData) obj;
        return jl40.l(this.a, vaultsPagerWidgetData.a) && jl40.l(this.b, vaultsPagerWidgetData.b) && this.c == vaultsPagerWidgetData.c && jl40.l(this.d, vaultsPagerWidgetData.d) && jl40.l(this.e, vaultsPagerWidgetData.e) && jl40.l(this.f, vaultsPagerWidgetData.f);
    }

    public final int hashCode() {
        List list = this.a;
        return this.f.hashCode() + unr0.b(unr0.b(oyr.b(this.c, unr0.b((list == null ? 0 : list.hashCode()) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder s = xvz.s("VaultsPagerWidgetData(vaults=", this.a, ", prizeListTitle=", this.b, ", keyBalance=");
        smw0.t(this.c, ", keyIconTag=", this.d, ", lowBalanceNotificationTitle=", s);
        return g8e.r(s, this.e, ", lowBalanceNotificationSubtitle=", this.f, Extension.C_BRAKE);
    }
}
