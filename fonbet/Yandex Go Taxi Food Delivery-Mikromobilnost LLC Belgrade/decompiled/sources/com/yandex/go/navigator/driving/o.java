package com.yandex.go.navigator.driving;

import android.graphics.drawable.Drawable;
import defpackage.ekm;
import defpackage.ikm;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class o implements vpr {
    public final /* synthetic */ ikm a;

    public o(ikm ikmVar) {
        this.a = ikmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DrivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1 drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1;
        int i;
        Drawable drawable;
        if (continuation instanceof DrivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1) {
            drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1 = (DrivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.label;
                ikm ikmVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.design.utils.b bVar = ikmVar.P;
                    drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = bVar.g(24, drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        drawable = (Drawable) drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        ((ekm) ikmVar.Dg()).q(drawable, (Drawable) obj2);
                        return zy11.a;
                    }
                    kotlin.b.b(obj2);
                }
                drawable = (Drawable) obj2;
                ru.yandex.taxi.design.utils.b bVar2 = ikmVar.P;
                drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$0 = null;
                drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$1 = null;
                drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$2 = null;
                drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$3 = drawable;
                drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.label = 2;
                obj2 = bVar2.a(tje.u(24, bVar2.a), false, drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1);
            }
        }
        drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1 = new DrivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.label;
        ikm ikmVar2 = this.a;
        if (i != 0) {
        }
        drawable = (Drawable) obj22;
        ru.yandex.taxi.design.utils.b bVar22 = ikmVar2.P;
        drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$0 = null;
        drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$1 = null;
        drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$2 = null;
        drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.L$3 = drawable;
        drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1.label = 2;
        obj22 = bVar22.a(tje.u(24, bVar22.a), false, drivingModalPresenter$renderShadows$$inlined$safeCollectIn$1$2$1);
    }
}
