package com.yandex.go.mainscreen.superapp.impl.header.domain;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppMainScreenLogoImageExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tt2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final t1b0 a;

    public c(tt2 tt2Var, rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(SuperAppMainScreenLogoImageExperiment.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        HeaderLogoInteractor$isLogoShort$1 headerLogoInteractor$isLogoShort$1;
        int i;
        if (continuationImpl instanceof HeaderLogoInteractor$isLogoShort$1) {
            headerLogoInteractor$isLogoShort$1 = (HeaderLogoInteractor$isLogoShort$1) continuationImpl;
            int i2 = headerLogoInteractor$isLogoShort$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerLogoInteractor$isLogoShort$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerLogoInteractor$isLogoShort$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerLogoInteractor$isLogoShort$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    headerLogoInteractor$isLogoShort$1.label = 1;
                    obj = this.a.b(headerLogoInteractor$isLogoShort$1);
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
                SuperAppMainScreenLogoImageExperiment superAppMainScreenLogoImageExperiment = (SuperAppMainScreenLogoImageExperiment) obj;
                return Boolean.valueOf(!superAppMainScreenLogoImageExperiment.e && superAppMainScreenLogoImageExperiment.f);
            }
        }
        headerLogoInteractor$isLogoShort$1 = new HeaderLogoInteractor$isLogoShort$1(this, continuationImpl);
        Object obj2 = headerLogoInteractor$isLogoShort$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerLogoInteractor$isLogoShort$1.label;
        if (i != 0) {
        }
        SuperAppMainScreenLogoImageExperiment superAppMainScreenLogoImageExperiment2 = (SuperAppMainScreenLogoImageExperiment) obj2;
        return Boolean.valueOf(!superAppMainScreenLogoImageExperiment2.e && superAppMainScreenLogoImageExperiment2.f);
    }
}
