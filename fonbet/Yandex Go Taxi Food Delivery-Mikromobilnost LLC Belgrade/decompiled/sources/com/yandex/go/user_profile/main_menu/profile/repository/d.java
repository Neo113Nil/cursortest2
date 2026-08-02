package com.yandex.go.user_profile.main_menu.profile.repository;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.fullscreen.models.f;
import com.yandex.go.user_profile.fullscreen.models.l;
import defpackage.jl40;
import defpackage.pdc;
import defpackage.tpr;
import defpackage.v600;
import defpackage.zuj0;
import java.util.Iterator;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.startup.launch.response.e;

/* loaded from: classes8.dex */
public final class d {
    public final l a;
    public final e b;
    public final ru.yandex.taxi.widget.c c;
    public final h d;
    public final pdc e;
    public final zuj0 f;

    public d(l lVar, e eVar, ru.yandex.taxi.widget.c cVar, h hVar, pdc pdcVar, zuj0 zuj0Var) {
        this.a = lVar;
        this.b = eVar;
        this.c = cVar;
        this.d = hVar;
        this.e = pdcVar;
        this.f = zuj0Var;
    }

    public static final FormattedText a(d dVar, UserProfileExperiment userProfileExperiment, String str) {
        Object obj;
        dVar.getClass();
        Iterator it = userProfileExperiment.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((UserProfileExperiment.UserProfileStatusParams) obj).a, str)) {
                break;
            }
        }
        UserProfileExperiment.UserProfileStatusParams userProfileStatusParams = (UserProfileExperiment.UserProfileStatusParams) obj;
        if (userProfileStatusParams != null) {
            return userProfileStatusParams.b;
        }
        return null;
    }

    public static f d(UserProfileExperiment userProfileExperiment, String str) {
        Object obj;
        Iterator it = userProfileExperiment.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((UserProfileExperiment.UserProfileStatusParams) obj).a, str)) {
                break;
            }
        }
        UserProfileExperiment.UserProfileStatusParams userProfileStatusParams = (UserProfileExperiment.UserProfileStatusParams) obj;
        if (userProfileStatusParams != null) {
            return userProfileStatusParams.c;
        }
        return null;
    }

    public final tpr b() {
        return com.yandex.go.coroutines.b.d(new m0(com.yandex.go.coroutines.b.d(new c(new ru.yandex.taxi.startup.launch.response.d(new ru.yandex.taxi.startup.launch.response.b(this.b.f))), new MainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$start$1(this, null)), this.a.a(), new MainMenuUserProfileStatusRepository$getStatusBackgroundStateFlow$1(this)), new MainMenuUserProfileStatusRepository$getStatusBackgroundStateFlow$$inlined$start$1(v600.a, null));
    }

    public final tpr c() {
        return com.yandex.go.coroutines.b.d(new m0(com.yandex.go.coroutines.b.d(new c(new ru.yandex.taxi.startup.launch.response.d(new ru.yandex.taxi.startup.launch.response.b(this.b.f))), new MainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$start$1(this, null)), this.a.a(), new MainMenuUserProfileStatusRepository$getStatusNameFlow$1(this, null)), new MainMenuUserProfileStatusRepository$getStatusNameFlow$$inlined$start$1("", null));
    }
}
