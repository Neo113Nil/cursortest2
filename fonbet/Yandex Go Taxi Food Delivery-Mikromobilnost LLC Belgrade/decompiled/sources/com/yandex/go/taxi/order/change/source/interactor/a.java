package com.yandex.go.taxi.order.change.source.interactor;

import android.content.Context;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import defpackage.bc9;
import defpackage.gpg0;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.s8o;
import defpackage.ufu;
import defpackage.wa4;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.taxi.order.change.source.data.e a;
    public final pdc b;
    public final Context c;

    public a(com.yandex.go.taxi.order.change.source.data.e eVar, pdc pdcVar, Context context) {
        this.a = eVar;
        this.b = pdcVar;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bc9 bc9Var, ContinuationImpl continuationImpl) {
        AvailableCircleZoneInteractor$getAvailableCircleZone$1 availableCircleZoneInteractor$getAvailableCircleZone$1;
        int i;
        if (continuationImpl instanceof AvailableCircleZoneInteractor$getAvailableCircleZone$1) {
            availableCircleZoneInteractor$getAvailableCircleZone$1 = (AvailableCircleZoneInteractor$getAvailableCircleZone$1) continuationImpl;
            int i2 = availableCircleZoneInteractor$getAvailableCircleZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availableCircleZoneInteractor$getAvailableCircleZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = availableCircleZoneInteractor$getAvailableCircleZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availableCircleZoneInteractor$getAvailableCircleZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    availableCircleZoneInteractor$getAvailableCircleZone$1.L$0 = bc9Var;
                    availableCircleZoneInteractor$getAvailableCircleZone$1.label = 1;
                    obj = this.a.a.b(availableCircleZoneInteractor$getAvailableCircleZone$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bc9Var = (bc9) availableCircleZoneInteractor$getAvailableCircleZone$1.L$0;
                    kotlin.b.b(obj);
                }
                ChangeSourcePointExperiment changeSourcePointExperiment = (ChangeSourcePointExperiment) obj;
                zzs zzsVar = bc9Var.b;
                String str = changeSourcePointExperiment.d.e;
                pdc pdcVar = this.b;
                kdc b = ((ufu) pdcVar).b(str);
                Context context = this.c;
                Integer valueOf = b == null ? Integer.valueOf(s8o.m(b, context)) : null;
                int intValue = valueOf == null ? valueOf.intValue() : context.getColor(gpg0.available_zone_circle_fill_color);
                kdc b2 = ((ufu) pdcVar).b(changeSourcePointExperiment.d.f);
                Integer valueOf2 = b2 != null ? Integer.valueOf(s8o.m(b2, context)) : null;
                return new wa4(zzsVar, intValue, valueOf2 == null ? valueOf2.intValue() : context.getColor(gpg0.available_zone_circle_stroke_color), bc9Var.d);
            }
        }
        availableCircleZoneInteractor$getAvailableCircleZone$1 = new AvailableCircleZoneInteractor$getAvailableCircleZone$1(this, continuationImpl);
        Object obj2 = availableCircleZoneInteractor$getAvailableCircleZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availableCircleZoneInteractor$getAvailableCircleZone$1.label;
        if (i != 0) {
        }
        ChangeSourcePointExperiment changeSourcePointExperiment2 = (ChangeSourcePointExperiment) obj2;
        zzs zzsVar2 = bc9Var.b;
        String str2 = changeSourcePointExperiment2.d.e;
        pdc pdcVar2 = this.b;
        kdc b3 = ((ufu) pdcVar2).b(str2);
        Context context2 = this.c;
        if (b3 == null) {
        }
        if (valueOf == null) {
        }
        kdc b22 = ((ufu) pdcVar2).b(changeSourcePointExperiment2.d.f);
        if (b22 != null) {
        }
        return new wa4(zzsVar2, intValue, valueOf2 == null ? valueOf2.intValue() : context2.getColor(gpg0.available_zone_circle_stroke_color), bc9Var.d);
    }
}
