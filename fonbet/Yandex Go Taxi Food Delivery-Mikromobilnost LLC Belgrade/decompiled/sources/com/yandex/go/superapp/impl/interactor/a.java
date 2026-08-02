package com.yandex.go.superapp.impl.interactor;

import defpackage.g8e;
import defpackage.jst;
import defpackage.lgn;
import defpackage.ny61;
import defpackage.szv0;
import defpackage.tpr;
import defpackage.uwq0;
import defpackage.xby;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.superapp.j;

/* loaded from: classes14.dex */
public final class a {
    public final j a;

    public a(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        EatsServiceRelativePathInteractor$resolveStrategy$1 eatsServiceRelativePathInteractor$resolveStrategy$1;
        int i;
        uwq0 a;
        if (continuationImpl instanceof EatsServiceRelativePathInteractor$resolveStrategy$1) {
            eatsServiceRelativePathInteractor$resolveStrategy$1 = (EatsServiceRelativePathInteractor$resolveStrategy$1) continuationImpl;
            int i2 = eatsServiceRelativePathInteractor$resolveStrategy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsServiceRelativePathInteractor$resolveStrategy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsServiceRelativePathInteractor$resolveStrategy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsServiceRelativePathInteractor$resolveStrategy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr b = this.a.b();
                    eatsServiceRelativePathInteractor$resolveStrategy$1.L$0 = str;
                    eatsServiceRelativePathInteractor$resolveStrategy$1.label = 1;
                    obj = e.y(b, eatsServiceRelativePathInteractor$resolveStrategy$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) eatsServiceRelativePathInteractor$resolveStrategy$1.L$0;
                    kotlin.b.b(obj);
                }
                a = ((szv0) obj).a(str);
                if (a != null) {
                    jst.e.q("Missing service params for " + str);
                    return lgn.c;
                }
                boolean z = a.E;
                boolean z2 = a.D;
                if (z2 && z) {
                    xby.l(jst.e, g8e.o("SERVICE_PARAMS_INCONSISTENCY_", a.h), null, null, "Both `openRelativePathOnlyWithSignals` and `openRelativePathDirectly` are true - it could lead to undefined behavior", 6);
                    z2 = false;
                }
                return new lgn(z2, !z);
            }
        }
        eatsServiceRelativePathInteractor$resolveStrategy$1 = new EatsServiceRelativePathInteractor$resolveStrategy$1(this, continuationImpl);
        Object obj2 = eatsServiceRelativePathInteractor$resolveStrategy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsServiceRelativePathInteractor$resolveStrategy$1.label;
        if (i != 0) {
        }
        a = ((szv0) obj2).a(str);
        if (a != null) {
        }
    }
}
