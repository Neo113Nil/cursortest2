package com.yandex.go.pin.interactor;

import defpackage.i1c0;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.zdt0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;
    public final ru.yandex.taxi.address.interactor.a b;

    public a(e eVar, ru.yandex.taxi.address.interactor.a aVar) {
        this.a = eVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kb5 kb5Var, ContinuationImpl continuationImpl) {
        PinV2OverrideStyleInteractor$overrideStyle$1 pinV2OverrideStyleInteractor$overrideStyle$1;
        int i;
        zdt0 zdt0Var;
        if (continuationImpl instanceof PinV2OverrideStyleInteractor$overrideStyle$1) {
            pinV2OverrideStyleInteractor$overrideStyle$1 = (PinV2OverrideStyleInteractor$overrideStyle$1) continuationImpl;
            int i2 = pinV2OverrideStyleInteractor$overrideStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinV2OverrideStyleInteractor$overrideStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinV2OverrideStyleInteractor$overrideStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinV2OverrideStyleInteractor$overrideStyle$1.label;
                if (i != 0) {
                    b.b(obj);
                    pinV2OverrideStyleInteractor$overrideStyle$1.L$0 = null;
                    pinV2OverrideStyleInteractor$overrideStyle$1.L$1 = this;
                    pinV2OverrideStyleInteractor$overrideStyle$1.label = 1;
                    obj = this.b.a(kb5Var, pinV2OverrideStyleInteractor$overrideStyle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) pinV2OverrideStyleInteractor$overrideStyle$1.L$1;
                    b.b(obj);
                }
                zdt0Var = (zdt0) obj;
                e eVar = this.a;
                if (zdt0Var != null) {
                    Integer c = eVar.c(zdt0Var.a);
                    Integer p = eVar.p(zdt0Var.b);
                    if (c != null && p != null) {
                        return new i1c0(p.intValue(), c.intValue());
                    }
                }
                return null;
            }
        }
        pinV2OverrideStyleInteractor$overrideStyle$1 = new PinV2OverrideStyleInteractor$overrideStyle$1(this, continuationImpl);
        Object obj2 = pinV2OverrideStyleInteractor$overrideStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinV2OverrideStyleInteractor$overrideStyle$1.label;
        if (i != 0) {
        }
        zdt0Var = (zdt0) obj2;
        e eVar2 = this.a;
        if (zdt0Var != null) {
        }
        return null;
    }
}
