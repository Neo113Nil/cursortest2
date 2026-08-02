package com.yandex.go.user_profile.main_menu.profile.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ ru.yandex.taxi.startup.launch.response.d a;

    public c(ru.yandex.taxi.startup.launch.response.d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1 mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1) {
            mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1 = (MainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1) continuation;
            int i2 = mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.L$0 = null;
                    mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.L$1 = null;
                    mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.L$2 = null;
                    mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1 = new MainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuUserProfileStatusRepository$getUserStatusFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
