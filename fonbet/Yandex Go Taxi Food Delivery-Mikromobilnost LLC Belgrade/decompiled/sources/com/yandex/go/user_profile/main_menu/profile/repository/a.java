package com.yandex.go.user_profile.main_menu.profile.repository;

import defpackage.hm;
import defpackage.pwy0;
import defpackage.zuj0;
import defpackage.zy11;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.startup.launch.response.e;

/* loaded from: classes8.dex */
public final class a {
    public final e a;
    public final ru.yandex.taxi.profile.a b;
    public final hm c;
    public final pwy0 d;
    public final g e;
    public final zuj0 f;

    public a(e eVar, ru.yandex.taxi.profile.a aVar, hm hmVar, pwy0 pwy0Var, g gVar, zuj0 zuj0Var) {
        this.a = eVar;
        this.b = aVar;
        this.c = hmVar;
        this.d = pwy0Var;
        this.e = gVar;
        this.f = zuj0Var;
    }

    public final kotlinx.coroutines.flow.internal.g a() {
        return kotlinx.coroutines.flow.e.I(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.X(this.d.a(), new MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$$inlined$flatMapLatest$1(this, null)), new MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$$inlined$start$1(zy11.a, null)), new MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$2(this, null));
    }
}
