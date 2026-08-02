package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.dto.auth.VKLightAccount;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import kotlin.Pair;
import xsna.usi0;
import xsna.vdk;

/* compiled from: SessionManagementInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class gui0 extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "SessionManagement";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        UserId userId;
        vdk.a aVar;
        vj a;
        fhq0 c;
        vj a2;
        fhq0 c2;
        SessionManagementComponent sessionManagementComponent = (SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class));
        StatInteractorComponent statInteractorComponent = (StatInteractorComponent) c().a(fpf0.a(StatInteractorComponent.class));
        mui0 J2 = sessionManagementComponent.J2();
        sxi0 B2 = sessionManagementComponent.B2();
        mxi0 ie = statInteractorComponent.ie();
        J2.c();
        boolean z = false;
        if (!Preference.f("multi_account_toggles_prefs").getBoolean("multi_account_migration_from_old_storage", false)) {
            usi0.a i = J2.i();
            if (i == null || (c2 = i.c()) == null || (userId = c2.b()) == null) {
                userId = UserId.d;
            }
            VKLightAccount g = q6r0.g();
            if (epx.f(g.b, userId)) {
                if (epx.f(g.h, (i == null || (a2 = i.a()) == null) ? null : a2.e())) {
                    Preference.f("multi_account_toggles_prefs").edit().putBoolean("multi_account_migration_from_old_storage", true).apply();
                }
            }
            if (fkq0.c(g.b) || i == null) {
                if (i == null) {
                    aVar = vdk.a.NONE_NEW_NULL;
                } else {
                    m6r0 f = q6r0.f();
                    boolean z2 = epx.f(i.c().b(), g.b) && !epx.f(i.a().e(), g.h);
                    if (epx.f(i.c().b(), f.y()) && !epx.f(i.a().e(), f.k())) {
                        z = true;
                    }
                    if (z2 || z) {
                        q6r0.b = VKLightAccount.zb(q6r0.g(), null, null, null, null, null, null, i.a().e(), null, i.a().d(), i.a().c(), 1215);
                        m6r0 f2 = q6r0.f();
                        f2.C(i.a().e());
                        f2.D(i.a().d());
                        f2.F(i.a().c());
                        q6r0.k(f2, true);
                        aVar = (z2 && z) ? vdk.a.UPDATED_BY_LIGHT_AND_FULL_UID : z2 ? vdk.a.UPDATED_BY_LIGHT_UID : vdk.a.UPDATED_BY_FULL_UID;
                    } else {
                        aVar = vdk.a.NONE;
                    }
                }
                if (aVar.i()) {
                    Preference.f("multi_account_toggles_prefs").edit().putBoolean("multi_account_migration_from_old_storage", true).apply();
                    ie.c(pn00.k(new Pair("migration_reason", "updated_new_to_old"), new Pair("migration_details", aVar.h())));
                } else {
                    m6r0 f3 = q6r0.f();
                    if (f3.A()) {
                        String k = f3.k();
                        if (k == null) {
                            k = "";
                        }
                        vj vjVar = new vj(k, f3.l(), f3.x());
                        fhq0 fhq0Var = new fhq0(f3.y(), AccountProfileType.NORMAL);
                        UtilityTokens.CREATOR.getClass();
                        usi0.a aVar2 = new usi0.a(vjVar, fhq0Var, UtilityTokens.c);
                        if (i == null) {
                            B2.l(aVar2);
                        } else {
                            B2.j(i, aVar2);
                        }
                        UserId y = f3.y();
                        String k2 = f3.k();
                        UserId userId2 = g.b;
                        String str = g.h;
                        UserId b = (i == null || (c = i.c()) == null) ? null : c.b();
                        String e = (i == null || (a = i.a()) == null) ? null : a.e();
                        ie.c(pn00.k(new Pair("migration_reason", "updated_old_to_new"), new Pair("migration_old_light_state", vdk.a(userId2, str)), new Pair("migration_old_full_state", vdk.a(y, k2)), new Pair("migration_new_state", vdk.a(b, e)), new Pair("migration_uid_relation_old_light", vdk.d(userId2, b)), new Pair("migration_uid_relation_old_full", vdk.d(y, b)), new Pair("migration_token_relation_old_light", vdk.c(str, e)), new Pair("migration_token_relation_old_full", vdk.c(k2, e)), new Pair("migration_target_by_old_light", vdk.b(userId2, b, str)), new Pair("migration_target_by_old_full", vdk.b(y, b, k2)), new Pair("migration_old_sync", aVar.h())));
                        Preference.f("multi_account_toggles_prefs").edit().putBoolean("multi_account_migration_from_old_storage", true).apply();
                    } else {
                        Preference.f("multi_account_toggles_prefs").edit().putBoolean("multi_account_migration_from_old_storage", true).apply();
                        ie.c(pn00.k(new Pair("migration_reason", "skip_old_to_new_old_full_uid_invalid"), new Pair("migration_old_full_state", vdk.a(f3.y(), f3.k())), new Pair("migration_old_sync", aVar.h())));
                    }
                }
            } else {
                B2.h(i);
                Preference.f("multi_account_toggles_prefs").edit().putBoolean("multi_account_migration_from_old_storage", true).apply();
            }
        }
        return s3q0.a;
    }
}
