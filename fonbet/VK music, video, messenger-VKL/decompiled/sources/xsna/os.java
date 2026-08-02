package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AccountSettingsQueueImpl.kt */
/* loaded from: classes.dex */
public final class os implements ns {
    public final vre0 a;
    public sq9 b;

    public os(vre0 vre0Var) {
        this.a = vre0Var;
    }

    @Override // xsna.ns
    public final synchronized void a(UserId userId, fb3 fb3Var) {
        if (this.b != null) {
            this.a.f("accountsettings_");
            sq9 sq9Var = this.b;
            if (sq9Var != null) {
                sq9Var.cancel();
            }
            this.b = null;
        }
        this.b = vre0.e(this.a, new rs(userId), "accountsettings_", null, fb3Var, null, null, 108);
    }

    @Override // xsna.ns
    public final synchronized void stop() {
        if (this.b != null) {
            this.a.f("accountsettings_");
            sq9 sq9Var = this.b;
            if (sq9Var != null) {
                sq9Var.cancel();
            }
            this.b = null;
        }
    }
}
