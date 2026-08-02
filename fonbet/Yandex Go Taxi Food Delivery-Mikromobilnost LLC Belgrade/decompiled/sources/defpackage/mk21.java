package defpackage;

import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;

/* loaded from: classes15.dex */
public final class mk21 extends iqh {
    public final /* synthetic */ nk21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk21(nk21 nk21Var, w920 w920Var) {
        super(w920Var);
        this.b = nk21Var;
    }

    @Override // defpackage.iqh, defpackage.w920
    public final boolean e(ngz ngzVar) {
        int i = ngzVar.b;
        String str = ngzVar.c;
        nk21 nk21Var = this.b;
        if (i == 403 && str.equals("restricted_by_user_banned")) {
            nk21Var.b.a(19);
            super.e(ngzVar);
            return true;
        }
        if (i == 403 && str.equals(UpdateOrganizationResult.UserError.USERS_JSON_CODE)) {
            nk21Var.b.a(21);
            super.e(ngzVar);
            return true;
        }
        if (i == 403 && (str.equals("team_auth_is_forbidden") || str.equals("sso_auth_is_forbidden"))) {
            nk21Var.b.a(25);
            super.e(ngzVar);
            return true;
        }
        if (i != 429 || !str.equals("too_many_requests")) {
            return this.a.e(ngzVar);
        }
        nk21Var.b.a(22);
        super.e(ngzVar);
        return true;
    }
}
