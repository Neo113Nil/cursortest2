package com.yandex.go.preorder.suggested.menu.ui;

import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.c0c0;
import defpackage.f1h0;
import defpackage.g92;
import defpackage.gyt0;
import defpackage.i1c0;
import defpackage.i3y;
import defpackage.mth;
import defpackage.ny61;
import defpackage.r0c0;
import defpackage.s0c0;
import defpackage.tje;
import defpackage.x6v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.map.SourceOnMapControl;
import ru.yandex.taxi.zonemodes.g;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.pin.api.widget.a a;
    public final r0c0 b;
    public final j c;
    public final s0c0 d;

    public c(com.yandex.go.pin.api.widget.a aVar, r0c0 r0c0Var, j jVar, s0c0 s0c0Var) {
        this.a = aVar;
        this.b = r0c0Var;
        this.c = jVar;
        this.d = s0c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r4 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PointType pointType, ContinuationImpl continuationImpl) {
        SuggestMenuPinFactory$createPinComponent$1 suggestMenuPinFactory$createPinComponent$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        PointType pointType2;
        Object b;
        Object obj2;
        PinV2Component pinV2Component;
        if (continuationImpl instanceof SuggestMenuPinFactory$createPinComponent$1) {
            suggestMenuPinFactory$createPinComponent$1 = (SuggestMenuPinFactory$createPinComponent$1) continuationImpl;
            int i2 = suggestMenuPinFactory$createPinComponent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPinFactory$createPinComponent$1.label = i2 - Integer.MIN_VALUE;
                obj = suggestMenuPinFactory$createPinComponent$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPinFactory$createPinComponent$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pointType2 = pointType;
                    suggestMenuPinFactory$createPinComponent$1.L$0 = pointType2;
                    suggestMenuPinFactory$createPinComponent$1.label = 1;
                    b = this.a.b(suggestMenuPinFactory$createPinComponent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pinV2Component = (PinV2Component) suggestMenuPinFactory$createPinComponent$1.L$3;
                        obj2 = suggestMenuPinFactory$createPinComponent$1.L$1;
                        kotlin.b.b(obj);
                        pinV2Component.updateControlStyle((i1c0) obj);
                        return obj2;
                    }
                    PointType pointType3 = (PointType) suggestMenuPinFactory$createPinComponent$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    pointType2 = pointType3;
                }
                PinV2Component pinV2Component2 = (PinV2Component) b;
                pinV2Component2.updateControlState(new SourceOnMapControl.a(new c0c0(tje.y((pointType2 != null ? -1 : x6v0.a[pointType2.ordinal()]) != 1 ? f1h0.ic_destination_pin_24 : f1h0.ic_source_pin_24, pinV2Component2.getContext())), null, null, false, false, null, null, 2046));
                suggestMenuPinFactory$createPinComponent$1.L$0 = null;
                suggestMenuPinFactory$createPinComponent$1.L$1 = b;
                suggestMenuPinFactory$createPinComponent$1.L$2 = null;
                suggestMenuPinFactory$createPinComponent$1.L$3 = pinV2Component2;
                suggestMenuPinFactory$createPinComponent$1.label = 2;
                int i4 = 6;
                i3y b2 = kotlin.a.b(LazyThreadSafetyMode.NONE, new gyt0(i4, pointType2, this));
                j jVar = this.c;
                obj = e.y(com.yandex.go.coroutines.b.k(new mth(new b(jVar.d(e.t(new g(((k) jVar.d).j.b()))), pointType2, this), i4), 100L, new g92(i3, (i1c0) b2.getValue())), suggestMenuPinFactory$createPinComponent$1);
                if (obj != coroutineSingletons) {
                    obj2 = b;
                    pinV2Component = pinV2Component2;
                    pinV2Component.updateControlStyle((i1c0) obj);
                    return obj2;
                }
                return coroutineSingletons;
            }
        }
        suggestMenuPinFactory$createPinComponent$1 = new SuggestMenuPinFactory$createPinComponent$1(this, continuationImpl);
        obj = suggestMenuPinFactory$createPinComponent$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPinFactory$createPinComponent$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        PinV2Component pinV2Component22 = (PinV2Component) b;
        pinV2Component22.updateControlState(new SourceOnMapControl.a(new c0c0(tje.y((pointType2 != null ? -1 : x6v0.a[pointType2.ordinal()]) != 1 ? f1h0.ic_destination_pin_24 : f1h0.ic_source_pin_24, pinV2Component22.getContext())), null, null, false, false, null, null, 2046));
        suggestMenuPinFactory$createPinComponent$1.L$0 = null;
        suggestMenuPinFactory$createPinComponent$1.L$1 = b;
        suggestMenuPinFactory$createPinComponent$1.L$2 = null;
        suggestMenuPinFactory$createPinComponent$1.L$3 = pinV2Component22;
        suggestMenuPinFactory$createPinComponent$1.label = 2;
        int i42 = 6;
        i3y b22 = kotlin.a.b(LazyThreadSafetyMode.NONE, new gyt0(i42, pointType2, this));
        j jVar2 = this.c;
        obj = e.y(com.yandex.go.coroutines.b.k(new mth(new b(jVar2.d(e.t(new g(((k) jVar2.d).j.b()))), pointType2, this), i42), 100L, new g92(i32, (i1c0) b22.getValue())), suggestMenuPinFactory$createPinComponent$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
