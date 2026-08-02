package xsna;

import com.vk.superapp.api.dto.account.ProfileNavigationInfo;

/* compiled from: SuperAppSecurityIndicatorRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class gbn0 implements fbn0 {
    public final v7e0 a;
    public final io.reactivex.rxjava3.subjects.d<ProfileNavigationInfo.SecurityRecommendationIndicator> b = io.reactivex.rxjava3.subjects.d.N0();

    public gbn0(v7e0 v7e0Var) {
        this.a = v7e0Var;
    }

    @Override // xsna.fbn0
    public final ProfileNavigationInfo.SecurityRecommendationIndicator a() {
        return this.b.P0();
    }

    @Override // xsna.fbn0
    public final io.reactivex.rxjava3.core.a b() {
        return this.a.b();
    }

    @Override // xsna.fbn0
    public final io.reactivex.rxjava3.subjects.d c() {
        io.reactivex.rxjava3.internal.operators.observable.j1 U = v9n0.a().U(new cxd0(new fo20(29), 7));
        io.reactivex.rxjava3.subjects.d<ProfileNavigationInfo.SecurityRecommendationIndicator> dVar = this.b;
        U.subscribe(dVar);
        return dVar;
    }

    @Override // xsna.fbn0
    public final void d() {
        this.b.onNext(ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING);
    }
}
