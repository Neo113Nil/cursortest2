package defpackage;

import com.yandex.alicekit.core.permissions.Permission;

/* loaded from: classes15.dex */
public final class os10 implements mza0 {
    public final /* synthetic */ ps10 a;

    public os10(ps10 ps10Var) {
        this.a = ps10Var;
    }

    @Override // defpackage.mza0
    public final void a(nza0 nza0Var) {
        ps10 ps10Var = this.a;
        nu10 nu10Var = ps10Var.F;
        String str = nu10Var != null ? nu10Var.g : null;
        String str2 = nu10Var != null ? nu10Var.f : null;
        if (nza0Var.a()) {
            ps10.D(ps10Var.j, str, str2);
        } else if (nza0Var.b(Permission.WRITE_EXTERNAL_STORAGE)) {
            ps10Var.l.g(oyh0.disk_permission_blocked_message, oyh0.button_settings, oyh0.button_cancel);
        }
    }
}
