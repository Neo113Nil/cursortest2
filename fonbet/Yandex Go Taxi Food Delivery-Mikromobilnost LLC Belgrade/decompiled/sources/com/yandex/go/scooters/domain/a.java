package com.yandex.go.scooters.domain;

import defpackage.jqr;
import defpackage.kj;
import defpackage.mth;
import defpackage.ny61;
import defpackage.vp21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final ru.yandex.taxi.am.g a;
    public final vp21 b;
    public final ru.yandex.taxi.launch.c c;

    public a(ru.yandex.taxi.am.g gVar, vp21 vp21Var, ru.yandex.taxi.launch.c cVar) {
        this.a = gVar;
        this.b = vp21Var;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ScootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1 scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ScootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1) {
            scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1 = (ScootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1) continuationImpl;
            int i2 = scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth b = aVar.c.b();
                    ScootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2 scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2 = new ScootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2(aVar, null);
                    scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label = 1;
                    if (kotlinx.coroutines.flow.e.z(b, scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2, scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1) == coroutineSingletons) {
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
        scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1 = new ScootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1(aVar, continuationImpl);
        Object obj2 = scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final boolean b() {
        ru.yandex.taxi.am.g gVar = this.a;
        kj Ig = gVar.a.Ig();
        return (Ig == null || !gVar.g() || Ig.m) ? false : true;
    }

    public final jqr c() {
        return new jqr(new kotlinx.coroutines.flow.n(this.a.h(), new ScootersAuthWaitingInteractor$listenToAuthStatus$1(this, null)), new ScootersAuthWaitingInteractor$listenToAuthStatus$2(this, null), 3);
    }
}
