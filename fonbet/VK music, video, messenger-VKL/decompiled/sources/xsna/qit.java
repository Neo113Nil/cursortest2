package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class qit implements kfn0 {
    @Override // xsna.kfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(long j) {
        ufx ufxVar = new ufx("apps.allowNotifications", new rf3(1), new r11(2));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new tt0(new jt(26), 23));
    }

    @Override // xsna.kfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(long j) {
        ufx ufxVar = new ufx("apps.denyNotifications", new com.vk.movika.sdk.android.defaultplayer.interactive.c(3), new ar(2));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new t7(new e60(29), 16));
    }

    @Override // xsna.kfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(long j) {
        ufx ufxVar = new ufx("apps.isNotificationsAllowed", new wq(2), new xq(2));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new e4t(new qm0(23), 2));
    }
}
