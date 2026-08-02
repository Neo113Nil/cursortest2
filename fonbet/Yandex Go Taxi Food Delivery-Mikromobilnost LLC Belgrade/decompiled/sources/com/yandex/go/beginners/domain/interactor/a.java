package com.yandex.go.beginners.domain.interactor;

import com.yandex.go.beginners.domain.model.BeginnersOnboardingModel$ServiceInfo$IconType;
import com.yandex.go.beginners.experiments.BeginnersOnboardingExperiment;
import defpackage.al5;
import defpackage.bl5;
import defpackage.d6z;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.sk5;
import defpackage.tcc;
import defpackage.yvf0;
import defpackage.zk5;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes12.dex */
public final class a {
    public final yvf0 a;
    public final rqo b;

    public a(yvf0 yvf0Var, rqo rqoVar) {
        this.a = yvf0Var;
        this.b = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BeginnersOnboardingInteractor$getOnboardingModel$1 beginnersOnboardingInteractor$getOnboardingModel$1;
        int i;
        BeginnersOnboardingExperiment beginnersOnboardingExperiment;
        if (continuationImpl instanceof BeginnersOnboardingInteractor$getOnboardingModel$1) {
            beginnersOnboardingInteractor$getOnboardingModel$1 = (BeginnersOnboardingInteractor$getOnboardingModel$1) continuationImpl;
            int i2 = beginnersOnboardingInteractor$getOnboardingModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                beginnersOnboardingInteractor$getOnboardingModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = beginnersOnboardingInteractor$getOnboardingModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beginnersOnboardingInteractor$getOnboardingModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    BeginnersOnboardingExperiment.Companion.getClass();
                    q d = ((jbh) this.b).d(BeginnersOnboardingExperiment.l);
                    beginnersOnboardingInteractor$getOnboardingModel$1.label = 1;
                    obj = d.b(beginnersOnboardingInteractor$getOnboardingModel$1);
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
                beginnersOnboardingExperiment = (BeginnersOnboardingExperiment) obj;
                if (beginnersOnboardingExperiment.c) {
                    return null;
                }
                ((sk5) this.a.get()).getClass();
                boolean z = beginnersOnboardingExperiment.d;
                String str = beginnersOnboardingExperiment.e;
                String Y = d6z.Y(beginnersOnboardingExperiment, beginnersOnboardingExperiment.f);
                String Y2 = d6z.Y(beginnersOnboardingExperiment, beginnersOnboardingExperiment.g);
                List<BeginnersOnboardingExperiment.ServiceInfo> list = beginnersOnboardingExperiment.h;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (BeginnersOnboardingExperiment.ServiceInfo serviceInfo : list) {
                    zk5 zk5Var = BeginnersOnboardingModel$ServiceInfo$IconType.Companion;
                    String str2 = serviceInfo.a;
                    zk5Var.getClass();
                    arrayList.add(new al5(zk5.a(str2), d6z.Y(beginnersOnboardingExperiment, serviceInfo.b), d6z.Y(beginnersOnboardingExperiment, serviceInfo.c), d6z.Y(beginnersOnboardingExperiment, serviceInfo.d)));
                }
                BeginnersOnboardingExperiment.ServiceInfo serviceInfo2 = beginnersOnboardingExperiment.i;
                zk5 zk5Var2 = BeginnersOnboardingModel$ServiceInfo$IconType.Companion;
                String str3 = serviceInfo2.a;
                zk5Var2.getClass();
                return new bl5(z, str, Y, Y2, arrayList, new al5(zk5.a(str3), d6z.Y(beginnersOnboardingExperiment, serviceInfo2.b), d6z.Y(beginnersOnboardingExperiment, serviceInfo2.c), d6z.Y(beginnersOnboardingExperiment, serviceInfo2.d)), beginnersOnboardingExperiment.j);
            }
        }
        beginnersOnboardingInteractor$getOnboardingModel$1 = new BeginnersOnboardingInteractor$getOnboardingModel$1(this, continuationImpl);
        Object obj2 = beginnersOnboardingInteractor$getOnboardingModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beginnersOnboardingInteractor$getOnboardingModel$1.label;
        if (i != 0) {
        }
        beginnersOnboardingExperiment = (BeginnersOnboardingExperiment) obj2;
        if (beginnersOnboardingExperiment.c) {
        }
    }
}
