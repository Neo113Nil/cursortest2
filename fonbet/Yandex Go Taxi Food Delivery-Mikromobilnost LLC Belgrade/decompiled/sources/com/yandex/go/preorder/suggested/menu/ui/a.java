package com.yandex.go.preorder.suggested.menu.ui;

import com.yandex.go.zone.model.ZoneMode;
import defpackage.i1c0;
import defpackage.ny61;
import defpackage.s0c0;
import defpackage.vpr;
import defpackage.x6v0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.styling.f;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ PointType b;
    public final /* synthetic */ c c;

    public a(vpr vprVar, PointType pointType, c cVar) {
        this.a = vprVar;
        this.b = pointType;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1 suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1) {
            suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1 = (SuggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1) continuation;
            int i2 = suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = ((ZoneMode) obj).a;
                    if (str == null) {
                        str = "";
                    }
                    PointType pointType = this.b;
                    int i3 = pointType == null ? -1 : x6v0.a[pointType.ordinal()];
                    c cVar = this.c;
                    s0c0 s0c0Var = cVar.d;
                    i1c0 f = cVar.b.f(i3 == 1 ? ((f) s0c0Var).a(str) : ((f) s0c0Var).e(str));
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.L$0 = null;
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.L$1 = null;
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.L$2 = null;
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.L$3 = null;
                    suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1) == coroutineSingletons) {
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
        suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1 = new SuggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1(this, continuation);
        Object obj22 = suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPinFactory$getPinStyle$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
