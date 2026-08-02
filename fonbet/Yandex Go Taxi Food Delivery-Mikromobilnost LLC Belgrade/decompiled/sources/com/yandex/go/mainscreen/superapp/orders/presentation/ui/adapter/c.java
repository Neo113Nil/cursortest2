package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1 superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1;
        int i;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        if (continuation instanceof SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1) {
            superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1 = (SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1) continuation;
            int i2 = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) obj;
                    if (uiStateDrawableWrapper2 != null) {
                        int color = this.b.a.getColor(mqg0.white);
                        uiStateDrawableWrapper2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        uiStateDrawableWrapper = pkf.g(uiStateDrawableWrapper2, uiStateDrawableWrapper2.getTag() + color, null);
                    } else {
                        uiStateDrawableWrapper = null;
                    }
                    superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.L$0 = null;
                    superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.L$1 = null;
                    superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.L$2 = null;
                    superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.L$3 = null;
                    superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(uiStateDrawableWrapper, superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1 = new SuperappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardUiStateInteractor$ratingUnselectedImageFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
