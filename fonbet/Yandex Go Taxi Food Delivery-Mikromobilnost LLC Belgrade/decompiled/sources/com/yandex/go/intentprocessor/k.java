package com.yandex.go.intentprocessor;

import android.app.Activity;
import android.content.Intent;
import defpackage.f600;
import defpackage.h3y;
import defpackage.m5u;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.tse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class k {
    public final Activity a;
    public final tse b;
    public final f600 c;
    public final ru.yandex.taxi.activity.i d;
    public final oep0 e;
    public final h3y f;
    public pzt0 g;

    public k(Activity activity, tse tseVar, f600 f600Var, ru.yandex.taxi.activity.i iVar, oep0 oep0Var, h3y h3yVar) {
        this.a = activity;
        this.b = tseVar;
        this.c = f600Var;
        this.d = iVar;
        this.e = oep0Var;
        this.f = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k kVar, Intent intent, ContinuationImpl continuationImpl) {
        NewIntentInteractorImpl$processIntent$1 newIntentInteractorImpl$processIntent$1;
        int i;
        o5u o5uVar;
        Activity activity = kVar.a;
        if (continuationImpl instanceof NewIntentInteractorImpl$processIntent$1) {
            newIntentInteractorImpl$processIntent$1 = (NewIntentInteractorImpl$processIntent$1) continuationImpl;
            int i2 = newIntentInteractorImpl$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                newIntentInteractorImpl$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = newIntentInteractorImpl$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = newIntentInteractorImpl$processIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = (c) kVar.f.get();
                    oep0 oep0Var = kVar.e;
                    newIntentInteractorImpl$processIntent$1.L$0 = null;
                    newIntentInteractorImpl$processIntent$1.label = 1;
                    obj = cVar.a(oep0Var, intent, newIntentInteractorImpl$processIntent$1);
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
                o5uVar = (o5u) obj;
                if ((o5uVar instanceof m5u) && ((m5u) o5uVar).b) {
                    activity.setIntent(new Intent(activity, activity.getClass()).setAction("android.intent.action.MAIN"));
                }
                return o5uVar;
            }
        }
        newIntentInteractorImpl$processIntent$1 = new NewIntentInteractorImpl$processIntent$1(kVar, continuationImpl);
        Object obj2 = newIntentInteractorImpl$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = newIntentInteractorImpl$processIntent$1.label;
        if (i != 0) {
        }
        o5uVar = (o5u) obj2;
        if (o5uVar instanceof m5u) {
            activity.setIntent(new Intent(activity, activity.getClass()).setAction("android.intent.action.MAIN"));
        }
        return o5uVar;
    }

    public static void c(k kVar, Intent intent) {
        NewIntentInteractor$processIntentAsync$1 newIntentInteractor$processIntentAsync$1 = new NewIntentInteractor$processIntentAsync$1();
        pzt0 pzt0Var = kVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        kVar.g = com.yandex.go.coroutines.b.g(kVar.b, null, null, new NewIntentInteractorImpl$processIntentAsync$1(kVar, intent, newIntentInteractor$processIntentAsync$1, null), 3);
    }

    public final void b(Intent intent) {
        this.d.a(intent);
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = com.yandex.go.coroutines.b.g(this.b, null, null, new NewIntentInteractorImpl$handleNewIntent$1(this, intent, null), 3);
        this.a.setIntent(intent);
        this.c.f();
    }
}
