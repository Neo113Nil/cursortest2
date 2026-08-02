package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCorePermissionStat$TypePermissionChange;
import com.vk.stat.scheme.SchemeStat$TypeAction;

/* compiled from: PermissionStatSubscriber.kt */
/* loaded from: classes11.dex */
public final class cy90 implements gzs<s3q0> {
    public static void a(boolean z) {
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsCorePermissionStat$TypePermissionChange(MobileOfficialAppsCorePermissionStat$TypePermissionChange.Permission.GEO, z ? MobileOfficialAppsCorePermissionStat$TypePermissionChange.State.GRANTED : MobileOfficialAppsCorePermissionStat$TypePermissionChange.State.DENIED), 3);
        iid0Var.f = c;
        iid0Var.g = b;
        iid0Var.q();
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        PermissionHelper.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 r = PermissionHelper.r(PermissionHelper.i);
        asu0.a.getClass();
        ver0.a(r.a0(asu0.i()).subscribe(new k460(new aej(this, 3), 1)));
        return s3q0.a;
    }
}
