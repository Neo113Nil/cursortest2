package com.yandex.go.payments.shared.antifraud.ui;

import defpackage.gue;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.yfa;
import defpackage.zn1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class a {
    public final yfa a;
    public final h b;
    public final i3y c;

    public a(on2 on2Var, yfa yfaVar, h hVar) {
        this.a = yfaVar;
        this.b = hVar;
        this.c = kotlin.a.a(new zn1(on2Var, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gue gueVar, ContinuationImpl continuationImpl) {
        CorpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1 corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1;
        int i;
        if (continuationImpl instanceof CorpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1) {
            corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1 = (CorpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1) continuationImpl;
            int i2 = corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.label;
                if (i != 0) {
                    b.b(obj);
                    corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.L$0 = gueVar;
                    corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.label = 1;
                    obj = kotlinx.coroutines.a.w(gueVar.e.a, new CorpAntiFraudKeepShowingInteractor$isUserHasBadRole$2(this, gueVar, null), corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gueVar = (gue) corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.L$0;
                    b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                return bool == null ? bool : Boolean.valueOf(gueVar.e.b);
            }
        }
        corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1 = new CorpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1(this, continuationImpl);
        Object obj2 = corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpAntiFraudKeepShowingInteractor$needToKeepShowingAntiFraudScreen$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null) {
        }
    }
}
