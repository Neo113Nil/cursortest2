package com.yandex.go.taxi.main;

import defpackage.bt00;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements vpr {
    public final /* synthetic */ h a;

    public g(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1 shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1;
        int i;
        bt00 bt00Var;
        if (continuation instanceof ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1) {
            shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1 = (ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1) continuation;
            int i2 = shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    h hVar = this.a;
                    bt00 bt00Var2 = hVar.A;
                    shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.L$0 = null;
                    shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.L$1 = null;
                    shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.L$2 = null;
                    shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.L$3 = bt00Var2;
                    shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.I$0 = 1;
                    shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.label = 1;
                    obj2 = h.Kg(hVar, shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bt00Var = bt00Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.I$0;
                    bt00Var = (bt00) shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.L$3;
                    kotlin.b.b(obj2);
                }
                ((ru.yandex.taxi.map_common.style.source.e) bt00Var).c(i3, (String) obj2);
                return zy11.a;
            }
        }
        shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1 = new ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1(this, continuation);
        Object obj22 = shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3$2$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        ((ru.yandex.taxi.map_common.style.source.e) bt00Var).c(i32, (String) obj22);
        return zy11.a;
    }
}
