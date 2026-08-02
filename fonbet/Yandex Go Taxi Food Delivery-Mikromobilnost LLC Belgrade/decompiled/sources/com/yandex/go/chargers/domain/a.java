package com.yandex.go.chargers.domain;

import defpackage.jqr;
import defpackage.kj;
import defpackage.mth;
import defpackage.ny61;
import defpackage.vp21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.am.g;

/* loaded from: classes.dex */
public final class a {
    public final g a;
    public final vp21 b;
    public final ru.yandex.taxi.launch.c c;

    public a(g gVar, vp21 vp21Var, ru.yandex.taxi.launch.c cVar) {
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
        ChargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1 chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ChargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1) {
            chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1 = (ChargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1) continuationImpl;
            int i2 = chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth b = aVar.c.b();
                    ChargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2 chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2 = new ChargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2(aVar, null);
                    chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label = 1;
                    if (kotlinx.coroutines.flow.e.z(b, chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$2, chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1) == coroutineSingletons) {
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
        chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1 = new ChargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1(aVar, continuationImpl);
        Object obj2 = chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAuthWaitingInteractor$waitForPhoneBecomeAvailable$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final boolean b() {
        g gVar = this.a;
        kj Ig = gVar.a.Ig();
        return (Ig == null || !gVar.g() || Ig.m) ? false : true;
    }

    public final jqr c() {
        return new jqr(new n(this.a.h(), new ChargersAuthWaitingInteractor$listenToAuthStatus$1(this, null)), new ChargersAuthWaitingInteractor$listenToAuthStatus$2(this, null), 3);
    }
}
