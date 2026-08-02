package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.feature.qr.payments.internal.screens.list.data.entities.SubscriptionEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j1v0 {
    public final u8j0 a;
    public final PageHeaderEntity b;

    public /* synthetic */ j1v0(t8j0 t8j0Var, int i) {
        this((i & 1) != 0 ? new t8j0() : t8j0Var, (PageHeaderEntity) null);
    }

    public static j1v0 a(j1v0 j1v0Var, u8j0 u8j0Var) {
        PageHeaderEntity pageHeaderEntity = j1v0Var.b;
        j1v0Var.getClass();
        return new j1v0(u8j0Var, pageHeaderEntity);
    }

    public final j1v0 b(String str, SubscriptionEntity$Status subscriptionEntity$Status) {
        u8j0 u8j0Var = this.a;
        z1v0 z1v0Var = (z1v0) u8j0Var.a();
        if (z1v0Var == null) {
            return this;
        }
        if (z1v0Var instanceof z1v0) {
            return a(this, zka1.d(u8j0Var, new lxo0(22, z1v0Var, str, subscriptionEntity$Status)));
        }
        w511.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1v0)) {
            return false;
        }
        j1v0 j1v0Var = (j1v0) obj;
        return jl40.l(this.a, j1v0Var.a) && jl40.l(this.b, j1v0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PageHeaderEntity pageHeaderEntity = this.b;
        return hashCode + (pageHeaderEntity == null ? 0 : pageHeaderEntity.hashCode());
    }

    public final String toString() {
        return "SubscriptionListState(subscriptions=" + this.a + ", header=" + this.b + Extension.C_BRAKE;
    }

    public j1v0(u8j0 u8j0Var, PageHeaderEntity pageHeaderEntity) {
        this.a = u8j0Var;
        this.b = pageHeaderEntity;
    }

    public j1v0() {
        this((t8j0) null, 3);
    }
}
