package com.yandex.go.eboks.objects.domain;

import com.yandex.go.eboks.objects.api.MapObjectAction;
import defpackage.mhn;
import defpackage.nin;
import defpackage.ny61;
import defpackage.qgn;
import defpackage.qin;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ mhn c;

    public a(vpr vprVar, c cVar, mhn mhnVar) {
        this.a = vprVar;
        this.b = cVar;
        this.c = mhnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1 eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1;
        int i;
        Object qinVar;
        if (continuation instanceof EboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1) {
            eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1 = (EboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1) continuation;
            int i2 = eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    c cVar = this.b;
                    mhn mhnVar = this.c;
                    int i3 = qgn.a[((MapObjectAction) obj).ordinal()];
                    if (i3 == 1) {
                        cVar.b.a = mhnVar;
                        qinVar = new qin(mhnVar);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        cVar.b.a = null;
                        qinVar = new nin(mhnVar);
                    }
                    eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.L$0 = null;
                    eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.L$1 = null;
                    eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.L$2 = null;
                    eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.L$3 = null;
                    eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(qinVar, eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1) == coroutineSingletons) {
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
        eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1 = new EboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1(this, continuation);
        Object obj22 = eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
