package com.yandex.go.places.impl.ui.main.map.my_places;

import defpackage.ny61;
import defpackage.s050;
import defpackage.vpr;
import defpackage.y050;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ y050 a;
    public final /* synthetic */ s050 b;

    public d(y050 y050Var, s050 s050Var) {
        this.a = y050Var;
        this.b = s050Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1 myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1;
        int i;
        y050 y050Var;
        if (continuation instanceof MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1) {
            myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1 = (MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
                y050 y050Var2 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.places.impl.domain.interactors.my.places.a aVar = y050Var2.y;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$3 = y050Var2;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = aVar.b(myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    y050Var = y050Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y050Var = (y050) myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$3;
                    kotlin.b.b(obj2);
                }
                y050Var.I = (List) obj2;
                this.b.l3(y050Var2.I);
                return zy11.a;
            }
        }
        myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1 = new MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
        y050 y050Var22 = this.a;
        if (i != 0) {
        }
        y050Var.I = (List) obj22;
        this.b.l3(y050Var22.I);
        return zy11.a;
    }
}
