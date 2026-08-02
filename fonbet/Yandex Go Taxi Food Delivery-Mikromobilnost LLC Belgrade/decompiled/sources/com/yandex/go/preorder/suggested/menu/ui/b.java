package com.yandex.go.preorder.suggested.menu.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ PointType b;
    public final /* synthetic */ c c;

    public b(m0 m0Var, PointType pointType, c cVar) {
        this.a = m0Var;
        this.b = pointType;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuggestMenuPinFactory$getPinStyle$$inlined$map$1$1 suggestMenuPinFactory$getPinStyle$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuggestMenuPinFactory$getPinStyle$$inlined$map$1$1) {
            suggestMenuPinFactory$getPinStyle$$inlined$map$1$1 = (SuggestMenuPinFactory$getPinStyle$$inlined$map$1$1) continuation;
            int i2 = suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.L$0 = null;
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.L$1 = null;
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.L$2 = null;
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, suggestMenuPinFactory$getPinStyle$$inlined$map$1$1) == coroutineSingletons) {
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
        suggestMenuPinFactory$getPinStyle$$inlined$map$1$1 = new SuggestMenuPinFactory$getPinStyle$$inlined$map$1$1(this, continuation);
        Object obj2 = suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPinFactory$getPinStyle$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
