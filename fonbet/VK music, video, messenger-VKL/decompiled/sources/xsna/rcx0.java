package xsna;

/* compiled from: WatchTogetherMuteHandler.kt */
/* loaded from: classes7.dex */
public final class rcx0 {
    public final com.vk.voip.ui.hint.a a;
    public final icx0 b;
    public final com.vk.voip.b c;
    public final io.reactivex.rxjava3.disposables.b d;

    public rcx0(com.vk.voip.ui.hint.a aVar, vqe0 vqe0Var, icx0 icx0Var, com.vk.voip.b bVar) {
        this.a = aVar;
        this.b = icx0Var;
        this.c = bVar;
        io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar2;
        if (((Boolean) vqe0Var.invoke()).booleanValue()) {
            io.reactivex.rxjava3.internal.operators.observable.q d = icx0Var.d();
            asu0 asu0Var = asu0.a;
            bVar2.b(d.a0(asu0Var.d()).subscribe(new rt10(new pj1(1, this, rcx0.class, "onMuteStatChanged", "onMuteStatChanged(Z)V", 0, 12), 27)));
            bVar2.b(icx0Var.f(true).a0(asu0Var.d()).subscribe(new qtq0(new y89(1, this, rcx0.class, "onRolesChanged", "onRolesChanged(Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;)V", 0, 12), 8)));
            io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(icx0Var.f(false), icx0Var.d(), new tuz(new lq2(12), 26));
            m.getClass();
            bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.j2(new io.reactivex.rxjava3.internal.operators.observable.y(m, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a)).a0(asu0Var.d()).subscribe(new bpt0(new l3f(1, this, rcx0.class, "onWatchTogetherAllowedChanged", "onWatchTogetherAllowedChanged(Z)V", 0, 11), 6)));
        }
    }
}
