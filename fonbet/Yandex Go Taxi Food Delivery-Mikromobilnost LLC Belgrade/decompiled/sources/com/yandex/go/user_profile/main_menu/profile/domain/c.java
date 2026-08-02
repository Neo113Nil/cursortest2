package com.yandex.go.user_profile.main_menu.profile.domain;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.fullscreen.models.l;
import com.yandex.go.user_profile.main_menu.profile.models.UserProfileStyle;
import defpackage.m600;
import defpackage.ny61;
import defpackage.o600;
import defpackage.q600;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.am.m;

/* loaded from: classes8.dex */
public final class c implements o600 {
    public final m a;
    public final l b;
    public final m600 c;
    public final com.yandex.go.user_profile.main_menu.profile.repository.d d;
    public final com.yandex.go.user_profile.main_menu.profile.repository.a e;

    public c(m mVar, l lVar, m600 m600Var, com.yandex.go.user_profile.main_menu.profile.repository.d dVar, com.yandex.go.user_profile.main_menu.profile.repository.a aVar) {
        this.a = mVar;
        this.b = lVar;
        this.c = m600Var;
        this.d = dVar;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        MainMenuUserProfileInteractorImpl$getProfileStyle$1 mainMenuUserProfileInteractorImpl$getProfileStyle$1;
        int i;
        UserProfileExperiment.Type type;
        int i2;
        if (continuationImpl instanceof MainMenuUserProfileInteractorImpl$getProfileStyle$1) {
            mainMenuUserProfileInteractorImpl$getProfileStyle$1 = (MainMenuUserProfileInteractorImpl$getProfileStyle$1) continuationImpl;
            int i3 = mainMenuUserProfileInteractorImpl$getProfileStyle$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mainMenuUserProfileInteractorImpl$getProfileStyle$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mainMenuUserProfileInteractorImpl$getProfileStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuUserProfileInteractorImpl$getProfileStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mainMenuUserProfileInteractorImpl$getProfileStyle$1.label = 1;
                    obj = this.b.b(mainMenuUserProfileInteractorImpl$getProfileStyle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                UserProfileExperiment userProfileExperiment = (UserProfileExperiment) obj;
                type = userProfileExperiment.d;
                if (type == UserProfileExperiment.Type.UNKNOWN) {
                    boolean z = userProfileExperiment.f;
                    if (z) {
                        type = UserProfileExperiment.Type.WEB;
                    } else {
                        if (z) {
                            w511.b();
                            return null;
                        }
                        type = UserProfileExperiment.Type.NATIVE;
                    }
                }
                i2 = q600.a[type.ordinal()];
                if (i2 != 1) {
                    boolean i4 = userProfileExperiment.i();
                    if (i4) {
                        return UserProfileStyle.V2;
                    }
                    if (!i4) {
                        return UserProfileStyle.V1;
                    }
                    w511.b();
                    return null;
                }
                if (i2 == 2) {
                    return UserProfileStyle.V1;
                }
                if (i2 == 3) {
                    return UserProfileStyle.V2;
                }
                if (i2 == 4) {
                    return UserProfileStyle.V3;
                }
                w511.b();
                return null;
            }
        }
        mainMenuUserProfileInteractorImpl$getProfileStyle$1 = new MainMenuUserProfileInteractorImpl$getProfileStyle$1(this, continuationImpl);
        Object obj2 = mainMenuUserProfileInteractorImpl$getProfileStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuUserProfileInteractorImpl$getProfileStyle$1.label;
        if (i != 0) {
        }
        UserProfileExperiment userProfileExperiment2 = (UserProfileExperiment) obj2;
        type = userProfileExperiment2.d;
        if (type == UserProfileExperiment.Type.UNKNOWN) {
        }
        i2 = q600.a[type.ordinal()];
        if (i2 != 1) {
        }
    }

    public final g b() {
        return e.X(new m0(com.yandex.go.coroutines.b.d(this.a.f, new MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$start$1(null, this)), this.b.a(), new MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$1(this)), new MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1(null, this));
    }
}
