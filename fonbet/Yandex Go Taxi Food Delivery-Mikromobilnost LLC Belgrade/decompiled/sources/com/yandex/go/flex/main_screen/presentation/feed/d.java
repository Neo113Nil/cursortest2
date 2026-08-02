package com.yandex.go.flex.main_screen.presentation.feed;

import com.yandex.go.superapp.searchbar.impl.domain.g;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ e b;

    public d(g gVar, e eVar) {
        this.a = gVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1 mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1) {
            mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1 = (MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1) continuation;
            int i2 = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.L$0 = null;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.L$1 = null;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.L$2 = null;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1 = new MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
