package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.ehe0;
import defpackage.k0b0;
import defpackage.lwz0;
import defpackage.mwz0;
import defpackage.nwz0;
import defpackage.ny61;
import defpackage.x8z;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class i {
    public final k0b0 a;
    public final ru.yandex.taxi.systemrequeirements.location.n b;
    public final x8z c;
    public final ehe0 d;

    public i(k0b0 k0b0Var, ru.yandex.taxi.systemrequeirements.location.n nVar, x8z x8zVar, ehe0 ehe0Var) {
        this.a = k0b0Var;
        this.b = nVar;
        this.c = x8zVar;
        this.d = ehe0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CollectLocationErrorsInteractor$onLocationPermissionErrorReason$1 collectLocationErrorsInteractor$onLocationPermissionErrorReason$1;
        Object obj;
        int i;
        if (continuationImpl instanceof CollectLocationErrorsInteractor$onLocationPermissionErrorReason$1) {
            collectLocationErrorsInteractor$onLocationPermissionErrorReason$1 = (CollectLocationErrorsInteractor$onLocationPermissionErrorReason$1) continuationImpl;
            int i2 = collectLocationErrorsInteractor$onLocationPermissionErrorReason$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                collectLocationErrorsInteractor$onLocationPermissionErrorReason$1.label = i2 - Integer.MIN_VALUE;
                obj = collectLocationErrorsInteractor$onLocationPermissionErrorReason$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = collectLocationErrorsInteractor$onLocationPermissionErrorReason$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    collectLocationErrorsInteractor$onLocationPermissionErrorReason$1.label = 1;
                    obj = this.d.a.b(collectLocationErrorsInteractor$onLocationPermissionErrorReason$1);
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
                if (((Boolean) obj).booleanValue()) {
                    boolean a = this.a.a();
                    if (this.b.c()) {
                        return nwz0.a;
                    }
                    if (a) {
                        return lwz0.a;
                    }
                }
                return mwz0.a;
            }
        }
        collectLocationErrorsInteractor$onLocationPermissionErrorReason$1 = new CollectLocationErrorsInteractor$onLocationPermissionErrorReason$1(this, continuationImpl);
        obj = collectLocationErrorsInteractor$onLocationPermissionErrorReason$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = collectLocationErrorsInteractor$onLocationPermissionErrorReason$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return mwz0.a;
    }
}
