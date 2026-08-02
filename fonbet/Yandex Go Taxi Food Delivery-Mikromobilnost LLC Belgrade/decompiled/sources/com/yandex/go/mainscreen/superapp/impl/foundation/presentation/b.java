package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.flex.main_screen.data.sticky.SectionUpdaterRepository;
import defpackage.ney;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w4q0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1 superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1;
        int i;
        if (continuation instanceof SuperAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1) {
            superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1 = (SuperAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.label;
                e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ney neyVar = eVar.T;
                    superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.label = 1;
                    if (ru.yandex.taxi.lifecycle.c.e(neyVar.a, Lifecycle.Event.ON_START, superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                ((SectionUpdaterRepository) eVar.E).a(w4q0.d);
                return zy11.a;
            }
        }
        superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1 = new SuperAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1$2$1.label;
        e eVar2 = this.a;
        if (i != 0) {
        }
        ((SectionUpdaterRepository) eVar2.E).a(w4q0.d);
        return zy11.a;
    }
}
