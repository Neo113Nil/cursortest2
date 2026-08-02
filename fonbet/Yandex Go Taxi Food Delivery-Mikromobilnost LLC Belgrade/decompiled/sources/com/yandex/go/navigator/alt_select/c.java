package com.yandex.go.navigator.alt_select;

import android.graphics.drawable.Drawable;
import defpackage.hv1;
import defpackage.mv1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AltSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1 altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1;
        int i;
        if (continuation instanceof AltSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1) {
            altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1 = (AltSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.label;
                e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.design.utils.b bVar = eVar.M;
                    altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = bVar.g(24, altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                ((hv1) eVar.Dg()).render(new mv1((Drawable) obj2));
                return zy11.a;
            }
        }
        altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1 = new AltSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1$2$1.label;
        e eVar2 = this.a;
        if (i != 0) {
        }
        ((hv1) eVar2.Dg()).render(new mv1((Drawable) obj22));
        return zy11.a;
    }
}
