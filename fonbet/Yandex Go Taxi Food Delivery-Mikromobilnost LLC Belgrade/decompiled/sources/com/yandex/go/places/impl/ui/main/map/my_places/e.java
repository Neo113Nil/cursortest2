package com.yandex.go.places.impl.ui.main.map.my_places;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.s050;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.y050;
import defpackage.z050;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements vpr {
    public final /* synthetic */ y050 a;
    public final /* synthetic */ s050 b;

    public e(y050 y050Var, s050 s050Var) {
        this.a = y050Var;
        this.b = s050Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1 myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1;
        int i;
        z050 z050Var;
        y050 y050Var;
        if (continuation instanceof MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1) {
            myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1 = (MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1) continuation;
            int i2 = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.label;
                y050 y050Var2 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    z050 z050Var2 = (z050) obj;
                    com.yandex.go.places.impl.domain.interactors.my.places.a aVar = y050Var2.y;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.L$0 = null;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.L$1 = null;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.L$2 = z050Var2;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.L$3 = y050Var2;
                    myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.label = 1;
                    obj2 = aVar.b(myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    z050Var = z050Var2;
                    y050Var = y050Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y050Var = (y050) myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.L$3;
                    z050Var = (z050) myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                Iterable<z050> iterable = (Iterable) obj2;
                ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                for (z050 z050Var3 : iterable) {
                    arrayList.add(new z050(z050Var3.a, z050Var3.b, z050Var3.c, z050Var3.d, z050Var != null && jl40.l(z050Var3.a, z050Var.a), z050Var3.f));
                }
                y050Var.I = arrayList;
                this.b.l3(y050Var2.I);
                return zy11.a;
            }
        }
        myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1 = new MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1(this, continuation);
        Object obj22 = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = myPlacesMapPresenter$attachView$$inlined$safeCollectIn$2$2$1.label;
        y050 y050Var22 = this.a;
        if (i != 0) {
        }
        Iterable<z050> iterable2 = (Iterable) obj22;
        ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
        while (r15.hasNext()) {
        }
        y050Var.I = arrayList2;
        this.b.l3(y050Var22.I);
        return zy11.a;
    }
}
