package com.yandex.go.walking.navigation.impl.domain.interactor;

import defpackage.ah00;
import defpackage.gh00;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes14.dex */
public final class b {
    public final ah00 a;
    public final po21 b;

    public b(ah00 ah00Var, po21 po21Var) {
        this.a = ah00Var;
        this.b = po21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WalkNavMapCameraInteractor$focusOnUserLocation$1 walkNavMapCameraInteractor$focusOnUserLocation$1;
        int i;
        if (continuationImpl instanceof WalkNavMapCameraInteractor$focusOnUserLocation$1) {
            walkNavMapCameraInteractor$focusOnUserLocation$1 = (WalkNavMapCameraInteractor$focusOnUserLocation$1) continuationImpl;
            int i2 = walkNavMapCameraInteractor$focusOnUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavMapCameraInteractor$focusOnUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavMapCameraInteractor$focusOnUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavMapCameraInteractor$focusOnUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    walkNavMapCameraInteractor$focusOnUserLocation$1.label = 1;
                    obj = ((e) this.b).h(walkNavMapCameraInteractor$focusOnUserLocation$1);
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
                ((gh00) this.a).D(ru.yandex.taxi.map.utils.a.G((mo21) obj), 17.0f, 200.0f, null);
                return zy11.a;
            }
        }
        walkNavMapCameraInteractor$focusOnUserLocation$1 = new WalkNavMapCameraInteractor$focusOnUserLocation$1(this, continuationImpl);
        Object obj2 = walkNavMapCameraInteractor$focusOnUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavMapCameraInteractor$focusOnUserLocation$1.label;
        if (i != 0) {
        }
        ((gh00) this.a).D(ru.yandex.taxi.map.utils.a.G((mo21) obj2), 17.0f, 200.0f, null);
        return zy11.a;
    }
}
