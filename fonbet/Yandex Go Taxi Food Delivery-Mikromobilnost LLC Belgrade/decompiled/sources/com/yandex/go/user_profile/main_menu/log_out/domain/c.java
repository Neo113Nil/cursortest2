package com.yandex.go.user_profile.main_menu.log_out.domain;

import com.yandex.go.user_profile.fullscreen.models.l;
import defpackage.j20;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.m;

/* loaded from: classes8.dex */
public final class c {
    public final l a;
    public final m b;
    public final j20 c;

    public c(l lVar, m mVar, j20 j20Var) {
        this.a = lVar;
        this.b = mVar;
        this.c = j20Var;
    }

    public final tpr a() {
        return e.t(e.n(this.a.a(), com.yandex.go.coroutines.b.d(this.b.f, new MainMenuLogOutInteractorImpl$logOutStateFlow$$inlined$start$1(null, this)), new b(((com.yandex.go.user_profile.settings.profile.data.b) this.c).a()), new MainMenuLogOutInteractorImpl$logOutStateFlow$2(4, this, c.class, "mapLogOutState", "mapLogOutState(Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment;Lru/yandex/taxi/am/AuthStatus;Z)Lcom/yandex/go/user_profile/main_menu/profile/repository/logout/presentation/MainMenuLogOutUiState;", 4)));
    }
}
