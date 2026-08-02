package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

/* loaded from: classes9.dex */
public final class l0v0 {
    public final ButtonAction a;
    public final String b;
    public final PurchaseStatus c;
    public final UpgradeStatus d;
    public final String e;
    public final vr41 f;

    public l0v0(ButtonAction buttonAction, String str, PurchaseStatus purchaseStatus, UpgradeStatus upgradeStatus, String str2, vr41 vr41Var) {
        this.a = buttonAction;
        this.b = str;
        this.c = purchaseStatus;
        this.d = upgradeStatus;
        this.e = str2;
        this.f = vr41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0v0)) {
            return false;
        }
        l0v0 l0v0Var = (l0v0) obj;
        return this.a == l0v0Var.a && jl40.l(this.b, l0v0Var.b) && this.c == l0v0Var.c && this.d == l0v0Var.d && jl40.l(this.e, l0v0Var.e) && jl40.l(this.f, l0v0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        vr41 vr41Var = this.f;
        return hashCode3 + (vr41Var != null ? vr41Var.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionData(availableAction=" + this.a + ", subscriptionId=" + this.b + ", purchaseStatus=" + this.c + ", upgradeStatus=" + this.d + ", pendingPurchaseId=" + this.e + ", webViewParams=" + this.f + Extension.C_BRAKE;
    }
}
